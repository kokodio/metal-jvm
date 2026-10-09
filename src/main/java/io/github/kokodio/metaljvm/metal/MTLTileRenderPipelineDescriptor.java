package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSObject;
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
 * {@code MTLTileRenderPipelineDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltilerenderpipelinedescriptor">Apple documentation</a>
 */
public class MTLTileRenderPipelineDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLTileRenderPipelineDescriptor");
    private static final long SEL_reset = ObjC.selector("reset");
    private static final MethodHandle MH_reset = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tileFunction = ObjC.selector("tileFunction");
    private static final MethodHandle MH_tileFunction = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTileFunction_ = ObjC.selector("setTileFunction:");
    private static final MethodHandle MH_setTileFunction_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final long SEL_tileBuffers = ObjC.selector("tileBuffers");
    private static final MethodHandle MH_tileBuffers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxTotalThreadsPerThreadgroup = ObjC.selector("maxTotalThreadsPerThreadgroup");
    private static final MethodHandle MH_maxTotalThreadsPerThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxTotalThreadsPerThreadgroup_ = ObjC.selector("setMaxTotalThreadsPerThreadgroup:");
    private static final MethodHandle MH_setMaxTotalThreadsPerThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_binaryArchives = ObjC.selector("binaryArchives");
    private static final MethodHandle MH_binaryArchives = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBinaryArchives_ = ObjC.selector("setBinaryArchives:");
    private static final MethodHandle MH_setBinaryArchives_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_preloadedLibraries = ObjC.selector("preloadedLibraries");
    private static final MethodHandle MH_preloadedLibraries = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPreloadedLibraries_ = ObjC.selector("setPreloadedLibraries:");
    private static final MethodHandle MH_setPreloadedLibraries_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_linkedFunctions = ObjC.selector("linkedFunctions");
    private static final MethodHandle MH_linkedFunctions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLinkedFunctions_ = ObjC.selector("setLinkedFunctions:");
    private static final MethodHandle MH_setLinkedFunctions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportAddingBinaryFunctions = ObjC.selector("supportAddingBinaryFunctions");
    private static final MethodHandle MH_supportAddingBinaryFunctions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSupportAddingBinaryFunctions_ = ObjC.selector("setSupportAddingBinaryFunctions:");
    private static final MethodHandle MH_setSupportAddingBinaryFunctions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_maxCallStackDepth = ObjC.selector("maxCallStackDepth");
    private static final MethodHandle MH_maxCallStackDepth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxCallStackDepth_ = ObjC.selector("setMaxCallStackDepth:");
    private static final MethodHandle MH_setMaxCallStackDepth_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_shaderValidation = ObjC.selector("shaderValidation");
    private static final MethodHandle MH_shaderValidation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setShaderValidation_ = ObjC.selector("setShaderValidation:");
    private static final MethodHandle MH_setShaderValidation_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_requiredThreadsPerThreadgroup = ObjC.selector("requiredThreadsPerThreadgroup");
    private static final MethodHandle MH_requiredThreadsPerThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRequiredThreadsPerThreadgroup_ = ObjC.selector("setRequiredThreadsPerThreadgroup:");
    private static final MethodHandle MH_setRequiredThreadsPerThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLTileRenderPipelineDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLTileRenderPipelineDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLTileRenderPipelineDescriptor alloc() {
        try {
            return new MTLTileRenderPipelineDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineDescriptor init]} */
    public MTLTileRenderPipelineDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineDescriptor reset]} */
    public void reset() {
        try {
            MH_reset.invokeExact(this.handle, SEL_reset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineDescriptor label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineDescriptor setLabel:]} */
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

    /**
     * {@code -[MTLTileRenderPipelineDescriptor tileFunction]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLFunction tileFunction() {
        try {
            long result = (long) MH_tileFunction.invokeExact(this.handle, SEL_tileFunction);
            return new MTLFunction(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineDescriptor setTileFunction:]} */
    public void setTileFunction(final MTLFunction tileFunction) {
        try {
            MH_setTileFunction_.invokeExact(this.handle, SEL_setTileFunction_, tileFunction.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineDescriptor rasterSampleCount]} */
    public long rasterSampleCount() {
        try {
            return (long) MH_rasterSampleCount.invokeExact(this.handle, SEL_rasterSampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineDescriptor setRasterSampleCount:]} */
    public void setRasterSampleCount(final long rasterSampleCount) {
        try {
            MH_setRasterSampleCount_.invokeExact(this.handle, SEL_setRasterSampleCount_, rasterSampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTileRenderPipelineDescriptor colorAttachments]}
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

    /** {@code -[MTLTileRenderPipelineDescriptor threadgroupSizeMatchesTileSize]} */
    public boolean threadgroupSizeMatchesTileSize() {
        try {
            return (boolean) MH_threadgroupSizeMatchesTileSize.invokeExact(this.handle, SEL_threadgroupSizeMatchesTileSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineDescriptor setThreadgroupSizeMatchesTileSize:]} */
    public void setThreadgroupSizeMatchesTileSize(final boolean threadgroupSizeMatchesTileSize) {
        try {
            MH_setThreadgroupSizeMatchesTileSize_.invokeExact(this.handle, SEL_setThreadgroupSizeMatchesTileSize_, threadgroupSizeMatchesTileSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTileRenderPipelineDescriptor tileBuffers]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLPipelineBufferDescriptorArray tileBuffers() {
        try {
            long result = (long) MH_tileBuffers.invokeExact(this.handle, SEL_tileBuffers);
            return new MTLPipelineBufferDescriptorArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineDescriptor maxTotalThreadsPerThreadgroup]} */
    public long maxTotalThreadsPerThreadgroup() {
        try {
            return (long) MH_maxTotalThreadsPerThreadgroup.invokeExact(this.handle, SEL_maxTotalThreadsPerThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineDescriptor setMaxTotalThreadsPerThreadgroup:]} */
    public void setMaxTotalThreadsPerThreadgroup(final long maxTotalThreadsPerThreadgroup) {
        try {
            MH_setMaxTotalThreadsPerThreadgroup_.invokeExact(this.handle, SEL_setMaxTotalThreadsPerThreadgroup_, maxTotalThreadsPerThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTileRenderPipelineDescriptor binaryArchives]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTLBinaryArchive> binaryArchives() {
        try {
            long result = (long) MH_binaryArchives.invokeExact(this.handle, SEL_binaryArchives);
            return result == 0L ? null : new NSArray<>(result, MTLBinaryArchive::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineDescriptor setBinaryArchives:]} */
    public void setBinaryArchives(@Nullable final NSArray<MTLBinaryArchive> binaryArchives) {
        try {
            MH_setBinaryArchives_.invokeExact(this.handle, SEL_setBinaryArchives_, binaryArchives == null ? 0L : binaryArchives.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTileRenderPipelineDescriptor preloadedLibraries]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLDynamicLibrary> preloadedLibraries() {
        try {
            long result = (long) MH_preloadedLibraries.invokeExact(this.handle, SEL_preloadedLibraries);
            return new NSArray<>(result, MTLDynamicLibrary::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineDescriptor setPreloadedLibraries:]} */
    public void setPreloadedLibraries(final NSArray<MTLDynamicLibrary> preloadedLibraries) {
        try {
            MH_setPreloadedLibraries_.invokeExact(this.handle, SEL_setPreloadedLibraries_, preloadedLibraries.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTileRenderPipelineDescriptor linkedFunctions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLLinkedFunctions linkedFunctions() {
        try {
            long result = (long) MH_linkedFunctions.invokeExact(this.handle, SEL_linkedFunctions);
            return new MTLLinkedFunctions(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineDescriptor setLinkedFunctions:]} */
    public void setLinkedFunctions(@Nullable final MTLLinkedFunctions linkedFunctions) {
        try {
            MH_setLinkedFunctions_.invokeExact(this.handle, SEL_setLinkedFunctions_, linkedFunctions == null ? 0L : linkedFunctions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineDescriptor supportAddingBinaryFunctions]} */
    public boolean supportAddingBinaryFunctions() {
        try {
            return (boolean) MH_supportAddingBinaryFunctions.invokeExact(this.handle, SEL_supportAddingBinaryFunctions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineDescriptor setSupportAddingBinaryFunctions:]} */
    public void setSupportAddingBinaryFunctions(final boolean supportAddingBinaryFunctions) {
        try {
            MH_setSupportAddingBinaryFunctions_.invokeExact(this.handle, SEL_setSupportAddingBinaryFunctions_, supportAddingBinaryFunctions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineDescriptor maxCallStackDepth]} */
    public long maxCallStackDepth() {
        try {
            return (long) MH_maxCallStackDepth.invokeExact(this.handle, SEL_maxCallStackDepth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineDescriptor setMaxCallStackDepth:]} */
    public void setMaxCallStackDepth(final long maxCallStackDepth) {
        try {
            MH_setMaxCallStackDepth_.invokeExact(this.handle, SEL_setMaxCallStackDepth_, maxCallStackDepth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineDescriptor shaderValidation]} */
    public MTLShaderValidation shaderValidation() {
        try {
            return MTLShaderValidation.of((long) MH_shaderValidation.invokeExact(this.handle, SEL_shaderValidation));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineDescriptor setShaderValidation:]} */
    public void setShaderValidation(final MTLShaderValidation shaderValidation) {
        try {
            MH_setShaderValidation_.invokeExact(this.handle, SEL_setShaderValidation_, shaderValidation.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineDescriptor requiredThreadsPerThreadgroup]} */
    public MTLSize requiredThreadsPerThreadgroup() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_requiredThreadsPerThreadgroup.invokeExact((SegmentAllocator) stack, this.handle, SEL_requiredThreadsPerThreadgroup));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineDescriptor setRequiredThreadsPerThreadgroup:]} */
    public void setRequiredThreadsPerThreadgroup(final MTLSize requiredThreadsPerThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setRequiredThreadsPerThreadgroup_.invokeExact(this.handle, SEL_setRequiredThreadsPerThreadgroup_, requiredThreadsPerThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
