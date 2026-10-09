package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSError;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLCommandBuffer}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcommandbuffer">Apple documentation</a>
 */
public class MTLCommandBuffer extends NSObject {
    private static final long SEL_enqueue = ObjC.selector("enqueue");
    private static final MethodHandle MH_enqueue = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_commit = ObjC.selector("commit");
    private static final MethodHandle MH_commit = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_addScheduledHandler_ = ObjC.selector("addScheduledHandler:");
    private static final MethodHandle MH_addScheduledHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_presentDrawable_ = ObjC.selector("presentDrawable:");
    private static final MethodHandle MH_presentDrawable_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_presentDrawable_atTime_ = ObjC.selector("presentDrawable:atTime:");
    private static final MethodHandle MH_presentDrawable_atTime_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_presentDrawable_afterMinimumDuration_ = ObjC.selector("presentDrawable:afterMinimumDuration:");
    private static final MethodHandle MH_presentDrawable_afterMinimumDuration_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_waitUntilScheduled = ObjC.selector("waitUntilScheduled");
    private static final MethodHandle MH_waitUntilScheduled = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_addCompletedHandler_ = ObjC.selector("addCompletedHandler:");
    private static final MethodHandle MH_addCompletedHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_waitUntilCompleted = ObjC.selector("waitUntilCompleted");
    private static final MethodHandle MH_waitUntilCompleted = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_blitCommandEncoder = ObjC.selector("blitCommandEncoder");
    private static final MethodHandle MH_blitCommandEncoder = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_renderCommandEncoderWithDescriptor_ = ObjC.selector("renderCommandEncoderWithDescriptor:");
    private static final MethodHandle MH_renderCommandEncoderWithDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_computeCommandEncoderWithDescriptor_ = ObjC.selector("computeCommandEncoderWithDescriptor:");
    private static final MethodHandle MH_computeCommandEncoderWithDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_blitCommandEncoderWithDescriptor_ = ObjC.selector("blitCommandEncoderWithDescriptor:");
    private static final MethodHandle MH_blitCommandEncoderWithDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_computeCommandEncoder = ObjC.selector("computeCommandEncoder");
    private static final MethodHandle MH_computeCommandEncoder = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_computeCommandEncoderWithDispatchType_ = ObjC.selector("computeCommandEncoderWithDispatchType:");
    private static final MethodHandle MH_computeCommandEncoderWithDispatchType_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_encodeWaitForEvent_value_ = ObjC.selector("encodeWaitForEvent:value:");
    private static final MethodHandle MH_encodeWaitForEvent_value_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_encodeSignalEvent_value_ = ObjC.selector("encodeSignalEvent:value:");
    private static final MethodHandle MH_encodeSignalEvent_value_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_parallelRenderCommandEncoderWithDescriptor_ = ObjC.selector("parallelRenderCommandEncoderWithDescriptor:");
    private static final MethodHandle MH_parallelRenderCommandEncoderWithDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resourceStateCommandEncoder = ObjC.selector("resourceStateCommandEncoder");
    private static final MethodHandle MH_resourceStateCommandEncoder = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resourceStateCommandEncoderWithDescriptor_ = ObjC.selector("resourceStateCommandEncoderWithDescriptor:");
    private static final MethodHandle MH_resourceStateCommandEncoderWithDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_accelerationStructureCommandEncoder = ObjC.selector("accelerationStructureCommandEncoder");
    private static final MethodHandle MH_accelerationStructureCommandEncoder = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_accelerationStructureCommandEncoderWithDescriptor_ = ObjC.selector("accelerationStructureCommandEncoderWithDescriptor:");
    private static final MethodHandle MH_accelerationStructureCommandEncoderWithDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pushDebugGroup_ = ObjC.selector("pushDebugGroup:");
    private static final MethodHandle MH_pushDebugGroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_popDebugGroup = ObjC.selector("popDebugGroup");
    private static final MethodHandle MH_popDebugGroup = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_useResidencySet_ = ObjC.selector("useResidencySet:");
    private static final MethodHandle MH_useResidencySet_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_useResidencySets_count_ = ObjC.selector("useResidencySets:count:");
    private static final MethodHandle MH_useResidencySets_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_commandQueue = ObjC.selector("commandQueue");
    private static final MethodHandle MH_commandQueue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_retainedReferences = ObjC.selector("retainedReferences");
    private static final MethodHandle MH_retainedReferences = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_errorOptions = ObjC.selector("errorOptions");
    private static final MethodHandle MH_errorOptions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_kernelStartTime = ObjC.selector("kernelStartTime");
    private static final MethodHandle MH_kernelStartTime = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_kernelEndTime = ObjC.selector("kernelEndTime");
    private static final MethodHandle MH_kernelEndTime = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_logs = ObjC.selector("logs");
    private static final MethodHandle MH_logs = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_GPUStartTime = ObjC.selector("GPUStartTime");
    private static final MethodHandle MH_GPUStartTime = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_GPUEndTime = ObjC.selector("GPUEndTime");
    private static final MethodHandle MH_GPUEndTime = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_status = ObjC.selector("status");
    private static final MethodHandle MH_status = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_error = ObjC.selector("error");
    private static final MethodHandle MH_error = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLCommandBuffer(final long handle) {
        super(handle);
    }

