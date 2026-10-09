package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLArgumentDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlargumentdescriptor">Apple documentation</a>
 */
public class MTLArgumentDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLArgumentDescriptor");
    private static final long SEL_CLASS_argumentDescriptor = ObjC.selector("argumentDescriptor");
    private static final MethodHandle MH_CLASS_argumentDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dataType = ObjC.selector("dataType");
    private static final MethodHandle MH_dataType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDataType_ = ObjC.selector("setDataType:");
    private static final MethodHandle MH_setDataType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_index = ObjC.selector("index");
    private static final MethodHandle MH_index = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setIndex_ = ObjC.selector("setIndex:");
    private static final MethodHandle MH_setIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_arrayLength = ObjC.selector("arrayLength");
    private static final MethodHandle MH_arrayLength = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setArrayLength_ = ObjC.selector("setArrayLength:");
    private static final MethodHandle MH_setArrayLength_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_access = ObjC.selector("access");
    private static final MethodHandle MH_access = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAccess_ = ObjC.selector("setAccess:");
    private static final MethodHandle MH_setAccess_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_textureType = ObjC.selector("textureType");
    private static final MethodHandle MH_textureType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTextureType_ = ObjC.selector("setTextureType:");
    private static final MethodHandle MH_setTextureType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_constantBlockAlignment = ObjC.selector("constantBlockAlignment");
    private static final MethodHandle MH_constantBlockAlignment = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setConstantBlockAlignment_ = ObjC.selector("setConstantBlockAlignment:");
    private static final MethodHandle MH_setConstantBlockAlignment_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLArgumentDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLArgumentDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLArgumentDescriptor alloc() {
        try {
            return new MTLArgumentDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentDescriptor init]} */
    public MTLArgumentDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[MTLArgumentDescriptor argumentDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static MTLArgumentDescriptor argumentDescriptor() {
        try {
            long result = (long) MH_CLASS_argumentDescriptor.invokeExact(CLS, SEL_CLASS_argumentDescriptor);
            return new MTLArgumentDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentDescriptor dataType]} */
    public MTLDataType dataType() {
        try {
            return MTLDataType.of((long) MH_dataType.invokeExact(this.handle, SEL_dataType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentDescriptor setDataType:]} */
    public void setDataType(final MTLDataType dataType) {
        try {
            MH_setDataType_.invokeExact(this.handle, SEL_setDataType_, dataType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentDescriptor index]} */
    public long index() {
        try {
            return (long) MH_index.invokeExact(this.handle, SEL_index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentDescriptor setIndex:]} */
    public void setIndex(final long index) {
        try {
            MH_setIndex_.invokeExact(this.handle, SEL_setIndex_, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentDescriptor arrayLength]} */
    public long arrayLength() {
        try {
            return (long) MH_arrayLength.invokeExact(this.handle, SEL_arrayLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentDescriptor setArrayLength:]} */
    public void setArrayLength(final long arrayLength) {
        try {
            MH_setArrayLength_.invokeExact(this.handle, SEL_setArrayLength_, arrayLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentDescriptor access]} */
    public MTLBindingAccess access() {
        try {
            return MTLBindingAccess.of((long) MH_access.invokeExact(this.handle, SEL_access));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentDescriptor setAccess:]} */
    public void setAccess(final MTLBindingAccess access) {
        try {
            MH_setAccess_.invokeExact(this.handle, SEL_setAccess_, access.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentDescriptor textureType]} */
    public MTLTextureType textureType() {
        try {
            return MTLTextureType.of((long) MH_textureType.invokeExact(this.handle, SEL_textureType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentDescriptor setTextureType:]} */
    public void setTextureType(final MTLTextureType textureType) {
        try {
            MH_setTextureType_.invokeExact(this.handle, SEL_setTextureType_, textureType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentDescriptor constantBlockAlignment]} */
    public long constantBlockAlignment() {
        try {
            return (long) MH_constantBlockAlignment.invokeExact(this.handle, SEL_constantBlockAlignment);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLArgumentDescriptor setConstantBlockAlignment:]} */
    public void setConstantBlockAlignment(final long constantBlockAlignment) {
        try {
            MH_setConstantBlockAlignment_.invokeExact(this.handle, SEL_setConstantBlockAlignment_, constantBlockAlignment);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
