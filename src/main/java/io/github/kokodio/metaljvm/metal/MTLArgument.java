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
 * {@code MTLArgument}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlargument">Apple documentation</a>
 */
public class MTLArgument extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLArgument");
    private static final long SEL_name = ObjC.selector("name");
    private static final MethodHandle MH_name = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_type = ObjC.selector("type");
    private static final MethodHandle MH_type = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_access = ObjC.selector("access");
    private static final MethodHandle MH_access = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_index = ObjC.selector("index");
    private static final MethodHandle MH_index = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isActive = ObjC.selector("isActive");
    private static final MethodHandle MH_isActive = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bufferAlignment = ObjC.selector("bufferAlignment");
    private static final MethodHandle MH_bufferAlignment = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bufferDataSize = ObjC.selector("bufferDataSize");
    private static final MethodHandle MH_bufferDataSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bufferDataType = ObjC.selector("bufferDataType");
    private static final MethodHandle MH_bufferDataType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bufferStructType = ObjC.selector("bufferStructType");
    private static final MethodHandle MH_bufferStructType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bufferPointerType = ObjC.selector("bufferPointerType");
    private static final MethodHandle MH_bufferPointerType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_threadgroupMemoryAlignment = ObjC.selector("threadgroupMemoryAlignment");
    private static final MethodHandle MH_threadgroupMemoryAlignment = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_threadgroupMemoryDataSize = ObjC.selector("threadgroupMemoryDataSize");
    private static final MethodHandle MH_threadgroupMemoryDataSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_textureType = ObjC.selector("textureType");
    private static final MethodHandle MH_textureType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_textureDataType = ObjC.selector("textureDataType");
    private static final MethodHandle MH_textureDataType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isDepthTexture = ObjC.selector("isDepthTexture");
    private static final MethodHandle MH_isDepthTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_arrayLength = ObjC.selector("arrayLength");
    private static final MethodHandle MH_arrayLength = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLArgument(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLArgument alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLArgument alloc() {
        try {
            return new MTLArgument((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgument init]} */
    public MTLArgument init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgument name]} */
    public String name() {
        try {
            long result = (long) MH_name.invokeExact(this.handle, SEL_name);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgument type]} */
    public MTLArgumentType type() {
        try {
            return MTLArgumentType.of((long) MH_type.invokeExact(this.handle, SEL_type));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgument access]} */
    public MTLBindingAccess access() {
        try {
            return MTLBindingAccess.of((long) MH_access.invokeExact(this.handle, SEL_access));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgument index]} */
    public long index() {
        try {
            return (long) MH_index.invokeExact(this.handle, SEL_index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgument isActive]} */
    public boolean isActive() {
        try {
            return (boolean) MH_isActive.invokeExact(this.handle, SEL_isActive);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgument bufferAlignment]} */
    public long bufferAlignment() {
        try {
            return (long) MH_bufferAlignment.invokeExact(this.handle, SEL_bufferAlignment);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgument bufferDataSize]} */
    public long bufferDataSize() {
        try {
            return (long) MH_bufferDataSize.invokeExact(this.handle, SEL_bufferDataSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgument bufferDataType]} */
    public MTLDataType bufferDataType() {
        try {
            return MTLDataType.of((long) MH_bufferDataType.invokeExact(this.handle, SEL_bufferDataType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLArgument bufferStructType]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLStructType bufferStructType() {
        try {
            long result = (long) MH_bufferStructType.invokeExact(this.handle, SEL_bufferStructType);
            return result == 0L ? null : new MTLStructType(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLArgument bufferPointerType]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLPointerType bufferPointerType() {
        try {
            long result = (long) MH_bufferPointerType.invokeExact(this.handle, SEL_bufferPointerType);
            return result == 0L ? null : new MTLPointerType(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgument threadgroupMemoryAlignment]} */
    public long threadgroupMemoryAlignment() {
        try {
            return (long) MH_threadgroupMemoryAlignment.invokeExact(this.handle, SEL_threadgroupMemoryAlignment);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgument threadgroupMemoryDataSize]} */
    public long threadgroupMemoryDataSize() {
        try {
            return (long) MH_threadgroupMemoryDataSize.invokeExact(this.handle, SEL_threadgroupMemoryDataSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgument textureType]} */
    public MTLTextureType textureType() {
        try {
            return MTLTextureType.of((long) MH_textureType.invokeExact(this.handle, SEL_textureType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgument textureDataType]} */
    public MTLDataType textureDataType() {
        try {
            return MTLDataType.of((long) MH_textureDataType.invokeExact(this.handle, SEL_textureDataType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgument isDepthTexture]} */
    public boolean isDepthTexture() {
        try {
            return (boolean) MH_isDepthTexture.invokeExact(this.handle, SEL_isDepthTexture);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgument arrayLength]} */
    public long arrayLength() {
        try {
            return (long) MH_arrayLength.invokeExact(this.handle, SEL_arrayLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
