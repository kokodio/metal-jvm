package io.github.kokodio.metaljvm.quartzcore;

import io.github.kokodio.metaljvm.coregraphics.CGSize;
import io.github.kokodio.metaljvm.metal.MTLDevice;
import io.github.kokodio.metaljvm.metal.MTLPixelFormat;
import io.github.kokodio.metaljvm.metal.MTLResidencySet;
import io.github.kokodio.metaljvm.foundation.NSDictionary;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code CAMetalLayer}
 *
 * @see <a href="https://developer.apple.com/documentation/quartzcore/cametallayer">Apple documentation</a>
 */
public class CAMetalLayer extends CALayer {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("QuartzCore");
    private static final long CLS = ObjC.clazz("CAMetalLayer");
    private static final long SEL_nextDrawable = ObjC.selector("nextDrawable");
    private static final MethodHandle MH_nextDrawable = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDevice_ = ObjC.selector("setDevice:");
    private static final MethodHandle MH_setDevice_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_preferredDevice = ObjC.selector("preferredDevice");
    private static final MethodHandle MH_preferredDevice = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pixelFormat = ObjC.selector("pixelFormat");
    private static final MethodHandle MH_pixelFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPixelFormat_ = ObjC.selector("setPixelFormat:");
    private static final MethodHandle MH_setPixelFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_framebufferOnly = ObjC.selector("framebufferOnly");
    private static final MethodHandle MH_framebufferOnly = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFramebufferOnly_ = ObjC.selector("setFramebufferOnly:");
    private static final MethodHandle MH_setFramebufferOnly_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_drawableSize = ObjC.selector("drawableSize");
    private static final MethodHandle MH_drawableSize = ObjC.msgSendCritical(FunctionDescriptor.of(CGSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDrawableSize_ = ObjC.selector("setDrawableSize:");
    private static final MethodHandle MH_setDrawableSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_maximumDrawableCount = ObjC.selector("maximumDrawableCount");
    private static final MethodHandle MH_maximumDrawableCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaximumDrawableCount_ = ObjC.selector("setMaximumDrawableCount:");
    private static final MethodHandle MH_setMaximumDrawableCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_presentsWithTransaction = ObjC.selector("presentsWithTransaction");
    private static final MethodHandle MH_presentsWithTransaction = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPresentsWithTransaction_ = ObjC.selector("setPresentsWithTransaction:");
    private static final MethodHandle MH_setPresentsWithTransaction_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_colorspace = ObjC.selector("colorspace");
    private static final MethodHandle MH_colorspace = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setColorspace_ = ObjC.selector("setColorspace:");
    private static final MethodHandle MH_setColorspace_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_wantsExtendedDynamicRangeContent = ObjC.selector("wantsExtendedDynamicRangeContent");
    private static final MethodHandle MH_wantsExtendedDynamicRangeContent = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setWantsExtendedDynamicRangeContent_ = ObjC.selector("setWantsExtendedDynamicRangeContent:");
    private static final MethodHandle MH_setWantsExtendedDynamicRangeContent_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_EDRMetadata = ObjC.selector("EDRMetadata");
    private static final MethodHandle MH_EDRMetadata = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setEDRMetadata_ = ObjC.selector("setEDRMetadata:");
    private static final MethodHandle MH_setEDRMetadata_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_displaySyncEnabled = ObjC.selector("displaySyncEnabled");
    private static final MethodHandle MH_displaySyncEnabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDisplaySyncEnabled_ = ObjC.selector("setDisplaySyncEnabled:");
    private static final MethodHandle MH_setDisplaySyncEnabled_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_allowsNextDrawableTimeout = ObjC.selector("allowsNextDrawableTimeout");
    private static final MethodHandle MH_allowsNextDrawableTimeout = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAllowsNextDrawableTimeout_ = ObjC.selector("setAllowsNextDrawableTimeout:");
    private static final MethodHandle MH_setAllowsNextDrawableTimeout_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_developerHUDProperties = ObjC.selector("developerHUDProperties");
    private static final MethodHandle MH_developerHUDProperties = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDeveloperHUDProperties_ = ObjC.selector("setDeveloperHUDProperties:");
    private static final MethodHandle MH_setDeveloperHUDProperties_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_residencySet = ObjC.selector("residencySet");
    private static final MethodHandle MH_residencySet = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public CAMetalLayer(final long handle) {
        super(handle);
    }

    /**
     * {@code +[CAMetalLayer alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static CAMetalLayer alloc() {
        try {
            return new CAMetalLayer((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer init]} */
    public CAMetalLayer init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CAMetalLayer nextDrawable]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public CAMetalDrawable nextDrawable() {
        try {
            long result = (long) MH_nextDrawable.invokeExact(this.handle, SEL_nextDrawable);
            return result == 0L ? null : new CAMetalDrawable(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CAMetalLayer device]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLDevice device() {
        try {
            long result = (long) MH_device.invokeExact(this.handle, SEL_device);
            return result == 0L ? null : new MTLDevice(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer setDevice:]} */
    public void setDevice(@Nullable final MTLDevice device) {
        try {
            MH_setDevice_.invokeExact(this.handle, SEL_setDevice_, device == null ? 0L : device.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CAMetalLayer preferredDevice]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLDevice preferredDevice() {
        try {
            long result = (long) MH_preferredDevice.invokeExact(this.handle, SEL_preferredDevice);
            return result == 0L ? null : new MTLDevice(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer pixelFormat]} */
    public MTLPixelFormat pixelFormat() {
        try {
            return MTLPixelFormat.of((long) MH_pixelFormat.invokeExact(this.handle, SEL_pixelFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer setPixelFormat:]} */
    public void setPixelFormat(final MTLPixelFormat pixelFormat) {
        try {
            MH_setPixelFormat_.invokeExact(this.handle, SEL_setPixelFormat_, pixelFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer framebufferOnly]} */
    public boolean framebufferOnly() {
        try {
            return (boolean) MH_framebufferOnly.invokeExact(this.handle, SEL_framebufferOnly);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer setFramebufferOnly:]} */
    public void setFramebufferOnly(final boolean framebufferOnly) {
        try {
            MH_setFramebufferOnly_.invokeExact(this.handle, SEL_setFramebufferOnly_, framebufferOnly);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer drawableSize]} */
    public CGSize drawableSize() {
        try (NativeStack stack = NativeStack.push()) {
            return CGSize.read((MemorySegment) MH_drawableSize.invokeExact((SegmentAllocator) stack, this.handle, SEL_drawableSize));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer setDrawableSize:]} */
    public void setDrawableSize(final CGSize drawableSize) {
        try {
            MH_setDrawableSize_.invokeExact(this.handle, SEL_setDrawableSize_, drawableSize.width(), drawableSize.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer maximumDrawableCount]} */
    public long maximumDrawableCount() {
        try {
            return (long) MH_maximumDrawableCount.invokeExact(this.handle, SEL_maximumDrawableCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer setMaximumDrawableCount:]} */
    public void setMaximumDrawableCount(final long maximumDrawableCount) {
        try {
            MH_setMaximumDrawableCount_.invokeExact(this.handle, SEL_setMaximumDrawableCount_, maximumDrawableCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer presentsWithTransaction]} */
    public boolean presentsWithTransaction() {
        try {
            return (boolean) MH_presentsWithTransaction.invokeExact(this.handle, SEL_presentsWithTransaction);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer setPresentsWithTransaction:]} */
    public void setPresentsWithTransaction(final boolean presentsWithTransaction) {
        try {
            MH_setPresentsWithTransaction_.invokeExact(this.handle, SEL_setPresentsWithTransaction_, presentsWithTransaction);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer colorspace]} */
    public long colorspace() {
        try {
            return (long) MH_colorspace.invokeExact(this.handle, SEL_colorspace);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer setColorspace:]} */
    public void setColorspace(final long colorspace) {
        try {
            MH_setColorspace_.invokeExact(this.handle, SEL_setColorspace_, colorspace);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer wantsExtendedDynamicRangeContent]} */
    public boolean wantsExtendedDynamicRangeContent() {
        try {
            return (boolean) MH_wantsExtendedDynamicRangeContent.invokeExact(this.handle, SEL_wantsExtendedDynamicRangeContent);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer setWantsExtendedDynamicRangeContent:]} */
    public void setWantsExtendedDynamicRangeContent(final boolean wantsExtendedDynamicRangeContent) {
        try {
            MH_setWantsExtendedDynamicRangeContent_.invokeExact(this.handle, SEL_setWantsExtendedDynamicRangeContent_, wantsExtendedDynamicRangeContent);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CAMetalLayer EDRMetadata]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject EDRMetadata() {
        try {
            long result = (long) MH_EDRMetadata.invokeExact(this.handle, SEL_EDRMetadata);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer setEDRMetadata:]} */
    public void setEDRMetadata(@Nullable final NSObject EDRMetadata) {
        try {
            MH_setEDRMetadata_.invokeExact(this.handle, SEL_setEDRMetadata_, EDRMetadata == null ? 0L : EDRMetadata.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer displaySyncEnabled]} */
    public boolean displaySyncEnabled() {
        try {
            return (boolean) MH_displaySyncEnabled.invokeExact(this.handle, SEL_displaySyncEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer setDisplaySyncEnabled:]} */
    public void setDisplaySyncEnabled(final boolean displaySyncEnabled) {
        try {
            MH_setDisplaySyncEnabled_.invokeExact(this.handle, SEL_setDisplaySyncEnabled_, displaySyncEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer allowsNextDrawableTimeout]} */
    public boolean allowsNextDrawableTimeout() {
        try {
            return (boolean) MH_allowsNextDrawableTimeout.invokeExact(this.handle, SEL_allowsNextDrawableTimeout);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer setAllowsNextDrawableTimeout:]} */
    public void setAllowsNextDrawableTimeout(final boolean allowsNextDrawableTimeout) {
        try {
            MH_setAllowsNextDrawableTimeout_.invokeExact(this.handle, SEL_setAllowsNextDrawableTimeout_, allowsNextDrawableTimeout);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CAMetalLayer developerHUDProperties]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSDictionary<NSObject, NSObject> developerHUDProperties() {
        try {
            long result = (long) MH_developerHUDProperties.invokeExact(this.handle, SEL_developerHUDProperties);
            return result == 0L ? null : new NSDictionary<>(result, NSObject::new, NSObject::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CAMetalLayer setDeveloperHUDProperties:]} */
    public void setDeveloperHUDProperties(@Nullable final NSDictionary<NSObject, NSObject> developerHUDProperties) {
        try {
            MH_setDeveloperHUDProperties_.invokeExact(this.handle, SEL_setDeveloperHUDProperties_, developerHUDProperties == null ? 0L : developerHUDProperties.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CAMetalLayer residencySet]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLResidencySet residencySet() {
        try {
            long result = (long) MH_residencySet.invokeExact(this.handle, SEL_residencySet);
            return result == 0L ? null : new MTLResidencySet(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
