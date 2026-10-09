package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSRange;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLIndirectCommandBuffer}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlindirectcommandbuffer">Apple documentation</a>
 */
public class MTLIndirectCommandBuffer extends MTLResource {
    private static final long SEL_resetWithRange_ = ObjC.selector("resetWithRange:");
    private static final MethodHandle MH_resetWithRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indirectRenderCommandAtIndex_ = ObjC.selector("indirectRenderCommandAtIndex:");
    private static final MethodHandle MH_indirectRenderCommandAtIndex_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indirectComputeCommandAtIndex_ = ObjC.selector("indirectComputeCommandAtIndex:");
    private static final MethodHandle MH_indirectComputeCommandAtIndex_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_size = ObjC.selector("size");
    private static final MethodHandle MH_size = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_gpuResourceID = ObjC.selector("gpuResourceID");
    private static final MethodHandle MH_gpuResourceID = ObjC.msgSendCritical(FunctionDescriptor.of(MTLResourceID.LAYOUT, JAVA_LONG, JAVA_LONG));

    public MTLIndirectCommandBuffer(final long handle) {
        super(handle);
    }

    /** {@code -[MTLIndirectCommandBuffer resetWithRange:]} */
    public void reset(final NSRange range) {
        try {
            MH_resetWithRange_.invokeExact(this.handle, SEL_resetWithRange_, range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLIndirectCommandBuffer indirectRenderCommandAtIndex:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLIndirectRenderCommand indirectRenderCommandAtIndex(final long commandIndex) {
        try {
            long result = (long) MH_indirectRenderCommandAtIndex_.invokeExact(this.handle, SEL_indirectRenderCommandAtIndex_, commandIndex);
            return new MTLIndirectRenderCommand(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLIndirectCommandBuffer indirectComputeCommandAtIndex:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLIndirectComputeCommand indirectComputeCommandAtIndex(final long commandIndex) {
        try {
            long result = (long) MH_indirectComputeCommandAtIndex_.invokeExact(this.handle, SEL_indirectComputeCommandAtIndex_, commandIndex);
            return new MTLIndirectComputeCommand(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBuffer size]} */
    public long size() {
        try {
            return (long) MH_size.invokeExact(this.handle, SEL_size);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIndirectCommandBuffer gpuResourceID]} */
    public MTLResourceID gpuResourceID() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLResourceID.read((MemorySegment) MH_gpuResourceID.invokeExact((SegmentAllocator) stack, this.handle, SEL_gpuResourceID));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
