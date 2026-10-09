package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4LibraryFunctionDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4libraryfunctiondescriptor">Apple documentation</a>
 */
public class MTL4LibraryFunctionDescriptor extends MTL4FunctionDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4LibraryFunctionDescriptor");
    private static final long SEL_name = ObjC.selector("name");
    private static final MethodHandle MH_name = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setName_ = ObjC.selector("setName:");
    private static final MethodHandle MH_setName_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_library = ObjC.selector("library");
    private static final MethodHandle MH_library = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLibrary_ = ObjC.selector("setLibrary:");
    private static final MethodHandle MH_setLibrary_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4LibraryFunctionDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4LibraryFunctionDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4LibraryFunctionDescriptor alloc() {
        try {
            return new MTL4LibraryFunctionDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4LibraryFunctionDescriptor init]} */
    public MTL4LibraryFunctionDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4LibraryFunctionDescriptor name]} */
    @Nullable
    public String name() {
        try {
            long result = (long) MH_name.invokeExact(this.handle, SEL_name);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4LibraryFunctionDescriptor setName:]} */
    public void setName(@Nullable final String name) {
        final long nsName = name == null ? 0L : ObjC.nsString(name);
        try {
            MH_setName_.invokeExact(this.handle, SEL_setName_, nsName);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
        }
    }

    /**
     * {@code -[MTL4LibraryFunctionDescriptor library]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLLibrary library() {
        try {
            long result = (long) MH_library.invokeExact(this.handle, SEL_library);
            return result == 0L ? null : new MTLLibrary(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4LibraryFunctionDescriptor setLibrary:]} */
    public void setLibrary(@Nullable final MTLLibrary library) {
        try {
            MH_setLibrary_.invokeExact(this.handle, SEL_setLibrary_, library == null ? 0L : library.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
