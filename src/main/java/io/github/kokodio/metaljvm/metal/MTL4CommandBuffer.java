package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.foundation.NSRange;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4CommandBuffer}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4commandbuffer">Apple documentation</a>
 */
public class MTL4CommandBuffer extends NSObject {
    private static final long SEL_beginCommandBufferWithAllocator_ = ObjC.selector("beginCommandBufferWithAllocator:");
    private static final MethodHandle MH_beginCommandBufferWithAllocator_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_beginCommandBufferWithAllocator_options_ = ObjC.selector("beginCommandBufferWithAllocator:options:");
    private static final MethodHandle MH_beginCommandBufferWithAllocator_options_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_endCommandBuffer = ObjC.selector("endCommandBuffer");
    private static final MethodHandle MH_endCommandBuffer = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_renderCommandEncoderWithDescriptor_ = ObjC.selector("renderCommandEncoderWithDescriptor:");
    private static final MethodHandle MH_renderCommandEncoderWithDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_renderCommandEncoderWithDescriptor_options_ = ObjC.selector("renderCommandEncoderWithDescriptor:options:");
    private static final MethodHandle MH_renderCommandEncoderWithDescriptor_options_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_computeCommandEncoder = ObjC.selector("computeCommandEncoder");
    private static final MethodHandle MH_computeCommandEncoder = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_machineLearningCommandEncoder = ObjC.selector("machineLearningCommandEncoder");
    private static final MethodHandle MH_machineLearningCommandEncoder = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_useResidencySet_ = ObjC.selector("useResidencySet:");
    private static final MethodHandle MH_useResidencySet_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_useResidencySets_count_ = ObjC.selector("useResidencySets:count:");
    private static final MethodHandle MH_useResidencySets_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pushDebugGroup_ = ObjC.selector("pushDebugGroup:");
    private static final MethodHandle MH_pushDebugGroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_popDebugGroup = ObjC.selector("popDebugGroup");
    private static final MethodHandle MH_popDebugGroup = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_writeTimestampIntoHeap_atIndex_ = ObjC.selector("writeTimestampIntoHeap:atIndex:");
    private static final MethodHandle MH_writeTimestampIntoHeap_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resolveCounterHeap_withRange_intoBuffer_waitFence_updateFence_ = ObjC.selector("resolveCounterHeap:withRange:intoBuffer:waitFence:updateFence:");
    private static final MethodHandle MH_resolveCounterHeap_withRange_intoBuffer_waitFence_updateFence_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, NSRange.LAYOUT, MTL4BufferRange.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTL4CommandBuffer(final long handle) {
        super(handle);
    }

    /** {@code -[MTL4CommandBuffer beginCommandBufferWithAllocator:]} */
    public void beginCommandBuffer(final MTL4CommandAllocator allocator) {
        try {
            MH_beginCommandBufferWithAllocator_.invokeExact(this.handle, SEL_beginCommandBufferWithAllocator_, allocator.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandBuffer beginCommandBufferWithAllocator:options:]} */
    public void beginCommandBuffer(final MTL4CommandAllocator allocator, final MTL4CommandBufferOptions options) {
        try {
            MH_beginCommandBufferWithAllocator_options_.invokeExact(this.handle, SEL_beginCommandBufferWithAllocator_options_, allocator.handle(), options.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandBuffer endCommandBuffer]} */
    public void endCommandBuffer() {
        try {
            MH_endCommandBuffer.invokeExact(this.handle, SEL_endCommandBuffer);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4CommandBuffer renderCommandEncoderWithDescriptor:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTL4RenderCommandEncoder renderCommandEncoder(final MTL4RenderPassDescriptor descriptor) {
        try {
            long result = (long) MH_renderCommandEncoderWithDescriptor_.invokeExact(this.handle, SEL_renderCommandEncoderWithDescriptor_, descriptor.handle());
            return result == 0L ? null : new MTL4RenderCommandEncoder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4CommandBuffer renderCommandEncoderWithDescriptor:options:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     *
     * @param options a combination of {@link MTL4RenderEncoderOptions} flags
     */
    @Nullable
    public MTL4RenderCommandEncoder renderCommandEncoder(final MTL4RenderPassDescriptor descriptor, final long options) {
        try {
            long result = (long) MH_renderCommandEncoderWithDescriptor_options_.invokeExact(this.handle, SEL_renderCommandEncoderWithDescriptor_options_, descriptor.handle(), options);
            return result == 0L ? null : new MTL4RenderCommandEncoder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4CommandBuffer computeCommandEncoder]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTL4ComputeCommandEncoder computeCommandEncoder() {
        try {
            long result = (long) MH_computeCommandEncoder.invokeExact(this.handle, SEL_computeCommandEncoder);
            return result == 0L ? null : new MTL4ComputeCommandEncoder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4CommandBuffer machineLearningCommandEncoder]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTL4MachineLearningCommandEncoder machineLearningCommandEncoder() {
        try {
            long result = (long) MH_machineLearningCommandEncoder.invokeExact(this.handle, SEL_machineLearningCommandEncoder);
            return result == 0L ? null : new MTL4MachineLearningCommandEncoder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandBuffer useResidencySet:]} */
    public void useResidencySet(final MTLResidencySet residencySet) {
        try {
            MH_useResidencySet_.invokeExact(this.handle, SEL_useResidencySet_, residencySet.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandBuffer useResidencySets:count:]} */
    public void useResidencySets(final MemorySegment residencySets, final long count) {
        try {
            MH_useResidencySets_count_.invokeExact(this.handle, SEL_useResidencySets_count_, residencySets.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandBuffer pushDebugGroup:]} */
    public void pushDebugGroup(final String string) {
        final long nsString = ObjC.nsString(string);
        try {
            MH_pushDebugGroup_.invokeExact(this.handle, SEL_pushDebugGroup_, nsString);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsString);
        }
    }

    /** {@code -[MTL4CommandBuffer popDebugGroup]} */
    public void popDebugGroup() {
        try {
            MH_popDebugGroup.invokeExact(this.handle, SEL_popDebugGroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandBuffer writeTimestampIntoHeap:atIndex:]} */
    public void writeTimestampIntoHeap(final MTL4CounterHeap counterHeap, final long index) {
        try {
            MH_writeTimestampIntoHeap_atIndex_.invokeExact(this.handle, SEL_writeTimestampIntoHeap_atIndex_, counterHeap.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandBuffer resolveCounterHeap:withRange:intoBuffer:waitFence:updateFence:]} */
    public void resolveCounterHeap(final MTL4CounterHeap counterHeap, final NSRange range, final MTL4BufferRange bufferRange, @Nullable final MTLFence fenceToWait, @Nullable final MTLFence fenceToUpdate) {
        try (NativeStack stack = NativeStack.push()) {
            MH_resolveCounterHeap_withRange_intoBuffer_waitFence_updateFence_.invokeExact(this.handle, SEL_resolveCounterHeap_withRange_intoBuffer_waitFence_updateFence_, counterHeap.handle(), range.on(stack), bufferRange.on(stack), fenceToWait == null ? 0L : fenceToWait.handle(), fenceToUpdate == null ? 0L : fenceToUpdate.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4CommandBuffer device]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLDevice device() {
        try {
            long result = (long) MH_device.invokeExact(this.handle, SEL_device);
            return new MTLDevice(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandBuffer label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandBuffer setLabel:]} */
    public void setLabel(@Nullable final String label) {
        final long nsLabel = label == null ? 0L : ObjC.nsString(label);
        try {
            MH_setLabel_.invokeExact(this.handle, SEL_setLabel_, nsLabel);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsLabel);
        }
    }
}
