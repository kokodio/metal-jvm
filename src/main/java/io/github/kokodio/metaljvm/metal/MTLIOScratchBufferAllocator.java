package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLIOScratchBufferAllocator}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlioscratchbufferallocator">Apple documentation</a>
 */
public class MTLIOScratchBufferAllocator extends NSObject {
    private static final long SEL_newScratchBufferWithMinimumSize_ = ObjC.selector("newScratchBufferWithMinimumSize:");
    private static final MethodHandle MH_newScratchBufferWithMinimumSize_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLIOScratchBufferAllocator(final long handle) {
        super(handle);
    }

    /**
     * {@code -[MTLIOScratchBufferAllocator newScratchBufferWithMinimumSize:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLIOScratchBuffer newScratchBuffer(final long minimumSize) {
        try {
            long result = (long) MH_newScratchBufferWithMinimumSize_.invokeExact(this.handle, SEL_newScratchBufferWithMinimumSize_, minimumSize);
            return result == 0L ? null : new MTLIOScratchBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
