package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLDrawable}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtldrawable">Apple documentation</a>
 */
public class MTLDrawable extends NSObject {
    private static final long SEL_present = ObjC.selector("present");
    private static final MethodHandle MH_present = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_presentAtTime_ = ObjC.selector("presentAtTime:");
    private static final MethodHandle MH_presentAtTime_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_presentAfterMinimumDuration_ = ObjC.selector("presentAfterMinimumDuration:");
    private static final MethodHandle MH_presentAfterMinimumDuration_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_addPresentedHandler_ = ObjC.selector("addPresentedHandler:");
    private static final MethodHandle MH_addPresentedHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_presentedTime = ObjC.selector("presentedTime");
    private static final MethodHandle MH_presentedTime = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawableID = ObjC.selector("drawableID");
    private static final MethodHandle MH_drawableID = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLDrawable(final long handle) {
        super(handle);
    }

    /** {@code -[MTLDrawable present]} */
    public void present() {
        try {
            MH_present.invokeExact(this.handle, SEL_present);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDrawable presentAtTime:]} */
    public void presentAtTime(final double presentationTime) {
        try {
            MH_presentAtTime_.invokeExact(this.handle, SEL_presentAtTime_, presentationTime);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDrawable presentAfterMinimumDuration:]} */
    public void presentAfterMinimumDuration(final double duration) {
        try {
            MH_presentAfterMinimumDuration_.invokeExact(this.handle, SEL_presentAfterMinimumDuration_, duration);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDrawable addPresentedHandler:]} */
    public void addPresentedHandler(final long block) {
        try {
            MH_addPresentedHandler_.invokeExact(this.handle, SEL_addPresentedHandler_, block);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDrawable presentedTime]} */
    public double presentedTime() {
        try {
            return (double) MH_presentedTime.invokeExact(this.handle, SEL_presentedTime);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDrawable drawableID]} */
    public long drawableID() {
        try {
            return (long) MH_drawableID.invokeExact(this.handle, SEL_drawableID);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
