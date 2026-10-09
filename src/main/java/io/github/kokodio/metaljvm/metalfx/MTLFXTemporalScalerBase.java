package io.github.kokodio.metaljvm.metalfx;

import io.github.kokodio.metaljvm.metal.MTLFence;
import io.github.kokodio.metaljvm.metal.MTLPixelFormat;
import io.github.kokodio.metaljvm.metal.MTLTexture;
import io.github.kokodio.metaljvm.metal.MTLTextureUsage;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLFXTemporalScalerBase}
 *
 * @see <a href="https://developer.apple.com/documentation/metalfx/mtlfxtemporalscalerbase">Apple documentation</a>
 */
public class MTLFXTemporalScalerBase extends MTLFXFrameInterpolatableScaler {
    private static final long SEL_colorTextureUsage = ObjC.selector("colorTextureUsage");
    private static final MethodHandle MH_colorTextureUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_depthTextureUsage = ObjC.selector("depthTextureUsage");
    private static final MethodHandle MH_depthTextureUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionTextureUsage = ObjC.selector("motionTextureUsage");
    private static final MethodHandle MH_motionTextureUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_reactiveMaskTextureUsage = ObjC.selector("reactiveMaskTextureUsage");
    private static final MethodHandle MH_reactiveMaskTextureUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_reactiveTextureUsage = ObjC.selector("reactiveTextureUsage");
    private static final MethodHandle MH_reactiveTextureUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final long SEL_colorContentOffsetX = ObjC.selector("colorContentOffsetX");
    private static final MethodHandle MH_colorContentOffsetX = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setColorContentOffsetX_ = ObjC.selector("setColorContentOffsetX:");
    private static final MethodHandle MH_setColorContentOffsetX_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_colorContentOffsetY = ObjC.selector("colorContentOffsetY");
    private static final MethodHandle MH_colorContentOffsetY = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setColorContentOffsetY_ = ObjC.selector("setColorContentOffsetY:");
    private static final MethodHandle MH_setColorContentOffsetY_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_depthContentOffsetX = ObjC.selector("depthContentOffsetX");
    private static final MethodHandle MH_depthContentOffsetX = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthContentOffsetX_ = ObjC.selector("setDepthContentOffsetX:");
    private static final MethodHandle MH_setDepthContentOffsetX_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_depthContentOffsetY = ObjC.selector("depthContentOffsetY");
    private static final MethodHandle MH_depthContentOffsetY = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthContentOffsetY_ = ObjC.selector("setDepthContentOffsetY:");
    private static final MethodHandle MH_setDepthContentOffsetY_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionContentOffsetX = ObjC.selector("motionContentOffsetX");
    private static final MethodHandle MH_motionContentOffsetX = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionContentOffsetX_ = ObjC.selector("setMotionContentOffsetX:");
    private static final MethodHandle MH_setMotionContentOffsetX_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionContentOffsetY = ObjC.selector("motionContentOffsetY");
    private static final MethodHandle MH_motionContentOffsetY = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionContentOffsetY_ = ObjC.selector("setMotionContentOffsetY:");
    private static final MethodHandle MH_setMotionContentOffsetY_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_reactiveMaskContentOffsetX = ObjC.selector("reactiveMaskContentOffsetX");
    private static final MethodHandle MH_reactiveMaskContentOffsetX = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setReactiveMaskContentOffsetX_ = ObjC.selector("setReactiveMaskContentOffsetX:");
    private static final MethodHandle MH_setReactiveMaskContentOffsetX_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_reactiveMaskContentOffsetY = ObjC.selector("reactiveMaskContentOffsetY");
    private static final MethodHandle MH_reactiveMaskContentOffsetY = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setReactiveMaskContentOffsetY_ = ObjC.selector("setReactiveMaskContentOffsetY:");
    private static final MethodHandle MH_setReactiveMaskContentOffsetY_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_outputOffsetX = ObjC.selector("outputOffsetX");
    private static final MethodHandle MH_outputOffsetX = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOutputOffsetX_ = ObjC.selector("setOutputOffsetX:");
    private static final MethodHandle MH_setOutputOffsetX_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_outputOffsetY = ObjC.selector("outputOffsetY");
    private static final MethodHandle MH_outputOffsetY = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOutputOffsetY_ = ObjC.selector("setOutputOffsetY:");
    private static final MethodHandle MH_setOutputOffsetY_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_colorTexture = ObjC.selector("colorTexture");
    private static final MethodHandle MH_colorTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setColorTexture_ = ObjC.selector("setColorTexture:");
    private static final MethodHandle MH_setColorTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_depthTexture = ObjC.selector("depthTexture");
    private static final MethodHandle MH_depthTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthTexture_ = ObjC.selector("setDepthTexture:");
    private static final MethodHandle MH_setDepthTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionTexture = ObjC.selector("motionTexture");
    private static final MethodHandle MH_motionTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionTexture_ = ObjC.selector("setMotionTexture:");
    private static final MethodHandle MH_setMotionTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_outputTexture = ObjC.selector("outputTexture");
    private static final MethodHandle MH_outputTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOutputTexture_ = ObjC.selector("setOutputTexture:");
    private static final MethodHandle MH_setOutputTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_exposureTexture = ObjC.selector("exposureTexture");
    private static final MethodHandle MH_exposureTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setExposureTexture_ = ObjC.selector("setExposureTexture:");
    private static final MethodHandle MH_setExposureTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_reactiveMaskTexture = ObjC.selector("reactiveMaskTexture");
    private static final MethodHandle MH_reactiveMaskTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setReactiveMaskTexture_ = ObjC.selector("setReactiveMaskTexture:");
    private static final MethodHandle MH_setReactiveMaskTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_preExposure = ObjC.selector("preExposure");
    private static final MethodHandle MH_preExposure = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPreExposure_ = ObjC.selector("setPreExposure:");
    private static final MethodHandle MH_setPreExposure_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_jitterOffsetX = ObjC.selector("jitterOffsetX");
    private static final MethodHandle MH_jitterOffsetX = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setJitterOffsetX_ = ObjC.selector("setJitterOffsetX:");
    private static final MethodHandle MH_setJitterOffsetX_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_jitterOffsetY = ObjC.selector("jitterOffsetY");
    private static final MethodHandle MH_jitterOffsetY = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setJitterOffsetY_ = ObjC.selector("setJitterOffsetY:");
    private static final MethodHandle MH_setJitterOffsetY_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_motionVectorScaleX = ObjC.selector("motionVectorScaleX");
    private static final MethodHandle MH_motionVectorScaleX = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionVectorScaleX_ = ObjC.selector("setMotionVectorScaleX:");
    private static final MethodHandle MH_setMotionVectorScaleX_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_motionVectorScaleY = ObjC.selector("motionVectorScaleY");
    private static final MethodHandle MH_motionVectorScaleY = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionVectorScaleY_ = ObjC.selector("setMotionVectorScaleY:");
    private static final MethodHandle MH_setMotionVectorScaleY_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_reset = ObjC.selector("reset");
    private static final MethodHandle MH_reset = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setReset_ = ObjC.selector("setReset:");
    private static final MethodHandle MH_setReset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_isDepthReversed = ObjC.selector("isDepthReversed");
    private static final MethodHandle MH_isDepthReversed = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthReversed_ = ObjC.selector("setDepthReversed:");
    private static final MethodHandle MH_setDepthReversed_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_colorTextureFormat = ObjC.selector("colorTextureFormat");
    private static final MethodHandle MH_colorTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_depthTextureFormat = ObjC.selector("depthTextureFormat");
    private static final MethodHandle MH_depthTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionTextureFormat = ObjC.selector("motionTextureFormat");
    private static final MethodHandle MH_motionTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_reactiveMaskTextureFormat = ObjC.selector("reactiveMaskTextureFormat");
    private static final MethodHandle MH_reactiveMaskTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final long SEL_inputContentMinScale = ObjC.selector("inputContentMinScale");
    private static final MethodHandle MH_inputContentMinScale = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_inputContentMaxScale = ObjC.selector("inputContentMaxScale");
    private static final MethodHandle MH_inputContentMaxScale = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fence = ObjC.selector("fence");
    private static final MethodHandle MH_fence = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFence_ = ObjC.selector("setFence:");
    private static final MethodHandle MH_setFence_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLFXTemporalScalerBase(final long handle) {
        super(handle);
    }

