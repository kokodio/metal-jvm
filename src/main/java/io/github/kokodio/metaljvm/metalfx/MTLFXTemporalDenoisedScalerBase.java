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
 * {@code MTLFXTemporalDenoisedScalerBase}
 *
 * @see <a href="https://developer.apple.com/documentation/metalfx/mtlfxtemporaldenoisedscalerbase">Apple documentation</a>
 */
public class MTLFXTemporalDenoisedScalerBase extends MTLFXFrameInterpolatableScaler {
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
    private static final long SEL_diffuseAlbedoTextureUsage = ObjC.selector("diffuseAlbedoTextureUsage");
    private static final MethodHandle MH_diffuseAlbedoTextureUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_specularAlbedoTextureUsage = ObjC.selector("specularAlbedoTextureUsage");
    private static final MethodHandle MH_specularAlbedoTextureUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_normalTextureUsage = ObjC.selector("normalTextureUsage");
    private static final MethodHandle MH_normalTextureUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_roughnessTextureUsage = ObjC.selector("roughnessTextureUsage");
    private static final MethodHandle MH_roughnessTextureUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_specularHitDistanceTextureUsage = ObjC.selector("specularHitDistanceTextureUsage");
    private static final MethodHandle MH_specularHitDistanceTextureUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_denoiseStrengthMaskTextureUsage = ObjC.selector("denoiseStrengthMaskTextureUsage");
    private static final MethodHandle MH_denoiseStrengthMaskTextureUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_transparencyOverlayTextureUsage = ObjC.selector("transparencyOverlayTextureUsage");
    private static final MethodHandle MH_transparencyOverlayTextureUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_outputTextureUsage = ObjC.selector("outputTextureUsage");
    private static final MethodHandle MH_outputTextureUsage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final long SEL_diffuseAlbedoTexture = ObjC.selector("diffuseAlbedoTexture");
    private static final MethodHandle MH_diffuseAlbedoTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDiffuseAlbedoTexture_ = ObjC.selector("setDiffuseAlbedoTexture:");
    private static final MethodHandle MH_setDiffuseAlbedoTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_specularAlbedoTexture = ObjC.selector("specularAlbedoTexture");
    private static final MethodHandle MH_specularAlbedoTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSpecularAlbedoTexture_ = ObjC.selector("setSpecularAlbedoTexture:");
    private static final MethodHandle MH_setSpecularAlbedoTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_normalTexture = ObjC.selector("normalTexture");
    private static final MethodHandle MH_normalTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setNormalTexture_ = ObjC.selector("setNormalTexture:");
    private static final MethodHandle MH_setNormalTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_roughnessTexture = ObjC.selector("roughnessTexture");
    private static final MethodHandle MH_roughnessTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRoughnessTexture_ = ObjC.selector("setRoughnessTexture:");
    private static final MethodHandle MH_setRoughnessTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_specularHitDistanceTexture = ObjC.selector("specularHitDistanceTexture");
    private static final MethodHandle MH_specularHitDistanceTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSpecularHitDistanceTexture_ = ObjC.selector("setSpecularHitDistanceTexture:");
    private static final MethodHandle MH_setSpecularHitDistanceTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_denoiseStrengthMaskTexture = ObjC.selector("denoiseStrengthMaskTexture");
    private static final MethodHandle MH_denoiseStrengthMaskTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDenoiseStrengthMaskTexture_ = ObjC.selector("setDenoiseStrengthMaskTexture:");
    private static final MethodHandle MH_setDenoiseStrengthMaskTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_transparencyOverlayTexture = ObjC.selector("transparencyOverlayTexture");
    private static final MethodHandle MH_transparencyOverlayTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTransparencyOverlayTexture_ = ObjC.selector("setTransparencyOverlayTexture:");
    private static final MethodHandle MH_setTransparencyOverlayTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_outputTexture = ObjC.selector("outputTexture");
    private static final MethodHandle MH_outputTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOutputTexture_ = ObjC.selector("setOutputTexture:");
    private static final MethodHandle MH_setOutputTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_exposureTexture = ObjC.selector("exposureTexture");
    private static final MethodHandle MH_exposureTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setExposureTexture_ = ObjC.selector("setExposureTexture:");
    private static final MethodHandle MH_setExposureTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_preExposure = ObjC.selector("preExposure");
    private static final MethodHandle MH_preExposure = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPreExposure_ = ObjC.selector("setPreExposure:");
    private static final MethodHandle MH_setPreExposure_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_reactiveMaskTexture = ObjC.selector("reactiveMaskTexture");
    private static final MethodHandle MH_reactiveMaskTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setReactiveMaskTexture_ = ObjC.selector("setReactiveMaskTexture:");
    private static final MethodHandle MH_setReactiveMaskTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final long SEL_shouldResetHistory = ObjC.selector("shouldResetHistory");
    private static final MethodHandle MH_shouldResetHistory = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setShouldResetHistory_ = ObjC.selector("setShouldResetHistory:");
    private static final MethodHandle MH_setShouldResetHistory_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
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
    private static final long SEL_diffuseAlbedoTextureFormat = ObjC.selector("diffuseAlbedoTextureFormat");
    private static final MethodHandle MH_diffuseAlbedoTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_specularAlbedoTextureFormat = ObjC.selector("specularAlbedoTextureFormat");
    private static final MethodHandle MH_specularAlbedoTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_normalTextureFormat = ObjC.selector("normalTextureFormat");
    private static final MethodHandle MH_normalTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_roughnessTextureFormat = ObjC.selector("roughnessTextureFormat");
    private static final MethodHandle MH_roughnessTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_specularHitDistanceTextureFormat = ObjC.selector("specularHitDistanceTextureFormat");
    private static final MethodHandle MH_specularHitDistanceTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_denoiseStrengthMaskTextureFormat = ObjC.selector("denoiseStrengthMaskTextureFormat");
    private static final MethodHandle MH_denoiseStrengthMaskTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_transparencyOverlayTextureFormat = ObjC.selector("transparencyOverlayTextureFormat");
    private static final MethodHandle MH_transparencyOverlayTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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

