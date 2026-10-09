package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLResourceStateCommandEncoder}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlresourcestatecommandencoder">Apple documentation</a>
 */
public class MTLResourceStateCommandEncoder extends MTLCommandEncoder {
    private static final long SEL_updateTextureMappings_mode_regions_mipLevels_slices_numRegions_ = ObjC.selector("updateTextureMappings:mode:regions:mipLevels:slices:numRegions:");
    private static final MethodHandle MH_updateTextureMappings_mode_regions_mipLevels_slices_numRegions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_updateTextureMapping_mode_region_mipLevel_slice_ = ObjC.selector("updateTextureMapping:mode:region:mipLevel:slice:");
    private static final MethodHandle MH_updateTextureMapping_mode_region_mipLevel_slice_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_updateTextureMapping_mode_indirectBuffer_indirectBufferOffset_ = ObjC.selector("updateTextureMapping:mode:indirectBuffer:indirectBufferOffset:");
    private static final MethodHandle MH_updateTextureMapping_mode_indirectBuffer_indirectBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_updateFence_ = ObjC.selector("updateFence:");
    private static final MethodHandle MH_updateFence_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_waitForFence_ = ObjC.selector("waitForFence:");
    private static final MethodHandle MH_waitForFence_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_moveTextureMappingsFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_ = ObjC.selector("moveTextureMappingsFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:");
    private static final MethodHandle MH_moveTextureMappingsFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLResourceStateCommandEncoder(final long handle) {
        super(handle);
    }

    /** {@code -[MTLResourceStateCommandEncoder updateTextureMappings:mode:regions:mipLevels:slices:numRegions:]} */
    public void updateTextureMappings(final MTLTexture texture, final MTLSparseTextureMappingMode mode, final MemorySegment regions, final MemorySegment mipLevels, final MemorySegment slices, final long numRegions) {
        try {
            MH_updateTextureMappings_mode_regions_mipLevels_slices_numRegions_.invokeExact(this.handle, SEL_updateTextureMappings_mode_regions_mipLevels_slices_numRegions_, texture.handle(), mode.value, regions.address(), mipLevels.address(), slices.address(), numRegions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResourceStateCommandEncoder updateTextureMapping:mode:region:mipLevel:slice:]} */
    public void updateTextureMapping(final MTLTexture texture, final MTLSparseTextureMappingMode mode, final MTLRegion region, final long mipLevel, final long slice) {
        try (NativeStack stack = NativeStack.push()) {
            MH_updateTextureMapping_mode_region_mipLevel_slice_.invokeExact(this.handle, SEL_updateTextureMapping_mode_region_mipLevel_slice_, texture.handle(), mode.value, region.on(stack).address(), mipLevel, slice);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResourceStateCommandEncoder updateTextureMapping:mode:indirectBuffer:indirectBufferOffset:]} */
    public void updateTextureMapping(final MTLTexture texture, final MTLSparseTextureMappingMode mode, final MTLBuffer indirectBuffer, final long indirectBufferOffset) {
        try {
            MH_updateTextureMapping_mode_indirectBuffer_indirectBufferOffset_.invokeExact(this.handle, SEL_updateTextureMapping_mode_indirectBuffer_indirectBufferOffset_, texture.handle(), mode.value, indirectBuffer.handle(), indirectBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResourceStateCommandEncoder updateFence:]} */
    public void updateFence(final MTLFence fence) {
        try {
            MH_updateFence_.invokeExact(this.handle, SEL_updateFence_, fence.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResourceStateCommandEncoder waitForFence:]} */
    public void waitForFence(final MTLFence fence) {
        try {
            MH_waitForFence_.invokeExact(this.handle, SEL_waitForFence_, fence.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResourceStateCommandEncoder moveTextureMappingsFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:]} */
    public void moveTextureMappingsFromTexture(final MTLTexture sourceTexture, final long sourceSlice, final long sourceLevel, final MTLOrigin sourceOrigin, final MTLSize sourceSize, final MTLTexture destinationTexture, final long destinationSlice, final long destinationLevel, final MTLOrigin destinationOrigin) {
        try (NativeStack stack = NativeStack.push()) {
            MH_moveTextureMappingsFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_.invokeExact(this.handle, SEL_moveTextureMappingsFromTexture_sourceSlice_sourceLevel_sourceOrigin_sourceSize_toTexture_destinationSlice_destinationLevel_destinationOrigin_, sourceTexture.handle(), sourceSlice, sourceLevel, sourceOrigin.on(stack).address(), sourceSize.on(stack).address(), destinationTexture.handle(), destinationSlice, destinationLevel, destinationOrigin.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
