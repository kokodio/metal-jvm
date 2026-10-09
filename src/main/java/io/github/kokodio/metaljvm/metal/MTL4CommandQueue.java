package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4CommandQueue}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4commandqueue">Apple documentation</a>
 */
public class MTL4CommandQueue extends NSObject {
    private static final long SEL_commit_count_ = ObjC.selector("commit:count:");
    private static final MethodHandle MH_commit_count_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_commit_count_options_ = ObjC.selector("commit:count:options:");
    private static final MethodHandle MH_commit_count_options_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_signalEvent_value_ = ObjC.selector("signalEvent:value:");
    private static final MethodHandle MH_signalEvent_value_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_waitForEvent_value_ = ObjC.selector("waitForEvent:value:");
    private static final MethodHandle MH_waitForEvent_value_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_signalDrawable_ = ObjC.selector("signalDrawable:");
    private static final MethodHandle MH_signalDrawable_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_waitForDrawable_ = ObjC.selector("waitForDrawable:");
    private static final MethodHandle MH_waitForDrawable_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_addResidencySet_ = ObjC.selector("addResidencySet:");
    private static final MethodHandle MH_addResidencySet_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_addResidencySets_count_ = ObjC.selector("addResidencySets:count:");
    private static final MethodHandle MH_addResidencySets_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeResidencySet_ = ObjC.selector("removeResidencySet:");
    private static final MethodHandle MH_removeResidencySet_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeResidencySets_count_ = ObjC.selector("removeResidencySets:count:");
    private static final MethodHandle MH_removeResidencySets_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_updateTextureMappings_heap_operations_count_ = ObjC.selector("updateTextureMappings:heap:operations:count:");
    private static final MethodHandle MH_updateTextureMappings_heap_operations_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyTextureMappingsFromTexture_toTexture_operations_count_ = ObjC.selector("copyTextureMappingsFromTexture:toTexture:operations:count:");
    private static final MethodHandle MH_copyTextureMappingsFromTexture_toTexture_operations_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_updateBufferMappings_heap_operations_count_ = ObjC.selector("updateBufferMappings:heap:operations:count:");
    private static final MethodHandle MH_updateBufferMappings_heap_operations_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_copyBufferMappingsFromBuffer_toBuffer_operations_count_ = ObjC.selector("copyBufferMappingsFromBuffer:toBuffer:operations:count:");
    private static final MethodHandle MH_copyBufferMappingsFromBuffer_toBuffer_operations_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTL4CommandQueue(final long handle) {
        super(handle);
    }

    /** {@code -[MTL4CommandQueue commit:count:]} */
    public void commit(final MemorySegment commandBuffers, final long count) {
        try {
            MH_commit_count_.invokeExact(this.handle, SEL_commit_count_, commandBuffers.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandQueue commit:count:options:]} */
    public void commit(final MemorySegment commandBuffers, final long count, final MTL4CommitOptions options) {
        try {
            MH_commit_count_options_.invokeExact(this.handle, SEL_commit_count_options_, commandBuffers.address(), count, options.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandQueue signalEvent:value:]} */
    public void signalEvent(final MTLEvent event, final long value) {
        try {
            MH_signalEvent_value_.invokeExact(this.handle, SEL_signalEvent_value_, event.handle(), value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandQueue waitForEvent:value:]} */
    public void waitForEvent(final MTLEvent event, final long value) {
        try {
            MH_waitForEvent_value_.invokeExact(this.handle, SEL_waitForEvent_value_, event.handle(), value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandQueue signalDrawable:]} */
    public void signalDrawable(final MTLDrawable drawable) {
        try {
            MH_signalDrawable_.invokeExact(this.handle, SEL_signalDrawable_, drawable.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandQueue waitForDrawable:]} */
    public void waitForDrawable(final MTLDrawable drawable) {
        try {
            MH_waitForDrawable_.invokeExact(this.handle, SEL_waitForDrawable_, drawable.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandQueue addResidencySet:]} */
    public void addResidencySet(final MTLResidencySet residencySet) {
        try {
            MH_addResidencySet_.invokeExact(this.handle, SEL_addResidencySet_, residencySet.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandQueue addResidencySets:count:]} */
    public void addResidencySets(final MemorySegment residencySets, final long count) {
        try {
            MH_addResidencySets_count_.invokeExact(this.handle, SEL_addResidencySets_count_, residencySets.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandQueue removeResidencySet:]} */
    public void removeResidencySet(final MTLResidencySet residencySet) {
        try {
            MH_removeResidencySet_.invokeExact(this.handle, SEL_removeResidencySet_, residencySet.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandQueue removeResidencySets:count:]} */
    public void removeResidencySets(final MemorySegment residencySets, final long count) {
        try {
            MH_removeResidencySets_count_.invokeExact(this.handle, SEL_removeResidencySets_count_, residencySets.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandQueue updateTextureMappings:heap:operations:count:]} */
    public void updateTextureMappings(final MTLTexture texture, @Nullable final MTLHeap heap, final MemorySegment operations, final long count) {
        try {
            MH_updateTextureMappings_heap_operations_count_.invokeExact(this.handle, SEL_updateTextureMappings_heap_operations_count_, texture.handle(), heap == null ? 0L : heap.handle(), operations.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandQueue copyTextureMappingsFromTexture:toTexture:operations:count:]} */
    public void copyTextureMappingsFromTexture(final MTLTexture sourceTexture, final MTLTexture destinationTexture, final MemorySegment operations, final long count) {
        try {
            MH_copyTextureMappingsFromTexture_toTexture_operations_count_.invokeExact(this.handle, SEL_copyTextureMappingsFromTexture_toTexture_operations_count_, sourceTexture.handle(), destinationTexture.handle(), operations.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandQueue updateBufferMappings:heap:operations:count:]} */
    public void updateBufferMappings(final MTLBuffer buffer, @Nullable final MTLHeap heap, final MemorySegment operations, final long count) {
        try {
            MH_updateBufferMappings_heap_operations_count_.invokeExact(this.handle, SEL_updateBufferMappings_heap_operations_count_, buffer.handle(), heap == null ? 0L : heap.handle(), operations.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandQueue copyBufferMappingsFromBuffer:toBuffer:operations:count:]} */
    public void copyBufferMappingsFromBuffer(final MTLBuffer sourceBuffer, final MTLBuffer destinationBuffer, final MemorySegment operations, final long count) {
        try {
            MH_copyBufferMappingsFromBuffer_toBuffer_operations_count_.invokeExact(this.handle, SEL_copyBufferMappingsFromBuffer_toBuffer_operations_count_, sourceBuffer.handle(), destinationBuffer.handle(), operations.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4CommandQueue device]}
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

    /** {@code -[MTL4CommandQueue label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
