package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLFunctionLog}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlfunctionlog">Apple documentation</a>
 */
public class MTLFunctionLog extends NSObject {
    private static final long SEL_type = ObjC.selector("type");
    private static final MethodHandle MH_type = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_encoderLabel = ObjC.selector("encoderLabel");
    private static final MethodHandle MH_encoderLabel = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_function = ObjC.selector("function");
    private static final MethodHandle MH_function = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_debugLocation = ObjC.selector("debugLocation");
    private static final MethodHandle MH_debugLocation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLFunctionLog(final long handle) {
        super(handle);
    }

    /** {@code -[MTLFunctionLog type]} */
    public MTLFunctionLogType type() {
        try {
            return MTLFunctionLogType.of((long) MH_type.invokeExact(this.handle, SEL_type));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionLog encoderLabel]} */
    @Nullable
    public String encoderLabel() {
        try {
            long result = (long) MH_encoderLabel.invokeExact(this.handle, SEL_encoderLabel);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFunctionLog function]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLFunction function() {
        try {
            long result = (long) MH_function.invokeExact(this.handle, SEL_function);
            return result == 0L ? null : new MTLFunction(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFunctionLog debugLocation]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLFunctionLogDebugLocation debugLocation() {
        try {
            long result = (long) MH_debugLocation.invokeExact(this.handle, SEL_debugLocation);
            return result == 0L ? null : new MTLFunctionLogDebugLocation(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
