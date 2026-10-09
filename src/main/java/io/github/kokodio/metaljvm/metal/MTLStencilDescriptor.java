package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLStencilDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlstencildescriptor">Apple documentation</a>
 */
public class MTLStencilDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLStencilDescriptor");
    private static final long SEL_stencilCompareFunction = ObjC.selector("stencilCompareFunction");
    private static final MethodHandle MH_stencilCompareFunction = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStencilCompareFunction_ = ObjC.selector("setStencilCompareFunction:");
    private static final MethodHandle MH_setStencilCompareFunction_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stencilFailureOperation = ObjC.selector("stencilFailureOperation");
    private static final MethodHandle MH_stencilFailureOperation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStencilFailureOperation_ = ObjC.selector("setStencilFailureOperation:");
    private static final MethodHandle MH_setStencilFailureOperation_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_depthFailureOperation = ObjC.selector("depthFailureOperation");
    private static final MethodHandle MH_depthFailureOperation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthFailureOperation_ = ObjC.selector("setDepthFailureOperation:");
    private static final MethodHandle MH_setDepthFailureOperation_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_depthStencilPassOperation = ObjC.selector("depthStencilPassOperation");
    private static final MethodHandle MH_depthStencilPassOperation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthStencilPassOperation_ = ObjC.selector("setDepthStencilPassOperation:");
    private static final MethodHandle MH_setDepthStencilPassOperation_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_readMask = ObjC.selector("readMask");
    private static final MethodHandle MH_readMask = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setReadMask_ = ObjC.selector("setReadMask:");
    private static final MethodHandle MH_setReadMask_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_INT));
    private static final long SEL_writeMask = ObjC.selector("writeMask");
    private static final MethodHandle MH_writeMask = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setWriteMask_ = ObjC.selector("setWriteMask:");
    private static final MethodHandle MH_setWriteMask_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_INT));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLStencilDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLStencilDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLStencilDescriptor alloc() {
        try {
            return new MTLStencilDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStencilDescriptor init]} */
    public MTLStencilDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStencilDescriptor stencilCompareFunction]} */
    public MTLCompareFunction stencilCompareFunction() {
        try {
            return MTLCompareFunction.of((long) MH_stencilCompareFunction.invokeExact(this.handle, SEL_stencilCompareFunction));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStencilDescriptor setStencilCompareFunction:]} */
    public void setStencilCompareFunction(final MTLCompareFunction stencilCompareFunction) {
        try {
            MH_setStencilCompareFunction_.invokeExact(this.handle, SEL_setStencilCompareFunction_, stencilCompareFunction.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStencilDescriptor stencilFailureOperation]} */
    public MTLStencilOperation stencilFailureOperation() {
        try {
            return MTLStencilOperation.of((long) MH_stencilFailureOperation.invokeExact(this.handle, SEL_stencilFailureOperation));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStencilDescriptor setStencilFailureOperation:]} */
    public void setStencilFailureOperation(final MTLStencilOperation stencilFailureOperation) {
        try {
            MH_setStencilFailureOperation_.invokeExact(this.handle, SEL_setStencilFailureOperation_, stencilFailureOperation.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStencilDescriptor depthFailureOperation]} */
    public MTLStencilOperation depthFailureOperation() {
        try {
            return MTLStencilOperation.of((long) MH_depthFailureOperation.invokeExact(this.handle, SEL_depthFailureOperation));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStencilDescriptor setDepthFailureOperation:]} */
    public void setDepthFailureOperation(final MTLStencilOperation depthFailureOperation) {
        try {
            MH_setDepthFailureOperation_.invokeExact(this.handle, SEL_setDepthFailureOperation_, depthFailureOperation.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStencilDescriptor depthStencilPassOperation]} */
    public MTLStencilOperation depthStencilPassOperation() {
        try {
            return MTLStencilOperation.of((long) MH_depthStencilPassOperation.invokeExact(this.handle, SEL_depthStencilPassOperation));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStencilDescriptor setDepthStencilPassOperation:]} */
    public void setDepthStencilPassOperation(final MTLStencilOperation depthStencilPassOperation) {
        try {
            MH_setDepthStencilPassOperation_.invokeExact(this.handle, SEL_setDepthStencilPassOperation_, depthStencilPassOperation.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStencilDescriptor readMask]} */
    public int readMask() {
        try {
            return (int) MH_readMask.invokeExact(this.handle, SEL_readMask);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStencilDescriptor setReadMask:]} */
    public void setReadMask(final int readMask) {
        try {
            MH_setReadMask_.invokeExact(this.handle, SEL_setReadMask_, readMask);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStencilDescriptor writeMask]} */
    public int writeMask() {
        try {
            return (int) MH_writeMask.invokeExact(this.handle, SEL_writeMask);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStencilDescriptor setWriteMask:]} */
    public void setWriteMask(final int writeMask) {
        try {
            MH_setWriteMask_.invokeExact(this.handle, SEL_setWriteMask_, writeMask);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
