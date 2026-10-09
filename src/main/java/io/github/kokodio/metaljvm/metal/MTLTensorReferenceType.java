package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLTensorReferenceType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltensorreferencetype">Apple documentation</a>
 */
public class MTLTensorReferenceType extends MTLType {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLTensorReferenceType");
    private static final long SEL_tensorDataType = ObjC.selector("tensorDataType");
    private static final MethodHandle MH_tensorDataType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indexType = ObjC.selector("indexType");
    private static final MethodHandle MH_indexType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dimensions = ObjC.selector("dimensions");
    private static final MethodHandle MH_dimensions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_auxiliaryPlanes = ObjC.selector("auxiliaryPlanes");
    private static final MethodHandle MH_auxiliaryPlanes = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_access = ObjC.selector("access");
    private static final MethodHandle MH_access = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLTensorReferenceType(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLTensorReferenceType alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLTensorReferenceType alloc() {
        try {
            return new MTLTensorReferenceType((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorReferenceType init]} */
    public MTLTensorReferenceType init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorReferenceType tensorDataType]} */
    public MTLTensorDataType tensorDataType() {
        try {
            return MTLTensorDataType.of((long) MH_tensorDataType.invokeExact(this.handle, SEL_tensorDataType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorReferenceType indexType]} */
    public MTLDataType indexType() {
        try {
            return MTLDataType.of((long) MH_indexType.invokeExact(this.handle, SEL_indexType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTensorReferenceType dimensions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTensorExtents dimensions() {
        try {
            long result = (long) MH_dimensions.invokeExact(this.handle, SEL_dimensions);
            return result == 0L ? null : new MTLTensorExtents(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTensorReferenceType auxiliaryPlanes]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLTensorAuxiliaryPlaneType> auxiliaryPlanes() {
        try {
            long result = (long) MH_auxiliaryPlanes.invokeExact(this.handle, SEL_auxiliaryPlanes);
            return new NSArray<>(result, MTLTensorAuxiliaryPlaneType::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorReferenceType access]} */
    public MTLBindingAccess access() {
        try {
            return MTLBindingAccess.of((long) MH_access.invokeExact(this.handle, SEL_access));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
