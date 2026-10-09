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
 * {@code MTLPrimitiveAccelerationStructureDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlprimitiveaccelerationstructuredescriptor">Apple documentation</a>
 */
public class MTLPrimitiveAccelerationStructureDescriptor extends MTLAccelerationStructureDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLPrimitiveAccelerationStructureDescriptor");
    private static final long SEL_CLASS_descriptor = ObjC.selector("descriptor");
    private static final MethodHandle MH_CLASS_descriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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

    public MTLPrimitiveAccelerationStructureDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLPrimitiveAccelerationStructureDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLPrimitiveAccelerationStructureDescriptor alloc() {
        try {
            return new MTLPrimitiveAccelerationStructureDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLPrimitiveAccelerationStructureDescriptor init]} */
    public MTLPrimitiveAccelerationStructureDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLPrimitiveAccelerationStructureDescriptor descriptor]} */
    public static MTLPrimitiveAccelerationStructureDescriptor descriptor() {
        try {
            long result = (long) MH_CLASS_descriptor.invokeExact(CLS, SEL_CLASS_descriptor);
            return new MTLPrimitiveAccelerationStructureDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLPrimitiveAccelerationStructureDescriptor geometryDescriptors]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTLAccelerationStructureGeometryDescriptor> geometryDescriptors() {
        try {
            long result = (long) MH_geometryDescriptors.invokeExact(this.handle, SEL_geometryDescriptors);
            return result == 0L ? null : new NSArray<>(result, MTLAccelerationStructureGeometryDescriptor::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLPrimitiveAccelerationStructureDescriptor setGeometryDescriptors:]} */
    public void setGeometryDescriptors(@Nullable final NSArray<MTLAccelerationStructureGeometryDescriptor> geometryDescriptors) {
        try {
            MH_setGeometryDescriptors_.invokeExact(this.handle, SEL_setGeometryDescriptors_, geometryDescriptors == null ? 0L : geometryDescriptors.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLPrimitiveAccelerationStructureDescriptor motionStartBorderMode]} */
    public MTLMotionBorderMode motionStartBorderMode() {
        try {
            return MTLMotionBorderMode.of((int) MH_motionStartBorderMode.invokeExact(this.handle, SEL_motionStartBorderMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLPrimitiveAccelerationStructureDescriptor setMotionStartBorderMode:]} */
    public void setMotionStartBorderMode(final MTLMotionBorderMode motionStartBorderMode) {
        try {
            MH_setMotionStartBorderMode_.invokeExact(this.handle, SEL_setMotionStartBorderMode_, (int) motionStartBorderMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLPrimitiveAccelerationStructureDescriptor motionEndBorderMode]} */
    public MTLMotionBorderMode motionEndBorderMode() {
        try {
            return MTLMotionBorderMode.of((int) MH_motionEndBorderMode.invokeExact(this.handle, SEL_motionEndBorderMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLPrimitiveAccelerationStructureDescriptor setMotionEndBorderMode:]} */
    public void setMotionEndBorderMode(final MTLMotionBorderMode motionEndBorderMode) {
        try {
            MH_setMotionEndBorderMode_.invokeExact(this.handle, SEL_setMotionEndBorderMode_, (int) motionEndBorderMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLPrimitiveAccelerationStructureDescriptor motionStartTime]} */
    public float motionStartTime() {
        try {
            return (float) MH_motionStartTime.invokeExact(this.handle, SEL_motionStartTime);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLPrimitiveAccelerationStructureDescriptor setMotionStartTime:]} */
    public void setMotionStartTime(final float motionStartTime) {
        try {
            MH_setMotionStartTime_.invokeExact(this.handle, SEL_setMotionStartTime_, motionStartTime);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLPrimitiveAccelerationStructureDescriptor motionEndTime]} */
    public float motionEndTime() {
        try {
            return (float) MH_motionEndTime.invokeExact(this.handle, SEL_motionEndTime);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLPrimitiveAccelerationStructureDescriptor setMotionEndTime:]} */
    public void setMotionEndTime(final float motionEndTime) {
        try {
            MH_setMotionEndTime_.invokeExact(this.handle, SEL_setMotionEndTime_, motionEndTime);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLPrimitiveAccelerationStructureDescriptor motionKeyframeCount]} */
    public long motionKeyframeCount() {
        try {
            return (long) MH_motionKeyframeCount.invokeExact(this.handle, SEL_motionKeyframeCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLPrimitiveAccelerationStructureDescriptor setMotionKeyframeCount:]} */
    public void setMotionKeyframeCount(final long motionKeyframeCount) {
        try {
            MH_setMotionKeyframeCount_.invokeExact(this.handle, SEL_setMotionKeyframeCount_, motionKeyframeCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
