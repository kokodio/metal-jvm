package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLIndirectRenderCommand}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlindirectrendercommand">Apple documentation</a>
 */
public class MTLIndirectRenderCommand extends NSObject {
    private static final long SEL_setRenderPipelineState_ = ObjC.selector("setRenderPipelineState:");
    private static final MethodHandle MH_setRenderPipelineState_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexBuffer_offset_atIndex_ = ObjC.selector("setVertexBuffer:offset:atIndex:");
    private static final MethodHandle MH_setVertexBuffer_offset_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentBuffer_offset_atIndex_ = ObjC.selector("setFragmentBuffer:offset:atIndex:");
    private static final MethodHandle MH_setFragmentBuffer_offset_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexBuffer_offset_attributeStride_atIndex_ = ObjC.selector("setVertexBuffer:offset:attributeStride:atIndex:");
    private static final MethodHandle MH_setVertexBuffer_offset_attributeStride_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawPatches_patchStart_patchCount_patchIndexBuffer_patchIndexBufferOffset_instanceCount_baseInstance_tessellationFactorBuffer_tessellationFactorBufferOffset_tessellationFactorBufferInstanceStride_ = ObjC.selector("drawPatches:patchStart:patchCount:patchIndexBuffer:patchIndexBufferOffset:instanceCount:baseInstance:tessellationFactorBuffer:tessellationFactorBufferOffset:tessellationFactorBufferInstanceStride:");
    private static final MethodHandle MH_drawPatches_patchStart_patchCount_patchIndexBuffer_patchIndexBufferOffset_instanceCount_baseInstance_tessellationFactorBuffer_tessellationFactorBufferOffset_tessellationFactorBufferInstanceStride_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawIndexedPatches_patchStart_patchCount_patchIndexBuffer_patchIndexBufferOffset_controlPointIndexBuffer_controlPointIndexBufferOffset_instanceCount_baseInstance_tessellationFactorBuffer_tessellationFactorBufferOffset_tessellationFactorBufferInstanceStride_ = ObjC.selector("drawIndexedPatches:patchStart:patchCount:patchIndexBuffer:patchIndexBufferOffset:controlPointIndexBuffer:controlPointIndexBufferOffset:instanceCount:baseInstance:tessellationFactorBuffer:tessellationFactorBufferOffset:tessellationFactorBufferInstanceStride:");
    private static final MethodHandle MH_drawIndexedPatches_patchStart_patchCount_patchIndexBuffer_patchIndexBufferOffset_controlPointIndexBuffer_controlPointIndexBufferOffset_instanceCount_baseInstance_tessellationFactorBuffer_tessellationFactorBufferOffset_tessellationFactorBufferInstanceStride_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawPrimitives_vertexStart_vertexCount_instanceCount_baseInstance_ = ObjC.selector("drawPrimitives:vertexStart:vertexCount:instanceCount:baseInstance:");
    private static final MethodHandle MH_drawPrimitives_vertexStart_vertexCount_instanceCount_baseInstance_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferOffset_instanceCount_baseVertex_baseInstance_ = ObjC.selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:baseVertex:baseInstance:");
    private static final MethodHandle MH_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferOffset_instanceCount_baseVertex_baseInstance_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setObjectThreadgroupMemoryLength_atIndex_ = ObjC.selector("setObjectThreadgroupMemoryLength:atIndex:");
    private static final MethodHandle MH_setObjectThreadgroupMemoryLength_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setObjectBuffer_offset_atIndex_ = ObjC.selector("setObjectBuffer:offset:atIndex:");
    private static final MethodHandle MH_setObjectBuffer_offset_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMeshBuffer_offset_atIndex_ = ObjC.selector("setMeshBuffer:offset:atIndex:");
    private static final MethodHandle MH_setMeshBuffer_offset_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawMeshThreadgroups_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_ = ObjC.selector("drawMeshThreadgroups:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:");
    private static final MethodHandle MH_drawMeshThreadgroups_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawMeshThreads_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_ = ObjC.selector("drawMeshThreads:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:");
    private static final MethodHandle MH_drawMeshThreads_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBarrier = ObjC.selector("setBarrier");
    private static final MethodHandle MH_setBarrier = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_clearBarrier = ObjC.selector("clearBarrier");
    private static final MethodHandle MH_clearBarrier = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthStencilState_ = ObjC.selector("setDepthStencilState:");
    private static final MethodHandle MH_setDepthStencilState_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthBias_slopeScale_clamp_ = ObjC.selector("setDepthBias:slopeScale:clamp:");
    private static final MethodHandle MH_setDepthBias_slopeScale_clamp_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
    private static final long SEL_setDepthClipMode_ = ObjC.selector("setDepthClipMode:");
    private static final MethodHandle MH_setDepthClipMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCullMode_ = ObjC.selector("setCullMode:");
    private static final MethodHandle MH_setCullMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFrontFacingWinding_ = ObjC.selector("setFrontFacingWinding:");
    private static final MethodHandle MH_setFrontFacingWinding_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTriangleFillMode_ = ObjC.selector("setTriangleFillMode:");
    private static final MethodHandle MH_setTriangleFillMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_reset = ObjC.selector("reset");
    private static final MethodHandle MH_reset = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));

    public MTLIndirectRenderCommand(final long handle) {
        super(handle);
    }

    /** {@code -[MTLIndirectRenderCommand setRenderPipelineState:]} */
    public void setRenderPipelineState(final MTLRenderPipelineState pipelineState) {
        try {
            MH_setRenderPipelineState_.invokeExact(this.handle, SEL_setRenderPipelineState_, pipelineState.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectRenderCommand setVertexBuffer:offset:atIndex:]} */
    public void setVertexBuffer(final MTLBuffer buffer, final long offset, final long index) {
        try {
            MH_setVertexBuffer_offset_atIndex_.invokeExact(this.handle, SEL_setVertexBuffer_offset_atIndex_, buffer.handle(), offset, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectRenderCommand setFragmentBuffer:offset:atIndex:]} */
    public void setFragmentBuffer(final MTLBuffer buffer, final long offset, final long index) {
        try {
            MH_setFragmentBuffer_offset_atIndex_.invokeExact(this.handle, SEL_setFragmentBuffer_offset_atIndex_, buffer.handle(), offset, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectRenderCommand setVertexBuffer:offset:attributeStride:atIndex:]} */
    public void setVertexBuffer(final MTLBuffer buffer, final long offset, final long stride, final long index) {
        try {
            MH_setVertexBuffer_offset_attributeStride_atIndex_.invokeExact(this.handle, SEL_setVertexBuffer_offset_attributeStride_atIndex_, buffer.handle(), offset, stride, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectRenderCommand drawPatches:patchStart:patchCount:patchIndexBuffer:patchIndexBufferOffset:instanceCount:baseInstance:tessellationFactorBuffer:tessellationFactorBufferOffset:tessellationFactorBufferInstanceStride:]} */
    public void drawPatches(final long numberOfPatchControlPoints, final long patchStart, final long patchCount, @Nullable final MTLBuffer patchIndexBuffer, final long patchIndexBufferOffset, final long instanceCount, final long baseInstance, final MTLBuffer buffer, final long offset, final long instanceStride) {
        try {
            MH_drawPatches_patchStart_patchCount_patchIndexBuffer_patchIndexBufferOffset_instanceCount_baseInstance_tessellationFactorBuffer_tessellationFactorBufferOffset_tessellationFactorBufferInstanceStride_.invokeExact(this.handle, SEL_drawPatches_patchStart_patchCount_patchIndexBuffer_patchIndexBufferOffset_instanceCount_baseInstance_tessellationFactorBuffer_tessellationFactorBufferOffset_tessellationFactorBufferInstanceStride_, numberOfPatchControlPoints, patchStart, patchCount, patchIndexBuffer == null ? 0L : patchIndexBuffer.handle(), patchIndexBufferOffset, instanceCount, baseInstance, buffer.handle(), offset, instanceStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectRenderCommand drawIndexedPatches:patchStart:patchCount:patchIndexBuffer:patchIndexBufferOffset:controlPointIndexBuffer:controlPointIndexBufferOffset:instanceCount:baseInstance:tessellationFactorBuffer:tessellationFactorBufferOffset:tessellationFactorBufferInstanceStride:]} */
    public void drawIndexedPatches(final long numberOfPatchControlPoints, final long patchStart, final long patchCount, @Nullable final MTLBuffer patchIndexBuffer, final long patchIndexBufferOffset, final MTLBuffer controlPointIndexBuffer, final long controlPointIndexBufferOffset, final long instanceCount, final long baseInstance, final MTLBuffer buffer, final long offset, final long instanceStride) {
        try {
            MH_drawIndexedPatches_patchStart_patchCount_patchIndexBuffer_patchIndexBufferOffset_controlPointIndexBuffer_controlPointIndexBufferOffset_instanceCount_baseInstance_tessellationFactorBuffer_tessellationFactorBufferOffset_tessellationFactorBufferInstanceStride_.invokeExact(this.handle, SEL_drawIndexedPatches_patchStart_patchCount_patchIndexBuffer_patchIndexBufferOffset_controlPointIndexBuffer_controlPointIndexBufferOffset_instanceCount_baseInstance_tessellationFactorBuffer_tessellationFactorBufferOffset_tessellationFactorBufferInstanceStride_, numberOfPatchControlPoints, patchStart, patchCount, patchIndexBuffer == null ? 0L : patchIndexBuffer.handle(), patchIndexBufferOffset, controlPointIndexBuffer.handle(), controlPointIndexBufferOffset, instanceCount, baseInstance, buffer.handle(), offset, instanceStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectRenderCommand drawPrimitives:vertexStart:vertexCount:instanceCount:baseInstance:]} */
    public void drawPrimitives(final MTLPrimitiveType primitiveType, final long vertexStart, final long vertexCount, final long instanceCount, final long baseInstance) {
        try {
            MH_drawPrimitives_vertexStart_vertexCount_instanceCount_baseInstance_.invokeExact(this.handle, SEL_drawPrimitives_vertexStart_vertexCount_instanceCount_baseInstance_, primitiveType.value, vertexStart, vertexCount, instanceCount, baseInstance);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectRenderCommand drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:baseVertex:baseInstance:]} */
    public void drawIndexedPrimitives(final MTLPrimitiveType primitiveType, final long indexCount, final MTLIndexType indexType, final MTLBuffer indexBuffer, final long indexBufferOffset, final long instanceCount, final long baseVertex, final long baseInstance) {
        try {
            MH_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferOffset_instanceCount_baseVertex_baseInstance_.invokeExact(this.handle, SEL_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferOffset_instanceCount_baseVertex_baseInstance_, primitiveType.value, indexCount, indexType.value, indexBuffer.handle(), indexBufferOffset, instanceCount, baseVertex, baseInstance);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectRenderCommand setObjectThreadgroupMemoryLength:atIndex:]} */
    public void setObjectThreadgroupMemoryLength(final long length, final long index) {
        try {
            MH_setObjectThreadgroupMemoryLength_atIndex_.invokeExact(this.handle, SEL_setObjectThreadgroupMemoryLength_atIndex_, length, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectRenderCommand setObjectBuffer:offset:atIndex:]} */
    public void setObjectBuffer(final MTLBuffer buffer, final long offset, final long index) {
        try {
            MH_setObjectBuffer_offset_atIndex_.invokeExact(this.handle, SEL_setObjectBuffer_offset_atIndex_, buffer.handle(), offset, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectRenderCommand setMeshBuffer:offset:atIndex:]} */
    public void setMeshBuffer(final MTLBuffer buffer, final long offset, final long index) {
        try {
            MH_setMeshBuffer_offset_atIndex_.invokeExact(this.handle, SEL_setMeshBuffer_offset_atIndex_, buffer.handle(), offset, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectRenderCommand drawMeshThreadgroups:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:]} */
    public void drawMeshThreadgroups(final MTLSize threadgroupsPerGrid, final MTLSize threadsPerObjectThreadgroup, final MTLSize threadsPerMeshThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_drawMeshThreadgroups_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_.invokeExact(this.handle, SEL_drawMeshThreadgroups_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_, threadgroupsPerGrid.on(stack).address(), threadsPerObjectThreadgroup.on(stack).address(), threadsPerMeshThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectRenderCommand drawMeshThreads:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:]} */
    public void drawMeshThreads(final MTLSize threadsPerGrid, final MTLSize threadsPerObjectThreadgroup, final MTLSize threadsPerMeshThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_drawMeshThreads_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_.invokeExact(this.handle, SEL_drawMeshThreads_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_, threadsPerGrid.on(stack).address(), threadsPerObjectThreadgroup.on(stack).address(), threadsPerMeshThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectRenderCommand setBarrier]} */
    public void setBarrier() {
        try {
            MH_setBarrier.invokeExact(this.handle, SEL_setBarrier);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectRenderCommand clearBarrier]} */
    public void clearBarrier() {
        try {
            MH_clearBarrier.invokeExact(this.handle, SEL_clearBarrier);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectRenderCommand setDepthStencilState:]} */
    public void setDepthStencilState(@Nullable final MTLDepthStencilState depthStencilState) {
        try {
            MH_setDepthStencilState_.invokeExact(this.handle, SEL_setDepthStencilState_, depthStencilState == null ? 0L : depthStencilState.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectRenderCommand setDepthBias:slopeScale:clamp:]} */
    public void setDepthBias(final float depthBias, final float slopeScale, final float clamp) {
        try {
            MH_setDepthBias_slopeScale_clamp_.invokeExact(this.handle, SEL_setDepthBias_slopeScale_clamp_, depthBias, slopeScale, clamp);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectRenderCommand setDepthClipMode:]} */
    public void setDepthClipMode(final MTLDepthClipMode depthClipMode) {
        try {
            MH_setDepthClipMode_.invokeExact(this.handle, SEL_setDepthClipMode_, depthClipMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectRenderCommand setCullMode:]} */
    public void setCullMode(final MTLCullMode cullMode) {
        try {
            MH_setCullMode_.invokeExact(this.handle, SEL_setCullMode_, cullMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectRenderCommand setFrontFacingWinding:]} */
    public void setFrontFacingWinding(final MTLWinding frontFacingWinding) {
        try {
            MH_setFrontFacingWinding_.invokeExact(this.handle, SEL_setFrontFacingWinding_, frontFacingWinding.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectRenderCommand setTriangleFillMode:]} */
    public void setTriangleFillMode(final MTLTriangleFillMode fillMode) {
        try {
            MH_setTriangleFillMode_.invokeExact(this.handle, SEL_setTriangleFillMode_, fillMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectRenderCommand reset]} */
    public void reset() {
        try {
            MH_reset.invokeExact(this.handle, SEL_reset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
