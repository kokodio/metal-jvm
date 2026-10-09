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
 * {@code MTL4MeshRenderPipelineDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4meshrenderpipelinedescriptor">Apple documentation</a>
 */
public class MTL4MeshRenderPipelineDescriptor extends MTL4PipelineDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4MeshRenderPipelineDescriptor");
    private static final long SEL_reset = ObjC.selector("reset");
    private static final MethodHandle MH_reset = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_objectFunctionDescriptor = ObjC.selector("objectFunctionDescriptor");
    private static final MethodHandle MH_objectFunctionDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setObjectFunctionDescriptor_ = ObjC.selector("setObjectFunctionDescriptor:");
    private static final MethodHandle MH_setObjectFunctionDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_meshFunctionDescriptor = ObjC.selector("meshFunctionDescriptor");
    private static final MethodHandle MH_meshFunctionDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMeshFunctionDescriptor_ = ObjC.selector("setMeshFunctionDescriptor:");
    private static final MethodHandle MH_setMeshFunctionDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fragmentFunctionDescriptor = ObjC.selector("fragmentFunctionDescriptor");
    private static final MethodHandle MH_fragmentFunctionDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentFunctionDescriptor_ = ObjC.selector("setFragmentFunctionDescriptor:");
    private static final MethodHandle MH_setFragmentFunctionDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxTotalThreadsPerObjectThreadgroup = ObjC.selector("maxTotalThreadsPerObjectThreadgroup");
    private static final MethodHandle MH_maxTotalThreadsPerObjectThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxTotalThreadsPerObjectThreadgroup_ = ObjC.selector("setMaxTotalThreadsPerObjectThreadgroup:");
    private static final MethodHandle MH_setMaxTotalThreadsPerObjectThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxTotalThreadsPerMeshThreadgroup = ObjC.selector("maxTotalThreadsPerMeshThreadgroup");
    private static final MethodHandle MH_maxTotalThreadsPerMeshThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxTotalThreadsPerMeshThreadgroup_ = ObjC.selector("setMaxTotalThreadsPerMeshThreadgroup:");
    private static final MethodHandle MH_setMaxTotalThreadsPerMeshThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_requiredThreadsPerObjectThreadgroup = ObjC.selector("requiredThreadsPerObjectThreadgroup");
    private static final MethodHandle MH_requiredThreadsPerObjectThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRequiredThreadsPerObjectThreadgroup_ = ObjC.selector("setRequiredThreadsPerObjectThreadgroup:");
    private static final MethodHandle MH_setRequiredThreadsPerObjectThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_requiredThreadsPerMeshThreadgroup = ObjC.selector("requiredThreadsPerMeshThreadgroup");
    private static final MethodHandle MH_requiredThreadsPerMeshThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRequiredThreadsPerMeshThreadgroup_ = ObjC.selector("setRequiredThreadsPerMeshThreadgroup:");
    private static final MethodHandle MH_setRequiredThreadsPerMeshThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final long SEL_objectStaticLinkingDescriptor = ObjC.selector("objectStaticLinkingDescriptor");
    private static final MethodHandle MH_objectStaticLinkingDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setObjectStaticLinkingDescriptor_ = ObjC.selector("setObjectStaticLinkingDescriptor:");
    private static final MethodHandle MH_setObjectStaticLinkingDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_meshStaticLinkingDescriptor = ObjC.selector("meshStaticLinkingDescriptor");
    private static final MethodHandle MH_meshStaticLinkingDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMeshStaticLinkingDescriptor_ = ObjC.selector("setMeshStaticLinkingDescriptor:");
    private static final MethodHandle MH_setMeshStaticLinkingDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fragmentStaticLinkingDescriptor = ObjC.selector("fragmentStaticLinkingDescriptor");
    private static final MethodHandle MH_fragmentStaticLinkingDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentStaticLinkingDescriptor_ = ObjC.selector("setFragmentStaticLinkingDescriptor:");
    private static final MethodHandle MH_setFragmentStaticLinkingDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportObjectBinaryLinking = ObjC.selector("supportObjectBinaryLinking");
    private static final MethodHandle MH_supportObjectBinaryLinking = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSupportObjectBinaryLinking_ = ObjC.selector("setSupportObjectBinaryLinking:");
    private static final MethodHandle MH_setSupportObjectBinaryLinking_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_supportMeshBinaryLinking = ObjC.selector("supportMeshBinaryLinking");
    private static final MethodHandle MH_supportMeshBinaryLinking = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSupportMeshBinaryLinking_ = ObjC.selector("setSupportMeshBinaryLinking:");
    private static final MethodHandle MH_setSupportMeshBinaryLinking_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
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

    public MTL4MeshRenderPipelineDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4MeshRenderPipelineDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4MeshRenderPipelineDescriptor alloc() {
        try {
            return new MTL4MeshRenderPipelineDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor init]} */
    public MTL4MeshRenderPipelineDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor reset]} */
    public void reset() {
        try {
            MH_reset.invokeExact(this.handle, SEL_reset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4MeshRenderPipelineDescriptor objectFunctionDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTL4FunctionDescriptor objectFunctionDescriptor() {
        try {
            long result = (long) MH_objectFunctionDescriptor.invokeExact(this.handle, SEL_objectFunctionDescriptor);
            return result == 0L ? null : new MTL4FunctionDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setObjectFunctionDescriptor:]} */
    public void setObjectFunctionDescriptor(@Nullable final MTL4FunctionDescriptor objectFunctionDescriptor) {
        try {
            MH_setObjectFunctionDescriptor_.invokeExact(this.handle, SEL_setObjectFunctionDescriptor_, objectFunctionDescriptor == null ? 0L : objectFunctionDescriptor.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4MeshRenderPipelineDescriptor meshFunctionDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTL4FunctionDescriptor meshFunctionDescriptor() {
        try {
            long result = (long) MH_meshFunctionDescriptor.invokeExact(this.handle, SEL_meshFunctionDescriptor);
            return result == 0L ? null : new MTL4FunctionDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setMeshFunctionDescriptor:]} */
    public void setMeshFunctionDescriptor(@Nullable final MTL4FunctionDescriptor meshFunctionDescriptor) {
        try {
            MH_setMeshFunctionDescriptor_.invokeExact(this.handle, SEL_setMeshFunctionDescriptor_, meshFunctionDescriptor == null ? 0L : meshFunctionDescriptor.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4MeshRenderPipelineDescriptor fragmentFunctionDescriptor]}
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

    /** {@code -[MTL4MeshRenderPipelineDescriptor setFragmentFunctionDescriptor:]} */
    public void setFragmentFunctionDescriptor(@Nullable final MTL4FunctionDescriptor fragmentFunctionDescriptor) {
        try {
            MH_setFragmentFunctionDescriptor_.invokeExact(this.handle, SEL_setFragmentFunctionDescriptor_, fragmentFunctionDescriptor == null ? 0L : fragmentFunctionDescriptor.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor maxTotalThreadsPerObjectThreadgroup]} */
    public long maxTotalThreadsPerObjectThreadgroup() {
        try {
            return (long) MH_maxTotalThreadsPerObjectThreadgroup.invokeExact(this.handle, SEL_maxTotalThreadsPerObjectThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setMaxTotalThreadsPerObjectThreadgroup:]} */
    public void setMaxTotalThreadsPerObjectThreadgroup(final long maxTotalThreadsPerObjectThreadgroup) {
        try {
            MH_setMaxTotalThreadsPerObjectThreadgroup_.invokeExact(this.handle, SEL_setMaxTotalThreadsPerObjectThreadgroup_, maxTotalThreadsPerObjectThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor maxTotalThreadsPerMeshThreadgroup]} */
    public long maxTotalThreadsPerMeshThreadgroup() {
        try {
            return (long) MH_maxTotalThreadsPerMeshThreadgroup.invokeExact(this.handle, SEL_maxTotalThreadsPerMeshThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setMaxTotalThreadsPerMeshThreadgroup:]} */
    public void setMaxTotalThreadsPerMeshThreadgroup(final long maxTotalThreadsPerMeshThreadgroup) {
        try {
            MH_setMaxTotalThreadsPerMeshThreadgroup_.invokeExact(this.handle, SEL_setMaxTotalThreadsPerMeshThreadgroup_, maxTotalThreadsPerMeshThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor requiredThreadsPerObjectThreadgroup]} */
    public MTLSize requiredThreadsPerObjectThreadgroup() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_requiredThreadsPerObjectThreadgroup.invokeExact((SegmentAllocator) stack, this.handle, SEL_requiredThreadsPerObjectThreadgroup));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setRequiredThreadsPerObjectThreadgroup:]} */
    public void setRequiredThreadsPerObjectThreadgroup(final MTLSize requiredThreadsPerObjectThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setRequiredThreadsPerObjectThreadgroup_.invokeExact(this.handle, SEL_setRequiredThreadsPerObjectThreadgroup_, requiredThreadsPerObjectThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor requiredThreadsPerMeshThreadgroup]} */
    public MTLSize requiredThreadsPerMeshThreadgroup() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_requiredThreadsPerMeshThreadgroup.invokeExact((SegmentAllocator) stack, this.handle, SEL_requiredThreadsPerMeshThreadgroup));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setRequiredThreadsPerMeshThreadgroup:]} */
    public void setRequiredThreadsPerMeshThreadgroup(final MTLSize requiredThreadsPerMeshThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setRequiredThreadsPerMeshThreadgroup_.invokeExact(this.handle, SEL_setRequiredThreadsPerMeshThreadgroup_, requiredThreadsPerMeshThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor objectThreadgroupSizeIsMultipleOfThreadExecutionWidth]} */
    public boolean objectThreadgroupSizeIsMultipleOfThreadExecutionWidth() {
        try {
            return (boolean) MH_objectThreadgroupSizeIsMultipleOfThreadExecutionWidth.invokeExact(this.handle, SEL_objectThreadgroupSizeIsMultipleOfThreadExecutionWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setObjectThreadgroupSizeIsMultipleOfThreadExecutionWidth:]} */
    public void setObjectThreadgroupSizeIsMultipleOfThreadExecutionWidth(final boolean objectThreadgroupSizeIsMultipleOfThreadExecutionWidth) {
        try {
            MH_setObjectThreadgroupSizeIsMultipleOfThreadExecutionWidth_.invokeExact(this.handle, SEL_setObjectThreadgroupSizeIsMultipleOfThreadExecutionWidth_, objectThreadgroupSizeIsMultipleOfThreadExecutionWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor meshThreadgroupSizeIsMultipleOfThreadExecutionWidth]} */
    public boolean meshThreadgroupSizeIsMultipleOfThreadExecutionWidth() {
        try {
            return (boolean) MH_meshThreadgroupSizeIsMultipleOfThreadExecutionWidth.invokeExact(this.handle, SEL_meshThreadgroupSizeIsMultipleOfThreadExecutionWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setMeshThreadgroupSizeIsMultipleOfThreadExecutionWidth:]} */
    public void setMeshThreadgroupSizeIsMultipleOfThreadExecutionWidth(final boolean meshThreadgroupSizeIsMultipleOfThreadExecutionWidth) {
        try {
            MH_setMeshThreadgroupSizeIsMultipleOfThreadExecutionWidth_.invokeExact(this.handle, SEL_setMeshThreadgroupSizeIsMultipleOfThreadExecutionWidth_, meshThreadgroupSizeIsMultipleOfThreadExecutionWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor payloadMemoryLength]} */
    public long payloadMemoryLength() {
        try {
            return (long) MH_payloadMemoryLength.invokeExact(this.handle, SEL_payloadMemoryLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setPayloadMemoryLength:]} */
    public void setPayloadMemoryLength(final long payloadMemoryLength) {
        try {
            MH_setPayloadMemoryLength_.invokeExact(this.handle, SEL_setPayloadMemoryLength_, payloadMemoryLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor maxTotalThreadgroupsPerMeshGrid]} */
    public long maxTotalThreadgroupsPerMeshGrid() {
        try {
            return (long) MH_maxTotalThreadgroupsPerMeshGrid.invokeExact(this.handle, SEL_maxTotalThreadgroupsPerMeshGrid);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setMaxTotalThreadgroupsPerMeshGrid:]} */
    public void setMaxTotalThreadgroupsPerMeshGrid(final long maxTotalThreadgroupsPerMeshGrid) {
        try {
            MH_setMaxTotalThreadgroupsPerMeshGrid_.invokeExact(this.handle, SEL_setMaxTotalThreadgroupsPerMeshGrid_, maxTotalThreadgroupsPerMeshGrid);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor rasterSampleCount]} */
    public long rasterSampleCount() {
        try {
            return (long) MH_rasterSampleCount.invokeExact(this.handle, SEL_rasterSampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setRasterSampleCount:]} */
    public void setRasterSampleCount(final long rasterSampleCount) {
        try {
            MH_setRasterSampleCount_.invokeExact(this.handle, SEL_setRasterSampleCount_, rasterSampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor alphaToCoverageState]} */
    public MTL4AlphaToCoverageState alphaToCoverageState() {
        try {
            return MTL4AlphaToCoverageState.of((long) MH_alphaToCoverageState.invokeExact(this.handle, SEL_alphaToCoverageState));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setAlphaToCoverageState:]} */
    public void setAlphaToCoverageState(final MTL4AlphaToCoverageState alphaToCoverageState) {
        try {
            MH_setAlphaToCoverageState_.invokeExact(this.handle, SEL_setAlphaToCoverageState_, alphaToCoverageState.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor alphaToOneState]} */
    public MTL4AlphaToOneState alphaToOneState() {
        try {
            return MTL4AlphaToOneState.of((long) MH_alphaToOneState.invokeExact(this.handle, SEL_alphaToOneState));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setAlphaToOneState:]} */
    public void setAlphaToOneState(final MTL4AlphaToOneState alphaToOneState) {
        try {
            MH_setAlphaToOneState_.invokeExact(this.handle, SEL_setAlphaToOneState_, alphaToOneState.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor isRasterizationEnabled]} */
    public boolean isRasterizationEnabled() {
        try {
            return (boolean) MH_isRasterizationEnabled.invokeExact(this.handle, SEL_isRasterizationEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setRasterizationEnabled:]} */
    public void setRasterizationEnabled(final boolean rasterizationEnabled) {
        try {
            MH_setRasterizationEnabled_.invokeExact(this.handle, SEL_setRasterizationEnabled_, rasterizationEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor maxVertexAmplificationCount]} */
    public long maxVertexAmplificationCount() {
        try {
            return (long) MH_maxVertexAmplificationCount.invokeExact(this.handle, SEL_maxVertexAmplificationCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setMaxVertexAmplificationCount:]} */
    public void setMaxVertexAmplificationCount(final long maxVertexAmplificationCount) {
        try {
            MH_setMaxVertexAmplificationCount_.invokeExact(this.handle, SEL_setMaxVertexAmplificationCount_, maxVertexAmplificationCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4MeshRenderPipelineDescriptor colorAttachments]}
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

    /**
     * {@code -[MTL4MeshRenderPipelineDescriptor objectStaticLinkingDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTL4StaticLinkingDescriptor objectStaticLinkingDescriptor() {
        try {
            long result = (long) MH_objectStaticLinkingDescriptor.invokeExact(this.handle, SEL_objectStaticLinkingDescriptor);
            return new MTL4StaticLinkingDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setObjectStaticLinkingDescriptor:]} */
    public void setObjectStaticLinkingDescriptor(@Nullable final MTL4StaticLinkingDescriptor objectStaticLinkingDescriptor) {
        try {
            MH_setObjectStaticLinkingDescriptor_.invokeExact(this.handle, SEL_setObjectStaticLinkingDescriptor_, objectStaticLinkingDescriptor == null ? 0L : objectStaticLinkingDescriptor.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4MeshRenderPipelineDescriptor meshStaticLinkingDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTL4StaticLinkingDescriptor meshStaticLinkingDescriptor() {
        try {
            long result = (long) MH_meshStaticLinkingDescriptor.invokeExact(this.handle, SEL_meshStaticLinkingDescriptor);
            return new MTL4StaticLinkingDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setMeshStaticLinkingDescriptor:]} */
    public void setMeshStaticLinkingDescriptor(@Nullable final MTL4StaticLinkingDescriptor meshStaticLinkingDescriptor) {
        try {
            MH_setMeshStaticLinkingDescriptor_.invokeExact(this.handle, SEL_setMeshStaticLinkingDescriptor_, meshStaticLinkingDescriptor == null ? 0L : meshStaticLinkingDescriptor.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4MeshRenderPipelineDescriptor fragmentStaticLinkingDescriptor]}
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

    /** {@code -[MTL4MeshRenderPipelineDescriptor setFragmentStaticLinkingDescriptor:]} */
    public void setFragmentStaticLinkingDescriptor(@Nullable final MTL4StaticLinkingDescriptor fragmentStaticLinkingDescriptor) {
        try {
            MH_setFragmentStaticLinkingDescriptor_.invokeExact(this.handle, SEL_setFragmentStaticLinkingDescriptor_, fragmentStaticLinkingDescriptor == null ? 0L : fragmentStaticLinkingDescriptor.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor supportObjectBinaryLinking]} */
    public boolean supportObjectBinaryLinking() {
        try {
            return (boolean) MH_supportObjectBinaryLinking.invokeExact(this.handle, SEL_supportObjectBinaryLinking);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setSupportObjectBinaryLinking:]} */
    public void setSupportObjectBinaryLinking(final boolean supportObjectBinaryLinking) {
        try {
            MH_setSupportObjectBinaryLinking_.invokeExact(this.handle, SEL_setSupportObjectBinaryLinking_, supportObjectBinaryLinking);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor supportMeshBinaryLinking]} */
    public boolean supportMeshBinaryLinking() {
        try {
            return (boolean) MH_supportMeshBinaryLinking.invokeExact(this.handle, SEL_supportMeshBinaryLinking);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setSupportMeshBinaryLinking:]} */
    public void setSupportMeshBinaryLinking(final boolean supportMeshBinaryLinking) {
        try {
            MH_setSupportMeshBinaryLinking_.invokeExact(this.handle, SEL_setSupportMeshBinaryLinking_, supportMeshBinaryLinking);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor supportFragmentBinaryLinking]} */
    public boolean supportFragmentBinaryLinking() {
        try {
            return (boolean) MH_supportFragmentBinaryLinking.invokeExact(this.handle, SEL_supportFragmentBinaryLinking);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setSupportFragmentBinaryLinking:]} */
    public void setSupportFragmentBinaryLinking(final boolean supportFragmentBinaryLinking) {
        try {
            MH_setSupportFragmentBinaryLinking_.invokeExact(this.handle, SEL_setSupportFragmentBinaryLinking_, supportFragmentBinaryLinking);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor colorAttachmentMappingState]} */
    public MTL4LogicalToPhysicalColorAttachmentMappingState colorAttachmentMappingState() {
        try {
            return MTL4LogicalToPhysicalColorAttachmentMappingState.of((long) MH_colorAttachmentMappingState.invokeExact(this.handle, SEL_colorAttachmentMappingState));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setColorAttachmentMappingState:]} */
    public void setColorAttachmentMappingState(final MTL4LogicalToPhysicalColorAttachmentMappingState colorAttachmentMappingState) {
        try {
            MH_setColorAttachmentMappingState_.invokeExact(this.handle, SEL_setColorAttachmentMappingState_, colorAttachmentMappingState.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor supportIndirectCommandBuffers]} */
    public MTL4IndirectCommandBufferSupportState supportIndirectCommandBuffers() {
        try {
            return MTL4IndirectCommandBufferSupportState.of((long) MH_supportIndirectCommandBuffers.invokeExact(this.handle, SEL_supportIndirectCommandBuffers));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MeshRenderPipelineDescriptor setSupportIndirectCommandBuffers:]} */
    public void setSupportIndirectCommandBuffers(final MTL4IndirectCommandBufferSupportState supportIndirectCommandBuffers) {
        try {
            MH_setSupportIndirectCommandBuffers_.invokeExact(this.handle, SEL_setSupportIndirectCommandBuffers_, supportIndirectCommandBuffers.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
