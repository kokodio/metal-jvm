package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLIOScratchBuffer}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlioscratchbuffer">Apple documentation</a>
 */
public class MTLIOScratchBuffer extends NSObject {
    private static final long SEL_buffer = ObjC.selector("buffer");
    private static final MethodHandle MH_buffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLIOScratchBuffer(final long handle) {
        super(handle);
    }

    /**
     * {@code -[MTLIOScratchBuffer buffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLBuffer buffer() {
        try {
            long result = (long) MH_buffer.invokeExact(this.handle, SEL_buffer);
            return new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
