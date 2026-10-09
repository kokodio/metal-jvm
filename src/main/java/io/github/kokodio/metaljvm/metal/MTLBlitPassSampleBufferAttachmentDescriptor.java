package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLBlitPassSampleBufferAttachmentDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlblitpasssamplebufferattachmentdescriptor">Apple documentation</a>
 */
public class MTLBlitPassSampleBufferAttachmentDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLBlitPassSampleBufferAttachmentDescriptor");
    private static final long SEL_sampleBuffer = ObjC.selector("sampleBuffer");
    private static final MethodHandle MH_sampleBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSampleBuffer_ = ObjC.selector("setSampleBuffer:");
    private static final MethodHandle MH_setSampleBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_startOfEncoderSampleIndex = ObjC.selector("startOfEncoderSampleIndex");
    private static final MethodHandle MH_startOfEncoderSampleIndex = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStartOfEncoderSampleIndex_ = ObjC.selector("setStartOfEncoderSampleIndex:");
    private static final MethodHandle MH_setStartOfEncoderSampleIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_endOfEncoderSampleIndex = ObjC.selector("endOfEncoderSampleIndex");
    private static final MethodHandle MH_endOfEncoderSampleIndex = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setEndOfEncoderSampleIndex_ = ObjC.selector("setEndOfEncoderSampleIndex:");
    private static final MethodHandle MH_setEndOfEncoderSampleIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLBlitPassSampleBufferAttachmentDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLBlitPassSampleBufferAttachmentDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLBlitPassSampleBufferAttachmentDescriptor alloc() {
        try {
            return new MTLBlitPassSampleBufferAttachmentDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitPassSampleBufferAttachmentDescriptor init]} */
    public MTLBlitPassSampleBufferAttachmentDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLBlitPassSampleBufferAttachmentDescriptor sampleBuffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLCounterSampleBuffer sampleBuffer() {
        try {
            long result = (long) MH_sampleBuffer.invokeExact(this.handle, SEL_sampleBuffer);
            return result == 0L ? null : new MTLCounterSampleBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitPassSampleBufferAttachmentDescriptor setSampleBuffer:]} */
    public void setSampleBuffer(@Nullable final MTLCounterSampleBuffer sampleBuffer) {
        try {
            MH_setSampleBuffer_.invokeExact(this.handle, SEL_setSampleBuffer_, sampleBuffer == null ? 0L : sampleBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitPassSampleBufferAttachmentDescriptor startOfEncoderSampleIndex]} */
    public long startOfEncoderSampleIndex() {
        try {
            return (long) MH_startOfEncoderSampleIndex.invokeExact(this.handle, SEL_startOfEncoderSampleIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitPassSampleBufferAttachmentDescriptor setStartOfEncoderSampleIndex:]} */
    public void setStartOfEncoderSampleIndex(final long startOfEncoderSampleIndex) {
        try {
            MH_setStartOfEncoderSampleIndex_.invokeExact(this.handle, SEL_setStartOfEncoderSampleIndex_, startOfEncoderSampleIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitPassSampleBufferAttachmentDescriptor endOfEncoderSampleIndex]} */
    public long endOfEncoderSampleIndex() {
        try {
            return (long) MH_endOfEncoderSampleIndex.invokeExact(this.handle, SEL_endOfEncoderSampleIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitPassSampleBufferAttachmentDescriptor setEndOfEncoderSampleIndex:]} */
    public void setEndOfEncoderSampleIndex(final long endOfEncoderSampleIndex) {
        try {
            MH_setEndOfEncoderSampleIndex_.invokeExact(this.handle, SEL_setEndOfEncoderSampleIndex_, endOfEncoderSampleIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
