package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4CompilerTask}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4compilertask">Apple documentation</a>
 */
public class MTL4CompilerTask extends NSObject {
    private static final long SEL_waitUntilCompleted = ObjC.selector("waitUntilCompleted");
    private static final MethodHandle MH_waitUntilCompleted = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_compiler = ObjC.selector("compiler");
    private static final MethodHandle MH_compiler = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_status = ObjC.selector("status");
    private static final MethodHandle MH_status = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTL4CompilerTask(final long handle) {
        super(handle);
    }

    /** {@code -[MTL4CompilerTask waitUntilCompleted]} */
    public void waitUntilCompleted() {
        try {
            MH_waitUntilCompleted.invokeExact(this.handle, SEL_waitUntilCompleted);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4CompilerTask compiler]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTL4Compiler compiler() {
        try {
            long result = (long) MH_compiler.invokeExact(this.handle, SEL_compiler);
            return new MTL4Compiler(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CompilerTask status]} */
    public MTL4CompilerTaskStatus status() {
        try {
            return MTL4CompilerTaskStatus.of((long) MH_status.invokeExact(this.handle, SEL_status));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
