package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLThreadgroupBinding}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlthreadgroupbinding">Apple documentation</a>
 */
public class MTLThreadgroupBinding extends MTLBinding {
    private static final long SEL_threadgroupMemoryAlignment = ObjC.selector("threadgroupMemoryAlignment");
    private static final MethodHandle MH_threadgroupMemoryAlignment = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_threadgroupMemoryDataSize = ObjC.selector("threadgroupMemoryDataSize");
    private static final MethodHandle MH_threadgroupMemoryDataSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLThreadgroupBinding(final long handle) {
        super(handle);
    }

    /** {@code -[MTLThreadgroupBinding threadgroupMemoryAlignment]} */
    public long threadgroupMemoryAlignment() {
        try {
            return (long) MH_threadgroupMemoryAlignment.invokeExact(this.handle, SEL_threadgroupMemoryAlignment);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLThreadgroupBinding threadgroupMemoryDataSize]} */
    public long threadgroupMemoryDataSize() {
        try {
            return (long) MH_threadgroupMemoryDataSize.invokeExact(this.handle, SEL_threadgroupMemoryDataSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
