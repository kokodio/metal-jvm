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
 * {@code MTL4AccelerationStructureCurveGeometryDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4accelerationstructurecurvegeometrydescriptor">Apple documentation</a>
 */
public class MTL4AccelerationStructureCurveGeometryDescriptor extends MTL4AccelerationStructureGeometryDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4AccelerationStructureCurveGeometryDescriptor");
    private static final long SEL_controlPointBuffer = ObjC.selector("controlPointBuffer");
    private static final MethodHandle MH_controlPointBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(MTL4BufferRange.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setControlPointBuffer_ = ObjC.selector("setControlPointBuffer:");
    private static final MethodHandle MH_setControlPointBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final MethodHandle MH_radiusBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(MTL4BufferRange.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRadiusBuffer_ = ObjC.selector("setRadiusBuffer:");
    private static final MethodHandle MH_setRadiusBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_radiusFormat = ObjC.selector("radiusFormat");
    private static final MethodHandle MH_radiusFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRadiusFormat_ = ObjC.selector("setRadiusFormat:");
    private static final MethodHandle MH_setRadiusFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_radiusStride = ObjC.selector("radiusStride");
    private static final MethodHandle MH_radiusStride = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRadiusStride_ = ObjC.selector("setRadiusStride:");
    private static final MethodHandle MH_setRadiusStride_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indexBuffer = ObjC.selector("indexBuffer");
    private static final MethodHandle MH_indexBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(MTL4BufferRange.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setIndexBuffer_ = ObjC.selector("setIndexBuffer:");
    private static final MethodHandle MH_setIndexBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
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

    public MTL4AccelerationStructureCurveGeometryDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4AccelerationStructureCurveGeometryDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4AccelerationStructureCurveGeometryDescriptor alloc() {
        try {
            return new MTL4AccelerationStructureCurveGeometryDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor init]} */
    public MTL4AccelerationStructureCurveGeometryDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor controlPointBuffer]} */
    public MTL4BufferRange controlPointBuffer() {
        try (NativeStack stack = NativeStack.push()) {
            return MTL4BufferRange.read((MemorySegment) MH_controlPointBuffer.invokeExact((SegmentAllocator) stack, this.handle, SEL_controlPointBuffer));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor setControlPointBuffer:]} */
    public void setControlPointBuffer(final MTL4BufferRange controlPointBuffer) {
        try {
            MH_setControlPointBuffer_.invokeExact(this.handle, SEL_setControlPointBuffer_, controlPointBuffer.bufferAddress(), controlPointBuffer.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor controlPointCount]} */
    public long controlPointCount() {
        try {
            return (long) MH_controlPointCount.invokeExact(this.handle, SEL_controlPointCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor setControlPointCount:]} */
    public void setControlPointCount(final long controlPointCount) {
        try {
            MH_setControlPointCount_.invokeExact(this.handle, SEL_setControlPointCount_, controlPointCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor controlPointStride]} */
    public long controlPointStride() {
        try {
            return (long) MH_controlPointStride.invokeExact(this.handle, SEL_controlPointStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor setControlPointStride:]} */
    public void setControlPointStride(final long controlPointStride) {
        try {
            MH_setControlPointStride_.invokeExact(this.handle, SEL_setControlPointStride_, controlPointStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor controlPointFormat]} */
    public MTLAttributeFormat controlPointFormat() {
        try {
            return MTLAttributeFormat.of((long) MH_controlPointFormat.invokeExact(this.handle, SEL_controlPointFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor setControlPointFormat:]} */
    public void setControlPointFormat(final MTLAttributeFormat controlPointFormat) {
        try {
            MH_setControlPointFormat_.invokeExact(this.handle, SEL_setControlPointFormat_, controlPointFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor radiusBuffer]} */
    public MTL4BufferRange radiusBuffer() {
        try (NativeStack stack = NativeStack.push()) {
            return MTL4BufferRange.read((MemorySegment) MH_radiusBuffer.invokeExact((SegmentAllocator) stack, this.handle, SEL_radiusBuffer));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor setRadiusBuffer:]} */
    public void setRadiusBuffer(final MTL4BufferRange radiusBuffer) {
        try {
            MH_setRadiusBuffer_.invokeExact(this.handle, SEL_setRadiusBuffer_, radiusBuffer.bufferAddress(), radiusBuffer.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor radiusFormat]} */
    public MTLAttributeFormat radiusFormat() {
        try {
            return MTLAttributeFormat.of((long) MH_radiusFormat.invokeExact(this.handle, SEL_radiusFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor setRadiusFormat:]} */
    public void setRadiusFormat(final MTLAttributeFormat radiusFormat) {
        try {
            MH_setRadiusFormat_.invokeExact(this.handle, SEL_setRadiusFormat_, radiusFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor radiusStride]} */
    public long radiusStride() {
        try {
            return (long) MH_radiusStride.invokeExact(this.handle, SEL_radiusStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor setRadiusStride:]} */
    public void setRadiusStride(final long radiusStride) {
        try {
            MH_setRadiusStride_.invokeExact(this.handle, SEL_setRadiusStride_, radiusStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor indexBuffer]} */
    public MTL4BufferRange indexBuffer() {
        try (NativeStack stack = NativeStack.push()) {
            return MTL4BufferRange.read((MemorySegment) MH_indexBuffer.invokeExact((SegmentAllocator) stack, this.handle, SEL_indexBuffer));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor setIndexBuffer:]} */
    public void setIndexBuffer(final MTL4BufferRange indexBuffer) {
        try {
            MH_setIndexBuffer_.invokeExact(this.handle, SEL_setIndexBuffer_, indexBuffer.bufferAddress(), indexBuffer.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor indexType]} */
    public MTLIndexType indexType() {
        try {
            return MTLIndexType.of((long) MH_indexType.invokeExact(this.handle, SEL_indexType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor setIndexType:]} */
    public void setIndexType(final MTLIndexType indexType) {
        try {
            MH_setIndexType_.invokeExact(this.handle, SEL_setIndexType_, indexType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor segmentCount]} */
    public long segmentCount() {
        try {
            return (long) MH_segmentCount.invokeExact(this.handle, SEL_segmentCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor setSegmentCount:]} */
    public void setSegmentCount(final long segmentCount) {
        try {
            MH_setSegmentCount_.invokeExact(this.handle, SEL_setSegmentCount_, segmentCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor segmentControlPointCount]} */
    public long segmentControlPointCount() {
        try {
            return (long) MH_segmentControlPointCount.invokeExact(this.handle, SEL_segmentControlPointCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor setSegmentControlPointCount:]} */
    public void setSegmentControlPointCount(final long segmentControlPointCount) {
        try {
            MH_setSegmentControlPointCount_.invokeExact(this.handle, SEL_setSegmentControlPointCount_, segmentControlPointCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor curveType]} */
    public MTLCurveType curveType() {
        try {
            return MTLCurveType.of((long) MH_curveType.invokeExact(this.handle, SEL_curveType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor setCurveType:]} */
    public void setCurveType(final MTLCurveType curveType) {
        try {
            MH_setCurveType_.invokeExact(this.handle, SEL_setCurveType_, curveType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor curveBasis]} */
    public MTLCurveBasis curveBasis() {
        try {
            return MTLCurveBasis.of((long) MH_curveBasis.invokeExact(this.handle, SEL_curveBasis));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor setCurveBasis:]} */
    public void setCurveBasis(final MTLCurveBasis curveBasis) {
        try {
            MH_setCurveBasis_.invokeExact(this.handle, SEL_setCurveBasis_, curveBasis.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor curveEndCaps]} */
    public MTLCurveEndCaps curveEndCaps() {
        try {
            return MTLCurveEndCaps.of((long) MH_curveEndCaps.invokeExact(this.handle, SEL_curveEndCaps));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureCurveGeometryDescriptor setCurveEndCaps:]} */
    public void setCurveEndCaps(final MTLCurveEndCaps curveEndCaps) {
        try {
            MH_setCurveEndCaps_.invokeExact(this.handle, SEL_setCurveEndCaps_, curveEndCaps.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
