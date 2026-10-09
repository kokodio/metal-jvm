package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSError;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLIOCommandBuffer}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtliocommandbuffer">Apple documentation</a>
 */
public class MTLIOCommandBuffer extends NSObject {
    private static final long SEL_addCompletedHandler_ = ObjC.selector("addCompletedHandler:");
    private static final MethodHandle MH_addCompletedHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_loadBytes_size_sourceHandle_sourceHandleOffset_ = ObjC.selector("loadBytes:size:sourceHandle:sourceHandleOffset:");
    private static final MethodHandle MH_loadBytes_size_sourceHandle_sourceHandleOffset_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_loadBuffer_offset_size_sourceHandle_sourceHandleOffset_ = ObjC.selector("loadBuffer:offset:size:sourceHandle:sourceHandleOffset:");
    private static final MethodHandle MH_loadBuffer_offset_size_sourceHandle_sourceHandleOffset_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_loadTexture_slice_level_size_sourceBytesPerRow_sourceBytesPerImage_destinationOrigin_sourceHandle_sourceHandleOffset_ = ObjC.selector("loadTexture:slice:level:size:sourceBytesPerRow:sourceBytesPerImage:destinationOrigin:sourceHandle:sourceHandleOffset:");
    private static final MethodHandle MH_loadTexture_slice_level_size_sourceBytesPerRow_sourceBytesPerImage_destinationOrigin_sourceHandle_sourceHandleOffset_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyStatusToBuffer_offset_ = ObjC.selector("copyStatusToBuffer:offset:");
    private static final MethodHandle MH_copyStatusToBuffer_offset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_commit = ObjC.selector("commit");
    private static final MethodHandle MH_commit = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_waitUntilCompleted = ObjC.selector("waitUntilCompleted");
    private static final MethodHandle MH_waitUntilCompleted = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_tryCancel = ObjC.selector("tryCancel");
    private static final MethodHandle MH_tryCancel = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_addBarrier = ObjC.selector("addBarrier");
    private static final MethodHandle MH_addBarrier = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_pushDebugGroup_ = ObjC.selector("pushDebugGroup:");
    private static final MethodHandle MH_pushDebugGroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_popDebugGroup = ObjC.selector("popDebugGroup");
    private static final MethodHandle MH_popDebugGroup = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_enqueue = ObjC.selector("enqueue");
    private static final MethodHandle MH_enqueue = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_waitForEvent_value_ = ObjC.selector("waitForEvent:value:");
    private static final MethodHandle MH_waitForEvent_value_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_signalEvent_value_ = ObjC.selector("signalEvent:value:");
    private static final MethodHandle MH_signalEvent_value_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_status = ObjC.selector("status");
    private static final MethodHandle MH_status = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_error = ObjC.selector("error");
    private static final MethodHandle MH_error = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLIOCommandBuffer(final long handle) {
        super(handle);
    }

    /** {@code -[MTLIOCommandBuffer addCompletedHandler:]} */
    public void addCompletedHandler(final long block) {
        try {
            MH_addCompletedHandler_.invokeExact(this.handle, SEL_addCompletedHandler_, block);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandBuffer loadBytes:size:sourceHandle:sourceHandleOffset:]} */
    public void loadBytes(final MemorySegment pointer, final long size, final MTLIOFileHandle sourceHandle, final long sourceHandleOffset) {
        try {
            MH_loadBytes_size_sourceHandle_sourceHandleOffset_.invokeExact(this.handle, SEL_loadBytes_size_sourceHandle_sourceHandleOffset_, pointer.address(), size, sourceHandle.handle(), sourceHandleOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandBuffer loadBuffer:offset:size:sourceHandle:sourceHandleOffset:]} */
    public void loadBuffer(final MTLBuffer buffer, final long offset, final long size, final MTLIOFileHandle sourceHandle, final long sourceHandleOffset) {
        try {
            MH_loadBuffer_offset_size_sourceHandle_sourceHandleOffset_.invokeExact(this.handle, SEL_loadBuffer_offset_size_sourceHandle_sourceHandleOffset_, buffer.handle(), offset, size, sourceHandle.handle(), sourceHandleOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandBuffer loadTexture:slice:level:size:sourceBytesPerRow:sourceBytesPerImage:destinationOrigin:sourceHandle:sourceHandleOffset:]} */
    public void loadTexture(final MTLTexture texture, final long slice, final long level, final MTLSize size, final long sourceBytesPerRow, final long sourceBytesPerImage, final MTLOrigin destinationOrigin, final MTLIOFileHandle sourceHandle, final long sourceHandleOffset) {
        try (NativeStack stack = NativeStack.push()) {
            MH_loadTexture_slice_level_size_sourceBytesPerRow_sourceBytesPerImage_destinationOrigin_sourceHandle_sourceHandleOffset_.invokeExact(this.handle, SEL_loadTexture_slice_level_size_sourceBytesPerRow_sourceBytesPerImage_destinationOrigin_sourceHandle_sourceHandleOffset_, texture.handle(), slice, level, size.on(stack).address(), sourceBytesPerRow, sourceBytesPerImage, destinationOrigin.on(stack).address(), sourceHandle.handle(), sourceHandleOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandBuffer copyStatusToBuffer:offset:]} */
    public void copyStatusToBuffer(final MTLBuffer buffer, final long offset) {
        try {
            MH_copyStatusToBuffer_offset_.invokeExact(this.handle, SEL_copyStatusToBuffer_offset_, buffer.handle(), offset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandBuffer commit]} */
    public void commit() {
        try {
            MH_commit.invokeExact(this.handle, SEL_commit);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandBuffer waitUntilCompleted]} */
    public void waitUntilCompleted() {
        try {
            MH_waitUntilCompleted.invokeExact(this.handle, SEL_waitUntilCompleted);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandBuffer tryCancel]} */
    public void tryCancel() {
        try {
            MH_tryCancel.invokeExact(this.handle, SEL_tryCancel);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandBuffer addBarrier]} */
    public void addBarrier() {
        try {
            MH_addBarrier.invokeExact(this.handle, SEL_addBarrier);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandBuffer pushDebugGroup:]} */
    public void pushDebugGroup(final String string) {
        final long nsString = ObjC.nsString(string);
        try {
            MH_pushDebugGroup_.invokeExact(this.handle, SEL_pushDebugGroup_, nsString);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsString);
        }
    }

    /** {@code -[MTLIOCommandBuffer popDebugGroup]} */
    public void popDebugGroup() {
        try {
            MH_popDebugGroup.invokeExact(this.handle, SEL_popDebugGroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandBuffer enqueue]} */
    public void enqueue() {
        try {
            MH_enqueue.invokeExact(this.handle, SEL_enqueue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandBuffer waitForEvent:value:]} */
    public void waitForEvent(final MTLSharedEvent event, final long value) {
        try {
            MH_waitForEvent_value_.invokeExact(this.handle, SEL_waitForEvent_value_, event.handle(), value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandBuffer signalEvent:value:]} */
    public void signalEvent(final MTLSharedEvent event, final long value) {
        try {
            MH_signalEvent_value_.invokeExact(this.handle, SEL_signalEvent_value_, event.handle(), value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandBuffer label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandBuffer setLabel:]} */
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

    /** {@code -[MTLIOCommandBuffer status]} */
    public MTLIOStatus status() {
        try {
            return MTLIOStatus.of((long) MH_status.invokeExact(this.handle, SEL_status));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLIOCommandBuffer error]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSError error() {
        try {
            long result = (long) MH_error.invokeExact(this.handle, SEL_error);
            return result == 0L ? null : new NSError(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
