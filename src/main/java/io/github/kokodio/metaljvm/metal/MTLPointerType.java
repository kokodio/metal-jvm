package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLPointerType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlpointertype">Apple documentation</a>
 */
public class MTLPointerType extends MTLType {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLPointerType");
    private static final long SEL_elementStructType = ObjC.selector("elementStructType");
    private static final MethodHandle MH_elementStructType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_elementArrayType = ObjC.selector("elementArrayType");
    private static final MethodHandle MH_elementArrayType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_elementType = ObjC.selector("elementType");
    private static final MethodHandle MH_elementType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_access = ObjC.selector("access");
    private static final MethodHandle MH_access = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alignment = ObjC.selector("alignment");
    private static final MethodHandle MH_alignment = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dataSize = ObjC.selector("dataSize");
    private static final MethodHandle MH_dataSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_elementIsArgumentBuffer = ObjC.selector("elementIsArgumentBuffer");
    private static final MethodHandle MH_elementIsArgumentBuffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLPointerType(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLPointerType alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLPointerType alloc() {
        try {
            return new MTLPointerType((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLPointerType init]} */
    public MTLPointerType init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLPointerType elementStructType]}
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
     * {@code -[MTLPointerType elementArrayType]}
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

    /** {@code -[MTLPointerType elementType]} */
    public MTLDataType elementType() {
        try {
            return MTLDataType.of((long) MH_elementType.invokeExact(this.handle, SEL_elementType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLPointerType access]} */
    public MTLBindingAccess access() {
        try {
            return MTLBindingAccess.of((long) MH_access.invokeExact(this.handle, SEL_access));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLPointerType alignment]} */
    public long alignment() {
        try {
            return (long) MH_alignment.invokeExact(this.handle, SEL_alignment);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLPointerType dataSize]} */
    public long dataSize() {
        try {
            return (long) MH_dataSize.invokeExact(this.handle, SEL_dataSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLPointerType elementIsArgumentBuffer]} */
    public boolean elementIsArgumentBuffer() {
        try {
            return (boolean) MH_elementIsArgumentBuffer.invokeExact(this.handle, SEL_elementIsArgumentBuffer);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