    /**
     * {@code -[MTLFXTemporalScalerBase colorTextureUsage]}
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
     * {@code -[MTLFXTemporalScalerBase depthTextureUsage]}
     *
     * @return a combination of {@link MTLTextureUsage} flags
     */
    public long depthTextureUsage() {
        try {
            return (long) MH_depthTextureUsage.invokeExact(this.handle, SEL_depthTextureUsage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalScalerBase motionTextureUsage]}
     *
     * @return a combination of {@link MTLTextureUsage} flags
     */
    public long motionTextureUsage() {
        try {
            return (long) MH_motionTextureUsage.invokeExact(this.handle, SEL_motionTextureUsage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalScalerBase reactiveMaskTextureUsage]}
     *
     * @return a combination of {@link MTLTextureUsage} flags
     */
    public long reactiveMaskTextureUsage() {
        try {
            return (long) MH_reactiveMaskTextureUsage.invokeExact(this.handle, SEL_reactiveMaskTextureUsage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalScalerBase reactiveTextureUsage]}
     *
     * @return a combination of {@link MTLTextureUsage} flags
     */
    public long reactiveTextureUsage() {
        try {
            return (long) MH_reactiveTextureUsage.invokeExact(this.handle, SEL_reactiveTextureUsage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalScalerBase outputTextureUsage]}
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

    /** {@code -[MTLFXTemporalScalerBase inputContentWidth]} */
    public long inputContentWidth() {
        try {
            return (long) MH_inputContentWidth.invokeExact(this.handle, SEL_inputContentWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setInputContentWidth:]} */
    public void setInputContentWidth(final long inputContentWidth) {
        try {
            MH_setInputContentWidth_.invokeExact(this.handle, SEL_setInputContentWidth_, inputContentWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase inputContentHeight]} */
    public long inputContentHeight() {
        try {
            return (long) MH_inputContentHeight.invokeExact(this.handle, SEL_inputContentHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setInputContentHeight:]} */
    public void setInputContentHeight(final long inputContentHeight) {
        try {
            MH_setInputContentHeight_.invokeExact(this.handle, SEL_setInputContentHeight_, inputContentHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase colorContentOffsetX]} */
    public long colorContentOffsetX() {
        try {
            return (long) MH_colorContentOffsetX.invokeExact(this.handle, SEL_colorContentOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setColorContentOffsetX:]} */
    public void setColorContentOffsetX(final long colorContentOffsetX) {
        try {
            MH_setColorContentOffsetX_.invokeExact(this.handle, SEL_setColorContentOffsetX_, colorContentOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase colorContentOffsetY]} */
    public long colorContentOffsetY() {
        try {
            return (long) MH_colorContentOffsetY.invokeExact(this.handle, SEL_colorContentOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setColorContentOffsetY:]} */
    public void setColorContentOffsetY(final long colorContentOffsetY) {
        try {
            MH_setColorContentOffsetY_.invokeExact(this.handle, SEL_setColorContentOffsetY_, colorContentOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase depthContentOffsetX]} */
    public long depthContentOffsetX() {
        try {
            return (long) MH_depthContentOffsetX.invokeExact(this.handle, SEL_depthContentOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setDepthContentOffsetX:]} */
    public void setDepthContentOffsetX(final long depthContentOffsetX) {
        try {
            MH_setDepthContentOffsetX_.invokeExact(this.handle, SEL_setDepthContentOffsetX_, depthContentOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase depthContentOffsetY]} */
    public long depthContentOffsetY() {
        try {
            return (long) MH_depthContentOffsetY.invokeExact(this.handle, SEL_depthContentOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setDepthContentOffsetY:]} */
    public void setDepthContentOffsetY(final long depthContentOffsetY) {
        try {
            MH_setDepthContentOffsetY_.invokeExact(this.handle, SEL_setDepthContentOffsetY_, depthContentOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase motionContentOffsetX]} */
    public long motionContentOffsetX() {
        try {
            return (long) MH_motionContentOffsetX.invokeExact(this.handle, SEL_motionContentOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setMotionContentOffsetX:]} */
    public void setMotionContentOffsetX(final long motionContentOffsetX) {
        try {
            MH_setMotionContentOffsetX_.invokeExact(this.handle, SEL_setMotionContentOffsetX_, motionContentOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase motionContentOffsetY]} */
    public long motionContentOffsetY() {
        try {
            return (long) MH_motionContentOffsetY.invokeExact(this.handle, SEL_motionContentOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setMotionContentOffsetY:]} */
    public void setMotionContentOffsetY(final long motionContentOffsetY) {
        try {
            MH_setMotionContentOffsetY_.invokeExact(this.handle, SEL_setMotionContentOffsetY_, motionContentOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase reactiveMaskContentOffsetX]} */
    public long reactiveMaskContentOffsetX() {
        try {
            return (long) MH_reactiveMaskContentOffsetX.invokeExact(this.handle, SEL_reactiveMaskContentOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setReactiveMaskContentOffsetX:]} */
    public void setReactiveMaskContentOffsetX(final long reactiveMaskContentOffsetX) {
        try {
            MH_setReactiveMaskContentOffsetX_.invokeExact(this.handle, SEL_setReactiveMaskContentOffsetX_, reactiveMaskContentOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase reactiveMaskContentOffsetY]} */
    public long reactiveMaskContentOffsetY() {
        try {
            return (long) MH_reactiveMaskContentOffsetY.invokeExact(this.handle, SEL_reactiveMaskContentOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setReactiveMaskContentOffsetY:]} */
    public void setReactiveMaskContentOffsetY(final long reactiveMaskContentOffsetY) {
        try {
            MH_setReactiveMaskContentOffsetY_.invokeExact(this.handle, SEL_setReactiveMaskContentOffsetY_, reactiveMaskContentOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase outputOffsetX]} */
    public long outputOffsetX() {
        try {
            return (long) MH_outputOffsetX.invokeExact(this.handle, SEL_outputOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setOutputOffsetX:]} */
    public void setOutputOffsetX(final long outputOffsetX) {
        try {
            MH_setOutputOffsetX_.invokeExact(this.handle, SEL_setOutputOffsetX_, outputOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase outputOffsetY]} */
    public long outputOffsetY() {
        try {
            return (long) MH_outputOffsetY.invokeExact(this.handle, SEL_outputOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setOutputOffsetY:]} */
    public void setOutputOffsetY(final long outputOffsetY) {
        try {
            MH_setOutputOffsetY_.invokeExact(this.handle, SEL_setOutputOffsetY_, outputOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalScalerBase colorTexture]}
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

    /** {@code -[MTLFXTemporalScalerBase setColorTexture:]} */
    public void setColorTexture(@Nullable final MTLTexture colorTexture) {
        try {
            MH_setColorTexture_.invokeExact(this.handle, SEL_setColorTexture_, colorTexture == null ? 0L : colorTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalScalerBase depthTexture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTexture depthTexture() {
        try {
            long result = (long) MH_depthTexture.invokeExact(this.handle, SEL_depthTexture);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setDepthTexture:]} */
    public void setDepthTexture(@Nullable final MTLTexture depthTexture) {
        try {
            MH_setDepthTexture_.invokeExact(this.handle, SEL_setDepthTexture_, depthTexture == null ? 0L : depthTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalScalerBase motionTexture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTexture motionTexture() {
        try {
            long result = (long) MH_motionTexture.invokeExact(this.handle, SEL_motionTexture);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setMotionTexture:]} */
    public void setMotionTexture(@Nullable final MTLTexture motionTexture) {
        try {
            MH_setMotionTexture_.invokeExact(this.handle, SEL_setMotionTexture_, motionTexture == null ? 0L : motionTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalScalerBase outputTexture]}
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

    /** {@code -[MTLFXTemporalScalerBase setOutputTexture:]} */
    public void setOutputTexture(@Nullable final MTLTexture outputTexture) {
        try {
            MH_setOutputTexture_.invokeExact(this.handle, SEL_setOutputTexture_, outputTexture == null ? 0L : outputTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalScalerBase exposureTexture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTexture exposureTexture() {
        try {
            long result = (long) MH_exposureTexture.invokeExact(this.handle, SEL_exposureTexture);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setExposureTexture:]} */
    public void setExposureTexture(@Nullable final MTLTexture exposureTexture) {
        try {
            MH_setExposureTexture_.invokeExact(this.handle, SEL_setExposureTexture_, exposureTexture == null ? 0L : exposureTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalScalerBase reactiveMaskTexture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTexture reactiveMaskTexture() {
        try {
            long result = (long) MH_reactiveMaskTexture.invokeExact(this.handle, SEL_reactiveMaskTexture);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setReactiveMaskTexture:]} */
    public void setReactiveMaskTexture(@Nullable final MTLTexture reactiveMaskTexture) {
        try {
            MH_setReactiveMaskTexture_.invokeExact(this.handle, SEL_setReactiveMaskTexture_, reactiveMaskTexture == null ? 0L : reactiveMaskTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase preExposure]} */
    public float preExposure() {
        try {
            return (float) MH_preExposure.invokeExact(this.handle, SEL_preExposure);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setPreExposure:]} */
    public void setPreExposure(final float preExposure) {
        try {
            MH_setPreExposure_.invokeExact(this.handle, SEL_setPreExposure_, preExposure);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase jitterOffsetX]} */
    public float jitterOffsetX() {
        try {
            return (float) MH_jitterOffsetX.invokeExact(this.handle, SEL_jitterOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setJitterOffsetX:]} */
    public void setJitterOffsetX(final float jitterOffsetX) {
        try {
            MH_setJitterOffsetX_.invokeExact(this.handle, SEL_setJitterOffsetX_, jitterOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase jitterOffsetY]} */
    public float jitterOffsetY() {
        try {
            return (float) MH_jitterOffsetY.invokeExact(this.handle, SEL_jitterOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setJitterOffsetY:]} */
    public void setJitterOffsetY(final float jitterOffsetY) {
        try {
            MH_setJitterOffsetY_.invokeExact(this.handle, SEL_setJitterOffsetY_, jitterOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase motionVectorScaleX]} */
    public float motionVectorScaleX() {
        try {
            return (float) MH_motionVectorScaleX.invokeExact(this.handle, SEL_motionVectorScaleX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setMotionVectorScaleX:]} */
    public void setMotionVectorScaleX(final float motionVectorScaleX) {
        try {
            MH_setMotionVectorScaleX_.invokeExact(this.handle, SEL_setMotionVectorScaleX_, motionVectorScaleX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase motionVectorScaleY]} */
    public float motionVectorScaleY() {
        try {
            return (float) MH_motionVectorScaleY.invokeExact(this.handle, SEL_motionVectorScaleY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setMotionVectorScaleY:]} */
    public void setMotionVectorScaleY(final float motionVectorScaleY) {
        try {
            MH_setMotionVectorScaleY_.invokeExact(this.handle, SEL_setMotionVectorScaleY_, motionVectorScaleY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase reset]} */
    public boolean reset() {
        try {
            return (boolean) MH_reset.invokeExact(this.handle, SEL_reset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setReset:]} */
    public void setReset(final boolean reset) {
        try {
            MH_setReset_.invokeExact(this.handle, SEL_setReset_, reset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase isDepthReversed]} */
    public boolean isDepthReversed() {
        try {
            return (boolean) MH_isDepthReversed.invokeExact(this.handle, SEL_isDepthReversed);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase setDepthReversed:]} */
    public void setDepthReversed(final boolean depthReversed) {
        try {
            MH_setDepthReversed_.invokeExact(this.handle, SEL_setDepthReversed_, depthReversed);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase colorTextureFormat]} */
    public MTLPixelFormat colorTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_colorTextureFormat.invokeExact(this.handle, SEL_colorTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase depthTextureFormat]} */
    public MTLPixelFormat depthTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_depthTextureFormat.invokeExact(this.handle, SEL_depthTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase motionTextureFormat]} */
    public MTLPixelFormat motionTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_motionTextureFormat.invokeExact(this.handle, SEL_motionTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase reactiveMaskTextureFormat]} */
    public MTLPixelFormat reactiveMaskTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_reactiveMaskTextureFormat.invokeExact(this.handle, SEL_reactiveMaskTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase outputTextureFormat]} */
    public MTLPixelFormat outputTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_outputTextureFormat.invokeExact(this.handle, SEL_outputTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase inputWidth]} */
    public long inputWidth() {
        try {
            return (long) MH_inputWidth.invokeExact(this.handle, SEL_inputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase inputHeight]} */
    public long inputHeight() {
        try {
            return (long) MH_inputHeight.invokeExact(this.handle, SEL_inputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase outputWidth]} */
    public long outputWidth() {
        try {
            return (long) MH_outputWidth.invokeExact(this.handle, SEL_outputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase outputHeight]} */
    public long outputHeight() {
        try {
            return (long) MH_outputHeight.invokeExact(this.handle, SEL_outputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase inputContentMinScale]} */
    public float inputContentMinScale() {
        try {
            return (float) MH_inputContentMinScale.invokeExact(this.handle, SEL_inputContentMinScale);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerBase inputContentMaxScale]} */
    public float inputContentMaxScale() {
        try {
            return (float) MH_inputContentMaxScale.invokeExact(this.handle, SEL_inputContentMaxScale);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalScalerBase fence]}
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

    /** {@code -[MTLFXTemporalScalerBase setFence:]} */
    public void setFence(@Nullable final MTLFence fence) {
        try {
            MH_setFence_.invokeExact(this.handle, SEL_setFence_, fence == null ? 0L : fence.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
