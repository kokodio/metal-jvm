package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLAccelerationStructureMotionCurveGeometryDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlaccelerationstructuremotioncurvegeometrydescriptor">Apple documentation</a>
 */
public class MTLAccelerationStructureMotionCurveGeometryDescriptor extends MTLAccelerationStructureGeometryDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLAccelerationStructureMotionCurveGeometryDescriptor");
    private static final long SEL_CLASS_descriptor = ObjC.selector("descriptor");
    private static final MethodHandle MH_CLASS_descriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_controlPointBuffers = ObjC.selector("controlPointBuffers");
    private static final MethodHandle MH_controlPointBuffers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setControlPointBuffers_ = ObjC.selector("setControlPointBuffers:");
    private static final MethodHandle MH_setControlPointBuffers_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_controlPointCount = ObjC.selector("controlPointCount");
    private static final MethodHandle MH_controlPointCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setControlPointCount_ = ObjC.selector("setControlPointCount:");
    private static final MethodHandle MH_setControlPointCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_controlPointStride = ObjC.selector("controlPointStride");
    private static final MethodHandle MH_controlPointStride = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setControlPointStride_ = ObjC.selector("setControlPointStride:");
    private static final MethodHandle MH_setControlPointStride_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_controlPointFormat = ObjC.selector("controlPointFormat");
    private static final MethodHandle MH_controlPointFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setControlPointFormat_ = ObjC.selector("setControlPointFormat:");
    private static final MethodHandle MH_setControlPointFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_radiusBuffers = ObjC.selector("radiusBuffers");
    private static final MethodHandle MH_radiusBuffers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRadiusBuffers_ = ObjC.selector("setRadiusBuffers:");
    private static final MethodHandle MH_setRadiusBuffers_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_radiusFormat = ObjC.selector("radiusFormat");
    private static final MethodHandle MH_radiusFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRadiusFormat_ = ObjC.selector("setRadiusFormat:");
    private static final MethodHandle MH_setRadiusFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_radiusStride = ObjC.selector("radiusStride");
    private static final MethodHandle MH_radiusStride = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRadiusStride_ = ObjC.selector("setRadiusStride:");
    private static final MethodHandle MH_setRadiusStride_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indexBuffer = ObjC.selector("indexBuffer");
    private static final MethodHandle MH_indexBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setIndexBuffer_ = ObjC.selector("setIndexBuffer:");
    private static final MethodHandle MH_setIndexBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indexBufferOffset = ObjC.selector("indexBufferOffset");
    private static final MethodHandle MH_indexBufferOffset = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setIndexBufferOffset_ = ObjC.selector("setIndexBufferOffset:");
    private static final MethodHandle MH_setIndexBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indexType = ObjC.selector("indexType");
    private static final MethodHandle MH_indexType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setIndexType_ = ObjC.selector("setIndexType:");
    private static final MethodHandle MH_setIndexType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_segmentCount = ObjC.selector("segmentCount");
    private static final MethodHandle MH_segmentCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSegmentCount_ = ObjC.selector("setSegmentCount:");
    private static final MethodHandle MH_setSegmentCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_segmentControlPointCount = ObjC.selector("segmentControlPointCount");
    private static final MethodHandle MH_segmentControlPointCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSegmentControlPointCount_ = ObjC.selector("setSegmentControlPointCount:");
    private static final MethodHandle MH_setSegmentControlPointCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_curveType = ObjC.selector("curveType");
    private static final MethodHandle MH_curveType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCurveType_ = ObjC.selector("setCurveType:");
    private static final MethodHandle MH_setCurveType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_curveBasis = ObjC.selector("curveBasis");
    private static final MethodHandle MH_curveBasis = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCurveBasis_ = ObjC.selector("setCurveBasis:");
    private static final MethodHandle MH_setCurveBasis_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_curveEndCaps = ObjC.selector("curveEndCaps");
    private static final MethodHandle MH_curveEndCaps = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCurveEndCaps_ = ObjC.selector("setCurveEndCaps:");
    private static final MethodHandle MH_setCurveEndCaps_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLAccelerationStructureMotionCurveGeometryDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLAccelerationStructureMotionCurveGeometryDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLAccelerationStructureMotionCurveGeometryDescriptor alloc() {
        try {
            return new MTLAccelerationStructureMotionCurveGeometryDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor init]} */
    public MTLAccelerationStructureMotionCurveGeometryDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLAccelerationStructureMotionCurveGeometryDescriptor descriptor]} */
    public static MTLAccelerationStructureMotionCurveGeometryDescriptor descriptor() {
        try {
            long result = (long) MH_CLASS_descriptor.invokeExact(CLS, SEL_CLASS_descriptor);
            return new MTLAccelerationStructureMotionCurveGeometryDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor controlPointBuffers]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLMotionKeyframeData> controlPointBuffers() {
        try {
            long result = (long) MH_controlPointBuffers.invokeExact(this.handle, SEL_controlPointBuffers);
            return new NSArray<>(result, MTLMotionKeyframeData::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor setControlPointBuffers:]} */
    public void setControlPointBuffers(final NSArray<MTLMotionKeyframeData> controlPointBuffers) {
        try {
            MH_setControlPointBuffers_.invokeExact(this.handle, SEL_setControlPointBuffers_, controlPointBuffers.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor controlPointCount]} */
    public long controlPointCount() {
        try {
            return (long) MH_controlPointCount.invokeExact(this.handle, SEL_controlPointCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor setControlPointCount:]} */
    public void setControlPointCount(final long controlPointCount) {
        try {
            MH_setControlPointCount_.invokeExact(this.handle, SEL_setControlPointCount_, controlPointCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor controlPointStride]} */
    public long controlPointStride() {
        try {
            return (long) MH_controlPointStride.invokeExact(this.handle, SEL_controlPointStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor setControlPointStride:]} */
    public void setControlPointStride(final long controlPointStride) {
        try {
            MH_setControlPointStride_.invokeExact(this.handle, SEL_setControlPointStride_, controlPointStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor controlPointFormat]} */
    public MTLAttributeFormat controlPointFormat() {
        try {
            return MTLAttributeFormat.of((long) MH_controlPointFormat.invokeExact(this.handle, SEL_controlPointFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor setControlPointFormat:]} */
    public void setControlPointFormat(final MTLAttributeFormat controlPointFormat) {
        try {
            MH_setControlPointFormat_.invokeExact(this.handle, SEL_setControlPointFormat_, controlPointFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor radiusBuffers]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLMotionKeyframeData> radiusBuffers() {
        try {
            long result = (long) MH_radiusBuffers.invokeExact(this.handle, SEL_radiusBuffers);
            return new NSArray<>(result, MTLMotionKeyframeData::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor setRadiusBuffers:]} */
    public void setRadiusBuffers(final NSArray<MTLMotionKeyframeData> radiusBuffers) {
        try {
            MH_setRadiusBuffers_.invokeExact(this.handle, SEL_setRadiusBuffers_, radiusBuffers.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor radiusFormat]} */
    public MTLAttributeFormat radiusFormat() {
        try {
            return MTLAttributeFormat.of((long) MH_radiusFormat.invokeExact(this.handle, SEL_radiusFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor setRadiusFormat:]} */
    public void setRadiusFormat(final MTLAttributeFormat radiusFormat) {
        try {
            MH_setRadiusFormat_.invokeExact(this.handle, SEL_setRadiusFormat_, radiusFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor radiusStride]} */
    public long radiusStride() {
        try {
            return (long) MH_radiusStride.invokeExact(this.handle, SEL_radiusStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor setRadiusStride:]} */
    public void setRadiusStride(final long radiusStride) {
        try {
            MH_setRadiusStride_.invokeExact(this.handle, SEL_setRadiusStride_, radiusStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor indexBuffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLBuffer indexBuffer() {
        try {
            long result = (long) MH_indexBuffer.invokeExact(this.handle, SEL_indexBuffer);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor setIndexBuffer:]} */
    public void setIndexBuffer(@Nullable final MTLBuffer indexBuffer) {
        try {
            MH_setIndexBuffer_.invokeExact(this.handle, SEL_setIndexBuffer_, indexBuffer == null ? 0L : indexBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor indexBufferOffset]} */
    public long indexBufferOffset() {
        try {
            return (long) MH_indexBufferOffset.invokeExact(this.handle, SEL_indexBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor setIndexBufferOffset:]} */
    public void setIndexBufferOffset(final long indexBufferOffset) {
        try {
            MH_setIndexBufferOffset_.invokeExact(this.handle, SEL_setIndexBufferOffset_, indexBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor indexType]} */
    public MTLIndexType indexType() {
        try {
            return MTLIndexType.of((long) MH_indexType.invokeExact(this.handle, SEL_indexType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor setIndexType:]} */
    public void setIndexType(final MTLIndexType indexType) {
        try {
            MH_setIndexType_.invokeExact(this.handle, SEL_setIndexType_, indexType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor segmentCount]} */
    public long segmentCount() {
        try {
            return (long) MH_segmentCount.invokeExact(this.handle, SEL_segmentCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor setSegmentCount:]} */
    public void setSegmentCount(final long segmentCount) {
        try {
            MH_setSegmentCount_.invokeExact(this.handle, SEL_setSegmentCount_, segmentCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor segmentControlPointCount]} */
    public long segmentControlPointCount() {
        try {
            return (long) MH_segmentControlPointCount.invokeExact(this.handle, SEL_segmentControlPointCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor setSegmentControlPointCount:]} */
    public void setSegmentControlPointCount(final long segmentControlPointCount) {
        try {
            MH_setSegmentControlPointCount_.invokeExact(this.handle, SEL_setSegmentControlPointCount_, segmentControlPointCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor curveType]} */
    public MTLCurveType curveType() {
        try {
            return MTLCurveType.of((long) MH_curveType.invokeExact(this.handle, SEL_curveType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor setCurveType:]} */
    public void setCurveType(final MTLCurveType curveType) {
        try {
            MH_setCurveType_.invokeExact(this.handle, SEL_setCurveType_, curveType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor curveBasis]} */
    public MTLCurveBasis curveBasis() {
        try {
            return MTLCurveBasis.of((long) MH_curveBasis.invokeExact(this.handle, SEL_curveBasis));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor setCurveBasis:]} */
    public void setCurveBasis(final MTLCurveBasis curveBasis) {
        try {
            MH_setCurveBasis_.invokeExact(this.handle, SEL_setCurveBasis_, curveBasis.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor curveEndCaps]} */
    public MTLCurveEndCaps curveEndCaps() {
        try {
            return MTLCurveEndCaps.of((long) MH_curveEndCaps.invokeExact(this.handle, SEL_curveEndCaps));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionCurveGeometryDescriptor setCurveEndCaps:]} */
    public void setCurveEndCaps(final MTLCurveEndCaps curveEndCaps) {
        try {
            MH_setCurveEndCaps_.invokeExact(this.handle, SEL_setCurveEndCaps_, curveEndCaps.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
