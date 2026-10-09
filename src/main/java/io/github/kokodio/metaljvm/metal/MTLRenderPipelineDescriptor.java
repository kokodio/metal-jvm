package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLRenderPipelineDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlrenderpipelinedescriptor">Apple documentation</a>
 */
public class MTLRenderPipelineDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLRenderPipelineDescriptor");
    private static final long SEL_reset = ObjC.selector("reset");
    private static final MethodHandle MH_reset = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_vertexFunction = ObjC.selector("vertexFunction");
    private static final MethodHandle MH_vertexFunction = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexFunction_ = ObjC.selector("setVertexFunction:");
    private static final MethodHandle MH_setVertexFunction_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fragmentFunction = ObjC.selector("fragmentFunction");
    private static final MethodHandle MH_fragmentFunction = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentFunction_ = ObjC.selector("setFragmentFunction:");
    private static final MethodHandle MH_setFragmentFunction_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_vertexDescriptor = ObjC.selector("vertexDescriptor");
    private static final MethodHandle MH_vertexDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexDescriptor_ = ObjC.selector("setVertexDescriptor:");
    private static final MethodHandle MH_setVertexDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sampleCount = ObjC.selector("sampleCount");
    private static final MethodHandle MH_sampleCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSampleCount_ = ObjC.selector("setSampleCount:");
    private static final MethodHandle MH_setSampleCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rasterSampleCount = ObjC.selector("rasterSampleCount");
    private static final MethodHandle MH_rasterSampleCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRasterSampleCount_ = ObjC.selector("setRasterSampleCount:");
    private static final MethodHandle MH_setRasterSampleCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isAlphaToCoverageEnabled = ObjC.selector("isAlphaToCoverageEnabled");
    private static final MethodHandle MH_isAlphaToCoverageEnabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAlphaToCoverageEnabled_ = ObjC.selector("setAlphaToCoverageEnabled:");
    private static final MethodHandle MH_setAlphaToCoverageEnabled_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_isAlphaToOneEnabled = ObjC.selector("isAlphaToOneEnabled");
    private static final MethodHandle MH_isAlphaToOneEnabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAlphaToOneEnabled_ = ObjC.selector("setAlphaToOneEnabled:");
    private static final MethodHandle MH_setAlphaToOneEnabled_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_isRasterizationEnabled = ObjC.selector("isRasterizationEnabled");
    private static final MethodHandle MH_isRasterizationEnabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRasterizationEnabled_ = ObjC.selector("setRasterizationEnabled:");
    private static final MethodHandle MH_setRasterizationEnabled_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_maxVertexAmplificationCount = ObjC.selector("maxVertexAmplificationCount");
    private static final MethodHandle MH_maxVertexAmplificationCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxVertexAmplificationCount_ = ObjC.selector("setMaxVertexAmplificationCount:");
    private static final MethodHandle MH_setMaxVertexAmplificationCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_colorAttachments = ObjC.selector("colorAttachments");
    private static final MethodHandle MH_colorAttachments = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_depthAttachmentPixelFormat = ObjC.selector("depthAttachmentPixelFormat");
    private static final MethodHandle MH_depthAttachmentPixelFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthAttachmentPixelFormat_ = ObjC.selector("setDepthAttachmentPixelFormat:");
    private static final MethodHandle MH_setDepthAttachmentPixelFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stencilAttachmentPixelFormat = ObjC.selector("stencilAttachmentPixelFormat");
    private static final MethodHandle MH_stencilAttachmentPixelFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStencilAttachmentPixelFormat_ = ObjC.selector("setStencilAttachmentPixelFormat:");
    private static final MethodHandle MH_setStencilAttachmentPixelFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_inputPrimitiveTopology = ObjC.selector("inputPrimitiveTopology");
    private static final MethodHandle MH_inputPrimitiveTopology = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInputPrimitiveTopology_ = ObjC.selector("setInputPrimitiveTopology:");
    private static final MethodHandle MH_setInputPrimitiveTopology_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tessellationPartitionMode = ObjC.selector("tessellationPartitionMode");
    private static final MethodHandle MH_tessellationPartitionMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTessellationPartitionMode_ = ObjC.selector("setTessellationPartitionMode:");
    private static final MethodHandle MH_setTessellationPartitionMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxTessellationFactor = ObjC.selector("maxTessellationFactor");
    private static final MethodHandle MH_maxTessellationFactor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxTessellationFactor_ = ObjC.selector("setMaxTessellationFactor:");
    private static final MethodHandle MH_setMaxTessellationFactor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isTessellationFactorScaleEnabled = ObjC.selector("isTessellationFactorScaleEnabled");
    private static final MethodHandle MH_isTessellationFactorScaleEnabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTessellationFactorScaleEnabled_ = ObjC.selector("setTessellationFactorScaleEnabled:");
    private static final MethodHandle MH_setTessellationFactorScaleEnabled_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_tessellationFactorFormat = ObjC.selector("tessellationFactorFormat");
    private static final MethodHandle MH_tessellationFactorFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTessellationFactorFormat_ = ObjC.selector("setTessellationFactorFormat:");
    private static final MethodHandle MH_setTessellationFactorFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tessellationControlPointIndexType = ObjC.selector("tessellationControlPointIndexType");
    private static final MethodHandle MH_tessellationControlPointIndexType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTessellationControlPointIndexType_ = ObjC.selector("setTessellationControlPointIndexType:");
    private static final MethodHandle MH_setTessellationControlPointIndexType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tessellationFactorStepFunction = ObjC.selector("tessellationFactorStepFunction");
    private static final MethodHandle MH_tessellationFactorStepFunction = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTessellationFactorStepFunction_ = ObjC.selector("setTessellationFactorStepFunction:");
    private static final MethodHandle MH_setTessellationFactorStepFunction_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tessellationOutputWindingOrder = ObjC.selector("tessellationOutputWindingOrder");
    private static final MethodHandle MH_tessellationOutputWindingOrder = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTessellationOutputWindingOrder_ = ObjC.selector("setTessellationOutputWindingOrder:");
    private static final MethodHandle MH_setTessellationOutputWindingOrder_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_vertexBuffers = ObjC.selector("vertexBuffers");
    private static final MethodHandle MH_vertexBuffers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fragmentBuffers = ObjC.selector("fragmentBuffers");
    private static final MethodHandle MH_fragmentBuffers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportIndirectCommandBuffers = ObjC.selector("supportIndirectCommandBuffers");
    private static final MethodHandle MH_supportIndirectCommandBuffers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSupportIndirectCommandBuffers_ = ObjC.selector("setSupportIndirectCommandBuffers:");
    private static final MethodHandle MH_setSupportIndirectCommandBuffers_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_binaryArchives = ObjC.selector("binaryArchives");
    private static final MethodHandle MH_binaryArchives = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBinaryArchives_ = ObjC.selector("setBinaryArchives:");
    private static final MethodHandle MH_setBinaryArchives_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_vertexPreloadedLibraries = ObjC.selector("vertexPreloadedLibraries");
    private static final MethodHandle MH_vertexPreloadedLibraries = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexPreloadedLibraries_ = ObjC.selector("setVertexPreloadedLibraries:");
    private static final MethodHandle MH_setVertexPreloadedLibraries_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fragmentPreloadedLibraries = ObjC.selector("fragmentPreloadedLibraries");
    private static final MethodHandle MH_fragmentPreloadedLibraries = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentPreloadedLibraries_ = ObjC.selector("setFragmentPreloadedLibraries:");
    private static final MethodHandle MH_setFragmentPreloadedLibraries_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_vertexLinkedFunctions = ObjC.selector("vertexLinkedFunctions");
    private static final MethodHandle MH_vertexLinkedFunctions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexLinkedFunctions_ = ObjC.selector("setVertexLinkedFunctions:");
    private static final MethodHandle MH_setVertexLinkedFunctions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fragmentLinkedFunctions = ObjC.selector("fragmentLinkedFunctions");
    private static final MethodHandle MH_fragmentLinkedFunctions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentLinkedFunctions_ = ObjC.selector("setFragmentLinkedFunctions:");
    private static final MethodHandle MH_setFragmentLinkedFunctions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportAddingVertexBinaryFunctions = ObjC.selector("supportAddingVertexBinaryFunctions");
    private static final MethodHandle MH_supportAddingVertexBinaryFunctions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSupportAddingVertexBinaryFunctions_ = ObjC.selector("setSupportAddingVertexBinaryFunctions:");
    private static final MethodHandle MH_setSupportAddingVertexBinaryFunctions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_supportAddingFragmentBinaryFunctions = ObjC.selector("supportAddingFragmentBinaryFunctions");
    private static final MethodHandle MH_supportAddingFragmentBinaryFunctions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSupportAddingFragmentBinaryFunctions_ = ObjC.selector("setSupportAddingFragmentBinaryFunctions:");
    private static final MethodHandle MH_setSupportAddingFragmentBinaryFunctions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_maxVertexCallStackDepth = ObjC.selector("maxVertexCallStackDepth");
    private static final MethodHandle MH_maxVertexCallStackDepth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxVertexCallStackDepth_ = ObjC.selector("setMaxVertexCallStackDepth:");
    private static final MethodHandle MH_setMaxVertexCallStackDepth_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxFragmentCallStackDepth = ObjC.selector("maxFragmentCallStackDepth");
    private static final MethodHandle MH_maxFragmentCallStackDepth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxFragmentCallStackDepth_ = ObjC.selector("setMaxFragmentCallStackDepth:");
    private static final MethodHandle MH_setMaxFragmentCallStackDepth_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_shaderValidation = ObjC.selector("shaderValidation");
    private static final MethodHandle MH_shaderValidation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setShaderValidation_ = ObjC.selector("setShaderValidation:");
    private static final MethodHandle MH_setShaderValidation_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLRenderPipelineDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLRenderPipelineDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLRenderPipelineDescriptor alloc() {
        try {
            return new MTLRenderPipelineDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor init]} */
    public MTLRenderPipelineDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor reset]} */
    public void reset() {
        try {
            MH_reset.invokeExact(this.handle, SEL_reset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setLabel:]} */
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
     * {@code -[MTLRenderPipelineDescriptor vertexFunction]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLFunction vertexFunction() {
        try {
            long result = (long) MH_vertexFunction.invokeExact(this.handle, SEL_vertexFunction);
            return result == 0L ? null : new MTLFunction(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setVertexFunction:]} */
    public void setVertexFunction(@Nullable final MTLFunction vertexFunction) {
        try {
            MH_setVertexFunction_.invokeExact(this.handle, SEL_setVertexFunction_, vertexFunction == null ? 0L : vertexFunction.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineDescriptor fragmentFunction]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLFunction fragmentFunction() {
        try {
            long result = (long) MH_fragmentFunction.invokeExact(this.handle, SEL_fragmentFunction);
            return result == 0L ? null : new MTLFunction(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setFragmentFunction:]} */
    public void setFragmentFunction(@Nullable final MTLFunction fragmentFunction) {
        try {
            MH_setFragmentFunction_.invokeExact(this.handle, SEL_setFragmentFunction_, fragmentFunction == null ? 0L : fragmentFunction.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineDescriptor vertexDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLVertexDescriptor vertexDescriptor() {
        try {
            long result = (long) MH_vertexDescriptor.invokeExact(this.handle, SEL_vertexDescriptor);
            return result == 0L ? null : new MTLVertexDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setVertexDescriptor:]} */
    public void setVertexDescriptor(@Nullable final MTLVertexDescriptor vertexDescriptor) {
        try {
            MH_setVertexDescriptor_.invokeExact(this.handle, SEL_setVertexDescriptor_, vertexDescriptor == null ? 0L : vertexDescriptor.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor sampleCount]} */
    public long sampleCount() {
        try {
            return (long) MH_sampleCount.invokeExact(this.handle, SEL_sampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setSampleCount:]} */
    public void setSampleCount(final long sampleCount) {
        try {
            MH_setSampleCount_.invokeExact(this.handle, SEL_setSampleCount_, sampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor rasterSampleCount]} */
    public long rasterSampleCount() {
        try {
            return (long) MH_rasterSampleCount.invokeExact(this.handle, SEL_rasterSampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setRasterSampleCount:]} */
    public void setRasterSampleCount(final long rasterSampleCount) {
        try {
            MH_setRasterSampleCount_.invokeExact(this.handle, SEL_setRasterSampleCount_, rasterSampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor isAlphaToCoverageEnabled]} */
    public boolean isAlphaToCoverageEnabled() {
        try {
            return (boolean) MH_isAlphaToCoverageEnabled.invokeExact(this.handle, SEL_isAlphaToCoverageEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setAlphaToCoverageEnabled:]} */
    public void setAlphaToCoverageEnabled(final boolean alphaToCoverageEnabled) {
        try {
            MH_setAlphaToCoverageEnabled_.invokeExact(this.handle, SEL_setAlphaToCoverageEnabled_, alphaToCoverageEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor isAlphaToOneEnabled]} */
    public boolean isAlphaToOneEnabled() {
        try {
            return (boolean) MH_isAlphaToOneEnabled.invokeExact(this.handle, SEL_isAlphaToOneEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setAlphaToOneEnabled:]} */
    public void setAlphaToOneEnabled(final boolean alphaToOneEnabled) {
        try {
            MH_setAlphaToOneEnabled_.invokeExact(this.handle, SEL_setAlphaToOneEnabled_, alphaToOneEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor isRasterizationEnabled]} */
    public boolean isRasterizationEnabled() {
        try {
            return (boolean) MH_isRasterizationEnabled.invokeExact(this.handle, SEL_isRasterizationEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setRasterizationEnabled:]} */
    public void setRasterizationEnabled(final boolean rasterizationEnabled) {
        try {
            MH_setRasterizationEnabled_.invokeExact(this.handle, SEL_setRasterizationEnabled_, rasterizationEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor maxVertexAmplificationCount]} */
    public long maxVertexAmplificationCount() {
        try {
            return (long) MH_maxVertexAmplificationCount.invokeExact(this.handle, SEL_maxVertexAmplificationCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setMaxVertexAmplificationCount:]} */
    public void setMaxVertexAmplificationCount(final long maxVertexAmplificationCount) {
        try {
            MH_setMaxVertexAmplificationCount_.invokeExact(this.handle, SEL_setMaxVertexAmplificationCount_, maxVertexAmplificationCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineDescriptor colorAttachments]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLRenderPipelineColorAttachmentDescriptorArray colorAttachments() {
        try {
            long result = (long) MH_colorAttachments.invokeExact(this.handle, SEL_colorAttachments);
            return new MTLRenderPipelineColorAttachmentDescriptorArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor depthAttachmentPixelFormat]} */
    public MTLPixelFormat depthAttachmentPixelFormat() {
        try {
            return MTLPixelFormat.of((long) MH_depthAttachmentPixelFormat.invokeExact(this.handle, SEL_depthAttachmentPixelFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setDepthAttachmentPixelFormat:]} */
    public void setDepthAttachmentPixelFormat(final MTLPixelFormat depthAttachmentPixelFormat) {
        try {
            MH_setDepthAttachmentPixelFormat_.invokeExact(this.handle, SEL_setDepthAttachmentPixelFormat_, depthAttachmentPixelFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor stencilAttachmentPixelFormat]} */
    public MTLPixelFormat stencilAttachmentPixelFormat() {
        try {
            return MTLPixelFormat.of((long) MH_stencilAttachmentPixelFormat.invokeExact(this.handle, SEL_stencilAttachmentPixelFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setStencilAttachmentPixelFormat:]} */
    public void setStencilAttachmentPixelFormat(final MTLPixelFormat stencilAttachmentPixelFormat) {
        try {
            MH_setStencilAttachmentPixelFormat_.invokeExact(this.handle, SEL_setStencilAttachmentPixelFormat_, stencilAttachmentPixelFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor inputPrimitiveTopology]} */
    public MTLPrimitiveTopologyClass inputPrimitiveTopology() {
        try {
            return MTLPrimitiveTopologyClass.of((long) MH_inputPrimitiveTopology.invokeExact(this.handle, SEL_inputPrimitiveTopology));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setInputPrimitiveTopology:]} */
    public void setInputPrimitiveTopology(final MTLPrimitiveTopologyClass inputPrimitiveTopology) {
        try {
            MH_setInputPrimitiveTopology_.invokeExact(this.handle, SEL_setInputPrimitiveTopology_, inputPrimitiveTopology.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor tessellationPartitionMode]} */
    public MTLTessellationPartitionMode tessellationPartitionMode() {
        try {
            return MTLTessellationPartitionMode.of((long) MH_tessellationPartitionMode.invokeExact(this.handle, SEL_tessellationPartitionMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setTessellationPartitionMode:]} */
    public void setTessellationPartitionMode(final MTLTessellationPartitionMode tessellationPartitionMode) {
        try {
            MH_setTessellationPartitionMode_.invokeExact(this.handle, SEL_setTessellationPartitionMode_, tessellationPartitionMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor maxTessellationFactor]} */
    public long maxTessellationFactor() {
        try {
            return (long) MH_maxTessellationFactor.invokeExact(this.handle, SEL_maxTessellationFactor);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setMaxTessellationFactor:]} */
    public void setMaxTessellationFactor(final long maxTessellationFactor) {
        try {
            MH_setMaxTessellationFactor_.invokeExact(this.handle, SEL_setMaxTessellationFactor_, maxTessellationFactor);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor isTessellationFactorScaleEnabled]} */
    public boolean isTessellationFactorScaleEnabled() {
        try {
            return (boolean) MH_isTessellationFactorScaleEnabled.invokeExact(this.handle, SEL_isTessellationFactorScaleEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setTessellationFactorScaleEnabled:]} */
    public void setTessellationFactorScaleEnabled(final boolean tessellationFactorScaleEnabled) {
        try {
            MH_setTessellationFactorScaleEnabled_.invokeExact(this.handle, SEL_setTessellationFactorScaleEnabled_, tessellationFactorScaleEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor tessellationFactorFormat]} */
    public MTLTessellationFactorFormat tessellationFactorFormat() {
        try {
            return MTLTessellationFactorFormat.of((long) MH_tessellationFactorFormat.invokeExact(this.handle, SEL_tessellationFactorFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setTessellationFactorFormat:]} */
    public void setTessellationFactorFormat(final MTLTessellationFactorFormat tessellationFactorFormat) {
        try {
            MH_setTessellationFactorFormat_.invokeExact(this.handle, SEL_setTessellationFactorFormat_, tessellationFactorFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor tessellationControlPointIndexType]} */
    public MTLTessellationControlPointIndexType tessellationControlPointIndexType() {
        try {
            return MTLTessellationControlPointIndexType.of((long) MH_tessellationControlPointIndexType.invokeExact(this.handle, SEL_tessellationControlPointIndexType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setTessellationControlPointIndexType:]} */
    public void setTessellationControlPointIndexType(final MTLTessellationControlPointIndexType tessellationControlPointIndexType) {
        try {
            MH_setTessellationControlPointIndexType_.invokeExact(this.handle, SEL_setTessellationControlPointIndexType_, tessellationControlPointIndexType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor tessellationFactorStepFunction]} */
    public MTLTessellationFactorStepFunction tessellationFactorStepFunction() {
        try {
            return MTLTessellationFactorStepFunction.of((long) MH_tessellationFactorStepFunction.invokeExact(this.handle, SEL_tessellationFactorStepFunction));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setTessellationFactorStepFunction:]} */
    public void setTessellationFactorStepFunction(final MTLTessellationFactorStepFunction tessellationFactorStepFunction) {
        try {
            MH_setTessellationFactorStepFunction_.invokeExact(this.handle, SEL_setTessellationFactorStepFunction_, tessellationFactorStepFunction.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor tessellationOutputWindingOrder]} */
    public MTLWinding tessellationOutputWindingOrder() {
        try {
            return MTLWinding.of((long) MH_tessellationOutputWindingOrder.invokeExact(this.handle, SEL_tessellationOutputWindingOrder));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setTessellationOutputWindingOrder:]} */
    public void setTessellationOutputWindingOrder(final MTLWinding tessellationOutputWindingOrder) {
        try {
            MH_setTessellationOutputWindingOrder_.invokeExact(this.handle, SEL_setTessellationOutputWindingOrder_, tessellationOutputWindingOrder.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineDescriptor vertexBuffers]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLPipelineBufferDescriptorArray vertexBuffers() {
        try {
            long result = (long) MH_vertexBuffers.invokeExact(this.handle, SEL_vertexBuffers);
            return new MTLPipelineBufferDescriptorArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineDescriptor fragmentBuffers]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLPipelineBufferDescriptorArray fragmentBuffers() {
        try {
            long result = (long) MH_fragmentBuffers.invokeExact(this.handle, SEL_fragmentBuffers);
            return new MTLPipelineBufferDescriptorArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor supportIndirectCommandBuffers]} */
    public boolean supportIndirectCommandBuffers() {
        try {
            return (boolean) MH_supportIndirectCommandBuffers.invokeExact(this.handle, SEL_supportIndirectCommandBuffers);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setSupportIndirectCommandBuffers:]} */
    public void setSupportIndirectCommandBuffers(final boolean supportIndirectCommandBuffers) {
        try {
            MH_setSupportIndirectCommandBuffers_.invokeExact(this.handle, SEL_setSupportIndirectCommandBuffers_, supportIndirectCommandBuffers);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineDescriptor binaryArchives]}
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

    /** {@code -[MTLRenderPipelineDescriptor setBinaryArchives:]} */
    public void setBinaryArchives(@Nullable final NSArray<MTLBinaryArchive> binaryArchives) {
        try {
            MH_setBinaryArchives_.invokeExact(this.handle, SEL_setBinaryArchives_, binaryArchives == null ? 0L : binaryArchives.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineDescriptor vertexPreloadedLibraries]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLDynamicLibrary> vertexPreloadedLibraries() {
        try {
            long result = (long) MH_vertexPreloadedLibraries.invokeExact(this.handle, SEL_vertexPreloadedLibraries);
            return new NSArray<>(result, MTLDynamicLibrary::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setVertexPreloadedLibraries:]} */
    public void setVertexPreloadedLibraries(final NSArray<MTLDynamicLibrary> vertexPreloadedLibraries) {
        try {
            MH_setVertexPreloadedLibraries_.invokeExact(this.handle, SEL_setVertexPreloadedLibraries_, vertexPreloadedLibraries.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineDescriptor fragmentPreloadedLibraries]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLDynamicLibrary> fragmentPreloadedLibraries() {
        try {
            long result = (long) MH_fragmentPreloadedLibraries.invokeExact(this.handle, SEL_fragmentPreloadedLibraries);
            return new NSArray<>(result, MTLDynamicLibrary::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setFragmentPreloadedLibraries:]} */
    public void setFragmentPreloadedLibraries(final NSArray<MTLDynamicLibrary> fragmentPreloadedLibraries) {
        try {
            MH_setFragmentPreloadedLibraries_.invokeExact(this.handle, SEL_setFragmentPreloadedLibraries_, fragmentPreloadedLibraries.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineDescriptor vertexLinkedFunctions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLLinkedFunctions vertexLinkedFunctions() {
        try {
            long result = (long) MH_vertexLinkedFunctions.invokeExact(this.handle, SEL_vertexLinkedFunctions);
            return new MTLLinkedFunctions(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setVertexLinkedFunctions:]} */
    public void setVertexLinkedFunctions(@Nullable final MTLLinkedFunctions vertexLinkedFunctions) {
        try {
            MH_setVertexLinkedFunctions_.invokeExact(this.handle, SEL_setVertexLinkedFunctions_, vertexLinkedFunctions == null ? 0L : vertexLinkedFunctions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineDescriptor fragmentLinkedFunctions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLLinkedFunctions fragmentLinkedFunctions() {
        try {
            long result = (long) MH_fragmentLinkedFunctions.invokeExact(this.handle, SEL_fragmentLinkedFunctions);
            return new MTLLinkedFunctions(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setFragmentLinkedFunctions:]} */
    public void setFragmentLinkedFunctions(@Nullable final MTLLinkedFunctions fragmentLinkedFunctions) {
        try {
            MH_setFragmentLinkedFunctions_.invokeExact(this.handle, SEL_setFragmentLinkedFunctions_, fragmentLinkedFunctions == null ? 0L : fragmentLinkedFunctions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor supportAddingVertexBinaryFunctions]} */
    public boolean supportAddingVertexBinaryFunctions() {
        try {
            return (boolean) MH_supportAddingVertexBinaryFunctions.invokeExact(this.handle, SEL_supportAddingVertexBinaryFunctions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setSupportAddingVertexBinaryFunctions:]} */
    public void setSupportAddingVertexBinaryFunctions(final boolean supportAddingVertexBinaryFunctions) {
        try {
            MH_setSupportAddingVertexBinaryFunctions_.invokeExact(this.handle, SEL_setSupportAddingVertexBinaryFunctions_, supportAddingVertexBinaryFunctions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor supportAddingFragmentBinaryFunctions]} */
    public boolean supportAddingFragmentBinaryFunctions() {
        try {
            return (boolean) MH_supportAddingFragmentBinaryFunctions.invokeExact(this.handle, SEL_supportAddingFragmentBinaryFunctions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setSupportAddingFragmentBinaryFunctions:]} */
    public void setSupportAddingFragmentBinaryFunctions(final boolean supportAddingFragmentBinaryFunctions) {
        try {
            MH_setSupportAddingFragmentBinaryFunctions_.invokeExact(this.handle, SEL_setSupportAddingFragmentBinaryFunctions_, supportAddingFragmentBinaryFunctions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor maxVertexCallStackDepth]} */
    public long maxVertexCallStackDepth() {
        try {
            return (long) MH_maxVertexCallStackDepth.invokeExact(this.handle, SEL_maxVertexCallStackDepth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setMaxVertexCallStackDepth:]} */
    public void setMaxVertexCallStackDepth(final long maxVertexCallStackDepth) {
        try {
            MH_setMaxVertexCallStackDepth_.invokeExact(this.handle, SEL_setMaxVertexCallStackDepth_, maxVertexCallStackDepth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor maxFragmentCallStackDepth]} */
    public long maxFragmentCallStackDepth() {
        try {
            return (long) MH_maxFragmentCallStackDepth.invokeExact(this.handle, SEL_maxFragmentCallStackDepth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setMaxFragmentCallStackDepth:]} */
    public void setMaxFragmentCallStackDepth(final long maxFragmentCallStackDepth) {
        try {
            MH_setMaxFragmentCallStackDepth_.invokeExact(this.handle, SEL_setMaxFragmentCallStackDepth_, maxFragmentCallStackDepth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor shaderValidation]} */
    public MTLShaderValidation shaderValidation() {
        try {
            return MTLShaderValidation.of((long) MH_shaderValidation.invokeExact(this.handle, SEL_shaderValidation));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineDescriptor setShaderValidation:]} */
    public void setShaderValidation(final MTLShaderValidation shaderValidation) {
        try {
            MH_setShaderValidation_.invokeExact(this.handle, SEL_setShaderValidation_, shaderValidation.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
