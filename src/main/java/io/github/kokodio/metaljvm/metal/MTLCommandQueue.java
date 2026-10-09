package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLCommandQueue}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcommandqueue">Apple documentation</a>
 */
public class MTLCommandQueue extends NSObject {
    private static final long SEL_commandBuffer = ObjC.selector("commandBuffer");
    private static final MethodHandle MH_commandBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_commandBufferWithDescriptor_ = ObjC.selector("commandBufferWithDescriptor:");
    private static final MethodHandle MH_commandBufferWithDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_commandBufferWithUnretainedReferences = ObjC.selector("commandBufferWithUnretainedReferences");
    private static final MethodHandle MH_commandBufferWithUnretainedReferences = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_insertDebugCaptureBoundary = ObjC.selector("insertDebugCaptureBoundary");
    private static final MethodHandle MH_insertDebugCaptureBoundary = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_addResidencySet_ = ObjC.selector("addResidencySet:");
    private static final MethodHandle MH_addResidencySet_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_addResidencySets_count_ = ObjC.selector("addResidencySets:count:");
    private static final MethodHandle MH_addResidencySets_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeResidencySet_ = ObjC.selector("removeResidencySet:");
    private static final MethodHandle MH_removeResidencySet_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeResidencySets_count_ = ObjC.selector("removeResidencySets:count:");
    private static final MethodHandle MH_removeResidencySets_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLCommandQueue(final long handle) {
        super(handle);
    }

    /**
     * {@code -[MTLCommandQueue commandBuffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLCommandBuffer commandBuffer() {
        try {
            long result = (long) MH_commandBuffer.invokeExact(this.handle, SEL_commandBuffer);
            return result == 0L ? null : new MTLCommandBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandQueue commandBufferWithDescriptor:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLCommandBuffer commandBufferWithDescriptor(final MTLCommandBufferDescriptor descriptor) {
        try {
            long result = (long) MH_commandBufferWithDescriptor_.invokeExact(this.handle, SEL_commandBufferWithDescriptor_, descriptor.handle());
            return result == 0L ? null : new MTLCommandBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandQueue commandBufferWithUnretainedReferences]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLCommandBuffer commandBufferWithUnretainedReferences() {
        try {
            long result = (long) MH_commandBufferWithUnretainedReferences.invokeExact(this.handle, SEL_commandBufferWithUnretainedReferences);
            return result == 0L ? null : new MTLCommandBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandQueue insertDebugCaptureBoundary]} */
    public void insertDebugCaptureBoundary() {
        try {
            MH_insertDebugCaptureBoundary.invokeExact(this.handle, SEL_insertDebugCaptureBoundary);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandQueue addResidencySet:]} */
    public void addResidencySet(final MTLResidencySet residencySet) {
        try {
            MH_addResidencySet_.invokeExact(this.handle, SEL_addResidencySet_, residencySet.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandQueue addResidencySets:count:]} */
    public void addResidencySets(final MemorySegment residencySets, final long count) {
        try {
            MH_addResidencySets_count_.invokeExact(this.handle, SEL_addResidencySets_count_, residencySets.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandQueue removeResidencySet:]} */
    public void removeResidencySet(final MTLResidencySet residencySet) {
        try {
            MH_removeResidencySet_.invokeExact(this.handle, SEL_removeResidencySet_, residencySet.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandQueue removeResidencySets:count:]} */
    public void removeResidencySets(final MemorySegment residencySets, final long count) {
        try {
            MH_removeResidencySets_count_.invokeExact(this.handle, SEL_removeResidencySets_count_, residencySets.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandQueue label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandQueue setLabel:]} */
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
     * {@code -[MTLCommandQueue device]}
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
}
