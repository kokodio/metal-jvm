package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
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
 * {@code MTLResourceViewPool}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlresourceviewpool">Apple documentation</a>
 */
public class MTLResourceViewPool extends NSObject {
    private static final long SEL_copyResourceViewsFromPool_sourceRange_destinationIndex_ = ObjC.selector("copyResourceViewsFromPool:sourceRange:destinationIndex:");
    private static final MethodHandle MH_copyResourceViewsFromPool_sourceRange_destinationIndex_ = ObjC.msgSendCritical(FunctionDescriptor.of(MTLResourceID.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_baseResourceID = ObjC.selector("baseResourceID");
    private static final MethodHandle MH_baseResourceID = ObjC.msgSendCritical(FunctionDescriptor.of(MTLResourceID.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resourceViewCount = ObjC.selector("resourceViewCount");
    private static final MethodHandle MH_resourceViewCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLResourceViewPool(final long handle) {
        super(handle);
    }

    /** {@code -[MTLResourceViewPool copyResourceViewsFromPool:sourceRange:destinationIndex:]} */
    public MTLResourceID copyResourceViewsFromPool(final MTLResourceViewPool sourcePool, final NSRange sourceRange, final long destinationIndex) {
        try (NativeStack stack = NativeStack.push()) {
            return MTLResourceID.read((MemorySegment) MH_copyResourceViewsFromPool_sourceRange_destinationIndex_.invokeExact((SegmentAllocator) stack, this.handle, SEL_copyResourceViewsFromPool_sourceRange_destinationIndex_, sourcePool.handle(), sourceRange.location(), sourceRange.length(), destinationIndex));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResourceViewPool baseResourceID]} */
    public MTLResourceID baseResourceID() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLResourceID.read((MemorySegment) MH_baseResourceID.invokeExact((SegmentAllocator) stack, this.handle, SEL_baseResourceID));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLResourceViewPool resourceViewCount]} */
    public long resourceViewCount() {
        try {
            return (long) MH_resourceViewCount.invokeExact(this.handle, SEL_resourceViewCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLResourceViewPool device]}
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

    /** {@code -[MTLResourceViewPool label]} */
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
