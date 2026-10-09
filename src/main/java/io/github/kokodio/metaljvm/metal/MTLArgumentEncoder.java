package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.foundation.NSRange;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLArgumentEncoder}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlargumentencoder">Apple documentation</a>
 */
public class MTLArgumentEncoder extends NSObject {
    private static final long SEL_setArgumentBuffer_offset_ = ObjC.selector("setArgumentBuffer:offset:");
    private static final MethodHandle MH_setArgumentBuffer_offset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setArgumentBuffer_startOffset_arrayElement_ = ObjC.selector("setArgumentBuffer:startOffset:arrayElement:");
    private static final MethodHandle MH_setArgumentBuffer_startOffset_arrayElement_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBuffer_offset_atIndex_ = ObjC.selector("setBuffer:offset:atIndex:");
    private static final MethodHandle MH_setBuffer_offset_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBuffers_offsets_withRange_ = ObjC.selector("setBuffers:offsets:withRange:");
    private static final MethodHandle MH_setBuffers_offsets_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTexture_atIndex_ = ObjC.selector("setTexture:atIndex:");
    private static final MethodHandle MH_setTexture_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTextures_withRange_ = ObjC.selector("setTextures:withRange:");
    private static final MethodHandle MH_setTextures_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSamplerState_atIndex_ = ObjC.selector("setSamplerState:atIndex:");
    private static final MethodHandle MH_setSamplerState_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSamplerStates_withRange_ = ObjC.selector("setSamplerStates:withRange:");
    private static final MethodHandle MH_setSamplerStates_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_constantDataAtIndex_ = ObjC.selector("constantDataAtIndex:");
    private static final MethodHandle MH_constantDataAtIndex_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRenderPipelineState_atIndex_ = ObjC.selector("setRenderPipelineState:atIndex:");
    private static final MethodHandle MH_setRenderPipelineState_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRenderPipelineStates_withRange_ = ObjC.selector("setRenderPipelineStates:withRange:");
    private static final MethodHandle MH_setRenderPipelineStates_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setComputePipelineState_atIndex_ = ObjC.selector("setComputePipelineState:atIndex:");
    private static final MethodHandle MH_setComputePipelineState_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setComputePipelineStates_withRange_ = ObjC.selector("setComputePipelineStates:withRange:");
    private static final MethodHandle MH_setComputePipelineStates_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setIndirectCommandBuffer_atIndex_ = ObjC.selector("setIndirectCommandBuffer:atIndex:");
    private static final MethodHandle MH_setIndirectCommandBuffer_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setIndirectCommandBuffers_withRange_ = ObjC.selector("setIndirectCommandBuffers:withRange:");
    private static final MethodHandle MH_setIndirectCommandBuffers_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAccelerationStructure_atIndex_ = ObjC.selector("setAccelerationStructure:atIndex:");
    private static final MethodHandle MH_setAccelerationStructure_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newArgumentEncoderForBufferAtIndex_ = ObjC.selector("newArgumentEncoderForBufferAtIndex:");
    private static final MethodHandle MH_newArgumentEncoderForBufferAtIndex_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVisibleFunctionTable_atIndex_ = ObjC.selector("setVisibleFunctionTable:atIndex:");
    private static final MethodHandle MH_setVisibleFunctionTable_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVisibleFunctionTables_withRange_ = ObjC.selector("setVisibleFunctionTables:withRange:");
    private static final MethodHandle MH_setVisibleFunctionTables_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setIntersectionFunctionTable_atIndex_ = ObjC.selector("setIntersectionFunctionTable:atIndex:");
    private static final MethodHandle MH_setIntersectionFunctionTable_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setIntersectionFunctionTables_withRange_ = ObjC.selector("setIntersectionFunctionTables:withRange:");
    private static final MethodHandle MH_setIntersectionFunctionTables_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthStencilState_atIndex_ = ObjC.selector("setDepthStencilState:atIndex:");
    private static final MethodHandle MH_setDepthStencilState_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthStencilStates_withRange_ = ObjC.selector("setDepthStencilStates:withRange:");
    private static final MethodHandle MH_setDepthStencilStates_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_encodedLength = ObjC.selector("encodedLength");
    private static final MethodHandle MH_encodedLength = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alignment = ObjC.selector("alignment");
    private static final MethodHandle MH_alignment = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLArgumentEncoder(final long handle) {
        super(handle);
    }

