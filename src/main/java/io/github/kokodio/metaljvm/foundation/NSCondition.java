package io.github.kokodio.metaljvm.foundation;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code NSCondition}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nscondition">Apple documentation</a>
 */
public class NSCondition extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Foundation");
    private static final long CLS = ObjC.clazz("NSCondition");
    private static final long SEL_wait = ObjC.selector("wait");
    private static final MethodHandle MH_wait = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_waitUntilDate_ = ObjC.selector("waitUntilDate:");
    private static final MethodHandle MH_waitUntilDate_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_signal = ObjC.selector("signal");
    private static final MethodHandle MH_signal = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_broadcast = ObjC.selector("broadcast");
    private static final MethodHandle MH_broadcast = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_name = ObjC.selector("name");
    private static final MethodHandle MH_name = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setName_ = ObjC.selector("setName:");
    private static final MethodHandle MH_setName_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_lock = ObjC.selector("lock");
    private static final MethodHandle MH_lock = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_unlock = ObjC.selector("unlock");
    private static final MethodHandle MH_unlock = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public NSCondition(final long handle) {
        super(handle);
    }

    /**
     * {@code +[NSCondition alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static NSCondition alloc() {
        try {
            return new NSCondition((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSCondition init]} */
    public NSCondition init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSCondition wait]} */
    public void wait_() {
        try {
            MH_wait.invokeExact(this.handle, SEL_wait);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSCondition waitUntilDate:]} */
    public boolean waitUntilDate(final NSDate limit) {
        try {
            return (boolean) MH_waitUntilDate_.invokeExact(this.handle, SEL_waitUntilDate_, limit.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSCondition signal]} */
    public void signal() {
        try {
            MH_signal.invokeExact(this.handle, SEL_signal);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSCondition broadcast]} */
    public void broadcast() {
        try {
            MH_broadcast.invokeExact(this.handle, SEL_broadcast);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSCondition name]} */
    @Nullable
    public String name() {
        try {
            long result = (long) MH_name.invokeExact(this.handle, SEL_name);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSCondition setName:]} */
    public void setName(@Nullable final String name) {
        final long nsName = name == null ? 0L : ObjC.nsString(name);
        try {
            MH_setName_.invokeExact(this.handle, SEL_setName_, nsName);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
        }
    }

    /** {@code -[NSCondition lock]} */
    public void lock() {
        try {
            MH_lock.invokeExact(this.handle, SEL_lock);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSCondition unlock]} */
    public void unlock() {
        try {
            MH_unlock.invokeExact(this.handle, SEL_unlock);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
