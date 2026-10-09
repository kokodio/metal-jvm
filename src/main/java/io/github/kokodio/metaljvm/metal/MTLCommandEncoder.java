package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLCommandEncoder}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcommandencoder">Apple documentation</a>
 */
public class MTLCommandEncoder extends NSObject {
    private static final long SEL_endEncoding = ObjC.selector("endEncoding");
    private static final MethodHandle MH_endEncoding = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_barrierAfterQueueStages_beforeStages_ = ObjC.selector("barrierAfterQueueStages:beforeStages:");
    private static final MethodHandle MH_barrierAfterQueueStages_beforeStages_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_insertDebugSignpost_ = ObjC.selector("insertDebugSignpost:");
    private static final MethodHandle MH_insertDebugSignpost_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pushDebugGroup_ = ObjC.selector("pushDebugGroup:");
    private static final MethodHandle MH_pushDebugGroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_popDebugGroup = ObjC.selector("popDebugGroup");
    private static final MethodHandle MH_popDebugGroup = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLCommandEncoder(final long handle) {
        super(handle);
    }

    /** {@code -[MTLCommandEncoder endEncoding]} */
    public void endEncoding() {
        try {
            MH_endEncoding.invokeExact(this.handle, SEL_endEncoding);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandEncoder barrierAfterQueueStages:beforeStages:]}
     *
     * @param afterQueueStages a combination of {@link MTLStages} flags
     * @param beforeStages a combination of {@link MTLStages} flags
     */
    public void barrierAfterQueueStages(final long afterQueueStages, final long beforeStages) {
        try {
            MH_barrierAfterQueueStages_beforeStages_.invokeExact(this.handle, SEL_barrierAfterQueueStages_beforeStages_, afterQueueStages, beforeStages);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandEncoder insertDebugSignpost:]} */
    public void insertDebugSignpost(final String string) {
        final long nsString = ObjC.nsString(string);
        try {
            MH_insertDebugSignpost_.invokeExact(this.handle, SEL_insertDebugSignpost_, nsString);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsString);
        }
    }

    /** {@code -[MTLCommandEncoder pushDebugGroup:]} */
    public void pushDebugGroup(final String string) {
        final long nsString = ObjC.nsString(string);
        try {
            MH_pushDebugGroup_.invokeExact(this.handle, SEL_pushDebugGroup_, nsString);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsString);
        }
    }

    /** {@code -[MTLCommandEncoder popDebugGroup]} */
    public void popDebugGroup() {
        try {
            MH_popDebugGroup.invokeExact(this.handle, SEL_popDebugGroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandEncoder device]}
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

    /** {@code -[MTLCommandEncoder label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandEncoder setLabel:]} */
    public void setLabel(@Nullable final String label) {
        final long nsLabel = label == null ? 0L : ObjC.nsString(label);
        try {
            MH_setLabel_.invokeExact(this.handle, SEL_setLabel_, nsLabel);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsLabel);
        }
    }
}
