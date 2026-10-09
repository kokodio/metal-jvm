package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLRenderPassAttachmentDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlrenderpassattachmentdescriptor">Apple documentation</a>
 */
public class MTLRenderPassAttachmentDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLRenderPassAttachmentDescriptor");
    private static final long SEL_texture = ObjC.selector("texture");
    private static final MethodHandle MH_texture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTexture_ = ObjC.selector("setTexture:");
    private static final MethodHandle MH_setTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_level = ObjC.selector("level");
    private static final MethodHandle MH_level = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLevel_ = ObjC.selector("setLevel:");
    private static final MethodHandle MH_setLevel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_slice = ObjC.selector("slice");
    private static final MethodHandle MH_slice = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSlice_ = ObjC.selector("setSlice:");
    private static final MethodHandle MH_setSlice_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_depthPlane = ObjC.selector("depthPlane");
    private static final MethodHandle MH_depthPlane = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthPlane_ = ObjC.selector("setDepthPlane:");
    private static final MethodHandle MH_setDepthPlane_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resolveTexture = ObjC.selector("resolveTexture");
    private static final MethodHandle MH_resolveTexture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setResolveTexture_ = ObjC.selector("setResolveTexture:");
    private static final MethodHandle MH_setResolveTexture_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resolveLevel = ObjC.selector("resolveLevel");
    private static final MethodHandle MH_resolveLevel = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setResolveLevel_ = ObjC.selector("setResolveLevel:");
    private static final MethodHandle MH_setResolveLevel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resolveSlice = ObjC.selector("resolveSlice");
    private static final MethodHandle MH_resolveSlice = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setResolveSlice_ = ObjC.selector("setResolveSlice:");
    private static final MethodHandle MH_setResolveSlice_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resolveDepthPlane = ObjC.selector("resolveDepthPlane");
    private static final MethodHandle MH_resolveDepthPlane = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setResolveDepthPlane_ = ObjC.selector("setResolveDepthPlane:");
    private static final MethodHandle MH_setResolveDepthPlane_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_loadAction = ObjC.selector("loadAction");
    private static final MethodHandle MH_loadAction = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLoadAction_ = ObjC.selector("setLoadAction:");
    private static final MethodHandle MH_setLoadAction_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_storeAction = ObjC.selector("storeAction");
    private static final MethodHandle MH_storeAction = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStoreAction_ = ObjC.selector("setStoreAction:");
    private static final MethodHandle MH_setStoreAction_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_storeActionOptions = ObjC.selector("storeActionOptions");
    private static final MethodHandle MH_storeActionOptions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStoreActionOptions_ = ObjC.selector("setStoreActionOptions:");
    private static final MethodHandle MH_setStoreActionOptions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLRenderPassAttachmentDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLRenderPassAttachmentDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLRenderPassAttachmentDescriptor alloc() {
        try {
            return new MTLRenderPassAttachmentDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassAttachmentDescriptor init]} */
    public MTLRenderPassAttachmentDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPassAttachmentDescriptor texture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTexture texture() {
        try {
            long result = (long) MH_texture.invokeExact(this.handle, SEL_texture);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassAttachmentDescriptor setTexture:]} */
    public void setTexture(@Nullable final MTLTexture texture) {
        try {
            MH_setTexture_.invokeExact(this.handle, SEL_setTexture_, texture == null ? 0L : texture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassAttachmentDescriptor level]} */
    public long level() {
        try {
            return (long) MH_level.invokeExact(this.handle, SEL_level);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassAttachmentDescriptor setLevel:]} */
    public void setLevel(final long level) {
        try {
            MH_setLevel_.invokeExact(this.handle, SEL_setLevel_, level);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassAttachmentDescriptor slice]} */
    public long slice() {
        try {
            return (long) MH_slice.invokeExact(this.handle, SEL_slice);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassAttachmentDescriptor setSlice:]} */
    public void setSlice(final long slice) {
        try {
            MH_setSlice_.invokeExact(this.handle, SEL_setSlice_, slice);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassAttachmentDescriptor depthPlane]} */
    public long depthPlane() {
        try {
            return (long) MH_depthPlane.invokeExact(this.handle, SEL_depthPlane);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassAttachmentDescriptor setDepthPlane:]} */
    public void setDepthPlane(final long depthPlane) {
        try {
            MH_setDepthPlane_.invokeExact(this.handle, SEL_setDepthPlane_, depthPlane);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPassAttachmentDescriptor resolveTexture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTexture resolveTexture() {
        try {
            long result = (long) MH_resolveTexture.invokeExact(this.handle, SEL_resolveTexture);
            return result == 0L ? null : new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassAttachmentDescriptor setResolveTexture:]} */
    public void setResolveTexture(@Nullable final MTLTexture resolveTexture) {
        try {
            MH_setResolveTexture_.invokeExact(this.handle, SEL_setResolveTexture_, resolveTexture == null ? 0L : resolveTexture.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassAttachmentDescriptor resolveLevel]} */
    public long resolveLevel() {
        try {
            return (long) MH_resolveLevel.invokeExact(this.handle, SEL_resolveLevel);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassAttachmentDescriptor setResolveLevel:]} */
    public void setResolveLevel(final long resolveLevel) {
        try {
            MH_setResolveLevel_.invokeExact(this.handle, SEL_setResolveLevel_, resolveLevel);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassAttachmentDescriptor resolveSlice]} */
    public long resolveSlice() {
        try {
            return (long) MH_resolveSlice.invokeExact(this.handle, SEL_resolveSlice);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassAttachmentDescriptor setResolveSlice:]} */
    public void setResolveSlice(final long resolveSlice) {
        try {
            MH_setResolveSlice_.invokeExact(this.handle, SEL_setResolveSlice_, resolveSlice);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassAttachmentDescriptor resolveDepthPlane]} */
    public long resolveDepthPlane() {
        try {
            return (long) MH_resolveDepthPlane.invokeExact(this.handle, SEL_resolveDepthPlane);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassAttachmentDescriptor setResolveDepthPlane:]} */
    public void setResolveDepthPlane(final long resolveDepthPlane) {
        try {
            MH_setResolveDepthPlane_.invokeExact(this.handle, SEL_setResolveDepthPlane_, resolveDepthPlane);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassAttachmentDescriptor loadAction]} */
    public MTLLoadAction loadAction() {
        try {
            return MTLLoadAction.of((long) MH_loadAction.invokeExact(this.handle, SEL_loadAction));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassAttachmentDescriptor setLoadAction:]} */
    public void setLoadAction(final MTLLoadAction loadAction) {
        try {
            MH_setLoadAction_.invokeExact(this.handle, SEL_setLoadAction_, loadAction.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassAttachmentDescriptor storeAction]} */
    public MTLStoreAction storeAction() {
        try {
            return MTLStoreAction.of((long) MH_storeAction.invokeExact(this.handle, SEL_storeAction));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassAttachmentDescriptor setStoreAction:]} */
    public void setStoreAction(final MTLStoreAction storeAction) {
        try {
            MH_setStoreAction_.invokeExact(this.handle, SEL_setStoreAction_, storeAction.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPassAttachmentDescriptor storeActionOptions]}
     *
     * @return a combination of {@link MTLStoreActionOptions} flags
     */
    public long storeActionOptions() {
        try {
            return (long) MH_storeActionOptions.invokeExact(this.handle, SEL_storeActionOptions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPassAttachmentDescriptor setStoreActionOptions:]}
     *
     * @param storeActionOptions a combination of {@link MTLStoreActionOptions} flags
     */
    public void setStoreActionOptions(final long storeActionOptions) {
        try {
            MH_setStoreActionOptions_.invokeExact(this.handle, SEL_setStoreActionOptions_, storeActionOptions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
