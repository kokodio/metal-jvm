package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLTensor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltensor">Apple documentation</a>
 */
public class MTLTensor extends MTLResource {
    private static final long SEL_replaceSliceOrigin_sliceDimensions_withBytes_strides_ = ObjC.selector("replaceSliceOrigin:sliceDimensions:withBytes:strides:");
    private static final MethodHandle MH_replaceSliceOrigin_sliceDimensions_withBytes_strides_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getBytes_strides_fromSliceOrigin_sliceDimensions_ = ObjC.selector("getBytes:strides:fromSliceOrigin:sliceDimensions:");
    private static final MethodHandle MH_getBytes_strides_fromSliceOrigin_sliceDimensions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getBytes_strides_fromSliceOrigin_sliceDimensions_plane_ = ObjC.selector("getBytes:strides:fromSliceOrigin:sliceDimensions:plane:");
    private static final MethodHandle MH_getBytes_strides_fromSliceOrigin_sliceDimensions_plane_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_replaceSliceOrigin_sliceDimensions_plane_withBytes_strides_ = ObjC.selector("replaceSliceOrigin:sliceDimensions:plane:withBytes:strides:");
    private static final MethodHandle MH_replaceSliceOrigin_sliceDimensions_plane_withBytes_strides_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_gpuResourceID = ObjC.selector("gpuResourceID");
    private static final MethodHandle MH_gpuResourceID = ObjC.msgSendCritical(FunctionDescriptor.of(MTLResourceID.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_buffer = ObjC.selector("buffer");
    private static final MethodHandle MH_buffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bufferOffset = ObjC.selector("bufferOffset");
    private static final MethodHandle MH_bufferOffset = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_strides = ObjC.selector("strides");
    private static final MethodHandle MH_strides = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dimensions = ObjC.selector("dimensions");
    private static final MethodHandle MH_dimensions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dataType = ObjC.selector("dataType");
    private static final MethodHandle MH_dataType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_usage = ObjC.selector("usage");
    private static final MethodHandle MH_usage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_auxiliaryPlanes = ObjC.selector("auxiliaryPlanes");
    private static final MethodHandle MH_auxiliaryPlanes = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLTensor(final long handle) {
        super(handle);
    }

    /** {@code -[MTLTensor replaceSliceOrigin:sliceDimensions:withBytes:strides:]} */
    public void replaceSliceOrigin(final MTLTensorExtents sliceOrigin, final MTLTensorExtents sliceDimensions, final MemorySegment bytes, final MTLTensorExtents strides) {
        try {
            MH_replaceSliceOrigin_sliceDimensions_withBytes_strides_.invokeExact(this.handle, SEL_replaceSliceOrigin_sliceDimensions_withBytes_strides_, sliceOrigin.handle(), sliceDimensions.handle(), bytes.address(), strides.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensor getBytes:strides:fromSliceOrigin:sliceDimensions:]} */
    public void getBytes(final MemorySegment bytes, final MTLTensorExtents strides, final MTLTensorExtents sliceOrigin, final MTLTensorExtents sliceDimensions) {
        try {
            MH_getBytes_strides_fromSliceOrigin_sliceDimensions_.invokeExact(this.handle, SEL_getBytes_strides_fromSliceOrigin_sliceDimensions_, bytes.address(), strides.handle(), sliceOrigin.handle(), sliceDimensions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensor getBytes:strides:fromSliceOrigin:sliceDimensions:plane:]} */
    public void getBytes(final MemorySegment bytes, final MTLTensorExtents strides, final MTLTensorExtents sliceOrigin, final MTLTensorExtents sliceDimensions, final MTLTensorPlaneType plane) {
        try {
            MH_getBytes_strides_fromSliceOrigin_sliceDimensions_plane_.invokeExact(this.handle, SEL_getBytes_strides_fromSliceOrigin_sliceDimensions_plane_, bytes.address(), strides.handle(), sliceOrigin.handle(), sliceDimensions.handle(), plane.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensor replaceSliceOrigin:sliceDimensions:plane:withBytes:strides:]} */
    public void replaceSliceOrigin(final MTLTensorExtents sliceOrigin, final MTLTensorExtents sliceDimensions, final MTLTensorPlaneType plane, final MemorySegment bytes, final MTLTensorExtents strides) {
        try {
            MH_replaceSliceOrigin_sliceDimensions_plane_withBytes_strides_.invokeExact(this.handle, SEL_replaceSliceOrigin_sliceDimensions_plane_withBytes_strides_, sliceOrigin.handle(), sliceDimensions.handle(), plane.value, bytes.address(), strides.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensor gpuResourceID]} */
    public MTLResourceID gpuResourceID() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLResourceID.read((MemorySegment) MH_gpuResourceID.invokeExact((SegmentAllocator) stack, this.handle, SEL_gpuResourceID));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTensor buffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLBuffer buffer() {
        try {
            long result = (long) MH_buffer.invokeExact(this.handle, SEL_buffer);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensor bufferOffset]} */
    public long bufferOffset() {
        try {
            return (long) MH_bufferOffset.invokeExact(this.handle, SEL_bufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTensor strides]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTensorExtents strides() {
        try {
            long result = (long) MH_strides.invokeExact(this.handle, SEL_strides);
            return result == 0L ? null : new MTLTensorExtents(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTensor dimensions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLTensorExtents dimensions() {
        try {
            long result = (long) MH_dimensions.invokeExact(this.handle, SEL_dimensions);
            return new MTLTensorExtents(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensor dataType]} */
    public MTLTensorDataType dataType() {
        try {
            return MTLTensorDataType.of((long) MH_dataType.invokeExact(this.handle, SEL_dataType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTensor usage]}
     *
     * @return a combination of {@link MTLTensorUsage} flags
     */
    public long usage() {
        try {
            return (long) MH_usage.invokeExact(this.handle, SEL_usage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTensor auxiliaryPlanes]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLTensorAuxiliaryPlane> auxiliaryPlanes() {
        try {
            long result = (long) MH_auxiliaryPlanes.invokeExact(this.handle, SEL_auxiliaryPlanes);
            return new NSArray<>(result, MTLTensorAuxiliaryPlane::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
