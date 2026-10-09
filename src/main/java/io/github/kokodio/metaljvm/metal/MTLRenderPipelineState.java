package io.github.kokodio.metaljvm.metal;

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
 * {@code MTLRenderPipelineState}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlrenderpipelinestate">Apple documentation</a>
 */
public class MTLRenderPipelineState extends MTLAllocation {
    private static final long SEL_functionHandleWithName_stage_ = ObjC.selector("functionHandleWithName:stage:");
    private static final MethodHandle MH_functionHandleWithName_stage_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_functionHandleWithBinaryFunction_stage_ = ObjC.selector("functionHandleWithBinaryFunction:stage:");
    private static final MethodHandle MH_functionHandleWithBinaryFunction_stage_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRenderPipelineStateWithBinaryFunctions_error_ = ObjC.selector("newRenderPipelineStateWithBinaryFunctions:error:");
    private static final MethodHandle MH_newRenderPipelineStateWithBinaryFunctions_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRenderPipelineDescriptorForSpecialization = ObjC.selector("newRenderPipelineDescriptorForSpecialization");
    private static final MethodHandle MH_newRenderPipelineDescriptorForSpecialization = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_imageblockMemoryLengthForDimensions_ = ObjC.selector("imageblockMemoryLengthForDimensions:");
    private static final MethodHandle MH_imageblockMemoryLengthForDimensions_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_functionHandleWithFunction_stage_ = ObjC.selector("functionHandleWithFunction:stage:");
    private static final MethodHandle MH_functionHandleWithFunction_stage_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newVisibleFunctionTableWithDescriptor_stage_ = ObjC.selector("newVisibleFunctionTableWithDescriptor:stage:");
    private static final MethodHandle MH_newVisibleFunctionTableWithDescriptor_stage_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newIntersectionFunctionTableWithDescriptor_stage_ = ObjC.selector("newIntersectionFunctionTableWithDescriptor:stage:");
    private static final MethodHandle MH_newIntersectionFunctionTableWithDescriptor_stage_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRenderPipelineStateWithAdditionalBinaryFunctions_error_ = ObjC.selector("newRenderPipelineStateWithAdditionalBinaryFunctions:error:");
    private static final MethodHandle MH_newRenderPipelineStateWithAdditionalBinaryFunctions_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_reflection = ObjC.selector("reflection");
    private static final MethodHandle MH_reflection = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxTotalThreadsPerThreadgroup = ObjC.selector("maxTotalThreadsPerThreadgroup");
    private static final MethodHandle MH_maxTotalThreadsPerThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_threadgroupSizeMatchesTileSize = ObjC.selector("threadgroupSizeMatchesTileSize");
    private static final MethodHandle MH_threadgroupSizeMatchesTileSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_imageblockSampleLength = ObjC.selector("imageblockSampleLength");
    private static final MethodHandle MH_imageblockSampleLength = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportIndirectCommandBuffers = ObjC.selector("supportIndirectCommandBuffers");
    private static final MethodHandle MH_supportIndirectCommandBuffers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxTotalThreadsPerObjectThreadgroup = ObjC.selector("maxTotalThreadsPerObjectThreadgroup");
    private static final MethodHandle MH_maxTotalThreadsPerObjectThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxTotalThreadsPerMeshThreadgroup = ObjC.selector("maxTotalThreadsPerMeshThreadgroup");
    private static final MethodHandle MH_maxTotalThreadsPerMeshThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_objectThreadExecutionWidth = ObjC.selector("objectThreadExecutionWidth");
    private static final MethodHandle MH_objectThreadExecutionWidth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_meshThreadExecutionWidth = ObjC.selector("meshThreadExecutionWidth");
    private static final MethodHandle MH_meshThreadExecutionWidth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxTotalThreadgroupsPerMeshGrid = ObjC.selector("maxTotalThreadgroupsPerMeshGrid");
    private static final MethodHandle MH_maxTotalThreadgroupsPerMeshGrid = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_gpuResourceID = ObjC.selector("gpuResourceID");
    private static final MethodHandle MH_gpuResourceID = ObjC.msgSendCritical(FunctionDescriptor.of(MTLResourceID.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_shaderValidation = ObjC.selector("shaderValidation");
    private static final MethodHandle MH_shaderValidation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_requiredThreadsPerTileThreadgroup = ObjC.selector("requiredThreadsPerTileThreadgroup");
    private static final MethodHandle MH_requiredThreadsPerTileThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_requiredThreadsPerObjectThreadgroup = ObjC.selector("requiredThreadsPerObjectThreadgroup");
    private static final MethodHandle MH_requiredThreadsPerObjectThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_requiredThreadsPerMeshThreadgroup = ObjC.selector("requiredThreadsPerMeshThreadgroup");
    private static final MethodHandle MH_requiredThreadsPerMeshThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSize.LAYOUT, JAVA_LONG, JAVA_LONG));

