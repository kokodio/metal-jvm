package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLResidencySet}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlresidencyset">Apple documentation</a>
 */
public class MTLResidencySet extends NSObject {
    private static final long SEL_requestResidency = ObjC.selector("requestResidency");
    private static final MethodHandle MH_requestResidency = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_endResidency = ObjC.selector("endResidency");
    private static final MethodHandle MH_endResidency = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_addAllocation_ = ObjC.selector("addAllocation:");
    private static final MethodHandle MH_addAllocation_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_addAllocations_count_ = ObjC.selector("addAllocations:count:");
    private static final MethodHandle MH_addAllocations_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeAllocation_ = ObjC.selector("removeAllocation:");
    private static final MethodHandle MH_removeAllocation_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeAllocations_count_ = ObjC.selector("removeAllocations:count:");
    private static final MethodHandle MH_removeAllocations_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeAllAllocations = ObjC.selector("removeAllAllocations");
    private static final MethodHandle MH_removeAllAllocations = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_containsAllocation_ = ObjC.selector("containsAllocation:");
    private static final MethodHandle MH_containsAllocation_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_commit = ObjC.selector("commit");
    private static final MethodHandle MH_commit = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_allocatedSize = ObjC.selector("allocatedSize");
    private static final MethodHandle MH_allocatedSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_allAllocations = ObjC.selector("allAllocations");
    private static final MethodHandle MH_allAllocations = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_allocationCount = ObjC.selector("allocationCount");
    private static final MethodHandle MH_allocationCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLResidencySet(final long handle) {
        super(handle);
    }

    /** {@code -[MTLResidencySet requestResidency]} */
    public void requestResidency() {
        try {
            MH_requestResidency.invokeExact(this.handle, SEL_requestResidency);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResidencySet endResidency]} */
    public void endResidency() {
        try {
            MH_endResidency.invokeExact(this.handle, SEL_endResidency);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResidencySet addAllocation:]} */
    public void addAllocation(final MTLAllocation allocation) {
        try {
            MH_addAllocation_.invokeExact(this.handle, SEL_addAllocation_, allocation.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResidencySet addAllocations:count:]} */
    public void addAllocations(final MemorySegment allocations, final long count) {
        try {
            MH_addAllocations_count_.invokeExact(this.handle, SEL_addAllocations_count_, allocations.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResidencySet removeAllocation:]} */
    public void removeAllocation(final MTLAllocation allocation) {
        try {
            MH_removeAllocation_.invokeExact(this.handle, SEL_removeAllocation_, allocation.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResidencySet removeAllocations:count:]} */
    public void removeAllocations(final MemorySegment allocations, final long count) {
        try {
            MH_removeAllocations_count_.invokeExact(this.handle, SEL_removeAllocations_count_, allocations.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResidencySet removeAllAllocations]} */
    public void removeAllAllocations() {
        try {
            MH_removeAllAllocations.invokeExact(this.handle, SEL_removeAllAllocations);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResidencySet containsAllocation:]} */
    public boolean containsAllocation(final MTLAllocation anAllocation) {
        try {
            return (boolean) MH_containsAllocation_.invokeExact(this.handle, SEL_containsAllocation_, anAllocation.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResidencySet commit]} */
    public void commit() {
        try {
            MH_commit.invokeExact(this.handle, SEL_commit);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLResidencySet device]}
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

    /** {@code -[MTLResidencySet label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResidencySet allocatedSize]} */
    public long allocatedSize() {
        try {
            return (long) MH_allocatedSize.invokeExact(this.handle, SEL_allocatedSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLResidencySet allAllocations]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLAllocation> allAllocations() {
        try {
            long result = (long) MH_allAllocations.invokeExact(this.handle, SEL_allAllocations);
            return new NSArray<>(result, MTLAllocation::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResidencySet allocationCount]} */
    public long allocationCount() {
        try {
            return (long) MH_allocationCount.invokeExact(this.handle, SEL_allocationCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
