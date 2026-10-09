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
 * {@code MTL4AccelerationStructureTriangleGeometryDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4accelerationstructuretrianglegeometrydescriptor">Apple documentation</a>
 */
public class MTL4AccelerationStructureTriangleGeometryDescriptor extends MTL4AccelerationStructureGeometryDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4AccelerationStructureTriangleGeometryDescriptor");
    private static final long SEL_vertexBuffer = ObjC.selector("vertexBuffer");
    private static final MethodHandle MH_vertexBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(MTL4BufferRange.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexBuffer_ = ObjC.selector("setVertexBuffer:");
    private static final MethodHandle MH_setVertexBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_vertexFormat = ObjC.selector("vertexFormat");
    private static final MethodHandle MH_vertexFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexFormat_ = ObjC.selector("setVertexFormat:");
    private static final MethodHandle MH_setVertexFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_vertexStride = ObjC.selector("vertexStride");
    private static final MethodHandle MH_vertexStride = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexStride_ = ObjC.selector("setVertexStride:");
    private static final MethodHandle MH_setVertexStride_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indexBuffer = ObjC.selector("indexBuffer");
    private static final MethodHandle MH_indexBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(MTL4BufferRange.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setIndexBuffer_ = ObjC.selector("setIndexBuffer:");
    private static final MethodHandle MH_setIndexBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indexType = ObjC.selector("indexType");
    private static final MethodHandle MH_indexType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setIndexType_ = ObjC.selector("setIndexType:");
    private static final MethodHandle MH_setIndexType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_triangleCount = ObjC.selector("triangleCount");
    private static final MethodHandle MH_triangleCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTriangleCount_ = ObjC.selector("setTriangleCount:");
    private static final MethodHandle MH_setTriangleCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_transformationMatrixBuffer = ObjC.selector("transformationMatrixBuffer");
    private static final MethodHandle MH_transformationMatrixBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(MTL4BufferRange.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTransformationMatrixBuffer_ = ObjC.selector("setTransformationMatrixBuffer:");
    private static final MethodHandle MH_setTransformationMatrixBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_transformationMatrixLayout = ObjC.selector("transformationMatrixLayout");
    private static final MethodHandle MH_transformationMatrixLayout = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTransformationMatrixLayout_ = ObjC.selector("setTransformationMatrixLayout:");
    private static final MethodHandle MH_setTransformationMatrixLayout_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4AccelerationStructureTriangleGeometryDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4AccelerationStructureTriangleGeometryDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4AccelerationStructureTriangleGeometryDescriptor alloc() {
        try {
            return new MTL4AccelerationStructureTriangleGeometryDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureTriangleGeometryDescriptor init]} */
    public MTL4AccelerationStructureTriangleGeometryDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureTriangleGeometryDescriptor vertexBuffer]} */
    public MTL4BufferRange vertexBuffer() {
        try (NativeStack stack = NativeStack.push()) {
            return MTL4BufferRange.read((MemorySegment) MH_vertexBuffer.invokeExact((SegmentAllocator) stack, this.handle, SEL_vertexBuffer));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureTriangleGeometryDescriptor setVertexBuffer:]} */
    public void setVertexBuffer(final MTL4BufferRange vertexBuffer) {
        try {
            MH_setVertexBuffer_.invokeExact(this.handle, SEL_setVertexBuffer_, vertexBuffer.bufferAddress(), vertexBuffer.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureTriangleGeometryDescriptor vertexFormat]} */
    public MTLAttributeFormat vertexFormat() {
        try {
            return MTLAttributeFormat.of((long) MH_vertexFormat.invokeExact(this.handle, SEL_vertexFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureTriangleGeometryDescriptor setVertexFormat:]} */
    public void setVertexFormat(final MTLAttributeFormat vertexFormat) {
        try {
            MH_setVertexFormat_.invokeExact(this.handle, SEL_setVertexFormat_, vertexFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureTriangleGeometryDescriptor vertexStride]} */
    public long vertexStride() {
        try {
            return (long) MH_vertexStride.invokeExact(this.handle, SEL_vertexStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureTriangleGeometryDescriptor setVertexStride:]} */
    public void setVertexStride(final long vertexStride) {
        try {
            MH_setVertexStride_.invokeExact(this.handle, SEL_setVertexStride_, vertexStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureTriangleGeometryDescriptor indexBuffer]} */
    public MTL4BufferRange indexBuffer() {
        try (NativeStack stack = NativeStack.push()) {
            return MTL4BufferRange.read((MemorySegment) MH_indexBuffer.invokeExact((SegmentAllocator) stack, this.handle, SEL_indexBuffer));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureTriangleGeometryDescriptor setIndexBuffer:]} */
    public void setIndexBuffer(final MTL4BufferRange indexBuffer) {
        try {
            MH_setIndexBuffer_.invokeExact(this.handle, SEL_setIndexBuffer_, indexBuffer.bufferAddress(), indexBuffer.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureTriangleGeometryDescriptor indexType]} */
    public MTLIndexType indexType() {
        try {
            return MTLIndexType.of((long) MH_indexType.invokeExact(this.handle, SEL_indexType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureTriangleGeometryDescriptor setIndexType:]} */
    public void setIndexType(final MTLIndexType indexType) {
        try {
            MH_setIndexType_.invokeExact(this.handle, SEL_setIndexType_, indexType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureTriangleGeometryDescriptor triangleCount]} */
    public long triangleCount() {
        try {
            return (long) MH_triangleCount.invokeExact(this.handle, SEL_triangleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureTriangleGeometryDescriptor setTriangleCount:]} */
    public void setTriangleCount(final long triangleCount) {
        try {
            MH_setTriangleCount_.invokeExact(this.handle, SEL_setTriangleCount_, triangleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureTriangleGeometryDescriptor transformationMatrixBuffer]} */
    public MTL4BufferRange transformationMatrixBuffer() {
        try (NativeStack stack = NativeStack.push()) {
            return MTL4BufferRange.read((MemorySegment) MH_transformationMatrixBuffer.invokeExact((SegmentAllocator) stack, this.handle, SEL_transformationMatrixBuffer));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureTriangleGeometryDescriptor setTransformationMatrixBuffer:]} */
    public void setTransformationMatrixBuffer(final MTL4BufferRange transformationMatrixBuffer) {
        try {
            MH_setTransformationMatrixBuffer_.invokeExact(this.handle, SEL_setTransformationMatrixBuffer_, transformationMatrixBuffer.bufferAddress(), transformationMatrixBuffer.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureTriangleGeometryDescriptor transformationMatrixLayout]} */
    public MTLMatrixLayout transformationMatrixLayout() {
        try {
            return MTLMatrixLayout.of((long) MH_transformationMatrixLayout.invokeExact(this.handle, SEL_transformationMatrixLayout));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureTriangleGeometryDescriptor setTransformationMatrixLayout:]} */
    public void setTransformationMatrixLayout(final MTLMatrixLayout transformationMatrixLayout) {
        try {
            MH_setTransformationMatrixLayout_.invokeExact(this.handle, SEL_setTransformationMatrixLayout_, transformationMatrixLayout.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
