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
 * {@code MTLFXSpatialScalerDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metalfx/mtlfxspatialscalerdescriptor">Apple documentation</a>
 */
public class MTLFXSpatialScalerDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("MetalFX");
    private static final long CLS = ObjC.clazz("MTLFXSpatialScalerDescriptor");
    private static final long SEL_newSpatialScalerWithDevice_ = ObjC.selector("newSpatialScalerWithDevice:");
    private static final MethodHandle MH_newSpatialScalerWithDevice_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newSpatialScalerWithDevice_compiler_ = ObjC.selector("newSpatialScalerWithDevice:compiler:");
    private static final MethodHandle MH_newSpatialScalerWithDevice_compiler_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
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
    private static final long SEL_colorProcessingMode = ObjC.selector("colorProcessingMode");
    private static final MethodHandle MH_colorProcessingMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setColorProcessingMode_ = ObjC.selector("setColorProcessingMode:");
    private static final MethodHandle MH_setColorProcessingMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLFXSpatialScalerDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLFXSpatialScalerDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLFXSpatialScalerDescriptor alloc() {
        try {
            return new MTLFXSpatialScalerDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerDescriptor init]} */
    public MTLFXSpatialScalerDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXSpatialScalerDescriptor newSpatialScalerWithDevice:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLFXSpatialScaler newSpatialScaler(final MTLDevice device) {
        try {
            long result = (long) MH_newSpatialScalerWithDevice_.invokeExact(this.handle, SEL_newSpatialScalerWithDevice_, device.handle());
            return result == 0L ? null : new MTLFXSpatialScaler(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFXSpatialScalerDescriptor newSpatialScalerWithDevice:compiler:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTL4FXSpatialScaler newSpatialScaler(final MTLDevice device, final MTL4Compiler compiler) {
        try {
            long result = (long) MH_newSpatialScalerWithDevice_compiler_.invokeExact(this.handle, SEL_newSpatialScalerWithDevice_compiler_, device.handle(), compiler.handle());
            return result == 0L ? null : new MTL4FXSpatialScaler(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLFXSpatialScalerDescriptor supportsMetal4FX:]} */
    public static boolean supportsMetal4FX(final MTLDevice device) {
        try {
            return (boolean) MH_CLASS_supportsMetal4FX_.invokeExact(CLS, SEL_CLASS_supportsMetal4FX_, device.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[MTLFXSpatialScalerDescriptor supportsDevice:]} */
    public static boolean supportsDevice(final MTLDevice device) {
        try {
            return (boolean) MH_CLASS_supportsDevice_.invokeExact(CLS, SEL_CLASS_supportsDevice_, device.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerDescriptor colorTextureFormat]} */
    public MTLPixelFormat colorTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_colorTextureFormat.invokeExact(this.handle, SEL_colorTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerDescriptor setColorTextureFormat:]} */
    public void setColorTextureFormat(final MTLPixelFormat colorTextureFormat) {
        try {
            MH_setColorTextureFormat_.invokeExact(this.handle, SEL_setColorTextureFormat_, colorTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerDescriptor outputTextureFormat]} */
    public MTLPixelFormat outputTextureFormat() {
        try {
            return MTLPixelFormat.of((long) MH_outputTextureFormat.invokeExact(this.handle, SEL_outputTextureFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerDescriptor setOutputTextureFormat:]} */
    public void setOutputTextureFormat(final MTLPixelFormat outputTextureFormat) {
        try {
            MH_setOutputTextureFormat_.invokeExact(this.handle, SEL_setOutputTextureFormat_, outputTextureFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerDescriptor inputWidth]} */
    public long inputWidth() {
        try {
            return (long) MH_inputWidth.invokeExact(this.handle, SEL_inputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerDescriptor setInputWidth:]} */
    public void setInputWidth(final long inputWidth) {
        try {
            MH_setInputWidth_.invokeExact(this.handle, SEL_setInputWidth_, inputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerDescriptor inputHeight]} */
    public long inputHeight() {
        try {
            return (long) MH_inputHeight.invokeExact(this.handle, SEL_inputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerDescriptor setInputHeight:]} */
    public void setInputHeight(final long inputHeight) {
        try {
            MH_setInputHeight_.invokeExact(this.handle, SEL_setInputHeight_, inputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerDescriptor outputWidth]} */
    public long outputWidth() {
        try {
            return (long) MH_outputWidth.invokeExact(this.handle, SEL_outputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerDescriptor setOutputWidth:]} */
    public void setOutputWidth(final long outputWidth) {
        try {
            MH_setOutputWidth_.invokeExact(this.handle, SEL_setOutputWidth_, outputWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerDescriptor outputHeight]} */
    public long outputHeight() {
        try {
            return (long) MH_outputHeight.invokeExact(this.handle, SEL_outputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerDescriptor setOutputHeight:]} */
    public void setOutputHeight(final long outputHeight) {
        try {
            MH_setOutputHeight_.invokeExact(this.handle, SEL_setOutputHeight_, outputHeight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerDescriptor colorProcessingMode]} */
    public MTLFXSpatialScalerColorProcessingMode colorProcessingMode() {
        try {
            return MTLFXSpatialScalerColorProcessingMode.of((long) MH_colorProcessingMode.invokeExact(this.handle, SEL_colorProcessingMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFXSpatialScalerDescriptor setColorProcessingMode:]} */
    public void setColorProcessingMode(final MTLFXSpatialScalerColorProcessingMode colorProcessingMode) {
        try {
            MH_setColorProcessingMode_.invokeExact(this.handle, SEL_setColorProcessingMode_, colorProcessingMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
