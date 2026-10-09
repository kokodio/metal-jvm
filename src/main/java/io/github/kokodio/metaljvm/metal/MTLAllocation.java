package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLAllocation}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlallocation">Apple documentation</a>
 */
public class MTLAllocation extends NSObject {
    private static final long SEL_allocatedSize = ObjC.selector("allocatedSize");
    private static final MethodHandle MH_allocatedSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLAllocation(final long handle) {
        super(handle);
    }

    /** {@code -[MTLAllocation allocatedSize]} */
    public long allocatedSize() {
        try {
            return (long) MH_allocatedSize.invokeExact(this.handle, SEL_allocatedSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
