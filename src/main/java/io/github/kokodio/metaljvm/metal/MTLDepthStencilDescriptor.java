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
 * {@code MTLDepthStencilDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtldepthstencildescriptor">Apple documentation</a>
 */
public class MTLDepthStencilDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLDepthStencilDescriptor");
    private static final long SEL_depthCompareFunction = ObjC.selector("depthCompareFunction");
    private static final MethodHandle MH_depthCompareFunction = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthCompareFunction_ = ObjC.selector("setDepthCompareFunction:");
    private static final MethodHandle MH_setDepthCompareFunction_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isDepthWriteEnabled = ObjC.selector("isDepthWriteEnabled");
    private static final MethodHandle MH_isDepthWriteEnabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthWriteEnabled_ = ObjC.selector("setDepthWriteEnabled:");
    private static final MethodHandle MH_setDepthWriteEnabled_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_frontFaceStencil = ObjC.selector("frontFaceStencil");
    private static final MethodHandle MH_frontFaceStencil = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFrontFaceStencil_ = ObjC.selector("setFrontFaceStencil:");
    private static final MethodHandle MH_setFrontFaceStencil_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_backFaceStencil = ObjC.selector("backFaceStencil");
    private static final MethodHandle MH_backFaceStencil = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBackFaceStencil_ = ObjC.selector("setBackFaceStencil:");
    private static final MethodHandle MH_setBackFaceStencil_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLDepthStencilDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLDepthStencilDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLDepthStencilDescriptor alloc() {
        try {
            return new MTLDepthStencilDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDepthStencilDescriptor init]} */
    public MTLDepthStencilDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDepthStencilDescriptor depthCompareFunction]} */
    public MTLCompareFunction depthCompareFunction() {
        try {
            return MTLCompareFunction.of((long) MH_depthCompareFunction.invokeExact(this.handle, SEL_depthCompareFunction));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDepthStencilDescriptor setDepthCompareFunction:]} */
    public void setDepthCompareFunction(final MTLCompareFunction depthCompareFunction) {
        try {
            MH_setDepthCompareFunction_.invokeExact(this.handle, SEL_setDepthCompareFunction_, depthCompareFunction.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDepthStencilDescriptor isDepthWriteEnabled]} */
    public boolean isDepthWriteEnabled() {
        try {
            return (boolean) MH_isDepthWriteEnabled.invokeExact(this.handle, SEL_isDepthWriteEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDepthStencilDescriptor setDepthWriteEnabled:]} */
    public void setDepthWriteEnabled(final boolean depthWriteEnabled) {
        try {
            MH_setDepthWriteEnabled_.invokeExact(this.handle, SEL_setDepthWriteEnabled_, depthWriteEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDepthStencilDescriptor frontFaceStencil]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLStencilDescriptor frontFaceStencil() {
        try {
            long result = (long) MH_frontFaceStencil.invokeExact(this.handle, SEL_frontFaceStencil);
            return new MTLStencilDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDepthStencilDescriptor setFrontFaceStencil:]} */
    public void setFrontFaceStencil(@Nullable final MTLStencilDescriptor frontFaceStencil) {
        try {
            MH_setFrontFaceStencil_.invokeExact(this.handle, SEL_setFrontFaceStencil_, frontFaceStencil == null ? 0L : frontFaceStencil.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLDepthStencilDescriptor backFaceStencil]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLStencilDescriptor backFaceStencil() {
        try {
            long result = (long) MH_backFaceStencil.invokeExact(this.handle, SEL_backFaceStencil);
            return new MTLStencilDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDepthStencilDescriptor setBackFaceStencil:]} */
    public void setBackFaceStencil(@Nullable final MTLStencilDescriptor backFaceStencil) {
        try {
            MH_setBackFaceStencil_.invokeExact(this.handle, SEL_setBackFaceStencil_, backFaceStencil == null ? 0L : backFaceStencil.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDepthStencilDescriptor label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLDepthStencilDescriptor setLabel:]} */
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
}