    public MTLRenderPipelineState(final long handle) {
        super(handle);
    }

    /**
     * {@code -[MTLRenderPipelineState functionHandleWithName:stage:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     *
     * @param stage a combination of {@link MTLRenderStages} flags
     */
    @Nullable
    public MTLFunctionHandle functionHandleWithName(final String name, final long stage) {
        final long nsName = ObjC.nsString(name);
        try {
            long result = (long) MH_functionHandleWithName_stage_.invokeExact(this.handle, SEL_functionHandleWithName_stage_, nsName, stage);
            return result == 0L ? null : new MTLFunctionHandle(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
        }
    }

    /**
     * {@code -[MTLRenderPipelineState functionHandleWithBinaryFunction:stage:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     *
     * @param stage a combination of {@link MTLRenderStages} flags
     */
    @Nullable
    public MTLFunctionHandle functionHandleWithBinaryFunction(final MTL4BinaryFunction function, final long stage) {
        try {
            long result = (long) MH_functionHandleWithBinaryFunction_stage_.invokeExact(this.handle, SEL_functionHandleWithBinaryFunction_stage_, function.handle(), stage);
            return result == 0L ? null : new MTLFunctionHandle(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineState newRenderPipelineStateWithBinaryFunctions:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLRenderPipelineState newRenderPipelineStateWithBinaryFunctions(final MTL4RenderPipelineBinaryFunctionsDescriptor binaryFunctionsDescriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newRenderPipelineStateWithBinaryFunctions_error_.invokeExact(this.handle, SEL_newRenderPipelineStateWithBinaryFunctions_error_, binaryFunctionsDescriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newRenderPipelineStateWithBinaryFunctions:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLRenderPipelineState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineState newRenderPipelineDescriptorForSpecialization]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTL4PipelineDescriptor newRenderPipelineDescriptorForSpecialization() {
        try {
            long result = (long) MH_newRenderPipelineDescriptorForSpecialization.invokeExact(this.handle, SEL_newRenderPipelineDescriptorForSpecialization);
            return new MTL4PipelineDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineState imageblockMemoryLengthForDimensions:]} */
    public long imageblockMemoryLengthForDimensions(final MTLSize imageblockDimensions) {
        try (NativeStack stack = NativeStack.push()) {
            return (long) MH_imageblockMemoryLengthForDimensions_.invokeExact(this.handle, SEL_imageblockMemoryLengthForDimensions_, imageblockDimensions.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineState functionHandleWithFunction:stage:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     *
     * @param stage a combination of {@link MTLRenderStages} flags
     */
    @Nullable
    public MTLFunctionHandle functionHandleWithFunction(final MTLFunction function, final long stage) {
        try {
            long result = (long) MH_functionHandleWithFunction_stage_.invokeExact(this.handle, SEL_functionHandleWithFunction_stage_, function.handle(), stage);
            return result == 0L ? null : new MTLFunctionHandle(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineState newVisibleFunctionTableWithDescriptor:stage:]}
     * <p>Returns a retained (+1) object, release it when done.
     *
     * @param stage a combination of {@link MTLRenderStages} flags
     */
    @Nullable
    public MTLVisibleFunctionTable newVisibleFunctionTable(final MTLVisibleFunctionTableDescriptor descriptor, final long stage) {
        try {
            long result = (long) MH_newVisibleFunctionTableWithDescriptor_stage_.invokeExact(this.handle, SEL_newVisibleFunctionTableWithDescriptor_stage_, descriptor.handle(), stage);
            return result == 0L ? null : new MTLVisibleFunctionTable(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineState newIntersectionFunctionTableWithDescriptor:stage:]}
     * <p>Returns a retained (+1) object, release it when done.
     *
     * @param stage a combination of {@link MTLRenderStages} flags
     */
    @Nullable
    public MTLIntersectionFunctionTable newIntersectionFunctionTable(final MTLIntersectionFunctionTableDescriptor descriptor, final long stage) {
        try {
            long result = (long) MH_newIntersectionFunctionTableWithDescriptor_stage_.invokeExact(this.handle, SEL_newIntersectionFunctionTableWithDescriptor_stage_, descriptor.handle(), stage);
            return result == 0L ? null : new MTLIntersectionFunctionTable(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineState newRenderPipelineStateWithAdditionalBinaryFunctions:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLRenderPipelineState newRenderPipelineState(final MTLRenderPipelineFunctionsDescriptor additionalBinaryFunctions) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newRenderPipelineStateWithAdditionalBinaryFunctions_error_.invokeExact(this.handle, SEL_newRenderPipelineStateWithAdditionalBinaryFunctions_error_, additionalBinaryFunctions.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newRenderPipelineStateWithAdditionalBinaryFunctions:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLRenderPipelineState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineState label]} */
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
     * {@code -[MTLRenderPipelineState device]}
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

    /**
     * {@code -[MTLRenderPipelineState reflection]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLRenderPipelineReflection reflection() {
        try {
            long result = (long) MH_reflection.invokeExact(this.handle, SEL_reflection);
            return result == 0L ? null : new MTLRenderPipelineReflection(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineState maxTotalThreadsPerThreadgroup]} */
    public long maxTotalThreadsPerThreadgroup() {
        try {
            return (long) MH_maxTotalThreadsPerThreadgroup.invokeExact(this.handle, SEL_maxTotalThreadsPerThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineState threadgroupSizeMatchesTileSize]} */
    public boolean threadgroupSizeMatchesTileSize() {
        try {
            return (boolean) MH_threadgroupSizeMatchesTileSize.invokeExact(this.handle, SEL_threadgroupSizeMatchesTileSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineState imageblockSampleLength]} */
    public long imageblockSampleLength() {
        try {
            return (long) MH_imageblockSampleLength.invokeExact(this.handle, SEL_imageblockSampleLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineState supportIndirectCommandBuffers]} */
    public boolean supportIndirectCommandBuffers() {
        try {
            return (boolean) MH_supportIndirectCommandBuffers.invokeExact(this.handle, SEL_supportIndirectCommandBuffers);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineState maxTotalThreadsPerObjectThreadgroup]} */
    public long maxTotalThreadsPerObjectThreadgroup() {
        try {
            return (long) MH_maxTotalThreadsPerObjectThreadgroup.invokeExact(this.handle, SEL_maxTotalThreadsPerObjectThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineState maxTotalThreadsPerMeshThreadgroup]} */
    public long maxTotalThreadsPerMeshThreadgroup() {
        try {
            return (long) MH_maxTotalThreadsPerMeshThreadgroup.invokeExact(this.handle, SEL_maxTotalThreadsPerMeshThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineState objectThreadExecutionWidth]} */
    public long objectThreadExecutionWidth() {
        try {
            return (long) MH_objectThreadExecutionWidth.invokeExact(this.handle, SEL_objectThreadExecutionWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineState meshThreadExecutionWidth]} */
    public long meshThreadExecutionWidth() {
        try {
            return (long) MH_meshThreadExecutionWidth.invokeExact(this.handle, SEL_meshThreadExecutionWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineState maxTotalThreadgroupsPerMeshGrid]} */
    public long maxTotalThreadgroupsPerMeshGrid() {
        try {
            return (long) MH_maxTotalThreadgroupsPerMeshGrid.invokeExact(this.handle, SEL_maxTotalThreadgroupsPerMeshGrid);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineState gpuResourceID]} */
    public MTLResourceID gpuResourceID() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLResourceID.read((MemorySegment) MH_gpuResourceID.invokeExact((SegmentAllocator) stack, this.handle, SEL_gpuResourceID));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineState shaderValidation]} */
    public MTLShaderValidation shaderValidation() {
        try {
            return MTLShaderValidation.of((long) MH_shaderValidation.invokeExact(this.handle, SEL_shaderValidation));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineState requiredThreadsPerTileThreadgroup]} */
    public MTLSize requiredThreadsPerTileThreadgroup() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_requiredThreadsPerTileThreadgroup.invokeExact((SegmentAllocator) stack, this.handle, SEL_requiredThreadsPerTileThreadgroup));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineState requiredThreadsPerObjectThreadgroup]} */
    public MTLSize requiredThreadsPerObjectThreadgroup() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_requiredThreadsPerObjectThreadgroup.invokeExact((SegmentAllocator) stack, this.handle, SEL_requiredThreadsPerObjectThreadgroup));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineState requiredThreadsPerMeshThreadgroup]} */
    public MTLSize requiredThreadsPerMeshThreadgroup() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_requiredThreadsPerMeshThreadgroup.invokeExact((SegmentAllocator) stack, this.handle, SEL_requiredThreadsPerMeshThreadgroup));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
