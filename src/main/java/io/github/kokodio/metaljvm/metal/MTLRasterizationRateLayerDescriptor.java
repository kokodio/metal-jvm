package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLRasterizationRateLayerDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlrasterizationratelayerdescriptor">Apple documentation</a>
 */
public class MTLRasterizationRateLayerDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLRasterizationRateLayerDescriptor");
    private static final long SEL_init = ObjC.selector("init");
    private static final MethodHandle MH_init = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithSampleCount_ = ObjC.selector("initWithSampleCount:");
    private static final MethodHandle MH_initWithSampleCount_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithSampleCount_horizontal_vertical_ = ObjC.selector("initWithSampleCount:horizontal:vertical:");
    private static final MethodHandle MH_initWithSampleCount_horizontal_vertical_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sampleCount = ObjC.selector("sampleCount");
    private static final MethodHandle MH_sampleCount = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxSampleCount = ObjC.selector("maxSampleCount");
    private static final MethodHandle MH_maxSampleCount = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_horizontalSampleStorage = ObjC.selector("horizontalSampleStorage");
    private static final MethodHandle MH_horizontalSampleStorage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_verticalSampleStorage = ObjC.selector("verticalSampleStorage");
    private static final MethodHandle MH_verticalSampleStorage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_horizontal = ObjC.selector("horizontal");
    private static final MethodHandle MH_horizontal = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_vertical = ObjC.selector("vertical");
    private static final MethodHandle MH_vertical = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSampleCount_ = ObjC.selector("setSampleCount:");
    private static final MethodHandle MH_setSampleCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLRasterizationRateLayerDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLRasterizationRateLayerDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLRasterizationRateLayerDescriptor alloc() {
        try {
            return new MTLRasterizationRateLayerDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateLayerDescriptor init]} */
    public MTLRasterizationRateLayerDescriptor init() {
        try {
            long result = (long) MH_init.invokeExact(this.handle, SEL_init);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateLayerDescriptor initWithSampleCount:]} */
    public MTLRasterizationRateLayerDescriptor initWithSampleCount(final MTLSize sampleCount) {
        try (NativeStack stack = NativeStack.push()) {
            long result = (long) MH_initWithSampleCount_.invokeExact(this.handle, SEL_initWithSampleCount_, sampleCount.on(stack).address());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateLayerDescriptor initWithSampleCount:horizontal:vertical:]} */
    public MTLRasterizationRateLayerDescriptor initWithSampleCount(final MTLSize sampleCount, final MemorySegment horizontal, final MemorySegment vertical) {
        try (NativeStack stack = NativeStack.push()) {
            long result = (long) MH_initWithSampleCount_horizontal_vertical_.invokeExact(this.handle, SEL_initWithSampleCount_horizontal_vertical_, sampleCount.on(stack).address(), horizontal.address(), vertical.address());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateLayerDescriptor sampleCount]} */
    public MTLSize sampleCount() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_sampleCount.invokeExact((SegmentAllocator) stack, this.handle, SEL_sampleCount));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateLayerDescriptor maxSampleCount]} */
    public MTLSize maxSampleCount() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_maxSampleCount.invokeExact((SegmentAllocator) stack, this.handle, SEL_maxSampleCount));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateLayerDescriptor horizontalSampleStorage]} */
    public MemorySegment horizontalSampleStorage() {
        try {
            return MemorySegment.ofAddress((long) MH_horizontalSampleStorage.invokeExact(this.handle, SEL_horizontalSampleStorage));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateLayerDescriptor verticalSampleStorage]} */
    public MemorySegment verticalSampleStorage() {
        try {
            return MemorySegment.ofAddress((long) MH_verticalSampleStorage.invokeExact(this.handle, SEL_verticalSampleStorage));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRasterizationRateLayerDescriptor horizontal]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLRasterizationRateSampleArray horizontal() {
        try {
            long result = (long) MH_horizontal.invokeExact(this.handle, SEL_horizontal);
            return new MTLRasterizationRateSampleArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRasterizationRateLayerDescriptor vertical]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLRasterizationRateSampleArray vertical() {
        try {
            long result = (long) MH_vertical.invokeExact(this.handle, SEL_vertical);
            return new MTLRasterizationRateSampleArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateLayerDescriptor setSampleCount:]} */
    public void setSampleCount(final MTLSize sampleCount) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setSampleCount_.invokeExact(this.handle, SEL_setSampleCount_, sampleCount.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
