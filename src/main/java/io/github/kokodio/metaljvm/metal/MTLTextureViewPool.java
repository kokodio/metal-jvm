package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLTextureViewPool}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltextureviewpool">Apple documentation</a>
 */
public class MTLTextureViewPool extends MTLResourceViewPool {
    private static final long SEL_setTextureView_atIndex_ = ObjC.selector("setTextureView:atIndex:");
    private static final MethodHandle MH_setTextureView_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.of(MTLResourceID.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTextureView_descriptor_atIndex_ = ObjC.selector("setTextureView:descriptor:atIndex:");
    private static final MethodHandle MH_setTextureView_descriptor_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.of(MTLResourceID.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTextureViewFromBuffer_descriptor_offset_bytesPerRow_atIndex_ = ObjC.selector("setTextureViewFromBuffer:descriptor:offset:bytesPerRow:atIndex:");
    private static final MethodHandle MH_setTextureViewFromBuffer_descriptor_offset_bytesPerRow_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.of(MTLResourceID.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLTextureViewPool(final long handle) {
        super(handle);
    }

    /** {@code -[MTLTextureViewPool setTextureView:atIndex:]} */
    public MTLResourceID setTextureView(final MTLTexture texture, final long index) {
        try (NativeStack stack = NativeStack.push()) {
            return MTLResourceID.read((MemorySegment) MH_setTextureView_atIndex_.invokeExact((SegmentAllocator) stack, this.handle, SEL_setTextureView_atIndex_, texture.handle(), index));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureViewPool setTextureView:descriptor:atIndex:]} */
    public MTLResourceID setTextureView(final MTLTexture texture, final MTLTextureViewDescriptor descriptor, final long index) {
        try (NativeStack stack = NativeStack.push()) {
            return MTLResourceID.read((MemorySegment) MH_setTextureView_descriptor_atIndex_.invokeExact((SegmentAllocator) stack, this.handle, SEL_setTextureView_descriptor_atIndex_, texture.handle(), descriptor.handle(), index));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureViewPool setTextureViewFromBuffer:descriptor:offset:bytesPerRow:atIndex:]} */
    public MTLResourceID setTextureViewFromBuffer(final MTLBuffer buffer, final MTLTextureDescriptor descriptor, final long offset, final long bytesPerRow, final long index) {
        try (NativeStack stack = NativeStack.push()) {
            return MTLResourceID.read((MemorySegment) MH_setTextureViewFromBuffer_descriptor_offset_bytesPerRow_atIndex_.invokeExact((SegmentAllocator) stack, this.handle, SEL_setTextureViewFromBuffer_descriptor_offset_bytesPerRow_atIndex_, buffer.handle(), descriptor.handle(), offset, bytesPerRow, index));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
