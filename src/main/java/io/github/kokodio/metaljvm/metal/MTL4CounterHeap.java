package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSData;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.foundation.NSRange;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4CounterHeap}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4counterheap">Apple documentation</a>
 */
public class MTL4CounterHeap extends NSObject {
    private static final long SEL_resolveCounterRange_ = ObjC.selector("resolveCounterRange:");
    private static final MethodHandle MH_resolveCounterRange_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_invalidateCounterRange_ = ObjC.selector("invalidateCounterRange:");
    private static final MethodHandle MH_invalidateCounterRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_count = ObjC.selector("count");
    private static final MethodHandle MH_count = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_type = ObjC.selector("type");
    private static final MethodHandle MH_type = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTL4CounterHeap(final long handle) {
        super(handle);
    }

    /**
     * {@code -[MTL4CounterHeap resolveCounterRange:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSData resolveCounterRange(final NSRange range) {
        try {
            long result = (long) MH_resolveCounterRange_.invokeExact(this.handle, SEL_resolveCounterRange_, range.location(), range.length());
            return result == 0L ? null : new NSData(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CounterHeap invalidateCounterRange:]} */
    public void invalidateCounterRange(final NSRange range) {
        try {
            MH_invalidateCounterRange_.invokeExact(this.handle, SEL_invalidateCounterRange_, range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CounterHeap label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CounterHeap setLabel:]} */
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

    /** {@code -[MTL4CounterHeap count]} */
    public long count() {
        try {
            return (long) MH_count.invokeExact(this.handle, SEL_count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CounterHeap type]} */
    public MTL4CounterHeapType type() {
        try {
            return MTL4CounterHeapType.of((long) MH_type.invokeExact(this.handle, SEL_type));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