    /** {@code -[MTLArgumentEncoder setArgumentBuffer:offset:]} */
    public void setArgumentBuffer(@Nullable final MTLBuffer argumentBuffer, final long offset) {
        try {
            MH_setArgumentBuffer_offset_.invokeExact(this.handle, SEL_setArgumentBuffer_offset_, argumentBuffer == null ? 0L : argumentBuffer.handle(), offset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder setArgumentBuffer:startOffset:arrayElement:]} */
    public void setArgumentBuffer(@Nullable final MTLBuffer argumentBuffer, final long startOffset, final long arrayElement) {
        try {
            MH_setArgumentBuffer_startOffset_arrayElement_.invokeExact(this.handle, SEL_setArgumentBuffer_startOffset_arrayElement_, argumentBuffer == null ? 0L : argumentBuffer.handle(), startOffset, arrayElement);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder setBuffer:offset:atIndex:]} */
    public void setBuffer(@Nullable final MTLBuffer buffer, final long offset, final long index) {
        try {
            MH_setBuffer_offset_atIndex_.invokeExact(this.handle, SEL_setBuffer_offset_atIndex_, buffer == null ? 0L : buffer.handle(), offset, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder setBuffers:offsets:withRange:]} */
    public void setBuffers(final MemorySegment buffers, final MemorySegment offsets, final NSRange range) {
        try {
            MH_setBuffers_offsets_withRange_.invokeExact(this.handle, SEL_setBuffers_offsets_withRange_, buffers.address(), offsets.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder setTexture:atIndex:]} */
    public void setTexture(@Nullable final MTLTexture texture, final long index) {
        try {
            MH_setTexture_atIndex_.invokeExact(this.handle, SEL_setTexture_atIndex_, texture == null ? 0L : texture.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder setTextures:withRange:]} */
    public void setTextures(final MemorySegment textures, final NSRange range) {
        try {
            MH_setTextures_withRange_.invokeExact(this.handle, SEL_setTextures_withRange_, textures.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder setSamplerState:atIndex:]} */
    public void setSamplerState(@Nullable final MTLSamplerState sampler, final long index) {
        try {
            MH_setSamplerState_atIndex_.invokeExact(this.handle, SEL_setSamplerState_atIndex_, sampler == null ? 0L : sampler.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder setSamplerStates:withRange:]} */
    public void setSamplerStates(final MemorySegment samplers, final NSRange range) {
        try {
            MH_setSamplerStates_withRange_.invokeExact(this.handle, SEL_setSamplerStates_withRange_, samplers.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder constantDataAtIndex:]} */
    public MemorySegment constantDataAtIndex(final long index) {
        try {
            return MemorySegment.ofAddress((long) MH_constantDataAtIndex_.invokeExact(this.handle, SEL_constantDataAtIndex_, index));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder setRenderPipelineState:atIndex:]} */
    public void setRenderPipelineState(@Nullable final MTLRenderPipelineState pipeline, final long index) {
        try {
            MH_setRenderPipelineState_atIndex_.invokeExact(this.handle, SEL_setRenderPipelineState_atIndex_, pipeline == null ? 0L : pipeline.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder setRenderPipelineStates:withRange:]} */
    public void setRenderPipelineStates(final MemorySegment pipelines, final NSRange range) {
        try {
            MH_setRenderPipelineStates_withRange_.invokeExact(this.handle, SEL_setRenderPipelineStates_withRange_, pipelines.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder setComputePipelineState:atIndex:]} */
    public void setComputePipelineState(@Nullable final MTLComputePipelineState pipeline, final long index) {
        try {
            MH_setComputePipelineState_atIndex_.invokeExact(this.handle, SEL_setComputePipelineState_atIndex_, pipeline == null ? 0L : pipeline.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder setComputePipelineStates:withRange:]} */
    public void setComputePipelineStates(final MemorySegment pipelines, final NSRange range) {
        try {
            MH_setComputePipelineStates_withRange_.invokeExact(this.handle, SEL_setComputePipelineStates_withRange_, pipelines.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder setIndirectCommandBuffer:atIndex:]} */
    public void setIndirectCommandBuffer(@Nullable final MTLIndirectCommandBuffer indirectCommandBuffer, final long index) {
        try {
            MH_setIndirectCommandBuffer_atIndex_.invokeExact(this.handle, SEL_setIndirectCommandBuffer_atIndex_, indirectCommandBuffer == null ? 0L : indirectCommandBuffer.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder setIndirectCommandBuffers:withRange:]} */
    public void setIndirectCommandBuffers(final MemorySegment buffers, final NSRange range) {
        try {
            MH_setIndirectCommandBuffers_withRange_.invokeExact(this.handle, SEL_setIndirectCommandBuffers_withRange_, buffers.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder setAccelerationStructure:atIndex:]} */
    public void setAccelerationStructure(@Nullable final MTLAccelerationStructure accelerationStructure, final long index) {
        try {
            MH_setAccelerationStructure_atIndex_.invokeExact(this.handle, SEL_setAccelerationStructure_atIndex_, accelerationStructure == null ? 0L : accelerationStructure.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLArgumentEncoder newArgumentEncoderForBufferAtIndex:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLArgumentEncoder newArgumentEncoderForBufferAtIndex(final long index) {
        try {
            long result = (long) MH_newArgumentEncoderForBufferAtIndex_.invokeExact(this.handle, SEL_newArgumentEncoderForBufferAtIndex_, index);
            return result == 0L ? null : new MTLArgumentEncoder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder setVisibleFunctionTable:atIndex:]} */
    public void setVisibleFunctionTable(@Nullable final MTLVisibleFunctionTable visibleFunctionTable, final long index) {
        try {
            MH_setVisibleFunctionTable_atIndex_.invokeExact(this.handle, SEL_setVisibleFunctionTable_atIndex_, visibleFunctionTable == null ? 0L : visibleFunctionTable.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder setVisibleFunctionTables:withRange:]} */
    public void setVisibleFunctionTables(final MemorySegment visibleFunctionTables, final NSRange range) {
        try {
            MH_setVisibleFunctionTables_withRange_.invokeExact(this.handle, SEL_setVisibleFunctionTables_withRange_, visibleFunctionTables.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder setIntersectionFunctionTable:atIndex:]} */
    public void setIntersectionFunctionTable(@Nullable final MTLIntersectionFunctionTable intersectionFunctionTable, final long index) {
        try {
            MH_setIntersectionFunctionTable_atIndex_.invokeExact(this.handle, SEL_setIntersectionFunctionTable_atIndex_, intersectionFunctionTable == null ? 0L : intersectionFunctionTable.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder setIntersectionFunctionTables:withRange:]} */
    public void setIntersectionFunctionTables(final MemorySegment intersectionFunctionTables, final NSRange range) {
        try {
            MH_setIntersectionFunctionTables_withRange_.invokeExact(this.handle, SEL_setIntersectionFunctionTables_withRange_, intersectionFunctionTables.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder setDepthStencilState:atIndex:]} */
    public void setDepthStencilState(@Nullable final MTLDepthStencilState depthStencilState, final long index) {
        try {
            MH_setDepthStencilState_atIndex_.invokeExact(this.handle, SEL_setDepthStencilState_atIndex_, depthStencilState == null ? 0L : depthStencilState.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder setDepthStencilStates:withRange:]} */
    public void setDepthStencilStates(final MemorySegment depthStencilStates, final NSRange range) {
        try {
            MH_setDepthStencilStates_withRange_.invokeExact(this.handle, SEL_setDepthStencilStates_withRange_, depthStencilStates.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLArgumentEncoder device]}
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

    /** {@code -[MTLArgumentEncoder label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder setLabel:]} */
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

    /** {@code -[MTLArgumentEncoder encodedLength]} */
    public long encodedLength() {
        try {
            return (long) MH_encodedLength.invokeExact(this.handle, SEL_encodedLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentEncoder alignment]} */
    public long alignment() {
        try {
            return (long) MH_alignment.invokeExact(this.handle, SEL_alignment);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
