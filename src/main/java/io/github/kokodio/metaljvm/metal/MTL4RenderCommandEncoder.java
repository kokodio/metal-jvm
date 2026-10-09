package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSRange;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4RenderCommandEncoder}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4rendercommandencoder">Apple documentation</a>
 */
public class MTL4RenderCommandEncoder extends MTL4CommandEncoder {
    private static final long SEL_setColorAttachmentMap_ = ObjC.selector("setColorAttachmentMap:");
    private static final MethodHandle MH_setColorAttachmentMap_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRenderPipelineState_ = ObjC.selector("setRenderPipelineState:");
    private static final MethodHandle MH_setRenderPipelineState_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setViewport_ = ObjC.selector("setViewport:");
    private static final MethodHandle MH_setViewport_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setViewports_count_ = ObjC.selector("setViewports:count:");
    private static final MethodHandle MH_setViewports_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexAmplificationCount_viewMappings_ = ObjC.selector("setVertexAmplificationCount:viewMappings:");
    private static final MethodHandle MH_setVertexAmplificationCount_viewMappings_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCullMode_ = ObjC.selector("setCullMode:");
    private static final MethodHandle MH_setCullMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthClipMode_ = ObjC.selector("setDepthClipMode:");
    private static final MethodHandle MH_setDepthClipMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthBias_slopeScale_clamp_ = ObjC.selector("setDepthBias:slopeScale:clamp:");
    private static final MethodHandle MH_setDepthBias_slopeScale_clamp_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
    private static final long SEL_setDepthTestMinBound_maxBound_ = ObjC.selector("setDepthTestMinBound:maxBound:");
    private static final MethodHandle MH_setDepthTestMinBound_maxBound_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT, JAVA_FLOAT));
    private static final long SEL_setScissorRect_ = ObjC.selector("setScissorRect:");
    private static final MethodHandle MH_setScissorRect_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setScissorRects_count_ = ObjC.selector("setScissorRects:count:");
    private static final MethodHandle MH_setScissorRects_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTriangleFillMode_ = ObjC.selector("setTriangleFillMode:");
    private static final MethodHandle MH_setTriangleFillMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBlendColorRed_green_blue_alpha_ = ObjC.selector("setBlendColorRed:green:blue:alpha:");
    private static final MethodHandle MH_setBlendColorRed_green_blue_alpha_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
    private static final long SEL_setDepthStencilState_ = ObjC.selector("setDepthStencilState:");
    private static final MethodHandle MH_setDepthStencilState_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStencilReferenceValue_ = ObjC.selector("setStencilReferenceValue:");
    private static final MethodHandle MH_setStencilReferenceValue_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_INT));
    private static final long SEL_setStencilFrontReferenceValue_backReferenceValue_ = ObjC.selector("setStencilFrontReferenceValue:backReferenceValue:");
    private static final MethodHandle MH_setStencilFrontReferenceValue_backReferenceValue_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_INT, JAVA_INT));
    private static final long SEL_setVisibilityResultMode_offset_ = ObjC.selector("setVisibilityResultMode:offset:");
    private static final MethodHandle MH_setVisibilityResultMode_offset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setColorStoreAction_atIndex_ = ObjC.selector("setColorStoreAction:atIndex:");
    private static final MethodHandle MH_setColorStoreAction_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthStoreAction_ = ObjC.selector("setDepthStoreAction:");
    private static final MethodHandle MH_setDepthStoreAction_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStencilStoreAction_ = ObjC.selector("setStencilStoreAction:");
    private static final MethodHandle MH_setStencilStoreAction_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawPrimitives_vertexStart_vertexCount_ = ObjC.selector("drawPrimitives:vertexStart:vertexCount:");
    private static final MethodHandle MH_drawPrimitives_vertexStart_vertexCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawPrimitives_vertexStart_vertexCount_instanceCount_ = ObjC.selector("drawPrimitives:vertexStart:vertexCount:instanceCount:");
    private static final MethodHandle MH_drawPrimitives_vertexStart_vertexCount_instanceCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawPrimitives_vertexStart_vertexCount_instanceCount_baseInstance_ = ObjC.selector("drawPrimitives:vertexStart:vertexCount:instanceCount:baseInstance:");
    private static final MethodHandle MH_drawPrimitives_vertexStart_vertexCount_instanceCount_baseInstance_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferLength_ = ObjC.selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferLength:");
    private static final MethodHandle MH_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferLength_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferLength_instanceCount_ = ObjC.selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferLength:instanceCount:");
    private static final MethodHandle MH_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferLength_instanceCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferLength_instanceCount_baseVertex_baseInstance_ = ObjC.selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferLength:instanceCount:baseVertex:baseInstance:");
    private static final MethodHandle MH_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferLength_instanceCount_baseVertex_baseInstance_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawPrimitives_indirectBuffer_ = ObjC.selector("drawPrimitives:indirectBuffer:");
    private static final MethodHandle MH_drawPrimitives_indirectBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawIndexedPrimitives_indexType_indexBuffer_indexBufferLength_indirectBuffer_ = ObjC.selector("drawIndexedPrimitives:indexType:indexBuffer:indexBufferLength:indirectBuffer:");
    private static final MethodHandle MH_drawIndexedPrimitives_indexType_indexBuffer_indexBufferLength_indirectBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_executeCommandsInBuffer_withRange_ = ObjC.selector("executeCommandsInBuffer:withRange:");
    private static final MethodHandle MH_executeCommandsInBuffer_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_executeCommandsInBuffer_indirectBuffer_ = ObjC.selector("executeCommandsInBuffer:indirectBuffer:");
    private static final MethodHandle MH_executeCommandsInBuffer_indirectBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setObjectThreadgroupMemoryLength_atIndex_ = ObjC.selector("setObjectThreadgroupMemoryLength:atIndex:");
    private static final MethodHandle MH_setObjectThreadgroupMemoryLength_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawMeshThreadgroups_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_ = ObjC.selector("drawMeshThreadgroups:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:");
    private static final MethodHandle MH_drawMeshThreadgroups_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawMeshThreads_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_ = ObjC.selector("drawMeshThreads:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:");
    private static final MethodHandle MH_drawMeshThreads_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawMeshThreadgroupsWithIndirectBuffer_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_ = ObjC.selector("drawMeshThreadgroupsWithIndirectBuffer:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:");
    private static final MethodHandle MH_drawMeshThreadgroupsWithIndirectBuffer_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dispatchThreadsPerTile_ = ObjC.selector("dispatchThreadsPerTile:");
    private static final MethodHandle MH_dispatchThreadsPerTile_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setThreadgroupMemoryLength_offset_atIndex_ = ObjC.selector("setThreadgroupMemoryLength:offset:atIndex:");
    private static final MethodHandle MH_setThreadgroupMemoryLength_offset_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setArgumentTable_atStages_ = ObjC.selector("setArgumentTable:atStages:");
    private static final MethodHandle MH_setArgumentTable_atStages_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFrontFacingWinding_ = ObjC.selector("setFrontFacingWinding:");
    private static final MethodHandle MH_setFrontFacingWinding_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_writeTimestampWithGranularity_afterStage_intoHeap_atIndex_ = ObjC.selector("writeTimestampWithGranularity:afterStage:intoHeap:atIndex:");
    private static final MethodHandle MH_writeTimestampWithGranularity_afterStage_intoHeap_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tileWidth = ObjC.selector("tileWidth");
    private static final MethodHandle MH_tileWidth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tileHeight = ObjC.selector("tileHeight");
    private static final MethodHandle MH_tileHeight = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTL4RenderCommandEncoder(final long handle) {
        super(handle);
    }

    /** {@code -[MTL4RenderCommandEncoder setColorAttachmentMap:]} */
    public void setColorAttachmentMap(@Nullable final MTLLogicalToPhysicalColorAttachmentMap mapping) {
        try {
            MH_setColorAttachmentMap_.invokeExact(this.handle, SEL_setColorAttachmentMap_, mapping == null ? 0L : mapping.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setRenderPipelineState:]} */
    public void setRenderPipelineState(final MTLRenderPipelineState pipelineState) {
        try {
            MH_setRenderPipelineState_.invokeExact(this.handle, SEL_setRenderPipelineState_, pipelineState.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setViewport:]} */
    public void setViewport(final MTLViewport viewport) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setViewport_.invokeExact(this.handle, SEL_setViewport_, viewport.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setViewports:count:]} */
    public void setViewports(final MemorySegment viewports, final long count) {
        try {
            MH_setViewports_count_.invokeExact(this.handle, SEL_setViewports_count_, viewports.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setVertexAmplificationCount:viewMappings:]} */
    public void setVertexAmplificationCount(final long count, final MemorySegment viewMappings) {
        try {
            MH_setVertexAmplificationCount_viewMappings_.invokeExact(this.handle, SEL_setVertexAmplificationCount_viewMappings_, count, viewMappings.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setCullMode:]} */
    public void setCullMode(final MTLCullMode cullMode) {
        try {
            MH_setCullMode_.invokeExact(this.handle, SEL_setCullMode_, cullMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setDepthClipMode:]} */
    public void setDepthClipMode(final MTLDepthClipMode depthClipMode) {
        try {
            MH_setDepthClipMode_.invokeExact(this.handle, SEL_setDepthClipMode_, depthClipMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setDepthBias:slopeScale:clamp:]} */
    public void setDepthBias(final float depthBias, final float slopeScale, final float clamp) {
        try {
            MH_setDepthBias_slopeScale_clamp_.invokeExact(this.handle, SEL_setDepthBias_slopeScale_clamp_, depthBias, slopeScale, clamp);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setDepthTestMinBound:maxBound:]} */
    public void setDepthTestMinBound(final float minBound, final float maxBound) {
        try {
            MH_setDepthTestMinBound_maxBound_.invokeExact(this.handle, SEL_setDepthTestMinBound_maxBound_, minBound, maxBound);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setScissorRect:]} */
    public void setScissorRect(final MTLScissorRect rect) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setScissorRect_.invokeExact(this.handle, SEL_setScissorRect_, rect.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setScissorRects:count:]} */
    public void setScissorRects(final MemorySegment scissorRects, final long count) {
        try {
            MH_setScissorRects_count_.invokeExact(this.handle, SEL_setScissorRects_count_, scissorRects.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setTriangleFillMode:]} */
    public void setTriangleFillMode(final MTLTriangleFillMode fillMode) {
        try {
            MH_setTriangleFillMode_.invokeExact(this.handle, SEL_setTriangleFillMode_, fillMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setBlendColorRed:green:blue:alpha:]} */
    public void setBlendColorRed(final float red, final float green, final float blue, final float alpha) {
        try {
            MH_setBlendColorRed_green_blue_alpha_.invokeExact(this.handle, SEL_setBlendColorRed_green_blue_alpha_, red, green, blue, alpha);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setDepthStencilState:]} */
    public void setDepthStencilState(@Nullable final MTLDepthStencilState depthStencilState) {
        try {
            MH_setDepthStencilState_.invokeExact(this.handle, SEL_setDepthStencilState_, depthStencilState == null ? 0L : depthStencilState.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setStencilReferenceValue:]} */
    public void setStencilReferenceValue(final int referenceValue) {
        try {
            MH_setStencilReferenceValue_.invokeExact(this.handle, SEL_setStencilReferenceValue_, referenceValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setStencilFrontReferenceValue:backReferenceValue:]} */
    public void setStencilFrontReferenceValue(final int frontReferenceValue, final int backReferenceValue) {
        try {
            MH_setStencilFrontReferenceValue_backReferenceValue_.invokeExact(this.handle, SEL_setStencilFrontReferenceValue_backReferenceValue_, frontReferenceValue, backReferenceValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setVisibilityResultMode:offset:]} */
    public void setVisibilityResultMode(final MTLVisibilityResultMode mode, final long offset) {
        try {
            MH_setVisibilityResultMode_offset_.invokeExact(this.handle, SEL_setVisibilityResultMode_offset_, mode.value, offset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setColorStoreAction:atIndex:]} */
    public void setColorStoreAction(final MTLStoreAction storeAction, final long colorAttachmentIndex) {
        try {
            MH_setColorStoreAction_atIndex_.invokeExact(this.handle, SEL_setColorStoreAction_atIndex_, storeAction.value, colorAttachmentIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setDepthStoreAction:]} */
    public void setDepthStoreAction(final MTLStoreAction storeAction) {
        try {
            MH_setDepthStoreAction_.invokeExact(this.handle, SEL_setDepthStoreAction_, storeAction.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setStencilStoreAction:]} */
    public void setStencilStoreAction(final MTLStoreAction storeAction) {
        try {
            MH_setStencilStoreAction_.invokeExact(this.handle, SEL_setStencilStoreAction_, storeAction.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder drawPrimitives:vertexStart:vertexCount:]} */
    public void drawPrimitives(final MTLPrimitiveType primitiveType, final long vertexStart, final long vertexCount) {
        try {
            MH_drawPrimitives_vertexStart_vertexCount_.invokeExact(this.handle, SEL_drawPrimitives_vertexStart_vertexCount_, primitiveType.value, vertexStart, vertexCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder drawPrimitives:vertexStart:vertexCount:instanceCount:]} */
    public void drawPrimitives(final MTLPrimitiveType primitiveType, final long vertexStart, final long vertexCount, final long instanceCount) {
        try {
            MH_drawPrimitives_vertexStart_vertexCount_instanceCount_.invokeExact(this.handle, SEL_drawPrimitives_vertexStart_vertexCount_instanceCount_, primitiveType.value, vertexStart, vertexCount, instanceCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder drawPrimitives:vertexStart:vertexCount:instanceCount:baseInstance:]} */
    public void drawPrimitives(final MTLPrimitiveType primitiveType, final long vertexStart, final long vertexCount, final long instanceCount, final long baseInstance) {
        try {
            MH_drawPrimitives_vertexStart_vertexCount_instanceCount_baseInstance_.invokeExact(this.handle, SEL_drawPrimitives_vertexStart_vertexCount_instanceCount_baseInstance_, primitiveType.value, vertexStart, vertexCount, instanceCount, baseInstance);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferLength:]} */
    public void drawIndexedPrimitives(final MTLPrimitiveType primitiveType, final long indexCount, final MTLIndexType indexType, final long indexBuffer, final long indexBufferLength) {
        try {
            MH_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferLength_.invokeExact(this.handle, SEL_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferLength_, primitiveType.value, indexCount, indexType.value, indexBuffer, indexBufferLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferLength:instanceCount:]} */
    public void drawIndexedPrimitives(final MTLPrimitiveType primitiveType, final long indexCount, final MTLIndexType indexType, final long indexBuffer, final long indexBufferLength, final long instanceCount) {
        try {
            MH_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferLength_instanceCount_.invokeExact(this.handle, SEL_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferLength_instanceCount_, primitiveType.value, indexCount, indexType.value, indexBuffer, indexBufferLength, instanceCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferLength:instanceCount:baseVertex:baseInstance:]} */
    public void drawIndexedPrimitives(final MTLPrimitiveType primitiveType, final long indexCount, final MTLIndexType indexType, final long indexBuffer, final long indexBufferLength, final long instanceCount, final long baseVertex, final long baseInstance) {
        try {
            MH_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferLength_instanceCount_baseVertex_baseInstance_.invokeExact(this.handle, SEL_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferLength_instanceCount_baseVertex_baseInstance_, primitiveType.value, indexCount, indexType.value, indexBuffer, indexBufferLength, instanceCount, baseVertex, baseInstance);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder drawPrimitives:indirectBuffer:]} */
    public void drawPrimitives(final MTLPrimitiveType primitiveType, final long indirectBuffer) {
        try {
            MH_drawPrimitives_indirectBuffer_.invokeExact(this.handle, SEL_drawPrimitives_indirectBuffer_, primitiveType.value, indirectBuffer);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder drawIndexedPrimitives:indexType:indexBuffer:indexBufferLength:indirectBuffer:]} */
    public void drawIndexedPrimitives(final MTLPrimitiveType primitiveType, final MTLIndexType indexType, final long indexBuffer, final long indexBufferLength, final long indirectBuffer) {
        try {
            MH_drawIndexedPrimitives_indexType_indexBuffer_indexBufferLength_indirectBuffer_.invokeExact(this.handle, SEL_drawIndexedPrimitives_indexType_indexBuffer_indexBufferLength_indirectBuffer_, primitiveType.value, indexType.value, indexBuffer, indexBufferLength, indirectBuffer);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder executeCommandsInBuffer:withRange:]} */
    public void executeCommandsInBuffer(final MTLIndirectCommandBuffer indirectCommandBuffer, final NSRange executionRange) {
        try {
            MH_executeCommandsInBuffer_withRange_.invokeExact(this.handle, SEL_executeCommandsInBuffer_withRange_, indirectCommandBuffer.handle(), executionRange.location(), executionRange.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder executeCommandsInBuffer:indirectBuffer:]} */
    public void executeCommandsInBuffer(final MTLIndirectCommandBuffer indirectCommandBuffer, final long indirectRangeBuffer) {
        try {
            MH_executeCommandsInBuffer_indirectBuffer_.invokeExact(this.handle, SEL_executeCommandsInBuffer_indirectBuffer_, indirectCommandBuffer.handle(), indirectRangeBuffer);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setObjectThreadgroupMemoryLength:atIndex:]} */
    public void setObjectThreadgroupMemoryLength(final long length, final long index) {
        try {
            MH_setObjectThreadgroupMemoryLength_atIndex_.invokeExact(this.handle, SEL_setObjectThreadgroupMemoryLength_atIndex_, length, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder drawMeshThreadgroups:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:]} */
    public void drawMeshThreadgroups(final MTLSize threadgroupsPerGrid, final MTLSize threadsPerObjectThreadgroup, final MTLSize threadsPerMeshThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_drawMeshThreadgroups_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_.invokeExact(this.handle, SEL_drawMeshThreadgroups_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_, threadgroupsPerGrid.on(stack).address(), threadsPerObjectThreadgroup.on(stack).address(), threadsPerMeshThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder drawMeshThreads:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:]} */
    public void drawMeshThreads(final MTLSize threadsPerGrid, final MTLSize threadsPerObjectThreadgroup, final MTLSize threadsPerMeshThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_drawMeshThreads_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_.invokeExact(this.handle, SEL_drawMeshThreads_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_, threadsPerGrid.on(stack).address(), threadsPerObjectThreadgroup.on(stack).address(), threadsPerMeshThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder drawMeshThreadgroupsWithIndirectBuffer:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:]} */
    public void drawMeshThreadgroupsWithIndirectBuffer(final long indirectBuffer, final MTLSize threadsPerObjectThreadgroup, final MTLSize threadsPerMeshThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_drawMeshThreadgroupsWithIndirectBuffer_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_.invokeExact(this.handle, SEL_drawMeshThreadgroupsWithIndirectBuffer_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_, indirectBuffer, threadsPerObjectThreadgroup.on(stack).address(), threadsPerMeshThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder dispatchThreadsPerTile:]} */
    public void dispatchThreadsPerTile(final MTLSize threadsPerTile) {
        try (NativeStack stack = NativeStack.push()) {
            MH_dispatchThreadsPerTile_.invokeExact(this.handle, SEL_dispatchThreadsPerTile_, threadsPerTile.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setThreadgroupMemoryLength:offset:atIndex:]} */
    public void setThreadgroupMemoryLength(final long length, final long offset, final long index) {
        try {
            MH_setThreadgroupMemoryLength_offset_atIndex_.invokeExact(this.handle, SEL_setThreadgroupMemoryLength_offset_atIndex_, length, offset, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4RenderCommandEncoder setArgumentTable:atStages:]}
     *
     * @param stages a combination of {@link MTLRenderStages} flags
     */
    public void setArgumentTable(@Nullable final MTL4ArgumentTable argumentTable, final long stages) {
        try {
            MH_setArgumentTable_atStages_.invokeExact(this.handle, SEL_setArgumentTable_atStages_, argumentTable == null ? 0L : argumentTable.handle(), stages);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder setFrontFacingWinding:]} */
    public void setFrontFacingWinding(final MTLWinding frontFacingWinding) {
        try {
            MH_setFrontFacingWinding_.invokeExact(this.handle, SEL_setFrontFacingWinding_, frontFacingWinding.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4RenderCommandEncoder writeTimestampWithGranularity:afterStage:intoHeap:atIndex:]}
     *
     * @param stage a combination of {@link MTLRenderStages} flags
     */
    public void writeTimestamp(final MTL4TimestampGranularity granularity, final long stage, final MTL4CounterHeap counterHeap, final long index) {
        try {
            MH_writeTimestampWithGranularity_afterStage_intoHeap_atIndex_.invokeExact(this.handle, SEL_writeTimestampWithGranularity_afterStage_intoHeap_atIndex_, granularity.value, stage, counterHeap.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder tileWidth]} */
    public long tileWidth() {
        try {
            return (long) MH_tileWidth.invokeExact(this.handle, SEL_tileWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderCommandEncoder tileHeight]} */
    public long tileHeight() {
        try {
            return (long) MH_tileHeight.invokeExact(this.handle, SEL_tileHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
