package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLComputePassDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcomputepassdescriptor">Apple documentation</a>
 */
public class MTLComputePassDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLComputePassDescriptor");
    private static final long SEL_CLASS_computePassDescriptor = ObjC.selector("computePassDescriptor");
    private static final MethodHandle MH_CLASS_computePassDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dispatchType = ObjC.selector("dispatchType");
    private static final MethodHandle MH_dispatchType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDispatchType_ = ObjC.selector("setDispatchType:");
    private static final MethodHandle MH_setDispatchType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sampleBufferAttachments = ObjC.selector("sampleBufferAttachments");
    private static final MethodHandle MH_sampleBufferAttachments = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLComputePassDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLComputePassDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLComputePassDescriptor alloc() {
        try {
            return new MTLComputePassDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePassDescriptor init]} */
    public MTLComputePassDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[MTLComputePassDescriptor computePassDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static MTLComputePassDescriptor computePassDescriptor() {
        try {
            long result = (long) MH_CLASS_computePassDescriptor.invokeExact(CLS, SEL_CLASS_computePassDescriptor);
            return new MTLComputePassDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePassDescriptor dispatchType]} */
    public MTLDispatchType dispatchType() {
        try {
            return MTLDispatchType.of((long) MH_dispatchType.invokeExact(this.handle, SEL_dispatchType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePassDescriptor setDispatchType:]} */
    public void setDispatchType(final MTLDispatchType dispatchType) {
        try {
            MH_setDispatchType_.invokeExact(this.handle, SEL_setDispatchType_, dispatchType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLComputePassDescriptor sampleBufferAttachments]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLComputePassSampleBufferAttachmentDescriptorArray sampleBufferAttachments() {
        try {
            long result = (long) MH_sampleBufferAttachments.invokeExact(this.handle, SEL_sampleBufferAttachments);
            return new MTLComputePassSampleBufferAttachmentDescriptorArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
