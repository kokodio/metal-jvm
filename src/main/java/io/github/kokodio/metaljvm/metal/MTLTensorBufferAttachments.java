package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLTensorBufferAttachments}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltensorbufferattachments">Apple documentation</a>
 */
public class MTLTensorBufferAttachments extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLTensorBufferAttachments");
    private static final long SEL_setBuffer_offset_forPlane_ = ObjC.selector("setBuffer:offset:forPlane:");
    private static final MethodHandle MH_setBuffer_offset_forPlane_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bufferForPlane_ = ObjC.selector("bufferForPlane:");
    private static final MethodHandle MH_bufferForPlane_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_offsetForPlane_ = ObjC.selector("offsetForPlane:");
    private static final MethodHandle MH_offsetForPlane_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_reset = ObjC.selector("reset");
    private static final MethodHandle MH_reset = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLTensorBufferAttachments(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLTensorBufferAttachments alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLTensorBufferAttachments alloc() {
        try {
            return new MTLTensorBufferAttachments((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorBufferAttachments init]} */
    public MTLTensorBufferAttachments init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorBufferAttachments setBuffer:offset:forPlane:]} */
    public void setBuffer(final MTLBuffer buffer, final long offset, final MTLTensorPlaneType plane) {
        try {
            MH_setBuffer_offset_forPlane_.invokeExact(this.handle, SEL_setBuffer_offset_forPlane_, buffer.handle(), offset, plane.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTensorBufferAttachments bufferForPlane:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLBuffer bufferForPlane(final MTLTensorPlaneType plane) {
        try {
            long result = (long) MH_bufferForPlane_.invokeExact(this.handle, SEL_bufferForPlane_, plane.value);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorBufferAttachments offsetForPlane:]} */
    public long offsetForPlane(final MTLTensorPlaneType plane) {
        try {
            return (long) MH_offsetForPlane_.invokeExact(this.handle, SEL_offsetForPlane_, plane.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorBufferAttachments reset]} */
    public void reset() {
        try {
            MH_reset.invokeExact(this.handle, SEL_reset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
