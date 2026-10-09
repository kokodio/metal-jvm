package io.github.kokodio.metaljvm.objc;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * Access to the Objective-C runtime: frameworks, classes, selectors and {@code objc_msgSend}.
 * Objects, classes and selectors are passed around as raw {@code long} addresses.
 */
public final class ObjC {
    public static final Linker LINKER = Linker.nativeLinker();

    private static final Map<String, SymbolLookup> FRAMEWORKS = new ConcurrentHashMap<>();
    private static final Map<String, Long> SELECTORS = new ConcurrentHashMap<>();

    private static final SymbolLookup RUNTIME = SymbolLookup.libraryLookup("/usr/lib/libobjc.A.dylib", Arena.global());
    private static final MemorySegment MSG_SEND = RUNTIME.findOrThrow("objc_msgSend");
    private static final MethodHandle OBJC_GET_CLASS =
            LINKER.downcallHandle(RUNTIME.findOrThrow("objc_getClass"), FunctionDescriptor.of(JAVA_LONG, ADDRESS));
    private static final MethodHandle SEL_REGISTER_NAME =
            LINKER.downcallHandle(RUNTIME.findOrThrow("sel_registerName"), FunctionDescriptor.of(JAVA_LONG, ADDRESS));
    private static final MethodHandle POOL_PUSH =
            LINKER.downcallHandle(RUNTIME.findOrThrow("objc_autoreleasePoolPush"), FunctionDescriptor.of(JAVA_LONG));
    private static final MethodHandle POOL_POP =
            LINKER.downcallHandle(RUNTIME.findOrThrow("objc_autoreleasePoolPop"), FunctionDescriptor.ofVoid(JAVA_LONG));

    private static final int MAX_STACK_STRING_LENGTH = 1024;

    private static final long NSSTRING = clazz("NSString");
    private static final long SEL_ALLOC = selector("alloc");
    private static final long SEL_INIT_WITH_UTF8 = selector("initWithUTF8String:");
    private static final long SEL_UTF8_STRING = selector("UTF8String");
    private static final long SEL_RELEASE = selector("release");
    private static final MethodHandle MSG_VOID = msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MSG_GET_PTR = msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MSG_PTR_ARG = msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));

    private ObjC() {
    }

    /**
     * Loads a system framework on first use and returns the lookup for its C functions and constants.
     * A framework has to be loaded before its classes can be found with {@link #clazz}.
     */
    public static SymbolLookup framework(String name) {
        return FRAMEWORKS.computeIfAbsent(name, key ->
                SymbolLookup.libraryLookup("/System/Library/Frameworks/" + key + ".framework/" + key, Arena.global()));
    }

    /** The value of a global constant such as {@code kCGColorSpaceSRGB}, or 0 when this macOS does not have it. */
    public static long loadSymbol(SymbolLookup lookup, String name) {
        return lookup.find(name).map(symbol -> symbol.reinterpret(JAVA_LONG.byteSize()).get(JAVA_LONG, 0)).orElse(0L);
    }

    public static long clazz(String name) {
        try (NativeStack stack = NativeStack.push()) {
            long cls = (long) OBJC_GET_CLASS.invokeExact(stack.allocateFrom(name));
            if (cls == 0L) {
                throw new IllegalStateException("Objective-C class not found: " + name + " (framework not loaded?)");
            }
            return cls;
        } catch (RuntimeException exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError("objc_getClass failed for " + name, throwable);
        }
    }

    public static long selector(String name) {
        return SELECTORS.computeIfAbsent(name, key -> {
            try (NativeStack stack = NativeStack.push()) {
                return (long) SEL_REGISTER_NAME.invokeExact(stack.allocateFrom(key));
            } catch (Throwable throwable) {
                throw new AssertionError("sel_registerName failed for " + key, throwable);
            }
        });
    }

    /** {@code objc_msgSend} with the given signature; use for calls that may block or call back into Java. */
    public static MethodHandle msgSend(FunctionDescriptor descriptor) {
        return LINKER.downcallHandle(MSG_SEND, descriptor);
    }

    /** {@code objc_msgSend} as a critical downcall: fastest, but the call must be short and must not re-enter Java. */
    public static MethodHandle msgSendCritical(FunctionDescriptor descriptor) {
        return LINKER.downcallHandle(MSG_SEND, descriptor, Linker.Option.critical(false));
    }

    public static void release(long object) {
        try {
            MSG_VOID.invokeExact(object, SEL_RELEASE);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** Returns a retained (+1) NSString, release it when done. */
    public static long nsString(String value) {
        if (value.length() > MAX_STACK_STRING_LENGTH) {
            try (Arena arena = Arena.ofConfined()) {
                return nsString(arena.allocateFrom(value));
            }
        }
        try (NativeStack stack = NativeStack.push()) {
            return nsString(stack.allocateFrom(value));
        }
    }

    private static long nsString(MemorySegment utf8) {
        try {
            long alloc = (long) MSG_GET_PTR.invokeExact(NSSTRING, SEL_ALLOC);
            return (long) MSG_PTR_ARG.invokeExact(alloc, SEL_INIT_WITH_UTF8, utf8.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    public static String javaString(long nsString) {
        try {
            long utf8 = (long) MSG_GET_PTR.invokeExact(nsString, SEL_UTF8_STRING);
            return isNil(utf8) ? "" : MemorySegment.ofAddress(utf8).reinterpret(Long.MAX_VALUE).getString(0);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    public static boolean isNil(long object) {
        return object == 0L;
    }

    public static boolean isNil(MemorySegment segment) {
        return segment == null || segment.address() == 0L;
    }

    public static ByteBuffer byteBufferView(MemorySegment pointer, long byteSize) {
        if (isNil(pointer)) {
            throw new IllegalArgumentException("Cannot create a ByteBuffer view for a null native pointer");
        }
        if (byteSize < 0L) {
            throw new IllegalArgumentException("Byte size must be non-negative");
        }
        return MemorySegment.ofAddress(pointer.address()).reinterpret(byteSize).asByteBuffer();
    }

    public static long autoreleasePoolPush() {
        try {
            return (long) POOL_PUSH.invokeExact();
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    public static void autoreleasePoolPop(long pool) {
        try {
            POOL_POP.invokeExact(pool);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
