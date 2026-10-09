package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLMotionKeyframeData}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlmotionkeyframedata">Apple documentation</a>
 */
public class MTLMotionKeyframeData extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLMotionKeyframeData");
    private static final long SEL_CLASS_data = ObjC.selector("data");
    private static final MethodHandle MH_CLASS_data = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_buffer = ObjC.selector("buffer");
    private static final MethodHandle MH_buffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBuffer_ = ObjC.selector("setBuffer:");
    private static final MethodHandle MH_setBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_offset = ObjC.selector("offset");
    private static final MethodHandle MH_offset = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOffset_ = ObjC.selector("setOffset:");
    private static final MethodHandle MH_setOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLMotionKeyframeData(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLMotionKeyframeData alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLMotionKeyframeData alloc() {
        try {
            return new MTLMotionKeyframeData((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMotionKeyframeData init]} */
    public MTLMotionKeyframeData init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLMotionKeyframeData data]} */
    public static MTLMotionKeyframeData data() {
        try {
            long result = (long) MH_CLASS_data.invokeExact(CLS, SEL_CLASS_data);
            return new MTLMotionKeyframeData(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLMotionKeyframeData buffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLBuffer buffer() {
        try {
            long result = (long) MH_buffer.invokeExact(this.handle, SEL_buffer);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMotionKeyframeData setBuffer:]} */
    public void setBuffer(@Nullable final MTLBuffer buffer) {
        try {
            MH_setBuffer_.invokeExact(this.handle, SEL_setBuffer_, buffer == null ? 0L : buffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMotionKeyframeData offset]} */
    public long offset() {
        try {
            return (long) MH_offset.invokeExact(this.handle, SEL_offset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLMotionKeyframeData setOffset:]} */
    public void setOffset(final long offset) {
        try {
            MH_setOffset_.invokeExact(this.handle, SEL_setOffset_, offset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
