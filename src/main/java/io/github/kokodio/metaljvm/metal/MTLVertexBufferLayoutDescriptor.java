package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLVertexBufferLayoutDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlvertexbufferlayoutdescriptor">Apple documentation</a>
 */
public class MTLVertexBufferLayoutDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLVertexBufferLayoutDescriptor");
    private static final long SEL_stride = ObjC.selector("stride");
    private static final MethodHandle MH_stride = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStride_ = ObjC.selector("setStride:");
    private static final MethodHandle MH_setStride_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stepFunction = ObjC.selector("stepFunction");
    private static final MethodHandle MH_stepFunction = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStepFunction_ = ObjC.selector("setStepFunction:");
    private static final MethodHandle MH_setStepFunction_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stepRate = ObjC.selector("stepRate");
    private static final MethodHandle MH_stepRate = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStepRate_ = ObjC.selector("setStepRate:");
    private static final MethodHandle MH_setStepRate_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLVertexBufferLayoutDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLVertexBufferLayoutDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLVertexBufferLayoutDescriptor alloc() {
        try {
            return new MTLVertexBufferLayoutDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLVertexBufferLayoutDescriptor init]} */
    public MTLVertexBufferLayoutDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLVertexBufferLayoutDescriptor stride]} */
    public long stride() {
        try {
            return (long) MH_stride.invokeExact(this.handle, SEL_stride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLVertexBufferLayoutDescriptor setStride:]} */
    public void setStride(final long stride) {
        try {
            MH_setStride_.invokeExact(this.handle, SEL_setStride_, stride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLVertexBufferLayoutDescriptor stepFunction]} */
    public MTLVertexStepFunction stepFunction() {
        try {
            return MTLVertexStepFunction.of((long) MH_stepFunction.invokeExact(this.handle, SEL_stepFunction));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLVertexBufferLayoutDescriptor setStepFunction:]} */
    public void setStepFunction(final MTLVertexStepFunction stepFunction) {
        try {
            MH_setStepFunction_.invokeExact(this.handle, SEL_setStepFunction_, stepFunction.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLVertexBufferLayoutDescriptor stepRate]} */
    public long stepRate() {
        try {
            return (long) MH_stepRate.invokeExact(this.handle, SEL_stepRate);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLVertexBufferLayoutDescriptor setStepRate:]} */
    public void setStepRate(final long stepRate) {
        try {
            MH_setStepRate_.invokeExact(this.handle, SEL_setStepRate_, stepRate);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
