package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLCounterSet}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcounterset">Apple documentation</a>
 */
public class MTLCounterSet extends NSObject {
    private static final long SEL_name = ObjC.selector("name");
    private static final MethodHandle MH_name = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_counters = ObjC.selector("counters");
    private static final MethodHandle MH_counters = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLCounterSet(final long handle) {
        super(handle);
    }

    /** {@code -[MTLCounterSet name]} */
    public String name() {
        try {
            long result = (long) MH_name.invokeExact(this.handle, SEL_name);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCounterSet counters]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLCounter> counters() {
        try {
            long result = (long) MH_counters.invokeExact(this.handle, SEL_counters);
            return new NSArray<>(result, MTLCounter::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
