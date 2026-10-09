package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLAccelerationStructurePassDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlaccelerationstructurepassdescriptor">Apple documentation</a>
 */
public class MTLAccelerationStructurePassDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLAccelerationStructurePassDescriptor");
    private static final long SEL_CLASS_accelerationStructurePassDescriptor = ObjC.selector("accelerationStructurePassDescriptor");
    private static final MethodHandle MH_CLASS_accelerationStructurePassDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sampleBufferAttachments = ObjC.selector("sampleBufferAttachments");
    private static final MethodHandle MH_sampleBufferAttachments = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLAccelerationStructurePassDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLAccelerationStructurePassDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLAccelerationStructurePassDescriptor alloc() {
        try {
            return new MTLAccelerationStructurePassDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructurePassDescriptor init]} */
    public MTLAccelerationStructurePassDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[MTLAccelerationStructurePassDescriptor accelerationStructurePassDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static MTLAccelerationStructurePassDescriptor accelerationStructurePassDescriptor() {
        try {
            long result = (long) MH_CLASS_accelerationStructurePassDescriptor.invokeExact(CLS, SEL_CLASS_accelerationStructurePassDescriptor);
            return new MTLAccelerationStructurePassDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLAccelerationStructurePassDescriptor sampleBufferAttachments]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLAccelerationStructurePassSampleBufferAttachmentDescriptorArray sampleBufferAttachments() {
        try {
            long result = (long) MH_sampleBufferAttachments.invokeExact(this.handle, SEL_sampleBufferAttachments);
            return new MTLAccelerationStructurePassSampleBufferAttachmentDescriptorArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
