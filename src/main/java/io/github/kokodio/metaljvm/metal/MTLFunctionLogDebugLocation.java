package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.foundation.NSURL;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLFunctionLogDebugLocation}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlfunctionlogdebuglocation">Apple documentation</a>
 */
public class MTLFunctionLogDebugLocation extends NSObject {
    private static final long SEL_functionName = ObjC.selector("functionName");
    private static final MethodHandle MH_functionName = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_URL = ObjC.selector("URL");
    private static final MethodHandle MH_URL = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_line = ObjC.selector("line");
    private static final MethodHandle MH_line = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_column = ObjC.selector("column");
    private static final MethodHandle MH_column = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLFunctionLogDebugLocation(final long handle) {
        super(handle);
    }

    /** {@code -[MTLFunctionLogDebugLocation functionName]} */
    @Nullable
    public String functionName() {
        try {
            long result = (long) MH_functionName.invokeExact(this.handle, SEL_functionName);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFunctionLogDebugLocation URL]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL URL() {
        try {
            long result = (long) MH_URL.invokeExact(this.handle, SEL_URL);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionLogDebugLocation line]} */
    public long line() {
        try {
            return (long) MH_line.invokeExact(this.handle, SEL_line);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionLogDebugLocation column]} */
    public long column() {
        try {
            return (long) MH_column.invokeExact(this.handle, SEL_column);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
