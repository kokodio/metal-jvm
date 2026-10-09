package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4CommandEncoder}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4commandencoder">Apple documentation</a>
 */
public class MTL4CommandEncoder extends NSObject {
    private static final long SEL_barrierAfterQueueStages_beforeStages_visibilityOptions_ = ObjC.selector("barrierAfterQueueStages:beforeStages:visibilityOptions:");
    private static final MethodHandle MH_barrierAfterQueueStages_beforeStages_visibilityOptions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_barrierAfterStages_beforeQueueStages_visibilityOptions_ = ObjC.selector("barrierAfterStages:beforeQueueStages:visibilityOptions:");
    private static final MethodHandle MH_barrierAfterStages_beforeQueueStages_visibilityOptions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_barrierAfterEncoderStages_beforeEncoderStages_visibilityOptions_ = ObjC.selector("barrierAfterEncoderStages:beforeEncoderStages:visibilityOptions:");
    private static final MethodHandle MH_barrierAfterEncoderStages_beforeEncoderStages_visibilityOptions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_updateFence_afterEncoderStages_ = ObjC.selector("updateFence:afterEncoderStages:");
    private static final MethodHandle MH_updateFence_afterEncoderStages_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_waitForFence_beforeEncoderStages_ = ObjC.selector("waitForFence:beforeEncoderStages:");
    private static final MethodHandle MH_waitForFence_beforeEncoderStages_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_insertDebugSignpost_ = ObjC.selector("insertDebugSignpost:");
    private static final MethodHandle MH_insertDebugSignpost_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pushDebugGroup_ = ObjC.selector("pushDebugGroup:");
    private static final MethodHandle MH_pushDebugGroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_popDebugGroup = ObjC.selector("popDebugGroup");
    private static final MethodHandle MH_popDebugGroup = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_endEncoding = ObjC.selector("endEncoding");
    private static final MethodHandle MH_endEncoding = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_commandBuffer = ObjC.selector("commandBuffer");
    private static final MethodHandle MH_commandBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTL4CommandEncoder(final long handle) {
        super(handle);
    }

    /**
     * {@code -[MTL4CommandEncoder barrierAfterQueueStages:beforeStages:visibilityOptions:]}
     *
     * @param afterQueueStages a combination of {@link MTLStages} flags
     * @param beforeStages a combination of {@link MTLStages} flags
     * @param visibilityOptions a combination of {@link MTL4VisibilityOptions} flags
     */
    public void barrierAfterQueueStages(final long afterQueueStages, final long beforeStages, final long visibilityOptions) {
        try {
            MH_barrierAfterQueueStages_beforeStages_visibilityOptions_.invokeExact(this.handle, SEL_barrierAfterQueueStages_beforeStages_visibilityOptions_, afterQueueStages, beforeStages, visibilityOptions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4CommandEncoder barrierAfterStages:beforeQueueStages:visibilityOptions:]}
     *
     * @param afterStages a combination of {@link MTLStages} flags
     * @param beforeQueueStages a combination of {@link MTLStages} flags
     * @param visibilityOptions a combination of {@link MTL4VisibilityOptions} flags
     */
    public void barrierAfterStages(final long afterStages, final long beforeQueueStages, final long visibilityOptions) {
        try {
            MH_barrierAfterStages_beforeQueueStages_visibilityOptions_.invokeExact(this.handle, SEL_barrierAfterStages_beforeQueueStages_visibilityOptions_, afterStages, beforeQueueStages, visibilityOptions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4CommandEncoder barrierAfterEncoderStages:beforeEncoderStages:visibilityOptions:]}
     *
     * @param afterEncoderStages a combination of {@link MTLStages} flags
     * @param beforeEncoderStages a combination of {@link MTLStages} flags
     * @param visibilityOptions a combination of {@link MTL4VisibilityOptions} flags
     */
    public void barrierAfterEncoderStages(final long afterEncoderStages, final long beforeEncoderStages, final long visibilityOptions) {
        try {
            MH_barrierAfterEncoderStages_beforeEncoderStages_visibilityOptions_.invokeExact(this.handle, SEL_barrierAfterEncoderStages_beforeEncoderStages_visibilityOptions_, afterEncoderStages, beforeEncoderStages, visibilityOptions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4CommandEncoder updateFence:afterEncoderStages:]}
     *
     * @param afterEncoderStages a combination of {@link MTLStages} flags
     */
    public void updateFence(final MTLFence fence, final long afterEncoderStages) {
        try {
            MH_updateFence_afterEncoderStages_.invokeExact(this.handle, SEL_updateFence_afterEncoderStages_, fence.handle(), afterEncoderStages);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4CommandEncoder waitForFence:beforeEncoderStages:]}
     *
     * @param beforeEncoderStages a combination of {@link MTLStages} flags
     */
    public void waitForFence(final MTLFence fence, final long beforeEncoderStages) {
        try {
            MH_waitForFence_beforeEncoderStages_.invokeExact(this.handle, SEL_waitForFence_beforeEncoderStages_, fence.handle(), beforeEncoderStages);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandEncoder insertDebugSignpost:]} */
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

    /** {@code -[MTL4CommandEncoder pushDebugGroup:]} */
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

    /** {@code -[MTL4CommandEncoder popDebugGroup]} */
    public void popDebugGroup() {
        try {
            MH_popDebugGroup.invokeExact(this.handle, SEL_popDebugGroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandEncoder endEncoding]} */
    public void endEncoding() {
        try {
            MH_endEncoding.invokeExact(this.handle, SEL_endEncoding);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandEncoder label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommandEncoder setLabel:]} */
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

    /**
     * {@code -[MTL4CommandEncoder commandBuffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTL4CommandBuffer commandBuffer() {
        try {
            long result = (long) MH_commandBuffer.invokeExact(this.handle, SEL_commandBuffer);
            return result == 0L ? null : new MTL4CommandBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
