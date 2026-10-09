package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLInstanceAccelerationStructureDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlinstanceaccelerationstructuredescriptor">Apple documentation</a>
 */
public class MTLInstanceAccelerationStructureDescriptor extends MTLAccelerationStructureDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLInstanceAccelerationStructureDescriptor");
    private static final long SEL_CLASS_descriptor = ObjC.selector("descriptor");
    private static final MethodHandle MH_CLASS_descriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_instanceDescriptorBuffer = ObjC.selector("instanceDescriptorBuffer");
    private static final MethodHandle MH_instanceDescriptorBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInstanceDescriptorBuffer_ = ObjC.selector("setInstanceDescriptorBuffer:");
    private static final MethodHandle MH_setInstanceDescriptorBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_instanceDescriptorBufferOffset = ObjC.selector("instanceDescriptorBufferOffset");
    private static final MethodHandle MH_instanceDescriptorBufferOffset = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInstanceDescriptorBufferOffset_ = ObjC.selector("setInstanceDescriptorBufferOffset:");
    private static final MethodHandle MH_setInstanceDescriptorBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_instanceDescriptorStride = ObjC.selector("instanceDescriptorStride");
    private static final MethodHandle MH_instanceDescriptorStride = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInstanceDescriptorStride_ = ObjC.selector("setInstanceDescriptorStride:");
    private static final MethodHandle MH_setInstanceDescriptorStride_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_instanceCount = ObjC.selector("instanceCount");
    private static final MethodHandle MH_instanceCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInstanceCount_ = ObjC.selector("setInstanceCount:");
    private static final MethodHandle MH_setInstanceCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_instancedAccelerationStructures = ObjC.selector("instancedAccelerationStructures");
    private static final MethodHandle MH_instancedAccelerationStructures = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInstancedAccelerationStructures_ = ObjC.selector("setInstancedAccelerationStructures:");
    private static final MethodHandle MH_setInstancedAccelerationStructures_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_instanceDescriptorType = ObjC.selector("instanceDescriptorType");
    private static final MethodHandle MH_instanceDescriptorType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInstanceDescriptorType_ = ObjC.selector("setInstanceDescriptorType:");
    private static final MethodHandle MH_setInstanceDescriptorType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionTransformBuffer = ObjC.selector("motionTransformBuffer");
    private static final MethodHandle MH_motionTransformBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionTransformBuffer_ = ObjC.selector("setMotionTransformBuffer:");
    private static final MethodHandle MH_setMotionTransformBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionTransformBufferOffset = ObjC.selector("motionTransformBufferOffset");
    private static final MethodHandle MH_motionTransformBufferOffset = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionTransformBufferOffset_ = ObjC.selector("setMotionTransformBufferOffset:");
    private static final MethodHandle MH_setMotionTransformBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionTransformCount = ObjC.selector("motionTransformCount");
    private static final MethodHandle MH_motionTransformCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionTransformCount_ = ObjC.selector("setMotionTransformCount:");
    private static final MethodHandle MH_setMotionTransformCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_instanceTransformationMatrixLayout = ObjC.selector("instanceTransformationMatrixLayout");
    private static final MethodHandle MH_instanceTransformationMatrixLayout = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInstanceTransformationMatrixLayout_ = ObjC.selector("setInstanceTransformationMatrixLayout:");
    private static final MethodHandle MH_setInstanceTransformationMatrixLayout_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionTransformType = ObjC.selector("motionTransformType");
    private static final MethodHandle MH_motionTransformType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionTransformType_ = ObjC.selector("setMotionTransformType:");
    private static final MethodHandle MH_setMotionTransformType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionTransformStride = ObjC.selector("motionTransformStride");
    private static final MethodHandle MH_motionTransformStride = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionTransformStride_ = ObjC.selector("setMotionTransformStride:");
    private static final MethodHandle MH_setMotionTransformStride_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLInstanceAccelerationStructureDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLInstanceAccelerationStructureDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLInstanceAccelerationStructureDescriptor alloc() {
        try {
            return new MTLInstanceAccelerationStructureDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor init]} */
    public MTLInstanceAccelerationStructureDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLInstanceAccelerationStructureDescriptor descriptor]} */
    public static MTLInstanceAccelerationStructureDescriptor descriptor() {
        try {
            long result = (long) MH_CLASS_descriptor.invokeExact(CLS, SEL_CLASS_descriptor);
            return new MTLInstanceAccelerationStructureDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLInstanceAccelerationStructureDescriptor instanceDescriptorBuffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLBuffer instanceDescriptorBuffer() {
        try {
            long result = (long) MH_instanceDescriptorBuffer.invokeExact(this.handle, SEL_instanceDescriptorBuffer);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor setInstanceDescriptorBuffer:]} */
    public void setInstanceDescriptorBuffer(@Nullable final MTLBuffer instanceDescriptorBuffer) {
        try {
            MH_setInstanceDescriptorBuffer_.invokeExact(this.handle, SEL_setInstanceDescriptorBuffer_, instanceDescriptorBuffer == null ? 0L : instanceDescriptorBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor instanceDescriptorBufferOffset]} */
    public long instanceDescriptorBufferOffset() {
        try {
            return (long) MH_instanceDescriptorBufferOffset.invokeExact(this.handle, SEL_instanceDescriptorBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor setInstanceDescriptorBufferOffset:]} */
    public void setInstanceDescriptorBufferOffset(final long instanceDescriptorBufferOffset) {
        try {
            MH_setInstanceDescriptorBufferOffset_.invokeExact(this.handle, SEL_setInstanceDescriptorBufferOffset_, instanceDescriptorBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor instanceDescriptorStride]} */
    public long instanceDescriptorStride() {
        try {
            return (long) MH_instanceDescriptorStride.invokeExact(this.handle, SEL_instanceDescriptorStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor setInstanceDescriptorStride:]} */
    public void setInstanceDescriptorStride(final long instanceDescriptorStride) {
        try {
            MH_setInstanceDescriptorStride_.invokeExact(this.handle, SEL_setInstanceDescriptorStride_, instanceDescriptorStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor instanceCount]} */
    public long instanceCount() {
        try {
            return (long) MH_instanceCount.invokeExact(this.handle, SEL_instanceCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor setInstanceCount:]} */
    public void setInstanceCount(final long instanceCount) {
        try {
            MH_setInstanceCount_.invokeExact(this.handle, SEL_setInstanceCount_, instanceCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLInstanceAccelerationStructureDescriptor instancedAccelerationStructures]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTLAccelerationStructure> instancedAccelerationStructures() {
        try {
            long result = (long) MH_instancedAccelerationStructures.invokeExact(this.handle, SEL_instancedAccelerationStructures);
            return result == 0L ? null : new NSArray<>(result, MTLAccelerationStructure::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor setInstancedAccelerationStructures:]} */
    public void setInstancedAccelerationStructures(@Nullable final NSArray<MTLAccelerationStructure> instancedAccelerationStructures) {
        try {
            MH_setInstancedAccelerationStructures_.invokeExact(this.handle, SEL_setInstancedAccelerationStructures_, instancedAccelerationStructures == null ? 0L : instancedAccelerationStructures.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor instanceDescriptorType]} */
    public MTLAccelerationStructureInstanceDescriptorType instanceDescriptorType() {
        try {
            return MTLAccelerationStructureInstanceDescriptorType.of((long) MH_instanceDescriptorType.invokeExact(this.handle, SEL_instanceDescriptorType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor setInstanceDescriptorType:]} */
    public void setInstanceDescriptorType(final MTLAccelerationStructureInstanceDescriptorType instanceDescriptorType) {
        try {
            MH_setInstanceDescriptorType_.invokeExact(this.handle, SEL_setInstanceDescriptorType_, instanceDescriptorType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLInstanceAccelerationStructureDescriptor motionTransformBuffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLBuffer motionTransformBuffer() {
        try {
            long result = (long) MH_motionTransformBuffer.invokeExact(this.handle, SEL_motionTransformBuffer);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor setMotionTransformBuffer:]} */
    public void setMotionTransformBuffer(@Nullable final MTLBuffer motionTransformBuffer) {
        try {
            MH_setMotionTransformBuffer_.invokeExact(this.handle, SEL_setMotionTransformBuffer_, motionTransformBuffer == null ? 0L : motionTransformBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor motionTransformBufferOffset]} */
    public long motionTransformBufferOffset() {
        try {
            return (long) MH_motionTransformBufferOffset.invokeExact(this.handle, SEL_motionTransformBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor setMotionTransformBufferOffset:]} */
    public void setMotionTransformBufferOffset(final long motionTransformBufferOffset) {
        try {
            MH_setMotionTransformBufferOffset_.invokeExact(this.handle, SEL_setMotionTransformBufferOffset_, motionTransformBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor motionTransformCount]} */
    public long motionTransformCount() {
        try {
            return (long) MH_motionTransformCount.invokeExact(this.handle, SEL_motionTransformCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor setMotionTransformCount:]} */
    public void setMotionTransformCount(final long motionTransformCount) {
        try {
            MH_setMotionTransformCount_.invokeExact(this.handle, SEL_setMotionTransformCount_, motionTransformCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor instanceTransformationMatrixLayout]} */
    public MTLMatrixLayout instanceTransformationMatrixLayout() {
        try {
            return MTLMatrixLayout.of((long) MH_instanceTransformationMatrixLayout.invokeExact(this.handle, SEL_instanceTransformationMatrixLayout));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor setInstanceTransformationMatrixLayout:]} */
    public void setInstanceTransformationMatrixLayout(final MTLMatrixLayout instanceTransformationMatrixLayout) {
        try {
            MH_setInstanceTransformationMatrixLayout_.invokeExact(this.handle, SEL_setInstanceTransformationMatrixLayout_, instanceTransformationMatrixLayout.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor motionTransformType]} */
    public MTLTransformType motionTransformType() {
        try {
            return MTLTransformType.of((long) MH_motionTransformType.invokeExact(this.handle, SEL_motionTransformType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor setMotionTransformType:]} */
    public void setMotionTransformType(final MTLTransformType motionTransformType) {
        try {
            MH_setMotionTransformType_.invokeExact(this.handle, SEL_setMotionTransformType_, motionTransformType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor motionTransformStride]} */
    public long motionTransformStride() {
        try {
            return (long) MH_motionTransformStride.invokeExact(this.handle, SEL_motionTransformStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLInstanceAccelerationStructureDescriptor setMotionTransformStride:]} */
    public void setMotionTransformStride(final long motionTransformStride) {
        try {
            MH_setMotionTransformStride_.invokeExact(this.handle, SEL_setMotionTransformStride_, motionTransformStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
