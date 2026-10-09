package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLLogState}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtllogstate">Apple documentation</a>
 */
public class MTLLogState extends NSObject {
    private static final long SEL_addLogHandler_ = ObjC.selector("addLogHandler:");
    private static final MethodHandle MH_addLogHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLLogState(final long handle) {
        super(handle);
    }

    /** {@code -[MTLLogState addLogHandler:]} */
    public void addLogHandler(final long block) {
        try {
            MH_addLogHandler_.invokeExact(this.handle, SEL_addLogHandler_, block);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
