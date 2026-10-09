package io.github.kokodio.metaljvm.metalfx;

import io.github.kokodio.metaljvm.metal.MTL4Compiler;
import io.github.kokodio.metaljvm.metal.MTLDevice;
import io.github.kokodio.metaljvm.metal.MTLPixelFormat;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLFXTemporalDenoisedScalerDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metalfx/mtlfxtemporaldenoisedscalerdescriptor">Apple documentation</a>
 */
public class MTLFXTemporalDenoisedScalerDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("MetalFX");
    private static final long CLS = ObjC.clazz("MTLFXTemporalDenoisedScalerDescriptor");
    private static final long SEL_newTemporalDenoisedScalerWithDevice_ = ObjC.selector("newTemporalDenoisedScalerWithDevice:");
    private static final MethodHandle MH_newTemporalDenoisedScalerWithDevice_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newTemporalDenoisedScalerWithDevice_compiler_ = ObjC.selector("newTemporalDenoisedScalerWithDevice:compiler:");
    private static final MethodHandle MH_newTemporalDenoisedScalerWithDevice_compiler_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_supportedInputContentMinScaleForDevice_ = ObjC.selector("supportedInputContentMinScaleForDevice:");
    private static final MethodHandle MH_CLASS_supportedInputContentMinScaleForDevice_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_supportedInputContentMaxScaleForDevice_ = ObjC.selector("supportedInputContentMaxScaleForDevice:");
    private static final MethodHandle MH_CLASS_supportedInputContentMaxScaleForDevice_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_supportsMetal4FX_ = ObjC.selector("supportsMetal4FX:");
    private static final MethodHandle MH_CLASS_supportsMetal4FX_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_supportsDevice_ = ObjC.selector("supportsDevice:");
    private static final MethodHandle MH_CLASS_supportsDevice_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_colorTextureFormat = ObjC.selector("colorTextureFormat");
    private static final MethodHandle MH_colorTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setColorTextureFormat_ = ObjC.selector("setColorTextureFormat:");
    private static final MethodHandle MH_setColorTextureFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_depthTextureFormat = ObjC.selector("depthTextureFormat");
    private static final MethodHandle MH_depthTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthTextureFormat_ = ObjC.selector("setDepthTextureFormat:");
    private static final MethodHandle MH_setDepthTextureFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionTextureFormat = ObjC.selector("motionTextureFormat");
    private static final MethodHandle MH_motionTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionTextureFormat_ = ObjC.selector("setMotionTextureFormat:");
    private static final MethodHandle MH_setMotionTextureFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_diffuseAlbedoTextureFormat = ObjC.selector("diffuseAlbedoTextureFormat");
    private static final MethodHandle MH_diffuseAlbedoTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDiffuseAlbedoTextureFormat_ = ObjC.selector("setDiffuseAlbedoTextureFormat:");
    private static final MethodHandle MH_setDiffuseAlbedoTextureFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_specularAlbedoTextureFormat = ObjC.selector("specularAlbedoTextureFormat");
    private static final MethodHandle MH_specularAlbedoTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSpecularAlbedoTextureFormat_ = ObjC.selector("setSpecularAlbedoTextureFormat:");
    private static final MethodHandle MH_setSpecularAlbedoTextureFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_normalTextureFormat = ObjC.selector("normalTextureFormat");
    private static final MethodHandle MH_normalTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setNormalTextureFormat_ = ObjC.selector("setNormalTextureFormat:");
    private static final MethodHandle MH_setNormalTextureFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_roughnessTextureFormat = ObjC.selector("roughnessTextureFormat");
    private static final MethodHandle MH_roughnessTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRoughnessTextureFormat_ = ObjC.selector("setRoughnessTextureFormat:");
    private static final MethodHandle MH_setRoughnessTextureFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_specularHitDistanceTextureFormat = ObjC.selector("specularHitDistanceTextureFormat");
    private static final MethodHandle MH_specularHitDistanceTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSpecularHitDistanceTextureFormat_ = ObjC.selector("setSpecularHitDistanceTextureFormat:");
    private static final MethodHandle MH_setSpecularHitDistanceTextureFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_denoiseStrengthMaskTextureFormat = ObjC.selector("denoiseStrengthMaskTextureFormat");
    private static final MethodHandle MH_denoiseStrengthMaskTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDenoiseStrengthMaskTextureFormat_ = ObjC.selector("setDenoiseStrengthMaskTextureFormat:");
    private static final MethodHandle MH_setDenoiseStrengthMaskTextureFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_transparencyOverlayTextureFormat = ObjC.selector("transparencyOverlayTextureFormat");
    private static final MethodHandle MH_transparencyOverlayTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTransparencyOverlayTextureFormat_ = ObjC.selector("setTransparencyOverlayTextureFormat:");
    private static final MethodHandle MH_setTransparencyOverlayTextureFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_outputTextureFormat = ObjC.selector("outputTextureFormat");
    private static final MethodHandle MH_outputTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOutputTextureFormat_ = ObjC.selector("setOutputTextureFormat:");
    private static final MethodHandle MH_setOutputTextureFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_inputWidth = ObjC.selector("inputWidth");
    private static final MethodHandle MH_inputWidth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInputWidth_ = ObjC.selector("setInputWidth:");
    private static final MethodHandle MH_setInputWidth_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_inputHeight = ObjC.selector("inputHeight");
    private static final MethodHandle MH_inputHeight = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInputHeight_ = ObjC.selector("setInputHeight:");
    private static final MethodHandle MH_setInputHeight_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_outputWidth = ObjC.selector("outputWidth");
    private static final MethodHandle MH_outputWidth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOutputWidth_ = ObjC.selector("setOutputWidth:");
    private static final MethodHandle MH_setOutputWidth_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_outputHeight = ObjC.selector("outputHeight");
    private static final MethodHandle MH_outputHeight = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOutputHeight_ = ObjC.selector("setOutputHeight:");
    private static final MethodHandle MH_setOutputHeight_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_requiresSynchronousInitialization = ObjC.selector("requiresSynchronousInitialization");
    private static final MethodHandle MH_requiresSynchronousInitialization = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRequiresSynchronousInitialization_ = ObjC.selector("setRequiresSynchronousInitialization:");
    private static final MethodHandle MH_setRequiresSynchronousInitialization_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_isAutoExposureEnabled = ObjC.selector("isAutoExposureEnabled");
    private static final MethodHandle MH_isAutoExposureEnabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAutoExposureEnabled_ = ObjC.selector("setAutoExposureEnabled:");
    private static final MethodHandle MH_setAutoExposureEnabled_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_isReactiveMaskTextureEnabled = ObjC.selector("isReactiveMaskTextureEnabled");
    private static final MethodHandle MH_isReactiveMaskTextureEnabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setReactiveMaskTextureEnabled_ = ObjC.selector("setReactiveMaskTextureEnabled:");
    private static final MethodHandle MH_setReactiveMaskTextureEnabled_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_reactiveMaskTextureFormat = ObjC.selector("reactiveMaskTextureFormat");
    private static final MethodHandle MH_reactiveMaskTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setReactiveMaskTextureFormat_ = ObjC.selector("setReactiveMaskTextureFormat:");
    private static final MethodHandle MH_setReactiveMaskTextureFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isSpecularHitDistanceTextureEnabled = ObjC.selector("isSpecularHitDistanceTextureEnabled");
    private static final MethodHandle MH_isSpecularHitDistanceTextureEnabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSpecularHitDistanceTextureEnabled_ = ObjC.selector("setSpecularHitDistanceTextureEnabled:");
    private static final MethodHandle MH_setSpecularHitDistanceTextureEnabled_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_isDenoiseStrengthMaskTextureEnabled = ObjC.selector("isDenoiseStrengthMaskTextureEnabled");
    private static final MethodHandle MH_isDenoiseStrengthMaskTextureEnabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDenoiseStrengthMaskTextureEnabled_ = ObjC.selector("setDenoiseStrengthMaskTextureEnabled:");
    private static final MethodHandle MH_setDenoiseStrengthMaskTextureEnabled_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_isTransparencyOverlayTextureEnabled = ObjC.selector("isTransparencyOverlayTextureEnabled");
    private static final MethodHandle MH_isTransparencyOverlayTextureEnabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTransparencyOverlayTextureEnabled_ = ObjC.selector("setTransparencyOverlayTextureEnabled:");
    private static final MethodHandle MH_setTransparencyOverlayTextureEnabled_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLFXTemporalDenoisedScalerDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLFXTemporalDenoisedScalerDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLFXTemporalDenoisedScalerDescriptor alloc() {
        try {
            return new MTLFXTemporalDenoisedScalerDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor init]} */
    public MTLFXTemporalDenoisedScalerDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerDescriptor newTemporalDenoisedScalerWithDevice:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLFXTemporalDenoisedScaler newTemporalDenoisedScaler(final MTLDevice device) {
        try {
            long result = (long) MH_newTemporalDenoisedScalerWithDevice_.invokeExact(this.handle, SEL_newTemporalDenoisedScalerWithDevice_, device.handle());
            return result == 0L ? null : new MTLFXTemporalDenoisedScaler(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalDenoisedScalerDescriptor newTemporalDenoisedScalerWithDevice:compiler:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTL4FXTemporalDenoisedScaler newTemporalDenoisedScaler(final MTLDevice device, final MTL4Compiler compiler) {
        try {
            long result = (long) MH_newTemporalDenoisedScalerWithDevice_compiler_.invokeExact(this.handle, SEL_newTemporalDenoisedScalerWithDevice_compiler_, device.handle(), compiler.handle());
            return result == 0L ? null : new MTL4FXTemporalDenoisedScaler(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLFXTemporalDenoisedScalerDescriptor supportedInputContentMinScaleForDevice:]} */
    public static float supportedInputContentMinScaleForDevice(final MTLDevice device) {
        try {
            return (float) MH_CLASS_supportedInputContentMinScaleForDevice_.invokeExact(CLS, SEL_CLASS_supportedInputContentMinScaleForDevice_, device.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLFXTemporalDenoisedScalerDescriptor supportedInputContentMaxScaleForDevice:]} */
    public static float supportedInputContentMaxScaleForDevice(final MTLDevice device) {
        try {
            return (float) MH_CLASS_supportedInputContentMaxScaleForDevice_.invokeExact(CLS, SEL_CLASS_supportedInputContentMaxScaleForDevice_, device.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLFXTemporalDenoisedScalerDescriptor supportsMetal4FX:]} */
    public static boolean supportsMetal4FX(final MTLDevice device) {
        try {
            return (boolean) MH_CLASS_supportsMetal4FX_.invokeExact(CLS, SEL_CLASS_supportsMetal4FX_, device.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLFXTemporalDenoisedScalerDescriptor supportsDevice:]} */
    public static boolean supportsDevice(final MTLDevice device) {
        try {
            return (boolean) MH_CLASS_supportsDevice_.invokeExact(CLS, SEL_CLASS_supportsDevice_, device.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor colorTextureFormat]} */
    public MTLPixelFormat colorTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_colorTextureFormat.invokeExact(this.handle, SEL_colorTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setColorTextureFormat:]} */
    public void setColorTextureFormat(final MTLPixelFormat colorTextureFormat) {
        try {
            MH_setColorTextureFormat_.invokeExact(this.handle, SEL_setColorTextureFormat_, colorTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor depthTextureFormat]} */
    public MTLPixelFormat depthTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_depthTextureFormat.invokeExact(this.handle, SEL_depthTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setDepthTextureFormat:]} */
    public void setDepthTextureFormat(final MTLPixelFormat depthTextureFormat) {
        try {
            MH_setDepthTextureFormat_.invokeExact(this.handle, SEL_setDepthTextureFormat_, depthTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor motionTextureFormat]} */
    public MTLPixelFormat motionTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_motionTextureFormat.invokeExact(this.handle, SEL_motionTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setMotionTextureFormat:]} */
    public void setMotionTextureFormat(final MTLPixelFormat motionTextureFormat) {
        try {
            MH_setMotionTextureFormat_.invokeExact(this.handle, SEL_setMotionTextureFormat_, motionTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor diffuseAlbedoTextureFormat]} */
    public MTLPixelFormat diffuseAlbedoTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_diffuseAlbedoTextureFormat.invokeExact(this.handle, SEL_diffuseAlbedoTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setDiffuseAlbedoTextureFormat:]} */
    public void setDiffuseAlbedoTextureFormat(final MTLPixelFormat diffuseAlbedoTextureFormat) {
        try {
            MH_setDiffuseAlbedoTextureFormat_.invokeExact(this.handle, SEL_setDiffuseAlbedoTextureFormat_, diffuseAlbedoTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor specularAlbedoTextureFormat]} */
    public MTLPixelFormat specularAlbedoTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_specularAlbedoTextureFormat.invokeExact(this.handle, SEL_specularAlbedoTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setSpecularAlbedoTextureFormat:]} */
    public void setSpecularAlbedoTextureFormat(final MTLPixelFormat specularAlbedoTextureFormat) {
        try {
            MH_setSpecularAlbedoTextureFormat_.invokeExact(this.handle, SEL_setSpecularAlbedoTextureFormat_, specularAlbedoTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor normalTextureFormat]} */
    public MTLPixelFormat normalTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_normalTextureFormat.invokeExact(this.handle, SEL_normalTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setNormalTextureFormat:]} */
    public void setNormalTextureFormat(final MTLPixelFormat normalTextureFormat) {
        try {
            MH_setNormalTextureFormat_.invokeExact(this.handle, SEL_setNormalTextureFormat_, normalTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor roughnessTextureFormat]} */
    public MTLPixelFormat roughnessTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_roughnessTextureFormat.invokeExact(this.handle, SEL_roughnessTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setRoughnessTextureFormat:]} */
    public void setRoughnessTextureFormat(final MTLPixelFormat roughnessTextureFormat) {
        try {
            MH_setRoughnessTextureFormat_.invokeExact(this.handle, SEL_setRoughnessTextureFormat_, roughnessTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor specularHitDistanceTextureFormat]} */
    public MTLPixelFormat specularHitDistanceTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_specularHitDistanceTextureFormat.invokeExact(this.handle, SEL_specularHitDistanceTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setSpecularHitDistanceTextureFormat:]} */
    public void setSpecularHitDistanceTextureFormat(final MTLPixelFormat specularHitDistanceTextureFormat) {
        try {
            MH_setSpecularHitDistanceTextureFormat_.invokeExact(this.handle, SEL_setSpecularHitDistanceTextureFormat_, specularHitDistanceTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor denoiseStrengthMaskTextureFormat]} */
    public MTLPixelFormat denoiseStrengthMaskTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_denoiseStrengthMaskTextureFormat.invokeExact(this.handle, SEL_denoiseStrengthMaskTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setDenoiseStrengthMaskTextureFormat:]} */
    public void setDenoiseStrengthMaskTextureFormat(final MTLPixelFormat denoiseStrengthMaskTextureFormat) {
        try {
            MH_setDenoiseStrengthMaskTextureFormat_.invokeExact(this.handle, SEL_setDenoiseStrengthMaskTextureFormat_, denoiseStrengthMaskTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor transparencyOverlayTextureFormat]} */
    public MTLPixelFormat transparencyOverlayTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_transparencyOverlayTextureFormat.invokeExact(this.handle, SEL_transparencyOverlayTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setTransparencyOverlayTextureFormat:]} */
    public void setTransparencyOverlayTextureFormat(final MTLPixelFormat transparencyOverlayTextureFormat) {
        try {
            MH_setTransparencyOverlayTextureFormat_.invokeExact(this.handle, SEL_setTransparencyOverlayTextureFormat_, transparencyOverlayTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor outputTextureFormat]} */
    public MTLPixelFormat outputTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_outputTextureFormat.invokeExact(this.handle, SEL_outputTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setOutputTextureFormat:]} */
    public void setOutputTextureFormat(final MTLPixelFormat outputTextureFormat) {
        try {
            MH_setOutputTextureFormat_.invokeExact(this.handle, SEL_setOutputTextureFormat_, outputTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor inputWidth]} */
    public long inputWidth() {
        try {
            return (long) MH_inputWidth.invokeExact(this.handle, SEL_inputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setInputWidth:]} */
    public void setInputWidth(final long inputWidth) {
        try {
            MH_setInputWidth_.invokeExact(this.handle, SEL_setInputWidth_, inputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor inputHeight]} */
    public long inputHeight() {
        try {
            return (long) MH_inputHeight.invokeExact(this.handle, SEL_inputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setInputHeight:]} */
    public void setInputHeight(final long inputHeight) {
        try {
            MH_setInputHeight_.invokeExact(this.handle, SEL_setInputHeight_, inputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor outputWidth]} */
    public long outputWidth() {
        try {
            return (long) MH_outputWidth.invokeExact(this.handle, SEL_outputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setOutputWidth:]} */
    public void setOutputWidth(final long outputWidth) {
        try {
            MH_setOutputWidth_.invokeExact(this.handle, SEL_setOutputWidth_, outputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor outputHeight]} */
    public long outputHeight() {
        try {
            return (long) MH_outputHeight.invokeExact(this.handle, SEL_outputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setOutputHeight:]} */
    public void setOutputHeight(final long outputHeight) {
        try {
            MH_setOutputHeight_.invokeExact(this.handle, SEL_setOutputHeight_, outputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor requiresSynchronousInitialization]} */
    public boolean requiresSynchronousInitialization() {
        try {
            return (boolean) MH_requiresSynchronousInitialization.invokeExact(this.handle, SEL_requiresSynchronousInitialization);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setRequiresSynchronousInitialization:]} */
    public void setRequiresSynchronousInitialization(final boolean requiresSynchronousInitialization) {
        try {
            MH_setRequiresSynchronousInitialization_.invokeExact(this.handle, SEL_setRequiresSynchronousInitialization_, requiresSynchronousInitialization);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor isAutoExposureEnabled]} */
    public boolean isAutoExposureEnabled() {
        try {
            return (boolean) MH_isAutoExposureEnabled.invokeExact(this.handle, SEL_isAutoExposureEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setAutoExposureEnabled:]} */
    public void setAutoExposureEnabled(final boolean autoExposureEnabled) {
        try {
            MH_setAutoExposureEnabled_.invokeExact(this.handle, SEL_setAutoExposureEnabled_, autoExposureEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor isReactiveMaskTextureEnabled]} */
    public boolean isReactiveMaskTextureEnabled() {
        try {
            return (boolean) MH_isReactiveMaskTextureEnabled.invokeExact(this.handle, SEL_isReactiveMaskTextureEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setReactiveMaskTextureEnabled:]} */
    public void setReactiveMaskTextureEnabled(final boolean reactiveMaskTextureEnabled) {
        try {
            MH_setReactiveMaskTextureEnabled_.invokeExact(this.handle, SEL_setReactiveMaskTextureEnabled_, reactiveMaskTextureEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor reactiveMaskTextureFormat]} */
    public MTLPixelFormat reactiveMaskTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_reactiveMaskTextureFormat.invokeExact(this.handle, SEL_reactiveMaskTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setReactiveMaskTextureFormat:]} */
    public void setReactiveMaskTextureFormat(final MTLPixelFormat reactiveMaskTextureFormat) {
        try {
            MH_setReactiveMaskTextureFormat_.invokeExact(this.handle, SEL_setReactiveMaskTextureFormat_, reactiveMaskTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor isSpecularHitDistanceTextureEnabled]} */
    public boolean isSpecularHitDistanceTextureEnabled() {
        try {
            return (boolean) MH_isSpecularHitDistanceTextureEnabled.invokeExact(this.handle, SEL_isSpecularHitDistanceTextureEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setSpecularHitDistanceTextureEnabled:]} */
    public void setSpecularHitDistanceTextureEnabled(final boolean specularHitDistanceTextureEnabled) {
        try {
            MH_setSpecularHitDistanceTextureEnabled_.invokeExact(this.handle, SEL_setSpecularHitDistanceTextureEnabled_, specularHitDistanceTextureEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor isDenoiseStrengthMaskTextureEnabled]} */
    public boolean isDenoiseStrengthMaskTextureEnabled() {
        try {
            return (boolean) MH_isDenoiseStrengthMaskTextureEnabled.invokeExact(this.handle, SEL_isDenoiseStrengthMaskTextureEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setDenoiseStrengthMaskTextureEnabled:]} */
    public void setDenoiseStrengthMaskTextureEnabled(final boolean denoiseStrengthMaskTextureEnabled) {
        try {
            MH_setDenoiseStrengthMaskTextureEnabled_.invokeExact(this.handle, SEL_setDenoiseStrengthMaskTextureEnabled_, denoiseStrengthMaskTextureEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor isTransparencyOverlayTextureEnabled]} */
    public boolean isTransparencyOverlayTextureEnabled() {
        try {
            return (boolean) MH_isTransparencyOverlayTextureEnabled.invokeExact(this.handle, SEL_isTransparencyOverlayTextureEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalDenoisedScalerDescriptor setTransparencyOverlayTextureEnabled:]} */
    public void setTransparencyOverlayTextureEnabled(final boolean transparencyOverlayTextureEnabled) {
        try {
            MH_setTransparencyOverlayTextureEnabled_.invokeExact(this.handle, SEL_setTransparencyOverlayTextureEnabled_, transparencyOverlayTextureEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
