package io.github.kokodio.metaljvm.metal;

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
 * {@code MTLSamplerDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlsamplerdescriptor">Apple documentation</a>
 */
public class MTLSamplerDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLSamplerDescriptor");
    private static final long SEL_minFilter = ObjC.selector("minFilter");
    private static final MethodHandle MH_minFilter = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMinFilter_ = ObjC.selector("setMinFilter:");
    private static final MethodHandle MH_setMinFilter_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_magFilter = ObjC.selector("magFilter");
    private static final MethodHandle MH_magFilter = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMagFilter_ = ObjC.selector("setMagFilter:");
    private static final MethodHandle MH_setMagFilter_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_mipFilter = ObjC.selector("mipFilter");
    private static final MethodHandle MH_mipFilter = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMipFilter_ = ObjC.selector("setMipFilter:");
    private static final MethodHandle MH_setMipFilter_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxAnisotropy = ObjC.selector("maxAnisotropy");
    private static final MethodHandle MH_maxAnisotropy = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxAnisotropy_ = ObjC.selector("setMaxAnisotropy:");
    private static final MethodHandle MH_setMaxAnisotropy_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sAddressMode = ObjC.selector("sAddressMode");
    private static final MethodHandle MH_sAddressMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSAddressMode_ = ObjC.selector("setSAddressMode:");
    private static final MethodHandle MH_setSAddressMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tAddressMode = ObjC.selector("tAddressMode");
    private static final MethodHandle MH_tAddressMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTAddressMode_ = ObjC.selector("setTAddressMode:");
    private static final MethodHandle MH_setTAddressMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rAddressMode = ObjC.selector("rAddressMode");
    private static final MethodHandle MH_rAddressMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRAddressMode_ = ObjC.selector("setRAddressMode:");
    private static final MethodHandle MH_setRAddressMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_borderColor = ObjC.selector("borderColor");
    private static final MethodHandle MH_borderColor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBorderColor_ = ObjC.selector("setBorderColor:");
    private static final MethodHandle MH_setBorderColor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_reductionMode = ObjC.selector("reductionMode");
    private static final MethodHandle MH_reductionMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setReductionMode_ = ObjC.selector("setReductionMode:");
    private static final MethodHandle MH_setReductionMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_normalizedCoordinates = ObjC.selector("normalizedCoordinates");
    private static final MethodHandle MH_normalizedCoordinates = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setNormalizedCoordinates_ = ObjC.selector("setNormalizedCoordinates:");
    private static final MethodHandle MH_setNormalizedCoordinates_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_lodMinClamp = ObjC.selector("lodMinClamp");
    private static final MethodHandle MH_lodMinClamp = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLodMinClamp_ = ObjC.selector("setLodMinClamp:");
    private static final MethodHandle MH_setLodMinClamp_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_lodMaxClamp = ObjC.selector("lodMaxClamp");
    private static final MethodHandle MH_lodMaxClamp = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLodMaxClamp_ = ObjC.selector("setLodMaxClamp:");
    private static final MethodHandle MH_setLodMaxClamp_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_lodAverage = ObjC.selector("lodAverage");
    private static final MethodHandle MH_lodAverage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLodAverage_ = ObjC.selector("setLodAverage:");
    private static final MethodHandle MH_setLodAverage_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_lodBias = ObjC.selector("lodBias");
    private static final MethodHandle MH_lodBias = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLodBias_ = ObjC.selector("setLodBias:");
    private static final MethodHandle MH_setLodBias_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_compareFunction = ObjC.selector("compareFunction");
    private static final MethodHandle MH_compareFunction = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCompareFunction_ = ObjC.selector("setCompareFunction:");
    private static final MethodHandle MH_setCompareFunction_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supportArgumentBuffers = ObjC.selector("supportArgumentBuffers");
    private static final MethodHandle MH_supportArgumentBuffers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSupportArgumentBuffers_ = ObjC.selector("setSupportArgumentBuffers:");
    private static final MethodHandle MH_setSupportArgumentBuffers_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLSamplerDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLSamplerDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLSamplerDescriptor alloc() {
        try {
            return new MTLSamplerDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor init]} */
    public MTLSamplerDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor minFilter]} */
    public MTLSamplerMinMagFilter minFilter() {
        try {
            return MTLSamplerMinMagFilter.of((long) MH_minFilter.invokeExact(this.handle, SEL_minFilter));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor setMinFilter:]} */
    public void setMinFilter(final MTLSamplerMinMagFilter minFilter) {
        try {
            MH_setMinFilter_.invokeExact(this.handle, SEL_setMinFilter_, minFilter.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor magFilter]} */
    public MTLSamplerMinMagFilter magFilter() {
        try {
            return MTLSamplerMinMagFilter.of((long) MH_magFilter.invokeExact(this.handle, SEL_magFilter));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor setMagFilter:]} */
    public void setMagFilter(final MTLSamplerMinMagFilter magFilter) {
        try {
            MH_setMagFilter_.invokeExact(this.handle, SEL_setMagFilter_, magFilter.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor mipFilter]} */
    public MTLSamplerMipFilter mipFilter() {
        try {
            return MTLSamplerMipFilter.of((long) MH_mipFilter.invokeExact(this.handle, SEL_mipFilter));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor setMipFilter:]} */
    public void setMipFilter(final MTLSamplerMipFilter mipFilter) {
        try {
            MH_setMipFilter_.invokeExact(this.handle, SEL_setMipFilter_, mipFilter.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor maxAnisotropy]} */
    public long maxAnisotropy() {
        try {
            return (long) MH_maxAnisotropy.invokeExact(this.handle, SEL_maxAnisotropy);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor setMaxAnisotropy:]} */
    public void setMaxAnisotropy(final long maxAnisotropy) {
        try {
            MH_setMaxAnisotropy_.invokeExact(this.handle, SEL_setMaxAnisotropy_, maxAnisotropy);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor sAddressMode]} */
    public MTLSamplerAddressMode sAddressMode() {
        try {
            return MTLSamplerAddressMode.of((long) MH_sAddressMode.invokeExact(this.handle, SEL_sAddressMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor setSAddressMode:]} */
    public void setSAddressMode(final MTLSamplerAddressMode sAddressMode) {
        try {
            MH_setSAddressMode_.invokeExact(this.handle, SEL_setSAddressMode_, sAddressMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor tAddressMode]} */
    public MTLSamplerAddressMode tAddressMode() {
        try {
            return MTLSamplerAddressMode.of((long) MH_tAddressMode.invokeExact(this.handle, SEL_tAddressMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor setTAddressMode:]} */
    public void setTAddressMode(final MTLSamplerAddressMode tAddressMode) {
        try {
            MH_setTAddressMode_.invokeExact(this.handle, SEL_setTAddressMode_, tAddressMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor rAddressMode]} */
    public MTLSamplerAddressMode rAddressMode() {
        try {
            return MTLSamplerAddressMode.of((long) MH_rAddressMode.invokeExact(this.handle, SEL_rAddressMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor setRAddressMode:]} */
    public void setRAddressMode(final MTLSamplerAddressMode rAddressMode) {
        try {
            MH_setRAddressMode_.invokeExact(this.handle, SEL_setRAddressMode_, rAddressMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor borderColor]} */
    public MTLSamplerBorderColor borderColor() {
        try {
            return MTLSamplerBorderColor.of((long) MH_borderColor.invokeExact(this.handle, SEL_borderColor));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor setBorderColor:]} */
    public void setBorderColor(final MTLSamplerBorderColor borderColor) {
        try {
            MH_setBorderColor_.invokeExact(this.handle, SEL_setBorderColor_, borderColor.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor reductionMode]} */
    public MTLSamplerReductionMode reductionMode() {
        try {
            return MTLSamplerReductionMode.of((long) MH_reductionMode.invokeExact(this.handle, SEL_reductionMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor setReductionMode:]} */
    public void setReductionMode(final MTLSamplerReductionMode reductionMode) {
        try {
            MH_setReductionMode_.invokeExact(this.handle, SEL_setReductionMode_, reductionMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor normalizedCoordinates]} */
    public boolean normalizedCoordinates() {
        try {
            return (boolean) MH_normalizedCoordinates.invokeExact(this.handle, SEL_normalizedCoordinates);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor setNormalizedCoordinates:]} */
    public void setNormalizedCoordinates(final boolean normalizedCoordinates) {
        try {
            MH_setNormalizedCoordinates_.invokeExact(this.handle, SEL_setNormalizedCoordinates_, normalizedCoordinates);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor lodMinClamp]} */
    public float lodMinClamp() {
        try {
            return (float) MH_lodMinClamp.invokeExact(this.handle, SEL_lodMinClamp);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor setLodMinClamp:]} */
    public void setLodMinClamp(final float lodMinClamp) {
        try {
            MH_setLodMinClamp_.invokeExact(this.handle, SEL_setLodMinClamp_, lodMinClamp);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor lodMaxClamp]} */
    public float lodMaxClamp() {
        try {
            return (float) MH_lodMaxClamp.invokeExact(this.handle, SEL_lodMaxClamp);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor setLodMaxClamp:]} */
    public void setLodMaxClamp(final float lodMaxClamp) {
        try {
            MH_setLodMaxClamp_.invokeExact(this.handle, SEL_setLodMaxClamp_, lodMaxClamp);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor lodAverage]} */
    public boolean lodAverage() {
        try {
            return (boolean) MH_lodAverage.invokeExact(this.handle, SEL_lodAverage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor setLodAverage:]} */
    public void setLodAverage(final boolean lodAverage) {
        try {
            MH_setLodAverage_.invokeExact(this.handle, SEL_setLodAverage_, lodAverage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor lodBias]} */
    public float lodBias() {
        try {
            return (float) MH_lodBias.invokeExact(this.handle, SEL_lodBias);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor setLodBias:]} */
    public void setLodBias(final float lodBias) {
        try {
            MH_setLodBias_.invokeExact(this.handle, SEL_setLodBias_, lodBias);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor compareFunction]} */
    public MTLCompareFunction compareFunction() {
        try {
            return MTLCompareFunction.of((long) MH_compareFunction.invokeExact(this.handle, SEL_compareFunction));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor setCompareFunction:]} */
    public void setCompareFunction(final MTLCompareFunction compareFunction) {
        try {
            MH_setCompareFunction_.invokeExact(this.handle, SEL_setCompareFunction_, compareFunction.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor supportArgumentBuffers]} */
    public boolean supportArgumentBuffers() {
        try {
            return (boolean) MH_supportArgumentBuffers.invokeExact(this.handle, SEL_supportArgumentBuffers);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor setSupportArgumentBuffers:]} */
    public void setSupportArgumentBuffers(final boolean supportArgumentBuffers) {
        try {
            MH_setSupportArgumentBuffers_.invokeExact(this.handle, SEL_setSupportArgumentBuffers_, supportArgumentBuffers);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLSamplerDescriptor setLabel:]} */
    public void setLabel(@Nullable final String label) {
        final long nsLabel = label == null ? 0L : ObjC.nsString(label);
        try {
            MH_setLabel_.invokeExact(this.handle, SEL_setLabel_, nsLabel);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsLabel);
        }
    }
}
