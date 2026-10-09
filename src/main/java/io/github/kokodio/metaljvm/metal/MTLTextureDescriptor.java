package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLTextureDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltexturedescriptor">Apple documentation</a>
 */
public class MTLTextureDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLTextureDescriptor");
    private static final long SEL_CLASS_texture2DDescriptorWithPixelFormat_width_height_mipmapped_ = ObjC.selector("texture2DDescriptorWithPixelFormat:width:height:mipmapped:");
    private static final MethodHandle MH_CLASS_texture2DDescriptorWithPixelFormat_width_height_mipmapped_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_CLASS_textureCubeDescriptorWithPixelFormat_size_mipmapped_ = ObjC.selector("textureCubeDescriptorWithPixelFormat:size:mipmapped:");
    private static final MethodHandle MH_CLASS_textureCubeDescriptorWithPixelFormat_size_mipmapped_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_CLASS_textureBufferDescriptorWithPixelFormat_width_resourceOptions_usage_ = ObjC.selector("textureBufferDescriptorWithPixelFormat:width:resourceOptions:usage:");
    private static final MethodHandle MH_CLASS_textureBufferDescriptorWithPixelFormat_width_resourceOptions_usage_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_textureType = ObjC.selector("textureType");
    private static final MethodHandle MH_textureType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTextureType_ = ObjC.selector("setTextureType:");
    private static final MethodHandle MH_setTextureType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pixelFormat = ObjC.selector("pixelFormat");
    private static final MethodHandle MH_pixelFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPixelFormat_ = ObjC.selector("setPixelFormat:");
    private static final MethodHandle MH_setPixelFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_width = ObjC.selector("width");
    private static final MethodHandle MH_width = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setWidth_ = ObjC.selector("setWidth:");
    private static final MethodHandle MH_setWidth_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_height = ObjC.selector("height");
    private static final MethodHandle MH_height = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setHeight_ = ObjC.selector("setHeight:");
    private static final MethodHandle MH_setHeight_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_depth = ObjC.selector("depth");
    private static final MethodHandle MH_depth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepth_ = ObjC.selector("setDepth:");
    private static final MethodHandle MH_setDepth_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_mipmapLevelCount = ObjC.selector("mipmapLevelCount");
    private static final MethodHandle MH_mipmapLevelCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMipmapLevelCount_ = ObjC.selector("setMipmapLevelCount:");
    private static final MethodHandle MH_setMipmapLevelCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sampleCount = ObjC.selector("sampleCount");
    private static final MethodHandle MH_sampleCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSampleCount_ = ObjC.selector("setSampleCount:");
    private static final MethodHandle MH_setSampleCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_arrayLength = ObjC.selector("arrayLength");
    private static final MethodHandle MH_arrayLength = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setArrayLength_ = ObjC.selector("setArrayLength:");
    private static final MethodHandle MH_setArrayLength_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resourceOptions = ObjC.selector("resourceOptions");
    private static final MethodHandle MH_resourceOptions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setResourceOptions_ = ObjC.selector("setResourceOptions:");
    private static final MethodHandle MH_setResourceOptions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_cpuCacheMode = ObjC.selector("cpuCacheMode");
    private static final MethodHandle MH_cpuCacheMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCpuCacheMode_ = ObjC.selector("setCpuCacheMode:");
    private static final MethodHandle MH_setCpuCacheMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_storageMode = ObjC.selector("storageMode");
    private static final MethodHandle MH_storageMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStorageMode_ = ObjC.selector("setStorageMode:");
    private static final MethodHandle MH_setStorageMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_hazardTrackingMode = ObjC.selector("hazardTrackingMode");
    private static final MethodHandle MH_hazardTrackingMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setHazardTrackingMode_ = ObjC.selector("setHazardTrackingMode:");
    private static final MethodHandle MH_setHazardTrackingMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_usage = ObjC.selector("usage");
    private static final MethodHandle MH_usage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setUsage_ = ObjC.selector("setUsage:");
    private static final MethodHandle MH_setUsage_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_allowGPUOptimizedContents = ObjC.selector("allowGPUOptimizedContents");
    private static final MethodHandle MH_allowGPUOptimizedContents = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAllowGPUOptimizedContents_ = ObjC.selector("setAllowGPUOptimizedContents:");
    private static final MethodHandle MH_setAllowGPUOptimizedContents_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_compressionType = ObjC.selector("compressionType");
    private static final MethodHandle MH_compressionType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCompressionType_ = ObjC.selector("setCompressionType:");
    private static final MethodHandle MH_setCompressionType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_swizzle = ObjC.selector("swizzle");
    private static final MethodHandle MH_swizzle = ObjC.msgSendCritical(FunctionDescriptor.of(MTLTextureSwizzleChannels.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSwizzle_ = ObjC.selector("setSwizzle:");
    private static final MethodHandle MH_setSwizzle_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, MTLTextureSwizzleChannels.LAYOUT));
    private static final long SEL_placementSparsePageSize = ObjC.selector("placementSparsePageSize");
    private static final MethodHandle MH_placementSparsePageSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPlacementSparsePageSize_ = ObjC.selector("setPlacementSparsePageSize:");
    private static final MethodHandle MH_setPlacementSparsePageSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLTextureDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLTextureDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLTextureDescriptor alloc() {
        try {
            return new MTLTextureDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor init]} */
    public MTLTextureDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[MTLTextureDescriptor texture2DDescriptorWithPixelFormat:width:height:mipmapped:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static MTLTextureDescriptor texture2DDescriptor(final MTLPixelFormat pixelFormat, final long width, final long height, final boolean mipmapped) {
        try {
            long result = (long) MH_CLASS_texture2DDescriptorWithPixelFormat_width_height_mipmapped_.invokeExact(CLS, SEL_CLASS_texture2DDescriptorWithPixelFormat_width_height_mipmapped_, pixelFormat.value, width, height, mipmapped);
            return new MTLTextureDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[MTLTextureDescriptor textureCubeDescriptorWithPixelFormat:size:mipmapped:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static MTLTextureDescriptor textureCubeDescriptor(final MTLPixelFormat pixelFormat, final long size, final boolean mipmapped) {
        try {
            long result = (long) MH_CLASS_textureCubeDescriptorWithPixelFormat_size_mipmapped_.invokeExact(CLS, SEL_CLASS_textureCubeDescriptorWithPixelFormat_size_mipmapped_, pixelFormat.value, size, mipmapped);
            return new MTLTextureDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[MTLTextureDescriptor textureBufferDescriptorWithPixelFormat:width:resourceOptions:usage:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     *
     * @param resourceOptions a combination of {@link MTLResourceOptions} flags
     * @param usage a combination of {@link MTLTextureUsage} flags
     */
    public static MTLTextureDescriptor textureBufferDescriptor(final MTLPixelFormat pixelFormat, final long width, final long resourceOptions, final long usage) {
        try {
            long result = (long) MH_CLASS_textureBufferDescriptorWithPixelFormat_width_resourceOptions_usage_.invokeExact(CLS, SEL_CLASS_textureBufferDescriptorWithPixelFormat_width_resourceOptions_usage_, pixelFormat.value, width, resourceOptions, usage);
            return new MTLTextureDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor textureType]} */
    public MTLTextureType textureType() {
        try {
            return MTLTextureType.of((long) MH_textureType.invokeExact(this.handle, SEL_textureType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor setTextureType:]} */
    public void setTextureType(final MTLTextureType textureType) {
        try {
            MH_setTextureType_.invokeExact(this.handle, SEL_setTextureType_, textureType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor pixelFormat]} */
    public MTLPixelFormat pixelFormat() {
        try {
            return MTLPixelFormat.of((long) MH_pixelFormat.invokeExact(this.handle, SEL_pixelFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor setPixelFormat:]} */
    public void setPixelFormat(final MTLPixelFormat pixelFormat) {
        try {
            MH_setPixelFormat_.invokeExact(this.handle, SEL_setPixelFormat_, pixelFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor width]} */
    public long width() {
        try {
            return (long) MH_width.invokeExact(this.handle, SEL_width);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor setWidth:]} */
    public void setWidth(final long width) {
        try {
            MH_setWidth_.invokeExact(this.handle, SEL_setWidth_, width);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor height]} */
    public long height() {
        try {
            return (long) MH_height.invokeExact(this.handle, SEL_height);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor setHeight:]} */
    public void setHeight(final long height) {
        try {
            MH_setHeight_.invokeExact(this.handle, SEL_setHeight_, height);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor depth]} */
    public long depth() {
        try {
            return (long) MH_depth.invokeExact(this.handle, SEL_depth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor setDepth:]} */
    public void setDepth(final long depth) {
        try {
            MH_setDepth_.invokeExact(this.handle, SEL_setDepth_, depth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor mipmapLevelCount]} */
    public long mipmapLevelCount() {
        try {
            return (long) MH_mipmapLevelCount.invokeExact(this.handle, SEL_mipmapLevelCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor setMipmapLevelCount:]} */
    public void setMipmapLevelCount(final long mipmapLevelCount) {
        try {
            MH_setMipmapLevelCount_.invokeExact(this.handle, SEL_setMipmapLevelCount_, mipmapLevelCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor sampleCount]} */
    public long sampleCount() {
        try {
            return (long) MH_sampleCount.invokeExact(this.handle, SEL_sampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor setSampleCount:]} */
    public void setSampleCount(final long sampleCount) {
        try {
            MH_setSampleCount_.invokeExact(this.handle, SEL_setSampleCount_, sampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor arrayLength]} */
    public long arrayLength() {
        try {
            return (long) MH_arrayLength.invokeExact(this.handle, SEL_arrayLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor setArrayLength:]} */
    public void setArrayLength(final long arrayLength) {
        try {
            MH_setArrayLength_.invokeExact(this.handle, SEL_setArrayLength_, arrayLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTextureDescriptor resourceOptions]}
     *
     * @return a combination of {@link MTLResourceOptions} flags
     */
    public long resourceOptions() {
        try {
            return (long) MH_resourceOptions.invokeExact(this.handle, SEL_resourceOptions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTextureDescriptor setResourceOptions:]}
     *
     * @param resourceOptions a combination of {@link MTLResourceOptions} flags
     */
    public void setResourceOptions(final long resourceOptions) {
        try {
            MH_setResourceOptions_.invokeExact(this.handle, SEL_setResourceOptions_, resourceOptions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor cpuCacheMode]} */
    public MTLCPUCacheMode cpuCacheMode() {
        try {
            return MTLCPUCacheMode.of((long) MH_cpuCacheMode.invokeExact(this.handle, SEL_cpuCacheMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor setCpuCacheMode:]} */
    public void setCpuCacheMode(final MTLCPUCacheMode cpuCacheMode) {
        try {
            MH_setCpuCacheMode_.invokeExact(this.handle, SEL_setCpuCacheMode_, cpuCacheMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor storageMode]} */
    public MTLStorageMode storageMode() {
        try {
            return MTLStorageMode.of((long) MH_storageMode.invokeExact(this.handle, SEL_storageMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor setStorageMode:]} */
    public void setStorageMode(final MTLStorageMode storageMode) {
        try {
            MH_setStorageMode_.invokeExact(this.handle, SEL_setStorageMode_, storageMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor hazardTrackingMode]} */
    public MTLHazardTrackingMode hazardTrackingMode() {
        try {
            return MTLHazardTrackingMode.of((long) MH_hazardTrackingMode.invokeExact(this.handle, SEL_hazardTrackingMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor setHazardTrackingMode:]} */
    public void setHazardTrackingMode(final MTLHazardTrackingMode hazardTrackingMode) {
        try {
            MH_setHazardTrackingMode_.invokeExact(this.handle, SEL_setHazardTrackingMode_, hazardTrackingMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTextureDescriptor usage]}
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

    /**
     * {@code -[MTLTextureDescriptor setUsage:]}
     *
     * @param usage a combination of {@link MTLTextureUsage} flags
     */
    public void setUsage(final long usage) {
        try {
            MH_setUsage_.invokeExact(this.handle, SEL_setUsage_, usage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor allowGPUOptimizedContents]} */
    public boolean allowGPUOptimizedContents() {
        try {
            return (boolean) MH_allowGPUOptimizedContents.invokeExact(this.handle, SEL_allowGPUOptimizedContents);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor setAllowGPUOptimizedContents:]} */
    public void setAllowGPUOptimizedContents(final boolean allowGPUOptimizedContents) {
        try {
            MH_setAllowGPUOptimizedContents_.invokeExact(this.handle, SEL_setAllowGPUOptimizedContents_, allowGPUOptimizedContents);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor compressionType]} */
    public MTLTextureCompressionType compressionType() {
        try {
            return MTLTextureCompressionType.of((long) MH_compressionType.invokeExact(this.handle, SEL_compressionType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor setCompressionType:]} */
    public void setCompressionType(final MTLTextureCompressionType compressionType) {
        try {
            MH_setCompressionType_.invokeExact(this.handle, SEL_setCompressionType_, compressionType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor swizzle]} */
    public MTLTextureSwizzleChannels swizzle() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLTextureSwizzleChannels.read((MemorySegment) MH_swizzle.invokeExact((SegmentAllocator) stack, this.handle, SEL_swizzle));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor setSwizzle:]} */
    public void setSwizzle(final MTLTextureSwizzleChannels swizzle) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setSwizzle_.invokeExact(this.handle, SEL_setSwizzle_, swizzle.on(stack));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor placementSparsePageSize]} */
    public MTLSparsePageSize placementSparsePageSize() {
        try {
            return MTLSparsePageSize.of((long) MH_placementSparsePageSize.invokeExact(this.handle, SEL_placementSparsePageSize));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureDescriptor setPlacementSparsePageSize:]} */
    public void setPlacementSparsePageSize(final MTLSparsePageSize placementSparsePageSize) {
        try {
            MH_setPlacementSparsePageSize_.invokeExact(this.handle, SEL_setPlacementSparsePageSize_, placementSparsePageSize.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
