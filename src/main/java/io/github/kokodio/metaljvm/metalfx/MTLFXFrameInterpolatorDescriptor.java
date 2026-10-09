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
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLFXFrameInterpolatorDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metalfx/mtlfxframeinterpolatordescriptor">Apple documentation</a>
 */
public class MTLFXFrameInterpolatorDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("MetalFX");
    private static final long CLS = ObjC.clazz("MTLFXFrameInterpolatorDescriptor");
    private static final long SEL_newFrameInterpolatorWithDevice_ = ObjC.selector("newFrameInterpolatorWithDevice:");
    private static final MethodHandle MH_newFrameInterpolatorWithDevice_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newFrameInterpolatorWithDevice_compiler_ = ObjC.selector("newFrameInterpolatorWithDevice:compiler:");
    private static final MethodHandle MH_newFrameInterpolatorWithDevice_compiler_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_supportsMetal4FX_ = ObjC.selector("supportsMetal4FX:");
    private static final MethodHandle MH_CLASS_supportsMetal4FX_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_supportsDevice_ = ObjC.selector("supportsDevice:");
    private static final MethodHandle MH_CLASS_supportsDevice_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_colorTextureFormat = ObjC.selector("colorTextureFormat");
    private static final MethodHandle MH_colorTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setColorTextureFormat_ = ObjC.selector("setColorTextureFormat:");
    private static final MethodHandle MH_setColorTextureFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_outputTextureFormat = ObjC.selector("outputTextureFormat");
    private static final MethodHandle MH_outputTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOutputTextureFormat_ = ObjC.selector("setOutputTextureFormat:");
    private static final MethodHandle MH_setOutputTextureFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_depthTextureFormat = ObjC.selector("depthTextureFormat");
    private static final MethodHandle MH_depthTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthTextureFormat_ = ObjC.selector("setDepthTextureFormat:");
    private static final MethodHandle MH_setDepthTextureFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_motionTextureFormat = ObjC.selector("motionTextureFormat");
    private static final MethodHandle MH_motionTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMotionTextureFormat_ = ObjC.selector("setMotionTextureFormat:");
    private static final MethodHandle MH_setMotionTextureFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_uiTextureFormat = ObjC.selector("uiTextureFormat");
    private static final MethodHandle MH_uiTextureFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setUITextureFormat_ = ObjC.selector("setUITextureFormat:");
    private static final MethodHandle MH_setUITextureFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_scaler = ObjC.selector("scaler");
    private static final MethodHandle MH_scaler = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setScaler_ = ObjC.selector("setScaler:");
    private static final MethodHandle MH_setScaler_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final long SEL_isDistortionTextureEnabled = ObjC.selector("isDistortionTextureEnabled");
    private static final MethodHandle MH_isDistortionTextureEnabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDistortionTextureEnabled_ = ObjC.selector("setDistortionTextureEnabled:");
    private static final MethodHandle MH_setDistortionTextureEnabled_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_requiresPrevColorTexture = ObjC.selector("requiresPrevColorTexture");
    private static final MethodHandle MH_requiresPrevColorTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRequiresPrevColorTexture_ = ObjC.selector("setRequiresPrevColorTexture:");
    private static final MethodHandle MH_setRequiresPrevColorTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLFXFrameInterpolatorDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLFXFrameInterpolatorDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLFXFrameInterpolatorDescriptor alloc() {
        try {
            return new MTLFXFrameInterpolatorDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor init]} */
    public MTLFXFrameInterpolatorDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXFrameInterpolatorDescriptor newFrameInterpolatorWithDevice:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLFXFrameInterpolator newFrameInterpolator(final MTLDevice device) {
        try {
            long result = (long) MH_newFrameInterpolatorWithDevice_.invokeExact(this.handle, SEL_newFrameInterpolatorWithDevice_, device.handle());
            return result == 0L ? null : new MTLFXFrameInterpolator(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXFrameInterpolatorDescriptor newFrameInterpolatorWithDevice:compiler:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTL4FXFrameInterpolator newFrameInterpolator(final MTLDevice device, final MTL4Compiler compiler) {
        try {
            long result = (long) MH_newFrameInterpolatorWithDevice_compiler_.invokeExact(this.handle, SEL_newFrameInterpolatorWithDevice_compiler_, device.handle(), compiler.handle());
            return result == 0L ? null : new MTL4FXFrameInterpolator(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLFXFrameInterpolatorDescriptor supportsMetal4FX:]} */
    public static boolean supportsMetal4FX(final MTLDevice device) {
        try {
            return (boolean) MH_CLASS_supportsMetal4FX_.invokeExact(CLS, SEL_CLASS_supportsMetal4FX_, device.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLFXFrameInterpolatorDescriptor supportsDevice:]} */
    public static boolean supportsDevice(final MTLDevice device) {
        try {
            return (boolean) MH_CLASS_supportsDevice_.invokeExact(CLS, SEL_CLASS_supportsDevice_, device.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor colorTextureFormat]} */
    public MTLPixelFormat colorTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_colorTextureFormat.invokeExact(this.handle, SEL_colorTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor setColorTextureFormat:]} */
    public void setColorTextureFormat(final MTLPixelFormat colorTextureFormat) {
        try {
            MH_setColorTextureFormat_.invokeExact(this.handle, SEL_setColorTextureFormat_, colorTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor outputTextureFormat]} */
    public MTLPixelFormat outputTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_outputTextureFormat.invokeExact(this.handle, SEL_outputTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor setOutputTextureFormat:]} */
    public void setOutputTextureFormat(final MTLPixelFormat outputTextureFormat) {
        try {
            MH_setOutputTextureFormat_.invokeExact(this.handle, SEL_setOutputTextureFormat_, outputTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor depthTextureFormat]} */
    public MTLPixelFormat depthTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_depthTextureFormat.invokeExact(this.handle, SEL_depthTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor setDepthTextureFormat:]} */
    public void setDepthTextureFormat(final MTLPixelFormat depthTextureFormat) {
        try {
            MH_setDepthTextureFormat_.invokeExact(this.handle, SEL_setDepthTextureFormat_, depthTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor motionTextureFormat]} */
    public MTLPixelFormat motionTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_motionTextureFormat.invokeExact(this.handle, SEL_motionTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor setMotionTextureFormat:]} */
    public void setMotionTextureFormat(final MTLPixelFormat motionTextureFormat) {
        try {
            MH_setMotionTextureFormat_.invokeExact(this.handle, SEL_setMotionTextureFormat_, motionTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor uiTextureFormat]} */
    public MTLPixelFormat uiTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_uiTextureFormat.invokeExact(this.handle, SEL_uiTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor setUITextureFormat:]} */
    public void setUITextureFormat(final MTLPixelFormat uiTextureFormat) {
        try {
            MH_setUITextureFormat_.invokeExact(this.handle, SEL_setUITextureFormat_, uiTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXFrameInterpolatorDescriptor scaler]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLFXFrameInterpolatableScaler scaler() {
        try {
            long result = (long) MH_scaler.invokeExact(this.handle, SEL_scaler);
            return result == 0L ? null : new MTLFXFrameInterpolatableScaler(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor setScaler:]} */
    public void setScaler(@Nullable final MTLFXFrameInterpolatableScaler scaler) {
        try {
            MH_setScaler_.invokeExact(this.handle, SEL_setScaler_, scaler == null ? 0L : scaler.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor inputWidth]} */
    public long inputWidth() {
        try {
            return (long) MH_inputWidth.invokeExact(this.handle, SEL_inputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor setInputWidth:]} */
    public void setInputWidth(final long inputWidth) {
        try {
            MH_setInputWidth_.invokeExact(this.handle, SEL_setInputWidth_, inputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor inputHeight]} */
    public long inputHeight() {
        try {
            return (long) MH_inputHeight.invokeExact(this.handle, SEL_inputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor setInputHeight:]} */
    public void setInputHeight(final long inputHeight) {
        try {
            MH_setInputHeight_.invokeExact(this.handle, SEL_setInputHeight_, inputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor outputWidth]} */
    public long outputWidth() {
        try {
            return (long) MH_outputWidth.invokeExact(this.handle, SEL_outputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor setOutputWidth:]} */
    public void setOutputWidth(final long outputWidth) {
        try {
            MH_setOutputWidth_.invokeExact(this.handle, SEL_setOutputWidth_, outputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor outputHeight]} */
    public long outputHeight() {
        try {
            return (long) MH_outputHeight.invokeExact(this.handle, SEL_outputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor setOutputHeight:]} */
    public void setOutputHeight(final long outputHeight) {
        try {
            MH_setOutputHeight_.invokeExact(this.handle, SEL_setOutputHeight_, outputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor isDistortionTextureEnabled]} */
    public boolean isDistortionTextureEnabled() {
        try {
            return (boolean) MH_isDistortionTextureEnabled.invokeExact(this.handle, SEL_isDistortionTextureEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor setDistortionTextureEnabled:]} */
    public void setDistortionTextureEnabled(final boolean distortionTextureEnabled) {
        try {
            MH_setDistortionTextureEnabled_.invokeExact(this.handle, SEL_setDistortionTextureEnabled_, distortionTextureEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor requiresPrevColorTexture]} */
    public boolean requiresPrevColorTexture() {
        try {
            return (boolean) MH_requiresPrevColorTexture.invokeExact(this.handle, SEL_requiresPrevColorTexture);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXFrameInterpolatorDescriptor setRequiresPrevColorTexture:]} */
    public void setRequiresPrevColorTexture(final boolean requiresPrevColorTexture) {
        try {
            MH_setRequiresPrevColorTexture_.invokeExact(this.handle, SEL_setRequiresPrevColorTexture_, requiresPrevColorTexture);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
