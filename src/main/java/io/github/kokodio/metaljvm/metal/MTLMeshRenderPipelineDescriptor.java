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
 * {@code MTLMeshRenderPipelineDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlmeshrenderpipelinedescriptor">Apple documentation</a>
 */
public class MTLMeshRenderPipelineDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLMeshRenderPipelineDescriptor");
    private static final long SEL_reset = ObjC.selector("reset");
    private static final MethodHandle MH_reset = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_objectFunction = ObjC.selector("objectFunction");
    private static final MethodHandle MH_objectFunction = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setObjectFunction_ = ObjC.selector("setObjectFunction:");
    private static final MethodHandle MH_setObjectFunction_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_meshFunction = ObjC.selector("meshFunction");
    private static final MethodHandle MH_meshFunction = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMeshFunction_ = ObjC.selector("setMeshFunction:");
    private static final MethodHandle MH_setMeshFunction_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fragmentFunction = ObjC.selector("fragmentFunction");
    private static final MethodHandle MH_fragmentFunction = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentFunction_ = ObjC.selector("setFragmentFunction:");
    private static final MethodHandle MH_setFragmentFunction_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxTotalThreadsPerObjectThreadgroup = ObjC.selector("maxTotalThreadsPerObjectThreadgroup");
    private static final MethodHandle MH_maxTotalThreadsPerObjectThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxTotalThreadsPerObjectThreadgroup_ = ObjC.selector("setMaxTotalThreadsPerObjectThreadgroup:");
    private static final MethodHandle MH_setMaxTotalThreadsPerObjectThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxTotalThreadsPerMeshThreadgroup = ObjC.selector("maxTotalThreadsPerMeshThreadgroup");
    private static final MethodHandle MH_maxTotalThreadsPerMeshThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxTotalThreadsPerMeshThreadgroup_ = ObjC.selector("setMaxTotalThreadsPerMeshThreadgroup:");
    private static final MethodHandle MH_setMaxTotalThreadsPerMeshThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_objectThreadgroupSizeIsMultipleOfThreadExecutionWidth = ObjC.selector("objectThreadgroupSizeIsMultipleOfThreadExecutionWidth");
    private static final MethodHandle MH_objectThreadgroupSizeIsMultipleOfThreadExecutionWidth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setObjectThreadgroupSizeIsMultipleOfThreadExecutionWidth_ = ObjC.selector("setObjectThreadgroupSizeIsMultipleOfThreadExecutionWidth:");
    private static final MethodHandle MH_setObjectThreadgroupSizeIsMultipleOfThreadExecutionWidth_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_meshThreadgroupSizeIsMultipleOfThreadExecutionWidth = ObjC.selector("meshThreadgroupSizeIsMultipleOfThreadExecutionWidth");
    private static final MethodHandle MH_meshThreadgroupSizeIsMultipleOfThreadExecutionWidth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMeshThreadgroupSizeIsMultipleOfThreadExecutionWidth_ = ObjC.selector("setMeshThreadgroupSizeIsMultipleOfThreadExecutionWidth:");
    private static final MethodHandle MH_setMeshThreadgroupSizeIsMultipleOfThreadExecutionWidth_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_payloadMemoryLength = ObjC.selector("payloadMemoryLength");
    private static final MethodHandle MH_payloadMemoryLength = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPayloadMemoryLength_ = ObjC.selector("setPayloadMemoryLength:");
    private static final MethodHandle MH_setPayloadMemoryLength_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxTotalThreadgroupsPerMeshGrid = ObjC.selector("maxTotalThreadgroupsPerMeshGrid");
    private static final MethodHandle MH_maxTotalThreadgroupsPerMeshGrid = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxTotalThreadgroupsPerMeshGrid_ = ObjC.selector("setMaxTotalThreadgroupsPerMeshGrid:");
    private static final MethodHandle MH_setMaxTotalThreadgroupsPerMeshGrid_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_objectBuffers = ObjC.selector("objectBuffers");
    private static final MethodHandle MH_objectBuffers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_meshBuffers = ObjC.selector("meshBuffers");
    private static final MethodHandle MH_meshBuffers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fragmentBuffers = ObjC.selector("fragmentBuffers");
    private static final MethodHandle MH_fragmentBuffers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final long SEL_supportIndirectCommandBuffers = ObjC.selector("supportIndirectCommandBuffers");
    private static final MethodHandle MH_supportIndirectCommandBuffers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSupportIndirectCommandBuffers_ = ObjC.selector("setSupportIndirectCommandBuffers:");
    private static final MethodHandle MH_setSupportIndirectCommandBuffers_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_binaryArchives = ObjC.selector("binaryArchives");
    private static final MethodHandle MH_binaryArchives = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBinaryArchives_ = ObjC.selector("setBinaryArchives:");
    private static final MethodHandle MH_setBinaryArchives_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_objectLinkedFunctions = ObjC.selector("objectLinkedFunctions");
    private static final MethodHandle MH_objectLinkedFunctions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setObjectLinkedFunctions_ = ObjC.selector("setObjectLinkedFunctions:");
    private static final MethodHandle MH_setObjectLinkedFunctions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_meshLinkedFunctions = ObjC.selector("meshLinkedFunctions");
    private static final MethodHandle MH_meshLinkedFunctions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMeshLinkedFunctions_ = ObjC.selector("setMeshLinkedFunctions:");
    private static final MethodHandle MH_setMeshLinkedFunctions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fragmentLinkedFunctions = ObjC.selector("fragmentLinkedFunctions");
    private static final MethodHandle MH_fragmentLinkedFunctions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentLinkedFunctions_ = ObjC.selector("setFragmentLinkedFunctions:");
    private static final MethodHandle MH_setFragmentLinkedFunctions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_shaderValidation = ObjC.selector("shaderValidation");
    private static final MethodHandle MH_shaderValidation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setShaderValidation_ = ObjC.selector("setShaderValidation:");
    private static final MethodHandle MH_setShaderValidation_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_requiredThreadsPerObjectThreadgroup = ObjC.selector("requiredThreadsPerObjectThreadgroup");
    private static final MethodHandle MH_requiredThreadsPerObjectThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRequiredThreadsPerObjectThreadgroup_ = ObjC.selector("setRequiredThreadsPerObjectThreadgroup:");
    private static final MethodHandle MH_setRequiredThreadsPerObjectThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_requiredThreadsPerMeshThreadgroup = ObjC.selector("requiredThreadsPerMeshThreadgroup");
    private static final MethodHandle MH_requiredThreadsPerMeshThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRequiredThreadsPerMeshThreadgroup_ = ObjC.selector("setRequiredThreadsPerMeshThreadgroup:");
    private static final MethodHandle MH_setRequiredThreadsPerMeshThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLMeshRenderPipelineDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLMeshRenderPipelineDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLMeshRenderPipelineDescriptor alloc() {
        try {
            return new MTLMeshRenderPipelineDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor init]} */
    public MTLMeshRenderPipelineDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor reset]} */
    public void reset() {
        try {
            MH_reset.invokeExact(this.handle, SEL_reset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setLabel:]} */
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
     * {@code -[MTLMeshRenderPipelineDescriptor objectFunction]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLFunction objectFunction() {
        try {
            long result = (long) MH_objectFunction.invokeExact(this.handle, SEL_objectFunction);
            return result == 0L ? null : new MTLFunction(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setObjectFunction:]} */
    public void setObjectFunction(@Nullable final MTLFunction objectFunction) {
        try {
            MH_setObjectFunction_.invokeExact(this.handle, SEL_setObjectFunction_, objectFunction == null ? 0L : objectFunction.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLMeshRenderPipelineDescriptor meshFunction]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLFunction meshFunction() {
        try {
            long result = (long) MH_meshFunction.invokeExact(this.handle, SEL_meshFunction);
            return result == 0L ? null : new MTLFunction(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setMeshFunction:]} */
    public void setMeshFunction(@Nullable final MTLFunction meshFunction) {
        try {
            MH_setMeshFunction_.invokeExact(this.handle, SEL_setMeshFunction_, meshFunction == null ? 0L : meshFunction.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLMeshRenderPipelineDescriptor fragmentFunction]}
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

    /** {@code -[MTLMeshRenderPipelineDescriptor setFragmentFunction:]} */
    public void setFragmentFunction(@Nullable final MTLFunction fragmentFunction) {
        try {
            MH_setFragmentFunction_.invokeExact(this.handle, SEL_setFragmentFunction_, fragmentFunction == null ? 0L : fragmentFunction.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor maxTotalThreadsPerObjectThreadgroup]} */
    public long maxTotalThreadsPerObjectThreadgroup() {
        try {
            return (long) MH_maxTotalThreadsPerObjectThreadgroup.invokeExact(this.handle, SEL_maxTotalThreadsPerObjectThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setMaxTotalThreadsPerObjectThreadgroup:]} */
    public void setMaxTotalThreadsPerObjectThreadgroup(final long maxTotalThreadsPerObjectThreadgroup) {
        try {
            MH_setMaxTotalThreadsPerObjectThreadgroup_.invokeExact(this.handle, SEL_setMaxTotalThreadsPerObjectThreadgroup_, maxTotalThreadsPerObjectThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor maxTotalThreadsPerMeshThreadgroup]} */
    public long maxTotalThreadsPerMeshThreadgroup() {
        try {
            return (long) MH_maxTotalThreadsPerMeshThreadgroup.invokeExact(this.handle, SEL_maxTotalThreadsPerMeshThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setMaxTotalThreadsPerMeshThreadgroup:]} */
    public void setMaxTotalThreadsPerMeshThreadgroup(final long maxTotalThreadsPerMeshThreadgroup) {
        try {
            MH_setMaxTotalThreadsPerMeshThreadgroup_.invokeExact(this.handle, SEL_setMaxTotalThreadsPerMeshThreadgroup_, maxTotalThreadsPerMeshThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor objectThreadgroupSizeIsMultipleOfThreadExecutionWidth]} */
    public boolean objectThreadgroupSizeIsMultipleOfThreadExecutionWidth() {
        try {
            return (boolean) MH_objectThreadgroupSizeIsMultipleOfThreadExecutionWidth.invokeExact(this.handle, SEL_objectThreadgroupSizeIsMultipleOfThreadExecutionWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setObjectThreadgroupSizeIsMultipleOfThreadExecutionWidth:]} */
    public void setObjectThreadgroupSizeIsMultipleOfThreadExecutionWidth(final boolean objectThreadgroupSizeIsMultipleOfThreadExecutionWidth) {
        try {
            MH_setObjectThreadgroupSizeIsMultipleOfThreadExecutionWidth_.invokeExact(this.handle, SEL_setObjectThreadgroupSizeIsMultipleOfThreadExecutionWidth_, objectThreadgroupSizeIsMultipleOfThreadExecutionWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor meshThreadgroupSizeIsMultipleOfThreadExecutionWidth]} */
    public boolean meshThreadgroupSizeIsMultipleOfThreadExecutionWidth() {
        try {
            return (boolean) MH_meshThreadgroupSizeIsMultipleOfThreadExecutionWidth.invokeExact(this.handle, SEL_meshThreadgroupSizeIsMultipleOfThreadExecutionWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setMeshThreadgroupSizeIsMultipleOfThreadExecutionWidth:]} */
    public void setMeshThreadgroupSizeIsMultipleOfThreadExecutionWidth(final boolean meshThreadgroupSizeIsMultipleOfThreadExecutionWidth) {
        try {
            MH_setMeshThreadgroupSizeIsMultipleOfThreadExecutionWidth_.invokeExact(this.handle, SEL_setMeshThreadgroupSizeIsMultipleOfThreadExecutionWidth_, meshThreadgroupSizeIsMultipleOfThreadExecutionWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor payloadMemoryLength]} */
    public long payloadMemoryLength() {
        try {
            return (long) MH_payloadMemoryLength.invokeExact(this.handle, SEL_payloadMemoryLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setPayloadMemoryLength:]} */
    public void setPayloadMemoryLength(final long payloadMemoryLength) {
        try {
            MH_setPayloadMemoryLength_.invokeExact(this.handle, SEL_setPayloadMemoryLength_, payloadMemoryLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor maxTotalThreadgroupsPerMeshGrid]} */
    public long maxTotalThreadgroupsPerMeshGrid() {
        try {
            return (long) MH_maxTotalThreadgroupsPerMeshGrid.invokeExact(this.handle, SEL_maxTotalThreadgroupsPerMeshGrid);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setMaxTotalThreadgroupsPerMeshGrid:]} */
    public void setMaxTotalThreadgroupsPerMeshGrid(final long maxTotalThreadgroupsPerMeshGrid) {
        try {
            MH_setMaxTotalThreadgroupsPerMeshGrid_.invokeExact(this.handle, SEL_setMaxTotalThreadgroupsPerMeshGrid_, maxTotalThreadgroupsPerMeshGrid);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLMeshRenderPipelineDescriptor objectBuffers]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLPipelineBufferDescriptorArray objectBuffers() {
        try {
            long result = (long) MH_objectBuffers.invokeExact(this.handle, SEL_objectBuffers);
            return new MTLPipelineBufferDescriptorArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLMeshRenderPipelineDescriptor meshBuffers]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLPipelineBufferDescriptorArray meshBuffers() {
        try {
            long result = (long) MH_meshBuffers.invokeExact(this.handle, SEL_meshBuffers);
            return new MTLPipelineBufferDescriptorArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLMeshRenderPipelineDescriptor fragmentBuffers]}
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

    /** {@code -[MTLMeshRenderPipelineDescriptor rasterSampleCount]} */
    public long rasterSampleCount() {
        try {
            return (long) MH_rasterSampleCount.invokeExact(this.handle, SEL_rasterSampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setRasterSampleCount:]} */
    public void setRasterSampleCount(final long rasterSampleCount) {
        try {
            MH_setRasterSampleCount_.invokeExact(this.handle, SEL_setRasterSampleCount_, rasterSampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor isAlphaToCoverageEnabled]} */
    public boolean isAlphaToCoverageEnabled() {
        try {
            return (boolean) MH_isAlphaToCoverageEnabled.invokeExact(this.handle, SEL_isAlphaToCoverageEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setAlphaToCoverageEnabled:]} */
    public void setAlphaToCoverageEnabled(final boolean alphaToCoverageEnabled) {
        try {
            MH_setAlphaToCoverageEnabled_.invokeExact(this.handle, SEL_setAlphaToCoverageEnabled_, alphaToCoverageEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor isAlphaToOneEnabled]} */
    public boolean isAlphaToOneEnabled() {
        try {
            return (boolean) MH_isAlphaToOneEnabled.invokeExact(this.handle, SEL_isAlphaToOneEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setAlphaToOneEnabled:]} */
    public void setAlphaToOneEnabled(final boolean alphaToOneEnabled) {
        try {
            MH_setAlphaToOneEnabled_.invokeExact(this.handle, SEL_setAlphaToOneEnabled_, alphaToOneEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor isRasterizationEnabled]} */
    public boolean isRasterizationEnabled() {
        try {
            return (boolean) MH_isRasterizationEnabled.invokeExact(this.handle, SEL_isRasterizationEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setRasterizationEnabled:]} */
    public void setRasterizationEnabled(final boolean rasterizationEnabled) {
        try {
            MH_setRasterizationEnabled_.invokeExact(this.handle, SEL_setRasterizationEnabled_, rasterizationEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor maxVertexAmplificationCount]} */
    public long maxVertexAmplificationCount() {
        try {
            return (long) MH_maxVertexAmplificationCount.invokeExact(this.handle, SEL_maxVertexAmplificationCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setMaxVertexAmplificationCount:]} */
    public void setMaxVertexAmplificationCount(final long maxVertexAmplificationCount) {
        try {
            MH_setMaxVertexAmplificationCount_.invokeExact(this.handle, SEL_setMaxVertexAmplificationCount_, maxVertexAmplificationCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLMeshRenderPipelineDescriptor colorAttachments]}
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

    /** {@code -[MTLMeshRenderPipelineDescriptor depthAttachmentPixelFormat]} */
    public MTLPixelFormat depthAttachmentPixelFormat() {
        try {
            return MTLPixelFormat.of((long) MH_depthAttachmentPixelFormat.invokeExact(this.handle, SEL_depthAttachmentPixelFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setDepthAttachmentPixelFormat:]} */
    public void setDepthAttachmentPixelFormat(final MTLPixelFormat depthAttachmentPixelFormat) {
        try {
            MH_setDepthAttachmentPixelFormat_.invokeExact(this.handle, SEL_setDepthAttachmentPixelFormat_, depthAttachmentPixelFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor stencilAttachmentPixelFormat]} */
    public MTLPixelFormat stencilAttachmentPixelFormat() {
        try {
            return MTLPixelFormat.of((long) MH_stencilAttachmentPixelFormat.invokeExact(this.handle, SEL_stencilAttachmentPixelFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setStencilAttachmentPixelFormat:]} */
    public void setStencilAttachmentPixelFormat(final MTLPixelFormat stencilAttachmentPixelFormat) {
        try {
            MH_setStencilAttachmentPixelFormat_.invokeExact(this.handle, SEL_setStencilAttachmentPixelFormat_, stencilAttachmentPixelFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor supportIndirectCommandBuffers]} */
    public boolean supportIndirectCommandBuffers() {
        try {
            return (boolean) MH_supportIndirectCommandBuffers.invokeExact(this.handle, SEL_supportIndirectCommandBuffers);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setSupportIndirectCommandBuffers:]} */
    public void setSupportIndirectCommandBuffers(final boolean supportIndirectCommandBuffers) {
        try {
            MH_setSupportIndirectCommandBuffers_.invokeExact(this.handle, SEL_setSupportIndirectCommandBuffers_, supportIndirectCommandBuffers);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLMeshRenderPipelineDescriptor binaryArchives]}
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

    /** {@code -[MTLMeshRenderPipelineDescriptor setBinaryArchives:]} */
    public void setBinaryArchives(@Nullable final NSArray<MTLBinaryArchive> binaryArchives) {
        try {
            MH_setBinaryArchives_.invokeExact(this.handle, SEL_setBinaryArchives_, binaryArchives == null ? 0L : binaryArchives.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLMeshRenderPipelineDescriptor objectLinkedFunctions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLLinkedFunctions objectLinkedFunctions() {
        try {
            long result = (long) MH_objectLinkedFunctions.invokeExact(this.handle, SEL_objectLinkedFunctions);
            return new MTLLinkedFunctions(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setObjectLinkedFunctions:]} */
    public void setObjectLinkedFunctions(@Nullable final MTLLinkedFunctions objectLinkedFunctions) {
        try {
            MH_setObjectLinkedFunctions_.invokeExact(this.handle, SEL_setObjectLinkedFunctions_, objectLinkedFunctions == null ? 0L : objectLinkedFunctions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLMeshRenderPipelineDescriptor meshLinkedFunctions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLLinkedFunctions meshLinkedFunctions() {
        try {
            long result = (long) MH_meshLinkedFunctions.invokeExact(this.handle, SEL_meshLinkedFunctions);
            return new MTLLinkedFunctions(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setMeshLinkedFunctions:]} */
    public void setMeshLinkedFunctions(@Nullable final MTLLinkedFunctions meshLinkedFunctions) {
        try {
            MH_setMeshLinkedFunctions_.invokeExact(this.handle, SEL_setMeshLinkedFunctions_, meshLinkedFunctions == null ? 0L : meshLinkedFunctions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLMeshRenderPipelineDescriptor fragmentLinkedFunctions]}
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

    /** {@code -[MTLMeshRenderPipelineDescriptor setFragmentLinkedFunctions:]} */
    public void setFragmentLinkedFunctions(@Nullable final MTLLinkedFunctions fragmentLinkedFunctions) {
        try {
            MH_setFragmentLinkedFunctions_.invokeExact(this.handle, SEL_setFragmentLinkedFunctions_, fragmentLinkedFunctions == null ? 0L : fragmentLinkedFunctions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor shaderValidation]} */
    public MTLShaderValidation shaderValidation() {
        try {
            return MTLShaderValidation.of((long) MH_shaderValidation.invokeExact(this.handle, SEL_shaderValidation));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setShaderValidation:]} */
    public void setShaderValidation(final MTLShaderValidation shaderValidation) {
        try {
            MH_setShaderValidation_.invokeExact(this.handle, SEL_setShaderValidation_, shaderValidation.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor requiredThreadsPerObjectThreadgroup]} */
    public MTLSize requiredThreadsPerObjectThreadgroup() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_requiredThreadsPerObjectThreadgroup.invokeExact((SegmentAllocator) stack, this.handle, SEL_requiredThreadsPerObjectThreadgroup));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setRequiredThreadsPerObjectThreadgroup:]} */
    public void setRequiredThreadsPerObjectThreadgroup(final MTLSize requiredThreadsPerObjectThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setRequiredThreadsPerObjectThreadgroup_.invokeExact(this.handle, SEL_setRequiredThreadsPerObjectThreadgroup_, requiredThreadsPerObjectThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor requiredThreadsPerMeshThreadgroup]} */
    public MTLSize requiredThreadsPerMeshThreadgroup() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_requiredThreadsPerMeshThreadgroup.invokeExact((SegmentAllocator) stack, this.handle, SEL_requiredThreadsPerMeshThreadgroup));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMeshRenderPipelineDescriptor setRequiredThreadsPerMeshThreadgroup:]} */
    public void setRequiredThreadsPerMeshThreadgroup(final MTLSize requiredThreadsPerMeshThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setRequiredThreadsPerMeshThreadgroup_.invokeExact(this.handle, SEL_setRequiredThreadsPerMeshThreadgroup_, requiredThreadsPerMeshThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
