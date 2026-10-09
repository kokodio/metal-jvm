package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSErrorException;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLComputePipelineState}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcomputepipelinestate">Apple documentation</a>
 */
public class MTLComputePipelineState extends MTLAllocation {
    private static final long SEL_functionHandleWithName_ = ObjC.selector("functionHandleWithName:");
    private static final MethodHandle MH_functionHandleWithName_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_functionHandleWithBinaryFunction_ = ObjC.selector("functionHandleWithBinaryFunction:");
    private static final MethodHandle MH_functionHandleWithBinaryFunction_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newComputePipelineStateWithBinaryFunctions_error_ = ObjC.selector("newComputePipelineStateWithBinaryFunctions:error:");
    private static final MethodHandle MH_newComputePipelineStateWithBinaryFunctions_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_imageblockMemoryLengthForDimensions_ = ObjC.selector("imageblockMemoryLengthForDimensions:");
    private static final MethodHandle MH_imageblockMemoryLengthForDimensions_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_functionHandleWithFunction_ = ObjC.selector("functionHandleWithFunction:");
    private static final MethodHandle MH_functionHandleWithFunction_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newComputePipelineStateWithAdditionalBinaryFunctions_error_ = ObjC.selector("newComputePipelineStateWithAdditionalBinaryFunctions:error:");
    private static final MethodHandle MH_newComputePipelineStateWithAdditionalBinaryFunctions_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newVisibleFunctionTableWithDescriptor_ = ObjC.selector("newVisibleFunctionTableWithDescriptor:");
    private static final MethodHandle MH_newVisibleFunctionTableWithDescriptor_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newIntersectionFunctionTableWithDescriptor_ = ObjC.selector("newIntersectionFunctionTableWithDescriptor:");
    private static final MethodHandle MH_newIntersectionFunctionTableWithDescriptor_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_recommendedPersistentThreadgroupsPerGridForThreadsPerThreadgroup_ = ObjC.selector("recommendedPersistentThreadgroupsPerGridForThreadsPerThreadgroup:");
    private static final MethodHandle MH_recommendedPersistentThreadgroupsPerGridForThreadsPerThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_reflection = ObjC.selector("reflection");
    private static final MethodHandle MH_reflection = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxTotalThreadsPerThreadgroup = ObjC.selector("maxTotalThreadsPerThreadgroup");
    private static final MethodHandle MH_maxTotalThreadsPerThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_threadExecutionWidth = ObjC.selector("threadExecutionWidth");
    private static final MethodHandle MH_threadExecutionWidth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_staticThreadgroupMemoryLength = ObjC.selector("staticThreadgroupMemoryLength");
    private static final MethodHandle MH_staticThreadgroupMemoryLength = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportIndirectCommandBuffers = ObjC.selector("supportIndirectCommandBuffers");
    private static final MethodHandle MH_supportIndirectCommandBuffers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_gpuResourceID = ObjC.selector("gpuResourceID");
    private static final MethodHandle MH_gpuResourceID = ObjC.msgSendCritical(FunctionDescriptor.of(MTLResourceID.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_shaderValidation = ObjC.selector("shaderValidation");
    private static final MethodHandle MH_shaderValidation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_requiredThreadsPerThreadgroup = ObjC.selector("requiredThreadsPerThreadgroup");
    private static final MethodHandle MH_requiredThreadsPerThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_forwardProgressUsage = ObjC.selector("forwardProgressUsage");
    private static final MethodHandle MH_forwardProgressUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLComputePipelineState(final long handle) {
        super(handle);
    }

    /**
     * {@code -[MTLComputePipelineState functionHandleWithName:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLFunctionHandle functionHandleWithName(final String name) {
        final long nsName = ObjC.nsString(name);
        try {
            long result = (long) MH_functionHandleWithName_.invokeExact(this.handle, SEL_functionHandleWithName_, nsName);
            return result == 0L ? null : new MTLFunctionHandle(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
        }
    }

    /**
     * {@code -[MTLComputePipelineState functionHandleWithBinaryFunction:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLFunctionHandle functionHandleWithBinaryFunction(final MTL4BinaryFunction function) {
        try {
            long result = (long) MH_functionHandleWithBinaryFunction_.invokeExact(this.handle, SEL_functionHandleWithBinaryFunction_, function.handle());
            return result == 0L ? null : new MTLFunctionHandle(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLComputePipelineState newComputePipelineStateWithBinaryFunctions:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLComputePipelineState newComputePipelineState(final NSArray<MTL4BinaryFunction> additionalBinaryFunctions) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newComputePipelineStateWithBinaryFunctions_error_.invokeExact(this.handle, SEL_newComputePipelineStateWithBinaryFunctions_error_, additionalBinaryFunctions.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newComputePipelineStateWithBinaryFunctions:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLComputePipelineState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineState imageblockMemoryLengthForDimensions:]} */
    public long imageblockMemoryLengthForDimensions(final MTLSize imageblockDimensions) {
        try (NativeStack stack = NativeStack.push()) {
            return (long) MH_imageblockMemoryLengthForDimensions_.invokeExact(this.handle, SEL_imageblockMemoryLengthForDimensions_, imageblockDimensions.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLComputePipelineState functionHandleWithFunction:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLFunctionHandle functionHandleWithFunction(final MTLFunction function) {
        try {
            long result = (long) MH_functionHandleWithFunction_.invokeExact(this.handle, SEL_functionHandleWithFunction_, function.handle());
            return result == 0L ? null : new MTLFunctionHandle(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLComputePipelineState newComputePipelineStateWithAdditionalBinaryFunctions:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLComputePipelineState newComputePipelineStateWithAdditionalBinaryFunctions(final NSArray<MTLFunction> functions) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newComputePipelineStateWithAdditionalBinaryFunctions_error_.invokeExact(this.handle, SEL_newComputePipelineStateWithAdditionalBinaryFunctions_error_, functions.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newComputePipelineStateWithAdditionalBinaryFunctions:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLComputePipelineState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLComputePipelineState newVisibleFunctionTableWithDescriptor:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLVisibleFunctionTable newVisibleFunctionTable(final MTLVisibleFunctionTableDescriptor descriptor) {
        try {
            long result = (long) MH_newVisibleFunctionTableWithDescriptor_.invokeExact(this.handle, SEL_newVisibleFunctionTableWithDescriptor_, descriptor.handle());
            return result == 0L ? null : new MTLVisibleFunctionTable(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLComputePipelineState newIntersectionFunctionTableWithDescriptor:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLIntersectionFunctionTable newIntersectionFunctionTable(final MTLIntersectionFunctionTableDescriptor descriptor) {
        try {
            long result = (long) MH_newIntersectionFunctionTableWithDescriptor_.invokeExact(this.handle, SEL_newIntersectionFunctionTableWithDescriptor_, descriptor.handle());
            return result == 0L ? null : new MTLIntersectionFunctionTable(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineState recommendedPersistentThreadgroupsPerGridForThreadsPerThreadgroup:]} */
    public long recommendedPersistentThreadgroupsPerGridForThreadsPerThreadgroup(final MTLSize threadsPerThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            return (long) MH_recommendedPersistentThreadgroupsPerGridForThreadsPerThreadgroup_.invokeExact(this.handle, SEL_recommendedPersistentThreadgroupsPerGridForThreadsPerThreadgroup_, threadsPerThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineState label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLComputePipelineState reflection]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLComputePipelineReflection reflection() {
        try {
            long result = (long) MH_reflection.invokeExact(this.handle, SEL_reflection);
            return result == 0L ? null : new MTLComputePipelineReflection(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLComputePipelineState device]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLDevice device() {
        try {
            long result = (long) MH_device.invokeExact(this.handle, SEL_device);
            return new MTLDevice(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineState maxTotalThreadsPerThreadgroup]} */
    public long maxTotalThreadsPerThreadgroup() {
        try {
            return (long) MH_maxTotalThreadsPerThreadgroup.invokeExact(this.handle, SEL_maxTotalThreadsPerThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineState threadExecutionWidth]} */
    public long threadExecutionWidth() {
        try {
            return (long) MH_threadExecutionWidth.invokeExact(this.handle, SEL_threadExecutionWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineState staticThreadgroupMemoryLength]} */
    public long staticThreadgroupMemoryLength() {
        try {
            return (long) MH_staticThreadgroupMemoryLength.invokeExact(this.handle, SEL_staticThreadgroupMemoryLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineState supportIndirectCommandBuffers]} */
    public boolean supportIndirectCommandBuffers() {
        try {
            return (boolean) MH_supportIndirectCommandBuffers.invokeExact(this.handle, SEL_supportIndirectCommandBuffers);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineState gpuResourceID]} */
    public MTLResourceID gpuResourceID() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLResourceID.read((MemorySegment) MH_gpuResourceID.invokeExact((SegmentAllocator) stack, this.handle, SEL_gpuResourceID));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineState shaderValidation]} */
    public MTLShaderValidation shaderValidation() {
        try {
            return MTLShaderValidation.of((long) MH_shaderValidation.invokeExact(this.handle, SEL_shaderValidation));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineState requiredThreadsPerThreadgroup]} */
    public MTLSize requiredThreadsPerThreadgroup() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_requiredThreadsPerThreadgroup.invokeExact((SegmentAllocator) stack, this.handle, SEL_requiredThreadsPerThreadgroup));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineState forwardProgressUsage]} */
    public MTLForwardProgressUsage forwardProgressUsage() {
        try {
            return MTLForwardProgressUsage.of((long) MH_forwardProgressUsage.invokeExact(this.handle, SEL_forwardProgressUsage));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
