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
 * {@code MTL4IndirectInstanceAccelerationStructureDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4indirectinstanceaccelerationstructuredescriptor">Apple documentation</a>
 */
public class MTL4IndirectInstanceAccelerationStructureDescriptor extends MTL4AccelerationStructureDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4IndirectInstanceAccelerationStructureDescriptor");
    private static final long SEL_instanceDescriptorBuffer = ObjC.selector("instanceDescriptorBuffer");
    private static final MethodHandle MH_instanceDescriptorBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(MTL4BufferRange.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInstanceDescriptorBuffer_ = ObjC.selector("setInstanceDescriptorBuffer:");
    private static final MethodHandle MH_setInstanceDescriptorBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_instanceDescriptorStride = ObjC.selector("instanceDescriptorStride");
    private static final MethodHandle MH_instanceDescriptorStride = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInstanceDescriptorStride_ = ObjC.selector("setInstanceDescriptorStride:");
    private static final MethodHandle MH_setInstanceDescriptorStride_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxInstanceCount = ObjC.selector("maxInstanceCount");
    private static final MethodHandle MH_maxInstanceCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxInstanceCount_ = ObjC.selector("setMaxInstanceCount:");
    private static final MethodHandle MH_setMaxInstanceCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_instanceCountBuffer = ObjC.selector("instanceCountBuffer");
    private static final MethodHandle MH_instanceCountBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(MTL4BufferRange.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInstanceCountBuffer_ = ObjC.selector("setInstanceCountBuffer:");
    private static final MethodHandle MH_setInstanceCountBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_instanceDescriptorType = ObjC.selector("instanceDescriptorType");
    private static final MethodHandle MH_instanceDescriptorType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInstanceDescriptorType_ = ObjC.selector("setInstanceDescriptorType:");
    private static final MethodHandle MH_setInstanceDescriptorType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionTransformBuffer = ObjC.selector("motionTransformBuffer");
    private static final MethodHandle MH_motionTransformBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(MTL4BufferRange.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionTransformBuffer_ = ObjC.selector("setMotionTransformBuffer:");
    private static final MethodHandle MH_setMotionTransformBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxMotionTransformCount = ObjC.selector("maxMotionTransformCount");
    private static final MethodHandle MH_maxMotionTransformCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxMotionTransformCount_ = ObjC.selector("setMaxMotionTransformCount:");
    private static final MethodHandle MH_setMaxMotionTransformCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionTransformCountBuffer = ObjC.selector("motionTransformCountBuffer");
    private static final MethodHandle MH_motionTransformCountBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(MTL4BufferRange.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionTransformCountBuffer_ = ObjC.selector("setMotionTransformCountBuffer:");
    private static final MethodHandle MH_setMotionTransformCountBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
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

    public MTL4IndirectInstanceAccelerationStructureDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4IndirectInstanceAccelerationStructureDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4IndirectInstanceAccelerationStructureDescriptor alloc() {
        try {
            return new MTL4IndirectInstanceAccelerationStructureDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor init]} */
    public MTL4IndirectInstanceAccelerationStructureDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor instanceDescriptorBuffer]} */
    public MTL4BufferRange instanceDescriptorBuffer() {
        try (NativeStack stack = NativeStack.push()) {
            return MTL4BufferRange.read((MemorySegment) MH_instanceDescriptorBuffer.invokeExact((SegmentAllocator) stack, this.handle, SEL_instanceDescriptorBuffer));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor setInstanceDescriptorBuffer:]} */
    public void setInstanceDescriptorBuffer(final MTL4BufferRange instanceDescriptorBuffer) {
        try {
            MH_setInstanceDescriptorBuffer_.invokeExact(this.handle, SEL_setInstanceDescriptorBuffer_, instanceDescriptorBuffer.bufferAddress(), instanceDescriptorBuffer.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor instanceDescriptorStride]} */
    public long instanceDescriptorStride() {
        try {
            return (long) MH_instanceDescriptorStride.invokeExact(this.handle, SEL_instanceDescriptorStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor setInstanceDescriptorStride:]} */
    public void setInstanceDescriptorStride(final long instanceDescriptorStride) {
        try {
            MH_setInstanceDescriptorStride_.invokeExact(this.handle, SEL_setInstanceDescriptorStride_, instanceDescriptorStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor maxInstanceCount]} */
    public long maxInstanceCount() {
        try {
            return (long) MH_maxInstanceCount.invokeExact(this.handle, SEL_maxInstanceCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor setMaxInstanceCount:]} */
    public void setMaxInstanceCount(final long maxInstanceCount) {
        try {
            MH_setMaxInstanceCount_.invokeExact(this.handle, SEL_setMaxInstanceCount_, maxInstanceCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor instanceCountBuffer]} */
    public MTL4BufferRange instanceCountBuffer() {
        try (NativeStack stack = NativeStack.push()) {
            return MTL4BufferRange.read((MemorySegment) MH_instanceCountBuffer.invokeExact((SegmentAllocator) stack, this.handle, SEL_instanceCountBuffer));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor setInstanceCountBuffer:]} */
    public void setInstanceCountBuffer(final MTL4BufferRange instanceCountBuffer) {
        try {
            MH_setInstanceCountBuffer_.invokeExact(this.handle, SEL_setInstanceCountBuffer_, instanceCountBuffer.bufferAddress(), instanceCountBuffer.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor instanceDescriptorType]} */
    public MTLAccelerationStructureInstanceDescriptorType instanceDescriptorType() {
        try {
            return MTLAccelerationStructureInstanceDescriptorType.of((long) MH_instanceDescriptorType.invokeExact(this.handle, SEL_instanceDescriptorType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor setInstanceDescriptorType:]} */
    public void setInstanceDescriptorType(final MTLAccelerationStructureInstanceDescriptorType instanceDescriptorType) {
        try {
            MH_setInstanceDescriptorType_.invokeExact(this.handle, SEL_setInstanceDescriptorType_, instanceDescriptorType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor motionTransformBuffer]} */
    public MTL4BufferRange motionTransformBuffer() {
        try (NativeStack stack = NativeStack.push()) {
            return MTL4BufferRange.read((MemorySegment) MH_motionTransformBuffer.invokeExact((SegmentAllocator) stack, this.handle, SEL_motionTransformBuffer));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor setMotionTransformBuffer:]} */
    public void setMotionTransformBuffer(final MTL4BufferRange motionTransformBuffer) {
        try {
            MH_setMotionTransformBuffer_.invokeExact(this.handle, SEL_setMotionTransformBuffer_, motionTransformBuffer.bufferAddress(), motionTransformBuffer.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor maxMotionTransformCount]} */
    public long maxMotionTransformCount() {
        try {
            return (long) MH_maxMotionTransformCount.invokeExact(this.handle, SEL_maxMotionTransformCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor setMaxMotionTransformCount:]} */
    public void setMaxMotionTransformCount(final long maxMotionTransformCount) {
        try {
            MH_setMaxMotionTransformCount_.invokeExact(this.handle, SEL_setMaxMotionTransformCount_, maxMotionTransformCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor motionTransformCountBuffer]} */
    public MTL4BufferRange motionTransformCountBuffer() {
        try (NativeStack stack = NativeStack.push()) {
            return MTL4BufferRange.read((MemorySegment) MH_motionTransformCountBuffer.invokeExact((SegmentAllocator) stack, this.handle, SEL_motionTransformCountBuffer));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor setMotionTransformCountBuffer:]} */
    public void setMotionTransformCountBuffer(final MTL4BufferRange motionTransformCountBuffer) {
        try {
            MH_setMotionTransformCountBuffer_.invokeExact(this.handle, SEL_setMotionTransformCountBuffer_, motionTransformCountBuffer.bufferAddress(), motionTransformCountBuffer.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor instanceTransformationMatrixLayout]} */
    public MTLMatrixLayout instanceTransformationMatrixLayout() {
        try {
            return MTLMatrixLayout.of((long) MH_instanceTransformationMatrixLayout.invokeExact(this.handle, SEL_instanceTransformationMatrixLayout));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor setInstanceTransformationMatrixLayout:]} */
    public void setInstanceTransformationMatrixLayout(final MTLMatrixLayout instanceTransformationMatrixLayout) {
        try {
            MH_setInstanceTransformationMatrixLayout_.invokeExact(this.handle, SEL_setInstanceTransformationMatrixLayout_, instanceTransformationMatrixLayout.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor motionTransformType]} */
    public MTLTransformType motionTransformType() {
        try {
            return MTLTransformType.of((long) MH_motionTransformType.invokeExact(this.handle, SEL_motionTransformType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor setMotionTransformType:]} */
    public void setMotionTransformType(final MTLTransformType motionTransformType) {
        try {
            MH_setMotionTransformType_.invokeExact(this.handle, SEL_setMotionTransformType_, motionTransformType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor motionTransformStride]} */
    public long motionTransformStride() {
        try {
            return (long) MH_motionTransformStride.invokeExact(this.handle, SEL_motionTransformStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4IndirectInstanceAccelerationStructureDescriptor setMotionTransformStride:]} */
    public void setMotionTransformStride(final long motionTransformStride) {
        try {
            MH_setMotionTransformStride_.invokeExact(this.handle, SEL_setMotionTransformStride_, motionTransformStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