    /** {@code -[MTLCommandBuffer enqueue]} */
    public void enqueue() {
        try {
            MH_enqueue.invokeExact(this.handle, SEL_enqueue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBuffer commit]} */
    public void commit() {
        try {
            MH_commit.invokeExact(this.handle, SEL_commit);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBuffer addScheduledHandler:]} */
    public void addScheduledHandler(final long block) {
        try {
            MH_addScheduledHandler_.invokeExact(this.handle, SEL_addScheduledHandler_, block);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBuffer presentDrawable:]} */
    public void presentDrawable(final MTLDrawable drawable) {
        try {
            MH_presentDrawable_.invokeExact(this.handle, SEL_presentDrawable_, drawable.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBuffer presentDrawable:atTime:]} */
    public void presentDrawableAtTime(final MTLDrawable drawable, final double presentationTime) {
        try {
            MH_presentDrawable_atTime_.invokeExact(this.handle, SEL_presentDrawable_atTime_, drawable.handle(), presentationTime);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBuffer presentDrawable:afterMinimumDuration:]} */
    public void presentDrawableAfterMinimumDuration(final MTLDrawable drawable, final double duration) {
        try {
            MH_presentDrawable_afterMinimumDuration_.invokeExact(this.handle, SEL_presentDrawable_afterMinimumDuration_, drawable.handle(), duration);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBuffer waitUntilScheduled]} */
    public void waitUntilScheduled() {
        try {
            MH_waitUntilScheduled.invokeExact(this.handle, SEL_waitUntilScheduled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBuffer addCompletedHandler:]} */
    public void addCompletedHandler(final long block) {
        try {
            MH_addCompletedHandler_.invokeExact(this.handle, SEL_addCompletedHandler_, block);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBuffer waitUntilCompleted]} */
    public void waitUntilCompleted() {
        try {
            MH_waitUntilCompleted.invokeExact(this.handle, SEL_waitUntilCompleted);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandBuffer blitCommandEncoder]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLBlitCommandEncoder blitCommandEncoder() {
        try {
            long result = (long) MH_blitCommandEncoder.invokeExact(this.handle, SEL_blitCommandEncoder);
            return result == 0L ? null : new MTLBlitCommandEncoder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandBuffer renderCommandEncoderWithDescriptor:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLRenderCommandEncoder renderCommandEncoder(final MTLRenderPassDescriptor renderPassDescriptor) {
        try {
            long result = (long) MH_renderCommandEncoderWithDescriptor_.invokeExact(this.handle, SEL_renderCommandEncoderWithDescriptor_, renderPassDescriptor.handle());
            return result == 0L ? null : new MTLRenderCommandEncoder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandBuffer computeCommandEncoderWithDescriptor:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLComputeCommandEncoder computeCommandEncoderWithDescriptor(final MTLComputePassDescriptor computePassDescriptor) {
        try {
            long result = (long) MH_computeCommandEncoderWithDescriptor_.invokeExact(this.handle, SEL_computeCommandEncoderWithDescriptor_, computePassDescriptor.handle());
            return result == 0L ? null : new MTLComputeCommandEncoder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandBuffer blitCommandEncoderWithDescriptor:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLBlitCommandEncoder blitCommandEncoderWithDescriptor(final MTLBlitPassDescriptor blitPassDescriptor) {
        try {
            long result = (long) MH_blitCommandEncoderWithDescriptor_.invokeExact(this.handle, SEL_blitCommandEncoderWithDescriptor_, blitPassDescriptor.handle());
            return result == 0L ? null : new MTLBlitCommandEncoder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandBuffer computeCommandEncoder]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLComputeCommandEncoder computeCommandEncoder() {
        try {
            long result = (long) MH_computeCommandEncoder.invokeExact(this.handle, SEL_computeCommandEncoder);
            return result == 0L ? null : new MTLComputeCommandEncoder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandBuffer computeCommandEncoderWithDispatchType:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLComputeCommandEncoder computeCommandEncoderWithDispatchType(final MTLDispatchType dispatchType) {
        try {
            long result = (long) MH_computeCommandEncoderWithDispatchType_.invokeExact(this.handle, SEL_computeCommandEncoderWithDispatchType_, dispatchType.value);
            return result == 0L ? null : new MTLComputeCommandEncoder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBuffer encodeWaitForEvent:value:]} */
    public void encodeWaitForEvent(final MTLEvent event, final long value) {
        try {
            MH_encodeWaitForEvent_value_.invokeExact(this.handle, SEL_encodeWaitForEvent_value_, event.handle(), value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBuffer encodeSignalEvent:value:]} */
    public void encodeSignalEvent(final MTLEvent event, final long value) {
        try {
            MH_encodeSignalEvent_value_.invokeExact(this.handle, SEL_encodeSignalEvent_value_, event.handle(), value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandBuffer parallelRenderCommandEncoderWithDescriptor:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLParallelRenderCommandEncoder parallelRenderCommandEncoder(final MTLRenderPassDescriptor renderPassDescriptor) {
        try {
            long result = (long) MH_parallelRenderCommandEncoderWithDescriptor_.invokeExact(this.handle, SEL_parallelRenderCommandEncoderWithDescriptor_, renderPassDescriptor.handle());
            return result == 0L ? null : new MTLParallelRenderCommandEncoder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandBuffer resourceStateCommandEncoder]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLResourceStateCommandEncoder resourceStateCommandEncoder() {
        try {
            long result = (long) MH_resourceStateCommandEncoder.invokeExact(this.handle, SEL_resourceStateCommandEncoder);
            return result == 0L ? null : new MTLResourceStateCommandEncoder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandBuffer resourceStateCommandEncoderWithDescriptor:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLResourceStateCommandEncoder resourceStateCommandEncoderWithDescriptor(final MTLResourceStatePassDescriptor resourceStatePassDescriptor) {
        try {
            long result = (long) MH_resourceStateCommandEncoderWithDescriptor_.invokeExact(this.handle, SEL_resourceStateCommandEncoderWithDescriptor_, resourceStatePassDescriptor.handle());
            return result == 0L ? null : new MTLResourceStateCommandEncoder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandBuffer accelerationStructureCommandEncoder]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLAccelerationStructureCommandEncoder accelerationStructureCommandEncoder() {
        try {
            long result = (long) MH_accelerationStructureCommandEncoder.invokeExact(this.handle, SEL_accelerationStructureCommandEncoder);
            return result == 0L ? null : new MTLAccelerationStructureCommandEncoder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandBuffer accelerationStructureCommandEncoderWithDescriptor:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLAccelerationStructureCommandEncoder accelerationStructureCommandEncoderWithDescriptor(final MTLAccelerationStructurePassDescriptor descriptor) {
        try {
            long result = (long) MH_accelerationStructureCommandEncoderWithDescriptor_.invokeExact(this.handle, SEL_accelerationStructureCommandEncoderWithDescriptor_, descriptor.handle());
            return new MTLAccelerationStructureCommandEncoder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBuffer pushDebugGroup:]} */
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

    /** {@code -[MTLCommandBuffer popDebugGroup]} */
    public void popDebugGroup() {
        try {
            MH_popDebugGroup.invokeExact(this.handle, SEL_popDebugGroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBuffer useResidencySet:]} */
    public void useResidencySet(final MTLResidencySet residencySet) {
        try {
            MH_useResidencySet_.invokeExact(this.handle, SEL_useResidencySet_, residencySet.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBuffer useResidencySets:count:]} */
    public void useResidencySets(final MemorySegment residencySets, final long count) {
        try {
            MH_useResidencySets_count_.invokeExact(this.handle, SEL_useResidencySets_count_, residencySets.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandBuffer device]}
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

    /**
     * {@code -[MTLCommandBuffer commandQueue]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLCommandQueue commandQueue() {
        try {
            long result = (long) MH_commandQueue.invokeExact(this.handle, SEL_commandQueue);
            return new MTLCommandQueue(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBuffer retainedReferences]} */
    public boolean retainedReferences() {
        try {
            return (boolean) MH_retainedReferences.invokeExact(this.handle, SEL_retainedReferences);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandBuffer errorOptions]}
     *
     * @return a combination of {@link MTLCommandBufferErrorOption} flags
     */
    public long errorOptions() {
        try {
            return (long) MH_errorOptions.invokeExact(this.handle, SEL_errorOptions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBuffer label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBuffer setLabel:]} */
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

    /** {@code -[MTLCommandBuffer kernelStartTime]} */
    public double kernelStartTime() {
        try {
            return (double) MH_kernelStartTime.invokeExact(this.handle, SEL_kernelStartTime);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBuffer kernelEndTime]} */
    public double kernelEndTime() {
        try {
            return (double) MH_kernelEndTime.invokeExact(this.handle, SEL_kernelEndTime);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandBuffer logs]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLLogContainer logs() {
        try {
            long result = (long) MH_logs.invokeExact(this.handle, SEL_logs);
            return new MTLLogContainer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBuffer GPUStartTime]} */
    public double GPUStartTime() {
        try {
            return (double) MH_GPUStartTime.invokeExact(this.handle, SEL_GPUStartTime);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBuffer GPUEndTime]} */
    public double GPUEndTime() {
        try {
            return (double) MH_GPUEndTime.invokeExact(this.handle, SEL_GPUEndTime);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBuffer status]} */
    public MTLCommandBufferStatus status() {
        try {
            return MTLCommandBufferStatus.of((long) MH_status.invokeExact(this.handle, SEL_status));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandBuffer error]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSError error() {
        try {
            long result = (long) MH_error.invokeExact(this.handle, SEL_error);
            return result == 0L ? null : new NSError(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
