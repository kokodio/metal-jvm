package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLCommandBufferDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcommandbufferdescriptor">Apple documentation</a>
 */
public class MTLCommandBufferDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLCommandBufferDescriptor");
    private static final long SEL_retainedReferences = ObjC.selector("retainedReferences");
    private static final MethodHandle MH_retainedReferences = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRetainedReferences_ = ObjC.selector("setRetainedReferences:");
    private static final MethodHandle MH_setRetainedReferences_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_errorOptions = ObjC.selector("errorOptions");
    private static final MethodHandle MH_errorOptions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setErrorOptions_ = ObjC.selector("setErrorOptions:");
    private static final MethodHandle MH_setErrorOptions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_logState = ObjC.selector("logState");
    private static final MethodHandle MH_logState = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLogState_ = ObjC.selector("setLogState:");
    private static final MethodHandle MH_setLogState_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLCommandBufferDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLCommandBufferDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLCommandBufferDescriptor alloc() {
        try {
            return new MTLCommandBufferDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBufferDescriptor init]} */
    public MTLCommandBufferDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBufferDescriptor retainedReferences]} */
    public boolean retainedReferences() {
        try {
            return (boolean) MH_retainedReferences.invokeExact(this.handle, SEL_retainedReferences);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBufferDescriptor setRetainedReferences:]} */
    public void setRetainedReferences(final boolean retainedReferences) {
        try {
            MH_setRetainedReferences_.invokeExact(this.handle, SEL_setRetainedReferences_, retainedReferences);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandBufferDescriptor errorOptions]}
     *
     * @return a combination of {@link MTLCommandBufferErrorOption} flags
     */
    public long errorOptions() {
        try {
            return (long) MH_errorOptions.invokeExact(this.handle, SEL_errorOptions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandBufferDescriptor setErrorOptions:]}
     *
     * @param errorOptions a combination of {@link MTLCommandBufferErrorOption} flags
     */
    public void setErrorOptions(final long errorOptions) {
        try {
            MH_setErrorOptions_.invokeExact(this.handle, SEL_setErrorOptions_, errorOptions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandBufferDescriptor logState]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLLogState logState() {
        try {
            long result = (long) MH_logState.invokeExact(this.handle, SEL_logState);
            return result == 0L ? null : new MTLLogState(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandBufferDescriptor setLogState:]} */
    public void setLogState(@Nullable final MTLLogState logState) {
        try {
            MH_setLogState_.invokeExact(this.handle, SEL_setLogState_, logState == null ? 0L : logState.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
