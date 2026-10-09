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
 * {@code MTLFXTemporalScalerDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metalfx/mtlfxtemporalscalerdescriptor">Apple documentation</a>
 */
public class MTLFXTemporalScalerDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("MetalFX");
    private static final long CLS = ObjC.clazz("MTLFXTemporalScalerDescriptor");
    private static final long SEL_newTemporalScalerWithDevice_ = ObjC.selector("newTemporalScalerWithDevice:");
    private static final MethodHandle MH_newTemporalScalerWithDevice_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newTemporalScalerWithDevice_compiler_ = ObjC.selector("newTemporalScalerWithDevice:compiler:");
    private static final MethodHandle MH_newTemporalScalerWithDevice_compiler_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_supportedInputContentMinScaleForDevice_ = ObjC.selector("supportedInputContentMinScaleForDevice:");
    private static final MethodHandle MH_CLASS_supportedInputContentMinScaleForDevice_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_supportedInputContentMaxScaleForDevice_ = ObjC.selector("supportedInputContentMaxScaleForDevice:");
    private static final MethodHandle MH_CLASS_supportedInputContentMaxScaleForDevice_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_supportsDevice_ = ObjC.selector("supportsDevice:");
    private static final MethodHandle MH_CLASS_supportsDevice_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_supportsMetal4FX_ = ObjC.selector("supportsMetal4FX:");
    private static final MethodHandle MH_CLASS_supportsMetal4FX_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final long SEL_isAutoExposureEnabled = ObjC.selector("isAutoExposureEnabled");
    private static final MethodHandle MH_isAutoExposureEnabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAutoExposureEnabled_ = ObjC.selector("setAutoExposureEnabled:");
    private static final MethodHandle MH_setAutoExposureEnabled_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_requiresSynchronousInitialization = ObjC.selector("requiresSynchronousInitialization");
    private static final MethodHandle MH_requiresSynchronousInitialization = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRequiresSynchronousInitialization_ = ObjC.selector("setRequiresSynchronousInitialization:");
    private static final MethodHandle MH_setRequiresSynchronousInitialization_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_isInputContentPropertiesEnabled = ObjC.selector("isInputContentPropertiesEnabled");
    private static final MethodHandle MH_isInputContentPropertiesEnabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInputContentPropertiesEnabled_ = ObjC.selector("setInputContentPropertiesEnabled:");
    private static final MethodHandle MH_setInputContentPropertiesEnabled_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_inputContentMinScale = ObjC.selector("inputContentMinScale");
    private static final MethodHandle MH_inputContentMinScale = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInputContentMinScale_ = ObjC.selector("setInputContentMinScale:");
    private static final MethodHandle MH_setInputContentMinScale_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_inputContentMaxScale = ObjC.selector("inputContentMaxScale");
    private static final MethodHandle MH_inputContentMaxScale = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInputContentMaxScale_ = ObjC.selector("setInputContentMaxScale:");
    private static final MethodHandle MH_setInputContentMaxScale_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_isOutputResolutionMotionVectorsEnabled = ObjC.selector("isOutputResolutionMotionVectorsEnabled");
    private static final MethodHandle MH_isOutputResolutionMotionVectorsEnabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOutputResolutionMotionVectorsEnabled_ = ObjC.selector("setOutputResolutionMotionVectorsEnabled:");
    private static final MethodHandle MH_setOutputResolutionMotionVectorsEnabled_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_isJitteredMotionVectorsEnabled = ObjC.selector("isJitteredMotionVectorsEnabled");
    private static final MethodHandle MH_isJitteredMotionVectorsEnabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setJitteredMotionVectorsEnabled_ = ObjC.selector("setJitteredMotionVectorsEnabled:");
    private static final MethodHandle MH_setJitteredMotionVectorsEnabled_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_isReactiveMaskTextureEnabled = ObjC.selector("isReactiveMaskTextureEnabled");
    private static final MethodHandle MH_isReactiveMaskTextureEnabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setReactiveMaskTextureEnabled_ = ObjC.selector("setReactiveMaskTextureEnabled:");
    private static final MethodHandle MH_setReactiveMaskTextureEnabled_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_reactiveMaskTextureFormat = ObjC.selector("reactiveMaskTextureFormat");
    private static final MethodHandle MH_reactiveMaskTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setReactiveMaskTextureFormat_ = ObjC.selector("setReactiveMaskTextureFormat:");
    private static final MethodHandle MH_setReactiveMaskTextureFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLFXTemporalScalerDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLFXTemporalScalerDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLFXTemporalScalerDescriptor alloc() {
        try {
            return new MTLFXTemporalScalerDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor init]} */
    public MTLFXTemporalScalerDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalScalerDescriptor newTemporalScalerWithDevice:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLFXTemporalScaler newTemporalScaler(final MTLDevice device) {
        try {
            long result = (long) MH_newTemporalScalerWithDevice_.invokeExact(this.handle, SEL_newTemporalScalerWithDevice_, device.handle());
            return result == 0L ? null : new MTLFXTemporalScaler(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXTemporalScalerDescriptor newTemporalScalerWithDevice:compiler:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTL4FXTemporalScaler newTemporalScaler(final MTLDevice device, final MTL4Compiler compiler) {
        try {
            long result = (long) MH_newTemporalScalerWithDevice_compiler_.invokeExact(this.handle, SEL_newTemporalScalerWithDevice_compiler_, device.handle(), compiler.handle());
            return result == 0L ? null : new MTL4FXTemporalScaler(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLFXTemporalScalerDescriptor supportedInputContentMinScaleForDevice:]} */
    public static float supportedInputContentMinScaleForDevice(final MTLDevice device) {
        try {
            return (float) MH_CLASS_supportedInputContentMinScaleForDevice_.invokeExact(CLS, SEL_CLASS_supportedInputContentMinScaleForDevice_, device.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLFXTemporalScalerDescriptor supportedInputContentMaxScaleForDevice:]} */
    public static float supportedInputContentMaxScaleForDevice(final MTLDevice device) {
        try {
            return (float) MH_CLASS_supportedInputContentMaxScaleForDevice_.invokeExact(CLS, SEL_CLASS_supportedInputContentMaxScaleForDevice_, device.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLFXTemporalScalerDescriptor supportsDevice:]} */
    public static boolean supportsDevice(final MTLDevice device) {
        try {
            return (boolean) MH_CLASS_supportsDevice_.invokeExact(CLS, SEL_CLASS_supportsDevice_, device.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLFXTemporalScalerDescriptor supportsMetal4FX:]} */
    public static boolean supportsMetal4FX(final MTLDevice device) {
        try {
            return (boolean) MH_CLASS_supportsMetal4FX_.invokeExact(CLS, SEL_CLASS_supportsMetal4FX_, device.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor colorTextureFormat]} */
    public MTLPixelFormat colorTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_colorTextureFormat.invokeExact(this.handle, SEL_colorTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor setColorTextureFormat:]} */
    public void setColorTextureFormat(final MTLPixelFormat colorTextureFormat) {
        try {
            MH_setColorTextureFormat_.invokeExact(this.handle, SEL_setColorTextureFormat_, colorTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor depthTextureFormat]} */
    public MTLPixelFormat depthTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_depthTextureFormat.invokeExact(this.handle, SEL_depthTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor setDepthTextureFormat:]} */
    public void setDepthTextureFormat(final MTLPixelFormat depthTextureFormat) {
        try {
            MH_setDepthTextureFormat_.invokeExact(this.handle, SEL_setDepthTextureFormat_, depthTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor motionTextureFormat]} */
    public MTLPixelFormat motionTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_motionTextureFormat.invokeExact(this.handle, SEL_motionTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor setMotionTextureFormat:]} */
    public void setMotionTextureFormat(final MTLPixelFormat motionTextureFormat) {
        try {
            MH_setMotionTextureFormat_.invokeExact(this.handle, SEL_setMotionTextureFormat_, motionTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor outputTextureFormat]} */
    public MTLPixelFormat outputTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_outputTextureFormat.invokeExact(this.handle, SEL_outputTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor setOutputTextureFormat:]} */
    public void setOutputTextureFormat(final MTLPixelFormat outputTextureFormat) {
        try {
            MH_setOutputTextureFormat_.invokeExact(this.handle, SEL_setOutputTextureFormat_, outputTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor inputWidth]} */
    public long inputWidth() {
        try {
            return (long) MH_inputWidth.invokeExact(this.handle, SEL_inputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor setInputWidth:]} */
    public void setInputWidth(final long inputWidth) {
        try {
            MH_setInputWidth_.invokeExact(this.handle, SEL_setInputWidth_, inputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor inputHeight]} */
    public long inputHeight() {
        try {
            return (long) MH_inputHeight.invokeExact(this.handle, SEL_inputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor setInputHeight:]} */
    public void setInputHeight(final long inputHeight) {
        try {
            MH_setInputHeight_.invokeExact(this.handle, SEL_setInputHeight_, inputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor outputWidth]} */
    public long outputWidth() {
        try {
            return (long) MH_outputWidth.invokeExact(this.handle, SEL_outputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor setOutputWidth:]} */
    public void setOutputWidth(final long outputWidth) {
        try {
            MH_setOutputWidth_.invokeExact(this.handle, SEL_setOutputWidth_, outputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor outputHeight]} */
    public long outputHeight() {
        try {
            return (long) MH_outputHeight.invokeExact(this.handle, SEL_outputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor setOutputHeight:]} */
    public void setOutputHeight(final long outputHeight) {
        try {
            MH_setOutputHeight_.invokeExact(this.handle, SEL_setOutputHeight_, outputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor isAutoExposureEnabled]} */
    public boolean isAutoExposureEnabled() {
        try {
            return (boolean) MH_isAutoExposureEnabled.invokeExact(this.handle, SEL_isAutoExposureEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor setAutoExposureEnabled:]} */
    public void setAutoExposureEnabled(final boolean autoExposureEnabled) {
        try {
            MH_setAutoExposureEnabled_.invokeExact(this.handle, SEL_setAutoExposureEnabled_, autoExposureEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor requiresSynchronousInitialization]} */
    public boolean requiresSynchronousInitialization() {
        try {
            return (boolean) MH_requiresSynchronousInitialization.invokeExact(this.handle, SEL_requiresSynchronousInitialization);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor setRequiresSynchronousInitialization:]} */
    public void setRequiresSynchronousInitialization(final boolean requiresSynchronousInitialization) {
        try {
            MH_setRequiresSynchronousInitialization_.invokeExact(this.handle, SEL_setRequiresSynchronousInitialization_, requiresSynchronousInitialization);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor isInputContentPropertiesEnabled]} */
    public boolean isInputContentPropertiesEnabled() {
        try {
            return (boolean) MH_isInputContentPropertiesEnabled.invokeExact(this.handle, SEL_isInputContentPropertiesEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor setInputContentPropertiesEnabled:]} */
    public void setInputContentPropertiesEnabled(final boolean inputContentPropertiesEnabled) {
        try {
            MH_setInputContentPropertiesEnabled_.invokeExact(this.handle, SEL_setInputContentPropertiesEnabled_, inputContentPropertiesEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor inputContentMinScale]} */
    public float inputContentMinScale() {
        try {
            return (float) MH_inputContentMinScale.invokeExact(this.handle, SEL_inputContentMinScale);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor setInputContentMinScale:]} */
    public void setInputContentMinScale(final float inputContentMinScale) {
        try {
            MH_setInputContentMinScale_.invokeExact(this.handle, SEL_setInputContentMinScale_, inputContentMinScale);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor inputContentMaxScale]} */
    public float inputContentMaxScale() {
        try {
            return (float) MH_inputContentMaxScale.invokeExact(this.handle, SEL_inputContentMaxScale);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor setInputContentMaxScale:]} */
    public void setInputContentMaxScale(final float inputContentMaxScale) {
        try {
            MH_setInputContentMaxScale_.invokeExact(this.handle, SEL_setInputContentMaxScale_, inputContentMaxScale);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor isOutputResolutionMotionVectorsEnabled]} */
    public boolean isOutputResolutionMotionVectorsEnabled() {
        try {
            return (boolean) MH_isOutputResolutionMotionVectorsEnabled.invokeExact(this.handle, SEL_isOutputResolutionMotionVectorsEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor setOutputResolutionMotionVectorsEnabled:]} */
    public void setOutputResolutionMotionVectorsEnabled(final boolean outputResolutionMotionVectorsEnabled) {
        try {
            MH_setOutputResolutionMotionVectorsEnabled_.invokeExact(this.handle, SEL_setOutputResolutionMotionVectorsEnabled_, outputResolutionMotionVectorsEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor isJitteredMotionVectorsEnabled]} */
    public boolean isJitteredMotionVectorsEnabled() {
        try {
            return (boolean) MH_isJitteredMotionVectorsEnabled.invokeExact(this.handle, SEL_isJitteredMotionVectorsEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor setJitteredMotionVectorsEnabled:]} */
    public void setJitteredMotionVectorsEnabled(final boolean jitteredMotionVectorsEnabled) {
        try {
            MH_setJitteredMotionVectorsEnabled_.invokeExact(this.handle, SEL_setJitteredMotionVectorsEnabled_, jitteredMotionVectorsEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor isReactiveMaskTextureEnabled]} */
    public boolean isReactiveMaskTextureEnabled() {
        try {
            return (boolean) MH_isReactiveMaskTextureEnabled.invokeExact(this.handle, SEL_isReactiveMaskTextureEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor setReactiveMaskTextureEnabled:]} */
    public void setReactiveMaskTextureEnabled(final boolean reactiveMaskTextureEnabled) {
        try {
            MH_setReactiveMaskTextureEnabled_.invokeExact(this.handle, SEL_setReactiveMaskTextureEnabled_, reactiveMaskTextureEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor reactiveMaskTextureFormat]} */
    public MTLPixelFormat reactiveMaskTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_reactiveMaskTextureFormat.invokeExact(this.handle, SEL_reactiveMaskTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXTemporalScalerDescriptor setReactiveMaskTextureFormat:]} */
    public void setReactiveMaskTextureFormat(final MTLPixelFormat reactiveMaskTextureFormat) {
        try {
            MH_setReactiveMaskTextureFormat_.invokeExact(this.handle, SEL_setReactiveMaskTextureFormat_, reactiveMaskTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
