package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSRange;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLIntersectionFunctionTable}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlintersectionfunctiontable">Apple documentation</a>
 */
public class MTLIntersectionFunctionTable extends MTLResource {
    private static final long SEL_setBuffer_offset_atIndex_ = ObjC.selector("setBuffer:offset:atIndex:");
    private static final MethodHandle MH_setBuffer_offset_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBuffers_offsets_withRange_ = ObjC.selector("setBuffers:offsets:withRange:");
    private static final MethodHandle MH_setBuffers_offsets_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFunction_atIndex_ = ObjC.selector("setFunction:atIndex:");
    private static final MethodHandle MH_setFunction_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFunctions_withRange_ = ObjC.selector("setFunctions:withRange:");
    private static final MethodHandle MH_setFunctions_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOpaqueTriangleIntersectionFunctionWithSignature_atIndex_ = ObjC.selector("setOpaqueTriangleIntersectionFunctionWithSignature:atIndex:");
    private static final MethodHandle MH_setOpaqueTriangleIntersectionFunctionWithSignature_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOpaqueTriangleIntersectionFunctionWithSignature_withRange_ = ObjC.selector("setOpaqueTriangleIntersectionFunctionWithSignature:withRange:");
    private static final MethodHandle MH_setOpaqueTriangleIntersectionFunctionWithSignature_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOpaqueCurveIntersectionFunctionWithSignature_atIndex_ = ObjC.selector("setOpaqueCurveIntersectionFunctionWithSignature:atIndex:");
    private static final MethodHandle MH_setOpaqueCurveIntersectionFunctionWithSignature_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOpaqueCurveIntersectionFunctionWithSignature_withRange_ = ObjC.selector("setOpaqueCurveIntersectionFunctionWithSignature:withRange:");
    private static final MethodHandle MH_setOpaqueCurveIntersectionFunctionWithSignature_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVisibleFunctionTable_atBufferIndex_ = ObjC.selector("setVisibleFunctionTable:atBufferIndex:");
    private static final MethodHandle MH_setVisibleFunctionTable_atBufferIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVisibleFunctionTables_withBufferRange_ = ObjC.selector("setVisibleFunctionTables:withBufferRange:");
    private static final MethodHandle MH_setVisibleFunctionTables_withBufferRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_gpuResourceID = ObjC.selector("gpuResourceID");
    private static final MethodHandle MH_gpuResourceID = ObjC.msgSendCritical(FunctionDescriptor.of(MTLResourceID.LAYOUT, JAVA_LONG, JAVA_LONG));

    public MTLIntersectionFunctionTable(final long handle) {
        super(handle);
    }

    /** {@code -[MTLIntersectionFunctionTable setBuffer:offset:atIndex:]} */
    public void setBuffer(@Nullable final MTLBuffer buffer, final long offset, final long index) {
        try {
            MH_setBuffer_offset_atIndex_.invokeExact(this.handle, SEL_setBuffer_offset_atIndex_, buffer == null ? 0L : buffer.handle(), offset, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIntersectionFunctionTable setBuffers:offsets:withRange:]} */
    public void setBuffers(final MemorySegment buffers, final MemorySegment offsets, final NSRange range) {
        try {
            MH_setBuffers_offsets_withRange_.invokeExact(this.handle, SEL_setBuffers_offsets_withRange_, buffers.address(), offsets.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIntersectionFunctionTable setFunction:atIndex:]} */
    public void setFunction(@Nullable final MTLFunctionHandle function, final long index) {
        try {
            MH_setFunction_atIndex_.invokeExact(this.handle, SEL_setFunction_atIndex_, function == null ? 0L : function.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIntersectionFunctionTable setFunctions:withRange:]} */
    public void setFunctions(final MemorySegment functions, final NSRange range) {
        try {
            MH_setFunctions_withRange_.invokeExact(this.handle, SEL_setFunctions_withRange_, functions.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLIntersectionFunctionTable setOpaqueTriangleIntersectionFunctionWithSignature:atIndex:]}
     *
     * @param signature a combination of {@link MTLIntersectionFunctionSignature} flags
     */
    public void setOpaqueTriangleIntersectionFunction(final long signature, final long index) {
        try {
            MH_setOpaqueTriangleIntersectionFunctionWithSignature_atIndex_.invokeExact(this.handle, SEL_setOpaqueTriangleIntersectionFunctionWithSignature_atIndex_, signature, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLIntersectionFunctionTable setOpaqueTriangleIntersectionFunctionWithSignature:withRange:]}
     *
     * @param signature a combination of {@link MTLIntersectionFunctionSignature} flags
     */
    public void setOpaqueTriangleIntersectionFunction(final long signature, final NSRange range) {
        try {
            MH_setOpaqueTriangleIntersectionFunctionWithSignature_withRange_.invokeExact(this.handle, SEL_setOpaqueTriangleIntersectionFunctionWithSignature_withRange_, signature, range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLIntersectionFunctionTable setOpaqueCurveIntersectionFunctionWithSignature:atIndex:]}
     *
     * @param signature a combination of {@link MTLIntersectionFunctionSignature} flags
     */
    public void setOpaqueCurveIntersectionFunction(final long signature, final long index) {
        try {
            MH_setOpaqueCurveIntersectionFunctionWithSignature_atIndex_.invokeExact(this.handle, SEL_setOpaqueCurveIntersectionFunctionWithSignature_atIndex_, signature, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLIntersectionFunctionTable setOpaqueCurveIntersectionFunctionWithSignature:withRange:]}
     *
     * @param signature a combination of {@link MTLIntersectionFunctionSignature} flags
     */
    public void setOpaqueCurveIntersectionFunction(final long signature, final NSRange range) {
        try {
            MH_setOpaqueCurveIntersectionFunctionWithSignature_withRange_.invokeExact(this.handle, SEL_setOpaqueCurveIntersectionFunctionWithSignature_withRange_, signature, range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIntersectionFunctionTable setVisibleFunctionTable:atBufferIndex:]} */
    public void setVisibleFunctionTable(@Nullable final MTLVisibleFunctionTable functionTable, final long bufferIndex) {
        try {
            MH_setVisibleFunctionTable_atBufferIndex_.invokeExact(this.handle, SEL_setVisibleFunctionTable_atBufferIndex_, functionTable == null ? 0L : functionTable.handle(), bufferIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIntersectionFunctionTable setVisibleFunctionTables:withBufferRange:]} */
    public void setVisibleFunctionTables(final MemorySegment functionTables, final NSRange bufferRange) {
        try {
            MH_setVisibleFunctionTables_withBufferRange_.invokeExact(this.handle, SEL_setVisibleFunctionTables_withBufferRange_, functionTables.address(), bufferRange.location(), bufferRange.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIntersectionFunctionTable gpuResourceID]} */
    public MTLResourceID gpuResourceID() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLResourceID.read((MemorySegment) MH_gpuResourceID.invokeExact((SegmentAllocator) stack, this.handle, SEL_gpuResourceID));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
