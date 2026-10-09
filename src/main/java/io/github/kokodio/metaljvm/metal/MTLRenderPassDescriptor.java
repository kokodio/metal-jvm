package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLRenderPassDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlrenderpassdescriptor">Apple documentation</a>
 */
public class MTLRenderPassDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLRenderPassDescriptor");
    private static final long SEL_CLASS_renderPassDescriptor = ObjC.selector("renderPassDescriptor");
    private static final MethodHandle MH_CLASS_renderPassDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSamplePositions_count_ = ObjC.selector("setSamplePositions:count:");
    private static final MethodHandle MH_setSamplePositions_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getSamplePositions_count_ = ObjC.selector("getSamplePositions:count:");
    private static final MethodHandle MH_getSamplePositions_count_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_colorAttachments = ObjC.selector("colorAttachments");
    private static final MethodHandle MH_colorAttachments = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_depthAttachment = ObjC.selector("depthAttachment");
    private static final MethodHandle MH_depthAttachment = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthAttachment_ = ObjC.selector("setDepthAttachment:");
    private static final MethodHandle MH_setDepthAttachment_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stencilAttachment = ObjC.selector("stencilAttachment");
    private static final MethodHandle MH_stencilAttachment = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStencilAttachment_ = ObjC.selector("setStencilAttachment:");
    private static final MethodHandle MH_setStencilAttachment_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_visibilityResultBuffer = ObjC.selector("visibilityResultBuffer");
    private static final MethodHandle MH_visibilityResultBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVisibilityResultBuffer_ = ObjC.selector("setVisibilityResultBuffer:");
    private static final MethodHandle MH_setVisibilityResultBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_renderTargetArrayLength = ObjC.selector("renderTargetArrayLength");
    private static final MethodHandle MH_renderTargetArrayLength = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRenderTargetArrayLength_ = ObjC.selector("setRenderTargetArrayLength:");
    private static final MethodHandle MH_setRenderTargetArrayLength_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_imageblockSampleLength = ObjC.selector("imageblockSampleLength");
    private static final MethodHandle MH_imageblockSampleLength = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setImageblockSampleLength_ = ObjC.selector("setImageblockSampleLength:");
    private static final MethodHandle MH_setImageblockSampleLength_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_threadgroupMemoryLength = ObjC.selector("threadgroupMemoryLength");
    private static final MethodHandle MH_threadgroupMemoryLength = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setThreadgroupMemoryLength_ = ObjC.selector("setThreadgroupMemoryLength:");
    private static final MethodHandle MH_setThreadgroupMemoryLength_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tileWidth = ObjC.selector("tileWidth");
    private static final MethodHandle MH_tileWidth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTileWidth_ = ObjC.selector("setTileWidth:");
    private static final MethodHandle MH_setTileWidth_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tileHeight = ObjC.selector("tileHeight");
    private static final MethodHandle MH_tileHeight = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTileHeight_ = ObjC.selector("setTileHeight:");
    private static final MethodHandle MH_setTileHeight_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_defaultRasterSampleCount = ObjC.selector("defaultRasterSampleCount");
    private static final MethodHandle MH_defaultRasterSampleCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDefaultRasterSampleCount_ = ObjC.selector("setDefaultRasterSampleCount:");
    private static final MethodHandle MH_setDefaultRasterSampleCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_renderTargetWidth = ObjC.selector("renderTargetWidth");
    private static final MethodHandle MH_renderTargetWidth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRenderTargetWidth_ = ObjC.selector("setRenderTargetWidth:");
    private static final MethodHandle MH_setRenderTargetWidth_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_renderTargetHeight = ObjC.selector("renderTargetHeight");
    private static final MethodHandle MH_renderTargetHeight = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRenderTargetHeight_ = ObjC.selector("setRenderTargetHeight:");
    private static final MethodHandle MH_setRenderTargetHeight_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rasterizationRateMap = ObjC.selector("rasterizationRateMap");
    private static final MethodHandle MH_rasterizationRateMap = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRasterizationRateMap_ = ObjC.selector("setRasterizationRateMap:");
    private static final MethodHandle MH_setRasterizationRateMap_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sampleBufferAttachments = ObjC.selector("sampleBufferAttachments");
    private static final MethodHandle MH_sampleBufferAttachments = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_visibilityResultType = ObjC.selector("visibilityResultType");
    private static final MethodHandle MH_visibilityResultType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVisibilityResultType_ = ObjC.selector("setVisibilityResultType:");
    private static final MethodHandle MH_setVisibilityResultType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportColorAttachmentMapping = ObjC.selector("supportColorAttachmentMapping");
    private static final MethodHandle MH_supportColorAttachmentMapping = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSupportColorAttachmentMapping_ = ObjC.selector("setSupportColorAttachmentMapping:");
    private static final MethodHandle MH_setSupportColorAttachmentMapping_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLRenderPassDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLRenderPassDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLRenderPassDescriptor alloc() {
        try {
            return new MTLRenderPassDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor init]} */
    public MTLRenderPassDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[MTLRenderPassDescriptor renderPassDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static MTLRenderPassDescriptor renderPassDescriptor() {
        try {
            long result = (long) MH_CLASS_renderPassDescriptor.invokeExact(CLS, SEL_CLASS_renderPassDescriptor);
            return new MTLRenderPassDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor setSamplePositions:count:]} */
    public void setSamplePositions(final MemorySegment positions, final long count) {
        try {
            MH_setSamplePositions_count_.invokeExact(this.handle, SEL_setSamplePositions_count_, positions.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor getSamplePositions:count:]} */
    public long getSamplePositions(final MemorySegment positions, final long count) {
        try {
            return (long) MH_getSamplePositions_count_.invokeExact(this.handle, SEL_getSamplePositions_count_, positions.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPassDescriptor colorAttachments]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLRenderPassColorAttachmentDescriptorArray colorAttachments() {
        try {
            long result = (long) MH_colorAttachments.invokeExact(this.handle, SEL_colorAttachments);
            return new MTLRenderPassColorAttachmentDescriptorArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPassDescriptor depthAttachment]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLRenderPassDepthAttachmentDescriptor depthAttachment() {
        try {
            long result = (long) MH_depthAttachment.invokeExact(this.handle, SEL_depthAttachment);
            return new MTLRenderPassDepthAttachmentDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor setDepthAttachment:]} */
    public void setDepthAttachment(@Nullable final MTLRenderPassDepthAttachmentDescriptor depthAttachment) {
        try {
            MH_setDepthAttachment_.invokeExact(this.handle, SEL_setDepthAttachment_, depthAttachment == null ? 0L : depthAttachment.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPassDescriptor stencilAttachment]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLRenderPassStencilAttachmentDescriptor stencilAttachment() {
        try {
            long result = (long) MH_stencilAttachment.invokeExact(this.handle, SEL_stencilAttachment);
            return new MTLRenderPassStencilAttachmentDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor setStencilAttachment:]} */
    public void setStencilAttachment(@Nullable final MTLRenderPassStencilAttachmentDescriptor stencilAttachment) {
        try {
            MH_setStencilAttachment_.invokeExact(this.handle, SEL_setStencilAttachment_, stencilAttachment == null ? 0L : stencilAttachment.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPassDescriptor visibilityResultBuffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLBuffer visibilityResultBuffer() {
        try {
            long result = (long) MH_visibilityResultBuffer.invokeExact(this.handle, SEL_visibilityResultBuffer);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor setVisibilityResultBuffer:]} */
    public void setVisibilityResultBuffer(@Nullable final MTLBuffer visibilityResultBuffer) {
        try {
            MH_setVisibilityResultBuffer_.invokeExact(this.handle, SEL_setVisibilityResultBuffer_, visibilityResultBuffer == null ? 0L : visibilityResultBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor renderTargetArrayLength]} */
    public long renderTargetArrayLength() {
        try {
            return (long) MH_renderTargetArrayLength.invokeExact(this.handle, SEL_renderTargetArrayLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor setRenderTargetArrayLength:]} */
    public void setRenderTargetArrayLength(final long renderTargetArrayLength) {
        try {
            MH_setRenderTargetArrayLength_.invokeExact(this.handle, SEL_setRenderTargetArrayLength_, renderTargetArrayLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor imageblockSampleLength]} */
    public long imageblockSampleLength() {
        try {
            return (long) MH_imageblockSampleLength.invokeExact(this.handle, SEL_imageblockSampleLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor setImageblockSampleLength:]} */
    public void setImageblockSampleLength(final long imageblockSampleLength) {
        try {
            MH_setImageblockSampleLength_.invokeExact(this.handle, SEL_setImageblockSampleLength_, imageblockSampleLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor threadgroupMemoryLength]} */
    public long threadgroupMemoryLength() {
        try {
            return (long) MH_threadgroupMemoryLength.invokeExact(this.handle, SEL_threadgroupMemoryLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor setThreadgroupMemoryLength:]} */
    public void setThreadgroupMemoryLength(final long threadgroupMemoryLength) {
        try {
            MH_setThreadgroupMemoryLength_.invokeExact(this.handle, SEL_setThreadgroupMemoryLength_, threadgroupMemoryLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor tileWidth]} */
    public long tileWidth() {
        try {
            return (long) MH_tileWidth.invokeExact(this.handle, SEL_tileWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor setTileWidth:]} */
    public void setTileWidth(final long tileWidth) {
        try {
            MH_setTileWidth_.invokeExact(this.handle, SEL_setTileWidth_, tileWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor tileHeight]} */
    public long tileHeight() {
        try {
            return (long) MH_tileHeight.invokeExact(this.handle, SEL_tileHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor setTileHeight:]} */
    public void setTileHeight(final long tileHeight) {
        try {
            MH_setTileHeight_.invokeExact(this.handle, SEL_setTileHeight_, tileHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor defaultRasterSampleCount]} */
    public long defaultRasterSampleCount() {
        try {
            return (long) MH_defaultRasterSampleCount.invokeExact(this.handle, SEL_defaultRasterSampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor setDefaultRasterSampleCount:]} */
    public void setDefaultRasterSampleCount(final long defaultRasterSampleCount) {
        try {
            MH_setDefaultRasterSampleCount_.invokeExact(this.handle, SEL_setDefaultRasterSampleCount_, defaultRasterSampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor renderTargetWidth]} */
    public long renderTargetWidth() {
        try {
            return (long) MH_renderTargetWidth.invokeExact(this.handle, SEL_renderTargetWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor setRenderTargetWidth:]} */
    public void setRenderTargetWidth(final long renderTargetWidth) {
        try {
            MH_setRenderTargetWidth_.invokeExact(this.handle, SEL_setRenderTargetWidth_, renderTargetWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor renderTargetHeight]} */
    public long renderTargetHeight() {
        try {
            return (long) MH_renderTargetHeight.invokeExact(this.handle, SEL_renderTargetHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor setRenderTargetHeight:]} */
    public void setRenderTargetHeight(final long renderTargetHeight) {
        try {
            MH_setRenderTargetHeight_.invokeExact(this.handle, SEL_setRenderTargetHeight_, renderTargetHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPassDescriptor rasterizationRateMap]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLRasterizationRateMap rasterizationRateMap() {
        try {
            long result = (long) MH_rasterizationRateMap.invokeExact(this.handle, SEL_rasterizationRateMap);
            return result == 0L ? null : new MTLRasterizationRateMap(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor setRasterizationRateMap:]} */
    public void setRasterizationRateMap(@Nullable final MTLRasterizationRateMap rasterizationRateMap) {
        try {
            MH_setRasterizationRateMap_.invokeExact(this.handle, SEL_setRasterizationRateMap_, rasterizationRateMap == null ? 0L : rasterizationRateMap.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPassDescriptor sampleBufferAttachments]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLRenderPassSampleBufferAttachmentDescriptorArray sampleBufferAttachments() {
        try {
            long result = (long) MH_sampleBufferAttachments.invokeExact(this.handle, SEL_sampleBufferAttachments);
            return new MTLRenderPassSampleBufferAttachmentDescriptorArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor visibilityResultType]} */
    public MTLVisibilityResultType visibilityResultType() {
        try {
            return MTLVisibilityResultType.of((long) MH_visibilityResultType.invokeExact(this.handle, SEL_visibilityResultType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor setVisibilityResultType:]} */
    public void setVisibilityResultType(final MTLVisibilityResultType visibilityResultType) {
        try {
            MH_setVisibilityResultType_.invokeExact(this.handle, SEL_setVisibilityResultType_, visibilityResultType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor supportColorAttachmentMapping]} */
    public boolean supportColorAttachmentMapping() {
        try {
            return (boolean) MH_supportColorAttachmentMapping.invokeExact(this.handle, SEL_supportColorAttachmentMapping);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDescriptor setSupportColorAttachmentMapping:]} */
    public void setSupportColorAttachmentMapping(final boolean supportColorAttachmentMapping) {
        try {
            MH_setSupportColorAttachmentMapping_.invokeExact(this.handle, SEL_setSupportColorAttachmentMapping_, supportColorAttachmentMapping);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
