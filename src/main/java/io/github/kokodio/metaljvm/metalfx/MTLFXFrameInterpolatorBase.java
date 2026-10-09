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

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLFXFrameInterpolatorBase}
 *
 * @see <a href="https://developer.apple.com/documentation/metalfx/mtlfxframeinterpolatorbase">Apple documentation</a>
 */
public class MTLFXFrameInterpolatorBase extends NSObject {
    private static final long SEL_colorTextureUsage = ObjC.selector("colorTextureUsage");
    private static final MethodHandle MH_colorTextureUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_outputTextureUsage = ObjC.selector("outputTextureUsage");
    private static final MethodHandle MH_outputTextureUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_depthTextureUsage = ObjC.selector("depthTextureUsage");
    private static final MethodHandle MH_depthTextureUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionTextureUsage = ObjC.selector("motionTextureUsage");
    private static final MethodHandle MH_motionTextureUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_uiTextureUsage = ObjC.selector("uiTextureUsage");
    private static final MethodHandle MH_uiTextureUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_colorTextureFormat = ObjC.selector("colorTextureFormat");
    private static final MethodHandle MH_colorTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_depthTextureFormat = ObjC.selector("depthTextureFormat");
    private static final MethodHandle MH_depthTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionTextureFormat = ObjC.selector("motionTextureFormat");
    private static final MethodHandle MH_motionTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final long SEL_uiTextureFormat = ObjC.selector("uiTextureFormat");
    private static final MethodHandle MH_uiTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_contentWidth = ObjC.selector("contentWidth");
    private static final MethodHandle MH_contentWidth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setContentWidth_ = ObjC.selector("setContentWidth:");
    private static final MethodHandle MH_setContentWidth_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_contentHeight = ObjC.selector("contentHeight");
    private static final MethodHandle MH_contentHeight = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setContentHeight_ = ObjC.selector("setContentHeight:");
    private static final MethodHandle MH_setContentHeight_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final long SEL_outputOffsetX = ObjC.selector("outputOffsetX");
    private static final MethodHandle MH_outputOffsetX = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOutputOffsetX_ = ObjC.selector("setOutputOffsetX:");
    private static final MethodHandle MH_setOutputOffsetX_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_outputOffsetY = ObjC.selector("outputOffsetY");
    private static final MethodHandle MH_outputOffsetY = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOutputOffsetY_ = ObjC.selector("setOutputOffsetY:");
    private static final MethodHandle MH_setOutputOffsetY_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_distortionOffsetX = ObjC.selector("distortionOffsetX");
    private static final MethodHandle MH_distortionOffsetX = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDistortionOffsetX_ = ObjC.selector("setDistortionOffsetX:");
    private static final MethodHandle MH_setDistortionOffsetX_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_distortionOffsetY = ObjC.selector("distortionOffsetY");
    private static final MethodHandle MH_distortionOffsetY = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDistortionOffsetY_ = ObjC.selector("setDistortionOffsetY:");
    private static final MethodHandle MH_setDistortionOffsetY_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_distortionWidth = ObjC.selector("distortionWidth");
    private static final MethodHandle MH_distortionWidth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDistortionWidth_ = ObjC.selector("setDistortionWidth:");
    private static final MethodHandle MH_setDistortionWidth_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_distortionHeight = ObjC.selector("distortionHeight");
    private static final MethodHandle MH_distortionHeight = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDistortionHeight_ = ObjC.selector("setDistortionHeight:");
    private static final MethodHandle MH_setDistortionHeight_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_colorTexture = ObjC.selector("colorTexture");
    private static final MethodHandle MH_colorTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setColorTexture_ = ObjC.selector("setColorTexture:");
    private static final MethodHandle MH_setColorTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_prevColorTexture = ObjC.selector("prevColorTexture");
    private static final MethodHandle MH_prevColorTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPrevColorTexture_ = ObjC.selector("setPrevColorTexture:");
    private static final MethodHandle MH_setPrevColorTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_depthTexture = ObjC.selector("depthTexture");
    private static final MethodHandle MH_depthTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthTexture_ = ObjC.selector("setDepthTexture:");
    private static final MethodHandle MH_setDepthTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionTexture = ObjC.selector("motionTexture");
    private static final MethodHandle MH_motionTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionTexture_ = ObjC.selector("setMotionTexture:");
    private static final MethodHandle MH_setMotionTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionVectorScaleX = ObjC.selector("motionVectorScaleX");
    private static final MethodHandle MH_motionVectorScaleX = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionVectorScaleX_ = ObjC.selector("setMotionVectorScaleX:");
    private static final MethodHandle MH_setMotionVectorScaleX_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_motionVectorScaleY = ObjC.selector("motionVectorScaleY");
    private static final MethodHandle MH_motionVectorScaleY = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionVectorScaleY_ = ObjC.selector("setMotionVectorScaleY:");
    private static final MethodHandle MH_setMotionVectorScaleY_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_deltaTime = ObjC.selector("deltaTime");
    private static final MethodHandle MH_deltaTime = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDeltaTime_ = ObjC.selector("setDeltaTime:");
    private static final MethodHandle MH_setDeltaTime_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_nearPlane = ObjC.selector("nearPlane");
    private static final MethodHandle MH_nearPlane = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setNearPlane_ = ObjC.selector("setNearPlane:");
    private static final MethodHandle MH_setNearPlane_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_farPlane = ObjC.selector("farPlane");
    private static final MethodHandle MH_farPlane = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFarPlane_ = ObjC.selector("setFarPlane:");
    private static final MethodHandle MH_setFarPlane_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_fieldOfView = ObjC.selector("fieldOfView");
    private static final MethodHandle MH_fieldOfView = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFieldOfView_ = ObjC.selector("setFieldOfView:");
    private static final MethodHandle MH_setFieldOfView_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_aspectRatio = ObjC.selector("aspectRatio");
    private static final MethodHandle MH_aspectRatio = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAspectRatio_ = ObjC.selector("setAspectRatio:");
    private static final MethodHandle MH_setAspectRatio_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_uiTexture = ObjC.selector("uiTexture");
    private static final MethodHandle MH_uiTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setUITexture_ = ObjC.selector("setUITexture:");
    private static final MethodHandle MH_setUITexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_jitterOffsetX = ObjC.selector("jitterOffsetX");
    private static final MethodHandle MH_jitterOffsetX = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setJitterOffsetX_ = ObjC.selector("setJitterOffsetX:");
    private static final MethodHandle MH_setJitterOffsetX_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_jitterOffsetY = ObjC.selector("jitterOffsetY");
    private static final MethodHandle MH_jitterOffsetY = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setJitterOffsetY_ = ObjC.selector("setJitterOffsetY:");
    private static final MethodHandle MH_setJitterOffsetY_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_isUITextureComposited = ObjC.selector("isUITextureComposited");
    private static final MethodHandle MH_isUITextureComposited = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setIsUITextureComposited_ = ObjC.selector("setIsUITextureComposited:");
    private static final MethodHandle MH_setIsUITextureComposited_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_shouldResetHistory = ObjC.selector("shouldResetHistory");
    private static final MethodHandle MH_shouldResetHistory = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setShouldResetHistory_ = ObjC.selector("setShouldResetHistory:");
    private static final MethodHandle MH_setShouldResetHistory_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_outputTexture = ObjC.selector("outputTexture");
    private static final MethodHandle MH_outputTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOutputTexture_ = ObjC.selector("setOutputTexture:");
    private static final MethodHandle MH_setOutputTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_distortionTexture = ObjC.selector("distortionTexture");
    private static final MethodHandle MH_distortionTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDistortionTexture_ = ObjC.selector("setDistortionTexture:");
    private static final MethodHandle MH_setDistortionTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fence = ObjC.selector("fence");
    private static final MethodHandle MH_fence = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFence_ = ObjC.selector("setFence:");
    private static final MethodHandle MH_setFence_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isDepthReversed = ObjC.selector("isDepthReversed");
    private static final MethodHandle MH_isDepthReversed = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthReversed_ = ObjC.selector("setDepthReversed:");
    private static final MethodHandle MH_setDepthReversed_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));

    public MTLFXFrameInterpolatorBase(final long handle) {
        super(handle);
    }

    /**
     * {@code -[MTLFXFrameInterpolatorBase colorTextureUsage]}
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
     * {@code -[MTLFXFrameInterpolatorBase outputTextureUsage]}
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

    /**
     * {@code -[MTLFXFrameInterpolatorBase depthTextureUsage]}
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
     * {@code -[MTLFXFrameInterpolatorBase motionTextureUsage]}
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
     * {@code -[MTLFXFrameInterpolatorBase uiTextureUsage]}
     *
     * @return a combination of {@link MTLTextureUsage} flags
     */
    public long uiTextureUsage() {
        try {
            return (long) MH_uiTextureUsage.invokeExact(this.handle, SEL_uiTextureUsage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase colorTextureFormat]} */
    public MTLPixelFormat colorTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_colorTextureFormat.invokeExact(this.handle, SEL_colorTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase depthTextureFormat]} */
    public MTLPixelFormat depthTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_depthTextureFormat.invokeExact(this.handle, SEL_depthTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase motionTextureFormat]} */
    public MTLPixelFormat motionTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_motionTextureFormat.invokeExact(this.handle, SEL_motionTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase outputTextureFormat]} */
    public MTLPixelFormat outputTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_outputTextureFormat.invokeExact(this.handle, SEL_outputTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase inputWidth]} */
    public long inputWidth() {
        try {
            return (long) MH_inputWidth.invokeExact(this.handle, SEL_inputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase inputHeight]} */
    public long inputHeight() {
        try {
            return (long) MH_inputHeight.invokeExact(this.handle, SEL_inputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase outputWidth]} */
    public long outputWidth() {
        try {
            return (long) MH_outputWidth.invokeExact(this.handle, SEL_outputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase outputHeight]} */
    public long outputHeight() {
        try {
            return (long) MH_outputHeight.invokeExact(this.handle, SEL_outputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase uiTextureFormat]} */
    public MTLPixelFormat uiTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_uiTextureFormat.invokeExact(this.handle, SEL_uiTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase contentWidth]} */
    public long contentWidth() {
        try {
            return (long) MH_contentWidth.invokeExact(this.handle, SEL_contentWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setContentWidth:]} */
    public void setContentWidth(final long contentWidth) {
        try {
            MH_setContentWidth_.invokeExact(this.handle, SEL_setContentWidth_, contentWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase contentHeight]} */
    public long contentHeight() {
        try {
            return (long) MH_contentHeight.invokeExact(this.handle, SEL_contentHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setContentHeight:]} */
    public void setContentHeight(final long contentHeight) {
        try {
            MH_setContentHeight_.invokeExact(this.handle, SEL_setContentHeight_, contentHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase depthContentOffsetX]} */
    public long depthContentOffsetX() {
        try {
            return (long) MH_depthContentOffsetX.invokeExact(this.handle, SEL_depthContentOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setDepthContentOffsetX:]} */
    public void setDepthContentOffsetX(final long depthContentOffsetX) {
        try {
            MH_setDepthContentOffsetX_.invokeExact(this.handle, SEL_setDepthContentOffsetX_, depthContentOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase depthContentOffsetY]} */
    public long depthContentOffsetY() {
        try {
            return (long) MH_depthContentOffsetY.invokeExact(this.handle, SEL_depthContentOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setDepthContentOffsetY:]} */
    public void setDepthContentOffsetY(final long depthContentOffsetY) {
        try {
            MH_setDepthContentOffsetY_.invokeExact(this.handle, SEL_setDepthContentOffsetY_, depthContentOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase motionContentOffsetX]} */
    public long motionContentOffsetX() {
        try {
            return (long) MH_motionContentOffsetX.invokeExact(this.handle, SEL_motionContentOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setMotionContentOffsetX:]} */
    public void setMotionContentOffsetX(final long motionContentOffsetX) {
        try {
            MH_setMotionContentOffsetX_.invokeExact(this.handle, SEL_setMotionContentOffsetX_, motionContentOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase motionContentOffsetY]} */
    public long motionContentOffsetY() {
        try {
            return (long) MH_motionContentOffsetY.invokeExact(this.handle, SEL_motionContentOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setMotionContentOffsetY:]} */
    public void setMotionContentOffsetY(final long motionContentOffsetY) {
        try {
            MH_setMotionContentOffsetY_.invokeExact(this.handle, SEL_setMotionContentOffsetY_, motionContentOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase outputOffsetX]} */
    public long outputOffsetX() {
        try {
            return (long) MH_outputOffsetX.invokeExact(this.handle, SEL_outputOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setOutputOffsetX:]} */
    public void setOutputOffsetX(final long outputOffsetX) {
        try {
            MH_setOutputOffsetX_.invokeExact(this.handle, SEL_setOutputOffsetX_, outputOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase outputOffsetY]} */
    public long outputOffsetY() {
        try {
            return (long) MH_outputOffsetY.invokeExact(this.handle, SEL_outputOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setOutputOffsetY:]} */
    public void setOutputOffsetY(final long outputOffsetY) {
        try {
            MH_setOutputOffsetY_.invokeExact(this.handle, SEL_setOutputOffsetY_, outputOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase distortionOffsetX]} */
    public long distortionOffsetX() {
        try {
            return (long) MH_distortionOffsetX.invokeExact(this.handle, SEL_distortionOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setDistortionOffsetX:]} */
    public void setDistortionOffsetX(final long distortionOffsetX) {
        try {
            MH_setDistortionOffsetX_.invokeExact(this.handle, SEL_setDistortionOffsetX_, distortionOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase distortionOffsetY]} */
    public long distortionOffsetY() {
        try {
            return (long) MH_distortionOffsetY.invokeExact(this.handle, SEL_distortionOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setDistortionOffsetY:]} */
    public void setDistortionOffsetY(final long distortionOffsetY) {
        try {
            MH_setDistortionOffsetY_.invokeExact(this.handle, SEL_setDistortionOffsetY_, distortionOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase distortionWidth]} */
    public long distortionWidth() {
        try {
            return (long) MH_distortionWidth.invokeExact(this.handle, SEL_distortionWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setDistortionWidth:]} */
    public void setDistortionWidth(final long distortionWidth) {
        try {
            MH_setDistortionWidth_.invokeExact(this.handle, SEL_setDistortionWidth_, distortionWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase distortionHeight]} */
    public long distortionHeight() {
        try {
            return (long) MH_distortionHeight.invokeExact(this.handle, SEL_distortionHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setDistortionHeight:]} */
    public void setDistortionHeight(final long distortionHeight) {
        try {
            MH_setDistortionHeight_.invokeExact(this.handle, SEL_setDistortionHeight_, distortionHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXFrameInterpolatorBase colorTexture]}
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

    /** {@code -[MTLFXFrameInterpolatorBase setColorTexture:]} */
    public void setColorTexture(@Nullable final MTLTexture colorTexture) {
        try {
            MH_setColorTexture_.invokeExact(this.handle, SEL_setColorTexture_, colorTexture == null ? 0L : colorTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXFrameInterpolatorBase prevColorTexture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTexture prevColorTexture() {
        try {
            long result = (long) MH_prevColorTexture.invokeExact(this.handle, SEL_prevColorTexture);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setPrevColorTexture:]} */
    public void setPrevColorTexture(@Nullable final MTLTexture prevColorTexture) {
        try {
            MH_setPrevColorTexture_.invokeExact(this.handle, SEL_setPrevColorTexture_, prevColorTexture == null ? 0L : prevColorTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXFrameInterpolatorBase depthTexture]}
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

    /** {@code -[MTLFXFrameInterpolatorBase setDepthTexture:]} */
    public void setDepthTexture(@Nullable final MTLTexture depthTexture) {
        try {
            MH_setDepthTexture_.invokeExact(this.handle, SEL_setDepthTexture_, depthTexture == null ? 0L : depthTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXFrameInterpolatorBase motionTexture]}
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

    /** {@code -[MTLFXFrameInterpolatorBase setMotionTexture:]} */
    public void setMotionTexture(@Nullable final MTLTexture motionTexture) {
        try {
            MH_setMotionTexture_.invokeExact(this.handle, SEL_setMotionTexture_, motionTexture == null ? 0L : motionTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase motionVectorScaleX]} */
    public float motionVectorScaleX() {
        try {
            return (float) MH_motionVectorScaleX.invokeExact(this.handle, SEL_motionVectorScaleX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setMotionVectorScaleX:]} */
    public void setMotionVectorScaleX(final float motionVectorScaleX) {
        try {
            MH_setMotionVectorScaleX_.invokeExact(this.handle, SEL_setMotionVectorScaleX_, motionVectorScaleX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase motionVectorScaleY]} */
    public float motionVectorScaleY() {
        try {
            return (float) MH_motionVectorScaleY.invokeExact(this.handle, SEL_motionVectorScaleY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setMotionVectorScaleY:]} */
    public void setMotionVectorScaleY(final float motionVectorScaleY) {
        try {
            MH_setMotionVectorScaleY_.invokeExact(this.handle, SEL_setMotionVectorScaleY_, motionVectorScaleY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase deltaTime]} */
    public float deltaTime() {
        try {
            return (float) MH_deltaTime.invokeExact(this.handle, SEL_deltaTime);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setDeltaTime:]} */
    public void setDeltaTime(final float deltaTime) {
        try {
            MH_setDeltaTime_.invokeExact(this.handle, SEL_setDeltaTime_, deltaTime);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase nearPlane]} */
    public float nearPlane() {
        try {
            return (float) MH_nearPlane.invokeExact(this.handle, SEL_nearPlane);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setNearPlane:]} */
    public void setNearPlane(final float nearPlane) {
        try {
            MH_setNearPlane_.invokeExact(this.handle, SEL_setNearPlane_, nearPlane);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase farPlane]} */
    public float farPlane() {
        try {
            return (float) MH_farPlane.invokeExact(this.handle, SEL_farPlane);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setFarPlane:]} */
    public void setFarPlane(final float farPlane) {
        try {
            MH_setFarPlane_.invokeExact(this.handle, SEL_setFarPlane_, farPlane);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase fieldOfView]} */
    public float fieldOfView() {
        try {
            return (float) MH_fieldOfView.invokeExact(this.handle, SEL_fieldOfView);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setFieldOfView:]} */
    public void setFieldOfView(final float fieldOfView) {
        try {
            MH_setFieldOfView_.invokeExact(this.handle, SEL_setFieldOfView_, fieldOfView);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase aspectRatio]} */
    public float aspectRatio() {
        try {
            return (float) MH_aspectRatio.invokeExact(this.handle, SEL_aspectRatio);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setAspectRatio:]} */
    public void setAspectRatio(final float aspectRatio) {
        try {
            MH_setAspectRatio_.invokeExact(this.handle, SEL_setAspectRatio_, aspectRatio);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXFrameInterpolatorBase uiTexture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTexture uiTexture() {
        try {
            long result = (long) MH_uiTexture.invokeExact(this.handle, SEL_uiTexture);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setUITexture:]} */
    public void setUITexture(@Nullable final MTLTexture uiTexture) {
        try {
            MH_setUITexture_.invokeExact(this.handle, SEL_setUITexture_, uiTexture == null ? 0L : uiTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase jitterOffsetX]} */
    public float jitterOffsetX() {
        try {
            return (float) MH_jitterOffsetX.invokeExact(this.handle, SEL_jitterOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setJitterOffsetX:]} */
    public void setJitterOffsetX(final float jitterOffsetX) {
        try {
            MH_setJitterOffsetX_.invokeExact(this.handle, SEL_setJitterOffsetX_, jitterOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase jitterOffsetY]} */
    public float jitterOffsetY() {
        try {
            return (float) MH_jitterOffsetY.invokeExact(this.handle, SEL_jitterOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setJitterOffsetY:]} */
    public void setJitterOffsetY(final float jitterOffsetY) {
        try {
            MH_setJitterOffsetY_.invokeExact(this.handle, SEL_setJitterOffsetY_, jitterOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase isUITextureComposited]} */
    public boolean isUITextureComposited() {
        try {
            return (boolean) MH_isUITextureComposited.invokeExact(this.handle, SEL_isUITextureComposited);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setIsUITextureComposited:]} */
    public void setIsUITextureComposited(final boolean uiTextureComposited) {
        try {
            MH_setIsUITextureComposited_.invokeExact(this.handle, SEL_setIsUITextureComposited_, uiTextureComposited);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase shouldResetHistory]} */
    public boolean shouldResetHistory() {
        try {
            return (boolean) MH_shouldResetHistory.invokeExact(this.handle, SEL_shouldResetHistory);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setShouldResetHistory:]} */
    public void setShouldResetHistory(final boolean shouldResetHistory) {
        try {
            MH_setShouldResetHistory_.invokeExact(this.handle, SEL_setShouldResetHistory_, shouldResetHistory);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXFrameInterpolatorBase outputTexture]}
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

    /** {@code -[MTLFXFrameInterpolatorBase setOutputTexture:]} */
    public void setOutputTexture(@Nullable final MTLTexture outputTexture) {
        try {
            MH_setOutputTexture_.invokeExact(this.handle, SEL_setOutputTexture_, outputTexture == null ? 0L : outputTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXFrameInterpolatorBase distortionTexture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTexture distortionTexture() {
        try {
            long result = (long) MH_distortionTexture.invokeExact(this.handle, SEL_distortionTexture);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setDistortionTexture:]} */
    public void setDistortionTexture(@Nullable final MTLTexture distortionTexture) {
        try {
            MH_setDistortionTexture_.invokeExact(this.handle, SEL_setDistortionTexture_, distortionTexture == null ? 0L : distortionTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXFrameInterpolatorBase fence]}
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

    /** {@code -[MTLFXFrameInterpolatorBase setFence:]} */
    public void setFence(@Nullable final MTLFence fence) {
        try {
            MH_setFence_.invokeExact(this.handle, SEL_setFence_, fence == null ? 0L : fence.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase isDepthReversed]} */
    public boolean isDepthReversed() {
        try {
            return (boolean) MH_isDepthReversed.invokeExact(this.handle, SEL_isDepthReversed);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorBase setDepthReversed:]} */
    public void setDepthReversed(final boolean depthReversed) {
        try {
            MH_setDepthReversed_.invokeExact(this.handle, SEL_setDepthReversed_, depthReversed);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
