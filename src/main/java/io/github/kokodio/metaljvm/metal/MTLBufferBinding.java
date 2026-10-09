package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLBufferBinding}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlbufferbinding">Apple documentation</a>
 */
public class MTLBufferBinding extends MTLBinding {
    private static final long SEL_bufferAlignment = ObjC.selector("bufferAlignment");
    private static final MethodHandle MH_bufferAlignment = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bufferDataSize = ObjC.selector("bufferDataSize");
    private static final MethodHandle MH_bufferDataSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bufferDataType = ObjC.selector("bufferDataType");
    private static final MethodHandle MH_bufferDataType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bufferStructType = ObjC.selector("bufferStructType");
    private static final MethodHandle MH_bufferStructType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bufferPointerType = ObjC.selector("bufferPointerType");
    private static final MethodHandle MH_bufferPointerType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLBufferBinding(final long handle) {
        super(handle);
    }

    /** {@code -[MTLBufferBinding bufferAlignment]} */
    public long bufferAlignment() {
        try {
            return (long) MH_bufferAlignment.invokeExact(this.handle, SEL_bufferAlignment);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBufferBinding bufferDataSize]} */
    public long bufferDataSize() {
        try {
            return (long) MH_bufferDataSize.invokeExact(this.handle, SEL_bufferDataSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBufferBinding bufferDataType]} */
    public MTLDataType bufferDataType() {
        try {
            return MTLDataType.of((long) MH_bufferDataType.invokeExact(this.handle, SEL_bufferDataType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLBufferBinding bufferStructType]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLStructType bufferStructType() {
        try {
            long result = (long) MH_bufferStructType.invokeExact(this.handle, SEL_bufferStructType);
            return result == 0L ? null : new MTLStructType(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLBufferBinding bufferPointerType]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLPointerType bufferPointerType() {
        try {
            long result = (long) MH_bufferPointerType.invokeExact(this.handle, SEL_bufferPointerType);
            return result == 0L ? null : new MTLPointerType(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
