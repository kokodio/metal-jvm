package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSRange;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLBlitCommandEncoder}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlblitcommandencoder">Apple documentation</a>
 */
public class MTLBlitCommandEncoder extends MTLCommandEncoder {
    private static final long SEL_synchronizeResource_ = ObjC.selector("synchronizeResource:");
    private static final MethodHandle MH_synchronizeResource_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_synchronizeTexture_slice_level_ = ObjC.selector("synchronizeTexture:slice:level:");
    private static final MethodHandle MH_synchronizeTexture_slice_level_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_ = ObjC.selector("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:");
    private static final MethodHandle MH_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyFromBuffer_sourceOffset_sourceBytesPerRow_sourceBytesPerImage_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_ = ObjC.selector("copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:");
    private static final MethodHandle MH_copyFromBuffer_sourceOffset_sourceBytesPerRow_sourceBytesPerImage_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyFromBuffer_sourceOffset_sourceBytesPerRow_sourceBytesPerImage_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_options_ = ObjC.selector("copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:options:");
    private static final MethodHandle MH_copyFromBuffer_sourceOffset_sourceBytesPerRow_sourceBytesPerImage_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_options_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toBuffer_destinationOffset_destinationBytesPerRow_destinationBytesPerImage_ = ObjC.selector("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:");
    private static final MethodHandle MH_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toBuffer_destinationOffset_destinationBytesPerRow_destinationBytesPerImage_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toBuffer_destinationOffset_destinationBytesPerRow_destinationBytesPerImage_options_ = ObjC.selector("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:options:");
    private static final MethodHandle MH_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toBuffer_destinationOffset_destinationBytesPerRow_destinationBytesPerImage_options_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_generateMipmapsForTexture_ = ObjC.selector("generateMipmapsForTexture:");
    private static final MethodHandle MH_generateMipmapsForTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fillBuffer_range_value_ = ObjC.selector("fillBuffer:range:value:");
    private static final MethodHandle MH_fillBuffer_range_value_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BYTE));
    private static final long SEL_copyFromTexture_sourceSlice_sourceLevel_toTexture_destinationSlice_destinationLevel_sliceCount_levelCount_ = ObjC.selector("copyFromTexture:sourceSlice:sourceLevel:toTexture:destinationSlice:destinationLevel:sliceCount:levelCount:");
    private static final MethodHandle MH_copyFromTexture_sourceSlice_sourceLevel_toTexture_destinationSlice_destinationLevel_sliceCount_levelCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyFromTexture_toTexture_ = ObjC.selector("copyFromTexture:toTexture:");
    private static final MethodHandle MH_copyFromTexture_toTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyFromBuffer_sourceOffset_toBuffer_destinationOffset_size_ = ObjC.selector("copyFromBuffer:sourceOffset:toBuffer:destinationOffset:size:");
    private static final MethodHandle MH_copyFromBuffer_sourceOffset_toBuffer_destinationOffset_size_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_updateFence_ = ObjC.selector("updateFence:");
    private static final MethodHandle MH_updateFence_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_waitForFence_ = ObjC.selector("waitForFence:");
    private static final MethodHandle MH_waitForFence_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getTextureAccessCounters_region_mipLevel_slice_resetCounters_countersBuffer_countersBufferOffset_ = ObjC.selector("getTextureAccessCounters:region:mipLevel:slice:resetCounters:countersBuffer:countersBufferOffset:");
    private static final MethodHandle MH_getTextureAccessCounters_region_mipLevel_slice_resetCounters_countersBuffer_countersBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resetTextureAccessCounters_region_mipLevel_slice_ = ObjC.selector("resetTextureAccessCounters:region:mipLevel:slice:");
    private static final MethodHandle MH_resetTextureAccessCounters_region_mipLevel_slice_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final long SEL_sampleCountersInBuffer_atSampleIndex_withBarrier_ = ObjC.selector("sampleCountersInBuffer:atSampleIndex:withBarrier:");
    private static final MethodHandle MH_sampleCountersInBuffer_atSampleIndex_withBarrier_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_resolveCounters_inRange_destinationBuffer_destinationOffset_ = ObjC.selector("resolveCounters:inRange:destinationBuffer:destinationOffset:");
    private static final MethodHandle MH_resolveCounters_inRange_destinationBuffer_destinationOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyFromTensor_sourceOrigin_sourceDimensions_toTensor_destinationOrigin_destinationDimensions_ = ObjC.selector("copyFromTensor:sourceOrigin:sourceDimensions:toTensor:destinationOrigin:destinationDimensions:");
    private static final MethodHandle MH_copyFromTensor_sourceOrigin_sourceDimensions_toTensor_destinationOrigin_destinationDimensions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyFromTensor_sourceOrigin_sourceDimensions_sourcePlane_toTensor_destinationOrigin_destinationDimensions_destinationPlane_ = ObjC.selector("copyFromTensor:sourceOrigin:sourceDimensions:sourcePlane:toTensor:destinationOrigin:destinationDimensions:destinationPlane:");
    private static final MethodHandle MH_copyFromTensor_sourceOrigin_sourceDimensions_sourcePlane_toTensor_destinationOrigin_destinationDimensions_destinationPlane_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLBlitCommandEncoder(final long handle) {
        super(handle);
    }

    /** {@code -[MTLBlitCommandEncoder synchronizeResource:]} */
    public void synchronizeResource(final MTLResource resource) {
        try {
            MH_synchronizeResource_.invokeExact(this.handle, SEL_synchronizeResource_, resource.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder synchronizeTexture:slice:level:]} */
    public void synchronizeTexture(final MTLTexture texture, final long slice, final long level) {
        try {
            MH_synchronizeTexture_slice_level_.invokeExact(this.handle, SEL_synchronizeTexture_slice_level_, texture.handle(), slice, level);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:]} */
    public void copyFromTexture(final MTLTexture sourceTexture, final long sourceSlice, final long sourceLevel, final MTLOrigin sourceOrigin, final MTLSize sourceSize, final MTLTexture destinationTexture, final long destinationSlice, final long destinationLevel, final MTLOrigin destinationOrigin) {
        try (NativeStack stack = NativeStack.push()) {
            MH_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_.invokeExact(this.handle, SEL_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_, sourceTexture.handle(), sourceSlice, sourceLevel, sourceOrigin.on(stack).address(), sourceSize.on(stack).address(), destinationTexture.handle(), destinationSlice, destinationLevel, destinationOrigin.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:]} */
    public void copyFromBuffer(final MTLBuffer sourceBuffer, final long sourceOffset, final long sourceBytesPerRow, final long sourceBytesPerImage, final MTLSize sourceSize, final MTLTexture destinationTexture, final long destinationSlice, final long destinationLevel, final MTLOrigin destinationOrigin) {
        try (NativeStack stack = NativeStack.push()) {
            MH_copyFromBuffer_sourceOffset_sourceBytesPerRow_sourceBytesPerImage_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_.invokeExact(this.handle, SEL_copyFromBuffer_sourceOffset_sourceBytesPerRow_sourceBytesPerImage_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_, sourceBuffer.handle(), sourceOffset, sourceBytesPerRow, sourceBytesPerImage, sourceSize.on(stack).address(), destinationTexture.handle(), destinationSlice, destinationLevel, destinationOrigin.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLBlitCommandEncoder copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:options:]}
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

    /** {@code -[MTLBlitCommandEncoder copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:]} */
    public void copyFromTexture(final MTLTexture sourceTexture, final long sourceSlice, final long sourceLevel, final MTLOrigin sourceOrigin, final MTLSize sourceSize, final MTLBuffer destinationBuffer, final long destinationOffset, final long destinationBytesPerRow, final long destinationBytesPerImage) {
        try (NativeStack stack = NativeStack.push()) {
            MH_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toBuffer_destinationOffset_destinationBytesPerRow_destinationBytesPerImage_.invokeExact(this.handle, SEL_copyFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toBuffer_destinationOffset_destinationBytesPerRow_destinationBytesPerImage_, sourceTexture.handle(), sourceSlice, sourceLevel, sourceOrigin.on(stack).address(), sourceSize.on(stack).address(), destinationBuffer.handle(), destinationOffset, destinationBytesPerRow, destinationBytesPerImage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLBlitCommandEncoder copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:options:]}
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

    /** {@code -[MTLBlitCommandEncoder generateMipmapsForTexture:]} */
    public void generateMipmapsForTexture(final MTLTexture texture) {
        try {
            MH_generateMipmapsForTexture_.invokeExact(this.handle, SEL_generateMipmapsForTexture_, texture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder fillBuffer:range:value:]} */
    public void fillBuffer(final MTLBuffer buffer, final NSRange range, final byte value) {
        try {
            MH_fillBuffer_range_value_.invokeExact(this.handle, SEL_fillBuffer_range_value_, buffer.handle(), range.location(), range.length(), value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder copyFromTexture:sourceSlice:sourceLevel:toTexture:destinationSlice:destinationLevel:sliceCount:levelCount:]} */
    public void copyFromTexture(final MTLTexture sourceTexture, final long sourceSlice, final long sourceLevel, final MTLTexture destinationTexture, final long destinationSlice, final long destinationLevel, final long sliceCount, final long levelCount) {
        try {
            MH_copyFromTexture_sourceSlice_sourceLevel_toTexture_destinationSlice_destinationLevel_sliceCount_levelCount_.invokeExact(this.handle, SEL_copyFromTexture_sourceSlice_sourceLevel_toTexture_destinationSlice_destinationLevel_sliceCount_levelCount_, sourceTexture.handle(), sourceSlice, sourceLevel, destinationTexture.handle(), destinationSlice, destinationLevel, sliceCount, levelCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder copyFromTexture:toTexture:]} */
    public void copyFromTexture(final MTLTexture sourceTexture, final MTLTexture destinationTexture) {
        try {
            MH_copyFromTexture_toTexture_.invokeExact(this.handle, SEL_copyFromTexture_toTexture_, sourceTexture.handle(), destinationTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder copyFromBuffer:sourceOffset:toBuffer:destinationOffset:size:]} */
    public void copyFromBuffer(final MTLBuffer sourceBuffer, final long sourceOffset, final MTLBuffer destinationBuffer, final long destinationOffset, final long size) {
        try {
            MH_copyFromBuffer_sourceOffset_toBuffer_destinationOffset_size_.invokeExact(this.handle, SEL_copyFromBuffer_sourceOffset_toBuffer_destinationOffset_size_, sourceBuffer.handle(), sourceOffset, destinationBuffer.handle(), destinationOffset, size);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder updateFence:]} */
    public void updateFence(final MTLFence fence) {
        try {
            MH_updateFence_.invokeExact(this.handle, SEL_updateFence_, fence.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder waitForFence:]} */
    public void waitForFence(final MTLFence fence) {
        try {
            MH_waitForFence_.invokeExact(this.handle, SEL_waitForFence_, fence.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder getTextureAccessCounters:region:mipLevel:slice:resetCounters:countersBuffer:countersBufferOffset:]} */
    public void getTextureAccessCounters(final MTLTexture texture, final MTLRegion region, final long mipLevel, final long slice, final boolean resetCounters, final MTLBuffer countersBuffer, final long countersBufferOffset) {
        try (NativeStack stack = NativeStack.push()) {
            MH_getTextureAccessCounters_region_mipLevel_slice_resetCounters_countersBuffer_countersBufferOffset_.invokeExact(this.handle, SEL_getTextureAccessCounters_region_mipLevel_slice_resetCounters_countersBuffer_countersBufferOffset_, texture.handle(), region.on(stack).address(), mipLevel, slice, resetCounters, countersBuffer.handle(), countersBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder resetTextureAccessCounters:region:mipLevel:slice:]} */
    public void resetTextureAccessCounters(final MTLTexture texture, final MTLRegion region, final long mipLevel, final long slice) {
        try (NativeStack stack = NativeStack.push()) {
            MH_resetTextureAccessCounters_region_mipLevel_slice_.invokeExact(this.handle, SEL_resetTextureAccessCounters_region_mipLevel_slice_, texture.handle(), region.on(stack).address(), mipLevel, slice);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder optimizeContentsForGPUAccess:]} */
    public void optimizeContentsForGPUAccess(final MTLTexture texture) {
        try {
            MH_optimizeContentsForGPUAccess_.invokeExact(this.handle, SEL_optimizeContentsForGPUAccess_, texture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder optimizeContentsForGPUAccess:slice:level:]} */
    public void optimizeContentsForGPUAccess(final MTLTexture texture, final long slice, final long level) {
        try {
            MH_optimizeContentsForGPUAccess_slice_level_.invokeExact(this.handle, SEL_optimizeContentsForGPUAccess_slice_level_, texture.handle(), slice, level);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder optimizeContentsForCPUAccess:]} */
    public void optimizeContentsForCPUAccess(final MTLTexture texture) {
        try {
            MH_optimizeContentsForCPUAccess_.invokeExact(this.handle, SEL_optimizeContentsForCPUAccess_, texture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder optimizeContentsForCPUAccess:slice:level:]} */
    public void optimizeContentsForCPUAccess(final MTLTexture texture, final long slice, final long level) {
        try {
            MH_optimizeContentsForCPUAccess_slice_level_.invokeExact(this.handle, SEL_optimizeContentsForCPUAccess_slice_level_, texture.handle(), slice, level);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder resetCommandsInBuffer:withRange:]} */
    public void resetCommandsInBuffer(final MTLIndirectCommandBuffer buffer, final NSRange range) {
        try {
            MH_resetCommandsInBuffer_withRange_.invokeExact(this.handle, SEL_resetCommandsInBuffer_withRange_, buffer.handle(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder copyIndirectCommandBuffer:sourceRange:destination:destinationIndex:]} */
    public void copyIndirectCommandBuffer(final MTLIndirectCommandBuffer source, final NSRange sourceRange, final MTLIndirectCommandBuffer destination, final long destinationIndex) {
        try {
            MH_copyIndirectCommandBuffer_sourceRange_destination_destinationIndex_.invokeExact(this.handle, SEL_copyIndirectCommandBuffer_sourceRange_destination_destinationIndex_, source.handle(), sourceRange.location(), sourceRange.length(), destination.handle(), destinationIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder optimizeIndirectCommandBuffer:withRange:]} */
    public void optimizeIndirectCommandBuffer(final MTLIndirectCommandBuffer indirectCommandBuffer, final NSRange range) {
        try {
            MH_optimizeIndirectCommandBuffer_withRange_.invokeExact(this.handle, SEL_optimizeIndirectCommandBuffer_withRange_, indirectCommandBuffer.handle(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder sampleCountersInBuffer:atSampleIndex:withBarrier:]} */
    public void sampleCountersInBuffer(final MTLCounterSampleBuffer sampleBuffer, final long sampleIndex, final boolean barrier) {
        try {
            MH_sampleCountersInBuffer_atSampleIndex_withBarrier_.invokeExact(this.handle, SEL_sampleCountersInBuffer_atSampleIndex_withBarrier_, sampleBuffer.handle(), sampleIndex, barrier);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder resolveCounters:inRange:destinationBuffer:destinationOffset:]} */
    public void resolveCounters(final MTLCounterSampleBuffer sampleBuffer, final NSRange range, final MTLBuffer destinationBuffer, final long destinationOffset) {
        try {
            MH_resolveCounters_inRange_destinationBuffer_destinationOffset_.invokeExact(this.handle, SEL_resolveCounters_inRange_destinationBuffer_destinationOffset_, sampleBuffer.handle(), range.location(), range.length(), destinationBuffer.handle(), destinationOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder copyFromTensor:sourceOrigin:sourceDimensions:toTensor:destinationOrigin:destinationDimensions:]} */
    public void copyFromTensor(final MTLTensor sourceTensor, final MTLTensorExtents sourceOrigin, final MTLTensorExtents sourceDimensions, final MTLTensor destinationTensor, final MTLTensorExtents destinationOrigin, final MTLTensorExtents destinationDimensions) {
        try {
            MH_copyFromTensor_sourceOrigin_sourceDimensions_toTensor_destinationOrigin_destinationDimensions_.invokeExact(this.handle, SEL_copyFromTensor_sourceOrigin_sourceDimensions_toTensor_destinationOrigin_destinationDimensions_, sourceTensor.handle(), sourceOrigin.handle(), sourceDimensions.handle(), destinationTensor.handle(), destinationOrigin.handle(), destinationDimensions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBlitCommandEncoder copyFromTensor:sourceOrigin:sourceDimensions:sourcePlane:toTensor:destinationOrigin:destinationDimensions:destinationPlane:]} */
    public void copyFromTensor(final MTLTensor sourceTensor, final MTLTensorExtents sourceOrigin, final MTLTensorExtents sourceDimensions, final MTLTensorPlaneType sourcePlane, final MTLTensor destinationTensor, final MTLTensorExtents destinationOrigin, final MTLTensorExtents destinationDimensions, final MTLTensorPlaneType destinationPlane) {
        try {
            MH_copyFromTensor_sourceOrigin_sourceDimensions_sourcePlane_toTensor_destinationOrigin_destinationDimensions_destinationPlane_.invokeExact(this.handle, SEL_copyFromTensor_sourceOrigin_sourceDimensions_sourcePlane_toTensor_destinationOrigin_destinationDimensions_destinationPlane_, sourceTensor.handle(), sourceOrigin.handle(), sourceDimensions.handle(), sourcePlane.value, destinationTensor.handle(), destinationOrigin.handle(), destinationDimensions.handle(), destinationPlane.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
