package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSRange;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4ComputeCommandEncoder}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4computecommandencoder">Apple documentation</a>
 */
public class MTL4ComputeCommandEncoder extends MTL4CommandEncoder {
    private static final long SEL_stages = ObjC.selector("stages");
    private static final MethodHandle MH_stages = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setComputePipelineState_ = ObjC.selector("setComputePipelineState:");
    private static final MethodHandle MH_setComputePipelineState_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setThreadgroupMemoryLength_atIndex_ = ObjC.selector("setThreadgroupMemoryLength:atIndex:");
    private static final MethodHandle MH_setThreadgroupMemoryLength_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setImageblockWidth_height_ = ObjC.selector("setImageblockWidth:height:");
    private static final MethodHandle MH_setImageblockWidth_height_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dispatchThreads_threadsPerThreadgroup_ = ObjC.selector("dispatchThreads:threadsPerThreadgroup:");
    private static final MethodHandle MH_dispatchThreads_threadsPerThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dispatchThreadgroups_threadsPerThreadgroup_ = ObjC.selector("dispatchThreadgroups:threadsPerThreadgroup:");
    private static final MethodHandle MH_dispatchThreadgroups_threadsPerThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dispatchThreadgroupsWithIndirectBuffer_threadsPerThreadgroup_ = ObjC.selector("dispatchThreadgroupsWithIndirectBuffer:threadsPerThreadgroup:");
    private static final MethodHandle MH_dispatchThreadgroupsWithIndirectBuffer_threadsPerThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dispatchThreadsWithIndirectBuffer_ = ObjC.selector("dispatchThreadsWithIndirectBuffer:");
    private static final MethodHandle MH_dispatchThreadsWithIndirectBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_executeCommandsInBuffer_withRange_ = ObjC.selector("executeCommandsInBuffer:withRange:");
    private static final MethodHandle MH_executeCommandsInBuffer_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_executeCommandsInBuffer_indirectBuffer_ = ObjC.selector("executeCommandsInBuffer:indirectBuffer:");
    private static final MethodHandle MH_executeCommandsInBuffer_indirectBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyFromTexture_toTexture_ = ObjC.selector("copyFromTexture:toTexture:");
    private static final MethodHandle MH_copyFromTexture_toTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyFromTexture_sourceSlice_sourceLevel_toTexture_destinationSlice_destinationLevel_sliceCount_levelCount_ = ObjC.selector("copyFromTexture:sourceSlice:sourceLevel:toTexture:destinationSlice:destinationLevel:sliceCount:levelCount:");
    private static final MethodHandle MH_copyFromTexture_sourceSlice_sourceLevel_toTexture_destinationSlice_destinationLevel_sliceCount_levelCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_ = ObjC.selector("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:");
    private static final MethodHandle MH_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toBuffer_destinationOffset_destinationBytesPerRow_destinationBytesPerImage_ = ObjC.selector("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:");
    private static final MethodHandle MH_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toBuffer_destinationOffset_destinationBytesPerRow_destinationBytesPerImage_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toBuffer_destinationOffset_destinationBytesPerRow_destinationBytesPerImage_options_ = ObjC.selector("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:options:");
    private static final MethodHandle MH_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toBuffer_destinationOffset_destinationBytesPerRow_destinationBytesPerImage_options_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyFromBuffer_sourceOffset_toBuffer_destinationOffset_size_ = ObjC.selector("copyFromBuffer:sourceOffset:toBuffer:destinationOffset:size:");
    private static final MethodHandle MH_copyFromBuffer_sourceOffset_toBuffer_destinationOffset_size_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyFromBuffer_sourceOffset_sourceBytesPerRow_sourceBytesPerImage_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_ = ObjC.selector("copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:");
    private static final MethodHandle MH_copyFromBuffer_sourceOffset_sourceBytesPerRow_sourceBytesPerImage_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyFromBuffer_sourceOffset_sourceBytesPerRow_sourceBytesPerImage_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_options_ = ObjC.selector("copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:options:");
    private static final MethodHandle MH_copyFromBuffer_sourceOffset_sourceBytesPerRow_sourceBytesPerImage_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_options_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyFromTensor_sourceOrigin_sourceDimensions_toTensor_destinationOrigin_destinationDimensions_ = ObjC.selector("copyFromTensor:sourceOrigin:sourceDimensions:toTensor:destinationOrigin:destinationDimensions:");
    private static final MethodHandle MH_copyFromTensor_sourceOrigin_sourceDimensions_toTensor_destinationOrigin_destinationDimensions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyFromTensor_sourceOrigin_sourceDimensions_sourcePlane_toTensor_destinationOrigin_destinationDimensions_destinationPlane_ = ObjC.selector("copyFromTensor:sourceOrigin:sourceDimensions:sourcePlane:toTensor:destinationOrigin:destinationDimensions:destinationPlane:");
    private static final MethodHandle MH_copyFromTensor_sourceOrigin_sourceDimensions_sourcePlane_toTensor_destinationOrigin_destinationDimensions_destinationPlane_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_generateMipmapsForTexture_ = ObjC.selector("generateMipmapsForTexture:");
    private static final MethodHandle MH_generateMipmapsForTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fillBuffer_range_value_ = ObjC.selector("fillBuffer:range:value:");
    private static final MethodHandle MH_fillBuffer_range_value_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BYTE));
    private static final long SEL_optimizeContentsForGPUAccess_ = ObjC.selector("optimizeContentsForGPUAccess:");
    private static final MethodHandle MH_optimizeContentsForGPUAccess_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_optimizeContentsForGPUAccess_slice_level_ = ObjC.selector("optimizeContentsForGPUAccess:slice:level:");
    private static final MethodHandle MH_optimizeContentsForGPUAccess_slice_level_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_optimizeContentsForCPUAccess_ = ObjC.selector("optimizeContentsForCPUAccess:");
    private static final MethodHandle MH_optimizeContentsForCPUAccess_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_optimizeContentsForCPUAccess_slice_level_ = ObjC.selector("optimizeContentsForCPUAccess:slice:level:");
    private static final MethodHandle MH_optimizeContentsForCPUAccess_slice_level_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resetCommandsInBuffer_withRange_ = ObjC.selector("resetCommandsInBuffer:withRange:");
    private static final MethodHandle MH_resetCommandsInBuffer_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyIndirectCommandBuffer_sourceRange_destination_destinationIndex_ = ObjC.selector("copyIndirectCommandBuffer:sourceRange:destination:destinationIndex:");
    private static final MethodHandle MH_copyIndirectCommandBuffer_sourceRange_destination_destinationIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_optimizeIndirectCommandBuffer_withRange_ = ObjC.selector("optimizeIndirectCommandBuffer:withRange:");
    private static final MethodHandle MH_optimizeIndirectCommandBuffer_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setArgumentTable_ = ObjC.selector("setArgumentTable:");
    private static final MethodHandle MH_setArgumentTable_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_buildAccelerationStructure_descriptor_scratchBuffer_ = ObjC.selector("buildAccelerationStructure:descriptor:scratchBuffer:");
    private static final MethodHandle MH_buildAccelerationStructure_descriptor_scratchBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_refitAccelerationStructure_descriptor_destination_scratchBuffer_ = ObjC.selector("refitAccelerationStructure:descriptor:destination:scratchBuffer:");
    private static final MethodHandle MH_refitAccelerationStructure_descriptor_destination_scratchBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_refitAccelerationStructure_descriptor_destination_scratchBuffer_options_ = ObjC.selector("refitAccelerationStructure:descriptor:destination:scratchBuffer:options:");
    private static final MethodHandle MH_refitAccelerationStructure_descriptor_destination_scratchBuffer_options_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyAccelerationStructure_toAccelerationStructure_ = ObjC.selector("copyAccelerationStructure:toAccelerationStructure:");
    private static final MethodHandle MH_copyAccelerationStructure_toAccelerationStructure_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_writeCompactedAccelerationStructureSize_toBuffer_ = ObjC.selector("writeCompactedAccelerationStructureSize:toBuffer:");
    private static final MethodHandle MH_writeCompactedAccelerationStructureSize_toBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyAndCompactAccelerationStructure_toAccelerationStructure_ = ObjC.selector("copyAndCompactAccelerationStructure:toAccelerationStructure:");
    private static final MethodHandle MH_copyAndCompactAccelerationStructure_toAccelerationStructure_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_writeTimestampWithGranularity_intoHeap_atIndex_ = ObjC.selector("writeTimestampWithGranularity:intoHeap:atIndex:");
    private static final MethodHandle MH_writeTimestampWithGranularity_intoHeap_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTL4ComputeCommandEncoder(final long handle) {
        super(handle);
    }

    /**
     * {@code -[MTL4ComputeCommandEncoder stages]}
     *
     * @return a combination of {@link MTLStages} flags
     */
    public long stages() {
        try {
            return (long) MH_stages.invokeExact(this.handle, SEL_stages);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder setComputePipelineState:]} */
    public void setComputePipelineState(final MTLComputePipelineState state) {
        try {
            MH_setComputePipelineState_.invokeExact(this.handle, SEL_setComputePipelineState_, state.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder setThreadgroupMemoryLength:atIndex:]} */
    public void setThreadgroupMemoryLength(final long length, final long index) {
        try {
            MH_setThreadgroupMemoryLength_atIndex_.invokeExact(this.handle, SEL_setThreadgroupMemoryLength_atIndex_, length, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder setImageblockWidth:height:]} */
    public void setImageblockWidth(final long width, final long height) {
        try {
            MH_setImageblockWidth_height_.invokeExact(this.handle, SEL_setImageblockWidth_height_, width, height);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder dispatchThreads:threadsPerThreadgroup:]} */
    public void dispatchThreads(final MTLSize threadsPerGrid, final MTLSize threadsPerThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_dispatchThreads_threadsPerThreadgroup_.invokeExact(this.handle, SEL_dispatchThreads_threadsPerThreadgroup_, threadsPerGrid.on(stack).address(), threadsPerThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder dispatchThreadgroups:threadsPerThreadgroup:]} */
    public void dispatchThreadgroups(final MTLSize threadgroupsPerGrid, final MTLSize threadsPerThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_dispatchThreadgroups_threadsPerThreadgroup_.invokeExact(this.handle, SEL_dispatchThreadgroups_threadsPerThreadgroup_, threadgroupsPerGrid.on(stack).address(), threadsPerThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder dispatchThreadgroupsWithIndirectBuffer:threadsPerThreadgroup:]} */
    public void dispatchThreadgroupsWithIndirectBuffer(final long indirectBuffer, final MTLSize threadsPerThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_dispatchThreadgroupsWithIndirectBuffer_threadsPerThreadgroup_.invokeExact(this.handle, SEL_dispatchThreadgroupsWithIndirectBuffer_threadsPerThreadgroup_, indirectBuffer, threadsPerThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder dispatchThreadsWithIndirectBuffer:]} */
    public void dispatchThreadsWithIndirectBuffer(final long indirectBuffer) {
        try {
            MH_dispatchThreadsWithIndirectBuffer_.invokeExact(this.handle, SEL_dispatchThreadsWithIndirectBuffer_, indirectBuffer);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder executeCommandsInBuffer:withRange:]} */
    public void executeCommandsInBuffer(final MTLIndirectCommandBuffer indirectCommandBuffer, final NSRange executionRange) {
        try {
            MH_executeCommandsInBuffer_withRange_.invokeExact(this.handle, SEL_executeCommandsInBuffer_withRange_, indirectCommandBuffer.handle(), executionRange.location(), executionRange.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder executeCommandsInBuffer:indirectBuffer:]} */
    public void executeCommandsInBuffer(final MTLIndirectCommandBuffer indirectCommandbuffer, final long indirectRangeBuffer) {
        try {
            MH_executeCommandsInBuffer_indirectBuffer_.invokeExact(this.handle, SEL_executeCommandsInBuffer_indirectBuffer_, indirectCommandbuffer.handle(), indirectRangeBuffer);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder copyFromTexture:toTexture:]} */
    public void copyFromTexture(final MTLTexture sourceTexture, final MTLTexture destinationTexture) {
        try {
            MH_copyFromTexture_toTexture_.invokeExact(this.handle, SEL_copyFromTexture_toTexture_, sourceTexture.handle(), destinationTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder copyFromTexture:sourceSlice:sourceLevel:toTexture:destinationSlice:destinationLevel:sliceCount:levelCount:]} */
    public void copyFromTexture(final MTLTexture sourceTexture, final long sourceSlice, final long sourceLevel, final MTLTexture destinationTexture, final long destinationSlice, final long destinationLevel, final long sliceCount, final long levelCount) {
        try {
            MH_copyFromTexture_sourceSlice_sourceLevel_toTexture_destinationSlice_destinationLevel_sliceCount_levelCount_.invokeExact(this.handle, SEL_copyFromTexture_sourceSlice_sourceLevel_toTexture_destinationSlice_destinationLevel_sliceCount_levelCount_, sourceTexture.handle(), sourceSlice, sourceLevel, destinationTexture.handle(), destinationSlice, destinationLevel, sliceCount, levelCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:]} */
    public void copyFromTexture(final MTLTexture sourceTexture, final long sourceSlice, final long sourceLevel, final MTLOrigin sourceOrigin, final MTLSize sourceSize, final MTLTexture destinationTexture, final long destinationSlice, final long destinationLevel, final MTLOrigin destinationOrigin) {
        try (NativeStack stack = NativeStack.push()) {
            MH_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_.invokeExact(this.handle, SEL_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_, sourceTexture.handle(), sourceSlice, sourceLevel, sourceOrigin.on(stack).address(), sourceSize.on(stack).address(), destinationTexture.handle(), destinationSlice, destinationLevel, destinationOrigin.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:]} */
    public void copyFromTexture(final MTLTexture sourceTexture, final long sourceSlice, final long sourceLevel, final MTLOrigin sourceOrigin, final MTLSize sourceSize, final MTLBuffer destinationBuffer, final long destinationOffset, final long destinationBytesPerRow, final long destinationBytesPerImage) {
        try (NativeStack stack = NativeStack.push()) {
            MH_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toBuffer_destinationOffset_destinationBytesPerRow_destinationBytesPerImage_.invokeExact(this.handle, SEL_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toBuffer_destinationOffset_destinationBytesPerRow_destinationBytesPerImage_, sourceTexture.handle(), sourceSlice, sourceLevel, sourceOrigin.on(stack).address(), sourceSize.on(stack).address(), destinationBuffer.handle(), destinationOffset, destinationBytesPerRow, destinationBytesPerImage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4ComputeCommandEncoder copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:options:]}
     *
     * @param options a combination of {@link MTLBlitOption} flags
     */
    public void copyFromTexture(final MTLTexture sourceTexture, final long sourceSlice, final long sourceLevel, final MTLOrigin sourceOrigin, final MTLSize sourceSize, final MTLBuffer destinationBuffer, final long destinationOffset, final long destinationBytesPerRow, final long destinationBytesPerImage, final long options) {
        try (NativeStack stack = NativeStack.push()) {
            MH_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toBuffer_destinationOffset_destinationBytesPerRow_destinationBytesPerImage_options_.invokeExact(this.handle, SEL_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toBuffer_destinationOffset_destinationBytesPerRow_destinationBytesPerImage_options_, sourceTexture.handle(), sourceSlice, sourceLevel, sourceOrigin.on(stack).address(), sourceSize.on(stack).address(), destinationBuffer.handle(), destinationOffset, destinationBytesPerRow, destinationBytesPerImage, options);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder copyFromBuffer:sourceOffset:toBuffer:destinationOffset:size:]} */
    public void copyFromBuffer(final MTLBuffer sourceBuffer, final long sourceOffset, final MTLBuffer destinationBuffer, final long destinationOffset, final long size) {
        try {
            MH_copyFromBuffer_sourceOffset_toBuffer_destinationOffset_size_.invokeExact(this.handle, SEL_copyFromBuffer_sourceOffset_toBuffer_destinationOffset_size_, sourceBuffer.handle(), sourceOffset, destinationBuffer.handle(), destinationOffset, size);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:]} */
    public void copyFromBuffer(final MTLBuffer sourceBuffer, final long sourceOffset, final long sourceBytesPerRow, final long sourceBytesPerImage, final MTLSize sourceSize, final MTLTexture destinationTexture, final long destinationSlice, final long destinationLevel, final MTLOrigin destinationOrigin) {
        try (NativeStack stack = NativeStack.push()) {
            MH_copyFromBuffer_sourceOffset_sourceBytesPerRow_sourceBytesPerImage_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_.invokeExact(this.handle, SEL_copyFromBuffer_sourceOffset_sourceBytesPerRow_sourceBytesPerImage_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_, sourceBuffer.handle(), sourceOffset, sourceBytesPerRow, sourceBytesPerImage, sourceSize.on(stack).address(), destinationTexture.handle(), destinationSlice, destinationLevel, destinationOrigin.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4ComputeCommandEncoder copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:options:]}
     *
     * @param options a combination of {@link MTLBlitOption} flags
     */
    public void copyFromBuffer(final MTLBuffer sourceBuffer, final long sourceOffset, final long sourceBytesPerRow, final long sourceBytesPerImage, final MTLSize sourceSize, final MTLTexture destinationTexture, final long destinationSlice, final long destinationLevel, final MTLOrigin destinationOrigin, final long options) {
        try (NativeStack stack = NativeStack.push()) {
            MH_copyFromBuffer_sourceOffset_sourceBytesPerRow_sourceBytesPerImage_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_options_.invokeExact(this.handle, SEL_copyFromBuffer_sourceOffset_sourceBytesPerRow_sourceBytesPerImage_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_options_, sourceBuffer.handle(), sourceOffset, sourceBytesPerRow, sourceBytesPerImage, sourceSize.on(stack).address(), destinationTexture.handle(), destinationSlice, destinationLevel, destinationOrigin.on(stack).address(), options);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder copyFromTensor:sourceOrigin:sourceDimensions:toTensor:destinationOrigin:destinationDimensions:]} */
    public void copyFromTensor(final MTLTensor sourceTensor, final MTLTensorExtents sourceOrigin, final MTLTensorExtents sourceDimensions, final MTLTensor destinationTensor, final MTLTensorExtents destinationOrigin, final MTLTensorExtents destinationDimensions) {
        try {
            MH_copyFromTensor_sourceOrigin_sourceDimensions_toTensor_destinationOrigin_destinationDimensions_.invokeExact(this.handle, SEL_copyFromTensor_sourceOrigin_sourceDimensions_toTensor_destinationOrigin_destinationDimensions_, sourceTensor.handle(), sourceOrigin.handle(), sourceDimensions.handle(), destinationTensor.handle(), destinationOrigin.handle(), destinationDimensions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder copyFromTensor:sourceOrigin:sourceDimensions:sourcePlane:toTensor:destinationOrigin:destinationDimensions:destinationPlane:]} */
    public void copyFromTensor(final MTLTensor sourceTensor, final MTLTensorExtents sourceOrigin, final MTLTensorExtents sourceDimensions, final MTLTensorPlaneType sourcePlane, final MTLTensor destinationTensor, final MTLTensorExtents destinationOrigin, final MTLTensorExtents destinationDimensions, final MTLTensorPlaneType destinationPlane) {
        try {
            MH_copyFromTensor_sourceOrigin_sourceDimensions_sourcePlane_toTensor_destinationOrigin_destinationDimensions_destinationPlane_.invokeExact(this.handle, SEL_copyFromTensor_sourceOrigin_sourceDimensions_sourcePlane_toTensor_destinationOrigin_destinationDimensions_destinationPlane_, sourceTensor.handle(), sourceOrigin.handle(), sourceDimensions.handle(), sourcePlane.value, destinationTensor.handle(), destinationOrigin.handle(), destinationDimensions.handle(), destinationPlane.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder generateMipmapsForTexture:]} */
    public void generateMipmapsForTexture(final MTLTexture texture) {
        try {
            MH_generateMipmapsForTexture_.invokeExact(this.handle, SEL_generateMipmapsForTexture_, texture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder fillBuffer:range:value:]} */
    public void fillBuffer(final MTLBuffer buffer, final NSRange range, final byte value) {
        try {
            MH_fillBuffer_range_value_.invokeExact(this.handle, SEL_fillBuffer_range_value_, buffer.handle(), range.location(), range.length(), value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder optimizeContentsForGPUAccess:]} */
    public void optimizeContentsForGPUAccess(final MTLTexture texture) {
        try {
            MH_optimizeContentsForGPUAccess_.invokeExact(this.handle, SEL_optimizeContentsForGPUAccess_, texture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder optimizeContentsForGPUAccess:slice:level:]} */
    public void optimizeContentsForGPUAccess(final MTLTexture texture, final long slice, final long level) {
        try {
            MH_optimizeContentsForGPUAccess_slice_level_.invokeExact(this.handle, SEL_optimizeContentsForGPUAccess_slice_level_, texture.handle(), slice, level);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder optimizeContentsForCPUAccess:]} */
    public void optimizeContentsForCPUAccess(final MTLTexture texture) {
        try {
            MH_optimizeContentsForCPUAccess_.invokeExact(this.handle, SEL_optimizeContentsForCPUAccess_, texture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder optimizeContentsForCPUAccess:slice:level:]} */
    public void optimizeContentsForCPUAccess(final MTLTexture texture, final long slice, final long level) {
        try {
            MH_optimizeContentsForCPUAccess_slice_level_.invokeExact(this.handle, SEL_optimizeContentsForCPUAccess_slice_level_, texture.handle(), slice, level);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder resetCommandsInBuffer:withRange:]} */
    public void resetCommandsInBuffer(final MTLIndirectCommandBuffer buffer, final NSRange range) {
        try {
            MH_resetCommandsInBuffer_withRange_.invokeExact(this.handle, SEL_resetCommandsInBuffer_withRange_, buffer.handle(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder copyIndirectCommandBuffer:sourceRange:destination:destinationIndex:]} */
    public void copyIndirectCommandBuffer(final MTLIndirectCommandBuffer source, final NSRange sourceRange, final MTLIndirectCommandBuffer destination, final long destinationIndex) {
        try {
            MH_copyIndirectCommandBuffer_sourceRange_destination_destinationIndex_.invokeExact(this.handle, SEL_copyIndirectCommandBuffer_sourceRange_destination_destinationIndex_, source.handle(), sourceRange.location(), sourceRange.length(), destination.handle(), destinationIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder optimizeIndirectCommandBuffer:withRange:]} */
    public void optimizeIndirectCommandBuffer(final MTLIndirectCommandBuffer indirectCommandBuffer, final NSRange range) {
        try {
            MH_optimizeIndirectCommandBuffer_withRange_.invokeExact(this.handle, SEL_optimizeIndirectCommandBuffer_withRange_, indirectCommandBuffer.handle(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder setArgumentTable:]} */
    public void setArgumentTable(@Nullable final MTL4ArgumentTable argumentTable) {
        try {
            MH_setArgumentTable_.invokeExact(this.handle, SEL_setArgumentTable_, argumentTable == null ? 0L : argumentTable.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder buildAccelerationStructure:descriptor:scratchBuffer:]} */
    public void buildAccelerationStructure(final MTLAccelerationStructure accelerationStructure, final MTL4AccelerationStructureDescriptor descriptor, final MTL4BufferRange scratchBuffer) {
        try {
            MH_buildAccelerationStructure_descriptor_scratchBuffer_.invokeExact(this.handle, SEL_buildAccelerationStructure_descriptor_scratchBuffer_, accelerationStructure.handle(), descriptor.handle(), scratchBuffer.bufferAddress(), scratchBuffer.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder refitAccelerationStructure:descriptor:destination:scratchBuffer:]} */
    public void refitAccelerationStructure(final MTLAccelerationStructure sourceAccelerationStructure, final MTL4AccelerationStructureDescriptor descriptor, @Nullable final MTLAccelerationStructure destinationAccelerationStructure, final MTL4BufferRange scratchBuffer) {
        try {
            MH_refitAccelerationStructure_descriptor_destination_scratchBuffer_.invokeExact(this.handle, SEL_refitAccelerationStructure_descriptor_destination_scratchBuffer_, sourceAccelerationStructure.handle(), descriptor.handle(), destinationAccelerationStructure == null ? 0L : destinationAccelerationStructure.handle(), scratchBuffer.bufferAddress(), scratchBuffer.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4ComputeCommandEncoder refitAccelerationStructure:descriptor:destination:scratchBuffer:options:]}
     *
     * @param options a combination of {@link MTLAccelerationStructureRefitOptions} flags
     */
    public void refitAccelerationStructure(final MTLAccelerationStructure sourceAccelerationStructure, final MTL4AccelerationStructureDescriptor descriptor, @Nullable final MTLAccelerationStructure destinationAccelerationStructure, final MTL4BufferRange scratchBuffer, final long options) {
        try {
            MH_refitAccelerationStructure_descriptor_destination_scratchBuffer_options_.invokeExact(this.handle, SEL_refitAccelerationStructure_descriptor_destination_scratchBuffer_options_, sourceAccelerationStructure.handle(), descriptor.handle(), destinationAccelerationStructure == null ? 0L : destinationAccelerationStructure.handle(), scratchBuffer.bufferAddress(), scratchBuffer.length(), options);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder copyAccelerationStructure:toAccelerationStructure:]} */
    public void copyAccelerationStructure(final MTLAccelerationStructure sourceAccelerationStructure, final MTLAccelerationStructure destinationAccelerationStructure) {
        try {
            MH_copyAccelerationStructure_toAccelerationStructure_.invokeExact(this.handle, SEL_copyAccelerationStructure_toAccelerationStructure_, sourceAccelerationStructure.handle(), destinationAccelerationStructure.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder writeCompactedAccelerationStructureSize:toBuffer:]} */
    public void writeCompactedAccelerationStructureSize(final MTLAccelerationStructure accelerationStructure, final MTL4BufferRange buffer) {
        try {
            MH_writeCompactedAccelerationStructureSize_toBuffer_.invokeExact(this.handle, SEL_writeCompactedAccelerationStructureSize_toBuffer_, accelerationStructure.handle(), buffer.bufferAddress(), buffer.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder copyAndCompactAccelerationStructure:toAccelerationStructure:]} */
    public void copyAndCompactAccelerationStructure(final MTLAccelerationStructure sourceAccelerationStructure, final MTLAccelerationStructure destinationAccelerationStructure) {
        try {
            MH_copyAndCompactAccelerationStructure_toAccelerationStructure_.invokeExact(this.handle, SEL_copyAndCompactAccelerationStructure_toAccelerationStructure_, sourceAccelerationStructure.handle(), destinationAccelerationStructure.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputeCommandEncoder writeTimestampWithGranularity:intoHeap:atIndex:]} */
    public void writeTimestamp(final MTL4TimestampGranularity granularity, final MTL4CounterHeap counterHeap, final long index) {
        try {
            MH_writeTimestampWithGranularity_intoHeap_atIndex_.invokeExact(this.handle, SEL_writeTimestampWithGranularity_intoHeap_atIndex_, granularity.value, counterHeap.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
