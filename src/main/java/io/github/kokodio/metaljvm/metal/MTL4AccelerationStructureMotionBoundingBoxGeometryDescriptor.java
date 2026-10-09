package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4accelerationstructuremotionboundingboxgeometrydescriptor">Apple documentation</a>
 */
public class MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor extends MTL4AccelerationStructureGeometryDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor");
    private static final long SEL_boundingBoxBuffers = ObjC.selector("boundingBoxBuffers");
    private static final MethodHandle MH_boundingBoxBuffers = ObjC.msgSendCritical(FunctionDescriptor.of(MTL4BufferRange.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBoundingBoxBuffers_ = ObjC.selector("setBoundingBoxBuffers:");
    private static final MethodHandle MH_setBoundingBoxBuffers_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_boundingBoxStride = ObjC.selector("boundingBoxStride");
    private static final MethodHandle MH_boundingBoxStride = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBoundingBoxStride_ = ObjC.selector("setBoundingBoxStride:");
    private static final MethodHandle MH_setBoundingBoxStride_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_boundingBoxCount = ObjC.selector("boundingBoxCount");
    private static final MethodHandle MH_boundingBoxCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBoundingBoxCount_ = ObjC.selector("setBoundingBoxCount:");
    private static final MethodHandle MH_setBoundingBoxCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor alloc() {
        try {
            return new MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor init]} */
    public MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor boundingBoxBuffers]} */
    public MTL4BufferRange boundingBoxBuffers() {
        try (NativeStack stack = NativeStack.push()) {
            return MTL4BufferRange.read((MemorySegment) MH_boundingBoxBuffers.invokeExact((SegmentAllocator) stack, this.handle, SEL_boundingBoxBuffers));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor setBoundingBoxBuffers:]} */
    public void setBoundingBoxBuffers(final MTL4BufferRange boundingBoxBuffers) {
        try {
            MH_setBoundingBoxBuffers_.invokeExact(this.handle, SEL_setBoundingBoxBuffers_, boundingBoxBuffers.bufferAddress(), boundingBoxBuffers.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor boundingBoxStride]} */
    public long boundingBoxStride() {
        try {
            return (long) MH_boundingBoxStride.invokeExact(this.handle, SEL_boundingBoxStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor setBoundingBoxStride:]} */
    public void setBoundingBoxStride(final long boundingBoxStride) {
        try {
            MH_setBoundingBoxStride_.invokeExact(this.handle, SEL_setBoundingBoxStride_, boundingBoxStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor boundingBoxCount]} */
    public long boundingBoxCount() {
        try {
            return (long) MH_boundingBoxCount.invokeExact(this.handle, SEL_boundingBoxCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureMotionBoundingBoxGeometryDescriptor setBoundingBoxCount:]} */
    public void setBoundingBoxCount(final long boundingBoxCount) {
        try {
            MH_setBoundingBoxCount_.invokeExact(this.handle, SEL_setBoundingBoxCount_, boundingBoxCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
