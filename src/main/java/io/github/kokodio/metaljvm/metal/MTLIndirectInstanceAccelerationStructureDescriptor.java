package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLIndirectInstanceAccelerationStructureDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlindirectinstanceaccelerationstructuredescriptor">Apple documentation</a>
 */
public class MTLIndirectInstanceAccelerationStructureDescriptor extends MTLAccelerationStructureDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLIndirectInstanceAccelerationStructureDescriptor");
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
    private static final long SEL_maxInstanceCount = ObjC.selector("maxInstanceCount");
    private static final MethodHandle MH_maxInstanceCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxInstanceCount_ = ObjC.selector("setMaxInstanceCount:");
    private static final MethodHandle MH_setMaxInstanceCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_instanceCountBuffer = ObjC.selector("instanceCountBuffer");
    private static final MethodHandle MH_instanceCountBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInstanceCountBuffer_ = ObjC.selector("setInstanceCountBuffer:");
    private static final MethodHandle MH_setInstanceCountBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_instanceCountBufferOffset = ObjC.selector("instanceCountBufferOffset");
    private static final MethodHandle MH_instanceCountBufferOffset = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInstanceCountBufferOffset_ = ObjC.selector("setInstanceCountBufferOffset:");
    private static final MethodHandle MH_setInstanceCountBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final long SEL_maxMotionTransformCount = ObjC.selector("maxMotionTransformCount");
    private static final MethodHandle MH_maxMotionTransformCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxMotionTransformCount_ = ObjC.selector("setMaxMotionTransformCount:");
    private static final MethodHandle MH_setMaxMotionTransformCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionTransformCountBuffer = ObjC.selector("motionTransformCountBuffer");
    private static final MethodHandle MH_motionTransformCountBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionTransformCountBuffer_ = ObjC.selector("setMotionTransformCountBuffer:");
    private static final MethodHandle MH_setMotionTransformCountBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionTransformCountBufferOffset = ObjC.selector("motionTransformCountBufferOffset");
    private static final MethodHandle MH_motionTransformCountBufferOffset = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionTransformCountBufferOffset_ = ObjC.selector("setMotionTransformCountBufferOffset:");
    private static final MethodHandle MH_setMotionTransformCountBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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

    public MTLIndirectInstanceAccelerationStructureDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLIndirectInstanceAccelerationStructureDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLIndirectInstanceAccelerationStructureDescriptor alloc() {
        try {
            return new MTLIndirectInstanceAccelerationStructureDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor init]} */
    public MTLIndirectInstanceAccelerationStructureDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLIndirectInstanceAccelerationStructureDescriptor descriptor]} */
    public static MTLIndirectInstanceAccelerationStructureDescriptor descriptor() {
        try {
            long result = (long) MH_CLASS_descriptor.invokeExact(CLS, SEL_CLASS_descriptor);
            return new MTLIndirectInstanceAccelerationStructureDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLIndirectInstanceAccelerationStructureDescriptor instanceDescriptorBuffer]}
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

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor setInstanceDescriptorBuffer:]} */
    public void setInstanceDescriptorBuffer(@Nullable final MTLBuffer instanceDescriptorBuffer) {
        try {
            MH_setInstanceDescriptorBuffer_.invokeExact(this.handle, SEL_setInstanceDescriptorBuffer_, instanceDescriptorBuffer == null ? 0L : instanceDescriptorBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor instanceDescriptorBufferOffset]} */
    public long instanceDescriptorBufferOffset() {
        try {
            return (long) MH_instanceDescriptorBufferOffset.invokeExact(this.handle, SEL_instanceDescriptorBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor setInstanceDescriptorBufferOffset:]} */
    public void setInstanceDescriptorBufferOffset(final long instanceDescriptorBufferOffset) {
        try {
            MH_setInstanceDescriptorBufferOffset_.invokeExact(this.handle, SEL_setInstanceDescriptorBufferOffset_, instanceDescriptorBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor instanceDescriptorStride]} */
    public long instanceDescriptorStride() {
        try {
            return (long) MH_instanceDescriptorStride.invokeExact(this.handle, SEL_instanceDescriptorStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor setInstanceDescriptorStride:]} */
    public void setInstanceDescriptorStride(final long instanceDescriptorStride) {
        try {
            MH_setInstanceDescriptorStride_.invokeExact(this.handle, SEL_setInstanceDescriptorStride_, instanceDescriptorStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor maxInstanceCount]} */
    public long maxInstanceCount() {
        try {
            return (long) MH_maxInstanceCount.invokeExact(this.handle, SEL_maxInstanceCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor setMaxInstanceCount:]} */
    public void setMaxInstanceCount(final long maxInstanceCount) {
        try {
            MH_setMaxInstanceCount_.invokeExact(this.handle, SEL_setMaxInstanceCount_, maxInstanceCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLIndirectInstanceAccelerationStructureDescriptor instanceCountBuffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLBuffer instanceCountBuffer() {
        try {
            long result = (long) MH_instanceCountBuffer.invokeExact(this.handle, SEL_instanceCountBuffer);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor setInstanceCountBuffer:]} */
    public void setInstanceCountBuffer(@Nullable final MTLBuffer instanceCountBuffer) {
        try {
            MH_setInstanceCountBuffer_.invokeExact(this.handle, SEL_setInstanceCountBuffer_, instanceCountBuffer == null ? 0L : instanceCountBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor instanceCountBufferOffset]} */
    public long instanceCountBufferOffset() {
        try {
            return (long) MH_instanceCountBufferOffset.invokeExact(this.handle, SEL_instanceCountBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor setInstanceCountBufferOffset:]} */
    public void setInstanceCountBufferOffset(final long instanceCountBufferOffset) {
        try {
            MH_setInstanceCountBufferOffset_.invokeExact(this.handle, SEL_setInstanceCountBufferOffset_, instanceCountBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor instanceDescriptorType]} */
    public MTLAccelerationStructureInstanceDescriptorType instanceDescriptorType() {
        try {
            return MTLAccelerationStructureInstanceDescriptorType.of((long) MH_instanceDescriptorType.invokeExact(this.handle, SEL_instanceDescriptorType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor setInstanceDescriptorType:]} */
    public void setInstanceDescriptorType(final MTLAccelerationStructureInstanceDescriptorType instanceDescriptorType) {
        try {
            MH_setInstanceDescriptorType_.invokeExact(this.handle, SEL_setInstanceDescriptorType_, instanceDescriptorType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLIndirectInstanceAccelerationStructureDescriptor motionTransformBuffer]}
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

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor setMotionTransformBuffer:]} */
    public void setMotionTransformBuffer(@Nullable final MTLBuffer motionTransformBuffer) {
        try {
            MH_setMotionTransformBuffer_.invokeExact(this.handle, SEL_setMotionTransformBuffer_, motionTransformBuffer == null ? 0L : motionTransformBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor motionTransformBufferOffset]} */
    public long motionTransformBufferOffset() {
        try {
            return (long) MH_motionTransformBufferOffset.invokeExact(this.handle, SEL_motionTransformBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor setMotionTransformBufferOffset:]} */
    public void setMotionTransformBufferOffset(final long motionTransformBufferOffset) {
        try {
            MH_setMotionTransformBufferOffset_.invokeExact(this.handle, SEL_setMotionTransformBufferOffset_, motionTransformBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor maxMotionTransformCount]} */
    public long maxMotionTransformCount() {
        try {
            return (long) MH_maxMotionTransformCount.invokeExact(this.handle, SEL_maxMotionTransformCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor setMaxMotionTransformCount:]} */
    public void setMaxMotionTransformCount(final long maxMotionTransformCount) {
        try {
            MH_setMaxMotionTransformCount_.invokeExact(this.handle, SEL_setMaxMotionTransformCount_, maxMotionTransformCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLIndirectInstanceAccelerationStructureDescriptor motionTransformCountBuffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLBuffer motionTransformCountBuffer() {
        try {
            long result = (long) MH_motionTransformCountBuffer.invokeExact(this.handle, SEL_motionTransformCountBuffer);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor setMotionTransformCountBuffer:]} */
    public void setMotionTransformCountBuffer(@Nullable final MTLBuffer motionTransformCountBuffer) {
        try {
            MH_setMotionTransformCountBuffer_.invokeExact(this.handle, SEL_setMotionTransformCountBuffer_, motionTransformCountBuffer == null ? 0L : motionTransformCountBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor motionTransformCountBufferOffset]} */
    public long motionTransformCountBufferOffset() {
        try {
            return (long) MH_motionTransformCountBufferOffset.invokeExact(this.handle, SEL_motionTransformCountBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor setMotionTransformCountBufferOffset:]} */
    public void setMotionTransformCountBufferOffset(final long motionTransformCountBufferOffset) {
        try {
            MH_setMotionTransformCountBufferOffset_.invokeExact(this.handle, SEL_setMotionTransformCountBufferOffset_, motionTransformCountBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor instanceTransformationMatrixLayout]} */
    public MTLMatrixLayout instanceTransformationMatrixLayout() {
        try {
            return MTLMatrixLayout.of((long) MH_instanceTransformationMatrixLayout.invokeExact(this.handle, SEL_instanceTransformationMatrixLayout));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor setInstanceTransformationMatrixLayout:]} */
    public void setInstanceTransformationMatrixLayout(final MTLMatrixLayout instanceTransformationMatrixLayout) {
        try {
            MH_setInstanceTransformationMatrixLayout_.invokeExact(this.handle, SEL_setInstanceTransformationMatrixLayout_, instanceTransformationMatrixLayout.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor motionTransformType]} */
    public MTLTransformType motionTransformType() {
        try {
            return MTLTransformType.of((long) MH_motionTransformType.invokeExact(this.handle, SEL_motionTransformType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor setMotionTransformType:]} */
    public void setMotionTransformType(final MTLTransformType motionTransformType) {
        try {
            MH_setMotionTransformType_.invokeExact(this.handle, SEL_setMotionTransformType_, motionTransformType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor motionTransformStride]} */
    public long motionTransformStride() {
        try {
            return (long) MH_motionTransformStride.invokeExact(this.handle, SEL_motionTransformStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectInstanceAccelerationStructureDescriptor setMotionTransformStride:]} */
    public void setMotionTransformStride(final long motionTransformStride) {
        try {
            MH_setMotionTransformStride_.invokeExact(this.handle, SEL_setMotionTransformStride_, motionTransformStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
