package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLIndirectComputeCommand}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlindirectcomputecommand">Apple documentation</a>
 */
public class MTLIndirectComputeCommand extends NSObject {
    private static final long SEL_setComputePipelineState_ = ObjC.selector("setComputePipelineState:");
    private static final MethodHandle MH_setComputePipelineState_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setKernelBuffer_offset_atIndex_ = ObjC.selector("setKernelBuffer:offset:atIndex:");
    private static final MethodHandle MH_setKernelBuffer_offset_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setKernelBuffer_offset_attributeStride_atIndex_ = ObjC.selector("setKernelBuffer:offset:attributeStride:atIndex:");
    private static final MethodHandle MH_setKernelBuffer_offset_attributeStride_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_concurrentDispatchThreadgroups_threadsPerThreadgroup_ = ObjC.selector("concurrentDispatchThreadgroups:threadsPerThreadgroup:");
    private static final MethodHandle MH_concurrentDispatchThreadgroups_threadsPerThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_concurrentDispatchThreads_threadsPerThreadgroup_ = ObjC.selector("concurrentDispatchThreads:threadsPerThreadgroup:");
    private static final MethodHandle MH_concurrentDispatchThreads_threadsPerThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBarrier = ObjC.selector("setBarrier");
    private static final MethodHandle MH_setBarrier = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_clearBarrier = ObjC.selector("clearBarrier");
    private static final MethodHandle MH_clearBarrier = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_setImageblockWidth_height_ = ObjC.selector("setImageblockWidth:height:");
    private static final MethodHandle MH_setImageblockWidth_height_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_reset = ObjC.selector("reset");
    private static final MethodHandle MH_reset = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_setThreadgroupMemoryLength_atIndex_ = ObjC.selector("setThreadgroupMemoryLength:atIndex:");
    private static final MethodHandle MH_setThreadgroupMemoryLength_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStageInRegion_ = ObjC.selector("setStageInRegion:");
    private static final MethodHandle MH_setStageInRegion_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLIndirectComputeCommand(final long handle) {
        super(handle);
    }

    /** {@code -[MTLIndirectComputeCommand setComputePipelineState:]} */
    public void setComputePipelineState(final MTLComputePipelineState pipelineState) {
        try {
            MH_setComputePipelineState_.invokeExact(this.handle, SEL_setComputePipelineState_, pipelineState.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectComputeCommand setKernelBuffer:offset:atIndex:]} */
    public void setKernelBuffer(final MTLBuffer buffer, final long offset, final long index) {
        try {
            MH_setKernelBuffer_offset_atIndex_.invokeExact(this.handle, SEL_setKernelBuffer_offset_atIndex_, buffer.handle(), offset, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectComputeCommand setKernelBuffer:offset:attributeStride:atIndex:]} */
    public void setKernelBuffer(final MTLBuffer buffer, final long offset, final long stride, final long index) {
        try {
            MH_setKernelBuffer_offset_attributeStride_atIndex_.invokeExact(this.handle, SEL_setKernelBuffer_offset_attributeStride_atIndex_, buffer.handle(), offset, stride, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectComputeCommand concurrentDispatchThreadgroups:threadsPerThreadgroup:]} */
    public void concurrentDispatchThreadgroups(final MTLSize threadgroupsPerGrid, final MTLSize threadsPerThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_concurrentDispatchThreadgroups_threadsPerThreadgroup_.invokeExact(this.handle, SEL_concurrentDispatchThreadgroups_threadsPerThreadgroup_, threadgroupsPerGrid.on(stack).address(), threadsPerThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectComputeCommand concurrentDispatchThreads:threadsPerThreadgroup:]} */
    public void concurrentDispatchThreads(final MTLSize threadsPerGrid, final MTLSize threadsPerThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_concurrentDispatchThreads_threadsPerThreadgroup_.invokeExact(this.handle, SEL_concurrentDispatchThreads_threadsPerThreadgroup_, threadsPerGrid.on(stack).address(), threadsPerThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectComputeCommand setBarrier]} */
    public void setBarrier() {
        try {
            MH_setBarrier.invokeExact(this.handle, SEL_setBarrier);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectComputeCommand clearBarrier]} */
    public void clearBarrier() {
        try {
            MH_clearBarrier.invokeExact(this.handle, SEL_clearBarrier);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectComputeCommand setImageblockWidth:height:]} */
    public void setImageblockWidth(final long width, final long height) {
        try {
            MH_setImageblockWidth_height_.invokeExact(this.handle, SEL_setImageblockWidth_height_, width, height);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectComputeCommand reset]} */
    public void reset() {
        try {
            MH_reset.invokeExact(this.handle, SEL_reset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectComputeCommand setThreadgroupMemoryLength:atIndex:]} */
    public void setThreadgroupMemoryLength(final long length, final long index) {
        try {
            MH_setThreadgroupMemoryLength_atIndex_.invokeExact(this.handle, SEL_setThreadgroupMemoryLength_atIndex_, length, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectComputeCommand setStageInRegion:]} */
    public void setStageInRegion(final MTLRegion region) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setStageInRegion_.invokeExact(this.handle, SEL_setStageInRegion_, region.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
