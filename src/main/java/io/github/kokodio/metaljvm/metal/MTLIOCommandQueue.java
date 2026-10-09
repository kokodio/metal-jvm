package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLIOCommandQueue}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtliocommandqueue">Apple documentation</a>
 */
public class MTLIOCommandQueue extends NSObject {
    private static final long SEL_enqueueBarrier = ObjC.selector("enqueueBarrier");
    private static final MethodHandle MH_enqueueBarrier = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_commandBuffer = ObjC.selector("commandBuffer");
    private static final MethodHandle MH_commandBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_commandBufferWithUnretainedReferences = ObjC.selector("commandBufferWithUnretainedReferences");
    private static final MethodHandle MH_commandBufferWithUnretainedReferences = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLIOCommandQueue(final long handle) {
        super(handle);
    }

    /** {@code -[MTLIOCommandQueue enqueueBarrier]} */
    public void enqueueBarrier() {
        try {
            MH_enqueueBarrier.invokeExact(this.handle, SEL_enqueueBarrier);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLIOCommandQueue commandBuffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLIOCommandBuffer commandBuffer() {
        try {
            long result = (long) MH_commandBuffer.invokeExact(this.handle, SEL_commandBuffer);
            return new MTLIOCommandBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLIOCommandQueue commandBufferWithUnretainedReferences]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLIOCommandBuffer commandBufferWithUnretainedReferences() {
        try {
            long result = (long) MH_commandBufferWithUnretainedReferences.invokeExact(this.handle, SEL_commandBufferWithUnretainedReferences);
            return new MTLIOCommandBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandQueue label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandQueue setLabel:]} */
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
