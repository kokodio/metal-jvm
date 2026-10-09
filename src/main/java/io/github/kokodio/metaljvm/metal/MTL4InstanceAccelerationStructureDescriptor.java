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
 * {@code MTL4InstanceAccelerationStructureDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4instanceaccelerationstructuredescriptor">Apple documentation</a>
 */
public class MTL4InstanceAccelerationStructureDescriptor extends MTL4AccelerationStructureDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4InstanceAccelerationStructureDescriptor");
    private static final long SEL_instanceDescriptorBuffer = ObjC.selector("instanceDescriptorBuffer");
    private static final MethodHandle MH_instanceDescriptorBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(MTL4BufferRange.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInstanceDescriptorBuffer_ = ObjC.selector("setInstanceDescriptorBuffer:");
    private static final MethodHandle MH_setInstanceDescriptorBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_instanceDescriptorStride = ObjC.selector("instanceDescriptorStride");
    private static final MethodHandle MH_instanceDescriptorStride = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInstanceDescriptorStride_ = ObjC.selector("setInstanceDescriptorStride:");
    private static final MethodHandle MH_setInstanceDescriptorStride_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_instanceCount = ObjC.selector("instanceCount");
    private static final MethodHandle MH_instanceCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInstanceCount_ = ObjC.selector("setInstanceCount:");
    private static final MethodHandle MH_setInstanceCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_instanceDescriptorType = ObjC.selector("instanceDescriptorType");
    private static final MethodHandle MH_instanceDescriptorType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInstanceDescriptorType_ = ObjC.selector("setInstanceDescriptorType:");
    private static final MethodHandle MH_setInstanceDescriptorType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionTransformBuffer = ObjC.selector("motionTransformBuffer");
    private static final MethodHandle MH_motionTransformBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(MTL4BufferRange.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionTransformBuffer_ = ObjC.selector("setMotionTransformBuffer:");
    private static final MethodHandle MH_setMotionTransformBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
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

    public MTL4InstanceAccelerationStructureDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4InstanceAccelerationStructureDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4InstanceAccelerationStructureDescriptor alloc() {
        try {
            return new MTL4InstanceAccelerationStructureDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4InstanceAccelerationStructureDescriptor init]} */
    public MTL4InstanceAccelerationStructureDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4InstanceAccelerationStructureDescriptor instanceDescriptorBuffer]} */
    public MTL4BufferRange instanceDescriptorBuffer() {
        try (NativeStack stack = NativeStack.push()) {
            return MTL4BufferRange.read((MemorySegment) MH_instanceDescriptorBuffer.invokeExact((SegmentAllocator) stack, this.handle, SEL_instanceDescriptorBuffer));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4InstanceAccelerationStructureDescriptor setInstanceDescriptorBuffer:]} */
    public void setInstanceDescriptorBuffer(final MTL4BufferRange instanceDescriptorBuffer) {
        try {
            MH_setInstanceDescriptorBuffer_.invokeExact(this.handle, SEL_setInstanceDescriptorBuffer_, instanceDescriptorBuffer.bufferAddress(), instanceDescriptorBuffer.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4InstanceAccelerationStructureDescriptor instanceDescriptorStride]} */
    public long instanceDescriptorStride() {
        try {
            return (long) MH_instanceDescriptorStride.invokeExact(this.handle, SEL_instanceDescriptorStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4InstanceAccelerationStructureDescriptor setInstanceDescriptorStride:]} */
    public void setInstanceDescriptorStride(final long instanceDescriptorStride) {
        try {
            MH_setInstanceDescriptorStride_.invokeExact(this.handle, SEL_setInstanceDescriptorStride_, instanceDescriptorStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4InstanceAccelerationStructureDescriptor instanceCount]} */
    public long instanceCount() {
        try {
            return (long) MH_instanceCount.invokeExact(this.handle, SEL_instanceCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4InstanceAccelerationStructureDescriptor setInstanceCount:]} */
    public void setInstanceCount(final long instanceCount) {
        try {
            MH_setInstanceCount_.invokeExact(this.handle, SEL_setInstanceCount_, instanceCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4InstanceAccelerationStructureDescriptor instanceDescriptorType]} */
    public MTLAccelerationStructureInstanceDescriptorType instanceDescriptorType() {
        try {
            return MTLAccelerationStructureInstanceDescriptorType.of((long) MH_instanceDescriptorType.invokeExact(this.handle, SEL_instanceDescriptorType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4InstanceAccelerationStructureDescriptor setInstanceDescriptorType:]} */
    public void setInstanceDescriptorType(final MTLAccelerationStructureInstanceDescriptorType instanceDescriptorType) {
        try {
            MH_setInstanceDescriptorType_.invokeExact(this.handle, SEL_setInstanceDescriptorType_, instanceDescriptorType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4InstanceAccelerationStructureDescriptor motionTransformBuffer]} */
    public MTL4BufferRange motionTransformBuffer() {
        try (NativeStack stack = NativeStack.push()) {
            return MTL4BufferRange.read((MemorySegment) MH_motionTransformBuffer.invokeExact((SegmentAllocator) stack, this.handle, SEL_motionTransformBuffer));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4InstanceAccelerationStructureDescriptor setMotionTransformBuffer:]} */
    public void setMotionTransformBuffer(final MTL4BufferRange motionTransformBuffer) {
        try {
            MH_setMotionTransformBuffer_.invokeExact(this.handle, SEL_setMotionTransformBuffer_, motionTransformBuffer.bufferAddress(), motionTransformBuffer.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4InstanceAccelerationStructureDescriptor motionTransformCount]} */
    public long motionTransformCount() {
        try {
            return (long) MH_motionTransformCount.invokeExact(this.handle, SEL_motionTransformCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4InstanceAccelerationStructureDescriptor setMotionTransformCount:]} */
    public void setMotionTransformCount(final long motionTransformCount) {
        try {
            MH_setMotionTransformCount_.invokeExact(this.handle, SEL_setMotionTransformCount_, motionTransformCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4InstanceAccelerationStructureDescriptor instanceTransformationMatrixLayout]} */
    public MTLMatrixLayout instanceTransformationMatrixLayout() {
        try {
            return MTLMatrixLayout.of((long) MH_instanceTransformationMatrixLayout.invokeExact(this.handle, SEL_instanceTransformationMatrixLayout));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4InstanceAccelerationStructureDescriptor setInstanceTransformationMatrixLayout:]} */
    public void setInstanceTransformationMatrixLayout(final MTLMatrixLayout instanceTransformationMatrixLayout) {
        try {
            MH_setInstanceTransformationMatrixLayout_.invokeExact(this.handle, SEL_setInstanceTransformationMatrixLayout_, instanceTransformationMatrixLayout.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4InstanceAccelerationStructureDescriptor motionTransformType]} */
    public MTLTransformType motionTransformType() {
        try {
            return MTLTransformType.of((long) MH_motionTransformType.invokeExact(this.handle, SEL_motionTransformType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4InstanceAccelerationStructureDescriptor setMotionTransformType:]} */
    public void setMotionTransformType(final MTLTransformType motionTransformType) {
        try {
            MH_setMotionTransformType_.invokeExact(this.handle, SEL_setMotionTransformType_, motionTransformType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4InstanceAccelerationStructureDescriptor motionTransformStride]} */
    public long motionTransformStride() {
        try {
            return (long) MH_motionTransformStride.invokeExact(this.handle, SEL_motionTransformStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4InstanceAccelerationStructureDescriptor setMotionTransformStride:]} */
    public void setMotionTransformStride(final long motionTransformStride) {
        try {
            MH_setMotionTransformStride_.invokeExact(this.handle, SEL_setMotionTransformStride_, motionTransformStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
