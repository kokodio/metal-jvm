package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4RenderPipelineDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4renderpipelinedescriptor">Apple documentation</a>
 */
public class MTL4RenderPipelineDescriptor extends MTL4PipelineDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4RenderPipelineDescriptor");
    private static final long SEL_reset = ObjC.selector("reset");
    private static final MethodHandle MH_reset = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_vertexFunctionDescriptor = ObjC.selector("vertexFunctionDescriptor");
    private static final MethodHandle MH_vertexFunctionDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexFunctionDescriptor_ = ObjC.selector("setVertexFunctionDescriptor:");
    private static final MethodHandle MH_setVertexFunctionDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fragmentFunctionDescriptor = ObjC.selector("fragmentFunctionDescriptor");
    private static final MethodHandle MH_fragmentFunctionDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentFunctionDescriptor_ = ObjC.selector("setFragmentFunctionDescriptor:");
    private static final MethodHandle MH_setFragmentFunctionDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_vertexDescriptor = ObjC.selector("vertexDescriptor");
    private static final MethodHandle MH_vertexDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexDescriptor_ = ObjC.selector("setVertexDescriptor:");
    private static final MethodHandle MH_setVertexDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rasterSampleCount = ObjC.selector("rasterSampleCount");
    private static final MethodHandle MH_rasterSampleCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRasterSampleCount_ = ObjC.selector("setRasterSampleCount:");
    private static final MethodHandle MH_setRasterSampleCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alphaToCoverageState = ObjC.selector("alphaToCoverageState");
    private static final MethodHandle MH_alphaToCoverageState = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAlphaToCoverageState_ = ObjC.selector("setAlphaToCoverageState:");
    private static final MethodHandle MH_setAlphaToCoverageState_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alphaToOneState = ObjC.selector("alphaToOneState");
    private static final MethodHandle MH_alphaToOneState = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAlphaToOneState_ = ObjC.selector("setAlphaToOneState:");
    private static final MethodHandle MH_setAlphaToOneState_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final long SEL_inputPrimitiveTopology = ObjC.selector("inputPrimitiveTopology");
    private static final MethodHandle MH_inputPrimitiveTopology = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInputPrimitiveTopology_ = ObjC.selector("setInputPrimitiveTopology:");
    private static final MethodHandle MH_setInputPrimitiveTopology_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_vertexStaticLinkingDescriptor = ObjC.selector("vertexStaticLinkingDescriptor");
    private static final MethodHandle MH_vertexStaticLinkingDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexStaticLinkingDescriptor_ = ObjC.selector("setVertexStaticLinkingDescriptor:");
    private static final MethodHandle MH_setVertexStaticLinkingDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fragmentStaticLinkingDescriptor = ObjC.selector("fragmentStaticLinkingDescriptor");
    private static final MethodHandle MH_fragmentStaticLinkingDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentStaticLinkingDescriptor_ = ObjC.selector("setFragmentStaticLinkingDescriptor:");
    private static final MethodHandle MH_setFragmentStaticLinkingDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportVertexBinaryLinking = ObjC.selector("supportVertexBinaryLinking");
    private static final MethodHandle MH_supportVertexBinaryLinking = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSupportVertexBinaryLinking_ = ObjC.selector("setSupportVertexBinaryLinking:");
    private static final MethodHandle MH_setSupportVertexBinaryLinking_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_supportFragmentBinaryLinking = ObjC.selector("supportFragmentBinaryLinking");
    private static final MethodHandle MH_supportFragmentBinaryLinking = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSupportFragmentBinaryLinking_ = ObjC.selector("setSupportFragmentBinaryLinking:");
    private static final MethodHandle MH_setSupportFragmentBinaryLinking_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_colorAttachmentMappingState = ObjC.selector("colorAttachmentMappingState");
    private static final MethodHandle MH_colorAttachmentMappingState = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setColorAttachmentMappingState_ = ObjC.selector("setColorAttachmentMappingState:");
    private static final MethodHandle MH_setColorAttachmentMappingState_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportIndirectCommandBuffers = ObjC.selector("supportIndirectCommandBuffers");
    private static final MethodHandle MH_supportIndirectCommandBuffers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSupportIndirectCommandBuffers_ = ObjC.selector("setSupportIndirectCommandBuffers:");
    private static final MethodHandle MH_setSupportIndirectCommandBuffers_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4RenderPipelineDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4RenderPipelineDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4RenderPipelineDescriptor alloc() {
        try {
            return new MTL4RenderPipelineDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor init]} */
    public MTL4RenderPipelineDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor reset]} */
    public void reset() {
        try {
            MH_reset.invokeExact(this.handle, SEL_reset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4RenderPipelineDescriptor vertexFunctionDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTL4FunctionDescriptor vertexFunctionDescriptor() {
        try {
            long result = (long) MH_vertexFunctionDescriptor.invokeExact(this.handle, SEL_vertexFunctionDescriptor);
            return result == 0L ? null : new MTL4FunctionDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor setVertexFunctionDescriptor:]} */
    public void setVertexFunctionDescriptor(@Nullable final MTL4FunctionDescriptor vertexFunctionDescriptor) {
        try {
            MH_setVertexFunctionDescriptor_.invokeExact(this.handle, SEL_setVertexFunctionDescriptor_, vertexFunctionDescriptor == null ? 0L : vertexFunctionDescriptor.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4RenderPipelineDescriptor fragmentFunctionDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTL4FunctionDescriptor fragmentFunctionDescriptor() {
        try {
            long result = (long) MH_fragmentFunctionDescriptor.invokeExact(this.handle, SEL_fragmentFunctionDescriptor);
            return result == 0L ? null : new MTL4FunctionDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor setFragmentFunctionDescriptor:]} */
    public void setFragmentFunctionDescriptor(@Nullable final MTL4FunctionDescriptor fragmentFunctionDescriptor) {
        try {
            MH_setFragmentFunctionDescriptor_.invokeExact(this.handle, SEL_setFragmentFunctionDescriptor_, fragmentFunctionDescriptor == null ? 0L : fragmentFunctionDescriptor.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4RenderPipelineDescriptor vertexDescriptor]}
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

    /** {@code -[MTL4RenderPipelineDescriptor setVertexDescriptor:]} */
    public void setVertexDescriptor(@Nullable final MTLVertexDescriptor vertexDescriptor) {
        try {
            MH_setVertexDescriptor_.invokeExact(this.handle, SEL_setVertexDescriptor_, vertexDescriptor == null ? 0L : vertexDescriptor.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor rasterSampleCount]} */
    public long rasterSampleCount() {
        try {
            return (long) MH_rasterSampleCount.invokeExact(this.handle, SEL_rasterSampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor setRasterSampleCount:]} */
    public void setRasterSampleCount(final long rasterSampleCount) {
        try {
            MH_setRasterSampleCount_.invokeExact(this.handle, SEL_setRasterSampleCount_, rasterSampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor alphaToCoverageState]} */
    public MTL4AlphaToCoverageState alphaToCoverageState() {
        try {
            return MTL4AlphaToCoverageState.of((long) MH_alphaToCoverageState.invokeExact(this.handle, SEL_alphaToCoverageState));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor setAlphaToCoverageState:]} */
    public void setAlphaToCoverageState(final MTL4AlphaToCoverageState alphaToCoverageState) {
        try {
            MH_setAlphaToCoverageState_.invokeExact(this.handle, SEL_setAlphaToCoverageState_, alphaToCoverageState.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor alphaToOneState]} */
    public MTL4AlphaToOneState alphaToOneState() {
        try {
            return MTL4AlphaToOneState.of((long) MH_alphaToOneState.invokeExact(this.handle, SEL_alphaToOneState));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor setAlphaToOneState:]} */
    public void setAlphaToOneState(final MTL4AlphaToOneState alphaToOneState) {
        try {
            MH_setAlphaToOneState_.invokeExact(this.handle, SEL_setAlphaToOneState_, alphaToOneState.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor isRasterizationEnabled]} */
    public boolean isRasterizationEnabled() {
        try {
            return (boolean) MH_isRasterizationEnabled.invokeExact(this.handle, SEL_isRasterizationEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor setRasterizationEnabled:]} */
    public void setRasterizationEnabled(final boolean rasterizationEnabled) {
        try {
            MH_setRasterizationEnabled_.invokeExact(this.handle, SEL_setRasterizationEnabled_, rasterizationEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor maxVertexAmplificationCount]} */
    public long maxVertexAmplificationCount() {
        try {
            return (long) MH_maxVertexAmplificationCount.invokeExact(this.handle, SEL_maxVertexAmplificationCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor setMaxVertexAmplificationCount:]} */
    public void setMaxVertexAmplificationCount(final long maxVertexAmplificationCount) {
        try {
            MH_setMaxVertexAmplificationCount_.invokeExact(this.handle, SEL_setMaxVertexAmplificationCount_, maxVertexAmplificationCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4RenderPipelineDescriptor colorAttachments]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTL4RenderPipelineColorAttachmentDescriptorArray colorAttachments() {
        try {
            long result = (long) MH_colorAttachments.invokeExact(this.handle, SEL_colorAttachments);
            return new MTL4RenderPipelineColorAttachmentDescriptorArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor inputPrimitiveTopology]} */
    public MTLPrimitiveTopologyClass inputPrimitiveTopology() {
        try {
            return MTLPrimitiveTopologyClass.of((long) MH_inputPrimitiveTopology.invokeExact(this.handle, SEL_inputPrimitiveTopology));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor setInputPrimitiveTopology:]} */
    public void setInputPrimitiveTopology(final MTLPrimitiveTopologyClass inputPrimitiveTopology) {
        try {
            MH_setInputPrimitiveTopology_.invokeExact(this.handle, SEL_setInputPrimitiveTopology_, inputPrimitiveTopology.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4RenderPipelineDescriptor vertexStaticLinkingDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTL4StaticLinkingDescriptor vertexStaticLinkingDescriptor() {
        try {
            long result = (long) MH_vertexStaticLinkingDescriptor.invokeExact(this.handle, SEL_vertexStaticLinkingDescriptor);
            return new MTL4StaticLinkingDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor setVertexStaticLinkingDescriptor:]} */
    public void setVertexStaticLinkingDescriptor(@Nullable final MTL4StaticLinkingDescriptor vertexStaticLinkingDescriptor) {
        try {
            MH_setVertexStaticLinkingDescriptor_.invokeExact(this.handle, SEL_setVertexStaticLinkingDescriptor_, vertexStaticLinkingDescriptor == null ? 0L : vertexStaticLinkingDescriptor.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4RenderPipelineDescriptor fragmentStaticLinkingDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTL4StaticLinkingDescriptor fragmentStaticLinkingDescriptor() {
        try {
            long result = (long) MH_fragmentStaticLinkingDescriptor.invokeExact(this.handle, SEL_fragmentStaticLinkingDescriptor);
            return new MTL4StaticLinkingDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor setFragmentStaticLinkingDescriptor:]} */
    public void setFragmentStaticLinkingDescriptor(@Nullable final MTL4StaticLinkingDescriptor fragmentStaticLinkingDescriptor) {
        try {
            MH_setFragmentStaticLinkingDescriptor_.invokeExact(this.handle, SEL_setFragmentStaticLinkingDescriptor_, fragmentStaticLinkingDescriptor == null ? 0L : fragmentStaticLinkingDescriptor.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor supportVertexBinaryLinking]} */
    public boolean supportVertexBinaryLinking() {
        try {
            return (boolean) MH_supportVertexBinaryLinking.invokeExact(this.handle, SEL_supportVertexBinaryLinking);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor setSupportVertexBinaryLinking:]} */
    public void setSupportVertexBinaryLinking(final boolean supportVertexBinaryLinking) {
        try {
            MH_setSupportVertexBinaryLinking_.invokeExact(this.handle, SEL_setSupportVertexBinaryLinking_, supportVertexBinaryLinking);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor supportFragmentBinaryLinking]} */
    public boolean supportFragmentBinaryLinking() {
        try {
            return (boolean) MH_supportFragmentBinaryLinking.invokeExact(this.handle, SEL_supportFragmentBinaryLinking);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor setSupportFragmentBinaryLinking:]} */
    public void setSupportFragmentBinaryLinking(final boolean supportFragmentBinaryLinking) {
        try {
            MH_setSupportFragmentBinaryLinking_.invokeExact(this.handle, SEL_setSupportFragmentBinaryLinking_, supportFragmentBinaryLinking);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor colorAttachmentMappingState]} */
    public MTL4LogicalToPhysicalColorAttachmentMappingState colorAttachmentMappingState() {
        try {
            return MTL4LogicalToPhysicalColorAttachmentMappingState.of((long) MH_colorAttachmentMappingState.invokeExact(this.handle, SEL_colorAttachmentMappingState));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor setColorAttachmentMappingState:]} */
    public void setColorAttachmentMappingState(final MTL4LogicalToPhysicalColorAttachmentMappingState colorAttachmentMappingState) {
        try {
            MH_setColorAttachmentMappingState_.invokeExact(this.handle, SEL_setColorAttachmentMappingState_, colorAttachmentMappingState.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor supportIndirectCommandBuffers]} */
    public MTL4IndirectCommandBufferSupportState supportIndirectCommandBuffers() {
        try {
            return MTL4IndirectCommandBufferSupportState.of((long) MH_supportIndirectCommandBuffers.invokeExact(this.handle, SEL_supportIndirectCommandBuffers));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDescriptor setSupportIndirectCommandBuffers:]} */
    public void setSupportIndirectCommandBuffers(final MTL4IndirectCommandBufferSupportState supportIndirectCommandBuffers) {
        try {
            MH_setSupportIndirectCommandBuffers_.invokeExact(this.handle, SEL_setSupportIndirectCommandBuffers_, supportIndirectCommandBuffers.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
