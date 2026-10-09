package io.github.kokodio.metaljvm.metal;

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
 * {@code MTLVisibleFunctionTable}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlvisiblefunctiontable">Apple documentation</a>
 */
public class MTLVisibleFunctionTable extends MTLResource {
    private static final long SEL_setFunction_atIndex_ = ObjC.selector("setFunction:atIndex:");
    private static final MethodHandle MH_setFunction_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFunctions_withRange_ = ObjC.selector("setFunctions:withRange:");
    private static final MethodHandle MH_setFunctions_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_gpuResourceID = ObjC.selector("gpuResourceID");
    private static final MethodHandle MH_gpuResourceID = ObjC.msgSendCritical(FunctionDescriptor.of(MTLResourceID.LAYOUT, JAVA_LONG, JAVA_LONG));

    public MTLVisibleFunctionTable(final long handle) {
        super(handle);
    }

    /** {@code -[MTLVisibleFunctionTable setFunction:atIndex:]} */
    public void setFunction(@Nullable final MTLFunctionHandle function, final long index) {
        try {
            MH_setFunction_atIndex_.invokeExact(this.handle, SEL_setFunction_atIndex_, function == null ? 0L : function.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLVisibleFunctionTable setFunctions:withRange:]} */
    public void setFunctions(final MemorySegment functions, final NSRange range) {
        try {
            MH_setFunctions_withRange_.invokeExact(this.handle, SEL_setFunctions_withRange_, functions.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLVisibleFunctionTable gpuResourceID]} */
    public MTLResourceID gpuResourceID() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLResourceID.read((MemorySegment) MH_gpuResourceID.invokeExact((SegmentAllocator) stack, this.handle, SEL_gpuResourceID));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
