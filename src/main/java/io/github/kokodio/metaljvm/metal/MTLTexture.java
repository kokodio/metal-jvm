package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSRange;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLTexture}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltexture">Apple documentation</a>
 */
public class MTLTexture extends MTLResource {
    private static final long SEL_getBytes_bytesPerRow_bytesPerImage_fromRegion_mipmapLevel_slice_ = ObjC.selector("getBytes:bytesPerRow:bytesPerImage:fromRegion:mipmapLevel:slice:");
    private static final MethodHandle MH_getBytes_bytesPerRow_bytesPerImage_fromRegion_mipmapLevel_slice_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_replaceRegion_mipmapLevel_slice_withBytes_bytesPerRow_bytesPerImage_ = ObjC.selector("replaceRegion:mipmapLevel:slice:withBytes:bytesPerRow:bytesPerImage:");
    private static final MethodHandle MH_replaceRegion_mipmapLevel_slice_withBytes_bytesPerRow_bytesPerImage_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getBytes_bytesPerRow_fromRegion_mipmapLevel_ = ObjC.selector("getBytes:bytesPerRow:fromRegion:mipmapLevel:");
    private static final MethodHandle MH_getBytes_bytesPerRow_fromRegion_mipmapLevel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_replaceRegion_mipmapLevel_withBytes_bytesPerRow_ = ObjC.selector("replaceRegion:mipmapLevel:withBytes:bytesPerRow:");
    private static final MethodHandle MH_replaceRegion_mipmapLevel_withBytes_bytesPerRow_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newTextureViewWithPixelFormat_ = ObjC.selector("newTextureViewWithPixelFormat:");
    private static final MethodHandle MH_newTextureViewWithPixelFormat_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newTextureViewWithPixelFormat_textureType_levels_slices_ = ObjC.selector("newTextureViewWithPixelFormat:textureType:levels:slices:");
    private static final MethodHandle MH_newTextureViewWithPixelFormat_textureType_levels_slices_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newSharedTextureHandle = ObjC.selector("newSharedTextureHandle");
    private static final MethodHandle MH_newSharedTextureHandle = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newTextureViewWithDescriptor_ = ObjC.selector("newTextureViewWithDescriptor:");
    private static final MethodHandle MH_newTextureViewWithDescriptor_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRemoteTextureViewForDevice_ = ObjC.selector("newRemoteTextureViewForDevice:");
    private static final MethodHandle MH_newRemoteTextureViewForDevice_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newTextureViewWithPixelFormat_textureType_levels_slices_swizzle_ = ObjC.selector("newTextureViewWithPixelFormat:textureType:levels:slices:swizzle:");
    private static final MethodHandle MH_newTextureViewWithPixelFormat_textureType_levels_slices_swizzle_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, NSRange.LAYOUT, NSRange.LAYOUT, MTLTextureSwizzleChannels.LAYOUT));
    private static final long SEL_rootResource = ObjC.selector("rootResource");
    private static final MethodHandle MH_rootResource = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_parentTexture = ObjC.selector("parentTexture");
    private static final MethodHandle MH_parentTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_parentRelativeLevel = ObjC.selector("parentRelativeLevel");
    private static final MethodHandle MH_parentRelativeLevel = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_parentRelativeSlice = ObjC.selector("parentRelativeSlice");
    private static final MethodHandle MH_parentRelativeSlice = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_buffer = ObjC.selector("buffer");
    private static final MethodHandle MH_buffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bufferOffset = ObjC.selector("bufferOffset");
    private static final MethodHandle MH_bufferOffset = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bufferBytesPerRow = ObjC.selector("bufferBytesPerRow");
    private static final MethodHandle MH_bufferBytesPerRow = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_iosurface = ObjC.selector("iosurface");
    private static final MethodHandle MH_iosurface = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_iosurfacePlane = ObjC.selector("iosurfacePlane");
    private static final MethodHandle MH_iosurfacePlane = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_textureType = ObjC.selector("textureType");
    private static final MethodHandle MH_textureType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pixelFormat = ObjC.selector("pixelFormat");
    private static final MethodHandle MH_pixelFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_width = ObjC.selector("width");
    private static final MethodHandle MH_width = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_height = ObjC.selector("height");
    private static final MethodHandle MH_height = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_depth = ObjC.selector("depth");
    private static final MethodHandle MH_depth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_mipmapLevelCount = ObjC.selector("mipmapLevelCount");
    private static final MethodHandle MH_mipmapLevelCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sampleCount = ObjC.selector("sampleCount");
    private static final MethodHandle MH_sampleCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_arrayLength = ObjC.selector("arrayLength");
    private static final MethodHandle MH_arrayLength = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_usage = ObjC.selector("usage");
    private static final MethodHandle MH_usage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isShareable = ObjC.selector("isShareable");
    private static final MethodHandle MH_isShareable = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isFramebufferOnly = ObjC.selector("isFramebufferOnly");
    private static final MethodHandle MH_isFramebufferOnly = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_firstMipmapInTail = ObjC.selector("firstMipmapInTail");
    private static final MethodHandle MH_firstMipmapInTail = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tailSizeInBytes = ObjC.selector("tailSizeInBytes");
    private static final MethodHandle MH_tailSizeInBytes = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isSparse = ObjC.selector("isSparse");
    private static final MethodHandle MH_isSparse = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_allowGPUOptimizedContents = ObjC.selector("allowGPUOptimizedContents");
    private static final MethodHandle MH_allowGPUOptimizedContents = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_compressionType = ObjC.selector("compressionType");
    private static final MethodHandle MH_compressionType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_gpuResourceID = ObjC.selector("gpuResourceID");
    private static final MethodHandle MH_gpuResourceID = ObjC.msgSendCritical(FunctionDescriptor.of(MTLResourceID.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_remoteStorageTexture = ObjC.selector("remoteStorageTexture");
    private static final MethodHandle MH_remoteStorageTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_swizzle = ObjC.selector("swizzle");
    private static final MethodHandle MH_swizzle = ObjC.msgSendCritical(FunctionDescriptor.of(MTLTextureSwizzleChannels.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sparseTextureTier = ObjC.selector("sparseTextureTier");
    private static final MethodHandle MH_sparseTextureTier = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_minLOD = ObjC.selector("minLOD");
    private static final MethodHandle MH_minLOD = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));

    public MTLTexture(final long handle) {
        super(handle);
    }

    /** {@code -[MTLTexture getBytes:bytesPerRow:bytesPerImage:fromRegion:mipmapLevel:slice:]} */
    public void getBytes(final MemorySegment pixelBytes, final long bytesPerRow, final long bytesPerImage, final MTLRegion region, final long level, final long slice) {
        try (NativeStack stack = NativeStack.push()) {
            MH_getBytes_bytesPerRow_bytesPerImage_fromRegion_mipmapLevel_slice_.invokeExact(this.handle, SEL_getBytes_bytesPerRow_bytesPerImage_fromRegion_mipmapLevel_slice_, pixelBytes.address(), bytesPerRow, bytesPerImage, region.on(stack).address(), level, slice);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture replaceRegion:mipmapLevel:slice:withBytes:bytesPerRow:bytesPerImage:]} */
    public void replaceRegion(final MTLRegion region, final long level, final long slice, final MemorySegment pixelBytes, final long bytesPerRow, final long bytesPerImage) {
        try (NativeStack stack = NativeStack.push()) {
            MH_replaceRegion_mipmapLevel_slice_withBytes_bytesPerRow_bytesPerImage_.invokeExact(this.handle, SEL_replaceRegion_mipmapLevel_slice_withBytes_bytesPerRow_bytesPerImage_, region.on(stack).address(), level, slice, pixelBytes.address(), bytesPerRow, bytesPerImage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture getBytes:bytesPerRow:fromRegion:mipmapLevel:]} */
    public void getBytes(final MemorySegment pixelBytes, final long bytesPerRow, final MTLRegion region, final long level) {
        try (NativeStack stack = NativeStack.push()) {
            MH_getBytes_bytesPerRow_fromRegion_mipmapLevel_.invokeExact(this.handle, SEL_getBytes_bytesPerRow_fromRegion_mipmapLevel_, pixelBytes.address(), bytesPerRow, region.on(stack).address(), level);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture replaceRegion:mipmapLevel:withBytes:bytesPerRow:]} */
    public void replaceRegion(final MTLRegion region, final long level, final MemorySegment pixelBytes, final long bytesPerRow) {
        try (NativeStack stack = NativeStack.push()) {
            MH_replaceRegion_mipmapLevel_withBytes_bytesPerRow_.invokeExact(this.handle, SEL_replaceRegion_mipmapLevel_withBytes_bytesPerRow_, region.on(stack).address(), level, pixelBytes.address(), bytesPerRow);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTexture newTextureViewWithPixelFormat:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLTexture newTextureViewWithPixelFormat(final MTLPixelFormat pixelFormat) {
        try {
            long result = (long) MH_newTextureViewWithPixelFormat_.invokeExact(this.handle, SEL_newTextureViewWithPixelFormat_, pixelFormat.value);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTexture newTextureViewWithPixelFormat:textureType:levels:slices:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLTexture newTextureViewWithPixelFormat(final MTLPixelFormat pixelFormat, final MTLTextureType textureType, final NSRange levelRange, final NSRange sliceRange) {
        try {
            long result = (long) MH_newTextureViewWithPixelFormat_textureType_levels_slices_.invokeExact(this.handle, SEL_newTextureViewWithPixelFormat_textureType_levels_slices_, pixelFormat.value, textureType.value, levelRange.location(), levelRange.length(), sliceRange.location(), sliceRange.length());
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTexture newSharedTextureHandle]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLSharedTextureHandle newSharedTextureHandle() {
        try {
            long result = (long) MH_newSharedTextureHandle.invokeExact(this.handle, SEL_newSharedTextureHandle);
            return result == 0L ? null : new MTLSharedTextureHandle(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTexture newTextureViewWithDescriptor:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLTexture newTextureViewWithDescriptor(final MTLTextureViewDescriptor descriptor) {
        try {
            long result = (long) MH_newTextureViewWithDescriptor_.invokeExact(this.handle, SEL_newTextureViewWithDescriptor_, descriptor.handle());
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTexture newRemoteTextureViewForDevice:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLTexture newRemoteTextureViewForDevice(final MTLDevice device) {
        try {
            long result = (long) MH_newRemoteTextureViewForDevice_.invokeExact(this.handle, SEL_newRemoteTextureViewForDevice_, device.handle());
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTexture newTextureViewWithPixelFormat:textureType:levels:slices:swizzle:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLTexture newTextureViewWithPixelFormat(final MTLPixelFormat pixelFormat, final MTLTextureType textureType, final NSRange levelRange, final NSRange sliceRange, final MTLTextureSwizzleChannels swizzle) {
        try (NativeStack stack = NativeStack.push()) {
            long result = (long) MH_newTextureViewWithPixelFormat_textureType_levels_slices_swizzle_.invokeExact(this.handle, SEL_newTextureViewWithPixelFormat_textureType_levels_slices_swizzle_, pixelFormat.value, textureType.value, levelRange.on(stack), sliceRange.on(stack), swizzle.on(stack));
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTexture rootResource]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLResource rootResource() {
        try {
            long result = (long) MH_rootResource.invokeExact(this.handle, SEL_rootResource);
            return result == 0L ? null : new MTLResource(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTexture parentTexture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTexture parentTexture() {
        try {
            long result = (long) MH_parentTexture.invokeExact(this.handle, SEL_parentTexture);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture parentRelativeLevel]} */
    public long parentRelativeLevel() {
        try {
            return (long) MH_parentRelativeLevel.invokeExact(this.handle, SEL_parentRelativeLevel);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture parentRelativeSlice]} */
    public long parentRelativeSlice() {
        try {
            return (long) MH_parentRelativeSlice.invokeExact(this.handle, SEL_parentRelativeSlice);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTexture buffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLBuffer buffer() {
        try {
            long result = (long) MH_buffer.invokeExact(this.handle, SEL_buffer);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture bufferOffset]} */
    public long bufferOffset() {
        try {
            return (long) MH_bufferOffset.invokeExact(this.handle, SEL_bufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture bufferBytesPerRow]} */
    public long bufferBytesPerRow() {
        try {
            return (long) MH_bufferBytesPerRow.invokeExact(this.handle, SEL_bufferBytesPerRow);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture iosurface]} */
    public long iosurface() {
        try {
            return (long) MH_iosurface.invokeExact(this.handle, SEL_iosurface);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture iosurfacePlane]} */
    public long iosurfacePlane() {
        try {
            return (long) MH_iosurfacePlane.invokeExact(this.handle, SEL_iosurfacePlane);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture textureType]} */
    public MTLTextureType textureType() {
        try {
            return MTLTextureType.of((long) MH_textureType.invokeExact(this.handle, SEL_textureType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture pixelFormat]} */
    public MTLPixelFormat pixelFormat() {
        try {
            return MTLPixelFormat.of((long) MH_pixelFormat.invokeExact(this.handle, SEL_pixelFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture width]} */
    public long width() {
        try {
            return (long) MH_width.invokeExact(this.handle, SEL_width);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture height]} */
    public long height() {
        try {
            return (long) MH_height.invokeExact(this.handle, SEL_height);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture depth]} */
    public long depth() {
        try {
            return (long) MH_depth.invokeExact(this.handle, SEL_depth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture mipmapLevelCount]} */
    public long mipmapLevelCount() {
        try {
            return (long) MH_mipmapLevelCount.invokeExact(this.handle, SEL_mipmapLevelCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture sampleCount]} */
    public long sampleCount() {
        try {
            return (long) MH_sampleCount.invokeExact(this.handle, SEL_sampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture arrayLength]} */
    public long arrayLength() {
        try {
            return (long) MH_arrayLength.invokeExact(this.handle, SEL_arrayLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTexture usage]}
     *
     * @return a combination of {@link MTLTextureUsage} flags
     */
    public long usage() {
        try {
            return (long) MH_usage.invokeExact(this.handle, SEL_usage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture isShareable]} */
    public boolean isShareable() {
        try {
            return (boolean) MH_isShareable.invokeExact(this.handle, SEL_isShareable);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture isFramebufferOnly]} */
    public boolean isFramebufferOnly() {
        try {
            return (boolean) MH_isFramebufferOnly.invokeExact(this.handle, SEL_isFramebufferOnly);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture firstMipmapInTail]} */
    public long firstMipmapInTail() {
        try {
            return (long) MH_firstMipmapInTail.invokeExact(this.handle, SEL_firstMipmapInTail);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture tailSizeInBytes]} */
    public long tailSizeInBytes() {
        try {
            return (long) MH_tailSizeInBytes.invokeExact(this.handle, SEL_tailSizeInBytes);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture isSparse]} */
    public boolean isSparse() {
        try {
            return (boolean) MH_isSparse.invokeExact(this.handle, SEL_isSparse);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture allowGPUOptimizedContents]} */
    public boolean allowGPUOptimizedContents() {
        try {
            return (boolean) MH_allowGPUOptimizedContents.invokeExact(this.handle, SEL_allowGPUOptimizedContents);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture compressionType]} */
    public MTLTextureCompressionType compressionType() {
        try {
            return MTLTextureCompressionType.of((long) MH_compressionType.invokeExact(this.handle, SEL_compressionType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture gpuResourceID]} */
    public MTLResourceID gpuResourceID() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLResourceID.read((MemorySegment) MH_gpuResourceID.invokeExact((SegmentAllocator) stack, this.handle, SEL_gpuResourceID));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTexture remoteStorageTexture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTexture remoteStorageTexture() {
        try {
            long result = (long) MH_remoteStorageTexture.invokeExact(this.handle, SEL_remoteStorageTexture);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture swizzle]} */
    public MTLTextureSwizzleChannels swizzle() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLTextureSwizzleChannels.read((MemorySegment) MH_swizzle.invokeExact((SegmentAllocator) stack, this.handle, SEL_swizzle));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture sparseTextureTier]} */
    public MTLTextureSparseTier sparseTextureTier() {
        try {
            return MTLTextureSparseTier.of((long) MH_sparseTextureTier.invokeExact(this.handle, SEL_sparseTextureTier));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTexture minLOD]} */
    public float minLOD() {
        try {
            return (float) MH_minLOD.invokeExact(this.handle, SEL_minLOD);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
