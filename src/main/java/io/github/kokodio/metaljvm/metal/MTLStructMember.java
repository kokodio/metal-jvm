package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLStructMember}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlstructmember">Apple documentation</a>
 */
public class MTLStructMember extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLStructMember");
    private static final long SEL_structType = ObjC.selector("structType");
    private static final MethodHandle MH_structType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_arrayType = ObjC.selector("arrayType");
    private static final MethodHandle MH_arrayType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_textureReferenceType = ObjC.selector("textureReferenceType");
    private static final MethodHandle MH_textureReferenceType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pointerType = ObjC.selector("pointerType");
    private static final MethodHandle MH_pointerType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tensorReferenceType = ObjC.selector("tensorReferenceType");
    private static final MethodHandle MH_tensorReferenceType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_name = ObjC.selector("name");
    private static final MethodHandle MH_name = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_offset = ObjC.selector("offset");
    private static final MethodHandle MH_offset = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dataType = ObjC.selector("dataType");
    private static final MethodHandle MH_dataType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_argumentIndex = ObjC.selector("argumentIndex");
    private static final MethodHandle MH_argumentIndex = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLStructMember(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLStructMember alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLStructMember alloc() {
        try {
            return new MTLStructMember((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStructMember init]} */
    public MTLStructMember init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLStructMember structType]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLStructType structType() {
        try {
            long result = (long) MH_structType.invokeExact(this.handle, SEL_structType);
            return result == 0L ? null : new MTLStructType(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLStructMember arrayType]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLArrayType arrayType() {
        try {
            long result = (long) MH_arrayType.invokeExact(this.handle, SEL_arrayType);
            return result == 0L ? null : new MTLArrayType(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLStructMember textureReferenceType]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTextureReferenceType textureReferenceType() {
        try {
            long result = (long) MH_textureReferenceType.invokeExact(this.handle, SEL_textureReferenceType);
            return result == 0L ? null : new MTLTextureReferenceType(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLStructMember pointerType]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLPointerType pointerType() {
        try {
            long result = (long) MH_pointerType.invokeExact(this.handle, SEL_pointerType);
            return result == 0L ? null : new MTLPointerType(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLStructMember tensorReferenceType]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTensorReferenceType tensorReferenceType() {
        try {
            long result = (long) MH_tensorReferenceType.invokeExact(this.handle, SEL_tensorReferenceType);
            return result == 0L ? null : new MTLTensorReferenceType(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStructMember name]} */
    public String name() {
        try {
            long result = (long) MH_name.invokeExact(this.handle, SEL_name);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStructMember offset]} */
    public long offset() {
        try {
            return (long) MH_offset.invokeExact(this.handle, SEL_offset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStructMember dataType]} */
    public MTLDataType dataType() {
        try {
            return MTLDataType.of((long) MH_dataType.invokeExact(this.handle, SEL_dataType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStructMember argumentIndex]} */
    public long argumentIndex() {
        try {
            return (long) MH_argumentIndex.invokeExact(this.handle, SEL_argumentIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
