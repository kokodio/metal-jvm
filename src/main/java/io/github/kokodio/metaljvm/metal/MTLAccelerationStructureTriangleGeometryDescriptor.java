package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLAccelerationStructureTriangleGeometryDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlaccelerationstructuretrianglegeometrydescriptor">Apple documentation</a>
 */
public class MTLAccelerationStructureTriangleGeometryDescriptor extends MTLAccelerationStructureGeometryDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLAccelerationStructureTriangleGeometryDescriptor");
    private static final long SEL_CLASS_descriptor = ObjC.selector("descriptor");
    private static final MethodHandle MH_CLASS_descriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_vertexBuffer = ObjC.selector("vertexBuffer");
    private static final MethodHandle MH_vertexBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexBuffer_ = ObjC.selector("setVertexBuffer:");
    private static final MethodHandle MH_setVertexBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_vertexBufferOffset = ObjC.selector("vertexBufferOffset");
    private static final MethodHandle MH_vertexBufferOffset = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexBufferOffset_ = ObjC.selector("setVertexBufferOffset:");
    private static final MethodHandle MH_setVertexBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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

    public MTLAccelerationStructureTriangleGeometryDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLAccelerationStructureTriangleGeometryDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLAccelerationStructureTriangleGeometryDescriptor alloc() {
        try {
            return new MTLAccelerationStructureTriangleGeometryDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureTriangleGeometryDescriptor init]} */
    public MTLAccelerationStructureTriangleGeometryDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLAccelerationStructureTriangleGeometryDescriptor descriptor]} */
    public static MTLAccelerationStructureTriangleGeometryDescriptor descriptor() {
        try {
            long result = (long) MH_CLASS_descriptor.invokeExact(CLS, SEL_CLASS_descriptor);
            return new MTLAccelerationStructureTriangleGeometryDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLAccelerationStructureTriangleGeometryDescriptor vertexBuffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLBuffer vertexBuffer() {
        try {
            long result = (long) MH_vertexBuffer.invokeExact(this.handle, SEL_vertexBuffer);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureTriangleGeometryDescriptor setVertexBuffer:]} */
    public void setVertexBuffer(@Nullable final MTLBuffer vertexBuffer) {
        try {
            MH_setVertexBuffer_.invokeExact(this.handle, SEL_setVertexBuffer_, vertexBuffer == null ? 0L : vertexBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureTriangleGeometryDescriptor vertexBufferOffset]} */
    public long vertexBufferOffset() {
        try {
            return (long) MH_vertexBufferOffset.invokeExact(this.handle, SEL_vertexBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureTriangleGeometryDescriptor setVertexBufferOffset:]} */
    public void setVertexBufferOffset(final long vertexBufferOffset) {
        try {
            MH_setVertexBufferOffset_.invokeExact(this.handle, SEL_setVertexBufferOffset_, vertexBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureTriangleGeometryDescriptor vertexFormat]} */
    public MTLAttributeFormat vertexFormat() {
        try {
            return MTLAttributeFormat.of((long) MH_vertexFormat.invokeExact(this.handle, SEL_vertexFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureTriangleGeometryDescriptor setVertexFormat:]} */
    public void setVertexFormat(final MTLAttributeFormat vertexFormat) {
        try {
            MH_setVertexFormat_.invokeExact(this.handle, SEL_setVertexFormat_, vertexFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureTriangleGeometryDescriptor vertexStride]} */
    public long vertexStride() {
        try {
            return (long) MH_vertexStride.invokeExact(this.handle, SEL_vertexStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureTriangleGeometryDescriptor setVertexStride:]} */
    public void setVertexStride(final long vertexStride) {
        try {
            MH_setVertexStride_.invokeExact(this.handle, SEL_setVertexStride_, vertexStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLAccelerationStructureTriangleGeometryDescriptor indexBuffer]}
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

    /** {@code -[MTLAccelerationStructureTriangleGeometryDescriptor setIndexBuffer:]} */
    public void setIndexBuffer(@Nullable final MTLBuffer indexBuffer) {
        try {
            MH_setIndexBuffer_.invokeExact(this.handle, SEL_setIndexBuffer_, indexBuffer == null ? 0L : indexBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureTriangleGeometryDescriptor indexBufferOffset]} */
    public long indexBufferOffset() {
        try {
            return (long) MH_indexBufferOffset.invokeExact(this.handle, SEL_indexBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureTriangleGeometryDescriptor setIndexBufferOffset:]} */
    public void setIndexBufferOffset(final long indexBufferOffset) {
        try {
            MH_setIndexBufferOffset_.invokeExact(this.handle, SEL_setIndexBufferOffset_, indexBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureTriangleGeometryDescriptor indexType]} */
    public MTLIndexType indexType() {
        try {
            return MTLIndexType.of((long) MH_indexType.invokeExact(this.handle, SEL_indexType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureTriangleGeometryDescriptor setIndexType:]} */
    public void setIndexType(final MTLIndexType indexType) {
        try {
            MH_setIndexType_.invokeExact(this.handle, SEL_setIndexType_, indexType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureTriangleGeometryDescriptor triangleCount]} */
    public long triangleCount() {
        try {
            return (long) MH_triangleCount.invokeExact(this.handle, SEL_triangleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureTriangleGeometryDescriptor setTriangleCount:]} */
    public void setTriangleCount(final long triangleCount) {
        try {
            MH_setTriangleCount_.invokeExact(this.handle, SEL_setTriangleCount_, triangleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLAccelerationStructureTriangleGeometryDescriptor transformationMatrixBuffer]}
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

    /** {@code -[MTLAccelerationStructureTriangleGeometryDescriptor setTransformationMatrixBuffer:]} */
    public void setTransformationMatrixBuffer(@Nullable final MTLBuffer transformationMatrixBuffer) {
        try {
            MH_setTransformationMatrixBuffer_.invokeExact(this.handle, SEL_setTransformationMatrixBuffer_, transformationMatrixBuffer == null ? 0L : transformationMatrixBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureTriangleGeometryDescriptor transformationMatrixBufferOffset]} */
    public long transformationMatrixBufferOffset() {
        try {
            return (long) MH_transformationMatrixBufferOffset.invokeExact(this.handle, SEL_transformationMatrixBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureTriangleGeometryDescriptor setTransformationMatrixBufferOffset:]} */
    public void setTransformationMatrixBufferOffset(final long transformationMatrixBufferOffset) {
        try {
            MH_setTransformationMatrixBufferOffset_.invokeExact(this.handle, SEL_setTransformationMatrixBufferOffset_, transformationMatrixBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureTriangleGeometryDescriptor transformationMatrixLayout]} */
    public MTLMatrixLayout transformationMatrixLayout() {
        try {
            return MTLMatrixLayout.of((long) MH_transformationMatrixLayout.invokeExact(this.handle, SEL_transformationMatrixLayout));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureTriangleGeometryDescriptor setTransformationMatrixLayout:]} */
    public void setTransformationMatrixLayout(final MTLMatrixLayout transformationMatrixLayout) {
        try {
            MH_setTransformationMatrixLayout_.invokeExact(this.handle, SEL_setTransformationMatrixLayout_, transformationMatrixLayout.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
