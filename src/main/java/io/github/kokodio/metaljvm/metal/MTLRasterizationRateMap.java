package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLRasterizationRateMap}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlrasterizationratemap">Apple documentation</a>
 */
public class MTLRasterizationRateMap extends NSObject {
    private static final long SEL_copyParameterDataToBuffer_offset_ = ObjC.selector("copyParameterDataToBuffer:offset:");
    private static final MethodHandle MH_copyParameterDataToBuffer_offset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_physicalSizeForLayer_ = ObjC.selector("physicalSizeForLayer:");
    private static final MethodHandle MH_physicalSizeForLayer_ = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSize.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_mapScreenToPhysicalCoordinates_forLayer_ = ObjC.selector("mapScreenToPhysicalCoordinates:forLayer:");
    private static final MethodHandle MH_mapScreenToPhysicalCoordinates_forLayer_ = ObjC.msgSendCritical(FunctionDescriptor.of(MTLCoordinate2D.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_FLOAT, JAVA_FLOAT, JAVA_LONG));
    private static final long SEL_mapPhysicalToScreenCoordinates_forLayer_ = ObjC.selector("mapPhysicalToScreenCoordinates:forLayer:");
    private static final MethodHandle MH_mapPhysicalToScreenCoordinates_forLayer_ = ObjC.msgSendCritical(FunctionDescriptor.of(MTLCoordinate2D.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_FLOAT, JAVA_FLOAT, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_screenSize = ObjC.selector("screenSize");
    private static final MethodHandle MH_screenSize = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_physicalGranularity = ObjC.selector("physicalGranularity");
    private static final MethodHandle MH_physicalGranularity = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_layerCount = ObjC.selector("layerCount");
    private static final MethodHandle MH_layerCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_parameterBufferSizeAndAlign = ObjC.selector("parameterBufferSizeAndAlign");
    private static final MethodHandle MH_parameterBufferSizeAndAlign = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSizeAndAlign.LAYOUT, JAVA_LONG, JAVA_LONG));

    public MTLRasterizationRateMap(final long handle) {
        super(handle);
    }

    /** {@code -[MTLRasterizationRateMap copyParameterDataToBuffer:offset:]} */
    public void copyParameterDataToBuffer(final MTLBuffer buffer, final long offset) {
        try {
            MH_copyParameterDataToBuffer_offset_.invokeExact(this.handle, SEL_copyParameterDataToBuffer_offset_, buffer.handle(), offset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateMap physicalSizeForLayer:]} */
    public MTLSize physicalSizeForLayer(final long layerIndex) {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_physicalSizeForLayer_.invokeExact((SegmentAllocator) stack, this.handle, SEL_physicalSizeForLayer_, layerIndex));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateMap mapScreenToPhysicalCoordinates:forLayer:]} */
    public MTLCoordinate2D mapScreenToPhysicalCoordinates(final MTLCoordinate2D screenCoordinates, final long layerIndex) {
        try (NativeStack stack = NativeStack.push()) {
            return MTLCoordinate2D.read((MemorySegment) MH_mapScreenToPhysicalCoordinates_forLayer_.invokeExact((SegmentAllocator) stack, this.handle, SEL_mapScreenToPhysicalCoordinates_forLayer_, screenCoordinates.x(), screenCoordinates.y(), layerIndex));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateMap mapPhysicalToScreenCoordinates:forLayer:]} */
    public MTLCoordinate2D mapPhysicalToScreenCoordinates(final MTLCoordinate2D physicalCoordinates, final long layerIndex) {
        try (NativeStack stack = NativeStack.push()) {
            return MTLCoordinate2D.read((MemorySegment) MH_mapPhysicalToScreenCoordinates_forLayer_.invokeExact((SegmentAllocator) stack, this.handle, SEL_mapPhysicalToScreenCoordinates_forLayer_, physicalCoordinates.x(), physicalCoordinates.y(), layerIndex));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRasterizationRateMap device]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLDevice device() {
        try {
            long result = (long) MH_device.invokeExact(this.handle, SEL_device);
            return new MTLDevice(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateMap label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateMap screenSize]} */
    public MTLSize screenSize() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_screenSize.invokeExact((SegmentAllocator) stack, this.handle, SEL_screenSize));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateMap physicalGranularity]} */
    public MTLSize physicalGranularity() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_physicalGranularity.invokeExact((SegmentAllocator) stack, this.handle, SEL_physicalGranularity));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateMap layerCount]} */
    public long layerCount() {
        try {
            return (long) MH_layerCount.invokeExact(this.handle, SEL_layerCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateMap parameterBufferSizeAndAlign]} */
    public MTLSizeAndAlign parameterBufferSizeAndAlign() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSizeAndAlign.read((MemorySegment) MH_parameterBufferSizeAndAlign.invokeExact((SegmentAllocator) stack, this.handle, SEL_parameterBufferSizeAndAlign));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
