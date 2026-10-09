package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSBundle;
import io.github.kokodio.metaljvm.foundation.NSErrorException;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.foundation.NSURL;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLDevice}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtldevice">Apple documentation</a>
 */
public class MTLDevice extends NSObject {
    private static final long SEL_newLogStateWithDescriptor_error_ = ObjC.selector("newLogStateWithDescriptor:error:");
    private static final MethodHandle MH_newLogStateWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newCommandQueue = ObjC.selector("newCommandQueue");
    private static final MethodHandle MH_newCommandQueue = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newCommandQueueWithMaxCommandBufferCount_ = ObjC.selector("newCommandQueueWithMaxCommandBufferCount:");
    private static final MethodHandle MH_newCommandQueueWithMaxCommandBufferCount_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newCommandQueueWithDescriptor_ = ObjC.selector("newCommandQueueWithDescriptor:");
    private static final MethodHandle MH_newCommandQueueWithDescriptor_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_heapTextureSizeAndAlignWithDescriptor_ = ObjC.selector("heapTextureSizeAndAlignWithDescriptor:");
    private static final MethodHandle MH_heapTextureSizeAndAlignWithDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSizeAndAlign.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_heapBufferSizeAndAlignWithLength_options_ = ObjC.selector("heapBufferSizeAndAlignWithLength:options:");
    private static final MethodHandle MH_heapBufferSizeAndAlignWithLength_options_ = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSizeAndAlign.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newHeapWithDescriptor_ = ObjC.selector("newHeapWithDescriptor:");
    private static final MethodHandle MH_newHeapWithDescriptor_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newBufferWithLength_options_ = ObjC.selector("newBufferWithLength:options:");
    private static final MethodHandle MH_newBufferWithLength_options_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newBufferWithBytes_length_options_ = ObjC.selector("newBufferWithBytes:length:options:");
    private static final MethodHandle MH_newBufferWithBytes_length_options_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newBufferWithBytesNoCopy_length_options_deallocator_ = ObjC.selector("newBufferWithBytesNoCopy:length:options:deallocator:");
    private static final MethodHandle MH_newBufferWithBytesNoCopy_length_options_deallocator_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newDepthStencilStateWithDescriptor_ = ObjC.selector("newDepthStencilStateWithDescriptor:");
    private static final MethodHandle MH_newDepthStencilStateWithDescriptor_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newTextureWithDescriptor_ = ObjC.selector("newTextureWithDescriptor:");
    private static final MethodHandle MH_newTextureWithDescriptor_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newTextureWithDescriptor_iosurface_plane_ = ObjC.selector("newTextureWithDescriptor:iosurface:plane:");
    private static final MethodHandle MH_newTextureWithDescriptor_iosurface_plane_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newSharedTextureWithDescriptor_ = ObjC.selector("newSharedTextureWithDescriptor:");
    private static final MethodHandle MH_newSharedTextureWithDescriptor_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newSharedTextureWithHandle_ = ObjC.selector("newSharedTextureWithHandle:");
    private static final MethodHandle MH_newSharedTextureWithHandle_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newSamplerStateWithDescriptor_ = ObjC.selector("newSamplerStateWithDescriptor:");
    private static final MethodHandle MH_newSamplerStateWithDescriptor_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newDefaultLibrary = ObjC.selector("newDefaultLibrary");
    private static final MethodHandle MH_newDefaultLibrary = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newDefaultLibraryWithBundle_error_ = ObjC.selector("newDefaultLibraryWithBundle:error:");
    private static final MethodHandle MH_newDefaultLibraryWithBundle_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newLibraryWithFile_error_ = ObjC.selector("newLibraryWithFile:error:");
    private static final MethodHandle MH_newLibraryWithFile_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newLibraryWithURL_error_ = ObjC.selector("newLibraryWithURL:error:");
    private static final MethodHandle MH_newLibraryWithURL_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newLibraryWithData_error_ = ObjC.selector("newLibraryWithData:error:");
    private static final MethodHandle MH_newLibraryWithData_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newLibraryWithSource_options_error_ = ObjC.selector("newLibraryWithSource:options:error:");
    private static final MethodHandle MH_newLibraryWithSource_options_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newLibraryWithSource_options_completionHandler_ = ObjC.selector("newLibraryWithSource:options:completionHandler:");
    private static final MethodHandle MH_newLibraryWithSource_options_completionHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newLibraryWithStitchedDescriptor_error_ = ObjC.selector("newLibraryWithStitchedDescriptor:error:");
    private static final MethodHandle MH_newLibraryWithStitchedDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newLibraryWithStitchedDescriptor_completionHandler_ = ObjC.selector("newLibraryWithStitchedDescriptor:completionHandler:");
    private static final MethodHandle MH_newLibraryWithStitchedDescriptor_completionHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRenderPipelineStateWithDescriptor_error_ = ObjC.selector("newRenderPipelineStateWithDescriptor:error:");
    private static final MethodHandle MH_newRenderPipelineStateWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRenderPipelineStateWithDescriptor_options_reflection_error_ = ObjC.selector("newRenderPipelineStateWithDescriptor:options:reflection:error:");
    private static final MethodHandle MH_newRenderPipelineStateWithDescriptor_options_reflection_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRenderPipelineStateWithDescriptor_completionHandler_ = ObjC.selector("newRenderPipelineStateWithDescriptor:completionHandler:");
    private static final MethodHandle MH_newRenderPipelineStateWithDescriptor_completionHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRenderPipelineStateWithDescriptor_options_completionHandler_ = ObjC.selector("newRenderPipelineStateWithDescriptor:options:completionHandler:");
    private static final MethodHandle MH_newRenderPipelineStateWithDescriptor_options_completionHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newComputePipelineStateWithFunction_error_ = ObjC.selector("newComputePipelineStateWithFunction:error:");
    private static final MethodHandle MH_newComputePipelineStateWithFunction_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newComputePipelineStateWithFunction_options_reflection_error_ = ObjC.selector("newComputePipelineStateWithFunction:options:reflection:error:");
    private static final MethodHandle MH_newComputePipelineStateWithFunction_options_reflection_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newComputePipelineStateWithFunction_completionHandler_ = ObjC.selector("newComputePipelineStateWithFunction:completionHandler:");
    private static final MethodHandle MH_newComputePipelineStateWithFunction_completionHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newComputePipelineStateWithFunction_options_completionHandler_ = ObjC.selector("newComputePipelineStateWithFunction:options:completionHandler:");
    private static final MethodHandle MH_newComputePipelineStateWithFunction_options_completionHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newComputePipelineStateWithDescriptor_options_reflection_error_ = ObjC.selector("newComputePipelineStateWithDescriptor:options:reflection:error:");
    private static final MethodHandle MH_newComputePipelineStateWithDescriptor_options_reflection_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newComputePipelineStateWithDescriptor_options_completionHandler_ = ObjC.selector("newComputePipelineStateWithDescriptor:options:completionHandler:");
    private static final MethodHandle MH_newComputePipelineStateWithDescriptor_options_completionHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newFence = ObjC.selector("newFence");
    private static final MethodHandle MH_newFence = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportsFeatureSet_ = ObjC.selector("supportsFeatureSet:");
    private static final MethodHandle MH_supportsFeatureSet_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportsFamily_ = ObjC.selector("supportsFamily:");
    private static final MethodHandle MH_supportsFamily_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportsTextureSampleCount_ = ObjC.selector("supportsTextureSampleCount:");
    private static final MethodHandle MH_supportsTextureSampleCount_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_minimumLinearTextureAlignmentForPixelFormat_ = ObjC.selector("minimumLinearTextureAlignmentForPixelFormat:");
    private static final MethodHandle MH_minimumLinearTextureAlignmentForPixelFormat_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_minimumTextureBufferAlignmentForPixelFormat_ = ObjC.selector("minimumTextureBufferAlignmentForPixelFormat:");
    private static final MethodHandle MH_minimumTextureBufferAlignmentForPixelFormat_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRenderPipelineStateWithTileDescriptor_options_reflection_error_ = ObjC.selector("newRenderPipelineStateWithTileDescriptor:options:reflection:error:");
    private static final MethodHandle MH_newRenderPipelineStateWithTileDescriptor_options_reflection_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRenderPipelineStateWithTileDescriptor_options_completionHandler_ = ObjC.selector("newRenderPipelineStateWithTileDescriptor:options:completionHandler:");
    private static final MethodHandle MH_newRenderPipelineStateWithTileDescriptor_options_completionHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRenderPipelineStateWithMeshDescriptor_options_reflection_error_ = ObjC.selector("newRenderPipelineStateWithMeshDescriptor:options:reflection:error:");
    private static final MethodHandle MH_newRenderPipelineStateWithMeshDescriptor_options_reflection_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRenderPipelineStateWithMeshDescriptor_options_completionHandler_ = ObjC.selector("newRenderPipelineStateWithMeshDescriptor:options:completionHandler:");
    private static final MethodHandle MH_newRenderPipelineStateWithMeshDescriptor_options_completionHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getDefaultSamplePositions_count_ = ObjC.selector("getDefaultSamplePositions:count:");
    private static final MethodHandle MH_getDefaultSamplePositions_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newArgumentEncoderWithArguments_ = ObjC.selector("newArgumentEncoderWithArguments:");
    private static final MethodHandle MH_newArgumentEncoderWithArguments_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportsRasterizationRateMapWithLayerCount_ = ObjC.selector("supportsRasterizationRateMapWithLayerCount:");
    private static final MethodHandle MH_supportsRasterizationRateMapWithLayerCount_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRasterizationRateMapWithDescriptor_ = ObjC.selector("newRasterizationRateMapWithDescriptor:");
    private static final MethodHandle MH_newRasterizationRateMapWithDescriptor_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newIndirectCommandBufferWithDescriptor_maxCommandCount_options_ = ObjC.selector("newIndirectCommandBufferWithDescriptor:maxCommandCount:options:");
    private static final MethodHandle MH_newIndirectCommandBufferWithDescriptor_maxCommandCount_options_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newEvent = ObjC.selector("newEvent");
    private static final MethodHandle MH_newEvent = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newSharedEvent = ObjC.selector("newSharedEvent");
    private static final MethodHandle MH_newSharedEvent = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newSharedEventWithHandle_ = ObjC.selector("newSharedEventWithHandle:");
    private static final MethodHandle MH_newSharedEventWithHandle_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newIOHandleWithURL_error_ = ObjC.selector("newIOHandleWithURL:error:");
    private static final MethodHandle MH_newIOHandleWithURL_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newIOCommandQueueWithDescriptor_error_ = ObjC.selector("newIOCommandQueueWithDescriptor:error:");
    private static final MethodHandle MH_newIOCommandQueueWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newIOHandleWithURL_compressionMethod_error_ = ObjC.selector("newIOHandleWithURL:compressionMethod:error:");
    private static final MethodHandle MH_newIOHandleWithURL_compressionMethod_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newIOFileHandleWithURL_error_ = ObjC.selector("newIOFileHandleWithURL:error:");
    private static final MethodHandle MH_newIOFileHandleWithURL_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newIOFileHandleWithURL_compressionMethod_error_ = ObjC.selector("newIOFileHandleWithURL:compressionMethod:error:");
    private static final MethodHandle MH_newIOFileHandleWithURL_compressionMethod_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sparseTileSizeWithTextureType_pixelFormat_sampleCount_ = ObjC.selector("sparseTileSizeWithTextureType:pixelFormat:sampleCount:");
    private static final MethodHandle MH_sparseTileSizeWithTextureType_pixelFormat_sampleCount_ = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSize.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_convertSparsePixelRegions_toTileRegions_withTileSize_alignmentMode_numRegions_ = ObjC.selector("convertSparsePixelRegions:toTileRegions:withTileSize:alignmentMode:numRegions:");
    private static final MethodHandle MH_convertSparsePixelRegions_toTileRegions_withTileSize_alignmentMode_numRegions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_convertSparseTileRegions_toPixelRegions_withTileSize_numRegions_ = ObjC.selector("convertSparseTileRegions:toPixelRegions:withTileSize:numRegions:");
    private static final MethodHandle MH_convertSparseTileRegions_toPixelRegions_withTileSize_numRegions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sparseTileSizeInBytesForSparsePageSize_ = ObjC.selector("sparseTileSizeInBytesForSparsePageSize:");
    private static final MethodHandle MH_sparseTileSizeInBytesForSparsePageSize_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sparseTileSizeWithTextureType_pixelFormat_sampleCount_sparsePageSize_ = ObjC.selector("sparseTileSizeWithTextureType:pixelFormat:sampleCount:sparsePageSize:");
    private static final MethodHandle MH_sparseTileSizeWithTextureType_pixelFormat_sampleCount_sparsePageSize_ = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSize.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newCounterSampleBufferWithDescriptor_error_ = ObjC.selector("newCounterSampleBufferWithDescriptor:error:");
    private static final MethodHandle MH_newCounterSampleBufferWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sampleTimestamps_gpuTimestamp_ = ObjC.selector("sampleTimestamps:gpuTimestamp:");
    private static final MethodHandle MH_sampleTimestamps_gpuTimestamp_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newArgumentEncoderWithBufferBinding_ = ObjC.selector("newArgumentEncoderWithBufferBinding:");
    private static final MethodHandle MH_newArgumentEncoderWithBufferBinding_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportsCounterSampling_ = ObjC.selector("supportsCounterSampling:");
    private static final MethodHandle MH_supportsCounterSampling_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportsVertexAmplificationCount_ = ObjC.selector("supportsVertexAmplificationCount:");
    private static final MethodHandle MH_supportsVertexAmplificationCount_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newDynamicLibrary_error_ = ObjC.selector("newDynamicLibrary:error:");
    private static final MethodHandle MH_newDynamicLibrary_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newDynamicLibraryWithURL_error_ = ObjC.selector("newDynamicLibraryWithURL:error:");
    private static final MethodHandle MH_newDynamicLibraryWithURL_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newBinaryArchiveWithDescriptor_error_ = ObjC.selector("newBinaryArchiveWithDescriptor:error:");
    private static final MethodHandle MH_newBinaryArchiveWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_accelerationStructureSizesWithDescriptor_ = ObjC.selector("accelerationStructureSizesWithDescriptor:");
    private static final MethodHandle MH_accelerationStructureSizesWithDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.of(MTLAccelerationStructureSizes.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newAccelerationStructureWithSize_ = ObjC.selector("newAccelerationStructureWithSize:");
    private static final MethodHandle MH_newAccelerationStructureWithSize_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newAccelerationStructureWithDescriptor_ = ObjC.selector("newAccelerationStructureWithDescriptor:");
    private static final MethodHandle MH_newAccelerationStructureWithDescriptor_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_heapAccelerationStructureSizeAndAlignWithSize_ = ObjC.selector("heapAccelerationStructureSizeAndAlignWithSize:");
    private static final MethodHandle MH_heapAccelerationStructureSizeAndAlignWithSize_ = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSizeAndAlign.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_heapAccelerationStructureSizeAndAlignWithDescriptor_ = ObjC.selector("heapAccelerationStructureSizeAndAlignWithDescriptor:");
    private static final MethodHandle MH_heapAccelerationStructureSizeAndAlignWithDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSizeAndAlign.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newResidencySetWithDescriptor_error_ = ObjC.selector("newResidencySetWithDescriptor:error:");
    private static final MethodHandle MH_newResidencySetWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tensorSizeAndAlignWithDescriptor_ = ObjC.selector("tensorSizeAndAlignWithDescriptor:");
    private static final MethodHandle MH_tensorSizeAndAlignWithDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSizeAndAlign.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newTensorWithDescriptor_error_ = ObjC.selector("newTensorWithDescriptor:error:");
    private static final MethodHandle MH_newTensorWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newTensorWithDescriptor_attachments_error_ = ObjC.selector("newTensorWithDescriptor:attachments:error:");
    private static final MethodHandle MH_newTensorWithDescriptor_attachments_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_functionHandleWithFunction_ = ObjC.selector("functionHandleWithFunction:");
    private static final MethodHandle MH_functionHandleWithFunction_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newCommandAllocator = ObjC.selector("newCommandAllocator");
    private static final MethodHandle MH_newCommandAllocator = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newCommandAllocatorWithDescriptor_error_ = ObjC.selector("newCommandAllocatorWithDescriptor:error:");
    private static final MethodHandle MH_newCommandAllocatorWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newMTL4CommandQueue = ObjC.selector("newMTL4CommandQueue");
    private static final MethodHandle MH_newMTL4CommandQueue = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newMTL4CommandQueueWithDescriptor_error_ = ObjC.selector("newMTL4CommandQueueWithDescriptor:error:");
    private static final MethodHandle MH_newMTL4CommandQueueWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newCommandBuffer = ObjC.selector("newCommandBuffer");
    private static final MethodHandle MH_newCommandBuffer = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newArgumentTableWithDescriptor_error_ = ObjC.selector("newArgumentTableWithDescriptor:error:");
    private static final MethodHandle MH_newArgumentTableWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newTextureViewPoolWithDescriptor_error_ = ObjC.selector("newTextureViewPoolWithDescriptor:error:");
    private static final MethodHandle MH_newTextureViewPoolWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newCompilerWithDescriptor_error_ = ObjC.selector("newCompilerWithDescriptor:error:");
    private static final MethodHandle MH_newCompilerWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newArchiveWithURL_error_ = ObjC.selector("newArchiveWithURL:error:");
    private static final MethodHandle MH_newArchiveWithURL_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newPipelineDataSetSerializerWithDescriptor_ = ObjC.selector("newPipelineDataSetSerializerWithDescriptor:");
    private static final MethodHandle MH_newPipelineDataSetSerializerWithDescriptor_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newBufferWithLength_options_placementSparsePageSize_ = ObjC.selector("newBufferWithLength:options:placementSparsePageSize:");
    private static final MethodHandle MH_newBufferWithLength_options_placementSparsePageSize_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newCounterHeapWithDescriptor_error_ = ObjC.selector("newCounterHeapWithDescriptor:error:");
    private static final MethodHandle MH_newCounterHeapWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sizeOfCounterHeapEntry_ = ObjC.selector("sizeOfCounterHeapEntry:");
    private static final MethodHandle MH_sizeOfCounterHeapEntry_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_queryTimestampFrequency = ObjC.selector("queryTimestampFrequency");
    private static final MethodHandle MH_queryTimestampFrequency = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_functionHandleWithBinaryFunction_ = ObjC.selector("functionHandleWithBinaryFunction:");
    private static final MethodHandle MH_functionHandleWithBinaryFunction_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_name = ObjC.selector("name");
    private static final MethodHandle MH_name = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_registryID = ObjC.selector("registryID");
    private static final MethodHandle MH_registryID = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_architecture = ObjC.selector("architecture");
    private static final MethodHandle MH_architecture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxThreadsPerThreadgroup = ObjC.selector("maxThreadsPerThreadgroup");
    private static final MethodHandle MH_maxThreadsPerThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isLowPower = ObjC.selector("isLowPower");
    private static final MethodHandle MH_isLowPower = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isHeadless = ObjC.selector("isHeadless");
    private static final MethodHandle MH_isHeadless = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isRemovable = ObjC.selector("isRemovable");
    private static final MethodHandle MH_isRemovable = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_hasUnifiedMemory = ObjC.selector("hasUnifiedMemory");
    private static final MethodHandle MH_hasUnifiedMemory = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_recommendedMaxWorkingSetSize = ObjC.selector("recommendedMaxWorkingSetSize");
    private static final MethodHandle MH_recommendedMaxWorkingSetSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_location = ObjC.selector("location");
    private static final MethodHandle MH_location = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_locationNumber = ObjC.selector("locationNumber");
    private static final MethodHandle MH_locationNumber = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxTransferRate = ObjC.selector("maxTransferRate");
    private static final MethodHandle MH_maxTransferRate = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isDepth24Stencil8PixelFormatSupported = ObjC.selector("isDepth24Stencil8PixelFormatSupported");
    private static final MethodHandle MH_isDepth24Stencil8PixelFormatSupported = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_readWriteTextureSupport = ObjC.selector("readWriteTextureSupport");
    private static final MethodHandle MH_readWriteTextureSupport = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_argumentBuffersSupport = ObjC.selector("argumentBuffersSupport");
    private static final MethodHandle MH_argumentBuffersSupport = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_areRasterOrderGroupsSupported = ObjC.selector("areRasterOrderGroupsSupported");
    private static final MethodHandle MH_areRasterOrderGroupsSupported = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supports32BitFloatFiltering = ObjC.selector("supports32BitFloatFiltering");
    private static final MethodHandle MH_supports32BitFloatFiltering = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supports32BitMSAA = ObjC.selector("supports32BitMSAA");
    private static final MethodHandle MH_supports32BitMSAA = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportsQueryTextureLOD = ObjC.selector("supportsQueryTextureLOD");
    private static final MethodHandle MH_supportsQueryTextureLOD = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportsBCTextureCompression = ObjC.selector("supportsBCTextureCompression");
    private static final MethodHandle MH_supportsBCTextureCompression = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportsPullModelInterpolation = ObjC.selector("supportsPullModelInterpolation");
    private static final MethodHandle MH_supportsPullModelInterpolation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_areBarycentricCoordsSupported = ObjC.selector("areBarycentricCoordsSupported");
    private static final MethodHandle MH_areBarycentricCoordsSupported = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportsShaderBarycentricCoordinates = ObjC.selector("supportsShaderBarycentricCoordinates");
    private static final MethodHandle MH_supportsShaderBarycentricCoordinates = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_currentAllocatedSize = ObjC.selector("currentAllocatedSize");
    private static final MethodHandle MH_currentAllocatedSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxThreadgroupMemoryLength = ObjC.selector("maxThreadgroupMemoryLength");
    private static final MethodHandle MH_maxThreadgroupMemoryLength = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxArgumentBufferSamplerCount = ObjC.selector("maxArgumentBufferSamplerCount");
    private static final MethodHandle MH_maxArgumentBufferSamplerCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_areProgrammableSamplePositionsSupported = ObjC.selector("areProgrammableSamplePositionsSupported");
    private static final MethodHandle MH_areProgrammableSamplePositionsSupported = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_peerGroupID = ObjC.selector("peerGroupID");
    private static final MethodHandle MH_peerGroupID = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_peerIndex = ObjC.selector("peerIndex");
    private static final MethodHandle MH_peerIndex = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_peerCount = ObjC.selector("peerCount");
    private static final MethodHandle MH_peerCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sparseTileSizeInBytes = ObjC.selector("sparseTileSizeInBytes");
    private static final MethodHandle MH_sparseTileSizeInBytes = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxBufferLength = ObjC.selector("maxBufferLength");
    private static final MethodHandle MH_maxBufferLength = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_counterSets = ObjC.selector("counterSets");
    private static final MethodHandle MH_counterSets = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportsDynamicLibraries = ObjC.selector("supportsDynamicLibraries");
    private static final MethodHandle MH_supportsDynamicLibraries = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportsRenderDynamicLibraries = ObjC.selector("supportsRenderDynamicLibraries");
    private static final MethodHandle MH_supportsRenderDynamicLibraries = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportsPlacementSparse = ObjC.selector("supportsPlacementSparse");
    private static final MethodHandle MH_supportsPlacementSparse = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportsRaytracing = ObjC.selector("supportsRaytracing");
    private static final MethodHandle MH_supportsRaytracing = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportsFunctionPointers = ObjC.selector("supportsFunctionPointers");
    private static final MethodHandle MH_supportsFunctionPointers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportsFunctionPointersFromRender = ObjC.selector("supportsFunctionPointersFromRender");
    private static final MethodHandle MH_supportsFunctionPointersFromRender = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportsRaytracingFromRender = ObjC.selector("supportsRaytracingFromRender");
    private static final MethodHandle MH_supportsRaytracingFromRender = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportsPrimitiveMotionBlur = ObjC.selector("supportsPrimitiveMotionBlur");
    private static final MethodHandle MH_supportsPrimitiveMotionBlur = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_shouldMaximizeConcurrentCompilation = ObjC.selector("shouldMaximizeConcurrentCompilation");
    private static final MethodHandle MH_shouldMaximizeConcurrentCompilation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setShouldMaximizeConcurrentCompilation_ = ObjC.selector("setShouldMaximizeConcurrentCompilation:");
    private static final MethodHandle MH_setShouldMaximizeConcurrentCompilation_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_maximumConcurrentCompilationTaskCount = ObjC.selector("maximumConcurrentCompilationTaskCount");
    private static final MethodHandle MH_maximumConcurrentCompilationTaskCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLDevice(final long handle) {
        super(handle);
    }

    /**
     * {@code -[MTLDevice newLogStateWithDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLLogState newLogState(final MTLLogStateDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newLogStateWithDescriptor_error_.invokeExact(this.handle, SEL_newLogStateWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newLogStateWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLLogState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newCommandQueue]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLCommandQueue newCommandQueue() {
        try {
            long result = (long) MH_newCommandQueue.invokeExact(this.handle, SEL_newCommandQueue);
            return result == 0L ? null : new MTLCommandQueue(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newCommandQueueWithMaxCommandBufferCount:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLCommandQueue newCommandQueueWithMaxCommandBufferCount(final long maxCommandBufferCount) {
        try {
            long result = (long) MH_newCommandQueueWithMaxCommandBufferCount_.invokeExact(this.handle, SEL_newCommandQueueWithMaxCommandBufferCount_, maxCommandBufferCount);
            return result == 0L ? null : new MTLCommandQueue(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newCommandQueueWithDescriptor:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLCommandQueue newCommandQueueWithDescriptor(final MTLCommandQueueDescriptor descriptor) {
        try {
            long result = (long) MH_newCommandQueueWithDescriptor_.invokeExact(this.handle, SEL_newCommandQueueWithDescriptor_, descriptor.handle());
            return result == 0L ? null : new MTLCommandQueue(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice heapTextureSizeAndAlignWithDescriptor:]} */
    public MTLSizeAndAlign heapTextureSizeAndAlign(final MTLTextureDescriptor desc) {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSizeAndAlign.read((MemorySegment) MH_heapTextureSizeAndAlignWithDescriptor_.invokeExact((SegmentAllocator) stack, this.handle, SEL_heapTextureSizeAndAlignWithDescriptor_, desc.handle()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice heapBufferSizeAndAlignWithLength:options:]}
     *
     * @param options a combination of {@link MTLResourceOptions} flags
     */
    public MTLSizeAndAlign heapBufferSizeAndAlign(final long length, final long options) {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSizeAndAlign.read((MemorySegment) MH_heapBufferSizeAndAlignWithLength_options_.invokeExact((SegmentAllocator) stack, this.handle, SEL_heapBufferSizeAndAlignWithLength_options_, length, options));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newHeapWithDescriptor:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLHeap newHeap(final MTLHeapDescriptor descriptor) {
        try {
            long result = (long) MH_newHeapWithDescriptor_.invokeExact(this.handle, SEL_newHeapWithDescriptor_, descriptor.handle());
            return result == 0L ? null : new MTLHeap(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newBufferWithLength:options:]}
     * <p>Returns a retained (+1) object, release it when done.
     *
     * @param options a combination of {@link MTLResourceOptions} flags
     */
    @Nullable
    public MTLBuffer newBuffer(final long length, final long options) {
        try {
            long result = (long) MH_newBufferWithLength_options_.invokeExact(this.handle, SEL_newBufferWithLength_options_, length, options);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newBufferWithBytes:length:options:]}
     * <p>Returns a retained (+1) object, release it when done.
     *
     * @param options a combination of {@link MTLResourceOptions} flags
     */
    @Nullable
    public MTLBuffer newBufferWithBytes(final MemorySegment pointer, final long length, final long options) {
        try {
            long result = (long) MH_newBufferWithBytes_length_options_.invokeExact(this.handle, SEL_newBufferWithBytes_length_options_, pointer.address(), length, options);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newBufferWithBytesNoCopy:length:options:deallocator:]}
     * <p>Returns a retained (+1) object, release it when done.
     *
     * @param options a combination of {@link MTLResourceOptions} flags
     */
    @Nullable
    public MTLBuffer newBufferWithBytesNoCopy(final MemorySegment pointer, final long length, final long options, final long deallocator) {
        try {
            long result = (long) MH_newBufferWithBytesNoCopy_length_options_deallocator_.invokeExact(this.handle, SEL_newBufferWithBytesNoCopy_length_options_deallocator_, pointer.address(), length, options, deallocator);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newDepthStencilStateWithDescriptor:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLDepthStencilState newDepthStencilState(final MTLDepthStencilDescriptor descriptor) {
        try {
            long result = (long) MH_newDepthStencilStateWithDescriptor_.invokeExact(this.handle, SEL_newDepthStencilStateWithDescriptor_, descriptor.handle());
            return result == 0L ? null : new MTLDepthStencilState(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newTextureWithDescriptor:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLTexture newTexture(final MTLTextureDescriptor descriptor) {
        try {
            long result = (long) MH_newTextureWithDescriptor_.invokeExact(this.handle, SEL_newTextureWithDescriptor_, descriptor.handle());
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newTextureWithDescriptor:iosurface:plane:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLTexture newTexture(final MTLTextureDescriptor descriptor, final long iosurface, final long plane) {
        try {
            long result = (long) MH_newTextureWithDescriptor_iosurface_plane_.invokeExact(this.handle, SEL_newTextureWithDescriptor_iosurface_plane_, descriptor.handle(), iosurface, plane);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newSharedTextureWithDescriptor:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLTexture newSharedTextureWithDescriptor(final MTLTextureDescriptor descriptor) {
        try {
            long result = (long) MH_newSharedTextureWithDescriptor_.invokeExact(this.handle, SEL_newSharedTextureWithDescriptor_, descriptor.handle());
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newSharedTextureWithHandle:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLTexture newSharedTextureWithHandle(final MTLSharedTextureHandle sharedHandle) {
        try {
            long result = (long) MH_newSharedTextureWithHandle_.invokeExact(this.handle, SEL_newSharedTextureWithHandle_, sharedHandle.handle());
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newSamplerStateWithDescriptor:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLSamplerState newSamplerState(final MTLSamplerDescriptor descriptor) {
        try {
            long result = (long) MH_newSamplerStateWithDescriptor_.invokeExact(this.handle, SEL_newSamplerStateWithDescriptor_, descriptor.handle());
            return result == 0L ? null : new MTLSamplerState(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newDefaultLibrary]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLLibrary newDefaultLibrary() {
        try {
            long result = (long) MH_newDefaultLibrary.invokeExact(this.handle, SEL_newDefaultLibrary);
            return result == 0L ? null : new MTLLibrary(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newDefaultLibraryWithBundle:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLLibrary newDefaultLibraryWithBundle(final NSBundle bundle) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newDefaultLibraryWithBundle_error_.invokeExact(this.handle, SEL_newDefaultLibraryWithBundle_error_, bundle.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newDefaultLibraryWithBundle:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLLibrary(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newLibraryWithFile:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLLibrary newLibraryWithFile(final String filepath) {
        final long nsFilepath = ObjC.nsString(filepath);
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newLibraryWithFile_error_.invokeExact(this.handle, SEL_newLibraryWithFile_error_, nsFilepath, errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newLibraryWithFile:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLLibrary(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsFilepath);
        }
    }

    /**
     * {@code -[MTLDevice newLibraryWithURL:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLLibrary newLibraryWithURL(final NSURL url) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newLibraryWithURL_error_.invokeExact(this.handle, SEL_newLibraryWithURL_error_, url.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newLibraryWithURL:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLLibrary(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newLibraryWithData:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLLibrary newLibraryWithData(final long data) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newLibraryWithData_error_.invokeExact(this.handle, SEL_newLibraryWithData_error_, data, errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newLibraryWithData:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLLibrary(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newLibraryWithSource:options:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLLibrary newLibraryWithSource(final String source, @Nullable final MTLCompileOptions options) {
        final long nsSource = ObjC.nsString(source);
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newLibraryWithSource_options_error_.invokeExact(this.handle, SEL_newLibraryWithSource_options_error_, nsSource, options == null ? 0L : options.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newLibraryWithSource:options:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLLibrary(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsSource);
        }
    }

    /** {@code -[MTLDevice newLibraryWithSource:options:completionHandler:]} */
    public void newLibraryWithSource(final String source, @Nullable final MTLCompileOptions options, final long completionHandler) {
        final long nsSource = ObjC.nsString(source);
        try {
            MH_newLibraryWithSource_options_completionHandler_.invokeExact(this.handle, SEL_newLibraryWithSource_options_completionHandler_, nsSource, options == null ? 0L : options.handle(), completionHandler);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsSource);
        }
    }

    /**
     * {@code -[MTLDevice newLibraryWithStitchedDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLLibrary newLibraryWithStitchedDescriptor(final MTLStitchedLibraryDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newLibraryWithStitchedDescriptor_error_.invokeExact(this.handle, SEL_newLibraryWithStitchedDescriptor_error_, descriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newLibraryWithStitchedDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLLibrary(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice newLibraryWithStitchedDescriptor:completionHandler:]} */
    public void newLibraryWithStitchedDescriptor(final MTLStitchedLibraryDescriptor descriptor, final long completionHandler) {
        try {
            MH_newLibraryWithStitchedDescriptor_completionHandler_.invokeExact(this.handle, SEL_newLibraryWithStitchedDescriptor_completionHandler_, descriptor.handle(), completionHandler);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newRenderPipelineStateWithDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLRenderPipelineState newRenderPipelineState(final MTLRenderPipelineDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newRenderPipelineStateWithDescriptor_error_.invokeExact(this.handle, SEL_newRenderPipelineStateWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newRenderPipelineStateWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLRenderPipelineState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newRenderPipelineStateWithDescriptor:options:reflection:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     *
     * @param options a combination of {@link MTLPipelineOption} flags
     */
    public MTLRenderPipelineState newRenderPipelineState(final MTLRenderPipelineDescriptor descriptor, final long options, final MemorySegment reflection) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newRenderPipelineStateWithDescriptor_options_reflection_error_.invokeExact(this.handle, SEL_newRenderPipelineStateWithDescriptor_options_reflection_error_, descriptor.handle(), options, reflection.address(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newRenderPipelineStateWithDescriptor:options:reflection:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLRenderPipelineState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice newRenderPipelineStateWithDescriptor:completionHandler:]} */
    public void newRenderPipelineState(final MTLRenderPipelineDescriptor descriptor, final long completionHandler) {
        try {
            MH_newRenderPipelineStateWithDescriptor_completionHandler_.invokeExact(this.handle, SEL_newRenderPipelineStateWithDescriptor_completionHandler_, descriptor.handle(), completionHandler);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newRenderPipelineStateWithDescriptor:options:completionHandler:]}
     *
     * @param options a combination of {@link MTLPipelineOption} flags
     */
    public void newRenderPipelineState(final MTLRenderPipelineDescriptor descriptor, final long options, final long completionHandler) {
        try {
            MH_newRenderPipelineStateWithDescriptor_options_completionHandler_.invokeExact(this.handle, SEL_newRenderPipelineStateWithDescriptor_options_completionHandler_, descriptor.handle(), options, completionHandler);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newComputePipelineStateWithFunction:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLComputePipelineState newComputePipelineStateWithFunction(final MTLFunction computeFunction) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newComputePipelineStateWithFunction_error_.invokeExact(this.handle, SEL_newComputePipelineStateWithFunction_error_, computeFunction.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newComputePipelineStateWithFunction:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLComputePipelineState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newComputePipelineStateWithFunction:options:reflection:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     *
     * @param options a combination of {@link MTLPipelineOption} flags
     */
    public MTLComputePipelineState newComputePipelineStateWithFunction(final MTLFunction computeFunction, final long options, final MemorySegment reflection) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newComputePipelineStateWithFunction_options_reflection_error_.invokeExact(this.handle, SEL_newComputePipelineStateWithFunction_options_reflection_error_, computeFunction.handle(), options, reflection.address(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newComputePipelineStateWithFunction:options:reflection:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLComputePipelineState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice newComputePipelineStateWithFunction:completionHandler:]} */
    public void newComputePipelineStateWithFunction(final MTLFunction computeFunction, final long completionHandler) {
        try {
            MH_newComputePipelineStateWithFunction_completionHandler_.invokeExact(this.handle, SEL_newComputePipelineStateWithFunction_completionHandler_, computeFunction.handle(), completionHandler);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newComputePipelineStateWithFunction:options:completionHandler:]}
     *
     * @param options a combination of {@link MTLPipelineOption} flags
     */
    public void newComputePipelineStateWithFunction(final MTLFunction computeFunction, final long options, final long completionHandler) {
        try {
            MH_newComputePipelineStateWithFunction_options_completionHandler_.invokeExact(this.handle, SEL_newComputePipelineStateWithFunction_options_completionHandler_, computeFunction.handle(), options, completionHandler);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newComputePipelineStateWithDescriptor:options:reflection:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     *
     * @param options a combination of {@link MTLPipelineOption} flags
     */
    public MTLComputePipelineState newComputePipelineStateWithDescriptor(final MTLComputePipelineDescriptor descriptor, final long options, final MemorySegment reflection) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newComputePipelineStateWithDescriptor_options_reflection_error_.invokeExact(this.handle, SEL_newComputePipelineStateWithDescriptor_options_reflection_error_, descriptor.handle(), options, reflection.address(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newComputePipelineStateWithDescriptor:options:reflection:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLComputePipelineState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newComputePipelineStateWithDescriptor:options:completionHandler:]}
     *
     * @param options a combination of {@link MTLPipelineOption} flags
     */
    public void newComputePipelineStateWithDescriptor(final MTLComputePipelineDescriptor descriptor, final long options, final long completionHandler) {
        try {
            MH_newComputePipelineStateWithDescriptor_options_completionHandler_.invokeExact(this.handle, SEL_newComputePipelineStateWithDescriptor_options_completionHandler_, descriptor.handle(), options, completionHandler);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newFence]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLFence newFence() {
        try {
            long result = (long) MH_newFence.invokeExact(this.handle, SEL_newFence);
            return result == 0L ? null : new MTLFence(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice supportsFeatureSet:]} */
    public boolean supportsFeatureSet(final MTLFeatureSet featureSet) {
        try {
            return (boolean) MH_supportsFeatureSet_.invokeExact(this.handle, SEL_supportsFeatureSet_, featureSet.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice supportsFamily:]} */
    public boolean supportsFamily(final MTLGPUFamily gpuFamily) {
        try {
            return (boolean) MH_supportsFamily_.invokeExact(this.handle, SEL_supportsFamily_, gpuFamily.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice supportsTextureSampleCount:]} */
    public boolean supportsTextureSampleCount(final long sampleCount) {
        try {
            return (boolean) MH_supportsTextureSampleCount_.invokeExact(this.handle, SEL_supportsTextureSampleCount_, sampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice minimumLinearTextureAlignmentForPixelFormat:]} */
    public long minimumLinearTextureAlignmentForPixelFormat(final MTLPixelFormat format) {
        try {
            return (long) MH_minimumLinearTextureAlignmentForPixelFormat_.invokeExact(this.handle, SEL_minimumLinearTextureAlignmentForPixelFormat_, format.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice minimumTextureBufferAlignmentForPixelFormat:]} */
    public long minimumTextureBufferAlignmentForPixelFormat(final MTLPixelFormat format) {
        try {
            return (long) MH_minimumTextureBufferAlignmentForPixelFormat_.invokeExact(this.handle, SEL_minimumTextureBufferAlignmentForPixelFormat_, format.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newRenderPipelineStateWithTileDescriptor:options:reflection:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     *
     * @param options a combination of {@link MTLPipelineOption} flags
     */
    public MTLRenderPipelineState newRenderPipelineStateWithTileDescriptor(final MTLTileRenderPipelineDescriptor descriptor, final long options, final MemorySegment reflection) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newRenderPipelineStateWithTileDescriptor_options_reflection_error_.invokeExact(this.handle, SEL_newRenderPipelineStateWithTileDescriptor_options_reflection_error_, descriptor.handle(), options, reflection.address(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newRenderPipelineStateWithTileDescriptor:options:reflection:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLRenderPipelineState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newRenderPipelineStateWithTileDescriptor:options:completionHandler:]}
     *
     * @param options a combination of {@link MTLPipelineOption} flags
     */
    public void newRenderPipelineStateWithTileDescriptor(final MTLTileRenderPipelineDescriptor descriptor, final long options, final long completionHandler) {
        try {
            MH_newRenderPipelineStateWithTileDescriptor_options_completionHandler_.invokeExact(this.handle, SEL_newRenderPipelineStateWithTileDescriptor_options_completionHandler_, descriptor.handle(), options, completionHandler);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newRenderPipelineStateWithMeshDescriptor:options:reflection:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     *
     * @param options a combination of {@link MTLPipelineOption} flags
     */
    public MTLRenderPipelineState newRenderPipelineStateWithMeshDescriptor(final MTLMeshRenderPipelineDescriptor descriptor, final long options, final MemorySegment reflection) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newRenderPipelineStateWithMeshDescriptor_options_reflection_error_.invokeExact(this.handle, SEL_newRenderPipelineStateWithMeshDescriptor_options_reflection_error_, descriptor.handle(), options, reflection.address(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newRenderPipelineStateWithMeshDescriptor:options:reflection:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLRenderPipelineState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newRenderPipelineStateWithMeshDescriptor:options:completionHandler:]}
     *
     * @param options a combination of {@link MTLPipelineOption} flags
     */
    public void newRenderPipelineStateWithMeshDescriptor(final MTLMeshRenderPipelineDescriptor descriptor, final long options, final long completionHandler) {
        try {
            MH_newRenderPipelineStateWithMeshDescriptor_options_completionHandler_.invokeExact(this.handle, SEL_newRenderPipelineStateWithMeshDescriptor_options_completionHandler_, descriptor.handle(), options, completionHandler);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice getDefaultSamplePositions:count:]} */
    public void getDefaultSamplePositions(final MemorySegment positions, final long count) {
        try {
            MH_getDefaultSamplePositions_count_.invokeExact(this.handle, SEL_getDefaultSamplePositions_count_, positions.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newArgumentEncoderWithArguments:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLArgumentEncoder newArgumentEncoderWithArguments(final NSArray<MTLArgumentDescriptor> arguments) {
        try {
            long result = (long) MH_newArgumentEncoderWithArguments_.invokeExact(this.handle, SEL_newArgumentEncoderWithArguments_, arguments.handle());
            return result == 0L ? null : new MTLArgumentEncoder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice supportsRasterizationRateMapWithLayerCount:]} */
    public boolean supportsRasterizationRateMap(final long layerCount) {
        try {
            return (boolean) MH_supportsRasterizationRateMapWithLayerCount_.invokeExact(this.handle, SEL_supportsRasterizationRateMapWithLayerCount_, layerCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newRasterizationRateMapWithDescriptor:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLRasterizationRateMap newRasterizationRateMap(final MTLRasterizationRateMapDescriptor descriptor) {
        try {
            long result = (long) MH_newRasterizationRateMapWithDescriptor_.invokeExact(this.handle, SEL_newRasterizationRateMapWithDescriptor_, descriptor.handle());
            return result == 0L ? null : new MTLRasterizationRateMap(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newIndirectCommandBufferWithDescriptor:maxCommandCount:options:]}
     * <p>Returns a retained (+1) object, release it when done.
     *
     * @param options a combination of {@link MTLResourceOptions} flags
     */
    @Nullable
    public MTLIndirectCommandBuffer newIndirectCommandBuffer(final MTLIndirectCommandBufferDescriptor descriptor, final long maxCount, final long options) {
        try {
            long result = (long) MH_newIndirectCommandBufferWithDescriptor_maxCommandCount_options_.invokeExact(this.handle, SEL_newIndirectCommandBufferWithDescriptor_maxCommandCount_options_, descriptor.handle(), maxCount, options);
            return result == 0L ? null : new MTLIndirectCommandBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newEvent]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLEvent newEvent() {
        try {
            long result = (long) MH_newEvent.invokeExact(this.handle, SEL_newEvent);
            return result == 0L ? null : new MTLEvent(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newSharedEvent]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLSharedEvent newSharedEvent() {
        try {
            long result = (long) MH_newSharedEvent.invokeExact(this.handle, SEL_newSharedEvent);
            return result == 0L ? null : new MTLSharedEvent(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newSharedEventWithHandle:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLSharedEvent newSharedEventWithHandle(final MTLSharedEventHandle sharedEventHandle) {
        try {
            long result = (long) MH_newSharedEventWithHandle_.invokeExact(this.handle, SEL_newSharedEventWithHandle_, sharedEventHandle.handle());
            return result == 0L ? null : new MTLSharedEvent(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newIOHandleWithURL:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLIOFileHandle newIOHandle(final NSURL url) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newIOHandleWithURL_error_.invokeExact(this.handle, SEL_newIOHandleWithURL_error_, url.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newIOHandleWithURL:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLIOFileHandle(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newIOCommandQueueWithDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLIOCommandQueue newIOCommandQueue(final MTLIOCommandQueueDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newIOCommandQueueWithDescriptor_error_.invokeExact(this.handle, SEL_newIOCommandQueueWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newIOCommandQueueWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLIOCommandQueue(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newIOHandleWithURL:compressionMethod:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLIOFileHandle newIOHandle(final NSURL url, final MTLIOCompressionMethod compressionMethod) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newIOHandleWithURL_compressionMethod_error_.invokeExact(this.handle, SEL_newIOHandleWithURL_compressionMethod_error_, url.handle(), compressionMethod.value, errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newIOHandleWithURL:compressionMethod:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLIOFileHandle(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newIOFileHandleWithURL:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLIOFileHandle newIOFileHandle(final NSURL url) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newIOFileHandleWithURL_error_.invokeExact(this.handle, SEL_newIOFileHandleWithURL_error_, url.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newIOFileHandleWithURL:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLIOFileHandle(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newIOFileHandleWithURL:compressionMethod:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLIOFileHandle newIOFileHandle(final NSURL url, final MTLIOCompressionMethod compressionMethod) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newIOFileHandleWithURL_compressionMethod_error_.invokeExact(this.handle, SEL_newIOFileHandleWithURL_compressionMethod_error_, url.handle(), compressionMethod.value, errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newIOFileHandleWithURL:compressionMethod:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLIOFileHandle(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice sparseTileSizeWithTextureType:pixelFormat:sampleCount:]} */
    public MTLSize sparseTileSize(final MTLTextureType textureType, final MTLPixelFormat pixelFormat, final long sampleCount) {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_sparseTileSizeWithTextureType_pixelFormat_sampleCount_.invokeExact((SegmentAllocator) stack, this.handle, SEL_sparseTileSizeWithTextureType_pixelFormat_sampleCount_, textureType.value, pixelFormat.value, sampleCount));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice convertSparsePixelRegions:toTileRegions:withTileSize:alignmentMode:numRegions:]} */
    public void convertSparsePixelRegions(final MemorySegment pixelRegions, final MemorySegment tileRegions, final MTLSize tileSize, final MTLSparseTextureRegionAlignmentMode mode, final long numRegions) {
        try (NativeStack stack = NativeStack.push()) {
            MH_convertSparsePixelRegions_toTileRegions_withTileSize_alignmentMode_numRegions_.invokeExact(this.handle, SEL_convertSparsePixelRegions_toTileRegions_withTileSize_alignmentMode_numRegions_, pixelRegions.address(), tileRegions.address(), tileSize.on(stack).address(), mode.value, numRegions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice convertSparseTileRegions:toPixelRegions:withTileSize:numRegions:]} */
    public void convertSparseTileRegions(final MemorySegment tileRegions, final MemorySegment pixelRegions, final MTLSize tileSize, final long numRegions) {
        try (NativeStack stack = NativeStack.push()) {
            MH_convertSparseTileRegions_toPixelRegions_withTileSize_numRegions_.invokeExact(this.handle, SEL_convertSparseTileRegions_toPixelRegions_withTileSize_numRegions_, tileRegions.address(), pixelRegions.address(), tileSize.on(stack).address(), numRegions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice sparseTileSizeInBytesForSparsePageSize:]} */
    public long sparseTileSizeInBytesForSparsePageSize(final MTLSparsePageSize sparsePageSize) {
        try {
            return (long) MH_sparseTileSizeInBytesForSparsePageSize_.invokeExact(this.handle, SEL_sparseTileSizeInBytesForSparsePageSize_, sparsePageSize.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice sparseTileSizeWithTextureType:pixelFormat:sampleCount:sparsePageSize:]} */
    public MTLSize sparseTileSize(final MTLTextureType textureType, final MTLPixelFormat pixelFormat, final long sampleCount, final MTLSparsePageSize sparsePageSize) {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_sparseTileSizeWithTextureType_pixelFormat_sampleCount_sparsePageSize_.invokeExact((SegmentAllocator) stack, this.handle, SEL_sparseTileSizeWithTextureType_pixelFormat_sampleCount_sparsePageSize_, textureType.value, pixelFormat.value, sampleCount, sparsePageSize.value));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newCounterSampleBufferWithDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLCounterSampleBuffer newCounterSampleBuffer(final MTLCounterSampleBufferDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newCounterSampleBufferWithDescriptor_error_.invokeExact(this.handle, SEL_newCounterSampleBufferWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newCounterSampleBufferWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLCounterSampleBuffer(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice sampleTimestamps:gpuTimestamp:]} */
    public void sampleTimestamps(final MemorySegment cpuTimestamp, final MemorySegment gpuTimestamp) {
        try {
            MH_sampleTimestamps_gpuTimestamp_.invokeExact(this.handle, SEL_sampleTimestamps_gpuTimestamp_, cpuTimestamp.address(), gpuTimestamp.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newArgumentEncoderWithBufferBinding:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLArgumentEncoder newArgumentEncoderWithBufferBinding(final MTLBufferBinding bufferBinding) {
        try {
            long result = (long) MH_newArgumentEncoderWithBufferBinding_.invokeExact(this.handle, SEL_newArgumentEncoderWithBufferBinding_, bufferBinding.handle());
            return new MTLArgumentEncoder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice supportsCounterSampling:]} */
    public boolean supportsCounterSampling(final MTLCounterSamplingPoint samplingPoint) {
        try {
            return (boolean) MH_supportsCounterSampling_.invokeExact(this.handle, SEL_supportsCounterSampling_, samplingPoint.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice supportsVertexAmplificationCount:]} */
    public boolean supportsVertexAmplificationCount(final long count) {
        try {
            return (boolean) MH_supportsVertexAmplificationCount_.invokeExact(this.handle, SEL_supportsVertexAmplificationCount_, count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newDynamicLibrary:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLDynamicLibrary newDynamicLibrary(final MTLLibrary library) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newDynamicLibrary_error_.invokeExact(this.handle, SEL_newDynamicLibrary_error_, library.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newDynamicLibrary:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLDynamicLibrary(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newDynamicLibraryWithURL:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLDynamicLibrary newDynamicLibraryWithURL(final NSURL url) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newDynamicLibraryWithURL_error_.invokeExact(this.handle, SEL_newDynamicLibraryWithURL_error_, url.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newDynamicLibraryWithURL:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLDynamicLibrary(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newBinaryArchiveWithDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLBinaryArchive newBinaryArchive(final MTLBinaryArchiveDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newBinaryArchiveWithDescriptor_error_.invokeExact(this.handle, SEL_newBinaryArchiveWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newBinaryArchiveWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLBinaryArchive(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice accelerationStructureSizesWithDescriptor:]} */
    public MTLAccelerationStructureSizes accelerationStructureSizes(final MTLAccelerationStructureDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            return MTLAccelerationStructureSizes.read((MemorySegment) MH_accelerationStructureSizesWithDescriptor_.invokeExact((SegmentAllocator) stack, this.handle, SEL_accelerationStructureSizesWithDescriptor_, descriptor.handle()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newAccelerationStructureWithSize:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLAccelerationStructure newAccelerationStructureWithSize(final long size) {
        try {
            long result = (long) MH_newAccelerationStructureWithSize_.invokeExact(this.handle, SEL_newAccelerationStructureWithSize_, size);
            return result == 0L ? null : new MTLAccelerationStructure(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newAccelerationStructureWithDescriptor:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLAccelerationStructure newAccelerationStructureWithDescriptor(final MTLAccelerationStructureDescriptor descriptor) {
        try {
            long result = (long) MH_newAccelerationStructureWithDescriptor_.invokeExact(this.handle, SEL_newAccelerationStructureWithDescriptor_, descriptor.handle());
            return result == 0L ? null : new MTLAccelerationStructure(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice heapAccelerationStructureSizeAndAlignWithSize:]} */
    public MTLSizeAndAlign heapAccelerationStructureSizeAndAlignWithSize(final long size) {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSizeAndAlign.read((MemorySegment) MH_heapAccelerationStructureSizeAndAlignWithSize_.invokeExact((SegmentAllocator) stack, this.handle, SEL_heapAccelerationStructureSizeAndAlignWithSize_, size));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice heapAccelerationStructureSizeAndAlignWithDescriptor:]} */
    public MTLSizeAndAlign heapAccelerationStructureSizeAndAlignWithDescriptor(final MTLAccelerationStructureDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSizeAndAlign.read((MemorySegment) MH_heapAccelerationStructureSizeAndAlignWithDescriptor_.invokeExact((SegmentAllocator) stack, this.handle, SEL_heapAccelerationStructureSizeAndAlignWithDescriptor_, descriptor.handle()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newResidencySetWithDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLResidencySet newResidencySet(final MTLResidencySetDescriptor desc) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newResidencySetWithDescriptor_error_.invokeExact(this.handle, SEL_newResidencySetWithDescriptor_error_, desc.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newResidencySetWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLResidencySet(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice tensorSizeAndAlignWithDescriptor:]} */
    public MTLSizeAndAlign tensorSizeAndAlign(final MTLTensorDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSizeAndAlign.read((MemorySegment) MH_tensorSizeAndAlignWithDescriptor_.invokeExact((SegmentAllocator) stack, this.handle, SEL_tensorSizeAndAlignWithDescriptor_, descriptor.handle()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newTensorWithDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLTensor newTensor(final MTLTensorDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newTensorWithDescriptor_error_.invokeExact(this.handle, SEL_newTensorWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newTensorWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLTensor(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newTensorWithDescriptor:attachments:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLTensor newTensor(final MTLTensorDescriptor descriptor, final MTLTensorBufferAttachments attachments) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newTensorWithDescriptor_attachments_error_.invokeExact(this.handle, SEL_newTensorWithDescriptor_attachments_error_, descriptor.handle(), attachments.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newTensorWithDescriptor:attachments:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLTensor(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice functionHandleWithFunction:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLFunctionHandle functionHandle(final MTLFunction function) {
        try {
            long result = (long) MH_functionHandleWithFunction_.invokeExact(this.handle, SEL_functionHandleWithFunction_, function.handle());
            return result == 0L ? null : new MTLFunctionHandle(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newCommandAllocator]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTL4CommandAllocator newCommandAllocator() {
        try {
            long result = (long) MH_newCommandAllocator.invokeExact(this.handle, SEL_newCommandAllocator);
            return result == 0L ? null : new MTL4CommandAllocator(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newCommandAllocatorWithDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTL4CommandAllocator newCommandAllocatorWithDescriptor(final MTL4CommandAllocatorDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newCommandAllocatorWithDescriptor_error_.invokeExact(this.handle, SEL_newCommandAllocatorWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newCommandAllocatorWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTL4CommandAllocator(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newMTL4CommandQueue]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTL4CommandQueue newMTL4CommandQueue() {
        try {
            long result = (long) MH_newMTL4CommandQueue.invokeExact(this.handle, SEL_newMTL4CommandQueue);
            return result == 0L ? null : new MTL4CommandQueue(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newMTL4CommandQueueWithDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTL4CommandQueue newMTL4CommandQueueWithDescriptor(final MTL4CommandQueueDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newMTL4CommandQueueWithDescriptor_error_.invokeExact(this.handle, SEL_newMTL4CommandQueueWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newMTL4CommandQueueWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTL4CommandQueue(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newCommandBuffer]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTL4CommandBuffer newCommandBuffer() {
        try {
            long result = (long) MH_newCommandBuffer.invokeExact(this.handle, SEL_newCommandBuffer);
            return result == 0L ? null : new MTL4CommandBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newArgumentTableWithDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTL4ArgumentTable newArgumentTable(final MTL4ArgumentTableDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newArgumentTableWithDescriptor_error_.invokeExact(this.handle, SEL_newArgumentTableWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newArgumentTableWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTL4ArgumentTable(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newTextureViewPoolWithDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLTextureViewPool newTextureViewPool(final MTLResourceViewPoolDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newTextureViewPoolWithDescriptor_error_.invokeExact(this.handle, SEL_newTextureViewPoolWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newTextureViewPoolWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLTextureViewPool(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newCompilerWithDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTL4Compiler newCompiler(final MTL4CompilerDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newCompilerWithDescriptor_error_.invokeExact(this.handle, SEL_newCompilerWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newCompilerWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTL4Compiler(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newArchiveWithURL:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTL4Archive newArchive(final NSURL url) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newArchiveWithURL_error_.invokeExact(this.handle, SEL_newArchiveWithURL_error_, url.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newArchiveWithURL:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTL4Archive(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newPipelineDataSetSerializerWithDescriptor:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTL4PipelineDataSetSerializer newPipelineDataSetSerializer(final MTL4PipelineDataSetSerializerDescriptor descriptor) {
        try {
            long result = (long) MH_newPipelineDataSetSerializerWithDescriptor_.invokeExact(this.handle, SEL_newPipelineDataSetSerializerWithDescriptor_, descriptor.handle());
            return new MTL4PipelineDataSetSerializer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newBufferWithLength:options:placementSparsePageSize:]}
     * <p>Returns a retained (+1) object, release it when done.
     *
     * @param options a combination of {@link MTLResourceOptions} flags
     */
    @Nullable
    public MTLBuffer newBuffer(final long length, final long options, final MTLSparsePageSize placementSparsePageSize) {
        try {
            long result = (long) MH_newBufferWithLength_options_placementSparsePageSize_.invokeExact(this.handle, SEL_newBufferWithLength_options_placementSparsePageSize_, length, options, placementSparsePageSize.value);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice newCounterHeapWithDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTL4CounterHeap newCounterHeap(final MTL4CounterHeapDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newCounterHeapWithDescriptor_error_.invokeExact(this.handle, SEL_newCounterHeapWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newCounterHeapWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTL4CounterHeap(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice sizeOfCounterHeapEntry:]} */
    public long sizeOfCounterHeapEntry(final MTL4CounterHeapType type) {
        try {
            return (long) MH_sizeOfCounterHeapEntry_.invokeExact(this.handle, SEL_sizeOfCounterHeapEntry_, type.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice queryTimestampFrequency]} */
    public long queryTimestampFrequency() {
        try {
            return (long) MH_queryTimestampFrequency.invokeExact(this.handle, SEL_queryTimestampFrequency);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice functionHandleWithBinaryFunction:]}
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

    /** {@code -[MTLDevice name]} */
    public String name() {
        try {
            long result = (long) MH_name.invokeExact(this.handle, SEL_name);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice registryID]} */
    public long registryID() {
        try {
            return (long) MH_registryID.invokeExact(this.handle, SEL_registryID);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice architecture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLArchitecture architecture() {
        try {
            long result = (long) MH_architecture.invokeExact(this.handle, SEL_architecture);
            return new MTLArchitecture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice maxThreadsPerThreadgroup]} */
    public MTLSize maxThreadsPerThreadgroup() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_maxThreadsPerThreadgroup.invokeExact((SegmentAllocator) stack, this.handle, SEL_maxThreadsPerThreadgroup));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice isLowPower]} */
    public boolean isLowPower() {
        try {
            return (boolean) MH_isLowPower.invokeExact(this.handle, SEL_isLowPower);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice isHeadless]} */
    public boolean isHeadless() {
        try {
            return (boolean) MH_isHeadless.invokeExact(this.handle, SEL_isHeadless);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice isRemovable]} */
    public boolean isRemovable() {
        try {
            return (boolean) MH_isRemovable.invokeExact(this.handle, SEL_isRemovable);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice hasUnifiedMemory]} */
    public boolean hasUnifiedMemory() {
        try {
            return (boolean) MH_hasUnifiedMemory.invokeExact(this.handle, SEL_hasUnifiedMemory);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice recommendedMaxWorkingSetSize]} */
    public long recommendedMaxWorkingSetSize() {
        try {
            return (long) MH_recommendedMaxWorkingSetSize.invokeExact(this.handle, SEL_recommendedMaxWorkingSetSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice location]} */
    public MTLDeviceLocation location() {
        try {
            return MTLDeviceLocation.of((long) MH_location.invokeExact(this.handle, SEL_location));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice locationNumber]} */
    public long locationNumber() {
        try {
            return (long) MH_locationNumber.invokeExact(this.handle, SEL_locationNumber);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice maxTransferRate]} */
    public long maxTransferRate() {
        try {
            return (long) MH_maxTransferRate.invokeExact(this.handle, SEL_maxTransferRate);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice isDepth24Stencil8PixelFormatSupported]} */
    public boolean isDepth24Stencil8PixelFormatSupported() {
        try {
            return (boolean) MH_isDepth24Stencil8PixelFormatSupported.invokeExact(this.handle, SEL_isDepth24Stencil8PixelFormatSupported);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice readWriteTextureSupport]} */
    public MTLReadWriteTextureTier readWriteTextureSupport() {
        try {
            return MTLReadWriteTextureTier.of((long) MH_readWriteTextureSupport.invokeExact(this.handle, SEL_readWriteTextureSupport));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice argumentBuffersSupport]} */
    public MTLArgumentBuffersTier argumentBuffersSupport() {
        try {
            return MTLArgumentBuffersTier.of((long) MH_argumentBuffersSupport.invokeExact(this.handle, SEL_argumentBuffersSupport));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice areRasterOrderGroupsSupported]} */
    public boolean areRasterOrderGroupsSupported() {
        try {
            return (boolean) MH_areRasterOrderGroupsSupported.invokeExact(this.handle, SEL_areRasterOrderGroupsSupported);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice supports32BitFloatFiltering]} */
    public boolean supports32BitFloatFiltering() {
        try {
            return (boolean) MH_supports32BitFloatFiltering.invokeExact(this.handle, SEL_supports32BitFloatFiltering);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice supports32BitMSAA]} */
    public boolean supports32BitMSAA() {
        try {
            return (boolean) MH_supports32BitMSAA.invokeExact(this.handle, SEL_supports32BitMSAA);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice supportsQueryTextureLOD]} */
    public boolean supportsQueryTextureLOD() {
        try {
            return (boolean) MH_supportsQueryTextureLOD.invokeExact(this.handle, SEL_supportsQueryTextureLOD);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice supportsBCTextureCompression]} */
    public boolean supportsBCTextureCompression() {
        try {
            return (boolean) MH_supportsBCTextureCompression.invokeExact(this.handle, SEL_supportsBCTextureCompression);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice supportsPullModelInterpolation]} */
    public boolean supportsPullModelInterpolation() {
        try {
            return (boolean) MH_supportsPullModelInterpolation.invokeExact(this.handle, SEL_supportsPullModelInterpolation);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice areBarycentricCoordsSupported]} */
    public boolean areBarycentricCoordsSupported() {
        try {
            return (boolean) MH_areBarycentricCoordsSupported.invokeExact(this.handle, SEL_areBarycentricCoordsSupported);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice supportsShaderBarycentricCoordinates]} */
    public boolean supportsShaderBarycentricCoordinates() {
        try {
            return (boolean) MH_supportsShaderBarycentricCoordinates.invokeExact(this.handle, SEL_supportsShaderBarycentricCoordinates);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice currentAllocatedSize]} */
    public long currentAllocatedSize() {
        try {
            return (long) MH_currentAllocatedSize.invokeExact(this.handle, SEL_currentAllocatedSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice maxThreadgroupMemoryLength]} */
    public long maxThreadgroupMemoryLength() {
        try {
            return (long) MH_maxThreadgroupMemoryLength.invokeExact(this.handle, SEL_maxThreadgroupMemoryLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice maxArgumentBufferSamplerCount]} */
    public long maxArgumentBufferSamplerCount() {
        try {
            return (long) MH_maxArgumentBufferSamplerCount.invokeExact(this.handle, SEL_maxArgumentBufferSamplerCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice areProgrammableSamplePositionsSupported]} */
    public boolean areProgrammableSamplePositionsSupported() {
        try {
            return (boolean) MH_areProgrammableSamplePositionsSupported.invokeExact(this.handle, SEL_areProgrammableSamplePositionsSupported);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice peerGroupID]} */
    public long peerGroupID() {
        try {
            return (long) MH_peerGroupID.invokeExact(this.handle, SEL_peerGroupID);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice peerIndex]} */
    public int peerIndex() {
        try {
            return (int) MH_peerIndex.invokeExact(this.handle, SEL_peerIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice peerCount]} */
    public int peerCount() {
        try {
            return (int) MH_peerCount.invokeExact(this.handle, SEL_peerCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice sparseTileSizeInBytes]} */
    public long sparseTileSizeInBytes() {
        try {
            return (long) MH_sparseTileSizeInBytes.invokeExact(this.handle, SEL_sparseTileSizeInBytes);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice maxBufferLength]} */
    public long maxBufferLength() {
        try {
            return (long) MH_maxBufferLength.invokeExact(this.handle, SEL_maxBufferLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDevice counterSets]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTLCounterSet> counterSets() {
        try {
            long result = (long) MH_counterSets.invokeExact(this.handle, SEL_counterSets);
            return result == 0L ? null : new NSArray<>(result, MTLCounterSet::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice supportsDynamicLibraries]} */
    public boolean supportsDynamicLibraries() {
        try {
            return (boolean) MH_supportsDynamicLibraries.invokeExact(this.handle, SEL_supportsDynamicLibraries);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice supportsRenderDynamicLibraries]} */
    public boolean supportsRenderDynamicLibraries() {
        try {
            return (boolean) MH_supportsRenderDynamicLibraries.invokeExact(this.handle, SEL_supportsRenderDynamicLibraries);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice supportsPlacementSparse]} */
    public boolean supportsPlacementSparse() {
        try {
            return (boolean) MH_supportsPlacementSparse.invokeExact(this.handle, SEL_supportsPlacementSparse);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice supportsRaytracing]} */
    public boolean supportsRaytracing() {
        try {
            return (boolean) MH_supportsRaytracing.invokeExact(this.handle, SEL_supportsRaytracing);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice supportsFunctionPointers]} */
    public boolean supportsFunctionPointers() {
        try {
            return (boolean) MH_supportsFunctionPointers.invokeExact(this.handle, SEL_supportsFunctionPointers);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice supportsFunctionPointersFromRender]} */
    public boolean supportsFunctionPointersFromRender() {
        try {
            return (boolean) MH_supportsFunctionPointersFromRender.invokeExact(this.handle, SEL_supportsFunctionPointersFromRender);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice supportsRaytracingFromRender]} */
    public boolean supportsRaytracingFromRender() {
        try {
            return (boolean) MH_supportsRaytracingFromRender.invokeExact(this.handle, SEL_supportsRaytracingFromRender);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice supportsPrimitiveMotionBlur]} */
    public boolean supportsPrimitiveMotionBlur() {
        try {
            return (boolean) MH_supportsPrimitiveMotionBlur.invokeExact(this.handle, SEL_supportsPrimitiveMotionBlur);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice shouldMaximizeConcurrentCompilation]} */
    public boolean shouldMaximizeConcurrentCompilation() {
        try {
            return (boolean) MH_shouldMaximizeConcurrentCompilation.invokeExact(this.handle, SEL_shouldMaximizeConcurrentCompilation);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice setShouldMaximizeConcurrentCompilation:]} */
    public void setShouldMaximizeConcurrentCompilation(final boolean shouldMaximizeConcurrentCompilation) {
        try {
            MH_setShouldMaximizeConcurrentCompilation_.invokeExact(this.handle, SEL_setShouldMaximizeConcurrentCompilation_, shouldMaximizeConcurrentCompilation);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDevice maximumConcurrentCompilationTaskCount]} */
    public long maximumConcurrentCompilationTaskCount() {
        try {
            return (long) MH_maximumConcurrentCompilationTaskCount.invokeExact(this.handle, SEL_maximumConcurrentCompilationTaskCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
