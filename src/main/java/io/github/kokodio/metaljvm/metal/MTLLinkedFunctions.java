package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSDictionary;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.foundation.NSString;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLLinkedFunctions}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtllinkedfunctions">Apple documentation</a>
 */
public class MTLLinkedFunctions extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLLinkedFunctions");
    private static final long SEL_CLASS_linkedFunctions = ObjC.selector("linkedFunctions");
    private static final MethodHandle MH_CLASS_linkedFunctions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_functions = ObjC.selector("functions");
    private static final MethodHandle MH_functions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFunctions_ = ObjC.selector("setFunctions:");
    private static final MethodHandle MH_setFunctions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_binaryFunctions = ObjC.selector("binaryFunctions");
    private static final MethodHandle MH_binaryFunctions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBinaryFunctions_ = ObjC.selector("setBinaryFunctions:");
    private static final MethodHandle MH_setBinaryFunctions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_groups = ObjC.selector("groups");
    private static final MethodHandle MH_groups = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setGroups_ = ObjC.selector("setGroups:");
    private static final MethodHandle MH_setGroups_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_privateFunctions = ObjC.selector("privateFunctions");
    private static final MethodHandle MH_privateFunctions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPrivateFunctions_ = ObjC.selector("setPrivateFunctions:");
    private static final MethodHandle MH_setPrivateFunctions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLLinkedFunctions(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLLinkedFunctions alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLLinkedFunctions alloc() {
        try {
            return new MTLLinkedFunctions((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLLinkedFunctions init]} */
    public MTLLinkedFunctions init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[MTLLinkedFunctions linkedFunctions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static MTLLinkedFunctions linkedFunctions() {
        try {
            long result = (long) MH_CLASS_linkedFunctions.invokeExact(CLS, SEL_CLASS_linkedFunctions);
            return new MTLLinkedFunctions(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLLinkedFunctions functions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTLFunction> functions() {
        try {
            long result = (long) MH_functions.invokeExact(this.handle, SEL_functions);
            return result == 0L ? null : new NSArray<>(result, MTLFunction::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLLinkedFunctions setFunctions:]} */
    public void setFunctions(@Nullable final NSArray<MTLFunction> functions) {
        try {
            MH_setFunctions_.invokeExact(this.handle, SEL_setFunctions_, functions == null ? 0L : functions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLLinkedFunctions binaryFunctions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTLFunction> binaryFunctions() {
        try {
            long result = (long) MH_binaryFunctions.invokeExact(this.handle, SEL_binaryFunctions);
            return result == 0L ? null : new NSArray<>(result, MTLFunction::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLLinkedFunctions setBinaryFunctions:]} */
    public void setBinaryFunctions(@Nullable final NSArray<MTLFunction> binaryFunctions) {
        try {
            MH_setBinaryFunctions_.invokeExact(this.handle, SEL_setBinaryFunctions_, binaryFunctions == null ? 0L : binaryFunctions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLLinkedFunctions groups]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSDictionary<NSString, NSArray<MTLFunction>> groups() {
        try {
            long result = (long) MH_groups.invokeExact(this.handle, SEL_groups);
            return result == 0L ? null : new NSDictionary<>(result, NSString::new, handle1 -> new NSArray<>(handle1, MTLFunction::new));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLLinkedFunctions setGroups:]} */
    public void setGroups(@Nullable final NSDictionary<NSString, NSArray<MTLFunction>> groups) {
        try {
            MH_setGroups_.invokeExact(this.handle, SEL_setGroups_, groups == null ? 0L : groups.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLLinkedFunctions privateFunctions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTLFunction> privateFunctions() {
        try {
            long result = (long) MH_privateFunctions.invokeExact(this.handle, SEL_privateFunctions);
            return result == 0L ? null : new NSArray<>(result, MTLFunction::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLLinkedFunctions setPrivateFunctions:]} */
    public void setPrivateFunctions(@Nullable final NSArray<MTLFunction> privateFunctions) {
        try {
            MH_setPrivateFunctions_.invokeExact(this.handle, SEL_setPrivateFunctions_, privateFunctions == null ? 0L : privateFunctions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
