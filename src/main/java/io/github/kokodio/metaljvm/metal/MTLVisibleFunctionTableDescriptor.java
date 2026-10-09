package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLVisibleFunctionTableDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlvisiblefunctiontabledescriptor">Apple documentation</a>
 */
public class MTLVisibleFunctionTableDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLVisibleFunctionTableDescriptor");
    private static final long SEL_CLASS_visibleFunctionTableDescriptor = ObjC.selector("visibleFunctionTableDescriptor");
    private static final MethodHandle MH_CLASS_visibleFunctionTableDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_functionCount = ObjC.selector("functionCount");
    private static final MethodHandle MH_functionCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFunctionCount_ = ObjC.selector("setFunctionCount:");
    private static final MethodHandle MH_setFunctionCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLVisibleFunctionTableDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLVisibleFunctionTableDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLVisibleFunctionTableDescriptor alloc() {
        try {
            return new MTLVisibleFunctionTableDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLVisibleFunctionTableDescriptor init]} */
    public MTLVisibleFunctionTableDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[MTLVisibleFunctionTableDescriptor visibleFunctionTableDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static MTLVisibleFunctionTableDescriptor visibleFunctionTableDescriptor() {
        try {
            long result = (long) MH_CLASS_visibleFunctionTableDescriptor.invokeExact(CLS, SEL_CLASS_visibleFunctionTableDescriptor);
            return new MTLVisibleFunctionTableDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLVisibleFunctionTableDescriptor functionCount]} */
    public long functionCount() {
        try {
            return (long) MH_functionCount.invokeExact(this.handle, SEL_functionCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLVisibleFunctionTableDescriptor setFunctionCount:]} */
    public void setFunctionCount(final long functionCount) {
        try {
            MH_setFunctionCount_.invokeExact(this.handle, SEL_setFunctionCount_, functionCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
