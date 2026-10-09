package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLFunctionHandle}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlfunctionhandle">Apple documentation</a>
 */
public class MTLFunctionHandle extends NSObject {
    private static final long SEL_functionType = ObjC.selector("functionType");
    private static final MethodHandle MH_functionType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_name = ObjC.selector("name");
    private static final MethodHandle MH_name = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_gpuResourceID = ObjC.selector("gpuResourceID");
    private static final MethodHandle MH_gpuResourceID = ObjC.msgSendCritical(FunctionDescriptor.of(MTLResourceID.LAYOUT, JAVA_LONG, JAVA_LONG));

    public MTLFunctionHandle(final long handle) {
        super(handle);
    }

    /** {@code -[MTLFunctionHandle functionType]} */
    public MTLFunctionType functionType() {
        try {
            return MTLFunctionType.of((long) MH_functionType.invokeExact(this.handle, SEL_functionType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionHandle name]} */
    public String name() {
        try {
            long result = (long) MH_name.invokeExact(this.handle, SEL_name);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFunctionHandle device]}
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

    /** {@code -[MTLFunctionHandle gpuResourceID]} */
    public MTLResourceID gpuResourceID() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLResourceID.read((MemorySegment) MH_gpuResourceID.invokeExact((SegmentAllocator) stack, this.handle, SEL_gpuResourceID));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
