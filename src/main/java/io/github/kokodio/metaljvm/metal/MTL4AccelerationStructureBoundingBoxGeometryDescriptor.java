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
 * {@code MTL4AccelerationStructureBoundingBoxGeometryDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4accelerationstructureboundingboxgeometrydescriptor">Apple documentation</a>
 */
public class MTL4AccelerationStructureBoundingBoxGeometryDescriptor extends MTL4AccelerationStructureGeometryDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4AccelerationStructureBoundingBoxGeometryDescriptor");
    private static final long SEL_boundingBoxBuffer = ObjC.selector("boundingBoxBuffer");
    private static final MethodHandle MH_boundingBoxBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(MTL4BufferRange.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBoundingBoxBuffer_ = ObjC.selector("setBoundingBoxBuffer:");
    private static final MethodHandle MH_setBoundingBoxBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
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

    public MTL4AccelerationStructureBoundingBoxGeometryDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4AccelerationStructureBoundingBoxGeometryDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4AccelerationStructureBoundingBoxGeometryDescriptor alloc() {
        try {
            return new MTL4AccelerationStructureBoundingBoxGeometryDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureBoundingBoxGeometryDescriptor init]} */
    public MTL4AccelerationStructureBoundingBoxGeometryDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureBoundingBoxGeometryDescriptor boundingBoxBuffer]} */
    public MTL4BufferRange boundingBoxBuffer() {
        try (NativeStack stack = NativeStack.push()) {
            return MTL4BufferRange.read((MemorySegment) MH_boundingBoxBuffer.invokeExact((SegmentAllocator) stack, this.handle, SEL_boundingBoxBuffer));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureBoundingBoxGeometryDescriptor setBoundingBoxBuffer:]} */
    public void setBoundingBoxBuffer(final MTL4BufferRange boundingBoxBuffer) {
        try {
            MH_setBoundingBoxBuffer_.invokeExact(this.handle, SEL_setBoundingBoxBuffer_, boundingBoxBuffer.bufferAddress(), boundingBoxBuffer.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureBoundingBoxGeometryDescriptor boundingBoxStride]} */
    public long boundingBoxStride() {
        try {
            return (long) MH_boundingBoxStride.invokeExact(this.handle, SEL_boundingBoxStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureBoundingBoxGeometryDescriptor setBoundingBoxStride:]} */
    public void setBoundingBoxStride(final long boundingBoxStride) {
        try {
            MH_setBoundingBoxStride_.invokeExact(this.handle, SEL_setBoundingBoxStride_, boundingBoxStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureBoundingBoxGeometryDescriptor boundingBoxCount]} */
    public long boundingBoxCount() {
        try {
            return (long) MH_boundingBoxCount.invokeExact(this.handle, SEL_boundingBoxCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4AccelerationStructureBoundingBoxGeometryDescriptor setBoundingBoxCount:]} */
    public void setBoundingBoxCount(final long boundingBoxCount) {
        try {
            MH_setBoundingBoxCount_.invokeExact(this.handle, SEL_setBoundingBoxCount_, boundingBoxCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
