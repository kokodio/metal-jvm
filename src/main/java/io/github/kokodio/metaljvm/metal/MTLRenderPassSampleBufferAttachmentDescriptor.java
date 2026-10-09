package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLRenderPassSampleBufferAttachmentDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlrenderpasssamplebufferattachmentdescriptor">Apple documentation</a>
 */
public class MTLRenderPassSampleBufferAttachmentDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLRenderPassSampleBufferAttachmentDescriptor");
    private static final long SEL_sampleBuffer = ObjC.selector("sampleBuffer");
    private static final MethodHandle MH_sampleBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSampleBuffer_ = ObjC.selector("setSampleBuffer:");
    private static final MethodHandle MH_setSampleBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_startOfVertexSampleIndex = ObjC.selector("startOfVertexSampleIndex");
    private static final MethodHandle MH_startOfVertexSampleIndex = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStartOfVertexSampleIndex_ = ObjC.selector("setStartOfVertexSampleIndex:");
    private static final MethodHandle MH_setStartOfVertexSampleIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_endOfVertexSampleIndex = ObjC.selector("endOfVertexSampleIndex");
    private static final MethodHandle MH_endOfVertexSampleIndex = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setEndOfVertexSampleIndex_ = ObjC.selector("setEndOfVertexSampleIndex:");
    private static final MethodHandle MH_setEndOfVertexSampleIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_startOfFragmentSampleIndex = ObjC.selector("startOfFragmentSampleIndex");
    private static final MethodHandle MH_startOfFragmentSampleIndex = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStartOfFragmentSampleIndex_ = ObjC.selector("setStartOfFragmentSampleIndex:");
    private static final MethodHandle MH_setStartOfFragmentSampleIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_endOfFragmentSampleIndex = ObjC.selector("endOfFragmentSampleIndex");
    private static final MethodHandle MH_endOfFragmentSampleIndex = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setEndOfFragmentSampleIndex_ = ObjC.selector("setEndOfFragmentSampleIndex:");
    private static final MethodHandle MH_setEndOfFragmentSampleIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLRenderPassSampleBufferAttachmentDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLRenderPassSampleBufferAttachmentDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLRenderPassSampleBufferAttachmentDescriptor alloc() {
        try {
            return new MTLRenderPassSampleBufferAttachmentDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassSampleBufferAttachmentDescriptor init]} */
    public MTLRenderPassSampleBufferAttachmentDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPassSampleBufferAttachmentDescriptor sampleBuffer]}
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

    /** {@code -[MTLRenderPassSampleBufferAttachmentDescriptor setSampleBuffer:]} */
    public void setSampleBuffer(@Nullable final MTLCounterSampleBuffer sampleBuffer) {
        try {
            MH_setSampleBuffer_.invokeExact(this.handle, SEL_setSampleBuffer_, sampleBuffer == null ? 0L : sampleBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassSampleBufferAttachmentDescriptor startOfVertexSampleIndex]} */
    public long startOfVertexSampleIndex() {
        try {
            return (long) MH_startOfVertexSampleIndex.invokeExact(this.handle, SEL_startOfVertexSampleIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassSampleBufferAttachmentDescriptor setStartOfVertexSampleIndex:]} */
    public void setStartOfVertexSampleIndex(final long startOfVertexSampleIndex) {
        try {
            MH_setStartOfVertexSampleIndex_.invokeExact(this.handle, SEL_setStartOfVertexSampleIndex_, startOfVertexSampleIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassSampleBufferAttachmentDescriptor endOfVertexSampleIndex]} */
    public long endOfVertexSampleIndex() {
        try {
            return (long) MH_endOfVertexSampleIndex.invokeExact(this.handle, SEL_endOfVertexSampleIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassSampleBufferAttachmentDescriptor setEndOfVertexSampleIndex:]} */
    public void setEndOfVertexSampleIndex(final long endOfVertexSampleIndex) {
        try {
            MH_setEndOfVertexSampleIndex_.invokeExact(this.handle, SEL_setEndOfVertexSampleIndex_, endOfVertexSampleIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassSampleBufferAttachmentDescriptor startOfFragmentSampleIndex]} */
    public long startOfFragmentSampleIndex() {
        try {
            return (long) MH_startOfFragmentSampleIndex.invokeExact(this.handle, SEL_startOfFragmentSampleIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassSampleBufferAttachmentDescriptor setStartOfFragmentSampleIndex:]} */
    public void setStartOfFragmentSampleIndex(final long startOfFragmentSampleIndex) {
        try {
            MH_setStartOfFragmentSampleIndex_.invokeExact(this.handle, SEL_setStartOfFragmentSampleIndex_, startOfFragmentSampleIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassSampleBufferAttachmentDescriptor endOfFragmentSampleIndex]} */
    public long endOfFragmentSampleIndex() {
        try {
            return (long) MH_endOfFragmentSampleIndex.invokeExact(this.handle, SEL_endOfFragmentSampleIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassSampleBufferAttachmentDescriptor setEndOfFragmentSampleIndex:]} */
    public void setEndOfFragmentSampleIndex(final long endOfFragmentSampleIndex) {
        try {
            MH_setEndOfFragmentSampleIndex_.invokeExact(this.handle, SEL_setEndOfFragmentSampleIndex_, endOfFragmentSampleIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
