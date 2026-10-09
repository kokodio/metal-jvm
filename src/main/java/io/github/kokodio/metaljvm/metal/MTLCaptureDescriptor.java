package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.foundation.NSURL;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLCaptureDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcapturedescriptor">Apple documentation</a>
 */
public class MTLCaptureDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLCaptureDescriptor");
    private static final long SEL_captureObject = ObjC.selector("captureObject");
    private static final MethodHandle MH_captureObject = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCaptureObject_ = ObjC.selector("setCaptureObject:");
    private static final MethodHandle MH_setCaptureObject_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_destination = ObjC.selector("destination");
    private static final MethodHandle MH_destination = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDestination_ = ObjC.selector("setDestination:");
    private static final MethodHandle MH_setDestination_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_outputURL = ObjC.selector("outputURL");
    private static final MethodHandle MH_outputURL = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOutputURL_ = ObjC.selector("setOutputURL:");
    private static final MethodHandle MH_setOutputURL_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLCaptureDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLCaptureDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLCaptureDescriptor alloc() {
        try {
            return new MTLCaptureDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCaptureDescriptor init]} */
    public MTLCaptureDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCaptureDescriptor captureObject]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject captureObject() {
        try {
            long result = (long) MH_captureObject.invokeExact(this.handle, SEL_captureObject);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCaptureDescriptor setCaptureObject:]} */
    public void setCaptureObject(@Nullable final NSObject captureObject) {
        try {
            MH_setCaptureObject_.invokeExact(this.handle, SEL_setCaptureObject_, captureObject == null ? 0L : captureObject.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCaptureDescriptor destination]} */
    public MTLCaptureDestination destination() {
        try {
            return MTLCaptureDestination.of((long) MH_destination.invokeExact(this.handle, SEL_destination));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCaptureDescriptor setDestination:]} */
    public void setDestination(final MTLCaptureDestination destination) {
        try {
            MH_setDestination_.invokeExact(this.handle, SEL_setDestination_, destination.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCaptureDescriptor outputURL]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL outputURL() {
        try {
            long result = (long) MH_outputURL.invokeExact(this.handle, SEL_outputURL);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCaptureDescriptor setOutputURL:]} */
    public void setOutputURL(@Nullable final NSURL outputURL) {
        try {
            MH_setOutputURL_.invokeExact(this.handle, SEL_setOutputURL_, outputURL == null ? 0L : outputURL.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
