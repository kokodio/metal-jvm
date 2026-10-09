package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLTensorAuxiliaryPlaneDescriptorMap}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltensorauxiliaryplanedescriptormap">Apple documentation</a>
 */
public class MTLTensorAuxiliaryPlaneDescriptorMap extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLTensorAuxiliaryPlaneDescriptorMap");
    private static final long SEL_setDescriptor_forPlane_ = ObjC.selector("setDescriptor:forPlane:");
    private static final MethodHandle MH_setDescriptor_forPlane_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_descriptorForPlane_ = ObjC.selector("descriptorForPlane:");
    private static final MethodHandle MH_descriptorForPlane_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_reset = ObjC.selector("reset");
    private static final MethodHandle MH_reset = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLTensorAuxiliaryPlaneDescriptorMap(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLTensorAuxiliaryPlaneDescriptorMap alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLTensorAuxiliaryPlaneDescriptorMap alloc() {
        try {
            return new MTLTensorAuxiliaryPlaneDescriptorMap((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorAuxiliaryPlaneDescriptorMap init]} */
    public MTLTensorAuxiliaryPlaneDescriptorMap init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorAuxiliaryPlaneDescriptorMap setDescriptor:forPlane:]} */
    public void setDescriptor(final MTLTensorAuxiliaryPlaneDescriptor descriptor, final MTLTensorPlaneType plane) {
        try {
            MH_setDescriptor_forPlane_.invokeExact(this.handle, SEL_setDescriptor_forPlane_, descriptor.handle(), plane.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTensorAuxiliaryPlaneDescriptorMap descriptorForPlane:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTensorAuxiliaryPlaneDescriptor descriptorForPlane(final MTLTensorPlaneType plane) {
        try {
            long result = (long) MH_descriptorForPlane_.invokeExact(this.handle, SEL_descriptorForPlane_, plane.value);
            return result == 0L ? null : new MTLTensorAuxiliaryPlaneDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorAuxiliaryPlaneDescriptorMap reset]} */
    public void reset() {
        try {
            MH_reset.invokeExact(this.handle, SEL_reset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
