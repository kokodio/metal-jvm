package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLAccelerationStructureCommandEncoder}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlaccelerationstructurecommandencoder">Apple documentation</a>
 */
public class MTLAccelerationStructureCommandEncoder extends MTLCommandEncoder {
    private static final long SEL_buildAccelerationStructure_descriptor_scratchBuffer_scratchBufferOffset_ = ObjC.selector("buildAccelerationStructure:descriptor:scratchBuffer:scratchBufferOffset:");
    private static final MethodHandle MH_buildAccelerationStructure_descriptor_scratchBuffer_scratchBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_refitAccelerationStructure_descriptor_destination_scratchBuffer_scratchBufferOffset_ = ObjC.selector("refitAccelerationStructure:descriptor:destination:scratchBuffer:scratchBufferOffset:");
    private static final MethodHandle MH_refitAccelerationStructure_descriptor_destination_scratchBuffer_scratchBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_refitAccelerationStructure_descriptor_destination_scratchBuffer_scratchBufferOffset_options_ = ObjC.selector("refitAccelerationStructure:descriptor:destination:scratchBuffer:scratchBufferOffset:options:");
    private static final MethodHandle MH_refitAccelerationStructure_descriptor_destination_scratchBuffer_scratchBufferOffset_options_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyAccelerationStructure_toAccelerationStructure_ = ObjC.selector("copyAccelerationStructure:toAccelerationStructure:");
    private static final MethodHandle MH_copyAccelerationStructure_toAccelerationStructure_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_writeCompactedAccelerationStructureSize_toBuffer_offset_ = ObjC.selector("writeCompactedAccelerationStructureSize:toBuffer:offset:");
    private static final MethodHandle MH_writeCompactedAccelerationStructureSize_toBuffer_offset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_writeCompactedAccelerationStructureSize_toBuffer_offset_sizeDataType_ = ObjC.selector("writeCompactedAccelerationStructureSize:toBuffer:offset:sizeDataType:");
    private static final MethodHandle MH_writeCompactedAccelerationStructureSize_toBuffer_offset_sizeDataType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyAndCompactAccelerationStructure_toAccelerationStructure_ = ObjC.selector("copyAndCompactAccelerationStructure:toAccelerationStructure:");
    private static final MethodHandle MH_copyAndCompactAccelerationStructure_toAccelerationStructure_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_updateFence_ = ObjC.selector("updateFence:");
    private static final MethodHandle MH_updateFence_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_waitForFence_ = ObjC.selector("waitForFence:");
    private static final MethodHandle MH_waitForFence_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_useResource_usage_ = ObjC.selector("useResource:usage:");
    private static final MethodHandle MH_useResource_usage_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_useResources_count_usage_ = ObjC.selector("useResources:count:usage:");
    private static final MethodHandle MH_useResources_count_usage_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_useHeap_ = ObjC.selector("useHeap:");
    private static final MethodHandle MH_useHeap_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_useHeaps_count_ = ObjC.selector("useHeaps:count:");
    private static final MethodHandle MH_useHeaps_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sampleCountersInBuffer_atSampleIndex_withBarrier_ = ObjC.selector("sampleCountersInBuffer:atSampleIndex:withBarrier:");
    private static final MethodHandle MH_sampleCountersInBuffer_atSampleIndex_withBarrier_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));

    public MTLAccelerationStructureCommandEncoder(final long handle) {
        super(handle);
    }

    /** {@code -[MTLAccelerationStructureCommandEncoder buildAccelerationStructure:descriptor:scratchBuffer:scratchBufferOffset:]} */
    public void buildAccelerationStructure(final MTLAccelerationStructure accelerationStructure, final MTLAccelerationStructureDescriptor descriptor, final MTLBuffer scratchBuffer, final long scratchBufferOffset) {
        try {
            MH_buildAccelerationStructure_descriptor_scratchBuffer_scratchBufferOffset_.invokeExact(this.handle, SEL_buildAccelerationStructure_descriptor_scratchBuffer_scratchBufferOffset_, accelerationStructure.handle(), descriptor.handle(), scratchBuffer.handle(), scratchBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCommandEncoder refitAccelerationStructure:descriptor:destination:scratchBuffer:scratchBufferOffset:]} */
    public void refitAccelerationStructure(final MTLAccelerationStructure sourceAccelerationStructure, final MTLAccelerationStructureDescriptor descriptor, @Nullable final MTLAccelerationStructure destinationAccelerationStructure, @Nullable final MTLBuffer scratchBuffer, final long scratchBufferOffset) {
        try {
            MH_refitAccelerationStructure_descriptor_destination_scratchBuffer_scratchBufferOffset_.invokeExact(this.handle, SEL_refitAccelerationStructure_descriptor_destination_scratchBuffer_scratchBufferOffset_, sourceAccelerationStructure.handle(), descriptor.handle(), destinationAccelerationStructure == null ? 0L : destinationAccelerationStructure.handle(), scratchBuffer == null ? 0L : scratchBuffer.handle(), scratchBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLAccelerationStructureCommandEncoder refitAccelerationStructure:descriptor:destination:scratchBuffer:scratchBufferOffset:options:]}
     *
     * @param options a combination of {@link MTLAccelerationStructureRefitOptions} flags
     */
    public void refitAccelerationStructure(final MTLAccelerationStructure sourceAccelerationStructure, final MTLAccelerationStructureDescriptor descriptor, @Nullable final MTLAccelerationStructure destinationAccelerationStructure, @Nullable final MTLBuffer scratchBuffer, final long scratchBufferOffset, final long options) {
        try {
            MH_refitAccelerationStructure_descriptor_destination_scratchBuffer_scratchBufferOffset_options_.invokeExact(this.handle, SEL_refitAccelerationStructure_descriptor_destination_scratchBuffer_scratchBufferOffset_options_, sourceAccelerationStructure.handle(), descriptor.handle(), destinationAccelerationStructure == null ? 0L : destinationAccelerationStructure.handle(), scratchBuffer == null ? 0L : scratchBuffer.handle(), scratchBufferOffset, options);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCommandEncoder copyAccelerationStructure:toAccelerationStructure:]} */
    public void copyAccelerationStructure(final MTLAccelerationStructure sourceAccelerationStructure, final MTLAccelerationStructure destinationAccelerationStructure) {
        try {
            MH_copyAccelerationStructure_toAccelerationStructure_.invokeExact(this.handle, SEL_copyAccelerationStructure_toAccelerationStructure_, sourceAccelerationStructure.handle(), destinationAccelerationStructure.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCommandEncoder writeCompactedAccelerationStructureSize:toBuffer:offset:]} */
    public void writeCompactedAccelerationStructureSize(final MTLAccelerationStructure accelerationStructure, final MTLBuffer buffer, final long offset) {
        try {
            MH_writeCompactedAccelerationStructureSize_toBuffer_offset_.invokeExact(this.handle, SEL_writeCompactedAccelerationStructureSize_toBuffer_offset_, accelerationStructure.handle(), buffer.handle(), offset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCommandEncoder writeCompactedAccelerationStructureSize:toBuffer:offset:sizeDataType:]} */
    public void writeCompactedAccelerationStructureSize(final MTLAccelerationStructure accelerationStructure, final MTLBuffer buffer, final long offset, final MTLDataType sizeDataType) {
        try {
            MH_writeCompactedAccelerationStructureSize_toBuffer_offset_sizeDataType_.invokeExact(this.handle, SEL_writeCompactedAccelerationStructureSize_toBuffer_offset_sizeDataType_, accelerationStructure.handle(), buffer.handle(), offset, sizeDataType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCommandEncoder copyAndCompactAccelerationStructure:toAccelerationStructure:]} */
    public void copyAndCompactAccelerationStructure(final MTLAccelerationStructure sourceAccelerationStructure, final MTLAccelerationStructure destinationAccelerationStructure) {
        try {
            MH_copyAndCompactAccelerationStructure_toAccelerationStructure_.invokeExact(this.handle, SEL_copyAndCompactAccelerationStructure_toAccelerationStructure_, sourceAccelerationStructure.handle(), destinationAccelerationStructure.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCommandEncoder updateFence:]} */
    public void updateFence(final MTLFence fence) {
        try {
            MH_updateFence_.invokeExact(this.handle, SEL_updateFence_, fence.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCommandEncoder waitForFence:]} */
    public void waitForFence(final MTLFence fence) {
        try {
            MH_waitForFence_.invokeExact(this.handle, SEL_waitForFence_, fence.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLAccelerationStructureCommandEncoder useResource:usage:]}
     *
     * @param usage a combination of {@link MTLResourceUsage} flags
     */
    public void useResource(final MTLResource resource, final long usage) {
        try {
            MH_useResource_usage_.invokeExact(this.handle, SEL_useResource_usage_, resource.handle(), usage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLAccelerationStructureCommandEncoder useResources:count:usage:]}
     *
     * @param usage a combination of {@link MTLResourceUsage} flags
     */
    public void useResources(final MemorySegment resources, final long count, final long usage) {
        try {
            MH_useResources_count_usage_.invokeExact(this.handle, SEL_useResources_count_usage_, resources.address(), count, usage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCommandEncoder useHeap:]} */
    public void useHeap(final MTLHeap heap) {
        try {
            MH_useHeap_.invokeExact(this.handle, SEL_useHeap_, heap.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCommandEncoder useHeaps:count:]} */
    public void useHeaps(final MemorySegment heaps, final long count) {
        try {
            MH_useHeaps_count_.invokeExact(this.handle, SEL_useHeaps_count_, heaps.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructureCommandEncoder sampleCountersInBuffer:atSampleIndex:withBarrier:]} */
    public void sampleCountersInBuffer(final MTLCounterSampleBuffer sampleBuffer, final long sampleIndex, final boolean barrier) {
        try {
            MH_sampleCountersInBuffer_atSampleIndex_withBarrier_.invokeExact(this.handle, SEL_sampleCountersInBuffer_atSampleIndex_withBarrier_, sampleBuffer.handle(), sampleIndex, barrier);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
