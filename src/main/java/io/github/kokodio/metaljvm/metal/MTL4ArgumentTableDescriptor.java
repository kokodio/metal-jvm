package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4ArgumentTableDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4argumenttabledescriptor">Apple documentation</a>
 */
public class MTL4ArgumentTableDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4ArgumentTableDescriptor");
    private static final long SEL_maxBufferBindCount = ObjC.selector("maxBufferBindCount");
    private static final MethodHandle MH_maxBufferBindCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxBufferBindCount_ = ObjC.selector("setMaxBufferBindCount:");
    private static final MethodHandle MH_setMaxBufferBindCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxTextureBindCount = ObjC.selector("maxTextureBindCount");
    private static final MethodHandle MH_maxTextureBindCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxTextureBindCount_ = ObjC.selector("setMaxTextureBindCount:");
    private static final MethodHandle MH_setMaxTextureBindCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxSamplerStateBindCount = ObjC.selector("maxSamplerStateBindCount");
    private static final MethodHandle MH_maxSamplerStateBindCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxSamplerStateBindCount_ = ObjC.selector("setMaxSamplerStateBindCount:");
    private static final MethodHandle MH_setMaxSamplerStateBindCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initializeBindings = ObjC.selector("initializeBindings");
    private static final MethodHandle MH_initializeBindings = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInitializeBindings_ = ObjC.selector("setInitializeBindings:");
    private static final MethodHandle MH_setInitializeBindings_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_supportAttributeStrides = ObjC.selector("supportAttributeStrides");
    private static final MethodHandle MH_supportAttributeStrides = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSupportAttributeStrides_ = ObjC.selector("setSupportAttributeStrides:");
    private static final MethodHandle MH_setSupportAttributeStrides_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4ArgumentTableDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4ArgumentTableDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4ArgumentTableDescriptor alloc() {
        try {
            return new MTL4ArgumentTableDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ArgumentTableDescriptor init]} */
    public MTL4ArgumentTableDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ArgumentTableDescriptor maxBufferBindCount]} */
    public long maxBufferBindCount() {
        try {
            return (long) MH_maxBufferBindCount.invokeExact(this.handle, SEL_maxBufferBindCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ArgumentTableDescriptor setMaxBufferBindCount:]} */
    public void setMaxBufferBindCount(final long maxBufferBindCount) {
        try {
            MH_setMaxBufferBindCount_.invokeExact(this.handle, SEL_setMaxBufferBindCount_, maxBufferBindCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ArgumentTableDescriptor maxTextureBindCount]} */
    public long maxTextureBindCount() {
        try {
            return (long) MH_maxTextureBindCount.invokeExact(this.handle, SEL_maxTextureBindCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ArgumentTableDescriptor setMaxTextureBindCount:]} */
    public void setMaxTextureBindCount(final long maxTextureBindCount) {
        try {
            MH_setMaxTextureBindCount_.invokeExact(this.handle, SEL_setMaxTextureBindCount_, maxTextureBindCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ArgumentTableDescriptor maxSamplerStateBindCount]} */
    public long maxSamplerStateBindCount() {
        try {
            return (long) MH_maxSamplerStateBindCount.invokeExact(this.handle, SEL_maxSamplerStateBindCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ArgumentTableDescriptor setMaxSamplerStateBindCount:]} */
    public void setMaxSamplerStateBindCount(final long maxSamplerStateBindCount) {
        try {
            MH_setMaxSamplerStateBindCount_.invokeExact(this.handle, SEL_setMaxSamplerStateBindCount_, maxSamplerStateBindCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ArgumentTableDescriptor initializeBindings]} */
    public boolean initializeBindings() {
        try {
            return (boolean) MH_initializeBindings.invokeExact(this.handle, SEL_initializeBindings);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ArgumentTableDescriptor setInitializeBindings:]} */
    public void setInitializeBindings(final boolean initializeBindings) {
        try {
            MH_setInitializeBindings_.invokeExact(this.handle, SEL_setInitializeBindings_, initializeBindings);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ArgumentTableDescriptor supportAttributeStrides]} */
    public boolean supportAttributeStrides() {
        try {
            return (boolean) MH_supportAttributeStrides.invokeExact(this.handle, SEL_supportAttributeStrides);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ArgumentTableDescriptor setSupportAttributeStrides:]} */
    public void setSupportAttributeStrides(final boolean supportAttributeStrides) {
        try {
            MH_setSupportAttributeStrides_.invokeExact(this.handle, SEL_setSupportAttributeStrides_, supportAttributeStrides);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ArgumentTableDescriptor label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ArgumentTableDescriptor setLabel:]} */
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
