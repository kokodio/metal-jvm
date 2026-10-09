package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLAccelerationStructureGeometryDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlaccelerationstructuregeometrydescriptor">Apple documentation</a>
 */
public class MTLAccelerationStructureGeometryDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLAccelerationStructureGeometryDescriptor");
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
    private static final MethodHandle MH_primitiveDataBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPrimitiveDataBuffer_ = ObjC.selector("setPrimitiveDataBuffer:");
    private static final MethodHandle MH_setPrimitiveDataBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_primitiveDataBufferOffset = ObjC.selector("primitiveDataBufferOffset");
    private static final MethodHandle MH_primitiveDataBufferOffset = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPrimitiveDataBufferOffset_ = ObjC.selector("setPrimitiveDataBufferOffset:");
    private static final MethodHandle MH_setPrimitiveDataBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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

    public MTLAccelerationStructureGeometryDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLAccelerationStructureGeometryDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLAccelerationStructureGeometryDescriptor alloc() {
        try {
            return new MTLAccelerationStructureGeometryDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureGeometryDescriptor init]} */
    public MTLAccelerationStructureGeometryDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureGeometryDescriptor intersectionFunctionTableOffset]} */
    public long intersectionFunctionTableOffset() {
        try {
            return (long) MH_intersectionFunctionTableOffset.invokeExact(this.handle, SEL_intersectionFunctionTableOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureGeometryDescriptor setIntersectionFunctionTableOffset:]} */
    public void setIntersectionFunctionTableOffset(final long intersectionFunctionTableOffset) {
        try {
            MH_setIntersectionFunctionTableOffset_.invokeExact(this.handle, SEL_setIntersectionFunctionTableOffset_, intersectionFunctionTableOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureGeometryDescriptor opaque]} */
    public boolean opaque() {
        try {
            return (boolean) MH_opaque.invokeExact(this.handle, SEL_opaque);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureGeometryDescriptor setOpaque:]} */
    public void setOpaque(final boolean opaque) {
        try {
            MH_setOpaque_.invokeExact(this.handle, SEL_setOpaque_, opaque);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureGeometryDescriptor allowDuplicateIntersectionFunctionInvocation]} */
    public boolean allowDuplicateIntersectionFunctionInvocation() {
        try {
            return (boolean) MH_allowDuplicateIntersectionFunctionInvocation.invokeExact(this.handle, SEL_allowDuplicateIntersectionFunctionInvocation);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureGeometryDescriptor setAllowDuplicateIntersectionFunctionInvocation:]} */
    public void setAllowDuplicateIntersectionFunctionInvocation(final boolean allowDuplicateIntersectionFunctionInvocation) {
        try {
            MH_setAllowDuplicateIntersectionFunctionInvocation_.invokeExact(this.handle, SEL_setAllowDuplicateIntersectionFunctionInvocation_, allowDuplicateIntersectionFunctionInvocation);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureGeometryDescriptor label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureGeometryDescriptor setLabel:]} */
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

    /**
     * {@code -[MTLAccelerationStructureGeometryDescriptor primitiveDataBuffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLBuffer primitiveDataBuffer() {
        try {
            long result = (long) MH_primitiveDataBuffer.invokeExact(this.handle, SEL_primitiveDataBuffer);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureGeometryDescriptor setPrimitiveDataBuffer:]} */
    public void setPrimitiveDataBuffer(@Nullable final MTLBuffer primitiveDataBuffer) {
        try {
            MH_setPrimitiveDataBuffer_.invokeExact(this.handle, SEL_setPrimitiveDataBuffer_, primitiveDataBuffer == null ? 0L : primitiveDataBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureGeometryDescriptor primitiveDataBufferOffset]} */
    public long primitiveDataBufferOffset() {
        try {
            return (long) MH_primitiveDataBufferOffset.invokeExact(this.handle, SEL_primitiveDataBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureGeometryDescriptor setPrimitiveDataBufferOffset:]} */
    public void setPrimitiveDataBufferOffset(final long primitiveDataBufferOffset) {
        try {
            MH_setPrimitiveDataBufferOffset_.invokeExact(this.handle, SEL_setPrimitiveDataBufferOffset_, primitiveDataBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureGeometryDescriptor primitiveDataStride]} */
    public long primitiveDataStride() {
        try {
            return (long) MH_primitiveDataStride.invokeExact(this.handle, SEL_primitiveDataStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureGeometryDescriptor setPrimitiveDataStride:]} */
    public void setPrimitiveDataStride(final long primitiveDataStride) {
        try {
            MH_setPrimitiveDataStride_.invokeExact(this.handle, SEL_setPrimitiveDataStride_, primitiveDataStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureGeometryDescriptor primitiveDataElementSize]} */
    public long primitiveDataElementSize() {
        try {
            return (long) MH_primitiveDataElementSize.invokeExact(this.handle, SEL_primitiveDataElementSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureGeometryDescriptor setPrimitiveDataElementSize:]} */
    public void setPrimitiveDataElementSize(final long primitiveDataElementSize) {
        try {
            MH_setPrimitiveDataElementSize_.invokeExact(this.handle, SEL_setPrimitiveDataElementSize_, primitiveDataElementSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
