package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLRenderPassDepthAttachmentDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlrenderpassdepthattachmentdescriptor">Apple documentation</a>
 */
public class MTLRenderPassDepthAttachmentDescriptor extends MTLRenderPassAttachmentDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLRenderPassDepthAttachmentDescriptor");
    private static final long SEL_clearDepth = ObjC.selector("clearDepth");
    private static final MethodHandle MH_clearDepth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setClearDepth_ = ObjC.selector("setClearDepth:");
    private static final MethodHandle MH_setClearDepth_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_depthResolveFilter = ObjC.selector("depthResolveFilter");
    private static final MethodHandle MH_depthResolveFilter = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthResolveFilter_ = ObjC.selector("setDepthResolveFilter:");
    private static final MethodHandle MH_setDepthResolveFilter_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLRenderPassDepthAttachmentDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLRenderPassDepthAttachmentDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLRenderPassDepthAttachmentDescriptor alloc() {
        try {
            return new MTLRenderPassDepthAttachmentDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDepthAttachmentDescriptor init]} */
    public MTLRenderPassDepthAttachmentDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDepthAttachmentDescriptor clearDepth]} */
    public double clearDepth() {
        try {
            return (double) MH_clearDepth.invokeExact(this.handle, SEL_clearDepth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDepthAttachmentDescriptor setClearDepth:]} */
    public void setClearDepth(final double clearDepth) {
        try {
            MH_setClearDepth_.invokeExact(this.handle, SEL_setClearDepth_, clearDepth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDepthAttachmentDescriptor depthResolveFilter]} */
    public MTLMultisampleDepthResolveFilter depthResolveFilter() {
        try {
            return MTLMultisampleDepthResolveFilter.of((long) MH_depthResolveFilter.invokeExact(this.handle, SEL_depthResolveFilter));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassDepthAttachmentDescriptor setDepthResolveFilter:]} */
    public void setDepthResolveFilter(final MTLMultisampleDepthResolveFilter depthResolveFilter) {
        try {
            MH_setDepthResolveFilter_.invokeExact(this.handle, SEL_setDepthResolveFilter_, depthResolveFilter.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
