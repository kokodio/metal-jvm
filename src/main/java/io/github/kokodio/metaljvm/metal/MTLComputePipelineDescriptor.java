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
 * {@code MTLComputePipelineDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcomputepipelinedescriptor">Apple documentation</a>
 */
public class MTLComputePipelineDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLComputePipelineDescriptor");
    private static final long SEL_reset = ObjC.selector("reset");
    private static final MethodHandle MH_reset = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_computeFunction = ObjC.selector("computeFunction");
    private static final MethodHandle MH_computeFunction = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setComputeFunction_ = ObjC.selector("setComputeFunction:");
    private static final MethodHandle MH_setComputeFunction_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_threadGroupSizeIsMultipleOfThreadExecutionWidth = ObjC.selector("threadGroupSizeIsMultipleOfThreadExecutionWidth");
    private static final MethodHandle MH_threadGroupSizeIsMultipleOfThreadExecutionWidth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setThreadGroupSizeIsMultipleOfThreadExecutionWidth_ = ObjC.selector("setThreadGroupSizeIsMultipleOfThreadExecutionWidth:");
    private static final MethodHandle MH_setThreadGroupSizeIsMultipleOfThreadExecutionWidth_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_maxTotalThreadsPerThreadgroup = ObjC.selector("maxTotalThreadsPerThreadgroup");
    private static final MethodHandle MH_maxTotalThreadsPerThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxTotalThreadsPerThreadgroup_ = ObjC.selector("setMaxTotalThreadsPerThreadgroup:");
    private static final MethodHandle MH_setMaxTotalThreadsPerThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stageInputDescriptor = ObjC.selector("stageInputDescriptor");
    private static final MethodHandle MH_stageInputDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStageInputDescriptor_ = ObjC.selector("setStageInputDescriptor:");
    private static final MethodHandle MH_setStageInputDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_buffers = ObjC.selector("buffers");
    private static final MethodHandle MH_buffers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportIndirectCommandBuffers = ObjC.selector("supportIndirectCommandBuffers");
    private static final MethodHandle MH_supportIndirectCommandBuffers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSupportIndirectCommandBuffers_ = ObjC.selector("setSupportIndirectCommandBuffers:");
    private static final MethodHandle MH_setSupportIndirectCommandBuffers_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_insertLibraries = ObjC.selector("insertLibraries");
    private static final MethodHandle MH_insertLibraries = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInsertLibraries_ = ObjC.selector("setInsertLibraries:");
    private static final MethodHandle MH_setInsertLibraries_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_preloadedLibraries = ObjC.selector("preloadedLibraries");
    private static final MethodHandle MH_preloadedLibraries = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPreloadedLibraries_ = ObjC.selector("setPreloadedLibraries:");
    private static final MethodHandle MH_setPreloadedLibraries_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_binaryArchives = ObjC.selector("binaryArchives");
    private static final MethodHandle MH_binaryArchives = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBinaryArchives_ = ObjC.selector("setBinaryArchives:");
    private static final MethodHandle MH_setBinaryArchives_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final long SEL_forwardProgressUsage = ObjC.selector("forwardProgressUsage");
    private static final MethodHandle MH_forwardProgressUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setForwardProgressUsage_ = ObjC.selector("setForwardProgressUsage:");
    private static final MethodHandle MH_setForwardProgressUsage_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_contentionRelief = ObjC.selector("contentionRelief");
    private static final MethodHandle MH_contentionRelief = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setContentionRelief_ = ObjC.selector("setContentionRelief:");
    private static final MethodHandle MH_setContentionRelief_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_optimizeForPersistentKernel = ObjC.selector("optimizeForPersistentKernel");
    private static final MethodHandle MH_optimizeForPersistentKernel = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOptimizeForPersistentKernel_ = ObjC.selector("setOptimizeForPersistentKernel:");
    private static final MethodHandle MH_setOptimizeForPersistentKernel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLComputePipelineDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLComputePipelineDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLComputePipelineDescriptor alloc() {
        try {
            return new MTLComputePipelineDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor init]} */
    public MTLComputePipelineDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor reset]} */
    public void reset() {
        try {
            MH_reset.invokeExact(this.handle, SEL_reset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor setLabel:]} */
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
     * {@code -[MTLComputePipelineDescriptor computeFunction]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLFunction computeFunction() {
        try {
            long result = (long) MH_computeFunction.invokeExact(this.handle, SEL_computeFunction);
            return result == 0L ? null : new MTLFunction(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor setComputeFunction:]} */
    public void setComputeFunction(@Nullable final MTLFunction computeFunction) {
        try {
            MH_setComputeFunction_.invokeExact(this.handle, SEL_setComputeFunction_, computeFunction == null ? 0L : computeFunction.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor threadGroupSizeIsMultipleOfThreadExecutionWidth]} */
    public boolean threadGroupSizeIsMultipleOfThreadExecutionWidth() {
        try {
            return (boolean) MH_threadGroupSizeIsMultipleOfThreadExecutionWidth.invokeExact(this.handle, SEL_threadGroupSizeIsMultipleOfThreadExecutionWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor setThreadGroupSizeIsMultipleOfThreadExecutionWidth:]} */
    public void setThreadGroupSizeIsMultipleOfThreadExecutionWidth(final boolean threadGroupSizeIsMultipleOfThreadExecutionWidth) {
        try {
            MH_setThreadGroupSizeIsMultipleOfThreadExecutionWidth_.invokeExact(this.handle, SEL_setThreadGroupSizeIsMultipleOfThreadExecutionWidth_, threadGroupSizeIsMultipleOfThreadExecutionWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor maxTotalThreadsPerThreadgroup]} */
    public long maxTotalThreadsPerThreadgroup() {
        try {
            return (long) MH_maxTotalThreadsPerThreadgroup.invokeExact(this.handle, SEL_maxTotalThreadsPerThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor setMaxTotalThreadsPerThreadgroup:]} */
    public void setMaxTotalThreadsPerThreadgroup(final long maxTotalThreadsPerThreadgroup) {
        try {
            MH_setMaxTotalThreadsPerThreadgroup_.invokeExact(this.handle, SEL_setMaxTotalThreadsPerThreadgroup_, maxTotalThreadsPerThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLComputePipelineDescriptor stageInputDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLStageInputOutputDescriptor stageInputDescriptor() {
        try {
            long result = (long) MH_stageInputDescriptor.invokeExact(this.handle, SEL_stageInputDescriptor);
            return result == 0L ? null : new MTLStageInputOutputDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor setStageInputDescriptor:]} */
    public void setStageInputDescriptor(@Nullable final MTLStageInputOutputDescriptor stageInputDescriptor) {
        try {
            MH_setStageInputDescriptor_.invokeExact(this.handle, SEL_setStageInputDescriptor_, stageInputDescriptor == null ? 0L : stageInputDescriptor.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLComputePipelineDescriptor buffers]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLPipelineBufferDescriptorArray buffers() {
        try {
            long result = (long) MH_buffers.invokeExact(this.handle, SEL_buffers);
            return new MTLPipelineBufferDescriptorArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor supportIndirectCommandBuffers]} */
    public boolean supportIndirectCommandBuffers() {
        try {
            return (boolean) MH_supportIndirectCommandBuffers.invokeExact(this.handle, SEL_supportIndirectCommandBuffers);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor setSupportIndirectCommandBuffers:]} */
    public void setSupportIndirectCommandBuffers(final boolean supportIndirectCommandBuffers) {
        try {
            MH_setSupportIndirectCommandBuffers_.invokeExact(this.handle, SEL_setSupportIndirectCommandBuffers_, supportIndirectCommandBuffers);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLComputePipelineDescriptor insertLibraries]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTLDynamicLibrary> insertLibraries() {
        try {
            long result = (long) MH_insertLibraries.invokeExact(this.handle, SEL_insertLibraries);
            return result == 0L ? null : new NSArray<>(result, MTLDynamicLibrary::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor setInsertLibraries:]} */
    public void setInsertLibraries(@Nullable final NSArray<MTLDynamicLibrary> insertLibraries) {
        try {
            MH_setInsertLibraries_.invokeExact(this.handle, SEL_setInsertLibraries_, insertLibraries == null ? 0L : insertLibraries.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLComputePipelineDescriptor preloadedLibraries]}
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

    /** {@code -[MTLComputePipelineDescriptor setPreloadedLibraries:]} */
    public void setPreloadedLibraries(final NSArray<MTLDynamicLibrary> preloadedLibraries) {
        try {
            MH_setPreloadedLibraries_.invokeExact(this.handle, SEL_setPreloadedLibraries_, preloadedLibraries.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLComputePipelineDescriptor binaryArchives]}
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

    /** {@code -[MTLComputePipelineDescriptor setBinaryArchives:]} */
    public void setBinaryArchives(@Nullable final NSArray<MTLBinaryArchive> binaryArchives) {
        try {
            MH_setBinaryArchives_.invokeExact(this.handle, SEL_setBinaryArchives_, binaryArchives == null ? 0L : binaryArchives.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLComputePipelineDescriptor linkedFunctions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLLinkedFunctions linkedFunctions() {
        try {
            long result = (long) MH_linkedFunctions.invokeExact(this.handle, SEL_linkedFunctions);
            return result == 0L ? null : new MTLLinkedFunctions(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor setLinkedFunctions:]} */
    public void setLinkedFunctions(@Nullable final MTLLinkedFunctions linkedFunctions) {
        try {
            MH_setLinkedFunctions_.invokeExact(this.handle, SEL_setLinkedFunctions_, linkedFunctions == null ? 0L : linkedFunctions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor supportAddingBinaryFunctions]} */
    public boolean supportAddingBinaryFunctions() {
        try {
            return (boolean) MH_supportAddingBinaryFunctions.invokeExact(this.handle, SEL_supportAddingBinaryFunctions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor setSupportAddingBinaryFunctions:]} */
    public void setSupportAddingBinaryFunctions(final boolean supportAddingBinaryFunctions) {
        try {
            MH_setSupportAddingBinaryFunctions_.invokeExact(this.handle, SEL_setSupportAddingBinaryFunctions_, supportAddingBinaryFunctions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor maxCallStackDepth]} */
    public long maxCallStackDepth() {
        try {
            return (long) MH_maxCallStackDepth.invokeExact(this.handle, SEL_maxCallStackDepth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor setMaxCallStackDepth:]} */
    public void setMaxCallStackDepth(final long maxCallStackDepth) {
        try {
            MH_setMaxCallStackDepth_.invokeExact(this.handle, SEL_setMaxCallStackDepth_, maxCallStackDepth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor shaderValidation]} */
    public MTLShaderValidation shaderValidation() {
        try {
            return MTLShaderValidation.of((long) MH_shaderValidation.invokeExact(this.handle, SEL_shaderValidation));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor setShaderValidation:]} */
    public void setShaderValidation(final MTLShaderValidation shaderValidation) {
        try {
            MH_setShaderValidation_.invokeExact(this.handle, SEL_setShaderValidation_, shaderValidation.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor requiredThreadsPerThreadgroup]} */
    public MTLSize requiredThreadsPerThreadgroup() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_requiredThreadsPerThreadgroup.invokeExact((SegmentAllocator) stack, this.handle, SEL_requiredThreadsPerThreadgroup));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor setRequiredThreadsPerThreadgroup:]} */
    public void setRequiredThreadsPerThreadgroup(final MTLSize requiredThreadsPerThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setRequiredThreadsPerThreadgroup_.invokeExact(this.handle, SEL_setRequiredThreadsPerThreadgroup_, requiredThreadsPerThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor forwardProgressUsage]} */
    public MTLForwardProgressUsage forwardProgressUsage() {
        try {
            return MTLForwardProgressUsage.of((long) MH_forwardProgressUsage.invokeExact(this.handle, SEL_forwardProgressUsage));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor setForwardProgressUsage:]} */
    public void setForwardProgressUsage(final MTLForwardProgressUsage forwardProgressUsage) {
        try {
            MH_setForwardProgressUsage_.invokeExact(this.handle, SEL_setForwardProgressUsage_, forwardProgressUsage.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor contentionRelief]} */
    public MTLContentionRelief contentionRelief() {
        try {
            return MTLContentionRelief.of((long) MH_contentionRelief.invokeExact(this.handle, SEL_contentionRelief));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor setContentionRelief:]} */
    public void setContentionRelief(final MTLContentionRelief contentionRelief) {
        try {
            MH_setContentionRelief_.invokeExact(this.handle, SEL_setContentionRelief_, contentionRelief.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor optimizeForPersistentKernel]} */
    public boolean optimizeForPersistentKernel() {
        try {
            return (boolean) MH_optimizeForPersistentKernel.invokeExact(this.handle, SEL_optimizeForPersistentKernel);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineDescriptor setOptimizeForPersistentKernel:]} */
    public void setOptimizeForPersistentKernel(final boolean optimizeForPersistentKernel) {
        try {
            MH_setOptimizeForPersistentKernel_.invokeExact(this.handle, SEL_setOptimizeForPersistentKernel_, optimizeForPersistentKernel);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
