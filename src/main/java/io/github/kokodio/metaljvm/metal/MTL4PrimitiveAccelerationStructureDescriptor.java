package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4PrimitiveAccelerationStructureDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4primitiveaccelerationstructuredescriptor">Apple documentation</a>
 */
public class MTL4PrimitiveAccelerationStructureDescriptor extends MTL4AccelerationStructureDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4PrimitiveAccelerationStructureDescriptor");
    private static final long SEL_geometryDescriptors = ObjC.selector("geometryDescriptors");
    private static final MethodHandle MH_geometryDescriptors = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setGeometryDescriptors_ = ObjC.selector("setGeometryDescriptors:");
    private static final MethodHandle MH_setGeometryDescriptors_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionStartBorderMode = ObjC.selector("motionStartBorderMode");
    private static final MethodHandle MH_motionStartBorderMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionStartBorderMode_ = ObjC.selector("setMotionStartBorderMode:");
    private static final MethodHandle MH_setMotionStartBorderMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_INT));
    private static final long SEL_motionEndBorderMode = ObjC.selector("motionEndBorderMode");
    private static final MethodHandle MH_motionEndBorderMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionEndBorderMode_ = ObjC.selector("setMotionEndBorderMode:");
    private static final MethodHandle MH_setMotionEndBorderMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_INT));
    private static final long SEL_motionStartTime = ObjC.selector("motionStartTime");
    private static final MethodHandle MH_motionStartTime = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionStartTime_ = ObjC.selector("setMotionStartTime:");
    private static final MethodHandle MH_setMotionStartTime_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_motionEndTime = ObjC.selector("motionEndTime");
    private static final MethodHandle MH_motionEndTime = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionEndTime_ = ObjC.selector("setMotionEndTime:");
    private static final MethodHandle MH_setMotionEndTime_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_motionKeyframeCount = ObjC.selector("motionKeyframeCount");
    private static final MethodHandle MH_motionKeyframeCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionKeyframeCount_ = ObjC.selector("setMotionKeyframeCount:");
    private static final MethodHandle MH_setMotionKeyframeCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4PrimitiveAccelerationStructureDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4PrimitiveAccelerationStructureDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4PrimitiveAccelerationStructureDescriptor alloc() {
        try {
            return new MTL4PrimitiveAccelerationStructureDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4PrimitiveAccelerationStructureDescriptor init]} */
    public MTL4PrimitiveAccelerationStructureDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4PrimitiveAccelerationStructureDescriptor geometryDescriptors]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTL4AccelerationStructureGeometryDescriptor> geometryDescriptors() {
        try {
            long result = (long) MH_geometryDescriptors.invokeExact(this.handle, SEL_geometryDescriptors);
            return result == 0L ? null : new NSArray<>(result, MTL4AccelerationStructureGeometryDescriptor::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4PrimitiveAccelerationStructureDescriptor setGeometryDescriptors:]} */
    public void setGeometryDescriptors(@Nullable final NSArray<MTL4AccelerationStructureGeometryDescriptor> geometryDescriptors) {
        try {
            MH_setGeometryDescriptors_.invokeExact(this.handle, SEL_setGeometryDescriptors_, geometryDescriptors == null ? 0L : geometryDescriptors.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4PrimitiveAccelerationStructureDescriptor motionStartBorderMode]} */
    public MTLMotionBorderMode motionStartBorderMode() {
        try {
            return MTLMotionBorderMode.of((int) MH_motionStartBorderMode.invokeExact(this.handle, SEL_motionStartBorderMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4PrimitiveAccelerationStructureDescriptor setMotionStartBorderMode:]} */
    public void setMotionStartBorderMode(final MTLMotionBorderMode motionStartBorderMode) {
        try {
            MH_setMotionStartBorderMode_.invokeExact(this.handle, SEL_setMotionStartBorderMode_, (int) motionStartBorderMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4PrimitiveAccelerationStructureDescriptor motionEndBorderMode]} */
    public MTLMotionBorderMode motionEndBorderMode() {
        try {
            return MTLMotionBorderMode.of((int) MH_motionEndBorderMode.invokeExact(this.handle, SEL_motionEndBorderMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4PrimitiveAccelerationStructureDescriptor setMotionEndBorderMode:]} */
    public void setMotionEndBorderMode(final MTLMotionBorderMode motionEndBorderMode) {
        try {
            MH_setMotionEndBorderMode_.invokeExact(this.handle, SEL_setMotionEndBorderMode_, (int) motionEndBorderMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4PrimitiveAccelerationStructureDescriptor motionStartTime]} */
    public float motionStartTime() {
        try {
            return (float) MH_motionStartTime.invokeExact(this.handle, SEL_motionStartTime);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4PrimitiveAccelerationStructureDescriptor setMotionStartTime:]} */
    public void setMotionStartTime(final float motionStartTime) {
        try {
            MH_setMotionStartTime_.invokeExact(this.handle, SEL_setMotionStartTime_, motionStartTime);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4PrimitiveAccelerationStructureDescriptor motionEndTime]} */
    public float motionEndTime() {
        try {
            return (float) MH_motionEndTime.invokeExact(this.handle, SEL_motionEndTime);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4PrimitiveAccelerationStructureDescriptor setMotionEndTime:]} */
    public void setMotionEndTime(final float motionEndTime) {
        try {
            MH_setMotionEndTime_.invokeExact(this.handle, SEL_setMotionEndTime_, motionEndTime);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4PrimitiveAccelerationStructureDescriptor motionKeyframeCount]} */
    public long motionKeyframeCount() {
        try {
            return (long) MH_motionKeyframeCount.invokeExact(this.handle, SEL_motionKeyframeCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4PrimitiveAccelerationStructureDescriptor setMotionKeyframeCount:]} */
    public void setMotionKeyframeCount(final long motionKeyframeCount) {
        try {
            MH_setMotionKeyframeCount_.invokeExact(this.handle, SEL_setMotionKeyframeCount_, motionKeyframeCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
