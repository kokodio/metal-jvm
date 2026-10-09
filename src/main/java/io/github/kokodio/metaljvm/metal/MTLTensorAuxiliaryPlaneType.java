package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLTensorAuxiliaryPlaneType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltensorauxiliaryplanetype">Apple documentation</a>
 */
public class MTLTensorAuxiliaryPlaneType extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLTensorAuxiliaryPlaneType");
    private static final long SEL_dataType = ObjC.selector("dataType");
    private static final MethodHandle MH_dataType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_blockFactors = ObjC.selector("blockFactors");
    private static final MethodHandle MH_blockFactors = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_planeType = ObjC.selector("planeType");
    private static final MethodHandle MH_planeType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLTensorAuxiliaryPlaneType(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLTensorAuxiliaryPlaneType alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLTensorAuxiliaryPlaneType alloc() {
        try {
            return new MTLTensorAuxiliaryPlaneType((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorAuxiliaryPlaneType init]} */
    public MTLTensorAuxiliaryPlaneType init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorAuxiliaryPlaneType dataType]} */
    public MTLTensorDataType dataType() {
        try {
            return MTLTensorDataType.of((long) MH_dataType.invokeExact(this.handle, SEL_dataType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTensorAuxiliaryPlaneType blockFactors]}
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

    /** {@code -[MTLTensorAuxiliaryPlaneType planeType]} */
    public MTLTensorPlaneType planeType() {
        try {
            return MTLTensorPlaneType.of((long) MH_planeType.invokeExact(this.handle, SEL_planeType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
