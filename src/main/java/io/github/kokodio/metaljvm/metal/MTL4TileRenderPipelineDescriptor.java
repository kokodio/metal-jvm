package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4TileRenderPipelineDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4tilerenderpipelinedescriptor">Apple documentation</a>
 */
public class MTL4TileRenderPipelineDescriptor extends MTL4PipelineDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4TileRenderPipelineDescriptor");
    private static final long SEL_reset = ObjC.selector("reset");
    private static final MethodHandle MH_reset = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_tileFunctionDescriptor = ObjC.selector("tileFunctionDescriptor");
    private static final MethodHandle MH_tileFunctionDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTileFunctionDescriptor_ = ObjC.selector("setTileFunctionDescriptor:");
    private static final MethodHandle MH_setTileFunctionDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rasterSampleCount = ObjC.selector("rasterSampleCount");
    private static final MethodHandle MH_rasterSampleCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRasterSampleCount_ = ObjC.selector("setRasterSampleCount:");
    private static final MethodHandle MH_setRasterSampleCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_colorAttachments = ObjC.selector("colorAttachments");
    private static final MethodHandle MH_colorAttachments = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_threadgroupSizeMatchesTileSize = ObjC.selector("threadgroupSizeMatchesTileSize");
    private static final MethodHandle MH_threadgroupSizeMatchesTileSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setThreadgroupSizeMatchesTileSize_ = ObjC.selector("setThreadgroupSizeMatchesTileSize:");
    private static final MethodHandle MH_setThreadgroupSizeMatchesTileSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_maxTotalThreadsPerThreadgroup = ObjC.selector("maxTotalThreadsPerThreadgroup");
    private static final MethodHandle MH_maxTotalThreadsPerThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxTotalThreadsPerThreadgroup_ = ObjC.selector("setMaxTotalThreadsPerThreadgroup:");
    private static final MethodHandle MH_setMaxTotalThreadsPerThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_requiredThreadsPerThreadgroup = ObjC.selector("requiredThreadsPerThreadgroup");
    private static final MethodHandle MH_requiredThreadsPerThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRequiredThreadsPerThreadgroup_ = ObjC.selector("setRequiredThreadsPerThreadgroup:");
    private static final MethodHandle MH_setRequiredThreadsPerThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_staticLinkingDescriptor = ObjC.selector("staticLinkingDescriptor");
    private static final MethodHandle MH_staticLinkingDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStaticLinkingDescriptor_ = ObjC.selector("setStaticLinkingDescriptor:");
    private static final MethodHandle MH_setStaticLinkingDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportBinaryLinking = ObjC.selector("supportBinaryLinking");
    private static final MethodHandle MH_supportBinaryLinking = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSupportBinaryLinking_ = ObjC.selector("setSupportBinaryLinking:");
    private static final MethodHandle MH_setSupportBinaryLinking_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4TileRenderPipelineDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4TileRenderPipelineDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4TileRenderPipelineDescriptor alloc() {
        try {
            return new MTL4TileRenderPipelineDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4TileRenderPipelineDescriptor init]} */
    public MTL4TileRenderPipelineDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4TileRenderPipelineDescriptor reset]} */
    public void reset() {
        try {
            MH_reset.invokeExact(this.handle, SEL_reset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4TileRenderPipelineDescriptor tileFunctionDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTL4FunctionDescriptor tileFunctionDescriptor() {
        try {
            long result = (long) MH_tileFunctionDescriptor.invokeExact(this.handle, SEL_tileFunctionDescriptor);
            return result == 0L ? null : new MTL4FunctionDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4TileRenderPipelineDescriptor setTileFunctionDescriptor:]} */
    public void setTileFunctionDescriptor(@Nullable final MTL4FunctionDescriptor tileFunctionDescriptor) {
        try {
            MH_setTileFunctionDescriptor_.invokeExact(this.handle, SEL_setTileFunctionDescriptor_, tileFunctionDescriptor == null ? 0L : tileFunctionDescriptor.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4TileRenderPipelineDescriptor rasterSampleCount]} */
    public long rasterSampleCount() {
        try {
            return (long) MH_rasterSampleCount.invokeExact(this.handle, SEL_rasterSampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4TileRenderPipelineDescriptor setRasterSampleCount:]} */
    public void setRasterSampleCount(final long rasterSampleCount) {
        try {
            MH_setRasterSampleCount_.invokeExact(this.handle, SEL_setRasterSampleCount_, rasterSampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4TileRenderPipelineDescriptor colorAttachments]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLTileRenderPipelineColorAttachmentDescriptorArray colorAttachments() {
        try {
            long result = (long) MH_colorAttachments.invokeExact(this.handle, SEL_colorAttachments);
            return new MTLTileRenderPipelineColorAttachmentDescriptorArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4TileRenderPipelineDescriptor threadgroupSizeMatchesTileSize]} */
    public boolean threadgroupSizeMatchesTileSize() {
        try {
            return (boolean) MH_threadgroupSizeMatchesTileSize.invokeExact(this.handle, SEL_threadgroupSizeMatchesTileSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4TileRenderPipelineDescriptor setThreadgroupSizeMatchesTileSize:]} */
    public void setThreadgroupSizeMatchesTileSize(final boolean threadgroupSizeMatchesTileSize) {
        try {
            MH_setThreadgroupSizeMatchesTileSize_.invokeExact(this.handle, SEL_setThreadgroupSizeMatchesTileSize_, threadgroupSizeMatchesTileSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4TileRenderPipelineDescriptor maxTotalThreadsPerThreadgroup]} */
    public long maxTotalThreadsPerThreadgroup() {
        try {
            return (long) MH_maxTotalThreadsPerThreadgroup.invokeExact(this.handle, SEL_maxTotalThreadsPerThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4TileRenderPipelineDescriptor setMaxTotalThreadsPerThreadgroup:]} */
    public void setMaxTotalThreadsPerThreadgroup(final long maxTotalThreadsPerThreadgroup) {
        try {
            MH_setMaxTotalThreadsPerThreadgroup_.invokeExact(this.handle, SEL_setMaxTotalThreadsPerThreadgroup_, maxTotalThreadsPerThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4TileRenderPipelineDescriptor requiredThreadsPerThreadgroup]} */
    public MTLSize requiredThreadsPerThreadgroup() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_requiredThreadsPerThreadgroup.invokeExact((SegmentAllocator) stack, this.handle, SEL_requiredThreadsPerThreadgroup));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4TileRenderPipelineDescriptor setRequiredThreadsPerThreadgroup:]} */
    public void setRequiredThreadsPerThreadgroup(final MTLSize requiredThreadsPerThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setRequiredThreadsPerThreadgroup_.invokeExact(this.handle, SEL_setRequiredThreadsPerThreadgroup_, requiredThreadsPerThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4TileRenderPipelineDescriptor staticLinkingDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTL4StaticLinkingDescriptor staticLinkingDescriptor() {
        try {
            long result = (long) MH_staticLinkingDescriptor.invokeExact(this.handle, SEL_staticLinkingDescriptor);
            return new MTL4StaticLinkingDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4TileRenderPipelineDescriptor setStaticLinkingDescriptor:]} */
    public void setStaticLinkingDescriptor(@Nullable final MTL4StaticLinkingDescriptor staticLinkingDescriptor) {
        try {
            MH_setStaticLinkingDescriptor_.invokeExact(this.handle, SEL_setStaticLinkingDescriptor_, staticLinkingDescriptor == null ? 0L : staticLinkingDescriptor.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4TileRenderPipelineDescriptor supportBinaryLinking]} */
    public boolean supportBinaryLinking() {
        try {
            return (boolean) MH_supportBinaryLinking.invokeExact(this.handle, SEL_supportBinaryLinking);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4TileRenderPipelineDescriptor setSupportBinaryLinking:]} */
    public void setSupportBinaryLinking(final boolean supportBinaryLinking) {
        try {
            MH_setSupportBinaryLinking_.invokeExact(this.handle, SEL_setSupportBinaryLinking_, supportBinaryLinking);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
