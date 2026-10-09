package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLHeap}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlheap">Apple documentation</a>
 */
public class MTLHeap extends MTLAllocation {
    private static final long SEL_maxAvailableSizeWithAlignment_ = ObjC.selector("maxAvailableSizeWithAlignment:");
    private static final MethodHandle MH_maxAvailableSizeWithAlignment_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newBufferWithLength_options_ = ObjC.selector("newBufferWithLength:options:");
    private static final MethodHandle MH_newBufferWithLength_options_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newTextureWithDescriptor_ = ObjC.selector("newTextureWithDescriptor:");
    private static final MethodHandle MH_newTextureWithDescriptor_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPurgeableState_ = ObjC.selector("setPurgeableState:");
    private static final MethodHandle MH_setPurgeableState_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newBufferWithLength_options_offset_ = ObjC.selector("newBufferWithLength:options:offset:");
    private static final MethodHandle MH_newBufferWithLength_options_offset_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newTextureWithDescriptor_offset_ = ObjC.selector("newTextureWithDescriptor:offset:");
    private static final MethodHandle MH_newTextureWithDescriptor_offset_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newAccelerationStructureWithSize_ = ObjC.selector("newAccelerationStructureWithSize:");
    private static final MethodHandle MH_newAccelerationStructureWithSize_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newAccelerationStructureWithDescriptor_ = ObjC.selector("newAccelerationStructureWithDescriptor:");
    private static final MethodHandle MH_newAccelerationStructureWithDescriptor_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newAccelerationStructureWithSize_offset_ = ObjC.selector("newAccelerationStructureWithSize:offset:");
    private static final MethodHandle MH_newAccelerationStructureWithSize_offset_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newAccelerationStructureWithDescriptor_offset_ = ObjC.selector("newAccelerationStructureWithDescriptor:offset:");
    private static final MethodHandle MH_newAccelerationStructureWithDescriptor_offset_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_storageMode = ObjC.selector("storageMode");
    private static final MethodHandle MH_storageMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_cpuCacheMode = ObjC.selector("cpuCacheMode");
    private static final MethodHandle MH_cpuCacheMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_hazardTrackingMode = ObjC.selector("hazardTrackingMode");
    private static final MethodHandle MH_hazardTrackingMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resourceOptions = ObjC.selector("resourceOptions");
    private static final MethodHandle MH_resourceOptions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_size = ObjC.selector("size");
    private static final MethodHandle MH_size = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_usedSize = ObjC.selector("usedSize");
    private static final MethodHandle MH_usedSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_currentAllocatedSize = ObjC.selector("currentAllocatedSize");
    private static final MethodHandle MH_currentAllocatedSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_type = ObjC.selector("type");
    private static final MethodHandle MH_type = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLHeap(final long handle) {
        super(handle);
    }

    /** {@code -[MTLHeap maxAvailableSizeWithAlignment:]} */
    public long maxAvailableSize(final long alignment) {
        try {
            return (long) MH_maxAvailableSizeWithAlignment_.invokeExact(this.handle, SEL_maxAvailableSizeWithAlignment_, alignment);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLHeap newBufferWithLength:options:]}
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
     * {@code -[MTLHeap newTextureWithDescriptor:]}
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

    /** {@code -[MTLHeap setPurgeableState:]} */
    public MTLPurgeableState setPurgeableState(final MTLPurgeableState state) {
        try {
            return MTLPurgeableState.of((long) MH_setPurgeableState_.invokeExact(this.handle, SEL_setPurgeableState_, state.value));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLHeap newBufferWithLength:options:offset:]}
     * <p>Returns a retained (+1) object, release it when done.
     *
     * @param options a combination of {@link MTLResourceOptions} flags
     */
    @Nullable
    public MTLBuffer newBuffer(final long length, final long options, final long offset) {
        try {
            long result = (long) MH_newBufferWithLength_options_offset_.invokeExact(this.handle, SEL_newBufferWithLength_options_offset_, length, options, offset);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLHeap newTextureWithDescriptor:offset:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLTexture newTexture(final MTLTextureDescriptor descriptor, final long offset) {
        try {
            long result = (long) MH_newTextureWithDescriptor_offset_.invokeExact(this.handle, SEL_newTextureWithDescriptor_offset_, descriptor.handle(), offset);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLHeap newAccelerationStructureWithSize:]}
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
     * {@code -[MTLHeap newAccelerationStructureWithDescriptor:]}
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

    /**
     * {@code -[MTLHeap newAccelerationStructureWithSize:offset:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLAccelerationStructure newAccelerationStructureWithSize(final long size, final long offset) {
        try {
            long result = (long) MH_newAccelerationStructureWithSize_offset_.invokeExact(this.handle, SEL_newAccelerationStructureWithSize_offset_, size, offset);
            return result == 0L ? null : new MTLAccelerationStructure(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLHeap newAccelerationStructureWithDescriptor:offset:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLAccelerationStructure newAccelerationStructureWithDescriptor(final MTLAccelerationStructureDescriptor descriptor, final long offset) {
        try {
            long result = (long) MH_newAccelerationStructureWithDescriptor_offset_.invokeExact(this.handle, SEL_newAccelerationStructureWithDescriptor_offset_, descriptor.handle(), offset);
            return result == 0L ? null : new MTLAccelerationStructure(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeap label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeap setLabel:]} */
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

    /**
     * {@code -[MTLHeap device]}
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

    /** {@code -[MTLHeap storageMode]} */
    public MTLStorageMode storageMode() {
        try {
            return MTLStorageMode.of((long) MH_storageMode.invokeExact(this.handle, SEL_storageMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeap cpuCacheMode]} */
    public MTLCPUCacheMode cpuCacheMode() {
        try {
            return MTLCPUCacheMode.of((long) MH_cpuCacheMode.invokeExact(this.handle, SEL_cpuCacheMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeap hazardTrackingMode]} */
    public MTLHazardTrackingMode hazardTrackingMode() {
        try {
            return MTLHazardTrackingMode.of((long) MH_hazardTrackingMode.invokeExact(this.handle, SEL_hazardTrackingMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLHeap resourceOptions]}
     *
     * @return a combination of {@link MTLResourceOptions} flags
     */
    public long resourceOptions() {
        try {
            return (long) MH_resourceOptions.invokeExact(this.handle, SEL_resourceOptions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeap size]} */
    public long size() {
        try {
            return (long) MH_size.invokeExact(this.handle, SEL_size);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeap usedSize]} */
    public long usedSize() {
        try {
            return (long) MH_usedSize.invokeExact(this.handle, SEL_usedSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeap currentAllocatedSize]} */
    public long currentAllocatedSize() {
        try {
            return (long) MH_currentAllocatedSize.invokeExact(this.handle, SEL_currentAllocatedSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeap type]} */
    public MTLHeapType type() {
        try {
            return MTLHeapType.of((long) MH_type.invokeExact(this.handle, SEL_type));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
