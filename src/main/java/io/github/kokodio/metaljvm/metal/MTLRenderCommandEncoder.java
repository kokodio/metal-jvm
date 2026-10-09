package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSRange;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLRenderCommandEncoder}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlrendercommandencoder">Apple documentation</a>
 */
public class MTLRenderCommandEncoder extends MTLCommandEncoder {
    private static final long SEL_setRenderPipelineState_ = ObjC.selector("setRenderPipelineState:");
    private static final MethodHandle MH_setRenderPipelineState_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexBytes_length_atIndex_ = ObjC.selector("setVertexBytes:length:atIndex:");
    private static final MethodHandle MH_setVertexBytes_length_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexBuffer_offset_atIndex_ = ObjC.selector("setVertexBuffer:offset:atIndex:");
    private static final MethodHandle MH_setVertexBuffer_offset_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexBufferOffset_atIndex_ = ObjC.selector("setVertexBufferOffset:atIndex:");
    private static final MethodHandle MH_setVertexBufferOffset_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexBuffers_offsets_withRange_ = ObjC.selector("setVertexBuffers:offsets:withRange:");
    private static final MethodHandle MH_setVertexBuffers_offsets_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexBuffer_offset_attributeStride_atIndex_ = ObjC.selector("setVertexBuffer:offset:attributeStride:atIndex:");
    private static final MethodHandle MH_setVertexBuffer_offset_attributeStride_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexBuffers_offsets_attributeStrides_withRange_ = ObjC.selector("setVertexBuffers:offsets:attributeStrides:withRange:");
    private static final MethodHandle MH_setVertexBuffers_offsets_attributeStrides_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexBufferOffset_attributeStride_atIndex_ = ObjC.selector("setVertexBufferOffset:attributeStride:atIndex:");
    private static final MethodHandle MH_setVertexBufferOffset_attributeStride_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexBytes_length_attributeStride_atIndex_ = ObjC.selector("setVertexBytes:length:attributeStride:atIndex:");
    private static final MethodHandle MH_setVertexBytes_length_attributeStride_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexTexture_atIndex_ = ObjC.selector("setVertexTexture:atIndex:");
    private static final MethodHandle MH_setVertexTexture_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexTextures_withRange_ = ObjC.selector("setVertexTextures:withRange:");
    private static final MethodHandle MH_setVertexTextures_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexSamplerState_atIndex_ = ObjC.selector("setVertexSamplerState:atIndex:");
    private static final MethodHandle MH_setVertexSamplerState_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexSamplerStates_withRange_ = ObjC.selector("setVertexSamplerStates:withRange:");
    private static final MethodHandle MH_setVertexSamplerStates_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexSamplerState_lodMinClamp_lodMaxClamp_atIndex_ = ObjC.selector("setVertexSamplerState:lodMinClamp:lodMaxClamp:atIndex:");
    private static final MethodHandle MH_setVertexSamplerState_lodMinClamp_lodMaxClamp_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_FLOAT, JAVA_FLOAT, JAVA_LONG));
    private static final long SEL_setVertexSamplerStates_lodMinClamps_lodMaxClamps_withRange_ = ObjC.selector("setVertexSamplerStates:lodMinClamps:lodMaxClamps:withRange:");
    private static final MethodHandle MH_setVertexSamplerStates_lodMinClamps_lodMaxClamps_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexVisibleFunctionTable_atBufferIndex_ = ObjC.selector("setVertexVisibleFunctionTable:atBufferIndex:");
    private static final MethodHandle MH_setVertexVisibleFunctionTable_atBufferIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexVisibleFunctionTables_withBufferRange_ = ObjC.selector("setVertexVisibleFunctionTables:withBufferRange:");
    private static final MethodHandle MH_setVertexVisibleFunctionTables_withBufferRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexIntersectionFunctionTable_atBufferIndex_ = ObjC.selector("setVertexIntersectionFunctionTable:atBufferIndex:");
    private static final MethodHandle MH_setVertexIntersectionFunctionTable_atBufferIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexIntersectionFunctionTables_withBufferRange_ = ObjC.selector("setVertexIntersectionFunctionTables:withBufferRange:");
    private static final MethodHandle MH_setVertexIntersectionFunctionTables_withBufferRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexAccelerationStructure_atBufferIndex_ = ObjC.selector("setVertexAccelerationStructure:atBufferIndex:");
    private static final MethodHandle MH_setVertexAccelerationStructure_atBufferIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setViewport_ = ObjC.selector("setViewport:");
    private static final MethodHandle MH_setViewport_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setViewports_count_ = ObjC.selector("setViewports:count:");
    private static final MethodHandle MH_setViewports_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFrontFacingWinding_ = ObjC.selector("setFrontFacingWinding:");
    private static final MethodHandle MH_setFrontFacingWinding_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final long SEL_setFragmentBytes_length_atIndex_ = ObjC.selector("setFragmentBytes:length:atIndex:");
    private static final MethodHandle MH_setFragmentBytes_length_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentBuffer_offset_atIndex_ = ObjC.selector("setFragmentBuffer:offset:atIndex:");
    private static final MethodHandle MH_setFragmentBuffer_offset_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentBufferOffset_atIndex_ = ObjC.selector("setFragmentBufferOffset:atIndex:");
    private static final MethodHandle MH_setFragmentBufferOffset_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentBuffers_offsets_withRange_ = ObjC.selector("setFragmentBuffers:offsets:withRange:");
    private static final MethodHandle MH_setFragmentBuffers_offsets_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentTexture_atIndex_ = ObjC.selector("setFragmentTexture:atIndex:");
    private static final MethodHandle MH_setFragmentTexture_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentTextures_withRange_ = ObjC.selector("setFragmentTextures:withRange:");
    private static final MethodHandle MH_setFragmentTextures_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentSamplerState_atIndex_ = ObjC.selector("setFragmentSamplerState:atIndex:");
    private static final MethodHandle MH_setFragmentSamplerState_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentSamplerStates_withRange_ = ObjC.selector("setFragmentSamplerStates:withRange:");
    private static final MethodHandle MH_setFragmentSamplerStates_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentSamplerState_lodMinClamp_lodMaxClamp_atIndex_ = ObjC.selector("setFragmentSamplerState:lodMinClamp:lodMaxClamp:atIndex:");
    private static final MethodHandle MH_setFragmentSamplerState_lodMinClamp_lodMaxClamp_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_FLOAT, JAVA_FLOAT, JAVA_LONG));
    private static final long SEL_setFragmentSamplerStates_lodMinClamps_lodMaxClamps_withRange_ = ObjC.selector("setFragmentSamplerStates:lodMinClamps:lodMaxClamps:withRange:");
    private static final MethodHandle MH_setFragmentSamplerStates_lodMinClamps_lodMaxClamps_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentVisibleFunctionTable_atBufferIndex_ = ObjC.selector("setFragmentVisibleFunctionTable:atBufferIndex:");
    private static final MethodHandle MH_setFragmentVisibleFunctionTable_atBufferIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentVisibleFunctionTables_withBufferRange_ = ObjC.selector("setFragmentVisibleFunctionTables:withBufferRange:");
    private static final MethodHandle MH_setFragmentVisibleFunctionTables_withBufferRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentIntersectionFunctionTable_atBufferIndex_ = ObjC.selector("setFragmentIntersectionFunctionTable:atBufferIndex:");
    private static final MethodHandle MH_setFragmentIntersectionFunctionTable_atBufferIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentIntersectionFunctionTables_withBufferRange_ = ObjC.selector("setFragmentIntersectionFunctionTables:withBufferRange:");
    private static final MethodHandle MH_setFragmentIntersectionFunctionTables_withBufferRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentAccelerationStructure_atBufferIndex_ = ObjC.selector("setFragmentAccelerationStructure:atBufferIndex:");
    private static final MethodHandle MH_setFragmentAccelerationStructure_atBufferIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final long SEL_setColorStoreActionOptions_atIndex_ = ObjC.selector("setColorStoreActionOptions:atIndex:");
    private static final MethodHandle MH_setColorStoreActionOptions_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthStoreActionOptions_ = ObjC.selector("setDepthStoreActionOptions:");
    private static final MethodHandle MH_setDepthStoreActionOptions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStencilStoreActionOptions_ = ObjC.selector("setStencilStoreActionOptions:");
    private static final MethodHandle MH_setStencilStoreActionOptions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setObjectBytes_length_atIndex_ = ObjC.selector("setObjectBytes:length:atIndex:");
    private static final MethodHandle MH_setObjectBytes_length_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setObjectBuffer_offset_atIndex_ = ObjC.selector("setObjectBuffer:offset:atIndex:");
    private static final MethodHandle MH_setObjectBuffer_offset_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setObjectBufferOffset_atIndex_ = ObjC.selector("setObjectBufferOffset:atIndex:");
    private static final MethodHandle MH_setObjectBufferOffset_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setObjectBuffers_offsets_withRange_ = ObjC.selector("setObjectBuffers:offsets:withRange:");
    private static final MethodHandle MH_setObjectBuffers_offsets_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setObjectTexture_atIndex_ = ObjC.selector("setObjectTexture:atIndex:");
    private static final MethodHandle MH_setObjectTexture_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setObjectTextures_withRange_ = ObjC.selector("setObjectTextures:withRange:");
    private static final MethodHandle MH_setObjectTextures_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setObjectSamplerState_atIndex_ = ObjC.selector("setObjectSamplerState:atIndex:");
    private static final MethodHandle MH_setObjectSamplerState_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setObjectSamplerStates_withRange_ = ObjC.selector("setObjectSamplerStates:withRange:");
    private static final MethodHandle MH_setObjectSamplerStates_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setObjectSamplerState_lodMinClamp_lodMaxClamp_atIndex_ = ObjC.selector("setObjectSamplerState:lodMinClamp:lodMaxClamp:atIndex:");
    private static final MethodHandle MH_setObjectSamplerState_lodMinClamp_lodMaxClamp_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_FLOAT, JAVA_FLOAT, JAVA_LONG));
    private static final long SEL_setObjectSamplerStates_lodMinClamps_lodMaxClamps_withRange_ = ObjC.selector("setObjectSamplerStates:lodMinClamps:lodMaxClamps:withRange:");
    private static final MethodHandle MH_setObjectSamplerStates_lodMinClamps_lodMaxClamps_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setObjectThreadgroupMemoryLength_atIndex_ = ObjC.selector("setObjectThreadgroupMemoryLength:atIndex:");
    private static final MethodHandle MH_setObjectThreadgroupMemoryLength_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMeshBytes_length_atIndex_ = ObjC.selector("setMeshBytes:length:atIndex:");
    private static final MethodHandle MH_setMeshBytes_length_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMeshBuffer_offset_atIndex_ = ObjC.selector("setMeshBuffer:offset:atIndex:");
    private static final MethodHandle MH_setMeshBuffer_offset_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMeshBufferOffset_atIndex_ = ObjC.selector("setMeshBufferOffset:atIndex:");
    private static final MethodHandle MH_setMeshBufferOffset_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMeshBuffers_offsets_withRange_ = ObjC.selector("setMeshBuffers:offsets:withRange:");
    private static final MethodHandle MH_setMeshBuffers_offsets_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMeshTexture_atIndex_ = ObjC.selector("setMeshTexture:atIndex:");
    private static final MethodHandle MH_setMeshTexture_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMeshTextures_withRange_ = ObjC.selector("setMeshTextures:withRange:");
    private static final MethodHandle MH_setMeshTextures_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMeshSamplerState_atIndex_ = ObjC.selector("setMeshSamplerState:atIndex:");
    private static final MethodHandle MH_setMeshSamplerState_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMeshSamplerStates_withRange_ = ObjC.selector("setMeshSamplerStates:withRange:");
    private static final MethodHandle MH_setMeshSamplerStates_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMeshSamplerState_lodMinClamp_lodMaxClamp_atIndex_ = ObjC.selector("setMeshSamplerState:lodMinClamp:lodMaxClamp:atIndex:");
    private static final MethodHandle MH_setMeshSamplerState_lodMinClamp_lodMaxClamp_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_FLOAT, JAVA_FLOAT, JAVA_LONG));
    private static final long SEL_setMeshSamplerStates_lodMinClamps_lodMaxClamps_withRange_ = ObjC.selector("setMeshSamplerStates:lodMinClamps:lodMaxClamps:withRange:");
    private static final MethodHandle MH_setMeshSamplerStates_lodMinClamps_lodMaxClamps_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawMeshThreadgroups_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_ = ObjC.selector("drawMeshThreadgroups:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:");
    private static final MethodHandle MH_drawMeshThreadgroups_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawMeshThreads_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_ = ObjC.selector("drawMeshThreads:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:");
    private static final MethodHandle MH_drawMeshThreads_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawMeshThreadgroupsWithIndirectBuffer_indirectBufferOffset_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_ = ObjC.selector("drawMeshThreadgroupsWithIndirectBuffer:indirectBufferOffset:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:");
    private static final MethodHandle MH_drawMeshThreadgroupsWithIndirectBuffer_indirectBufferOffset_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawPrimitives_vertexStart_vertexCount_instanceCount_ = ObjC.selector("drawPrimitives:vertexStart:vertexCount:instanceCount:");
    private static final MethodHandle MH_drawPrimitives_vertexStart_vertexCount_instanceCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawPrimitives_vertexStart_vertexCount_ = ObjC.selector("drawPrimitives:vertexStart:vertexCount:");
    private static final MethodHandle MH_drawPrimitives_vertexStart_vertexCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferOffset_instanceCount_ = ObjC.selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:");
    private static final MethodHandle MH_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferOffset_instanceCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferOffset_ = ObjC.selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:");
    private static final MethodHandle MH_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawPrimitives_vertexStart_vertexCount_instanceCount_baseInstance_ = ObjC.selector("drawPrimitives:vertexStart:vertexCount:instanceCount:baseInstance:");
    private static final MethodHandle MH_drawPrimitives_vertexStart_vertexCount_instanceCount_baseInstance_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferOffset_instanceCount_baseVertex_baseInstance_ = ObjC.selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:baseVertex:baseInstance:");
    private static final MethodHandle MH_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferOffset_instanceCount_baseVertex_baseInstance_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawPrimitives_indirectBuffer_indirectBufferOffset_ = ObjC.selector("drawPrimitives:indirectBuffer:indirectBufferOffset:");
    private static final MethodHandle MH_drawPrimitives_indirectBuffer_indirectBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawIndexedPrimitives_indexType_indexBuffer_indexBufferOffset_indirectBuffer_indirectBufferOffset_ = ObjC.selector("drawIndexedPrimitives:indexType:indexBuffer:indexBufferOffset:indirectBuffer:indirectBufferOffset:");
    private static final MethodHandle MH_drawIndexedPrimitives_indexType_indexBuffer_indexBufferOffset_indirectBuffer_indirectBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_textureBarrier = ObjC.selector("textureBarrier");
    private static final MethodHandle MH_textureBarrier = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_updateFence_afterStages_ = ObjC.selector("updateFence:afterStages:");
    private static final MethodHandle MH_updateFence_afterStages_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_waitForFence_beforeStages_ = ObjC.selector("waitForFence:beforeStages:");
    private static final MethodHandle MH_waitForFence_beforeStages_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTessellationFactorBuffer_offset_instanceStride_ = ObjC.selector("setTessellationFactorBuffer:offset:instanceStride:");
    private static final MethodHandle MH_setTessellationFactorBuffer_offset_instanceStride_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTessellationFactorScale_ = ObjC.selector("setTessellationFactorScale:");
    private static final MethodHandle MH_setTessellationFactorScale_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_drawPatches_patchStart_patchCount_patchIndexBuffer_patchIndexBufferOffset_instanceCount_baseInstance_ = ObjC.selector("drawPatches:patchStart:patchCount:patchIndexBuffer:patchIndexBufferOffset:instanceCount:baseInstance:");
    private static final MethodHandle MH_drawPatches_patchStart_patchCount_patchIndexBuffer_patchIndexBufferOffset_instanceCount_baseInstance_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawPatches_patchIndexBuffer_patchIndexBufferOffset_indirectBuffer_indirectBufferOffset_ = ObjC.selector("drawPatches:patchIndexBuffer:patchIndexBufferOffset:indirectBuffer:indirectBufferOffset:");
    private static final MethodHandle MH_drawPatches_patchIndexBuffer_patchIndexBufferOffset_indirectBuffer_indirectBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawIndexedPatches_patchStart_patchCount_patchIndexBuffer_patchIndexBufferOffset_controlPointIndexBuffer_controlPointIndexBufferOffset_instanceCount_baseInstance_ = ObjC.selector("drawIndexedPatches:patchStart:patchCount:patchIndexBuffer:patchIndexBufferOffset:controlPointIndexBuffer:controlPointIndexBufferOffset:instanceCount:baseInstance:");
    private static final MethodHandle MH_drawIndexedPatches_patchStart_patchCount_patchIndexBuffer_patchIndexBufferOffset_controlPointIndexBuffer_controlPointIndexBufferOffset_instanceCount_baseInstance_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawIndexedPatches_patchIndexBuffer_patchIndexBufferOffset_controlPointIndexBuffer_controlPointIndexBufferOffset_indirectBuffer_indirectBufferOffset_ = ObjC.selector("drawIndexedPatches:patchIndexBuffer:patchIndexBufferOffset:controlPointIndexBuffer:controlPointIndexBufferOffset:indirectBuffer:indirectBufferOffset:");
    private static final MethodHandle MH_drawIndexedPatches_patchIndexBuffer_patchIndexBufferOffset_controlPointIndexBuffer_controlPointIndexBufferOffset_indirectBuffer_indirectBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTileBytes_length_atIndex_ = ObjC.selector("setTileBytes:length:atIndex:");
    private static final MethodHandle MH_setTileBytes_length_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTileBuffer_offset_atIndex_ = ObjC.selector("setTileBuffer:offset:atIndex:");
    private static final MethodHandle MH_setTileBuffer_offset_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTileBufferOffset_atIndex_ = ObjC.selector("setTileBufferOffset:atIndex:");
    private static final MethodHandle MH_setTileBufferOffset_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTileBuffers_offsets_withRange_ = ObjC.selector("setTileBuffers:offsets:withRange:");
    private static final MethodHandle MH_setTileBuffers_offsets_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTileTexture_atIndex_ = ObjC.selector("setTileTexture:atIndex:");
    private static final MethodHandle MH_setTileTexture_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTileTextures_withRange_ = ObjC.selector("setTileTextures:withRange:");
    private static final MethodHandle MH_setTileTextures_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTileSamplerState_atIndex_ = ObjC.selector("setTileSamplerState:atIndex:");
    private static final MethodHandle MH_setTileSamplerState_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTileSamplerStates_withRange_ = ObjC.selector("setTileSamplerStates:withRange:");
    private static final MethodHandle MH_setTileSamplerStates_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTileSamplerState_lodMinClamp_lodMaxClamp_atIndex_ = ObjC.selector("setTileSamplerState:lodMinClamp:lodMaxClamp:atIndex:");
    private static final MethodHandle MH_setTileSamplerState_lodMinClamp_lodMaxClamp_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_FLOAT, JAVA_FLOAT, JAVA_LONG));
    private static final long SEL_setTileSamplerStates_lodMinClamps_lodMaxClamps_withRange_ = ObjC.selector("setTileSamplerStates:lodMinClamps:lodMaxClamps:withRange:");
    private static final MethodHandle MH_setTileSamplerStates_lodMinClamps_lodMaxClamps_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTileVisibleFunctionTable_atBufferIndex_ = ObjC.selector("setTileVisibleFunctionTable:atBufferIndex:");
    private static final MethodHandle MH_setTileVisibleFunctionTable_atBufferIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTileVisibleFunctionTables_withBufferRange_ = ObjC.selector("setTileVisibleFunctionTables:withBufferRange:");
    private static final MethodHandle MH_setTileVisibleFunctionTables_withBufferRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTileIntersectionFunctionTable_atBufferIndex_ = ObjC.selector("setTileIntersectionFunctionTable:atBufferIndex:");
    private static final MethodHandle MH_setTileIntersectionFunctionTable_atBufferIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTileIntersectionFunctionTables_withBufferRange_ = ObjC.selector("setTileIntersectionFunctionTables:withBufferRange:");
    private static final MethodHandle MH_setTileIntersectionFunctionTables_withBufferRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTileAccelerationStructure_atBufferIndex_ = ObjC.selector("setTileAccelerationStructure:atBufferIndex:");
    private static final MethodHandle MH_setTileAccelerationStructure_atBufferIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dispatchThreadsPerTile_ = ObjC.selector("dispatchThreadsPerTile:");
    private static final MethodHandle MH_dispatchThreadsPerTile_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setThreadgroupMemoryLength_offset_atIndex_ = ObjC.selector("setThreadgroupMemoryLength:offset:atIndex:");
    private static final MethodHandle MH_setThreadgroupMemoryLength_offset_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_useResource_usage_ = ObjC.selector("useResource:usage:");
    private static final MethodHandle MH_useResource_usage_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_useResources_count_usage_ = ObjC.selector("useResources:count:usage:");
    private static final MethodHandle MH_useResources_count_usage_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_useResource_usage_stages_ = ObjC.selector("useResource:usage:stages:");
    private static final MethodHandle MH_useResource_usage_stages_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_useResources_count_usage_stages_ = ObjC.selector("useResources:count:usage:stages:");
    private static final MethodHandle MH_useResources_count_usage_stages_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_useHeap_ = ObjC.selector("useHeap:");
    private static final MethodHandle MH_useHeap_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_useHeaps_count_ = ObjC.selector("useHeaps:count:");
    private static final MethodHandle MH_useHeaps_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_useHeap_stages_ = ObjC.selector("useHeap:stages:");
    private static final MethodHandle MH_useHeap_stages_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_useHeaps_count_stages_ = ObjC.selector("useHeaps:count:stages:");
    private static final MethodHandle MH_useHeaps_count_stages_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_executeCommandsInBuffer_withRange_ = ObjC.selector("executeCommandsInBuffer:withRange:");
    private static final MethodHandle MH_executeCommandsInBuffer_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_executeCommandsInBuffer_indirectBuffer_indirectBufferOffset_ = ObjC.selector("executeCommandsInBuffer:indirectBuffer:indirectBufferOffset:");
    private static final MethodHandle MH_executeCommandsInBuffer_indirectBuffer_indirectBufferOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_memoryBarrierWithScope_afterStages_beforeStages_ = ObjC.selector("memoryBarrierWithScope:afterStages:beforeStages:");
    private static final MethodHandle MH_memoryBarrierWithScope_afterStages_beforeStages_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_memoryBarrierWithResources_count_afterStages_beforeStages_ = ObjC.selector("memoryBarrierWithResources:count:afterStages:beforeStages:");
    private static final MethodHandle MH_memoryBarrierWithResources_count_afterStages_beforeStages_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sampleCountersInBuffer_atSampleIndex_withBarrier_ = ObjC.selector("sampleCountersInBuffer:atSampleIndex:withBarrier:");
    private static final MethodHandle MH_sampleCountersInBuffer_atSampleIndex_withBarrier_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_setColorAttachmentMap_ = ObjC.selector("setColorAttachmentMap:");
    private static final MethodHandle MH_setColorAttachmentMap_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tileWidth = ObjC.selector("tileWidth");
    private static final MethodHandle MH_tileWidth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tileHeight = ObjC.selector("tileHeight");
    private static final MethodHandle MH_tileHeight = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLRenderCommandEncoder(final long handle) {
        super(handle);
    }

    /** {@code -[MTLRenderCommandEncoder setRenderPipelineState:]} */
    public void setRenderPipelineState(final MTLRenderPipelineState pipelineState) {
        try {
            MH_setRenderPipelineState_.invokeExact(this.handle, SEL_setRenderPipelineState_, pipelineState.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setVertexBytes:length:atIndex:]} */
    public void setVertexBytes(final MemorySegment bytes, final long length, final long index) {
        try {
            MH_setVertexBytes_length_atIndex_.invokeExact(this.handle, SEL_setVertexBytes_length_atIndex_, bytes.address(), length, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setVertexBuffer:offset:atIndex:]} */
    public void setVertexBuffer(@Nullable final MTLBuffer buffer, final long offset, final long index) {
        try {
            MH_setVertexBuffer_offset_atIndex_.invokeExact(this.handle, SEL_setVertexBuffer_offset_atIndex_, buffer == null ? 0L : buffer.handle(), offset, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setVertexBufferOffset:atIndex:]} */
    public void setVertexBufferOffset(final long offset, final long index) {
        try {
            MH_setVertexBufferOffset_atIndex_.invokeExact(this.handle, SEL_setVertexBufferOffset_atIndex_, offset, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setVertexBuffers:offsets:withRange:]} */
    public void setVertexBuffers(final MemorySegment buffers, final MemorySegment offsets, final NSRange range) {
        try {
            MH_setVertexBuffers_offsets_withRange_.invokeExact(this.handle, SEL_setVertexBuffers_offsets_withRange_, buffers.address(), offsets.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setVertexBuffer:offset:attributeStride:atIndex:]} */
    public void setVertexBuffer(@Nullable final MTLBuffer buffer, final long offset, final long stride, final long index) {
        try {
            MH_setVertexBuffer_offset_attributeStride_atIndex_.invokeExact(this.handle, SEL_setVertexBuffer_offset_attributeStride_atIndex_, buffer == null ? 0L : buffer.handle(), offset, stride, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setVertexBuffers:offsets:attributeStrides:withRange:]} */
    public void setVertexBuffers(final MemorySegment buffers, final MemorySegment offsets, final MemorySegment strides, final NSRange range) {
        try {
            MH_setVertexBuffers_offsets_attributeStrides_withRange_.invokeExact(this.handle, SEL_setVertexBuffers_offsets_attributeStrides_withRange_, buffers.address(), offsets.address(), strides.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setVertexBufferOffset:attributeStride:atIndex:]} */
    public void setVertexBufferOffset(final long offset, final long stride, final long index) {
        try {
            MH_setVertexBufferOffset_attributeStride_atIndex_.invokeExact(this.handle, SEL_setVertexBufferOffset_attributeStride_atIndex_, offset, stride, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setVertexBytes:length:attributeStride:atIndex:]} */
    public void setVertexBytes(final MemorySegment bytes, final long length, final long stride, final long index) {
        try {
            MH_setVertexBytes_length_attributeStride_atIndex_.invokeExact(this.handle, SEL_setVertexBytes_length_attributeStride_atIndex_, bytes.address(), length, stride, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setVertexTexture:atIndex:]} */
    public void setVertexTexture(@Nullable final MTLTexture texture, final long index) {
        try {
            MH_setVertexTexture_atIndex_.invokeExact(this.handle, SEL_setVertexTexture_atIndex_, texture == null ? 0L : texture.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setVertexTextures:withRange:]} */
    public void setVertexTextures(final MemorySegment textures, final NSRange range) {
        try {
            MH_setVertexTextures_withRange_.invokeExact(this.handle, SEL_setVertexTextures_withRange_, textures.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setVertexSamplerState:atIndex:]} */
    public void setVertexSamplerState(@Nullable final MTLSamplerState sampler, final long index) {
        try {
            MH_setVertexSamplerState_atIndex_.invokeExact(this.handle, SEL_setVertexSamplerState_atIndex_, sampler == null ? 0L : sampler.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setVertexSamplerStates:withRange:]} */
    public void setVertexSamplerStates(final MemorySegment samplers, final NSRange range) {
        try {
            MH_setVertexSamplerStates_withRange_.invokeExact(this.handle, SEL_setVertexSamplerStates_withRange_, samplers.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setVertexSamplerState:lodMinClamp:lodMaxClamp:atIndex:]} */
    public void setVertexSamplerState(@Nullable final MTLSamplerState sampler, final float lodMinClamp, final float lodMaxClamp, final long index) {
        try {
            MH_setVertexSamplerState_lodMinClamp_lodMaxClamp_atIndex_.invokeExact(this.handle, SEL_setVertexSamplerState_lodMinClamp_lodMaxClamp_atIndex_, sampler == null ? 0L : sampler.handle(), lodMinClamp, lodMaxClamp, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setVertexSamplerStates:lodMinClamps:lodMaxClamps:withRange:]} */
    public void setVertexSamplerStates(final MemorySegment samplers, final MemorySegment lodMinClamps, final MemorySegment lodMaxClamps, final NSRange range) {
        try {
            MH_setVertexSamplerStates_lodMinClamps_lodMaxClamps_withRange_.invokeExact(this.handle, SEL_setVertexSamplerStates_lodMinClamps_lodMaxClamps_withRange_, samplers.address(), lodMinClamps.address(), lodMaxClamps.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setVertexVisibleFunctionTable:atBufferIndex:]} */
    public void setVertexVisibleFunctionTable(@Nullable final MTLVisibleFunctionTable functionTable, final long bufferIndex) {
        try {
            MH_setVertexVisibleFunctionTable_atBufferIndex_.invokeExact(this.handle, SEL_setVertexVisibleFunctionTable_atBufferIndex_, functionTable == null ? 0L : functionTable.handle(), bufferIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setVertexVisibleFunctionTables:withBufferRange:]} */
    public void setVertexVisibleFunctionTables(final MemorySegment functionTables, final NSRange range) {
        try {
            MH_setVertexVisibleFunctionTables_withBufferRange_.invokeExact(this.handle, SEL_setVertexVisibleFunctionTables_withBufferRange_, functionTables.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setVertexIntersectionFunctionTable:atBufferIndex:]} */
    public void setVertexIntersectionFunctionTable(@Nullable final MTLIntersectionFunctionTable intersectionFunctionTable, final long bufferIndex) {
        try {
            MH_setVertexIntersectionFunctionTable_atBufferIndex_.invokeExact(this.handle, SEL_setVertexIntersectionFunctionTable_atBufferIndex_, intersectionFunctionTable == null ? 0L : intersectionFunctionTable.handle(), bufferIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setVertexIntersectionFunctionTables:withBufferRange:]} */
    public void setVertexIntersectionFunctionTables(final MemorySegment intersectionFunctionTables, final NSRange range) {
        try {
            MH_setVertexIntersectionFunctionTables_withBufferRange_.invokeExact(this.handle, SEL_setVertexIntersectionFunctionTables_withBufferRange_, intersectionFunctionTables.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setVertexAccelerationStructure:atBufferIndex:]} */
    public void setVertexAccelerationStructure(@Nullable final MTLAccelerationStructure accelerationStructure, final long bufferIndex) {
        try {
            MH_setVertexAccelerationStructure_atBufferIndex_.invokeExact(this.handle, SEL_setVertexAccelerationStructure_atBufferIndex_, accelerationStructure == null ? 0L : accelerationStructure.handle(), bufferIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setViewport:]} */
    public void setViewport(final MTLViewport viewport) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setViewport_.invokeExact(this.handle, SEL_setViewport_, viewport.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setViewports:count:]} */
    public void setViewports(final MemorySegment viewports, final long count) {
        try {
            MH_setViewports_count_.invokeExact(this.handle, SEL_setViewports_count_, viewports.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setFrontFacingWinding:]} */
    public void setFrontFacingWinding(final MTLWinding frontFacingWinding) {
        try {
            MH_setFrontFacingWinding_.invokeExact(this.handle, SEL_setFrontFacingWinding_, frontFacingWinding.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setVertexAmplificationCount:viewMappings:]} */
    public void setVertexAmplificationCount(final long count, final MemorySegment viewMappings) {
        try {
            MH_setVertexAmplificationCount_viewMappings_.invokeExact(this.handle, SEL_setVertexAmplificationCount_viewMappings_, count, viewMappings.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setCullMode:]} */
    public void setCullMode(final MTLCullMode cullMode) {
        try {
            MH_setCullMode_.invokeExact(this.handle, SEL_setCullMode_, cullMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setDepthClipMode:]} */
    public void setDepthClipMode(final MTLDepthClipMode depthClipMode) {
        try {
            MH_setDepthClipMode_.invokeExact(this.handle, SEL_setDepthClipMode_, depthClipMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setDepthBias:slopeScale:clamp:]} */
    public void setDepthBias(final float depthBias, final float slopeScale, final float clamp) {
        try {
            MH_setDepthBias_slopeScale_clamp_.invokeExact(this.handle, SEL_setDepthBias_slopeScale_clamp_, depthBias, slopeScale, clamp);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setDepthTestMinBound:maxBound:]} */
    public void setDepthTestMinBound(final float minBound, final float maxBound) {
        try {
            MH_setDepthTestMinBound_maxBound_.invokeExact(this.handle, SEL_setDepthTestMinBound_maxBound_, minBound, maxBound);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setScissorRect:]} */
    public void setScissorRect(final MTLScissorRect rect) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setScissorRect_.invokeExact(this.handle, SEL_setScissorRect_, rect.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setScissorRects:count:]} */
    public void setScissorRects(final MemorySegment scissorRects, final long count) {
        try {
            MH_setScissorRects_count_.invokeExact(this.handle, SEL_setScissorRects_count_, scissorRects.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setTriangleFillMode:]} */
    public void setTriangleFillMode(final MTLTriangleFillMode fillMode) {
        try {
            MH_setTriangleFillMode_.invokeExact(this.handle, SEL_setTriangleFillMode_, fillMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setFragmentBytes:length:atIndex:]} */
    public void setFragmentBytes(final MemorySegment bytes, final long length, final long index) {
        try {
            MH_setFragmentBytes_length_atIndex_.invokeExact(this.handle, SEL_setFragmentBytes_length_atIndex_, bytes.address(), length, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setFragmentBuffer:offset:atIndex:]} */
    public void setFragmentBuffer(@Nullable final MTLBuffer buffer, final long offset, final long index) {
        try {
            MH_setFragmentBuffer_offset_atIndex_.invokeExact(this.handle, SEL_setFragmentBuffer_offset_atIndex_, buffer == null ? 0L : buffer.handle(), offset, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setFragmentBufferOffset:atIndex:]} */
    public void setFragmentBufferOffset(final long offset, final long index) {
        try {
            MH_setFragmentBufferOffset_atIndex_.invokeExact(this.handle, SEL_setFragmentBufferOffset_atIndex_, offset, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setFragmentBuffers:offsets:withRange:]} */
    public void setFragmentBuffers(final MemorySegment buffers, final MemorySegment offsets, final NSRange range) {
        try {
            MH_setFragmentBuffers_offsets_withRange_.invokeExact(this.handle, SEL_setFragmentBuffers_offsets_withRange_, buffers.address(), offsets.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setFragmentTexture:atIndex:]} */
    public void setFragmentTexture(@Nullable final MTLTexture texture, final long index) {
        try {
            MH_setFragmentTexture_atIndex_.invokeExact(this.handle, SEL_setFragmentTexture_atIndex_, texture == null ? 0L : texture.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setFragmentTextures:withRange:]} */
    public void setFragmentTextures(final MemorySegment textures, final NSRange range) {
        try {
            MH_setFragmentTextures_withRange_.invokeExact(this.handle, SEL_setFragmentTextures_withRange_, textures.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setFragmentSamplerState:atIndex:]} */
    public void setFragmentSamplerState(@Nullable final MTLSamplerState sampler, final long index) {
        try {
            MH_setFragmentSamplerState_atIndex_.invokeExact(this.handle, SEL_setFragmentSamplerState_atIndex_, sampler == null ? 0L : sampler.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setFragmentSamplerStates:withRange:]} */
    public void setFragmentSamplerStates(final MemorySegment samplers, final NSRange range) {
        try {
            MH_setFragmentSamplerStates_withRange_.invokeExact(this.handle, SEL_setFragmentSamplerStates_withRange_, samplers.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setFragmentSamplerState:lodMinClamp:lodMaxClamp:atIndex:]} */
    public void setFragmentSamplerState(@Nullable final MTLSamplerState sampler, final float lodMinClamp, final float lodMaxClamp, final long index) {
        try {
            MH_setFragmentSamplerState_lodMinClamp_lodMaxClamp_atIndex_.invokeExact(this.handle, SEL_setFragmentSamplerState_lodMinClamp_lodMaxClamp_atIndex_, sampler == null ? 0L : sampler.handle(), lodMinClamp, lodMaxClamp, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setFragmentSamplerStates:lodMinClamps:lodMaxClamps:withRange:]} */
    public void setFragmentSamplerStates(final MemorySegment samplers, final MemorySegment lodMinClamps, final MemorySegment lodMaxClamps, final NSRange range) {
        try {
            MH_setFragmentSamplerStates_lodMinClamps_lodMaxClamps_withRange_.invokeExact(this.handle, SEL_setFragmentSamplerStates_lodMinClamps_lodMaxClamps_withRange_, samplers.address(), lodMinClamps.address(), lodMaxClamps.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setFragmentVisibleFunctionTable:atBufferIndex:]} */
    public void setFragmentVisibleFunctionTable(@Nullable final MTLVisibleFunctionTable functionTable, final long bufferIndex) {
        try {
            MH_setFragmentVisibleFunctionTable_atBufferIndex_.invokeExact(this.handle, SEL_setFragmentVisibleFunctionTable_atBufferIndex_, functionTable == null ? 0L : functionTable.handle(), bufferIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setFragmentVisibleFunctionTables:withBufferRange:]} */
    public void setFragmentVisibleFunctionTables(final MemorySegment functionTables, final NSRange range) {
        try {
            MH_setFragmentVisibleFunctionTables_withBufferRange_.invokeExact(this.handle, SEL_setFragmentVisibleFunctionTables_withBufferRange_, functionTables.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setFragmentIntersectionFunctionTable:atBufferIndex:]} */
    public void setFragmentIntersectionFunctionTable(@Nullable final MTLIntersectionFunctionTable intersectionFunctionTable, final long bufferIndex) {
        try {
            MH_setFragmentIntersectionFunctionTable_atBufferIndex_.invokeExact(this.handle, SEL_setFragmentIntersectionFunctionTable_atBufferIndex_, intersectionFunctionTable == null ? 0L : intersectionFunctionTable.handle(), bufferIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setFragmentIntersectionFunctionTables:withBufferRange:]} */
    public void setFragmentIntersectionFunctionTables(final MemorySegment intersectionFunctionTables, final NSRange range) {
        try {
            MH_setFragmentIntersectionFunctionTables_withBufferRange_.invokeExact(this.handle, SEL_setFragmentIntersectionFunctionTables_withBufferRange_, intersectionFunctionTables.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setFragmentAccelerationStructure:atBufferIndex:]} */
    public void setFragmentAccelerationStructure(@Nullable final MTLAccelerationStructure accelerationStructure, final long bufferIndex) {
        try {
            MH_setFragmentAccelerationStructure_atBufferIndex_.invokeExact(this.handle, SEL_setFragmentAccelerationStructure_atBufferIndex_, accelerationStructure == null ? 0L : accelerationStructure.handle(), bufferIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setBlendColorRed:green:blue:alpha:]} */
    public void setBlendColorRed(final float red, final float green, final float blue, final float alpha) {
        try {
            MH_setBlendColorRed_green_blue_alpha_.invokeExact(this.handle, SEL_setBlendColorRed_green_blue_alpha_, red, green, blue, alpha);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setDepthStencilState:]} */
    public void setDepthStencilState(@Nullable final MTLDepthStencilState depthStencilState) {
        try {
            MH_setDepthStencilState_.invokeExact(this.handle, SEL_setDepthStencilState_, depthStencilState == null ? 0L : depthStencilState.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setStencilReferenceValue:]} */
    public void setStencilReferenceValue(final int referenceValue) {
        try {
            MH_setStencilReferenceValue_.invokeExact(this.handle, SEL_setStencilReferenceValue_, referenceValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setStencilFrontReferenceValue:backReferenceValue:]} */
    public void setStencilFrontReferenceValue(final int frontReferenceValue, final int backReferenceValue) {
        try {
            MH_setStencilFrontReferenceValue_backReferenceValue_.invokeExact(this.handle, SEL_setStencilFrontReferenceValue_backReferenceValue_, frontReferenceValue, backReferenceValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setVisibilityResultMode:offset:]} */
    public void setVisibilityResultMode(final MTLVisibilityResultMode mode, final long offset) {
        try {
            MH_setVisibilityResultMode_offset_.invokeExact(this.handle, SEL_setVisibilityResultMode_offset_, mode.value, offset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setColorStoreAction:atIndex:]} */
    public void setColorStoreAction(final MTLStoreAction storeAction, final long colorAttachmentIndex) {
        try {
            MH_setColorStoreAction_atIndex_.invokeExact(this.handle, SEL_setColorStoreAction_atIndex_, storeAction.value, colorAttachmentIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setDepthStoreAction:]} */
    public void setDepthStoreAction(final MTLStoreAction storeAction) {
        try {
            MH_setDepthStoreAction_.invokeExact(this.handle, SEL_setDepthStoreAction_, storeAction.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setStencilStoreAction:]} */
    public void setStencilStoreAction(final MTLStoreAction storeAction) {
        try {
            MH_setStencilStoreAction_.invokeExact(this.handle, SEL_setStencilStoreAction_, storeAction.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderCommandEncoder setColorStoreActionOptions:atIndex:]}
     *
     * @param storeActionOptions a combination of {@link MTLStoreActionOptions} flags
     */
    public void setColorStoreActionOptions(final long storeActionOptions, final long colorAttachmentIndex) {
        try {
            MH_setColorStoreActionOptions_atIndex_.invokeExact(this.handle, SEL_setColorStoreActionOptions_atIndex_, storeActionOptions, colorAttachmentIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderCommandEncoder setDepthStoreActionOptions:]}
     *
     * @param storeActionOptions a combination of {@link MTLStoreActionOptions} flags
     */
    public void setDepthStoreActionOptions(final long storeActionOptions) {
        try {
            MH_setDepthStoreActionOptions_.invokeExact(this.handle, SEL_setDepthStoreActionOptions_, storeActionOptions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderCommandEncoder setStencilStoreActionOptions:]}
     *
     * @param storeActionOptions a combination of {@link MTLStoreActionOptions} flags
     */
    public void setStencilStoreActionOptions(final long storeActionOptions) {
        try {
            MH_setStencilStoreActionOptions_.invokeExact(this.handle, SEL_setStencilStoreActionOptions_, storeActionOptions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setObjectBytes:length:atIndex:]} */
    public void setObjectBytes(final MemorySegment bytes, final long length, final long index) {
        try {
            MH_setObjectBytes_length_atIndex_.invokeExact(this.handle, SEL_setObjectBytes_length_atIndex_, bytes.address(), length, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setObjectBuffer:offset:atIndex:]} */
    public void setObjectBuffer(@Nullable final MTLBuffer buffer, final long offset, final long index) {
        try {
            MH_setObjectBuffer_offset_atIndex_.invokeExact(this.handle, SEL_setObjectBuffer_offset_atIndex_, buffer == null ? 0L : buffer.handle(), offset, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setObjectBufferOffset:atIndex:]} */
    public void setObjectBufferOffset(final long offset, final long index) {
        try {
            MH_setObjectBufferOffset_atIndex_.invokeExact(this.handle, SEL_setObjectBufferOffset_atIndex_, offset, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setObjectBuffers:offsets:withRange:]} */
    public void setObjectBuffers(final MemorySegment buffers, final MemorySegment offsets, final NSRange range) {
        try {
            MH_setObjectBuffers_offsets_withRange_.invokeExact(this.handle, SEL_setObjectBuffers_offsets_withRange_, buffers.address(), offsets.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setObjectTexture:atIndex:]} */
    public void setObjectTexture(@Nullable final MTLTexture texture, final long index) {
        try {
            MH_setObjectTexture_atIndex_.invokeExact(this.handle, SEL_setObjectTexture_atIndex_, texture == null ? 0L : texture.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setObjectTextures:withRange:]} */
    public void setObjectTextures(final MemorySegment textures, final NSRange range) {
        try {
            MH_setObjectTextures_withRange_.invokeExact(this.handle, SEL_setObjectTextures_withRange_, textures.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setObjectSamplerState:atIndex:]} */
    public void setObjectSamplerState(@Nullable final MTLSamplerState sampler, final long index) {
        try {
            MH_setObjectSamplerState_atIndex_.invokeExact(this.handle, SEL_setObjectSamplerState_atIndex_, sampler == null ? 0L : sampler.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setObjectSamplerStates:withRange:]} */
    public void setObjectSamplerStates(final MemorySegment samplers, final NSRange range) {
        try {
            MH_setObjectSamplerStates_withRange_.invokeExact(this.handle, SEL_setObjectSamplerStates_withRange_, samplers.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setObjectSamplerState:lodMinClamp:lodMaxClamp:atIndex:]} */
    public void setObjectSamplerState(@Nullable final MTLSamplerState sampler, final float lodMinClamp, final float lodMaxClamp, final long index) {
        try {
            MH_setObjectSamplerState_lodMinClamp_lodMaxClamp_atIndex_.invokeExact(this.handle, SEL_setObjectSamplerState_lodMinClamp_lodMaxClamp_atIndex_, sampler == null ? 0L : sampler.handle(), lodMinClamp, lodMaxClamp, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setObjectSamplerStates:lodMinClamps:lodMaxClamps:withRange:]} */
    public void setObjectSamplerStates(final MemorySegment samplers, final MemorySegment lodMinClamps, final MemorySegment lodMaxClamps, final NSRange range) {
        try {
            MH_setObjectSamplerStates_lodMinClamps_lodMaxClamps_withRange_.invokeExact(this.handle, SEL_setObjectSamplerStates_lodMinClamps_lodMaxClamps_withRange_, samplers.address(), lodMinClamps.address(), lodMaxClamps.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setObjectThreadgroupMemoryLength:atIndex:]} */
    public void setObjectThreadgroupMemoryLength(final long length, final long index) {
        try {
            MH_setObjectThreadgroupMemoryLength_atIndex_.invokeExact(this.handle, SEL_setObjectThreadgroupMemoryLength_atIndex_, length, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setMeshBytes:length:atIndex:]} */
    public void setMeshBytes(final MemorySegment bytes, final long length, final long index) {
        try {
            MH_setMeshBytes_length_atIndex_.invokeExact(this.handle, SEL_setMeshBytes_length_atIndex_, bytes.address(), length, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setMeshBuffer:offset:atIndex:]} */
    public void setMeshBuffer(@Nullable final MTLBuffer buffer, final long offset, final long index) {
        try {
            MH_setMeshBuffer_offset_atIndex_.invokeExact(this.handle, SEL_setMeshBuffer_offset_atIndex_, buffer == null ? 0L : buffer.handle(), offset, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setMeshBufferOffset:atIndex:]} */
    public void setMeshBufferOffset(final long offset, final long index) {
        try {
            MH_setMeshBufferOffset_atIndex_.invokeExact(this.handle, SEL_setMeshBufferOffset_atIndex_, offset, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setMeshBuffers:offsets:withRange:]} */
    public void setMeshBuffers(final MemorySegment buffers, final MemorySegment offsets, final NSRange range) {
        try {
            MH_setMeshBuffers_offsets_withRange_.invokeExact(this.handle, SEL_setMeshBuffers_offsets_withRange_, buffers.address(), offsets.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setMeshTexture:atIndex:]} */
    public void setMeshTexture(@Nullable final MTLTexture texture, final long index) {
        try {
            MH_setMeshTexture_atIndex_.invokeExact(this.handle, SEL_setMeshTexture_atIndex_, texture == null ? 0L : texture.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setMeshTextures:withRange:]} */
    public void setMeshTextures(final MemorySegment textures, final NSRange range) {
        try {
            MH_setMeshTextures_withRange_.invokeExact(this.handle, SEL_setMeshTextures_withRange_, textures.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setMeshSamplerState:atIndex:]} */
    public void setMeshSamplerState(@Nullable final MTLSamplerState sampler, final long index) {
        try {
            MH_setMeshSamplerState_atIndex_.invokeExact(this.handle, SEL_setMeshSamplerState_atIndex_, sampler == null ? 0L : sampler.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setMeshSamplerStates:withRange:]} */
    public void setMeshSamplerStates(final MemorySegment samplers, final NSRange range) {
        try {
            MH_setMeshSamplerStates_withRange_.invokeExact(this.handle, SEL_setMeshSamplerStates_withRange_, samplers.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setMeshSamplerState:lodMinClamp:lodMaxClamp:atIndex:]} */
    public void setMeshSamplerState(@Nullable final MTLSamplerState sampler, final float lodMinClamp, final float lodMaxClamp, final long index) {
        try {
            MH_setMeshSamplerState_lodMinClamp_lodMaxClamp_atIndex_.invokeExact(this.handle, SEL_setMeshSamplerState_lodMinClamp_lodMaxClamp_atIndex_, sampler == null ? 0L : sampler.handle(), lodMinClamp, lodMaxClamp, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setMeshSamplerStates:lodMinClamps:lodMaxClamps:withRange:]} */
    public void setMeshSamplerStates(final MemorySegment samplers, final MemorySegment lodMinClamps, final MemorySegment lodMaxClamps, final NSRange range) {
        try {
            MH_setMeshSamplerStates_lodMinClamps_lodMaxClamps_withRange_.invokeExact(this.handle, SEL_setMeshSamplerStates_lodMinClamps_lodMaxClamps_withRange_, samplers.address(), lodMinClamps.address(), lodMaxClamps.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder drawMeshThreadgroups:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:]} */
    public void drawMeshThreadgroups(final MTLSize threadgroupsPerGrid, final MTLSize threadsPerObjectThreadgroup, final MTLSize threadsPerMeshThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_drawMeshThreadgroups_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_.invokeExact(this.handle, SEL_drawMeshThreadgroups_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_, threadgroupsPerGrid.on(stack).address(), threadsPerObjectThreadgroup.on(stack).address(), threadsPerMeshThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder drawMeshThreads:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:]} */
    public void drawMeshThreads(final MTLSize threadsPerGrid, final MTLSize threadsPerObjectThreadgroup, final MTLSize threadsPerMeshThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_drawMeshThreads_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_.invokeExact(this.handle, SEL_drawMeshThreads_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_, threadsPerGrid.on(stack).address(), threadsPerObjectThreadgroup.on(stack).address(), threadsPerMeshThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder drawMeshThreadgroupsWithIndirectBuffer:indirectBufferOffset:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:]} */
    public void drawMeshThreadgroupsWithIndirectBuffer(final MTLBuffer indirectBuffer, final long indirectBufferOffset, final MTLSize threadsPerObjectThreadgroup, final MTLSize threadsPerMeshThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_drawMeshThreadgroupsWithIndirectBuffer_indirectBufferOffset_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_.invokeExact(this.handle, SEL_drawMeshThreadgroupsWithIndirectBuffer_indirectBufferOffset_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup_, indirectBuffer.handle(), indirectBufferOffset, threadsPerObjectThreadgroup.on(stack).address(), threadsPerMeshThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder drawPrimitives:vertexStart:vertexCount:instanceCount:]} */
    public void drawPrimitives(final MTLPrimitiveType primitiveType, final long vertexStart, final long vertexCount, final long instanceCount) {
        try {
            MH_drawPrimitives_vertexStart_vertexCount_instanceCount_.invokeExact(this.handle, SEL_drawPrimitives_vertexStart_vertexCount_instanceCount_, primitiveType.value, vertexStart, vertexCount, instanceCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder drawPrimitives:vertexStart:vertexCount:]} */
    public void drawPrimitives(final MTLPrimitiveType primitiveType, final long vertexStart, final long vertexCount) {
        try {
            MH_drawPrimitives_vertexStart_vertexCount_.invokeExact(this.handle, SEL_drawPrimitives_vertexStart_vertexCount_, primitiveType.value, vertexStart, vertexCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:]} */
    public void drawIndexedPrimitives(final MTLPrimitiveType primitiveType, final long indexCount, final MTLIndexType indexType, final MTLBuffer indexBuffer, final long indexBufferOffset, final long instanceCount) {
        try {
            MH_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferOffset_instanceCount_.invokeExact(this.handle, SEL_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferOffset_instanceCount_, primitiveType.value, indexCount, indexType.value, indexBuffer.handle(), indexBufferOffset, instanceCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:]} */
    public void drawIndexedPrimitives(final MTLPrimitiveType primitiveType, final long indexCount, final MTLIndexType indexType, final MTLBuffer indexBuffer, final long indexBufferOffset) {
        try {
            MH_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferOffset_.invokeExact(this.handle, SEL_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferOffset_, primitiveType.value, indexCount, indexType.value, indexBuffer.handle(), indexBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder drawPrimitives:vertexStart:vertexCount:instanceCount:baseInstance:]} */
    public void drawPrimitives(final MTLPrimitiveType primitiveType, final long vertexStart, final long vertexCount, final long instanceCount, final long baseInstance) {
        try {
            MH_drawPrimitives_vertexStart_vertexCount_instanceCount_baseInstance_.invokeExact(this.handle, SEL_drawPrimitives_vertexStart_vertexCount_instanceCount_baseInstance_, primitiveType.value, vertexStart, vertexCount, instanceCount, baseInstance);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:baseVertex:baseInstance:]} */
    public void drawIndexedPrimitives(final MTLPrimitiveType primitiveType, final long indexCount, final MTLIndexType indexType, final MTLBuffer indexBuffer, final long indexBufferOffset, final long instanceCount, final long baseVertex, final long baseInstance) {
        try {
            MH_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferOffset_instanceCount_baseVertex_baseInstance_.invokeExact(this.handle, SEL_drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferOffset_instanceCount_baseVertex_baseInstance_, primitiveType.value, indexCount, indexType.value, indexBuffer.handle(), indexBufferOffset, instanceCount, baseVertex, baseInstance);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder drawPrimitives:indirectBuffer:indirectBufferOffset:]} */
    public void drawPrimitives(final MTLPrimitiveType primitiveType, final MTLBuffer indirectBuffer, final long indirectBufferOffset) {
        try {
            MH_drawPrimitives_indirectBuffer_indirectBufferOffset_.invokeExact(this.handle, SEL_drawPrimitives_indirectBuffer_indirectBufferOffset_, primitiveType.value, indirectBuffer.handle(), indirectBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder drawIndexedPrimitives:indexType:indexBuffer:indexBufferOffset:indirectBuffer:indirectBufferOffset:]} */
    public void drawIndexedPrimitives(final MTLPrimitiveType primitiveType, final MTLIndexType indexType, final MTLBuffer indexBuffer, final long indexBufferOffset, final MTLBuffer indirectBuffer, final long indirectBufferOffset) {
        try {
            MH_drawIndexedPrimitives_indexType_indexBuffer_indexBufferOffset_indirectBuffer_indirectBufferOffset_.invokeExact(this.handle, SEL_drawIndexedPrimitives_indexType_indexBuffer_indexBufferOffset_indirectBuffer_indirectBufferOffset_, primitiveType.value, indexType.value, indexBuffer.handle(), indexBufferOffset, indirectBuffer.handle(), indirectBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder textureBarrier]} */
    public void textureBarrier() {
        try {
            MH_textureBarrier.invokeExact(this.handle, SEL_textureBarrier);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderCommandEncoder updateFence:afterStages:]}
     *
     * @param stages a combination of {@link MTLRenderStages} flags
     */
    public void updateFence(final MTLFence fence, final long stages) {
        try {
            MH_updateFence_afterStages_.invokeExact(this.handle, SEL_updateFence_afterStages_, fence.handle(), stages);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderCommandEncoder waitForFence:beforeStages:]}
     *
     * @param stages a combination of {@link MTLRenderStages} flags
     */
    public void waitForFence(final MTLFence fence, final long stages) {
        try {
            MH_waitForFence_beforeStages_.invokeExact(this.handle, SEL_waitForFence_beforeStages_, fence.handle(), stages);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setTessellationFactorBuffer:offset:instanceStride:]} */
    public void setTessellationFactorBuffer(@Nullable final MTLBuffer buffer, final long offset, final long instanceStride) {
        try {
            MH_setTessellationFactorBuffer_offset_instanceStride_.invokeExact(this.handle, SEL_setTessellationFactorBuffer_offset_instanceStride_, buffer == null ? 0L : buffer.handle(), offset, instanceStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setTessellationFactorScale:]} */
    public void setTessellationFactorScale(final float scale) {
        try {
            MH_setTessellationFactorScale_.invokeExact(this.handle, SEL_setTessellationFactorScale_, scale);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder drawPatches:patchStart:patchCount:patchIndexBuffer:patchIndexBufferOffset:instanceCount:baseInstance:]} */
    public void drawPatches(final long numberOfPatchControlPoints, final long patchStart, final long patchCount, @Nullable final MTLBuffer patchIndexBuffer, final long patchIndexBufferOffset, final long instanceCount, final long baseInstance) {
        try {
            MH_drawPatches_patchStart_patchCount_patchIndexBuffer_patchIndexBufferOffset_instanceCount_baseInstance_.invokeExact(this.handle, SEL_drawPatches_patchStart_patchCount_patchIndexBuffer_patchIndexBufferOffset_instanceCount_baseInstance_, numberOfPatchControlPoints, patchStart, patchCount, patchIndexBuffer == null ? 0L : patchIndexBuffer.handle(), patchIndexBufferOffset, instanceCount, baseInstance);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder drawPatches:patchIndexBuffer:patchIndexBufferOffset:indirectBuffer:indirectBufferOffset:]} */
    public void drawPatches(final long numberOfPatchControlPoints, @Nullable final MTLBuffer patchIndexBuffer, final long patchIndexBufferOffset, final MTLBuffer indirectBuffer, final long indirectBufferOffset) {
        try {
            MH_drawPatches_patchIndexBuffer_patchIndexBufferOffset_indirectBuffer_indirectBufferOffset_.invokeExact(this.handle, SEL_drawPatches_patchIndexBuffer_patchIndexBufferOffset_indirectBuffer_indirectBufferOffset_, numberOfPatchControlPoints, patchIndexBuffer == null ? 0L : patchIndexBuffer.handle(), patchIndexBufferOffset, indirectBuffer.handle(), indirectBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder drawIndexedPatches:patchStart:patchCount:patchIndexBuffer:patchIndexBufferOffset:controlPointIndexBuffer:controlPointIndexBufferOffset:instanceCount:baseInstance:]} */
    public void drawIndexedPatches(final long numberOfPatchControlPoints, final long patchStart, final long patchCount, @Nullable final MTLBuffer patchIndexBuffer, final long patchIndexBufferOffset, final MTLBuffer controlPointIndexBuffer, final long controlPointIndexBufferOffset, final long instanceCount, final long baseInstance) {
        try {
            MH_drawIndexedPatches_patchStart_patchCount_patchIndexBuffer_patchIndexBufferOffset_controlPointIndexBuffer_controlPointIndexBufferOffset_instanceCount_baseInstance_.invokeExact(this.handle, SEL_drawIndexedPatches_patchStart_patchCount_patchIndexBuffer_patchIndexBufferOffset_controlPointIndexBuffer_controlPointIndexBufferOffset_instanceCount_baseInstance_, numberOfPatchControlPoints, patchStart, patchCount, patchIndexBuffer == null ? 0L : patchIndexBuffer.handle(), patchIndexBufferOffset, controlPointIndexBuffer.handle(), controlPointIndexBufferOffset, instanceCount, baseInstance);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder drawIndexedPatches:patchIndexBuffer:patchIndexBufferOffset:controlPointIndexBuffer:controlPointIndexBufferOffset:indirectBuffer:indirectBufferOffset:]} */
    public void drawIndexedPatches(final long numberOfPatchControlPoints, @Nullable final MTLBuffer patchIndexBuffer, final long patchIndexBufferOffset, final MTLBuffer controlPointIndexBuffer, final long controlPointIndexBufferOffset, final MTLBuffer indirectBuffer, final long indirectBufferOffset) {
        try {
            MH_drawIndexedPatches_patchIndexBuffer_patchIndexBufferOffset_controlPointIndexBuffer_controlPointIndexBufferOffset_indirectBuffer_indirectBufferOffset_.invokeExact(this.handle, SEL_drawIndexedPatches_patchIndexBuffer_patchIndexBufferOffset_controlPointIndexBuffer_controlPointIndexBufferOffset_indirectBuffer_indirectBufferOffset_, numberOfPatchControlPoints, patchIndexBuffer == null ? 0L : patchIndexBuffer.handle(), patchIndexBufferOffset, controlPointIndexBuffer.handle(), controlPointIndexBufferOffset, indirectBuffer.handle(), indirectBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setTileBytes:length:atIndex:]} */
    public void setTileBytes(final MemorySegment bytes, final long length, final long index) {
        try {
            MH_setTileBytes_length_atIndex_.invokeExact(this.handle, SEL_setTileBytes_length_atIndex_, bytes.address(), length, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setTileBuffer:offset:atIndex:]} */
    public void setTileBuffer(@Nullable final MTLBuffer buffer, final long offset, final long index) {
        try {
            MH_setTileBuffer_offset_atIndex_.invokeExact(this.handle, SEL_setTileBuffer_offset_atIndex_, buffer == null ? 0L : buffer.handle(), offset, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setTileBufferOffset:atIndex:]} */
    public void setTileBufferOffset(final long offset, final long index) {
        try {
            MH_setTileBufferOffset_atIndex_.invokeExact(this.handle, SEL_setTileBufferOffset_atIndex_, offset, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setTileBuffers:offsets:withRange:]} */
    public void setTileBuffers(final MemorySegment buffers, final MemorySegment offsets, final NSRange range) {
        try {
            MH_setTileBuffers_offsets_withRange_.invokeExact(this.handle, SEL_setTileBuffers_offsets_withRange_, buffers.address(), offsets.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setTileTexture:atIndex:]} */
    public void setTileTexture(@Nullable final MTLTexture texture, final long index) {
        try {
            MH_setTileTexture_atIndex_.invokeExact(this.handle, SEL_setTileTexture_atIndex_, texture == null ? 0L : texture.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setTileTextures:withRange:]} */
    public void setTileTextures(final MemorySegment textures, final NSRange range) {
        try {
            MH_setTileTextures_withRange_.invokeExact(this.handle, SEL_setTileTextures_withRange_, textures.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setTileSamplerState:atIndex:]} */
    public void setTileSamplerState(@Nullable final MTLSamplerState sampler, final long index) {
        try {
            MH_setTileSamplerState_atIndex_.invokeExact(this.handle, SEL_setTileSamplerState_atIndex_, sampler == null ? 0L : sampler.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setTileSamplerStates:withRange:]} */
    public void setTileSamplerStates(final MemorySegment samplers, final NSRange range) {
        try {
            MH_setTileSamplerStates_withRange_.invokeExact(this.handle, SEL_setTileSamplerStates_withRange_, samplers.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setTileSamplerState:lodMinClamp:lodMaxClamp:atIndex:]} */
    public void setTileSamplerState(@Nullable final MTLSamplerState sampler, final float lodMinClamp, final float lodMaxClamp, final long index) {
        try {
            MH_setTileSamplerState_lodMinClamp_lodMaxClamp_atIndex_.invokeExact(this.handle, SEL_setTileSamplerState_lodMinClamp_lodMaxClamp_atIndex_, sampler == null ? 0L : sampler.handle(), lodMinClamp, lodMaxClamp, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setTileSamplerStates:lodMinClamps:lodMaxClamps:withRange:]} */
    public void setTileSamplerStates(final MemorySegment samplers, final MemorySegment lodMinClamps, final MemorySegment lodMaxClamps, final NSRange range) {
        try {
            MH_setTileSamplerStates_lodMinClamps_lodMaxClamps_withRange_.invokeExact(this.handle, SEL_setTileSamplerStates_lodMinClamps_lodMaxClamps_withRange_, samplers.address(), lodMinClamps.address(), lodMaxClamps.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setTileVisibleFunctionTable:atBufferIndex:]} */
    public void setTileVisibleFunctionTable(@Nullable final MTLVisibleFunctionTable functionTable, final long bufferIndex) {
        try {
            MH_setTileVisibleFunctionTable_atBufferIndex_.invokeExact(this.handle, SEL_setTileVisibleFunctionTable_atBufferIndex_, functionTable == null ? 0L : functionTable.handle(), bufferIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setTileVisibleFunctionTables:withBufferRange:]} */
    public void setTileVisibleFunctionTables(final MemorySegment functionTables, final NSRange range) {
        try {
            MH_setTileVisibleFunctionTables_withBufferRange_.invokeExact(this.handle, SEL_setTileVisibleFunctionTables_withBufferRange_, functionTables.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setTileIntersectionFunctionTable:atBufferIndex:]} */
    public void setTileIntersectionFunctionTable(@Nullable final MTLIntersectionFunctionTable intersectionFunctionTable, final long bufferIndex) {
        try {
            MH_setTileIntersectionFunctionTable_atBufferIndex_.invokeExact(this.handle, SEL_setTileIntersectionFunctionTable_atBufferIndex_, intersectionFunctionTable == null ? 0L : intersectionFunctionTable.handle(), bufferIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setTileIntersectionFunctionTables:withBufferRange:]} */
    public void setTileIntersectionFunctionTables(final MemorySegment intersectionFunctionTables, final NSRange range) {
        try {
            MH_setTileIntersectionFunctionTables_withBufferRange_.invokeExact(this.handle, SEL_setTileIntersectionFunctionTables_withBufferRange_, intersectionFunctionTables.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setTileAccelerationStructure:atBufferIndex:]} */
    public void setTileAccelerationStructure(@Nullable final MTLAccelerationStructure accelerationStructure, final long bufferIndex) {
        try {
            MH_setTileAccelerationStructure_atBufferIndex_.invokeExact(this.handle, SEL_setTileAccelerationStructure_atBufferIndex_, accelerationStructure == null ? 0L : accelerationStructure.handle(), bufferIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder dispatchThreadsPerTile:]} */
    public void dispatchThreadsPerTile(final MTLSize threadsPerTile) {
        try (NativeStack stack = NativeStack.push()) {
            MH_dispatchThreadsPerTile_.invokeExact(this.handle, SEL_dispatchThreadsPerTile_, threadsPerTile.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setThreadgroupMemoryLength:offset:atIndex:]} */
    public void setThreadgroupMemoryLength(final long length, final long offset, final long index) {
        try {
            MH_setThreadgroupMemoryLength_offset_atIndex_.invokeExact(this.handle, SEL_setThreadgroupMemoryLength_offset_atIndex_, length, offset, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderCommandEncoder useResource:usage:]}
     *
     * @param usage a combination of {@link MTLResourceUsage} flags
     */
    public void useResource(final MTLResource resource, final long usage) {
        try {
            MH_useResource_usage_.invokeExact(this.handle, SEL_useResource_usage_, resource.handle(), usage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderCommandEncoder useResources:count:usage:]}
     *
     * @param usage a combination of {@link MTLResourceUsage} flags
     */
    public void useResources(final MemorySegment resources, final long count, final long usage) {
        try {
            MH_useResources_count_usage_.invokeExact(this.handle, SEL_useResources_count_usage_, resources.address(), count, usage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderCommandEncoder useResource:usage:stages:]}
     *
     * @param usage a combination of {@link MTLResourceUsage} flags
     * @param stages a combination of {@link MTLRenderStages} flags
     */
    public void useResource(final MTLResource resource, final long usage, final long stages) {
        try {
            MH_useResource_usage_stages_.invokeExact(this.handle, SEL_useResource_usage_stages_, resource.handle(), usage, stages);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderCommandEncoder useResources:count:usage:stages:]}
     *
     * @param usage a combination of {@link MTLResourceUsage} flags
     * @param stages a combination of {@link MTLRenderStages} flags
     */
    public void useResources(final MemorySegment resources, final long count, final long usage, final long stages) {
        try {
            MH_useResources_count_usage_stages_.invokeExact(this.handle, SEL_useResources_count_usage_stages_, resources.address(), count, usage, stages);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder useHeap:]} */
    public void useHeap(final MTLHeap heap) {
        try {
            MH_useHeap_.invokeExact(this.handle, SEL_useHeap_, heap.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder useHeaps:count:]} */
    public void useHeaps(final MemorySegment heaps, final long count) {
        try {
            MH_useHeaps_count_.invokeExact(this.handle, SEL_useHeaps_count_, heaps.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderCommandEncoder useHeap:stages:]}
     *
     * @param stages a combination of {@link MTLRenderStages} flags
     */
    public void useHeap(final MTLHeap heap, final long stages) {
        try {
            MH_useHeap_stages_.invokeExact(this.handle, SEL_useHeap_stages_, heap.handle(), stages);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderCommandEncoder useHeaps:count:stages:]}
     *
     * @param stages a combination of {@link MTLRenderStages} flags
     */
    public void useHeaps(final MemorySegment heaps, final long count, final long stages) {
        try {
            MH_useHeaps_count_stages_.invokeExact(this.handle, SEL_useHeaps_count_stages_, heaps.address(), count, stages);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder executeCommandsInBuffer:withRange:]} */
    public void executeCommandsInBuffer(final MTLIndirectCommandBuffer indirectCommandBuffer, final NSRange executionRange) {
        try {
            MH_executeCommandsInBuffer_withRange_.invokeExact(this.handle, SEL_executeCommandsInBuffer_withRange_, indirectCommandBuffer.handle(), executionRange.location(), executionRange.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder executeCommandsInBuffer:indirectBuffer:indirectBufferOffset:]} */
    public void executeCommandsInBuffer(final MTLIndirectCommandBuffer indirectCommandbuffer, final MTLBuffer indirectRangeBuffer, final long indirectBufferOffset) {
        try {
            MH_executeCommandsInBuffer_indirectBuffer_indirectBufferOffset_.invokeExact(this.handle, SEL_executeCommandsInBuffer_indirectBuffer_indirectBufferOffset_, indirectCommandbuffer.handle(), indirectRangeBuffer.handle(), indirectBufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderCommandEncoder memoryBarrierWithScope:afterStages:beforeStages:]}
     *
     * @param scope a combination of {@link MTLBarrierScope} flags
     * @param after a combination of {@link MTLRenderStages} flags
     * @param before a combination of {@link MTLRenderStages} flags
     */
    public void memoryBarrierWithScope(final long scope, final long after, final long before) {
        try {
            MH_memoryBarrierWithScope_afterStages_beforeStages_.invokeExact(this.handle, SEL_memoryBarrierWithScope_afterStages_beforeStages_, scope, after, before);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderCommandEncoder memoryBarrierWithResources:count:afterStages:beforeStages:]}
     *
     * @param after a combination of {@link MTLRenderStages} flags
     * @param before a combination of {@link MTLRenderStages} flags
     */
    public void memoryBarrierWithResources(final MemorySegment resources, final long count, final long after, final long before) {
        try {
            MH_memoryBarrierWithResources_count_afterStages_beforeStages_.invokeExact(this.handle, SEL_memoryBarrierWithResources_count_afterStages_beforeStages_, resources.address(), count, after, before);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder sampleCountersInBuffer:atSampleIndex:withBarrier:]} */
    public void sampleCountersInBuffer(final MTLCounterSampleBuffer sampleBuffer, final long sampleIndex, final boolean barrier) {
        try {
            MH_sampleCountersInBuffer_atSampleIndex_withBarrier_.invokeExact(this.handle, SEL_sampleCountersInBuffer_atSampleIndex_withBarrier_, sampleBuffer.handle(), sampleIndex, barrier);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder setColorAttachmentMap:]} */
    public void setColorAttachmentMap(@Nullable final MTLLogicalToPhysicalColorAttachmentMap mapping) {
        try {
            MH_setColorAttachmentMap_.invokeExact(this.handle, SEL_setColorAttachmentMap_, mapping == null ? 0L : mapping.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder tileWidth]} */
    public long tileWidth() {
        try {
            return (long) MH_tileWidth.invokeExact(this.handle, SEL_tileWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderCommandEncoder tileHeight]} */
    public long tileHeight() {
        try {
            return (long) MH_tileHeight.invokeExact(this.handle, SEL_tileHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
