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
 * {@code MTL4ComputePipelineDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4computepipelinedescriptor">Apple documentation</a>
 */
public class MTL4ComputePipelineDescriptor extends MTL4PipelineDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4ComputePipelineDescriptor");
    private static final long SEL_reset = ObjC.selector("reset");
    private static final MethodHandle MH_reset = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_computeFunctionDescriptor = ObjC.selector("computeFunctionDescriptor");
    private static final MethodHandle MH_computeFunctionDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setComputeFunctionDescriptor_ = ObjC.selector("setComputeFunctionDescriptor:");
    private static final MethodHandle MH_setComputeFunctionDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_threadGroupSizeIsMultipleOfThreadExecutionWidth = ObjC.selector("threadGroupSizeIsMultipleOfThreadExecutionWidth");
    private static final MethodHandle MH_threadGroupSizeIsMultipleOfThreadExecutionWidth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setThreadGroupSizeIsMultipleOfThreadExecutionWidth_ = ObjC.selector("setThreadGroupSizeIsMultipleOfThreadExecutionWidth:");
    private static final MethodHandle MH_setThreadGroupSizeIsMultipleOfThreadExecutionWidth_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_maxTotalThreadsPerThreadgroup = ObjC.selector("maxTotalThreadsPerThreadgroup");
    private static final MethodHandle MH_maxTotalThreadsPerThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxTotalThreadsPerThreadgroup_ = ObjC.selector("setMaxTotalThreadsPerThreadgroup:");
    private static final MethodHandle MH_setMaxTotalThreadsPerThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_requiredThreadsPerThreadgroup = ObjC.selector("requiredThreadsPerThreadgroup");
    private static final MethodHandle MH_requiredThreadsPerThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRequiredThreadsPerThreadgroup_ = ObjC.selector("setRequiredThreadsPerThreadgroup:");
    private static final MethodHandle MH_setRequiredThreadsPerThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportBinaryLinking = ObjC.selector("supportBinaryLinking");
    private static final MethodHandle MH_supportBinaryLinking = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSupportBinaryLinking_ = ObjC.selector("setSupportBinaryLinking:");
    private static final MethodHandle MH_setSupportBinaryLinking_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_staticLinkingDescriptor = ObjC.selector("staticLinkingDescriptor");
    private static final MethodHandle MH_staticLinkingDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStaticLinkingDescriptor_ = ObjC.selector("setStaticLinkingDescriptor:");
    private static final MethodHandle MH_setStaticLinkingDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportIndirectCommandBuffers = ObjC.selector("supportIndirectCommandBuffers");
    private static final MethodHandle MH_supportIndirectCommandBuffers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSupportIndirectCommandBuffers_ = ObjC.selector("setSupportIndirectCommandBuffers:");
    private static final MethodHandle MH_setSupportIndirectCommandBuffers_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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

    public MTL4ComputePipelineDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4ComputePipelineDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4ComputePipelineDescriptor alloc() {
        try {
            return new MTL4ComputePipelineDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputePipelineDescriptor init]} */
    public MTL4ComputePipelineDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputePipelineDescriptor reset]} */
    public void reset() {
        try {
            MH_reset.invokeExact(this.handle, SEL_reset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4ComputePipelineDescriptor computeFunctionDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTL4FunctionDescriptor computeFunctionDescriptor() {
        try {
            long result = (long) MH_computeFunctionDescriptor.invokeExact(this.handle, SEL_computeFunctionDescriptor);
            return result == 0L ? null : new MTL4FunctionDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputePipelineDescriptor setComputeFunctionDescriptor:]} */
    public void setComputeFunctionDescriptor(@Nullable final MTL4FunctionDescriptor computeFunctionDescriptor) {
        try {
            MH_setComputeFunctionDescriptor_.invokeExact(this.handle, SEL_setComputeFunctionDescriptor_, computeFunctionDescriptor == null ? 0L : computeFunctionDescriptor.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputePipelineDescriptor threadGroupSizeIsMultipleOfThreadExecutionWidth]} */
    public boolean threadGroupSizeIsMultipleOfThreadExecutionWidth() {
        try {
            return (boolean) MH_threadGroupSizeIsMultipleOfThreadExecutionWidth.invokeExact(this.handle, SEL_threadGroupSizeIsMultipleOfThreadExecutionWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputePipelineDescriptor setThreadGroupSizeIsMultipleOfThreadExecutionWidth:]} */
    public void setThreadGroupSizeIsMultipleOfThreadExecutionWidth(final boolean threadGroupSizeIsMultipleOfThreadExecutionWidth) {
        try {
            MH_setThreadGroupSizeIsMultipleOfThreadExecutionWidth_.invokeExact(this.handle, SEL_setThreadGroupSizeIsMultipleOfThreadExecutionWidth_, threadGroupSizeIsMultipleOfThreadExecutionWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputePipelineDescriptor maxTotalThreadsPerThreadgroup]} */
    public long maxTotalThreadsPerThreadgroup() {
        try {
            return (long) MH_maxTotalThreadsPerThreadgroup.invokeExact(this.handle, SEL_maxTotalThreadsPerThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputePipelineDescriptor setMaxTotalThreadsPerThreadgroup:]} */
    public void setMaxTotalThreadsPerThreadgroup(final long maxTotalThreadsPerThreadgroup) {
        try {
            MH_setMaxTotalThreadsPerThreadgroup_.invokeExact(this.handle, SEL_setMaxTotalThreadsPerThreadgroup_, maxTotalThreadsPerThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputePipelineDescriptor requiredThreadsPerThreadgroup]} */
    public MTLSize requiredThreadsPerThreadgroup() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_requiredThreadsPerThreadgroup.invokeExact((SegmentAllocator) stack, this.handle, SEL_requiredThreadsPerThreadgroup));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputePipelineDescriptor setRequiredThreadsPerThreadgroup:]} */
    public void setRequiredThreadsPerThreadgroup(final MTLSize requiredThreadsPerThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setRequiredThreadsPerThreadgroup_.invokeExact(this.handle, SEL_setRequiredThreadsPerThreadgroup_, requiredThreadsPerThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputePipelineDescriptor supportBinaryLinking]} */
    public boolean supportBinaryLinking() {
        try {
            return (boolean) MH_supportBinaryLinking.invokeExact(this.handle, SEL_supportBinaryLinking);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputePipelineDescriptor setSupportBinaryLinking:]} */
    public void setSupportBinaryLinking(final boolean supportBinaryLinking) {
        try {
            MH_setSupportBinaryLinking_.invokeExact(this.handle, SEL_setSupportBinaryLinking_, supportBinaryLinking);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4ComputePipelineDescriptor staticLinkingDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTL4StaticLinkingDescriptor staticLinkingDescriptor() {
        try {
            long result = (long) MH_staticLinkingDescriptor.invokeExact(this.handle, SEL_staticLinkingDescriptor);
            return result == 0L ? null : new MTL4StaticLinkingDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputePipelineDescriptor setStaticLinkingDescriptor:]} */
    public void setStaticLinkingDescriptor(@Nullable final MTL4StaticLinkingDescriptor staticLinkingDescriptor) {
        try {
            MH_setStaticLinkingDescriptor_.invokeExact(this.handle, SEL_setStaticLinkingDescriptor_, staticLinkingDescriptor == null ? 0L : staticLinkingDescriptor.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputePipelineDescriptor supportIndirectCommandBuffers]} */
    public MTL4IndirectCommandBufferSupportState supportIndirectCommandBuffers() {
        try {
            return MTL4IndirectCommandBufferSupportState.of((long) MH_supportIndirectCommandBuffers.invokeExact(this.handle, SEL_supportIndirectCommandBuffers));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputePipelineDescriptor setSupportIndirectCommandBuffers:]} */
    public void setSupportIndirectCommandBuffers(final MTL4IndirectCommandBufferSupportState supportIndirectCommandBuffers) {
        try {
            MH_setSupportIndirectCommandBuffers_.invokeExact(this.handle, SEL_setSupportIndirectCommandBuffers_, supportIndirectCommandBuffers.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputePipelineDescriptor forwardProgressUsage]} */
    public MTLForwardProgressUsage forwardProgressUsage() {
        try {
            return MTLForwardProgressUsage.of((long) MH_forwardProgressUsage.invokeExact(this.handle, SEL_forwardProgressUsage));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputePipelineDescriptor setForwardProgressUsage:]} */
    public void setForwardProgressUsage(final MTLForwardProgressUsage forwardProgressUsage) {
        try {
            MH_setForwardProgressUsage_.invokeExact(this.handle, SEL_setForwardProgressUsage_, forwardProgressUsage.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputePipelineDescriptor contentionRelief]} */
    public MTLContentionRelief contentionRelief() {
        try {
            return MTLContentionRelief.of((long) MH_contentionRelief.invokeExact(this.handle, SEL_contentionRelief));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputePipelineDescriptor setContentionRelief:]} */
    public void setContentionRelief(final MTLContentionRelief contentionRelief) {
        try {
            MH_setContentionRelief_.invokeExact(this.handle, SEL_setContentionRelief_, contentionRelief.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputePipelineDescriptor optimizeForPersistentKernel]} */
    public boolean optimizeForPersistentKernel() {
        try {
            return (boolean) MH_optimizeForPersistentKernel.invokeExact(this.handle, SEL_optimizeForPersistentKernel);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ComputePipelineDescriptor setOptimizeForPersistentKernel:]} */
    public void setOptimizeForPersistentKernel(final boolean optimizeForPersistentKernel) {
        try {
            MH_setOptimizeForPersistentKernel_.invokeExact(this.handle, SEL_setOptimizeForPersistentKernel_, optimizeForPersistentKernel);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
