package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLCaptureScope}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcapturescope">Apple documentation</a>
 */
public class MTLCaptureScope extends NSObject {
    private static final long SEL_beginScope = ObjC.selector("beginScope");
    private static final MethodHandle MH_beginScope = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_endScope = ObjC.selector("endScope");
    private static final MethodHandle MH_endScope = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_commandQueue = ObjC.selector("commandQueue");
    private static final MethodHandle MH_commandQueue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_mtl4CommandQueue = ObjC.selector("mtl4CommandQueue");
    private static final MethodHandle MH_mtl4CommandQueue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLCaptureScope(final long handle) {
        super(handle);
    }

    /** {@code -[MTLCaptureScope beginScope]} */
    public void beginScope() {
        try {
            MH_beginScope.invokeExact(this.handle, SEL_beginScope);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCaptureScope endScope]} */
    public void endScope() {
        try {
            MH_endScope.invokeExact(this.handle, SEL_endScope);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCaptureScope label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCaptureScope setLabel:]} */
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

    /**
     * {@code -[MTLCaptureScope device]}
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

    /**
     * {@code -[MTLCaptureScope commandQueue]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLCommandQueue commandQueue() {
        try {
            long result = (long) MH_commandQueue.invokeExact(this.handle, SEL_commandQueue);
            return result == 0L ? null : new MTLCommandQueue(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCaptureScope mtl4CommandQueue]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTL4CommandQueue mtl4CommandQueue() {
        try {
            long result = (long) MH_mtl4CommandQueue.invokeExact(this.handle, SEL_mtl4CommandQueue);
            return result == 0L ? null : new MTL4CommandQueue(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
