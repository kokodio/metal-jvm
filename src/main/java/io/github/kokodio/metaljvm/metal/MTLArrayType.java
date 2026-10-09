package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLArrayType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlarraytype">Apple documentation</a>
 */
public class MTLArrayType extends MTLType {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLArrayType");
    private static final long SEL_elementStructType = ObjC.selector("elementStructType");
    private static final MethodHandle MH_elementStructType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_elementArrayType = ObjC.selector("elementArrayType");
    private static final MethodHandle MH_elementArrayType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_elementTextureReferenceType = ObjC.selector("elementTextureReferenceType");
    private static final MethodHandle MH_elementTextureReferenceType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_elementPointerType = ObjC.selector("elementPointerType");
    private static final MethodHandle MH_elementPointerType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_elementTensorReferenceType = ObjC.selector("elementTensorReferenceType");
    private static final MethodHandle MH_elementTensorReferenceType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_elementType = ObjC.selector("elementType");
    private static final MethodHandle MH_elementType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_arrayLength = ObjC.selector("arrayLength");
    private static final MethodHandle MH_arrayLength = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stride = ObjC.selector("stride");
    private static final MethodHandle MH_stride = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_argumentIndexStride = ObjC.selector("argumentIndexStride");
    private static final MethodHandle MH_argumentIndexStride = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLArrayType(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLArrayType alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLArrayType alloc() {
        try {
            return new MTLArrayType((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArrayType init]} */
    public MTLArrayType init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLArrayType elementStructType]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLStructType elementStructType() {
        try {
            long result = (long) MH_elementStructType.invokeExact(this.handle, SEL_elementStructType);
            return result == 0L ? null : new MTLStructType(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLArrayType elementArrayType]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLArrayType elementArrayType() {
        try {
            long result = (long) MH_elementArrayType.invokeExact(this.handle, SEL_elementArrayType);
            return result == 0L ? null : new MTLArrayType(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLArrayType elementTextureReferenceType]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTextureReferenceType elementTextureReferenceType() {
        try {
            long result = (long) MH_elementTextureReferenceType.invokeExact(this.handle, SEL_elementTextureReferenceType);
            return result == 0L ? null : new MTLTextureReferenceType(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLArrayType elementPointerType]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLPointerType elementPointerType() {
        try {
            long result = (long) MH_elementPointerType.invokeExact(this.handle, SEL_elementPointerType);
            return result == 0L ? null : new MTLPointerType(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLArrayType elementTensorReferenceType]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTensorReferenceType elementTensorReferenceType() {
        try {
            long result = (long) MH_elementTensorReferenceType.invokeExact(this.handle, SEL_elementTensorReferenceType);
            return result == 0L ? null : new MTLTensorReferenceType(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArrayType elementType]} */
    public MTLDataType elementType() {
        try {
            return MTLDataType.of((long) MH_elementType.invokeExact(this.handle, SEL_elementType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArrayType arrayLength]} */
    public long arrayLength() {
        try {
            return (long) MH_arrayLength.invokeExact(this.handle, SEL_arrayLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArrayType stride]} */
    public long stride() {
        try {
            return (long) MH_stride.invokeExact(this.handle, SEL_stride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArrayType argumentIndexStride]} */
    public long argumentIndexStride() {
        try {
            return (long) MH_argumentIndexStride.invokeExact(this.handle, SEL_argumentIndexStride);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
