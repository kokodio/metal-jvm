package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLTensorAuxiliaryPlaneDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltensorauxiliaryplanedescriptor">Apple documentation</a>
 */
public class MTLTensorAuxiliaryPlaneDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLTensorAuxiliaryPlaneDescriptor");
    private static final long SEL_dataType = ObjC.selector("dataType");
    private static final MethodHandle MH_dataType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDataType_ = ObjC.selector("setDataType:");
    private static final MethodHandle MH_setDataType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_blockFactors = ObjC.selector("blockFactors");
    private static final MethodHandle MH_blockFactors = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBlockFactors_ = ObjC.selector("setBlockFactors:");
    private static final MethodHandle MH_setBlockFactors_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLTensorAuxiliaryPlaneDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLTensorAuxiliaryPlaneDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLTensorAuxiliaryPlaneDescriptor alloc() {
        try {
            return new MTLTensorAuxiliaryPlaneDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorAuxiliaryPlaneDescriptor init]} */
    public MTLTensorAuxiliaryPlaneDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorAuxiliaryPlaneDescriptor dataType]} */
    public MTLTensorDataType dataType() {
        try {
            return MTLTensorDataType.of((long) MH_dataType.invokeExact(this.handle, SEL_dataType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorAuxiliaryPlaneDescriptor setDataType:]} */
    public void setDataType(final MTLTensorDataType dataType) {
        try {
            MH_setDataType_.invokeExact(this.handle, SEL_setDataType_, dataType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTensorAuxiliaryPlaneDescriptor blockFactors]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLTensorExtents blockFactors() {
        try {
            long result = (long) MH_blockFactors.invokeExact(this.handle, SEL_blockFactors);
            return new MTLTensorExtents(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorAuxiliaryPlaneDescriptor setBlockFactors:]} */
    public void setBlockFactors(final MTLTensorExtents blockFactors) {
        try {
            MH_setBlockFactors_.invokeExact(this.handle, SEL_setBlockFactors_, blockFactors.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
