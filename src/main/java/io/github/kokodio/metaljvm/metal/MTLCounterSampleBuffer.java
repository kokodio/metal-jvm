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
 * {@code MTLCounterSampleBuffer}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcountersamplebuffer">Apple documentation</a>
 */
public class MTLCounterSampleBuffer extends NSObject {
    private static final long SEL_resolveCounterRange_ = ObjC.selector("resolveCounterRange:");
    private static final MethodHandle MH_resolveCounterRange_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sampleCount = ObjC.selector("sampleCount");
    private static final MethodHandle MH_sampleCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLCounterSampleBuffer(final long handle) {
        super(handle);
    }

    /**
     * {@code -[MTLCounterSampleBuffer resolveCounterRange:]}
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

    /**
     * {@code -[MTLCounterSampleBuffer device]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLDevice device() {
        try {
            long result = (long) MH_device.invokeExact(this.handle, SEL_device);
            return new MTLDevice(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCounterSampleBuffer label]} */
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCounterSampleBuffer sampleCount]} */
    public long sampleCount() {
        try {
            return (long) MH_sampleCount.invokeExact(this.handle, SEL_sampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