    public MTLFXTemporalDenoisedScalerBase(final long handle) {
        super(handle);
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerBase colorTextureUsage]}
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
     * {@code -[MTLFXTemporalDenoisedScalerBase depthTextureUsage]}
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
     * {@code -[MTLFXTemporalDenoisedScalerBase motionTextureUsage]}
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
     * {@code -[MTLFXTemporalDenoisedScalerBase reactiveMaskTextureUsage]}
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
     * {@code -[MTLFXTemporalDenoisedScalerBase reactiveTextureUsage]}
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
     * {@code -[MTLFXTemporalDenoisedScalerBase diffuseAlbedoTextureUsage]}
     *
     * @return a combination of {@link MTLTextureUsage} flags
     */
    public long diffuseAlbedoTextureUsage() {
        try {
            return (long) MH_diffuseAlbedoTextureUsage.invokeExact(this.handle, SEL_diffuseAlbedoTextureUsage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerBase specularAlbedoTextureUsage]}
     *
     * @return a combination of {@link MTLTextureUsage} flags
     */
    public long specularAlbedoTextureUsage() {
        try {
            return (long) MH_specularAlbedoTextureUsage.invokeExact(this.handle, SEL_specularAlbedoTextureUsage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerBase normalTextureUsage]}
     *
     * @return a combination of {@link MTLTextureUsage} flags
     */
    public long normalTextureUsage() {
        try {
            return (long) MH_normalTextureUsage.invokeExact(this.handle, SEL_normalTextureUsage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerBase roughnessTextureUsage]}
     *
     * @return a combination of {@link MTLTextureUsage} flags
     */
    public long roughnessTextureUsage() {
        try {
            return (long) MH_roughnessTextureUsage.invokeExact(this.handle, SEL_roughnessTextureUsage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerBase specularHitDistanceTextureUsage]}
     *
     * @return a combination of {@link MTLTextureUsage} flags
     */
    public long specularHitDistanceTextureUsage() {
        try {
            return (long) MH_specularHitDistanceTextureUsage.invokeExact(this.handle, SEL_specularHitDistanceTextureUsage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerBase denoiseStrengthMaskTextureUsage]}
     *
     * @return a combination of {@link MTLTextureUsage} flags
     */
    public long denoiseStrengthMaskTextureUsage() {
        try {
            return (long) MH_denoiseStrengthMaskTextureUsage.invokeExact(this.handle, SEL_denoiseStrengthMaskTextureUsage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerBase transparencyOverlayTextureUsage]}
     *
     * @return a combination of {@link MTLTextureUsage} flags
     */
    public long transparencyOverlayTextureUsage() {
        try {
            return (long) MH_transparencyOverlayTextureUsage.invokeExact(this.handle, SEL_transparencyOverlayTextureUsage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerBase outputTextureUsage]}
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
     * {@code -[MTLFXTemporalDenoisedScalerBase colorTexture]}
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

    /** {@code -[MTLFXTemporalDenoisedScalerBase setColorTexture:]} */
    public void setColorTexture(@Nullable final MTLTexture colorTexture) {
        try {
            MH_setColorTexture_.invokeExact(this.handle, SEL_setColorTexture_, colorTexture == null ? 0L : colorTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerBase depthTexture]}
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

    /** {@code -[MTLFXTemporalDenoisedScalerBase setDepthTexture:]} */
    public void setDepthTexture(@Nullable final MTLTexture depthTexture) {
        try {
            MH_setDepthTexture_.invokeExact(this.handle, SEL_setDepthTexture_, depthTexture == null ? 0L : depthTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerBase motionTexture]}
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

    /** {@code -[MTLFXTemporalDenoisedScalerBase setMotionTexture:]} */
    public void setMotionTexture(@Nullable final MTLTexture motionTexture) {
        try {
            MH_setMotionTexture_.invokeExact(this.handle, SEL_setMotionTexture_, motionTexture == null ? 0L : motionTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerBase diffuseAlbedoTexture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTexture diffuseAlbedoTexture() {
        try {
            long result = (long) MH_diffuseAlbedoTexture.invokeExact(this.handle, SEL_diffuseAlbedoTexture);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase setDiffuseAlbedoTexture:]} */
    public void setDiffuseAlbedoTexture(@Nullable final MTLTexture diffuseAlbedoTexture) {
        try {
            MH_setDiffuseAlbedoTexture_.invokeExact(this.handle, SEL_setDiffuseAlbedoTexture_, diffuseAlbedoTexture == null ? 0L : diffuseAlbedoTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerBase specularAlbedoTexture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTexture specularAlbedoTexture() {
        try {
            long result = (long) MH_specularAlbedoTexture.invokeExact(this.handle, SEL_specularAlbedoTexture);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase setSpecularAlbedoTexture:]} */
    public void setSpecularAlbedoTexture(@Nullable final MTLTexture specularAlbedoTexture) {
        try {
            MH_setSpecularAlbedoTexture_.invokeExact(this.handle, SEL_setSpecularAlbedoTexture_, specularAlbedoTexture == null ? 0L : specularAlbedoTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerBase normalTexture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTexture normalTexture() {
        try {
            long result = (long) MH_normalTexture.invokeExact(this.handle, SEL_normalTexture);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase setNormalTexture:]} */
    public void setNormalTexture(@Nullable final MTLTexture normalTexture) {
        try {
            MH_setNormalTexture_.invokeExact(this.handle, SEL_setNormalTexture_, normalTexture == null ? 0L : normalTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerBase roughnessTexture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTexture roughnessTexture() {
        try {
            long result = (long) MH_roughnessTexture.invokeExact(this.handle, SEL_roughnessTexture);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase setRoughnessTexture:]} */
    public void setRoughnessTexture(@Nullable final MTLTexture roughnessTexture) {
        try {
            MH_setRoughnessTexture_.invokeExact(this.handle, SEL_setRoughnessTexture_, roughnessTexture == null ? 0L : roughnessTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerBase specularHitDistanceTexture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTexture specularHitDistanceTexture() {
        try {
            long result = (long) MH_specularHitDistanceTexture.invokeExact(this.handle, SEL_specularHitDistanceTexture);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase setSpecularHitDistanceTexture:]} */
    public void setSpecularHitDistanceTexture(@Nullable final MTLTexture specularHitDistanceTexture) {
        try {
            MH_setSpecularHitDistanceTexture_.invokeExact(this.handle, SEL_setSpecularHitDistanceTexture_, specularHitDistanceTexture == null ? 0L : specularHitDistanceTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerBase denoiseStrengthMaskTexture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTexture denoiseStrengthMaskTexture() {
        try {
            long result = (long) MH_denoiseStrengthMaskTexture.invokeExact(this.handle, SEL_denoiseStrengthMaskTexture);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase setDenoiseStrengthMaskTexture:]} */
    public void setDenoiseStrengthMaskTexture(@Nullable final MTLTexture denoiseStrengthMaskTexture) {
        try {
            MH_setDenoiseStrengthMaskTexture_.invokeExact(this.handle, SEL_setDenoiseStrengthMaskTexture_, denoiseStrengthMaskTexture == null ? 0L : denoiseStrengthMaskTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerBase transparencyOverlayTexture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTexture transparencyOverlayTexture() {
        try {
            long result = (long) MH_transparencyOverlayTexture.invokeExact(this.handle, SEL_transparencyOverlayTexture);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase setTransparencyOverlayTexture:]} */
    public void setTransparencyOverlayTexture(@Nullable final MTLTexture transparencyOverlayTexture) {
        try {
            MH_setTransparencyOverlayTexture_.invokeExact(this.handle, SEL_setTransparencyOverlayTexture_, transparencyOverlayTexture == null ? 0L : transparencyOverlayTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerBase outputTexture]}
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

    /** {@code -[MTLFXTemporalDenoisedScalerBase setOutputTexture:]} */
    public void setOutputTexture(@Nullable final MTLTexture outputTexture) {
        try {
            MH_setOutputTexture_.invokeExact(this.handle, SEL_setOutputTexture_, outputTexture == null ? 0L : outputTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerBase exposureTexture]}
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

    /** {@code -[MTLFXTemporalDenoisedScalerBase setExposureTexture:]} */
    public void setExposureTexture(@Nullable final MTLTexture exposureTexture) {
        try {
            MH_setExposureTexture_.invokeExact(this.handle, SEL_setExposureTexture_, exposureTexture == null ? 0L : exposureTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase preExposure]} */
    public float preExposure() {
        try {
            return (float) MH_preExposure.invokeExact(this.handle, SEL_preExposure);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase setPreExposure:]} */
    public void setPreExposure(final float preExposure) {
        try {
            MH_setPreExposure_.invokeExact(this.handle, SEL_setPreExposure_, preExposure);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerBase reactiveMaskTexture]}
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

    /** {@code -[MTLFXTemporalDenoisedScalerBase setReactiveMaskTexture:]} */
    public void setReactiveMaskTexture(@Nullable final MTLTexture reactiveMaskTexture) {
        try {
            MH_setReactiveMaskTexture_.invokeExact(this.handle, SEL_setReactiveMaskTexture_, reactiveMaskTexture == null ? 0L : reactiveMaskTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase jitterOffsetX]} */
    public float jitterOffsetX() {
        try {
            return (float) MH_jitterOffsetX.invokeExact(this.handle, SEL_jitterOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase setJitterOffsetX:]} */
    public void setJitterOffsetX(final float jitterOffsetX) {
        try {
            MH_setJitterOffsetX_.invokeExact(this.handle, SEL_setJitterOffsetX_, jitterOffsetX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase jitterOffsetY]} */
    public float jitterOffsetY() {
        try {
            return (float) MH_jitterOffsetY.invokeExact(this.handle, SEL_jitterOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase setJitterOffsetY:]} */
    public void setJitterOffsetY(final float jitterOffsetY) {
        try {
            MH_setJitterOffsetY_.invokeExact(this.handle, SEL_setJitterOffsetY_, jitterOffsetY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase motionVectorScaleX]} */
    public float motionVectorScaleX() {
        try {
            return (float) MH_motionVectorScaleX.invokeExact(this.handle, SEL_motionVectorScaleX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase setMotionVectorScaleX:]} */
    public void setMotionVectorScaleX(final float motionVectorScaleX) {
        try {
            MH_setMotionVectorScaleX_.invokeExact(this.handle, SEL_setMotionVectorScaleX_, motionVectorScaleX);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase motionVectorScaleY]} */
    public float motionVectorScaleY() {
        try {
            return (float) MH_motionVectorScaleY.invokeExact(this.handle, SEL_motionVectorScaleY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase setMotionVectorScaleY:]} */
    public void setMotionVectorScaleY(final float motionVectorScaleY) {
        try {
            MH_setMotionVectorScaleY_.invokeExact(this.handle, SEL_setMotionVectorScaleY_, motionVectorScaleY);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase shouldResetHistory]} */
    public boolean shouldResetHistory() {
        try {
            return (boolean) MH_shouldResetHistory.invokeExact(this.handle, SEL_shouldResetHistory);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase setShouldResetHistory:]} */
    public void setShouldResetHistory(final boolean shouldResetHistory) {
        try {
            MH_setShouldResetHistory_.invokeExact(this.handle, SEL_setShouldResetHistory_, shouldResetHistory);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase isDepthReversed]} */
    public boolean isDepthReversed() {
        try {
            return (boolean) MH_isDepthReversed.invokeExact(this.handle, SEL_isDepthReversed);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase setDepthReversed:]} */
    public void setDepthReversed(final boolean depthReversed) {
        try {
            MH_setDepthReversed_.invokeExact(this.handle, SEL_setDepthReversed_, depthReversed);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase colorTextureFormat]} */
    public MTLPixelFormat colorTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_colorTextureFormat.invokeExact(this.handle, SEL_colorTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase depthTextureFormat]} */
    public MTLPixelFormat depthTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_depthTextureFormat.invokeExact(this.handle, SEL_depthTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase motionTextureFormat]} */
    public MTLPixelFormat motionTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_motionTextureFormat.invokeExact(this.handle, SEL_motionTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase diffuseAlbedoTextureFormat]} */
    public MTLPixelFormat diffuseAlbedoTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_diffuseAlbedoTextureFormat.invokeExact(this.handle, SEL_diffuseAlbedoTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase specularAlbedoTextureFormat]} */
    public MTLPixelFormat specularAlbedoTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_specularAlbedoTextureFormat.invokeExact(this.handle, SEL_specularAlbedoTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase normalTextureFormat]} */
    public MTLPixelFormat normalTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_normalTextureFormat.invokeExact(this.handle, SEL_normalTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase roughnessTextureFormat]} */
    public MTLPixelFormat roughnessTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_roughnessTextureFormat.invokeExact(this.handle, SEL_roughnessTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase specularHitDistanceTextureFormat]} */
    public MTLPixelFormat specularHitDistanceTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_specularHitDistanceTextureFormat.invokeExact(this.handle, SEL_specularHitDistanceTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase denoiseStrengthMaskTextureFormat]} */
    public MTLPixelFormat denoiseStrengthMaskTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_denoiseStrengthMaskTextureFormat.invokeExact(this.handle, SEL_denoiseStrengthMaskTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase transparencyOverlayTextureFormat]} */
    public MTLPixelFormat transparencyOverlayTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_transparencyOverlayTextureFormat.invokeExact(this.handle, SEL_transparencyOverlayTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase reactiveMaskTextureFormat]} */
    public MTLPixelFormat reactiveMaskTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_reactiveMaskTextureFormat.invokeExact(this.handle, SEL_reactiveMaskTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase outputTextureFormat]} */
    public MTLPixelFormat outputTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_outputTextureFormat.invokeExact(this.handle, SEL_outputTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase inputWidth]} */
    public long inputWidth() {
        try {
            return (long) MH_inputWidth.invokeExact(this.handle, SEL_inputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase inputHeight]} */
    public long inputHeight() {
        try {
            return (long) MH_inputHeight.invokeExact(this.handle, SEL_inputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase outputWidth]} */
    public long outputWidth() {
        try {
            return (long) MH_outputWidth.invokeExact(this.handle, SEL_outputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase outputHeight]} */
    public long outputHeight() {
        try {
            return (long) MH_outputHeight.invokeExact(this.handle, SEL_outputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase inputContentMinScale]} */
    public float inputContentMinScale() {
        try {
            return (float) MH_inputContentMinScale.invokeExact(this.handle, SEL_inputContentMinScale);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerBase inputContentMaxScale]} */
    public float inputContentMaxScale() {
        try {
            return (float) MH_inputContentMaxScale.invokeExact(this.handle, SEL_inputContentMaxScale);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerBase fence]}
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

    /** {@code -[MTLFXTemporalDenoisedScalerBase setFence:]} */
    public void setFence(@Nullable final MTLFence fence) {
        try {
            MH_setFence_.invokeExact(this.handle, SEL_setFence_, fence == null ? 0L : fence.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
