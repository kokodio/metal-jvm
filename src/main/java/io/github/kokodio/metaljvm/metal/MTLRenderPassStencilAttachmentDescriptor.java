package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLRenderPassStencilAttachmentDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlrenderpassstencilattachmentdescriptor">Apple documentation</a>
 */
public class MTLRenderPassStencilAttachmentDescriptor extends MTLRenderPassAttachmentDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLRenderPassStencilAttachmentDescriptor");
    private static final long SEL_clearStencil = ObjC.selector("clearStencil");
    private static final MethodHandle MH_clearStencil = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setClearStencil_ = ObjC.selector("setClearStencil:");
    private static final MethodHandle MH_setClearStencil_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_INT));
    private static final long SEL_stencilResolveFilter = ObjC.selector("stencilResolveFilter");
    private static final MethodHandle MH_stencilResolveFilter = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStencilResolveFilter_ = ObjC.selector("setStencilResolveFilter:");
    private static final MethodHandle MH_setStencilResolveFilter_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLRenderPassStencilAttachmentDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLRenderPassStencilAttachmentDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLRenderPassStencilAttachmentDescriptor alloc() {
        try {
            return new MTLRenderPassStencilAttachmentDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassStencilAttachmentDescriptor init]} */
    public MTLRenderPassStencilAttachmentDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassStencilAttachmentDescriptor clearStencil]} */
    public int clearStencil() {
        try {
            return (int) MH_clearStencil.invokeExact(this.handle, SEL_clearStencil);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassStencilAttachmentDescriptor setClearStencil:]} */
    public void setClearStencil(final int clearStencil) {
        try {
            MH_setClearStencil_.invokeExact(this.handle, SEL_setClearStencil_, clearStencil);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassStencilAttachmentDescriptor stencilResolveFilter]} */
    public MTLMultisampleStencilResolveFilter stencilResolveFilter() {
        try {
            return MTLMultisampleStencilResolveFilter.of((long) MH_stencilResolveFilter.invokeExact(this.handle, SEL_stencilResolveFilter));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassStencilAttachmentDescriptor setStencilResolveFilter:]} */
    public void setStencilResolveFilter(final MTLMultisampleStencilResolveFilter stencilResolveFilter) {
        try {
            MH_setStencilResolveFilter_.invokeExact(this.handle, SEL_setStencilResolveFilter_, stencilResolveFilter.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
