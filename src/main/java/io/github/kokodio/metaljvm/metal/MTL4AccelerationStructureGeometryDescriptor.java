package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4AccelerationStructureGeometryDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4accelerationstructuregeometrydescriptor">Apple documentation</a>
 */
public class MTL4AccelerationStructureGeometryDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4AccelerationStructureGeometryDescriptor");
    private static final long SEL_intersectionFunctionTableOffset = ObjC.selector("intersectionFunctionTableOffset");
    private static final MethodHandle MH_intersectionFunctionTableOffset = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setIntersectionFunctionTableOffset_ = ObjC.selector("setIntersectionFunctionTableOffset:");
    private static final MethodHandle MH_setIntersectionFunctionTableOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_opaque = ObjC.selector("opaque");
    private static final MethodHandle MH_opaque = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOpaque_ = ObjC.selector("setOpaque:");
    private static final MethodHandle MH_setOpaque_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_allowDuplicateIntersectionFunctionInvocation = ObjC.selector("allowDuplicateIntersectionFunctionInvocation");
    private static final MethodHandle MH_allowDuplicateIntersectionFunctionInvocation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAllowDuplicateIntersectionFunctionInvocation_ = ObjC.selector("setAllowDuplicateIntersectionFunctionInvocation:");
    private static final MethodHandle MH_setAllowDuplicateIntersectionFunctionInvocation_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_primitiveDataBuffer = ObjC.selector("primitiveDataBuffer");
    private static final MethodHandle MH_primitiveDataBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(MTL4BufferRange.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPrimitiveDataBuffer_ = ObjC.selector("setPrimitiveDataBuffer:");
    private static final MethodHandle MH_setPrimitiveDataBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_primitiveDataStride = ObjC.selector("primitiveDataStride");
    private static final MethodHandle MH_primitiveDataStride = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPrimitiveDataStride_ = ObjC.selector("setPrimitiveDataStride:");
    private static final MethodHandle MH_setPrimitiveDataStride_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_primitiveDataElementSize = ObjC.selector("primitiveDataElementSize");
    private static final MethodHandle MH_primitiveDataElementSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPrimitiveDataElementSize_ = ObjC.selector("setPrimitiveDataElementSize:");
    private static final MethodHandle MH_setPrimitiveDataElementSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4AccelerationStructureGeometryDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4AccelerationStructureGeometryDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4AccelerationStructureGeometryDescriptor alloc() {
        try {
            return new MTL4AccelerationStructureGeometryDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureGeometryDescriptor init]} */
    public MTL4AccelerationStructureGeometryDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureGeometryDescriptor intersectionFunctionTableOffset]} */
    public long intersectionFunctionTableOffset() {
        try {
            return (long) MH_intersectionFunctionTableOffset.invokeExact(this.handle, SEL_intersectionFunctionTableOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureGeometryDescriptor setIntersectionFunctionTableOffset:]} */
    public void setIntersectionFunctionTableOffset(final long intersectionFunctionTableOffset) {
        try {
            MH_setIntersectionFunctionTableOffset_.invokeExact(this.handle, SEL_setIntersectionFunctionTableOffset_, intersectionFunctionTableOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureGeometryDescriptor opaque]} */
    public boolean opaque() {
        try {
            return (boolean) MH_opaque.invokeExact(this.handle, SEL_opaque);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureGeometryDescriptor setOpaque:]} */
    public void setOpaque(final boolean opaque) {
        try {
            MH_setOpaque_.invokeExact(this.handle, SEL_setOpaque_, opaque);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureGeometryDescriptor allowDuplicateIntersectionFunctionInvocation]} */
    public boolean allowDuplicateIntersectionFunctionInvocation() {
        try {
            return (boolean) MH_allowDuplicateIntersectionFunctionInvocation.invokeExact(this.handle, SEL_allowDuplicateIntersectionFunctionInvocation);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureGeometryDescriptor setAllowDuplicateIntersectionFunctionInvocation:]} */
    public void setAllowDuplicateIntersectionFunctionInvocation(final boolean allowDuplicateIntersectionFunctionInvocation) {
        try {
            MH_setAllowDuplicateIntersectionFunctionInvocation_.invokeExact(this.handle, SEL_setAllowDuplicateIntersectionFunctionInvocation_, allowDuplicateIntersectionFunctionInvocation);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureGeometryDescriptor label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureGeometryDescriptor setLabel:]} */
    public void setLabel(@Nullable final String label) {
        final long nsLabel = label == null ? 0L : ObjC.nsString(label);
        try {
            MH_setLabel_.invokeExact(this.handle, SEL_setLabel_, nsLabel);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsLabel);
        }
    }

    /** {@code -[MTL4AccelerationStructureGeometryDescriptor primitiveDataBuffer]} */
    public MTL4BufferRange primitiveDataBuffer() {
        try (NativeStack stack = NativeStack.push()) {
            return MTL4BufferRange.read((MemorySegment) MH_primitiveDataBuffer.invokeExact((SegmentAllocator) stack, this.handle, SEL_primitiveDataBuffer));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureGeometryDescriptor setPrimitiveDataBuffer:]} */
    public void setPrimitiveDataBuffer(final MTL4BufferRange primitiveDataBuffer) {
        try {
            MH_setPrimitiveDataBuffer_.invokeExact(this.handle, SEL_setPrimitiveDataBuffer_, primitiveDataBuffer.bufferAddress(), primitiveDataBuffer.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureGeometryDescriptor primitiveDataStride]} */
    public long primitiveDataStride() {
        try {
            return (long) MH_primitiveDataStride.invokeExact(this.handle, SEL_primitiveDataStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureGeometryDescriptor setPrimitiveDataStride:]} */
    public void setPrimitiveDataStride(final long primitiveDataStride) {
        try {
            MH_setPrimitiveDataStride_.invokeExact(this.handle, SEL_setPrimitiveDataStride_, primitiveDataStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureGeometryDescriptor primitiveDataElementSize]} */
    public long primitiveDataElementSize() {
        try {
            return (long) MH_primitiveDataElementSize.invokeExact(this.handle, SEL_primitiveDataElementSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureGeometryDescriptor setPrimitiveDataElementSize:]} */
    public void setPrimitiveDataElementSize(final long primitiveDataElementSize) {
        try {
            MH_setPrimitiveDataElementSize_.invokeExact(this.handle, SEL_setPrimitiveDataElementSize_, primitiveDataElementSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
