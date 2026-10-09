package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLResource}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlresource">Apple documentation</a>
 */
public class MTLResource extends MTLAllocation {
    private static final long SEL_setPurgeableState_ = ObjC.selector("setPurgeableState:");
    private static final MethodHandle MH_setPurgeableState_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_makeAliasable = ObjC.selector("makeAliasable");
    private static final MethodHandle MH_makeAliasable = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_isAliasable = ObjC.selector("isAliasable");
    private static final MethodHandle MH_isAliasable = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOwnerWithIdentity_ = ObjC.selector("setOwnerWithIdentity:");
    private static final MethodHandle MH_setOwnerWithIdentity_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_INT));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_cpuCacheMode = ObjC.selector("cpuCacheMode");
    private static final MethodHandle MH_cpuCacheMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_storageMode = ObjC.selector("storageMode");
    private static final MethodHandle MH_storageMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_hazardTrackingMode = ObjC.selector("hazardTrackingMode");
    private static final MethodHandle MH_hazardTrackingMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resourceOptions = ObjC.selector("resourceOptions");
    private static final MethodHandle MH_resourceOptions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_heap = ObjC.selector("heap");
    private static final MethodHandle MH_heap = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_heapOffset = ObjC.selector("heapOffset");
    private static final MethodHandle MH_heapOffset = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_allocatedSize = ObjC.selector("allocatedSize");
    private static final MethodHandle MH_allocatedSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLResource(final long handle) {
        super(handle);
    }

    /** {@code -[MTLResource setPurgeableState:]} */
    public MTLPurgeableState setPurgeableState(final MTLPurgeableState state) {
        try {
            return MTLPurgeableState.of((long) MH_setPurgeableState_.invokeExact(this.handle, SEL_setPurgeableState_, state.value));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResource makeAliasable]} */
    public void makeAliasable() {
        try {
            MH_makeAliasable.invokeExact(this.handle, SEL_makeAliasable);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResource isAliasable]} */
    public boolean isAliasable() {
        try {
            return (boolean) MH_isAliasable.invokeExact(this.handle, SEL_isAliasable);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResource setOwnerWithIdentity:]} */
    public int setOwnerWithIdentity(final int task_id_token) {
        try {
            return (int) MH_setOwnerWithIdentity_.invokeExact(this.handle, SEL_setOwnerWithIdentity_, task_id_token);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResource label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResource setLabel:]} */
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
     * {@code -[MTLResource device]}
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

    /** {@code -[MTLResource cpuCacheMode]} */
    public MTLCPUCacheMode cpuCacheMode() {
        try {
            return MTLCPUCacheMode.of((long) MH_cpuCacheMode.invokeExact(this.handle, SEL_cpuCacheMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResource storageMode]} */
    public MTLStorageMode storageMode() {
        try {
            return MTLStorageMode.of((long) MH_storageMode.invokeExact(this.handle, SEL_storageMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResource hazardTrackingMode]} */
    public MTLHazardTrackingMode hazardTrackingMode() {
        try {
            return MTLHazardTrackingMode.of((long) MH_hazardTrackingMode.invokeExact(this.handle, SEL_hazardTrackingMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLResource resourceOptions]}
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

    /**
     * {@code -[MTLResource heap]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLHeap heap() {
        try {
            long result = (long) MH_heap.invokeExact(this.handle, SEL_heap);
            return result == 0L ? null : new MTLHeap(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResource heapOffset]} */
    public long heapOffset() {
        try {
            return (long) MH_heapOffset.invokeExact(this.handle, SEL_heapOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResource allocatedSize]} */
    public long allocatedSize() {
        try {
            return (long) MH_allocatedSize.invokeExact(this.handle, SEL_allocatedSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
