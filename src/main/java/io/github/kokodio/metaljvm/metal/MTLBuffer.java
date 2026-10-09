package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSErrorException;
import io.github.kokodio.metaljvm.foundation.NSRange;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLBuffer}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlbuffer">Apple documentation</a>
 */
public class MTLBuffer extends MTLResource {
    private static final long SEL_contents = ObjC.selector("contents");
    private static final MethodHandle MH_contents = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_didModifyRange_ = ObjC.selector("didModifyRange:");
    private static final MethodHandle MH_didModifyRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newTextureWithDescriptor_offset_bytesPerRow_ = ObjC.selector("newTextureWithDescriptor:offset:bytesPerRow:");
    private static final MethodHandle MH_newTextureWithDescriptor_offset_bytesPerRow_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newTensorWithDescriptor_offset_error_ = ObjC.selector("newTensorWithDescriptor:offset:error:");
    private static final MethodHandle MH_newTensorWithDescriptor_offset_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_addDebugMarker_range_ = ObjC.selector("addDebugMarker:range:");
    private static final MethodHandle MH_addDebugMarker_range_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeAllDebugMarkers = ObjC.selector("removeAllDebugMarkers");
    private static final MethodHandle MH_removeAllDebugMarkers = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRemoteBufferViewForDevice_ = ObjC.selector("newRemoteBufferViewForDevice:");
    private static final MethodHandle MH_newRemoteBufferViewForDevice_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_length = ObjC.selector("length");
    private static final MethodHandle MH_length = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_remoteStorageBuffer = ObjC.selector("remoteStorageBuffer");
    private static final MethodHandle MH_remoteStorageBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_gpuAddress = ObjC.selector("gpuAddress");
    private static final MethodHandle MH_gpuAddress = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sparseBufferTier = ObjC.selector("sparseBufferTier");
    private static final MethodHandle MH_sparseBufferTier = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLBuffer(final long handle) {
        super(handle);
    }

    /** {@code -[MTLBuffer contents]} */
    public MemorySegment contents() {
        try {
            return MemorySegment.ofAddress((long) MH_contents.invokeExact(this.handle, SEL_contents));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBuffer didModifyRange:]} */
    public void didModifyRange(final NSRange range) {
        try {
            MH_didModifyRange_.invokeExact(this.handle, SEL_didModifyRange_, range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLBuffer newTextureWithDescriptor:offset:bytesPerRow:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLTexture newTexture(final MTLTextureDescriptor descriptor, final long offset, final long bytesPerRow) {
        try {
            long result = (long) MH_newTextureWithDescriptor_offset_bytesPerRow_.invokeExact(this.handle, SEL_newTextureWithDescriptor_offset_bytesPerRow_, descriptor.handle(), offset, bytesPerRow);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLBuffer newTensorWithDescriptor:offset:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLTensor newTensor(final MTLTensorDescriptor descriptor, final long offset) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newTensorWithDescriptor_offset_error_.invokeExact(this.handle, SEL_newTensorWithDescriptor_offset_error_, descriptor.handle(), offset, errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newTensorWithDescriptor:offset:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLTensor(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBuffer addDebugMarker:range:]} */
    public void addDebugMarker(final String marker, final NSRange range) {
        final long nsMarker = ObjC.nsString(marker);
        try {
            MH_addDebugMarker_range_.invokeExact(this.handle, SEL_addDebugMarker_range_, nsMarker, range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsMarker);
        }
    }

    /** {@code -[MTLBuffer removeAllDebugMarkers]} */
    public void removeAllDebugMarkers() {
        try {
            MH_removeAllDebugMarkers.invokeExact(this.handle, SEL_removeAllDebugMarkers);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLBuffer newRemoteBufferViewForDevice:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLBuffer newRemoteBufferViewForDevice(final MTLDevice device) {
        try {
            long result = (long) MH_newRemoteBufferViewForDevice_.invokeExact(this.handle, SEL_newRemoteBufferViewForDevice_, device.handle());
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBuffer length]} */
    public long length() {
        try {
            return (long) MH_length.invokeExact(this.handle, SEL_length);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLBuffer remoteStorageBuffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLBuffer remoteStorageBuffer() {
        try {
            long result = (long) MH_remoteStorageBuffer.invokeExact(this.handle, SEL_remoteStorageBuffer);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBuffer gpuAddress]} */
    public long gpuAddress() {
        try {
            return (long) MH_gpuAddress.invokeExact(this.handle, SEL_gpuAddress);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBuffer sparseBufferTier]} */
    public MTLBufferSparseTier sparseBufferTier() {
        try {
            return MTLBufferSparseTier.of((long) MH_sparseBufferTier.invokeExact(this.handle, SEL_sparseBufferTier));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
