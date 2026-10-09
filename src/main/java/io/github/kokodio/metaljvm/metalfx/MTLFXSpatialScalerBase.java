package io.github.kokodio.metaljvm.metalfx;

import io.github.kokodio.metaljvm.metal.MTLFence;
import io.github.kokodio.metaljvm.metal.MTLPixelFormat;
import io.github.kokodio.metaljvm.metal.MTLTexture;
import io.github.kokodio.metaljvm.metal.MTLTextureUsage;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLFXSpatialScalerBase}
 *
 * @see <a href="https://developer.apple.com/documentation/metalfx/mtlfxspatialscalerbase">Apple documentation</a>
 */
public class MTLFXSpatialScalerBase extends NSObject {
    private static final long SEL_colorTextureUsage = ObjC.selector("colorTextureUsage");
    private static final MethodHandle MH_colorTextureUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_outputTextureUsage = ObjC.selector("outputTextureUsage");
    private static final MethodHandle MH_outputTextureUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_inputContentWidth = ObjC.selector("inputContentWidth");
    private static final MethodHandle MH_inputContentWidth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInputContentWidth_ = ObjC.selector("setInputContentWidth:");
    private static final MethodHandle MH_setInputContentWidth_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_inputContentHeight = ObjC.selector("inputContentHeight");
    private static final MethodHandle MH_inputContentHeight = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInputContentHeight_ = ObjC.selector("setInputContentHeight:");
    private static final MethodHandle MH_setInputContentHeight_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_colorTexture = ObjC.selector("colorTexture");
    private static final MethodHandle MH_colorTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setColorTexture_ = ObjC.selector("setColorTexture:");
    private static final MethodHandle MH_setColorTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_outputTexture = ObjC.selector("outputTexture");
    private static final MethodHandle MH_outputTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOutputTexture_ = ObjC.selector("setOutputTexture:");
    private static final MethodHandle MH_setOutputTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_colorTextureFormat = ObjC.selector("colorTextureFormat");
    private static final MethodHandle MH_colorTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_outputTextureFormat = ObjC.selector("outputTextureFormat");
    private static final MethodHandle MH_outputTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_inputWidth = ObjC.selector("inputWidth");
    private static final MethodHandle MH_inputWidth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_inputHeight = ObjC.selector("inputHeight");
    private static final MethodHandle MH_inputHeight = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_outputWidth = ObjC.selector("outputWidth");
    private static final MethodHandle MH_outputWidth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_outputHeight = ObjC.selector("outputHeight");
    private static final MethodHandle MH_outputHeight = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_colorProcessingMode = ObjC.selector("colorProcessingMode");
    private static final MethodHandle MH_colorProcessingMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fence = ObjC.selector("fence");
    private static final MethodHandle MH_fence = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFence_ = ObjC.selector("setFence:");
    private static final MethodHandle MH_setFence_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLFXSpatialScalerBase(final long handle) {
        super(handle);
    }

    /**
     * {@code -[MTLFXSpatialScalerBase colorTextureUsage]}
     *
     * @return a combination of {@link MTLTextureUsage} flags
     */
    public long colorTextureUsage() {
        try {
            return (long) MH_colorTextureUsage.invokeExact(this.handle, SEL_colorTextureUsage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXSpatialScalerBase outputTextureUsage]}
     *
     * @return a combination of {@link MTLTextureUsage} flags
     */
    public long outputTextureUsage() {
        try {
            return (long) MH_outputTextureUsage.invokeExact(this.handle, SEL_outputTextureUsage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerBase inputContentWidth]} */
    public long inputContentWidth() {
        try {
            return (long) MH_inputContentWidth.invokeExact(this.handle, SEL_inputContentWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerBase setInputContentWidth:]} */
    public void setInputContentWidth(final long inputContentWidth) {
        try {
            MH_setInputContentWidth_.invokeExact(this.handle, SEL_setInputContentWidth_, inputContentWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerBase inputContentHeight]} */
    public long inputContentHeight() {
        try {
            return (long) MH_inputContentHeight.invokeExact(this.handle, SEL_inputContentHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerBase setInputContentHeight:]} */
    public void setInputContentHeight(final long inputContentHeight) {
        try {
            MH_setInputContentHeight_.invokeExact(this.handle, SEL_setInputContentHeight_, inputContentHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXSpatialScalerBase colorTexture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTexture colorTexture() {
        try {
            long result = (long) MH_colorTexture.invokeExact(this.handle, SEL_colorTexture);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerBase setColorTexture:]} */
    public void setColorTexture(@Nullable final MTLTexture colorTexture) {
        try {
            MH_setColorTexture_.invokeExact(this.handle, SEL_setColorTexture_, colorTexture == null ? 0L : colorTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXSpatialScalerBase outputTexture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTexture outputTexture() {
        try {
            long result = (long) MH_outputTexture.invokeExact(this.handle, SEL_outputTexture);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerBase setOutputTexture:]} */
    public void setOutputTexture(@Nullable final MTLTexture outputTexture) {
        try {
            MH_setOutputTexture_.invokeExact(this.handle, SEL_setOutputTexture_, outputTexture == null ? 0L : outputTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerBase colorTextureFormat]} */
    public MTLPixelFormat colorTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_colorTextureFormat.invokeExact(this.handle, SEL_colorTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerBase outputTextureFormat]} */
    public MTLPixelFormat outputTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_outputTextureFormat.invokeExact(this.handle, SEL_outputTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerBase inputWidth]} */
    public long inputWidth() {
        try {
            return (long) MH_inputWidth.invokeExact(this.handle, SEL_inputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerBase inputHeight]} */
    public long inputHeight() {
        try {
            return (long) MH_inputHeight.invokeExact(this.handle, SEL_inputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerBase outputWidth]} */
    public long outputWidth() {
        try {
            return (long) MH_outputWidth.invokeExact(this.handle, SEL_outputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerBase outputHeight]} */
    public long outputHeight() {
        try {
            return (long) MH_outputHeight.invokeExact(this.handle, SEL_outputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerBase colorProcessingMode]} */
    public MTLFXSpatialScalerColorProcessingMode colorProcessingMode() {
        try {
            return MTLFXSpatialScalerColorProcessingMode.of((long) MH_colorProcessingMode.invokeExact(this.handle, SEL_colorProcessingMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXSpatialScalerBase fence]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLFence fence() {
        try {
            long result = (long) MH_fence.invokeExact(this.handle, SEL_fence);
            return result == 0L ? null : new MTLFence(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerBase setFence:]} */
    public void setFence(@Nullable final MTLFence fence) {
        try {
            MH_setFence_.invokeExact(this.handle, SEL_setFence_, fence == null ? 0L : fence.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
