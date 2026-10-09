package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code Metal}
 *
 * @see <a href="https://developer.apple.com/documentation/metal">Apple documentation</a>
 */
public final class Metal {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final MethodHandle MH_MTLCreateSystemDefaultDevice = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("MTLCreateSystemDefaultDevice"), FunctionDescriptor.of(JAVA_LONG));
    private static final MethodHandle MH_MTLCopyAllDevices = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("MTLCopyAllDevices"), FunctionDescriptor.of(JAVA_LONG));
    private static final MethodHandle MH_MTLCopyAllDevicesWithObserver = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("MTLCopyAllDevicesWithObserver"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_MTLRemoveDeviceObserver = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("MTLRemoveDeviceObserver"), FunctionDescriptor.ofVoid(JAVA_LONG));
    private static final MethodHandle MH_MTLIOCompressionContextDefaultChunkSize = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("MTLIOCompressionContextDefaultChunkSize"), FunctionDescriptor.of(JAVA_LONG));
    private static final MethodHandle MH_MTLIOCreateCompressionContext = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("MTLIOCreateCompressionContext"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_MTLIOCompressionContextAppendData = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("MTLIOCompressionContextAppendData"), FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_MTLIOFlushAndDestroyCompressionContext = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("MTLIOFlushAndDestroyCompressionContext"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));

    public static final long MTL4CommandQueueErrorDomain = ObjC.loadSymbol(FRAMEWORK, "MTL4CommandQueueErrorDomain");
    public static final long MTLBinaryArchiveDomain = ObjC.loadSymbol(FRAMEWORK, "MTLBinaryArchiveDomain");
    public static final long MTLCaptureErrorDomain = ObjC.loadSymbol(FRAMEWORK, "MTLCaptureErrorDomain");
    public static final long MTLCommandBufferEncoderInfoErrorKey = ObjC.loadSymbol(FRAMEWORK, "MTLCommandBufferEncoderInfoErrorKey");
    public static final long MTLCommandBufferErrorDomain = ObjC.loadSymbol(FRAMEWORK, "MTLCommandBufferErrorDomain");
    public static final long MTLCommonCounterClipperInvocations = ObjC.loadSymbol(FRAMEWORK, "MTLCommonCounterClipperInvocations");
    public static final long MTLCommonCounterClipperPrimitivesOut = ObjC.loadSymbol(FRAMEWORK, "MTLCommonCounterClipperPrimitivesOut");
    public static final long MTLCommonCounterComputeKernelInvocations = ObjC.loadSymbol(FRAMEWORK, "MTLCommonCounterComputeKernelInvocations");
    public static final long MTLCommonCounterFragmentCycles = ObjC.loadSymbol(FRAMEWORK, "MTLCommonCounterFragmentCycles");
    public static final long MTLCommonCounterFragmentInvocations = ObjC.loadSymbol(FRAMEWORK, "MTLCommonCounterFragmentInvocations");
    public static final long MTLCommonCounterFragmentsPassed = ObjC.loadSymbol(FRAMEWORK, "MTLCommonCounterFragmentsPassed");
    public static final long MTLCommonCounterPostTessellationVertexCycles = ObjC.loadSymbol(FRAMEWORK, "MTLCommonCounterPostTessellationVertexCycles");
    public static final long MTLCommonCounterPostTessellationVertexInvocations = ObjC.loadSymbol(FRAMEWORK, "MTLCommonCounterPostTessellationVertexInvocations");
    public static final long MTLCommonCounterRenderTargetWriteCycles = ObjC.loadSymbol(FRAMEWORK, "MTLCommonCounterRenderTargetWriteCycles");
    public static final long MTLCommonCounterSetStageUtilization = ObjC.loadSymbol(FRAMEWORK, "MTLCommonCounterSetStageUtilization");
    public static final long MTLCommonCounterSetStatistic = ObjC.loadSymbol(FRAMEWORK, "MTLCommonCounterSetStatistic");
    public static final long MTLCommonCounterSetTimestamp = ObjC.loadSymbol(FRAMEWORK, "MTLCommonCounterSetTimestamp");
    public static final long MTLCommonCounterTessellationCycles = ObjC.loadSymbol(FRAMEWORK, "MTLCommonCounterTessellationCycles");
    public static final long MTLCommonCounterTessellationInputPatches = ObjC.loadSymbol(FRAMEWORK, "MTLCommonCounterTessellationInputPatches");
    public static final long MTLCommonCounterTimestamp = ObjC.loadSymbol(FRAMEWORK, "MTLCommonCounterTimestamp");
    public static final long MTLCommonCounterTotalCycles = ObjC.loadSymbol(FRAMEWORK, "MTLCommonCounterTotalCycles");
    public static final long MTLCommonCounterVertexCycles = ObjC.loadSymbol(FRAMEWORK, "MTLCommonCounterVertexCycles");
    public static final long MTLCommonCounterVertexInvocations = ObjC.loadSymbol(FRAMEWORK, "MTLCommonCounterVertexInvocations");
    public static final long MTLCounterErrorDomain = ObjC.loadSymbol(FRAMEWORK, "MTLCounterErrorDomain");
    public static final long MTLDeviceErrorDomain = ObjC.loadSymbol(FRAMEWORK, "MTLDeviceErrorDomain");
    public static final long MTLDeviceRemovalRequestedNotification = ObjC.loadSymbol(FRAMEWORK, "MTLDeviceRemovalRequestedNotification");
    public static final long MTLDeviceWasAddedNotification = ObjC.loadSymbol(FRAMEWORK, "MTLDeviceWasAddedNotification");
    public static final long MTLDeviceWasRemovedNotification = ObjC.loadSymbol(FRAMEWORK, "MTLDeviceWasRemovedNotification");
    public static final long MTLDynamicLibraryDomain = ObjC.loadSymbol(FRAMEWORK, "MTLDynamicLibraryDomain");
    public static final long MTLIOErrorDomain = ObjC.loadSymbol(FRAMEWORK, "MTLIOErrorDomain");
    public static final long MTLLibraryErrorDomain = ObjC.loadSymbol(FRAMEWORK, "MTLLibraryErrorDomain");
    public static final long MTLLogStateErrorDomain = ObjC.loadSymbol(FRAMEWORK, "MTLLogStateErrorDomain");
    public static final long MTLTensorDomain = ObjC.loadSymbol(FRAMEWORK, "MTLTensorDomain");

    private Metal() {
    }

    /**
     * {@code MTLCreateSystemDefaultDevice()}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public static MTLDevice MTLCreateSystemDefaultDevice() {
        try {
            long result = (long) MH_MTLCreateSystemDefaultDevice.invokeExact();
            return result == 0L ? null : new MTLDevice(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code MTLCopyAllDevices()}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public static NSArray<MTLDevice> MTLCopyAllDevices() {
        try {
            long result = (long) MH_MTLCopyAllDevices.invokeExact();
            return new NSArray<>(result, MTLDevice::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code MTLCopyAllDevicesWithObserver()}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public static NSArray<MTLDevice> MTLCopyAllDevicesWithObserver(final NSObject observer, final long handler) {
        try {
            long result = (long) MH_MTLCopyAllDevicesWithObserver.invokeExact(observer.handle(), handler);
            return new NSArray<>(result, MTLDevice::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code MTLRemoveDeviceObserver()} */
    public static void MTLRemoveDeviceObserver(final NSObject observer) {
        try {
            MH_MTLRemoveDeviceObserver.invokeExact(observer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code MTLIOCompressionContextDefaultChunkSize()} */
    public static long MTLIOCompressionContextDefaultChunkSize() {
        try {
            return (long) MH_MTLIOCompressionContextDefaultChunkSize.invokeExact();
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code MTLIOCreateCompressionContext()} */
    public static MemorySegment MTLIOCreateCompressionContext(final MemorySegment path, final MTLIOCompressionMethod type, final long chunkSize) {
        try {
            return MemorySegment.ofAddress((long) MH_MTLIOCreateCompressionContext.invokeExact(path.address(), type.value, chunkSize));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code MTLIOCompressionContextAppendData()} */
    public static void MTLIOCompressionContextAppendData(final MemorySegment context, final MemorySegment data, final long size) {
        try {
            MH_MTLIOCompressionContextAppendData.invokeExact(context.address(), data.address(), size);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code MTLIOFlushAndDestroyCompressionContext()} */
    public static MTLIOCompressionStatus MTLIOFlushAndDestroyCompressionContext(final MemorySegment context) {
        try {
            return MTLIOCompressionStatus.of((long) MH_MTLIOFlushAndDestroyCompressionContext.invokeExact(context.address()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
