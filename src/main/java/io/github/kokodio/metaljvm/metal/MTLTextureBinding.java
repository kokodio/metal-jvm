package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLTextureBinding}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltexturebinding">Apple documentation</a>
 */
public class MTLTextureBinding extends MTLBinding {
    private static final long SEL_textureType = ObjC.selector("textureType");
    private static final MethodHandle MH_textureType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_textureDataType = ObjC.selector("textureDataType");
    private static final MethodHandle MH_textureDataType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isDepthTexture = ObjC.selector("isDepthTexture");
    private static final MethodHandle MH_isDepthTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_arrayLength = ObjC.selector("arrayLength");
    private static final MethodHandle MH_arrayLength = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLTextureBinding(final long handle) {
        super(handle);
    }

    /** {@code -[MTLTextureBinding textureType]} */
    public MTLTextureType textureType() {
        try {
            return MTLTextureType.of((long) MH_textureType.invokeExact(this.handle, SEL_textureType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureBinding textureDataType]} */
    public MTLDataType textureDataType() {
        try {
            return MTLDataType.of((long) MH_textureDataType.invokeExact(this.handle, SEL_textureDataType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureBinding isDepthTexture]} */
    public boolean isDepthTexture() {
        try {
            return (boolean) MH_isDepthTexture.invokeExact(this.handle, SEL_isDepthTexture);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureBinding arrayLength]} */
    public long arrayLength() {
        try {
            return (long) MH_arrayLength.invokeExact(this.handle, SEL_arrayLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
