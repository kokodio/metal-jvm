package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLAccelerationStructureMotionTriangleGeometryDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlaccelerationstructuremotiontrianglegeometrydescriptor">Apple documentation</a>
 */
public class MTLAccelerationStructureMotionTriangleGeometryDescriptor extends MTLAccelerationStructureGeometryDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLAccelerationStructureMotionTriangleGeometryDescriptor");
    private static final long SEL_CLASS_descriptor = ObjC.selector("descriptor");
    private static final MethodHandle MH_CLASS_descriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_vertexBuffers = ObjC.selector("vertexBuffers");
    private static final MethodHandle MH_vertexBuffers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexBuffers_ = ObjC.selector("setVertexBuffers:");
    private static final MethodHandle MH_setVertexBuffers_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_vertexFormat = ObjC.selector("vertexFormat");
    private static final MethodHandle MH_vertexFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexFormat_ = ObjC.selector("setVertexFormat:");
    private static final MethodHandle MH_setVertexFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_vertexStride = ObjC.selector("vertexStride");
    private static final MethodHandle MH_vertexStride = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexStride_ = ObjC.selector("setVertexStride:");
    private static final MethodHandle MH_setVertexStride_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final long SEL_triangleCount = ObjC.selector("triangleCount");
    private static final MethodHandle MH_triangleCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTriangleCount_ = ObjC.selector("setTriangleCount:");
    private static final MethodHandle MH_setTriangleCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_transformationMatrixBuffer = ObjC.selector("transformationMatrixBuffer");
    private static final MethodHandle MH_transformationMatrixBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTransformationMatrixBuffer_ = ObjC.selector("setTransformationMatrixBuffer:");
    private static final MethodHandle MH_setTransformationMatrixBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_transformationMatrixBufferOffset = ObjC.selector("transformationMatrixBufferOffset");
    private static final MethodHandle MH_transformationMatrixBufferOffset = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTransformationMatrixBufferOffset_ = ObjC.selector("setTransformationMatrixBufferOffset:");
    private static final MethodHandle MH_setTransformationMatrixBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_transformationMatrixLayout = ObjC.selector("transformationMatrixLayout");
    private static final MethodHandle MH_transformationMatrixLayout = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTransformationMatrixLayout_ = ObjC.selector("setTransformationMatrixLayout:");
    private static final MethodHandle MH_setTransformationMatrixLayout_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLAccelerationStructureMotionTriangleGeometryDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLAccelerationStructureMotionTriangleGeometryDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLAccelerationStructureMotionTriangleGeometryDescriptor alloc() {
        try {
            return new MTLAccelerationStructureMotionTriangleGeometryDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionTriangleGeometryDescriptor init]} */
    public MTLAccelerationStructureMotionTriangleGeometryDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLAccelerationStructureMotionTriangleGeometryDescriptor descriptor]} */
    public static MTLAccelerationStructureMotionTriangleGeometryDescriptor descriptor() {
        try {
            long result = (long) MH_CLASS_descriptor.invokeExact(CLS, SEL_CLASS_descriptor);
            return new MTLAccelerationStructureMotionTriangleGeometryDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLAccelerationStructureMotionTriangleGeometryDescriptor vertexBuffers]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLMotionKeyframeData> vertexBuffers() {
        try {
            long result = (long) MH_vertexBuffers.invokeExact(this.handle, SEL_vertexBuffers);
            return new NSArray<>(result, MTLMotionKeyframeData::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionTriangleGeometryDescriptor setVertexBuffers:]} */
    public void setVertexBuffers(final NSArray<MTLMotionKeyframeData> vertexBuffers) {
        try {
            MH_setVertexBuffers_.invokeExact(this.handle, SEL_setVertexBuffers_, vertexBuffers.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionTriangleGeometryDescriptor vertexFormat]} */
    public MTLAttributeFormat vertexFormat() {
        try {
            return MTLAttributeFormat.of((long) MH_vertexFormat.invokeExact(this.handle, SEL_vertexFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionTriangleGeometryDescriptor setVertexFormat:]} */
    public void setVertexFormat(final MTLAttributeFormat vertexFormat) {
        try {
            MH_setVertexFormat_.invokeExact(this.handle, SEL_setVertexFormat_, vertexFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionTriangleGeometryDescriptor vertexStride]} */
    public long vertexStride() {
        try {
            return (long) MH_vertexStride.invokeExact(this.handle, SEL_vertexStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionTriangleGeometryDescriptor setVertexStride:]} */
    public void setVertexStride(final long vertexStride) {
        try {
            MH_setVertexStride_.invokeExact(this.handle, SEL_setVertexStride_, vertexStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLAccelerationStructureMotionTriangleGeometryDescriptor indexBuffer]}
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

    /** {@code -[MTLAccelerationStructureMotionTriangleGeometryDescriptor setIndexBuffer:]} */
    public void setIndexBuffer(@Nullable final MTLBuffer indexBuffer) {
        try {
            MH_setIndexBuffer_.invokeExact(this.handle, SEL_setIndexBuffer_, indexBuffer == null ? 0L : indexBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionTriangleGeometryDescriptor indexBufferOffset]} */
    public long indexBufferOffset() {
        try {
            return (long) MH_indexBufferOffset.invokeExact(this.handle, SEL_indexBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionTriangleGeometryDescriptor setIndexBufferOffset:]} */
    public void setIndexBufferOffset(final long indexBufferOffset) {
        try {
            MH_setIndexBufferOffset_.invokeExact(this.handle, SEL_setIndexBufferOffset_, indexBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionTriangleGeometryDescriptor indexType]} */
    public MTLIndexType indexType() {
        try {
            return MTLIndexType.of((long) MH_indexType.invokeExact(this.handle, SEL_indexType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionTriangleGeometryDescriptor setIndexType:]} */
    public void setIndexType(final MTLIndexType indexType) {
        try {
            MH_setIndexType_.invokeExact(this.handle, SEL_setIndexType_, indexType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionTriangleGeometryDescriptor triangleCount]} */
    public long triangleCount() {
        try {
            return (long) MH_triangleCount.invokeExact(this.handle, SEL_triangleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionTriangleGeometryDescriptor setTriangleCount:]} */
    public void setTriangleCount(final long triangleCount) {
        try {
            MH_setTriangleCount_.invokeExact(this.handle, SEL_setTriangleCount_, triangleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLAccelerationStructureMotionTriangleGeometryDescriptor transformationMatrixBuffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLBuffer transformationMatrixBuffer() {
        try {
            long result = (long) MH_transformationMatrixBuffer.invokeExact(this.handle, SEL_transformationMatrixBuffer);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionTriangleGeometryDescriptor setTransformationMatrixBuffer:]} */
    public void setTransformationMatrixBuffer(@Nullable final MTLBuffer transformationMatrixBuffer) {
        try {
            MH_setTransformationMatrixBuffer_.invokeExact(this.handle, SEL_setTransformationMatrixBuffer_, transformationMatrixBuffer == null ? 0L : transformationMatrixBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionTriangleGeometryDescriptor transformationMatrixBufferOffset]} */
    public long transformationMatrixBufferOffset() {
        try {
            return (long) MH_transformationMatrixBufferOffset.invokeExact(this.handle, SEL_transformationMatrixBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionTriangleGeometryDescriptor setTransformationMatrixBufferOffset:]} */
    public void setTransformationMatrixBufferOffset(final long transformationMatrixBufferOffset) {
        try {
            MH_setTransformationMatrixBufferOffset_.invokeExact(this.handle, SEL_setTransformationMatrixBufferOffset_, transformationMatrixBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionTriangleGeometryDescriptor transformationMatrixLayout]} */
    public MTLMatrixLayout transformationMatrixLayout() {
        try {
            return MTLMatrixLayout.of((long) MH_transformationMatrixLayout.invokeExact(this.handle, SEL_transformationMatrixLayout));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionTriangleGeometryDescriptor setTransformationMatrixLayout:]} */
    public void setTransformationMatrixLayout(final MTLMatrixLayout transformationMatrixLayout) {
        try {
            MH_setTransformationMatrixLayout_.invokeExact(this.handle, SEL_setTransformationMatrixLayout_, transformationMatrixLayout.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
