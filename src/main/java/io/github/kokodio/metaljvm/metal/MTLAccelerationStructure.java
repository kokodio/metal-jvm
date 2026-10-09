package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLAccelerationStructure}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlaccelerationstructure">Apple documentation</a>
 */
public class MTLAccelerationStructure extends MTLResource {
    private static final long SEL_size = ObjC.selector("size");
    private static final MethodHandle MH_size = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_gpuResourceID = ObjC.selector("gpuResourceID");
    private static final MethodHandle MH_gpuResourceID = ObjC.msgSendCritical(FunctionDescriptor.of(MTLResourceID.LAYOUT, JAVA_LONG, JAVA_LONG));

    public MTLAccelerationStructure(final long handle) {
        super(handle);
    }

    /** {@code -[MTLAccelerationStructure size]} */
    public long size() {
        try {
            return (long) MH_size.invokeExact(this.handle, SEL_size);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAccelerationStructure gpuResourceID]} */
    public MTLResourceID gpuResourceID() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLResourceID.read((MemorySegment) MH_gpuResourceID.invokeExact((SegmentAllocator) stack, this.handle, SEL_gpuResourceID));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
