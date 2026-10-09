package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4RenderPipelineColorAttachmentDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4renderpipelinecolorattachmentdescriptor">Apple documentation</a>
 */
public class MTL4RenderPipelineColorAttachmentDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4RenderPipelineColorAttachmentDescriptor");
    private static final long SEL_reset = ObjC.selector("reset");
    private static final MethodHandle MH_reset = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_pixelFormat = ObjC.selector("pixelFormat");
    private static final MethodHandle MH_pixelFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPixelFormat_ = ObjC.selector("setPixelFormat:");
    private static final MethodHandle MH_setPixelFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_blendingState = ObjC.selector("blendingState");
    private static final MethodHandle MH_blendingState = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBlendingState_ = ObjC.selector("setBlendingState:");
    private static final MethodHandle MH_setBlendingState_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sourceRGBBlendFactor = ObjC.selector("sourceRGBBlendFactor");
    private static final MethodHandle MH_sourceRGBBlendFactor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSourceRGBBlendFactor_ = ObjC.selector("setSourceRGBBlendFactor:");
    private static final MethodHandle MH_setSourceRGBBlendFactor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_destinationRGBBlendFactor = ObjC.selector("destinationRGBBlendFactor");
    private static final MethodHandle MH_destinationRGBBlendFactor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDestinationRGBBlendFactor_ = ObjC.selector("setDestinationRGBBlendFactor:");
    private static final MethodHandle MH_setDestinationRGBBlendFactor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rgbBlendOperation = ObjC.selector("rgbBlendOperation");
    private static final MethodHandle MH_rgbBlendOperation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRgbBlendOperation_ = ObjC.selector("setRgbBlendOperation:");
    private static final MethodHandle MH_setRgbBlendOperation_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sourceAlphaBlendFactor = ObjC.selector("sourceAlphaBlendFactor");
    private static final MethodHandle MH_sourceAlphaBlendFactor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSourceAlphaBlendFactor_ = ObjC.selector("setSourceAlphaBlendFactor:");
    private static final MethodHandle MH_setSourceAlphaBlendFactor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_destinationAlphaBlendFactor = ObjC.selector("destinationAlphaBlendFactor");
    private static final MethodHandle MH_destinationAlphaBlendFactor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDestinationAlphaBlendFactor_ = ObjC.selector("setDestinationAlphaBlendFactor:");
    private static final MethodHandle MH_setDestinationAlphaBlendFactor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alphaBlendOperation = ObjC.selector("alphaBlendOperation");
    private static final MethodHandle MH_alphaBlendOperation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAlphaBlendOperation_ = ObjC.selector("setAlphaBlendOperation:");
    private static final MethodHandle MH_setAlphaBlendOperation_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_writeMask = ObjC.selector("writeMask");
    private static final MethodHandle MH_writeMask = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setWriteMask_ = ObjC.selector("setWriteMask:");
    private static final MethodHandle MH_setWriteMask_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4RenderPipelineColorAttachmentDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4RenderPipelineColorAttachmentDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4RenderPipelineColorAttachmentDescriptor alloc() {
        try {
            return new MTL4RenderPipelineColorAttachmentDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineColorAttachmentDescriptor init]} */
    public MTL4RenderPipelineColorAttachmentDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineColorAttachmentDescriptor reset]} */
    public void reset() {
        try {
            MH_reset.invokeExact(this.handle, SEL_reset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineColorAttachmentDescriptor pixelFormat]} */
    public MTLPixelFormat pixelFormat() {
        try {
            return MTLPixelFormat.of((long) MH_pixelFormat.invokeExact(this.handle, SEL_pixelFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineColorAttachmentDescriptor setPixelFormat:]} */
    public void setPixelFormat(final MTLPixelFormat pixelFormat) {
        try {
            MH_setPixelFormat_.invokeExact(this.handle, SEL_setPixelFormat_, pixelFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineColorAttachmentDescriptor blendingState]} */
    public MTL4BlendState blendingState() {
        try {
            return MTL4BlendState.of((long) MH_blendingState.invokeExact(this.handle, SEL_blendingState));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineColorAttachmentDescriptor setBlendingState:]} */
    public void setBlendingState(final MTL4BlendState blendingState) {
        try {
            MH_setBlendingState_.invokeExact(this.handle, SEL_setBlendingState_, blendingState.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineColorAttachmentDescriptor sourceRGBBlendFactor]} */
    public MTLBlendFactor sourceRGBBlendFactor() {
        try {
            return MTLBlendFactor.of((long) MH_sourceRGBBlendFactor.invokeExact(this.handle, SEL_sourceRGBBlendFactor));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineColorAttachmentDescriptor setSourceRGBBlendFactor:]} */
    public void setSourceRGBBlendFactor(final MTLBlendFactor sourceRGBBlendFactor) {
        try {
            MH_setSourceRGBBlendFactor_.invokeExact(this.handle, SEL_setSourceRGBBlendFactor_, sourceRGBBlendFactor.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineColorAttachmentDescriptor destinationRGBBlendFactor]} */
    public MTLBlendFactor destinationRGBBlendFactor() {
        try {
            return MTLBlendFactor.of((long) MH_destinationRGBBlendFactor.invokeExact(this.handle, SEL_destinationRGBBlendFactor));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineColorAttachmentDescriptor setDestinationRGBBlendFactor:]} */
    public void setDestinationRGBBlendFactor(final MTLBlendFactor destinationRGBBlendFactor) {
        try {
            MH_setDestinationRGBBlendFactor_.invokeExact(this.handle, SEL_setDestinationRGBBlendFactor_, destinationRGBBlendFactor.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineColorAttachmentDescriptor rgbBlendOperation]} */
    public MTLBlendOperation rgbBlendOperation() {
        try {
            return MTLBlendOperation.of((long) MH_rgbBlendOperation.invokeExact(this.handle, SEL_rgbBlendOperation));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineColorAttachmentDescriptor setRgbBlendOperation:]} */
    public void setRgbBlendOperation(final MTLBlendOperation rgbBlendOperation) {
        try {
            MH_setRgbBlendOperation_.invokeExact(this.handle, SEL_setRgbBlendOperation_, rgbBlendOperation.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineColorAttachmentDescriptor sourceAlphaBlendFactor]} */
    public MTLBlendFactor sourceAlphaBlendFactor() {
        try {
            return MTLBlendFactor.of((long) MH_sourceAlphaBlendFactor.invokeExact(this.handle, SEL_sourceAlphaBlendFactor));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineColorAttachmentDescriptor setSourceAlphaBlendFactor:]} */
    public void setSourceAlphaBlendFactor(final MTLBlendFactor sourceAlphaBlendFactor) {
        try {
            MH_setSourceAlphaBlendFactor_.invokeExact(this.handle, SEL_setSourceAlphaBlendFactor_, sourceAlphaBlendFactor.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineColorAttachmentDescriptor destinationAlphaBlendFactor]} */
    public MTLBlendFactor destinationAlphaBlendFactor() {
        try {
            return MTLBlendFactor.of((long) MH_destinationAlphaBlendFactor.invokeExact(this.handle, SEL_destinationAlphaBlendFactor));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineColorAttachmentDescriptor setDestinationAlphaBlendFactor:]} */
    public void setDestinationAlphaBlendFactor(final MTLBlendFactor destinationAlphaBlendFactor) {
        try {
            MH_setDestinationAlphaBlendFactor_.invokeExact(this.handle, SEL_setDestinationAlphaBlendFactor_, destinationAlphaBlendFactor.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineColorAttachmentDescriptor alphaBlendOperation]} */
    public MTLBlendOperation alphaBlendOperation() {
        try {
            return MTLBlendOperation.of((long) MH_alphaBlendOperation.invokeExact(this.handle, SEL_alphaBlendOperation));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineColorAttachmentDescriptor setAlphaBlendOperation:]} */
    public void setAlphaBlendOperation(final MTLBlendOperation alphaBlendOperation) {
        try {
            MH_setAlphaBlendOperation_.invokeExact(this.handle, SEL_setAlphaBlendOperation_, alphaBlendOperation.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4RenderPipelineColorAttachmentDescriptor writeMask]}
     *
     * @return a combination of {@link MTLColorWriteMask} flags
     */
    public long writeMask() {
        try {
            return (long) MH_writeMask.invokeExact(this.handle, SEL_writeMask);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4RenderPipelineColorAttachmentDescriptor setWriteMask:]}
     *
     * @param writeMask a combination of {@link MTLColorWriteMask} flags
     */
    public void setWriteMask(final long writeMask) {
        try {
            MH_setWriteMask_.invokeExact(this.handle, SEL_setWriteMask_, writeMask);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
