package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLSharedEventListener}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlsharedeventlistener">Apple documentation</a>
 */
public class MTLSharedEventListener extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLSharedEventListener");
    private static final long SEL_init = ObjC.selector("init");
    private static final MethodHandle MH_init = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithDispatchQueue_ = ObjC.selector("initWithDispatchQueue:");
    private static final MethodHandle MH_initWithDispatchQueue_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_sharedListener = ObjC.selector("sharedListener");
    private static final MethodHandle MH_CLASS_sharedListener = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dispatchQueue = ObjC.selector("dispatchQueue");
    private static final MethodHandle MH_dispatchQueue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLSharedEventListener(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLSharedEventListener alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLSharedEventListener alloc() {
        try {
            return new MTLSharedEventListener((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSharedEventListener init]} */
    public MTLSharedEventListener init() {
        try {
            long result = (long) MH_init.invokeExact(this.handle, SEL_init);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSharedEventListener initWithDispatchQueue:]} */
    public MTLSharedEventListener initWithDispatchQueue(final long dispatchQueue) {
        try {
            long result = (long) MH_initWithDispatchQueue_.invokeExact(this.handle, SEL_initWithDispatchQueue_, dispatchQueue);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[MTLSharedEventListener sharedListener]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static MTLSharedEventListener sharedListener() {
        try {
            long result = (long) MH_CLASS_sharedListener.invokeExact(CLS, SEL_CLASS_sharedListener);
            return new MTLSharedEventListener(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSharedEventListener dispatchQueue]} */
    public long dispatchQueue() {
        try {
            return (long) MH_dispatchQueue.invokeExact(this.handle, SEL_dispatchQueue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
