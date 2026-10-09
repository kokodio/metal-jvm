package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLTileRenderPipelineColorAttachmentDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltilerenderpipelinecolorattachmentdescriptor">Apple documentation</a>
 */
public class MTLTileRenderPipelineColorAttachmentDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLTileRenderPipelineColorAttachmentDescriptor");
    private static final long SEL_pixelFormat = ObjC.selector("pixelFormat");
    private static final MethodHandle MH_pixelFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPixelFormat_ = ObjC.selector("setPixelFormat:");
    private static final MethodHandle MH_setPixelFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLTileRenderPipelineColorAttachmentDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLTileRenderPipelineColorAttachmentDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLTileRenderPipelineColorAttachmentDescriptor alloc() {
        try {
            return new MTLTileRenderPipelineColorAttachmentDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineColorAttachmentDescriptor init]} */
    public MTLTileRenderPipelineColorAttachmentDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineColorAttachmentDescriptor pixelFormat]} */
    public MTLPixelFormat pixelFormat() {
        try {
            return MTLPixelFormat.of((long) MH_pixelFormat.invokeExact(this.handle, SEL_pixelFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTileRenderPipelineColorAttachmentDescriptor setPixelFormat:]} */
    public void setPixelFormat(final MTLPixelFormat pixelFormat) {
        try {
            MH_setPixelFormat_.invokeExact(this.handle, SEL_setPixelFormat_, pixelFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
