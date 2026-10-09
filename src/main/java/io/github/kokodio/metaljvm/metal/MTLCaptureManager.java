package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSErrorException;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLCaptureManager}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcapturemanager">Apple documentation</a>
 */
public class MTLCaptureManager extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLCaptureManager");
    private static final long SEL_CLASS_sharedCaptureManager = ObjC.selector("sharedCaptureManager");
    private static final MethodHandle MH_CLASS_sharedCaptureManager = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");
    private static final MethodHandle MH_init = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newCaptureScopeWithDevice_ = ObjC.selector("newCaptureScopeWithDevice:");
    private static final MethodHandle MH_newCaptureScopeWithDevice_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newCaptureScopeWithCommandQueue_ = ObjC.selector("newCaptureScopeWithCommandQueue:");
    private static final MethodHandle MH_newCaptureScopeWithCommandQueue_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newCaptureScopeWithMTL4CommandQueue_ = ObjC.selector("newCaptureScopeWithMTL4CommandQueue:");
    private static final MethodHandle MH_newCaptureScopeWithMTL4CommandQueue_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportsDestination_ = ObjC.selector("supportsDestination:");
    private static final MethodHandle MH_supportsDestination_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_startCaptureWithDescriptor_error_ = ObjC.selector("startCaptureWithDescriptor:error:");
    private static final MethodHandle MH_startCaptureWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_startCaptureWithDevice_ = ObjC.selector("startCaptureWithDevice:");
    private static final MethodHandle MH_startCaptureWithDevice_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_startCaptureWithCommandQueue_ = ObjC.selector("startCaptureWithCommandQueue:");
    private static final MethodHandle MH_startCaptureWithCommandQueue_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_startCaptureWithScope_ = ObjC.selector("startCaptureWithScope:");
    private static final MethodHandle MH_startCaptureWithScope_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stopCapture = ObjC.selector("stopCapture");
    private static final MethodHandle MH_stopCapture = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_defaultCaptureScope = ObjC.selector("defaultCaptureScope");
    private static final MethodHandle MH_defaultCaptureScope = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDefaultCaptureScope_ = ObjC.selector("setDefaultCaptureScope:");
    private static final MethodHandle MH_setDefaultCaptureScope_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isCapturing = ObjC.selector("isCapturing");
    private static final MethodHandle MH_isCapturing = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLCaptureManager(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLCaptureManager alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLCaptureManager alloc() {
        try {
            return new MTLCaptureManager((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[MTLCaptureManager sharedCaptureManager]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static MTLCaptureManager sharedCaptureManager() {
        try {
            long result = (long) MH_CLASS_sharedCaptureManager.invokeExact(CLS, SEL_CLASS_sharedCaptureManager);
            return new MTLCaptureManager(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCaptureManager init]} */
    public MTLCaptureManager init() {
        try {
            long result = (long) MH_init.invokeExact(this.handle, SEL_init);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCaptureManager newCaptureScopeWithDevice:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLCaptureScope newCaptureScopeWithDevice(final MTLDevice device) {
        try {
            long result = (long) MH_newCaptureScopeWithDevice_.invokeExact(this.handle, SEL_newCaptureScopeWithDevice_, device.handle());
            return new MTLCaptureScope(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCaptureManager newCaptureScopeWithCommandQueue:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLCaptureScope newCaptureScopeWithCommandQueue(final MTLCommandQueue commandQueue) {
        try {
            long result = (long) MH_newCaptureScopeWithCommandQueue_.invokeExact(this.handle, SEL_newCaptureScopeWithCommandQueue_, commandQueue.handle());
            return new MTLCaptureScope(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCaptureManager newCaptureScopeWithMTL4CommandQueue:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLCaptureScope newCaptureScopeWithMTL4CommandQueue(final MTL4CommandQueue commandQueue) {
        try {
            long result = (long) MH_newCaptureScopeWithMTL4CommandQueue_.invokeExact(this.handle, SEL_newCaptureScopeWithMTL4CommandQueue_, commandQueue.handle());
            return new MTLCaptureScope(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCaptureManager supportsDestination:]} */
    public boolean supportsDestination(final MTLCaptureDestination destination) {
        try {
            return (boolean) MH_supportsDestination_.invokeExact(this.handle, SEL_supportsDestination_, destination.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCaptureManager startCaptureWithDescriptor:error:]} */
    public void startCaptureWithDescriptor(final MTLCaptureDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_startCaptureWithDescriptor_error_.invokeExact(this.handle, SEL_startCaptureWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (!result) {
                throw NSErrorException.of("startCaptureWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCaptureManager startCaptureWithDevice:]} */
    public void startCaptureWithDevice(final MTLDevice device) {
        try {
            MH_startCaptureWithDevice_.invokeExact(this.handle, SEL_startCaptureWithDevice_, device.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCaptureManager startCaptureWithCommandQueue:]} */
    public void startCaptureWithCommandQueue(final MTLCommandQueue commandQueue) {
        try {
            MH_startCaptureWithCommandQueue_.invokeExact(this.handle, SEL_startCaptureWithCommandQueue_, commandQueue.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCaptureManager startCaptureWithScope:]} */
    public void startCaptureWithScope(final MTLCaptureScope captureScope) {
        try {
            MH_startCaptureWithScope_.invokeExact(this.handle, SEL_startCaptureWithScope_, captureScope.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCaptureManager stopCapture]} */
    public void stopCapture() {
        try {
            MH_stopCapture.invokeExact(this.handle, SEL_stopCapture);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCaptureManager defaultCaptureScope]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLCaptureScope defaultCaptureScope() {
        try {
            long result = (long) MH_defaultCaptureScope.invokeExact(this.handle, SEL_defaultCaptureScope);
            return result == 0L ? null : new MTLCaptureScope(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCaptureManager setDefaultCaptureScope:]} */
    public void setDefaultCaptureScope(@Nullable final MTLCaptureScope defaultCaptureScope) {
        try {
            MH_setDefaultCaptureScope_.invokeExact(this.handle, SEL_setDefaultCaptureScope_, defaultCaptureScope == null ? 0L : defaultCaptureScope.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCaptureManager isCapturing]} */
    public boolean isCapturing() {
        try {
            return (boolean) MH_isCapturing.invokeExact(this.handle, SEL_isCapturing);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
