package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLRasterizationRateMapDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlrasterizationratemapdescriptor">Apple documentation</a>
 */
public class MTLRasterizationRateMapDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLRasterizationRateMapDescriptor");
    private static final long SEL_CLASS_rasterizationRateMapDescriptorWithScreenSize_ = ObjC.selector("rasterizationRateMapDescriptorWithScreenSize:");
    private static final MethodHandle MH_CLASS_rasterizationRateMapDescriptorWithScreenSize_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_rasterizationRateMapDescriptorWithScreenSize_layer_ = ObjC.selector("rasterizationRateMapDescriptorWithScreenSize:layer:");
    private static final MethodHandle MH_CLASS_rasterizationRateMapDescriptorWithScreenSize_layer_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_rasterizationRateMapDescriptorWithScreenSize_layerCount_layers_ = ObjC.selector("rasterizationRateMapDescriptorWithScreenSize:layerCount:layers:");
    private static final MethodHandle MH_CLASS_rasterizationRateMapDescriptorWithScreenSize_layerCount_layers_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_layerAtIndex_ = ObjC.selector("layerAtIndex:");
    private static final MethodHandle MH_layerAtIndex_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLayer_atIndex_ = ObjC.selector("setLayer:atIndex:");
    private static final MethodHandle MH_setLayer_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_layers = ObjC.selector("layers");
    private static final MethodHandle MH_layers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_screenSize = ObjC.selector("screenSize");
    private static final MethodHandle MH_screenSize = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setScreenSize_ = ObjC.selector("setScreenSize:");
    private static final MethodHandle MH_setScreenSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_layerCount = ObjC.selector("layerCount");
    private static final MethodHandle MH_layerCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLRasterizationRateMapDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLRasterizationRateMapDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLRasterizationRateMapDescriptor alloc() {
        try {
            return new MTLRasterizationRateMapDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateMapDescriptor init]} */
    public MTLRasterizationRateMapDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[MTLRasterizationRateMapDescriptor rasterizationRateMapDescriptorWithScreenSize:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static MTLRasterizationRateMapDescriptor rasterizationRateMapDescriptor(final MTLSize screenSize) {
        try (NativeStack stack = NativeStack.push()) {
            long result = (long) MH_CLASS_rasterizationRateMapDescriptorWithScreenSize_.invokeExact(CLS, SEL_CLASS_rasterizationRateMapDescriptorWithScreenSize_, screenSize.on(stack).address());
            return new MTLRasterizationRateMapDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[MTLRasterizationRateMapDescriptor rasterizationRateMapDescriptorWithScreenSize:layer:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static MTLRasterizationRateMapDescriptor rasterizationRateMapDescriptor(final MTLSize screenSize, final MTLRasterizationRateLayerDescriptor layer) {
        try (NativeStack stack = NativeStack.push()) {
            long result = (long) MH_CLASS_rasterizationRateMapDescriptorWithScreenSize_layer_.invokeExact(CLS, SEL_CLASS_rasterizationRateMapDescriptorWithScreenSize_layer_, screenSize.on(stack).address(), layer.handle());
            return new MTLRasterizationRateMapDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[MTLRasterizationRateMapDescriptor rasterizationRateMapDescriptorWithScreenSize:layerCount:layers:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static MTLRasterizationRateMapDescriptor rasterizationRateMapDescriptor(final MTLSize screenSize, final long layerCount, final MemorySegment layers) {
        try (NativeStack stack = NativeStack.push()) {
            long result = (long) MH_CLASS_rasterizationRateMapDescriptorWithScreenSize_layerCount_layers_.invokeExact(CLS, SEL_CLASS_rasterizationRateMapDescriptorWithScreenSize_layerCount_layers_, screenSize.on(stack).address(), layerCount, layers.address());
            return new MTLRasterizationRateMapDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRasterizationRateMapDescriptor layerAtIndex:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLRasterizationRateLayerDescriptor layerAtIndex(final long layerIndex) {
        try {
            long result = (long) MH_layerAtIndex_.invokeExact(this.handle, SEL_layerAtIndex_, layerIndex);
            return result == 0L ? null : new MTLRasterizationRateLayerDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateMapDescriptor setLayer:atIndex:]} */
    public void setLayer(@Nullable final MTLRasterizationRateLayerDescriptor layer, final long layerIndex) {
        try {
            MH_setLayer_atIndex_.invokeExact(this.handle, SEL_setLayer_atIndex_, layer == null ? 0L : layer.handle(), layerIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRasterizationRateMapDescriptor layers]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLRasterizationRateLayerArray layers() {
        try {
            long result = (long) MH_layers.invokeExact(this.handle, SEL_layers);
            return new MTLRasterizationRateLayerArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateMapDescriptor screenSize]} */
    public MTLSize screenSize() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_screenSize.invokeExact((SegmentAllocator) stack, this.handle, SEL_screenSize));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateMapDescriptor setScreenSize:]} */
    public void setScreenSize(final MTLSize screenSize) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setScreenSize_.invokeExact(this.handle, SEL_setScreenSize_, screenSize.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateMapDescriptor label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateMapDescriptor setLabel:]} */
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

    /** {@code -[MTLRasterizationRateMapDescriptor layerCount]} */
    public long layerCount() {
        try {
            return (long) MH_layerCount.invokeExact(this.handle, SEL_layerCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
