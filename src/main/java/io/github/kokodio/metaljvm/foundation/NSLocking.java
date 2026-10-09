package io.github.kokodio.metaljvm.foundation;

import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code NSLocking}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nslocking">Apple documentation</a>
 */
public class NSLocking extends NSObject {
    private static final long SEL_lock = ObjC.selector("lock");
    private static final MethodHandle MH_lock = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_unlock = ObjC.selector("unlock");
    private static final MethodHandle MH_unlock = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));

    public NSLocking(final long handle) {
        super(handle);
    }

    /** {@code -[NSLocking lock]} */
    public void lock() {
        try {
            MH_lock.invokeExact(this.handle, SEL_lock);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSLocking unlock]} */
    public void unlock() {
        try {
            MH_unlock.invokeExact(this.handle, SEL_unlock);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
