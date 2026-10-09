package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSError;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4CommitFeedback}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4commitfeedback">Apple documentation</a>
 */
public class MTL4CommitFeedback extends NSObject {
    private static final long SEL_error = ObjC.selector("error");
    private static final MethodHandle MH_error = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_GPUStartTime = ObjC.selector("GPUStartTime");
    private static final MethodHandle MH_GPUStartTime = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_GPUEndTime = ObjC.selector("GPUEndTime");
    private static final MethodHandle MH_GPUEndTime = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));

    public MTL4CommitFeedback(final long handle) {
        super(handle);
    }

    /**
     * {@code -[MTL4CommitFeedback error]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSError error() {
        try {
            long result = (long) MH_error.invokeExact(this.handle, SEL_error);
            return result == 0L ? null : new NSError(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommitFeedback GPUStartTime]} */
    public double GPUStartTime() {
        try {
            return (double) MH_GPUStartTime.invokeExact(this.handle, SEL_GPUStartTime);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommitFeedback GPUEndTime]} */
    public double GPUEndTime() {
        try {
            return (double) MH_GPUEndTime.invokeExact(this.handle, SEL_GPUEndTime);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
