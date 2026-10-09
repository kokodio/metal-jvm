package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLAccelerationStructureBoundingBoxGeometryDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlaccelerationstructureboundingboxgeometrydescriptor">Apple documentation</a>
 */
public class MTLAccelerationStructureBoundingBoxGeometryDescriptor extends MTLAccelerationStructureGeometryDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLAccelerationStructureBoundingBoxGeometryDescriptor");
    private static final long SEL_CLASS_descriptor = ObjC.selector("descriptor");
    private static final MethodHandle MH_CLASS_descriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_boundingBoxBuffer = ObjC.selector("boundingBoxBuffer");
    private static final MethodHandle MH_boundingBoxBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBoundingBoxBuffer_ = ObjC.selector("setBoundingBoxBuffer:");
    private static final MethodHandle MH_setBoundingBoxBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_boundingBoxBufferOffset = ObjC.selector("boundingBoxBufferOffset");
    private static final MethodHandle MH_boundingBoxBufferOffset = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBoundingBoxBufferOffset_ = ObjC.selector("setBoundingBoxBufferOffset:");
    private static final MethodHandle MH_setBoundingBoxBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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

    public MTLAccelerationStructureBoundingBoxGeometryDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLAccelerationStructureBoundingBoxGeometryDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLAccelerationStructureBoundingBoxGeometryDescriptor alloc() {
        try {
            return new MTLAccelerationStructureBoundingBoxGeometryDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureBoundingBoxGeometryDescriptor init]} */
    public MTLAccelerationStructureBoundingBoxGeometryDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLAccelerationStructureBoundingBoxGeometryDescriptor descriptor]} */
    public static MTLAccelerationStructureBoundingBoxGeometryDescriptor descriptor() {
        try {
            long result = (long) MH_CLASS_descriptor.invokeExact(CLS, SEL_CLASS_descriptor);
            return new MTLAccelerationStructureBoundingBoxGeometryDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLAccelerationStructureBoundingBoxGeometryDescriptor boundingBoxBuffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLBuffer boundingBoxBuffer() {
        try {
            long result = (long) MH_boundingBoxBuffer.invokeExact(this.handle, SEL_boundingBoxBuffer);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureBoundingBoxGeometryDescriptor setBoundingBoxBuffer:]} */
    public void setBoundingBoxBuffer(@Nullable final MTLBuffer boundingBoxBuffer) {
        try {
            MH_setBoundingBoxBuffer_.invokeExact(this.handle, SEL_setBoundingBoxBuffer_, boundingBoxBuffer == null ? 0L : boundingBoxBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureBoundingBoxGeometryDescriptor boundingBoxBufferOffset]} */
    public long boundingBoxBufferOffset() {
        try {
            return (long) MH_boundingBoxBufferOffset.invokeExact(this.handle, SEL_boundingBoxBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureBoundingBoxGeometryDescriptor setBoundingBoxBufferOffset:]} */
    public void setBoundingBoxBufferOffset(final long boundingBoxBufferOffset) {
        try {
            MH_setBoundingBoxBufferOffset_.invokeExact(this.handle, SEL_setBoundingBoxBufferOffset_, boundingBoxBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureBoundingBoxGeometryDescriptor boundingBoxStride]} */
    public long boundingBoxStride() {
        try {
            return (long) MH_boundingBoxStride.invokeExact(this.handle, SEL_boundingBoxStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureBoundingBoxGeometryDescriptor setBoundingBoxStride:]} */
    public void setBoundingBoxStride(final long boundingBoxStride) {
        try {
            MH_setBoundingBoxStride_.invokeExact(this.handle, SEL_setBoundingBoxStride_, boundingBoxStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureBoundingBoxGeometryDescriptor boundingBoxCount]} */
    public long boundingBoxCount() {
        try {
            return (long) MH_boundingBoxCount.invokeExact(this.handle, SEL_boundingBoxCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureBoundingBoxGeometryDescriptor setBoundingBoxCount:]} */
    public void setBoundingBoxCount(final long boundingBoxCount) {
        try {
            MH_setBoundingBoxCount_.invokeExact(this.handle, SEL_setBoundingBoxCount_, boundingBoxCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
