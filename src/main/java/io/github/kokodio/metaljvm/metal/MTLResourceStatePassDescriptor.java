package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLResourceStatePassDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlresourcestatepassdescriptor">Apple documentation</a>
 */
public class MTLResourceStatePassDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLResourceStatePassDescriptor");
    private static final long SEL_CLASS_resourceStatePassDescriptor = ObjC.selector("resourceStatePassDescriptor");
    private static final MethodHandle MH_CLASS_resourceStatePassDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sampleBufferAttachments = ObjC.selector("sampleBufferAttachments");
    private static final MethodHandle MH_sampleBufferAttachments = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLResourceStatePassDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLResourceStatePassDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLResourceStatePassDescriptor alloc() {
        try {
            return new MTLResourceStatePassDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResourceStatePassDescriptor init]} */
    public MTLResourceStatePassDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[MTLResourceStatePassDescriptor resourceStatePassDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static MTLResourceStatePassDescriptor resourceStatePassDescriptor() {
        try {
            long result = (long) MH_CLASS_resourceStatePassDescriptor.invokeExact(CLS, SEL_CLASS_resourceStatePassDescriptor);
            return new MTLResourceStatePassDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLResourceStatePassDescriptor sampleBufferAttachments]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLResourceStatePassSampleBufferAttachmentDescriptorArray sampleBufferAttachments() {
        try {
            long result = (long) MH_sampleBufferAttachments.invokeExact(this.handle, SEL_sampleBufferAttachments);
            return new MTLResourceStatePassSampleBufferAttachmentDescriptorArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
