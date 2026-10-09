package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.foundation.NSString;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLCommandBufferEncoderInfo}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcommandbufferencoderinfo">Apple documentation</a>
 */
public class MTLCommandBufferEncoderInfo extends NSObject {
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_debugSignposts = ObjC.selector("debugSignposts");
    private static final MethodHandle MH_debugSignposts = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_errorState = ObjC.selector("errorState");
    private static final MethodHandle MH_errorState = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLCommandBufferEncoderInfo(final long handle) {
        super(handle);
    }

    /** {@code -[MTLCommandBufferEncoderInfo label]} */
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandBufferEncoderInfo debugSignposts]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<NSString> debugSignposts() {
        try {
            long result = (long) MH_debugSignposts.invokeExact(this.handle, SEL_debugSignposts);
            return new NSArray<>(result, NSString::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBufferEncoderInfo errorState]} */
    public MTLCommandEncoderErrorState errorState() {
        try {
            return MTLCommandEncoderErrorState.of((long) MH_errorState.invokeExact(this.handle, SEL_errorState));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
