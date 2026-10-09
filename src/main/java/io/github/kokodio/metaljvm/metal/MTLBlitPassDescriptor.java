package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLBlitPassDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlblitpassdescriptor">Apple documentation</a>
 */
public class MTLBlitPassDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLBlitPassDescriptor");
    private static final long SEL_CLASS_blitPassDescriptor = ObjC.selector("blitPassDescriptor");
    private static final MethodHandle MH_CLASS_blitPassDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sampleBufferAttachments = ObjC.selector("sampleBufferAttachments");
    private static final MethodHandle MH_sampleBufferAttachments = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLBlitPassDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLBlitPassDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLBlitPassDescriptor alloc() {
        try {
            return new MTLBlitPassDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitPassDescriptor init]} */
    public MTLBlitPassDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[MTLBlitPassDescriptor blitPassDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static MTLBlitPassDescriptor blitPassDescriptor() {
        try {
            long result = (long) MH_CLASS_blitPassDescriptor.invokeExact(CLS, SEL_CLASS_blitPassDescriptor);
            return new MTLBlitPassDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLBlitPassDescriptor sampleBufferAttachments]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLBlitPassSampleBufferAttachmentDescriptorArray sampleBufferAttachments() {
        try {
            long result = (long) MH_sampleBufferAttachments.invokeExact(this.handle, SEL_sampleBufferAttachments);
            return new MTLBlitPassSampleBufferAttachmentDescriptorArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
