package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLSharedEvent}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlsharedevent">Apple documentation</a>
 */
public class MTLSharedEvent extends MTLEvent {
    private static final long SEL_notifyListener_atValue_block_ = ObjC.selector("notifyListener:atValue:block:");
    private static final MethodHandle MH_notifyListener_atValue_block_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newSharedEventHandle = ObjC.selector("newSharedEventHandle");
    private static final MethodHandle MH_newSharedEventHandle = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_waitUntilSignaledValue_timeoutMS_ = ObjC.selector("waitUntilSignaledValue:timeoutMS:");
    private static final MethodHandle MH_waitUntilSignaledValue_timeoutMS_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_signaledValue = ObjC.selector("signaledValue");
    private static final MethodHandle MH_signaledValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSignaledValue_ = ObjC.selector("setSignaledValue:");
    private static final MethodHandle MH_setSignaledValue_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLSharedEvent(final long handle) {
        super(handle);
    }

    /** {@code -[MTLSharedEvent notifyListener:atValue:block:]} */
    public void notifyListener(final MTLSharedEventListener listener, final long value, final long block) {
        try {
            MH_notifyListener_atValue_block_.invokeExact(this.handle, SEL_notifyListener_atValue_block_, listener.handle(), value, block);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLSharedEvent newSharedEventHandle]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLSharedEventHandle newSharedEventHandle() {
        try {
            long result = (long) MH_newSharedEventHandle.invokeExact(this.handle, SEL_newSharedEventHandle);
            return new MTLSharedEventHandle(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSharedEvent waitUntilSignaledValue:timeoutMS:]} */
    public boolean waitUntilSignaledValue(final long value, final long milliseconds) {
        try {
            return (boolean) MH_waitUntilSignaledValue_timeoutMS_.invokeExact(this.handle, SEL_waitUntilSignaledValue_timeoutMS_, value, milliseconds);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSharedEvent signaledValue]} */
    public long signaledValue() {
        try {
            return (long) MH_signaledValue.invokeExact(this.handle, SEL_signaledValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSharedEvent setSignaledValue:]} */
    public void setSignaledValue(final long signaledValue) {
        try {
            MH_setSignaledValue_.invokeExact(this.handle, SEL_setSignaledValue_, signaledValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
