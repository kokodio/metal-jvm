package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLIndirectCommandBufferDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlindirectcommandbufferdescriptor">Apple documentation</a>
 */
public class MTLIndirectCommandBufferDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLIndirectCommandBufferDescriptor");
    private static final long SEL_commandTypes = ObjC.selector("commandTypes");
    private static final MethodHandle MH_commandTypes = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCommandTypes_ = ObjC.selector("setCommandTypes:");
    private static final MethodHandle MH_setCommandTypes_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_inheritPipelineState = ObjC.selector("inheritPipelineState");
    private static final MethodHandle MH_inheritPipelineState = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInheritPipelineState_ = ObjC.selector("setInheritPipelineState:");
    private static final MethodHandle MH_setInheritPipelineState_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_inheritBuffers = ObjC.selector("inheritBuffers");
    private static final MethodHandle MH_inheritBuffers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInheritBuffers_ = ObjC.selector("setInheritBuffers:");
    private static final MethodHandle MH_setInheritBuffers_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_inheritDepthStencilState = ObjC.selector("inheritDepthStencilState");
    private static final MethodHandle MH_inheritDepthStencilState = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInheritDepthStencilState_ = ObjC.selector("setInheritDepthStencilState:");
    private static final MethodHandle MH_setInheritDepthStencilState_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_inheritDepthBias = ObjC.selector("inheritDepthBias");
    private static final MethodHandle MH_inheritDepthBias = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInheritDepthBias_ = ObjC.selector("setInheritDepthBias:");
    private static final MethodHandle MH_setInheritDepthBias_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_inheritDepthClipMode = ObjC.selector("inheritDepthClipMode");
    private static final MethodHandle MH_inheritDepthClipMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInheritDepthClipMode_ = ObjC.selector("setInheritDepthClipMode:");
    private static final MethodHandle MH_setInheritDepthClipMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_inheritCullMode = ObjC.selector("inheritCullMode");
    private static final MethodHandle MH_inheritCullMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInheritCullMode_ = ObjC.selector("setInheritCullMode:");
    private static final MethodHandle MH_setInheritCullMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_inheritFrontFacingWinding = ObjC.selector("inheritFrontFacingWinding");
    private static final MethodHandle MH_inheritFrontFacingWinding = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInheritFrontFacingWinding_ = ObjC.selector("setInheritFrontFacingWinding:");
    private static final MethodHandle MH_setInheritFrontFacingWinding_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_inheritTriangleFillMode = ObjC.selector("inheritTriangleFillMode");
    private static final MethodHandle MH_inheritTriangleFillMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInheritTriangleFillMode_ = ObjC.selector("setInheritTriangleFillMode:");
    private static final MethodHandle MH_setInheritTriangleFillMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_maxVertexBufferBindCount = ObjC.selector("maxVertexBufferBindCount");
    private static final MethodHandle MH_maxVertexBufferBindCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxVertexBufferBindCount_ = ObjC.selector("setMaxVertexBufferBindCount:");
    private static final MethodHandle MH_setMaxVertexBufferBindCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxFragmentBufferBindCount = ObjC.selector("maxFragmentBufferBindCount");
    private static final MethodHandle MH_maxFragmentBufferBindCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxFragmentBufferBindCount_ = ObjC.selector("setMaxFragmentBufferBindCount:");
    private static final MethodHandle MH_setMaxFragmentBufferBindCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxKernelBufferBindCount = ObjC.selector("maxKernelBufferBindCount");
    private static final MethodHandle MH_maxKernelBufferBindCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxKernelBufferBindCount_ = ObjC.selector("setMaxKernelBufferBindCount:");
    private static final MethodHandle MH_setMaxKernelBufferBindCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxKernelThreadgroupMemoryBindCount = ObjC.selector("maxKernelThreadgroupMemoryBindCount");
    private static final MethodHandle MH_maxKernelThreadgroupMemoryBindCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxKernelThreadgroupMemoryBindCount_ = ObjC.selector("setMaxKernelThreadgroupMemoryBindCount:");
    private static final MethodHandle MH_setMaxKernelThreadgroupMemoryBindCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxObjectBufferBindCount = ObjC.selector("maxObjectBufferBindCount");
    private static final MethodHandle MH_maxObjectBufferBindCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxObjectBufferBindCount_ = ObjC.selector("setMaxObjectBufferBindCount:");
    private static final MethodHandle MH_setMaxObjectBufferBindCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxMeshBufferBindCount = ObjC.selector("maxMeshBufferBindCount");
    private static final MethodHandle MH_maxMeshBufferBindCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxMeshBufferBindCount_ = ObjC.selector("setMaxMeshBufferBindCount:");
    private static final MethodHandle MH_setMaxMeshBufferBindCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxObjectThreadgroupMemoryBindCount = ObjC.selector("maxObjectThreadgroupMemoryBindCount");
    private static final MethodHandle MH_maxObjectThreadgroupMemoryBindCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxObjectThreadgroupMemoryBindCount_ = ObjC.selector("setMaxObjectThreadgroupMemoryBindCount:");
    private static final MethodHandle MH_setMaxObjectThreadgroupMemoryBindCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportRayTracing = ObjC.selector("supportRayTracing");
    private static final MethodHandle MH_supportRayTracing = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSupportRayTracing_ = ObjC.selector("setSupportRayTracing:");
    private static final MethodHandle MH_setSupportRayTracing_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_supportDynamicAttributeStride = ObjC.selector("supportDynamicAttributeStride");
    private static final MethodHandle MH_supportDynamicAttributeStride = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSupportDynamicAttributeStride_ = ObjC.selector("setSupportDynamicAttributeStride:");
    private static final MethodHandle MH_setSupportDynamicAttributeStride_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_supportColorAttachmentMapping = ObjC.selector("supportColorAttachmentMapping");
    private static final MethodHandle MH_supportColorAttachmentMapping = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSupportColorAttachmentMapping_ = ObjC.selector("setSupportColorAttachmentMapping:");
    private static final MethodHandle MH_setSupportColorAttachmentMapping_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLIndirectCommandBufferDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLIndirectCommandBufferDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLIndirectCommandBufferDescriptor alloc() {
        try {
            return new MTLIndirectCommandBufferDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor init]} */
    public MTLIndirectCommandBufferDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLIndirectCommandBufferDescriptor commandTypes]}
     *
     * @return a combination of {@link MTLIndirectCommandType} flags
     */
    public long commandTypes() {
        try {
            return (long) MH_commandTypes.invokeExact(this.handle, SEL_commandTypes);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLIndirectCommandBufferDescriptor setCommandTypes:]}
     *
     * @param commandTypes a combination of {@link MTLIndirectCommandType} flags
     */
    public void setCommandTypes(final long commandTypes) {
        try {
            MH_setCommandTypes_.invokeExact(this.handle, SEL_setCommandTypes_, commandTypes);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor inheritPipelineState]} */
    public boolean inheritPipelineState() {
        try {
            return (boolean) MH_inheritPipelineState.invokeExact(this.handle, SEL_inheritPipelineState);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor setInheritPipelineState:]} */
    public void setInheritPipelineState(final boolean inheritPipelineState) {
        try {
            MH_setInheritPipelineState_.invokeExact(this.handle, SEL_setInheritPipelineState_, inheritPipelineState);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor inheritBuffers]} */
    public boolean inheritBuffers() {
        try {
            return (boolean) MH_inheritBuffers.invokeExact(this.handle, SEL_inheritBuffers);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor setInheritBuffers:]} */
    public void setInheritBuffers(final boolean inheritBuffers) {
        try {
            MH_setInheritBuffers_.invokeExact(this.handle, SEL_setInheritBuffers_, inheritBuffers);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor inheritDepthStencilState]} */
    public boolean inheritDepthStencilState() {
        try {
            return (boolean) MH_inheritDepthStencilState.invokeExact(this.handle, SEL_inheritDepthStencilState);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor setInheritDepthStencilState:]} */
    public void setInheritDepthStencilState(final boolean inheritDepthStencilState) {
        try {
            MH_setInheritDepthStencilState_.invokeExact(this.handle, SEL_setInheritDepthStencilState_, inheritDepthStencilState);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor inheritDepthBias]} */
    public boolean inheritDepthBias() {
        try {
            return (boolean) MH_inheritDepthBias.invokeExact(this.handle, SEL_inheritDepthBias);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor setInheritDepthBias:]} */
    public void setInheritDepthBias(final boolean inheritDepthBias) {
        try {
            MH_setInheritDepthBias_.invokeExact(this.handle, SEL_setInheritDepthBias_, inheritDepthBias);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor inheritDepthClipMode]} */
    public boolean inheritDepthClipMode() {
        try {
            return (boolean) MH_inheritDepthClipMode.invokeExact(this.handle, SEL_inheritDepthClipMode);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor setInheritDepthClipMode:]} */
    public void setInheritDepthClipMode(final boolean inheritDepthClipMode) {
        try {
            MH_setInheritDepthClipMode_.invokeExact(this.handle, SEL_setInheritDepthClipMode_, inheritDepthClipMode);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor inheritCullMode]} */
    public boolean inheritCullMode() {
        try {
            return (boolean) MH_inheritCullMode.invokeExact(this.handle, SEL_inheritCullMode);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor setInheritCullMode:]} */
    public void setInheritCullMode(final boolean inheritCullMode) {
        try {
            MH_setInheritCullMode_.invokeExact(this.handle, SEL_setInheritCullMode_, inheritCullMode);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor inheritFrontFacingWinding]} */
    public boolean inheritFrontFacingWinding() {
        try {
            return (boolean) MH_inheritFrontFacingWinding.invokeExact(this.handle, SEL_inheritFrontFacingWinding);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor setInheritFrontFacingWinding:]} */
    public void setInheritFrontFacingWinding(final boolean inheritFrontFacingWinding) {
        try {
            MH_setInheritFrontFacingWinding_.invokeExact(this.handle, SEL_setInheritFrontFacingWinding_, inheritFrontFacingWinding);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor inheritTriangleFillMode]} */
    public boolean inheritTriangleFillMode() {
        try {
            return (boolean) MH_inheritTriangleFillMode.invokeExact(this.handle, SEL_inheritTriangleFillMode);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor setInheritTriangleFillMode:]} */
    public void setInheritTriangleFillMode(final boolean inheritTriangleFillMode) {
        try {
            MH_setInheritTriangleFillMode_.invokeExact(this.handle, SEL_setInheritTriangleFillMode_, inheritTriangleFillMode);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor maxVertexBufferBindCount]} */
    public long maxVertexBufferBindCount() {
        try {
            return (long) MH_maxVertexBufferBindCount.invokeExact(this.handle, SEL_maxVertexBufferBindCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor setMaxVertexBufferBindCount:]} */
    public void setMaxVertexBufferBindCount(final long maxVertexBufferBindCount) {
        try {
            MH_setMaxVertexBufferBindCount_.invokeExact(this.handle, SEL_setMaxVertexBufferBindCount_, maxVertexBufferBindCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor maxFragmentBufferBindCount]} */
    public long maxFragmentBufferBindCount() {
        try {
            return (long) MH_maxFragmentBufferBindCount.invokeExact(this.handle, SEL_maxFragmentBufferBindCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor setMaxFragmentBufferBindCount:]} */
    public void setMaxFragmentBufferBindCount(final long maxFragmentBufferBindCount) {
        try {
            MH_setMaxFragmentBufferBindCount_.invokeExact(this.handle, SEL_setMaxFragmentBufferBindCount_, maxFragmentBufferBindCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor maxKernelBufferBindCount]} */
    public long maxKernelBufferBindCount() {
        try {
            return (long) MH_maxKernelBufferBindCount.invokeExact(this.handle, SEL_maxKernelBufferBindCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor setMaxKernelBufferBindCount:]} */
    public void setMaxKernelBufferBindCount(final long maxKernelBufferBindCount) {
        try {
            MH_setMaxKernelBufferBindCount_.invokeExact(this.handle, SEL_setMaxKernelBufferBindCount_, maxKernelBufferBindCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor maxKernelThreadgroupMemoryBindCount]} */
    public long maxKernelThreadgroupMemoryBindCount() {
        try {
            return (long) MH_maxKernelThreadgroupMemoryBindCount.invokeExact(this.handle, SEL_maxKernelThreadgroupMemoryBindCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor setMaxKernelThreadgroupMemoryBindCount:]} */
    public void setMaxKernelThreadgroupMemoryBindCount(final long maxKernelThreadgroupMemoryBindCount) {
        try {
            MH_setMaxKernelThreadgroupMemoryBindCount_.invokeExact(this.handle, SEL_setMaxKernelThreadgroupMemoryBindCount_, maxKernelThreadgroupMemoryBindCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor maxObjectBufferBindCount]} */
    public long maxObjectBufferBindCount() {
        try {
            return (long) MH_maxObjectBufferBindCount.invokeExact(this.handle, SEL_maxObjectBufferBindCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor setMaxObjectBufferBindCount:]} */
    public void setMaxObjectBufferBindCount(final long maxObjectBufferBindCount) {
        try {
            MH_setMaxObjectBufferBindCount_.invokeExact(this.handle, SEL_setMaxObjectBufferBindCount_, maxObjectBufferBindCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor maxMeshBufferBindCount]} */
    public long maxMeshBufferBindCount() {
        try {
            return (long) MH_maxMeshBufferBindCount.invokeExact(this.handle, SEL_maxMeshBufferBindCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor setMaxMeshBufferBindCount:]} */
    public void setMaxMeshBufferBindCount(final long maxMeshBufferBindCount) {
        try {
            MH_setMaxMeshBufferBindCount_.invokeExact(this.handle, SEL_setMaxMeshBufferBindCount_, maxMeshBufferBindCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor maxObjectThreadgroupMemoryBindCount]} */
    public long maxObjectThreadgroupMemoryBindCount() {
        try {
            return (long) MH_maxObjectThreadgroupMemoryBindCount.invokeExact(this.handle, SEL_maxObjectThreadgroupMemoryBindCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor setMaxObjectThreadgroupMemoryBindCount:]} */
    public void setMaxObjectThreadgroupMemoryBindCount(final long maxObjectThreadgroupMemoryBindCount) {
        try {
            MH_setMaxObjectThreadgroupMemoryBindCount_.invokeExact(this.handle, SEL_setMaxObjectThreadgroupMemoryBindCount_, maxObjectThreadgroupMemoryBindCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor supportRayTracing]} */
    public boolean supportRayTracing() {
        try {
            return (boolean) MH_supportRayTracing.invokeExact(this.handle, SEL_supportRayTracing);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor setSupportRayTracing:]} */
    public void setSupportRayTracing(final boolean supportRayTracing) {
        try {
            MH_setSupportRayTracing_.invokeExact(this.handle, SEL_setSupportRayTracing_, supportRayTracing);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor supportDynamicAttributeStride]} */
    public boolean supportDynamicAttributeStride() {
        try {
            return (boolean) MH_supportDynamicAttributeStride.invokeExact(this.handle, SEL_supportDynamicAttributeStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor setSupportDynamicAttributeStride:]} */
    public void setSupportDynamicAttributeStride(final boolean supportDynamicAttributeStride) {
        try {
            MH_setSupportDynamicAttributeStride_.invokeExact(this.handle, SEL_setSupportDynamicAttributeStride_, supportDynamicAttributeStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor supportColorAttachmentMapping]} */
    public boolean supportColorAttachmentMapping() {
        try {
            return (boolean) MH_supportColorAttachmentMapping.invokeExact(this.handle, SEL_supportColorAttachmentMapping);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBufferDescriptor setSupportColorAttachmentMapping:]} */
    public void setSupportColorAttachmentMapping(final boolean supportColorAttachmentMapping) {
        try {
            MH_setSupportColorAttachmentMapping_.invokeExact(this.handle, SEL_setSupportColorAttachmentMapping_, supportColorAttachmentMapping);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
