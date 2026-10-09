package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlaccelerationstructuremotionboundingboxgeometrydescriptor">Apple documentation</a>
 */
public class MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor extends MTLAccelerationStructureGeometryDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor");
    private static final long SEL_CLASS_descriptor = ObjC.selector("descriptor");
    private static final MethodHandle MH_CLASS_descriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_boundingBoxBuffers = ObjC.selector("boundingBoxBuffers");
    private static final MethodHandle MH_boundingBoxBuffers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBoundingBoxBuffers_ = ObjC.selector("setBoundingBoxBuffers:");
    private static final MethodHandle MH_setBoundingBoxBuffers_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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

    public MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor alloc() {
        try {
            return new MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor init]} */
    public MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor descriptor]} */
    public static MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor descriptor() {
        try {
            long result = (long) MH_CLASS_descriptor.invokeExact(CLS, SEL_CLASS_descriptor);
            return new MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor boundingBoxBuffers]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLMotionKeyframeData> boundingBoxBuffers() {
        try {
            long result = (long) MH_boundingBoxBuffers.invokeExact(this.handle, SEL_boundingBoxBuffers);
            return new NSArray<>(result, MTLMotionKeyframeData::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor setBoundingBoxBuffers:]} */
    public void setBoundingBoxBuffers(final NSArray<MTLMotionKeyframeData> boundingBoxBuffers) {
        try {
            MH_setBoundingBoxBuffers_.invokeExact(this.handle, SEL_setBoundingBoxBuffers_, boundingBoxBuffers.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor boundingBoxStride]} */
    public long boundingBoxStride() {
        try {
            return (long) MH_boundingBoxStride.invokeExact(this.handle, SEL_boundingBoxStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor setBoundingBoxStride:]} */
    public void setBoundingBoxStride(final long boundingBoxStride) {
        try {
            MH_setBoundingBoxStride_.invokeExact(this.handle, SEL_setBoundingBoxStride_, boundingBoxStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor boundingBoxCount]} */
    public long boundingBoxCount() {
        try {
            return (long) MH_boundingBoxCount.invokeExact(this.handle, SEL_boundingBoxCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor setBoundingBoxCount:]} */
    public void setBoundingBoxCount(final long boundingBoxCount) {
        try {
            MH_setBoundingBoxCount_.invokeExact(this.handle, SEL_setBoundingBoxCount_, boundingBoxCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
