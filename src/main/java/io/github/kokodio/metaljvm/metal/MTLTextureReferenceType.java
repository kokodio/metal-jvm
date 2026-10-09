package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLTextureReferenceType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltexturereferencetype">Apple documentation</a>
 */
public class MTLTextureReferenceType extends MTLType {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLTextureReferenceType");
    private static final long SEL_textureDataType = ObjC.selector("textureDataType");
    private static final MethodHandle MH_textureDataType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_textureType = ObjC.selector("textureType");
    private static final MethodHandle MH_textureType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_access = ObjC.selector("access");
    private static final MethodHandle MH_access = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isDepthTexture = ObjC.selector("isDepthTexture");
    private static final MethodHandle MH_isDepthTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLTextureReferenceType(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLTextureReferenceType alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLTextureReferenceType alloc() {
        try {
            return new MTLTextureReferenceType((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureReferenceType init]} */
    public MTLTextureReferenceType init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureReferenceType textureDataType]} */
    public MTLDataType textureDataType() {
        try {
            return MTLDataType.of((long) MH_textureDataType.invokeExact(this.handle, SEL_textureDataType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureReferenceType textureType]} */
    public MTLTextureType textureType() {
        try {
            return MTLTextureType.of((long) MH_textureType.invokeExact(this.handle, SEL_textureType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureReferenceType access]} */
    public MTLBindingAccess access() {
        try {
            return MTLBindingAccess.of((long) MH_access.invokeExact(this.handle, SEL_access));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureReferenceType isDepthTexture]} */
    public boolean isDepthTexture() {
        try {
            return (boolean) MH_isDepthTexture.invokeExact(this.handle, SEL_isDepthTexture);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
