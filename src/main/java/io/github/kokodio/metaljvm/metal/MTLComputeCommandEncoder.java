package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSRange;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLComputeCommandEncoder}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcomputecommandencoder">Apple documentation</a>
 */
public class MTLComputeCommandEncoder extends MTLCommandEncoder {
    private static final long SEL_setComputePipelineState_ = ObjC.selector("setComputePipelineState:");
    private static final MethodHandle MH_setComputePipelineState_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBytes_length_atIndex_ = ObjC.selector("setBytes:length:atIndex:");
    private static final MethodHandle MH_setBytes_length_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBuffer_offset_atIndex_ = ObjC.selector("setBuffer:offset:atIndex:");
    private static final MethodHandle MH_setBuffer_offset_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBufferOffset_atIndex_ = ObjC.selector("setBufferOffset:atIndex:");
    private static final MethodHandle MH_setBufferOffset_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBuffers_offsets_withRange_ = ObjC.selector("setBuffers:offsets:withRange:");
    private static final MethodHandle MH_setBuffers_offsets_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBuffer_offset_attributeStride_atIndex_ = ObjC.selector("setBuffer:offset:attributeStride:atIndex:");
    private static final MethodHandle MH_setBuffer_offset_attributeStride_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBuffers_offsets_attributeStrides_withRange_ = ObjC.selector("setBuffers:offsets:attributeStrides:withRange:");
    private static final MethodHandle MH_setBuffers_offsets_attributeStrides_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBufferOffset_attributeStride_atIndex_ = ObjC.selector("setBufferOffset:attributeStride:atIndex:");
    private static final MethodHandle MH_setBufferOffset_attributeStride_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBytes_length_attributeStride_atIndex_ = ObjC.selector("setBytes:length:attributeStride:atIndex:");
    private static final MethodHandle MH_setBytes_length_attributeStride_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVisibleFunctionTable_atBufferIndex_ = ObjC.selector("setVisibleFunctionTable:atBufferIndex:");
    private static final MethodHandle MH_setVisibleFunctionTable_atBufferIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVisibleFunctionTables_withBufferRange_ = ObjC.selector("setVisibleFunctionTables:withBufferRange:");
    private static final MethodHandle MH_setVisibleFunctionTables_withBufferRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setIntersectionFunctionTable_atBufferIndex_ = ObjC.selector("setIntersectionFunctionTable:atBufferIndex:");
    private static final MethodHandle MH_setIntersectionFunctionTable_atBufferIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setIntersectionFunctionTables_withBufferRange_ = ObjC.selector("setIntersectionFunctionTables:withBufferRange:");
    private static final MethodHandle MH_setIntersectionFunctionTables_withBufferRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAccelerationStructure_atBufferIndex_ = ObjC.selector("setAccelerationStructure:atBufferIndex:");
    private static final MethodHandle MH_setAccelerationStructure_atBufferIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTexture_atIndex_ = ObjC.selector("setTexture:atIndex:");
    private static final MethodHandle MH_setTexture_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTextures_withRange_ = ObjC.selector("setTextures:withRange:");
    private static final MethodHandle MH_setTextures_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSamplerState_atIndex_ = ObjC.selector("setSamplerState:atIndex:");
    private static final MethodHandle MH_setSamplerState_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSamplerStates_withRange_ = ObjC.selector("setSamplerStates:withRange:");
    private static final MethodHandle MH_setSamplerStates_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSamplerState_lodMinClamp_lodMaxClamp_atIndex_ = ObjC.selector("setSamplerState:lodMinClamp:lodMaxClamp:atIndex:");
    private static final MethodHandle MH_setSamplerState_lodMinClamp_lodMaxClamp_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_FLOAT, JAVA_FLOAT, JAVA_LONG));
    private static final long SEL_setSamplerStates_lodMinClamps_lodMaxClamps_withRange_ = ObjC.selector("setSamplerStates:lodMinClamps:lodMaxClamps:withRange:");
    private static final MethodHandle MH_setSamplerStates_lodMinClamps_lodMaxClamps_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setThreadgroupMemoryLength_atIndex_ = ObjC.selector("setThreadgroupMemoryLength:atIndex:");
    private static final MethodHandle MH_setThreadgroupMemoryLength_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setImageblockWidth_height_ = ObjC.selector("setImageblockWidth:height:");
    private static final MethodHandle MH_setImageblockWidth_height_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStageInRegion_ = ObjC.selector("setStageInRegion:");
    private static final MethodHandle MH_setStageInRegion_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStageInRegionWithIndirectBuffer_indirectBufferOffset_ = ObjC.selector("setStageInRegionWithIndirectBuffer:indirectBufferOffset:");
    private static final MethodHandle MH_setStageInRegionWithIndirectBuffer_indirectBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dispatchThreadgroups_threadsPerThreadgroup_ = ObjC.selector("dispatchThreadgroups:threadsPerThreadgroup:");
    private static final MethodHandle MH_dispatchThreadgroups_threadsPerThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dispatchThreadgroupsWithIndirectBuffer_indirectBufferOffset_threadsPerThreadgroup_ = ObjC.selector("dispatchThreadgroupsWithIndirectBuffer:indirectBufferOffset:threadsPerThreadgroup:");
    private static final MethodHandle MH_dispatchThreadgroupsWithIndirectBuffer_indirectBufferOffset_threadsPerThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dispatchThreads_threadsPerThreadgroup_ = ObjC.selector("dispatchThreads:threadsPerThreadgroup:");
    private static final MethodHandle MH_dispatchThreads_threadsPerThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final long SEL_executeCommandsInBuffer_withRange_ = ObjC.selector("executeCommandsInBuffer:withRange:");
    private static final MethodHandle MH_executeCommandsInBuffer_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_executeCommandsInBuffer_indirectBuffer_indirectBufferOffset_ = ObjC.selector("executeCommandsInBuffer:indirectBuffer:indirectBufferOffset:");
    private static final MethodHandle MH_executeCommandsInBuffer_indirectBuffer_indirectBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_memoryBarrierWithScope_ = ObjC.selector("memoryBarrierWithScope:");
    private static final MethodHandle MH_memoryBarrierWithScope_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_memoryBarrierWithResources_count_ = ObjC.selector("memoryBarrierWithResources:count:");
    private static final MethodHandle MH_memoryBarrierWithResources_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sampleCountersInBuffer_atSampleIndex_withBarrier_ = ObjC.selector("sampleCountersInBuffer:atSampleIndex:withBarrier:");
    private static final MethodHandle MH_sampleCountersInBuffer_atSampleIndex_withBarrier_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_dispatchType = ObjC.selector("dispatchType");
    private static final MethodHandle MH_dispatchType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLComputeCommandEncoder(final long handle) {
        super(handle);
    }

    /** {@code -[MTLComputeCommandEncoder setComputePipelineState:]} */
    public void setComputePipelineState(final MTLComputePipelineState state) {
        try {
            MH_setComputePipelineState_.invokeExact(this.handle, SEL_setComputePipelineState_, state.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setBytes:length:atIndex:]} */
    public void setBytes(final MemorySegment bytes, final long length, final long index) {
        try {
            MH_setBytes_length_atIndex_.invokeExact(this.handle, SEL_setBytes_length_atIndex_, bytes.address(), length, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setBuffer:offset:atIndex:]} */
    public void setBuffer(@Nullable final MTLBuffer buffer, final long offset, final long index) {
        try {
            MH_setBuffer_offset_atIndex_.invokeExact(this.handle, SEL_setBuffer_offset_atIndex_, buffer == null ? 0L : buffer.handle(), offset, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setBufferOffset:atIndex:]} */
    public void setBufferOffset(final long offset, final long index) {
        try {
            MH_setBufferOffset_atIndex_.invokeExact(this.handle, SEL_setBufferOffset_atIndex_, offset, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setBuffers:offsets:withRange:]} */
    public void setBuffers(final MemorySegment buffers, final MemorySegment offsets, final NSRange range) {
        try {
            MH_setBuffers_offsets_withRange_.invokeExact(this.handle, SEL_setBuffers_offsets_withRange_, buffers.address(), offsets.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setBuffer:offset:attributeStride:atIndex:]} */
    public void setBuffer(final MTLBuffer buffer, final long offset, final long stride, final long index) {
        try {
            MH_setBuffer_offset_attributeStride_atIndex_.invokeExact(this.handle, SEL_setBuffer_offset_attributeStride_atIndex_, buffer.handle(), offset, stride, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setBuffers:offsets:attributeStrides:withRange:]} */
    public void setBuffers(final MemorySegment buffers, final MemorySegment offsets, final MemorySegment strides, final NSRange range) {
        try {
            MH_setBuffers_offsets_attributeStrides_withRange_.invokeExact(this.handle, SEL_setBuffers_offsets_attributeStrides_withRange_, buffers.address(), offsets.address(), strides.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setBufferOffset:attributeStride:atIndex:]} */
    public void setBufferOffset(final long offset, final long stride, final long index) {
        try {
            MH_setBufferOffset_attributeStride_atIndex_.invokeExact(this.handle, SEL_setBufferOffset_attributeStride_atIndex_, offset, stride, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setBytes:length:attributeStride:atIndex:]} */
    public void setBytes(final MemorySegment bytes, final long length, final long stride, final long index) {
        try {
            MH_setBytes_length_attributeStride_atIndex_.invokeExact(this.handle, SEL_setBytes_length_attributeStride_atIndex_, bytes.address(), length, stride, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setVisibleFunctionTable:atBufferIndex:]} */
    public void setVisibleFunctionTable(@Nullable final MTLVisibleFunctionTable visibleFunctionTable, final long bufferIndex) {
        try {
            MH_setVisibleFunctionTable_atBufferIndex_.invokeExact(this.handle, SEL_setVisibleFunctionTable_atBufferIndex_, visibleFunctionTable == null ? 0L : visibleFunctionTable.handle(), bufferIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setVisibleFunctionTables:withBufferRange:]} */
    public void setVisibleFunctionTables(final MemorySegment visibleFunctionTables, final NSRange range) {
        try {
            MH_setVisibleFunctionTables_withBufferRange_.invokeExact(this.handle, SEL_setVisibleFunctionTables_withBufferRange_, visibleFunctionTables.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setIntersectionFunctionTable:atBufferIndex:]} */
    public void setIntersectionFunctionTable(@Nullable final MTLIntersectionFunctionTable intersectionFunctionTable, final long bufferIndex) {
        try {
            MH_setIntersectionFunctionTable_atBufferIndex_.invokeExact(this.handle, SEL_setIntersectionFunctionTable_atBufferIndex_, intersectionFunctionTable == null ? 0L : intersectionFunctionTable.handle(), bufferIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setIntersectionFunctionTables:withBufferRange:]} */
    public void setIntersectionFunctionTables(final MemorySegment intersectionFunctionTables, final NSRange range) {
        try {
            MH_setIntersectionFunctionTables_withBufferRange_.invokeExact(this.handle, SEL_setIntersectionFunctionTables_withBufferRange_, intersectionFunctionTables.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setAccelerationStructure:atBufferIndex:]} */
    public void setAccelerationStructure(@Nullable final MTLAccelerationStructure accelerationStructure, final long bufferIndex) {
        try {
            MH_setAccelerationStructure_atBufferIndex_.invokeExact(this.handle, SEL_setAccelerationStructure_atBufferIndex_, accelerationStructure == null ? 0L : accelerationStructure.handle(), bufferIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setTexture:atIndex:]} */
    public void setTexture(@Nullable final MTLTexture texture, final long index) {
        try {
            MH_setTexture_atIndex_.invokeExact(this.handle, SEL_setTexture_atIndex_, texture == null ? 0L : texture.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setTextures:withRange:]} */
    public void setTextures(final MemorySegment textures, final NSRange range) {
        try {
            MH_setTextures_withRange_.invokeExact(this.handle, SEL_setTextures_withRange_, textures.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setSamplerState:atIndex:]} */
    public void setSamplerState(@Nullable final MTLSamplerState sampler, final long index) {
        try {
            MH_setSamplerState_atIndex_.invokeExact(this.handle, SEL_setSamplerState_atIndex_, sampler == null ? 0L : sampler.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setSamplerStates:withRange:]} */
    public void setSamplerStates(final MemorySegment samplers, final NSRange range) {
        try {
            MH_setSamplerStates_withRange_.invokeExact(this.handle, SEL_setSamplerStates_withRange_, samplers.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setSamplerState:lodMinClamp:lodMaxClamp:atIndex:]} */
    public void setSamplerState(@Nullable final MTLSamplerState sampler, final float lodMinClamp, final float lodMaxClamp, final long index) {
        try {
            MH_setSamplerState_lodMinClamp_lodMaxClamp_atIndex_.invokeExact(this.handle, SEL_setSamplerState_lodMinClamp_lodMaxClamp_atIndex_, sampler == null ? 0L : sampler.handle(), lodMinClamp, lodMaxClamp, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setSamplerStates:lodMinClamps:lodMaxClamps:withRange:]} */
    public void setSamplerStates(final MemorySegment samplers, final MemorySegment lodMinClamps, final MemorySegment lodMaxClamps, final NSRange range) {
        try {
            MH_setSamplerStates_lodMinClamps_lodMaxClamps_withRange_.invokeExact(this.handle, SEL_setSamplerStates_lodMinClamps_lodMaxClamps_withRange_, samplers.address(), lodMinClamps.address(), lodMaxClamps.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setThreadgroupMemoryLength:atIndex:]} */
    public void setThreadgroupMemoryLength(final long length, final long index) {
        try {
            MH_setThreadgroupMemoryLength_atIndex_.invokeExact(this.handle, SEL_setThreadgroupMemoryLength_atIndex_, length, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setImageblockWidth:height:]} */
    public void setImageblockWidth(final long width, final long height) {
        try {
            MH_setImageblockWidth_height_.invokeExact(this.handle, SEL_setImageblockWidth_height_, width, height);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setStageInRegion:]} */
    public void setStageInRegion(final MTLRegion region) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setStageInRegion_.invokeExact(this.handle, SEL_setStageInRegion_, region.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder setStageInRegionWithIndirectBuffer:indirectBufferOffset:]} */
    public void setStageInRegionWithIndirectBuffer(final MTLBuffer indirectBuffer, final long indirectBufferOffset) {
        try {
            MH_setStageInRegionWithIndirectBuffer_indirectBufferOffset_.invokeExact(this.handle, SEL_setStageInRegionWithIndirectBuffer_indirectBufferOffset_, indirectBuffer.handle(), indirectBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder dispatchThreadgroups:threadsPerThreadgroup:]} */
    public void dispatchThreadgroups(final MTLSize threadgroupsPerGrid, final MTLSize threadsPerThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_dispatchThreadgroups_threadsPerThreadgroup_.invokeExact(this.handle, SEL_dispatchThreadgroups_threadsPerThreadgroup_, threadgroupsPerGrid.on(stack).address(), threadsPerThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder dispatchThreadgroupsWithIndirectBuffer:indirectBufferOffset:threadsPerThreadgroup:]} */
    public void dispatchThreadgroupsWithIndirectBuffer(final MTLBuffer indirectBuffer, final long indirectBufferOffset, final MTLSize threadsPerThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_dispatchThreadgroupsWithIndirectBuffer_indirectBufferOffset_threadsPerThreadgroup_.invokeExact(this.handle, SEL_dispatchThreadgroupsWithIndirectBuffer_indirectBufferOffset_threadsPerThreadgroup_, indirectBuffer.handle(), indirectBufferOffset, threadsPerThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder dispatchThreads:threadsPerThreadgroup:]} */
    public void dispatchThreads(final MTLSize threadsPerGrid, final MTLSize threadsPerThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_dispatchThreads_threadsPerThreadgroup_.invokeExact(this.handle, SEL_dispatchThreads_threadsPerThreadgroup_, threadsPerGrid.on(stack).address(), threadsPerThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder updateFence:]} */
    public void updateFence(final MTLFence fence) {
        try {
            MH_updateFence_.invokeExact(this.handle, SEL_updateFence_, fence.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder waitForFence:]} */
    public void waitForFence(final MTLFence fence) {
        try {
            MH_waitForFence_.invokeExact(this.handle, SEL_waitForFence_, fence.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLComputeCommandEncoder useResource:usage:]}
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
     * {@code -[MTLComputeCommandEncoder useResources:count:usage:]}
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

    /** {@code -[MTLComputeCommandEncoder useHeap:]} */
    public void useHeap(final MTLHeap heap) {
        try {
            MH_useHeap_.invokeExact(this.handle, SEL_useHeap_, heap.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder useHeaps:count:]} */
    public void useHeaps(final MemorySegment heaps, final long count) {
        try {
            MH_useHeaps_count_.invokeExact(this.handle, SEL_useHeaps_count_, heaps.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder executeCommandsInBuffer:withRange:]} */
    public void executeCommandsInBuffer(final MTLIndirectCommandBuffer indirectCommandBuffer, final NSRange executionRange) {
        try {
            MH_executeCommandsInBuffer_withRange_.invokeExact(this.handle, SEL_executeCommandsInBuffer_withRange_, indirectCommandBuffer.handle(), executionRange.location(), executionRange.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder executeCommandsInBuffer:indirectBuffer:indirectBufferOffset:]} */
    public void executeCommandsInBuffer(final MTLIndirectCommandBuffer indirectCommandbuffer, final MTLBuffer indirectRangeBuffer, final long indirectBufferOffset) {
        try {
            MH_executeCommandsInBuffer_indirectBuffer_indirectBufferOffset_.invokeExact(this.handle, SEL_executeCommandsInBuffer_indirectBuffer_indirectBufferOffset_, indirectCommandbuffer.handle(), indirectRangeBuffer.handle(), indirectBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLComputeCommandEncoder memoryBarrierWithScope:]}
     *
     * @param scope a combination of {@link MTLBarrierScope} flags
     */
    public void memoryBarrierWithScope(final long scope) {
        try {
            MH_memoryBarrierWithScope_.invokeExact(this.handle, SEL_memoryBarrierWithScope_, scope);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder memoryBarrierWithResources:count:]} */
    public void memoryBarrierWithResources(final MemorySegment resources, final long count) {
        try {
            MH_memoryBarrierWithResources_count_.invokeExact(this.handle, SEL_memoryBarrierWithResources_count_, resources.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder sampleCountersInBuffer:atSampleIndex:withBarrier:]} */
    public void sampleCountersInBuffer(final MTLCounterSampleBuffer sampleBuffer, final long sampleIndex, final boolean barrier) {
        try {
            MH_sampleCountersInBuffer_atSampleIndex_withBarrier_.invokeExact(this.handle, SEL_sampleCountersInBuffer_atSampleIndex_withBarrier_, sampleBuffer.handle(), sampleIndex, barrier);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputeCommandEncoder dispatchType]} */
    public MTLDispatchType dispatchType() {
        try {
            return MTLDispatchType.of((long) MH_dispatchType.invokeExact(this.handle, SEL_dispatchType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
