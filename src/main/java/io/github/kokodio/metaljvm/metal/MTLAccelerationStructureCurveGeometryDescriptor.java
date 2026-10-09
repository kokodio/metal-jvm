package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLAccelerationStructureCurveGeometryDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlaccelerationstructurecurvegeometrydescriptor">Apple documentation</a>
 */
public class MTLAccelerationStructureCurveGeometryDescriptor extends MTLAccelerationStructureGeometryDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLAccelerationStructureCurveGeometryDescriptor");
    private static final long SEL_CLASS_descriptor = ObjC.selector("descriptor");
    private static final MethodHandle MH_CLASS_descriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_controlPointBuffer = ObjC.selector("controlPointBuffer");
    private static final MethodHandle MH_controlPointBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setControlPointBuffer_ = ObjC.selector("setControlPointBuffer:");
    private static final MethodHandle MH_setControlPointBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_controlPointBufferOffset = ObjC.selector("controlPointBufferOffset");
    private static final MethodHandle MH_controlPointBufferOffset = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setControlPointBufferOffset_ = ObjC.selector("setControlPointBufferOffset:");
    private static final MethodHandle MH_setControlPointBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final long SEL_radiusBuffer = ObjC.selector("radiusBuffer");
    private static final MethodHandle MH_radiusBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRadiusBuffer_ = ObjC.selector("setRadiusBuffer:");
    private static final MethodHandle MH_setRadiusBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_radiusBufferOffset = ObjC.selector("radiusBufferOffset");
    private static final MethodHandle MH_radiusBufferOffset = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRadiusBufferOffset_ = ObjC.selector("setRadiusBufferOffset:");
    private static final MethodHandle MH_setRadiusBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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

    public MTLAccelerationStructureCurveGeometryDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLAccelerationStructureCurveGeometryDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLAccelerationStructureCurveGeometryDescriptor alloc() {
        try {
            return new MTLAccelerationStructureCurveGeometryDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor init]} */
    public MTLAccelerationStructureCurveGeometryDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLAccelerationStructureCurveGeometryDescriptor descriptor]} */
    public static MTLAccelerationStructureCurveGeometryDescriptor descriptor() {
        try {
            long result = (long) MH_CLASS_descriptor.invokeExact(CLS, SEL_CLASS_descriptor);
            return new MTLAccelerationStructureCurveGeometryDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLAccelerationStructureCurveGeometryDescriptor controlPointBuffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLBuffer controlPointBuffer() {
        try {
            long result = (long) MH_controlPointBuffer.invokeExact(this.handle, SEL_controlPointBuffer);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor setControlPointBuffer:]} */
    public void setControlPointBuffer(@Nullable final MTLBuffer controlPointBuffer) {
        try {
            MH_setControlPointBuffer_.invokeExact(this.handle, SEL_setControlPointBuffer_, controlPointBuffer == null ? 0L : controlPointBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor controlPointBufferOffset]} */
    public long controlPointBufferOffset() {
        try {
            return (long) MH_controlPointBufferOffset.invokeExact(this.handle, SEL_controlPointBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor setControlPointBufferOffset:]} */
    public void setControlPointBufferOffset(final long controlPointBufferOffset) {
        try {
            MH_setControlPointBufferOffset_.invokeExact(this.handle, SEL_setControlPointBufferOffset_, controlPointBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor controlPointCount]} */
    public long controlPointCount() {
        try {
            return (long) MH_controlPointCount.invokeExact(this.handle, SEL_controlPointCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor setControlPointCount:]} */
    public void setControlPointCount(final long controlPointCount) {
        try {
            MH_setControlPointCount_.invokeExact(this.handle, SEL_setControlPointCount_, controlPointCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor controlPointStride]} */
    public long controlPointStride() {
        try {
            return (long) MH_controlPointStride.invokeExact(this.handle, SEL_controlPointStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor setControlPointStride:]} */
    public void setControlPointStride(final long controlPointStride) {
        try {
            MH_setControlPointStride_.invokeExact(this.handle, SEL_setControlPointStride_, controlPointStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor controlPointFormat]} */
    public MTLAttributeFormat controlPointFormat() {
        try {
            return MTLAttributeFormat.of((long) MH_controlPointFormat.invokeExact(this.handle, SEL_controlPointFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor setControlPointFormat:]} */
    public void setControlPointFormat(final MTLAttributeFormat controlPointFormat) {
        try {
            MH_setControlPointFormat_.invokeExact(this.handle, SEL_setControlPointFormat_, controlPointFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLAccelerationStructureCurveGeometryDescriptor radiusBuffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLBuffer radiusBuffer() {
        try {
            long result = (long) MH_radiusBuffer.invokeExact(this.handle, SEL_radiusBuffer);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor setRadiusBuffer:]} */
    public void setRadiusBuffer(@Nullable final MTLBuffer radiusBuffer) {
        try {
            MH_setRadiusBuffer_.invokeExact(this.handle, SEL_setRadiusBuffer_, radiusBuffer == null ? 0L : radiusBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor radiusBufferOffset]} */
    public long radiusBufferOffset() {
        try {
            return (long) MH_radiusBufferOffset.invokeExact(this.handle, SEL_radiusBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor setRadiusBufferOffset:]} */
    public void setRadiusBufferOffset(final long radiusBufferOffset) {
        try {
            MH_setRadiusBufferOffset_.invokeExact(this.handle, SEL_setRadiusBufferOffset_, radiusBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor radiusFormat]} */
    public MTLAttributeFormat radiusFormat() {
        try {
            return MTLAttributeFormat.of((long) MH_radiusFormat.invokeExact(this.handle, SEL_radiusFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor setRadiusFormat:]} */
    public void setRadiusFormat(final MTLAttributeFormat radiusFormat) {
        try {
            MH_setRadiusFormat_.invokeExact(this.handle, SEL_setRadiusFormat_, radiusFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor radiusStride]} */
    public long radiusStride() {
        try {
            return (long) MH_radiusStride.invokeExact(this.handle, SEL_radiusStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor setRadiusStride:]} */
    public void setRadiusStride(final long radiusStride) {
        try {
            MH_setRadiusStride_.invokeExact(this.handle, SEL_setRadiusStride_, radiusStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLAccelerationStructureCurveGeometryDescriptor indexBuffer]}
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

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor setIndexBuffer:]} */
    public void setIndexBuffer(@Nullable final MTLBuffer indexBuffer) {
        try {
            MH_setIndexBuffer_.invokeExact(this.handle, SEL_setIndexBuffer_, indexBuffer == null ? 0L : indexBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor indexBufferOffset]} */
    public long indexBufferOffset() {
        try {
            return (long) MH_indexBufferOffset.invokeExact(this.handle, SEL_indexBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor setIndexBufferOffset:]} */
    public void setIndexBufferOffset(final long indexBufferOffset) {
        try {
            MH_setIndexBufferOffset_.invokeExact(this.handle, SEL_setIndexBufferOffset_, indexBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor indexType]} */
    public MTLIndexType indexType() {
        try {
            return MTLIndexType.of((long) MH_indexType.invokeExact(this.handle, SEL_indexType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor setIndexType:]} */
    public void setIndexType(final MTLIndexType indexType) {
        try {
            MH_setIndexType_.invokeExact(this.handle, SEL_setIndexType_, indexType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor segmentCount]} */
    public long segmentCount() {
        try {
            return (long) MH_segmentCount.invokeExact(this.handle, SEL_segmentCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor setSegmentCount:]} */
    public void setSegmentCount(final long segmentCount) {
        try {
            MH_setSegmentCount_.invokeExact(this.handle, SEL_setSegmentCount_, segmentCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor segmentControlPointCount]} */
    public long segmentControlPointCount() {
        try {
            return (long) MH_segmentControlPointCount.invokeExact(this.handle, SEL_segmentControlPointCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor setSegmentControlPointCount:]} */
    public void setSegmentControlPointCount(final long segmentControlPointCount) {
        try {
            MH_setSegmentControlPointCount_.invokeExact(this.handle, SEL_setSegmentControlPointCount_, segmentControlPointCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor curveType]} */
    public MTLCurveType curveType() {
        try {
            return MTLCurveType.of((long) MH_curveType.invokeExact(this.handle, SEL_curveType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor setCurveType:]} */
    public void setCurveType(final MTLCurveType curveType) {
        try {
            MH_setCurveType_.invokeExact(this.handle, SEL_setCurveType_, curveType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor curveBasis]} */
    public MTLCurveBasis curveBasis() {
        try {
            return MTLCurveBasis.of((long) MH_curveBasis.invokeExact(this.handle, SEL_curveBasis));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor setCurveBasis:]} */
    public void setCurveBasis(final MTLCurveBasis curveBasis) {
        try {
            MH_setCurveBasis_.invokeExact(this.handle, SEL_setCurveBasis_, curveBasis.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor curveEndCaps]} */
    public MTLCurveEndCaps curveEndCaps() {
        try {
            return MTLCurveEndCaps.of((long) MH_curveEndCaps.invokeExact(this.handle, SEL_curveEndCaps));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCurveGeometryDescriptor setCurveEndCaps:]} */
    public void setCurveEndCaps(final MTLCurveEndCaps curveEndCaps) {
        try {
            MH_setCurveEndCaps_.invokeExact(this.handle, SEL_setCurveEndCaps_, curveEndCaps.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
