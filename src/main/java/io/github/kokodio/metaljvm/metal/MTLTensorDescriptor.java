package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLTensorDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltensordescriptor">Apple documentation</a>
 */
public class MTLTensorDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLTensorDescriptor");
    private static final long SEL_dimensions = ObjC.selector("dimensions");
    private static final MethodHandle MH_dimensions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDimensions_ = ObjC.selector("setDimensions:");
    private static final MethodHandle MH_setDimensions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_strides = ObjC.selector("strides");
    private static final MethodHandle MH_strides = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStrides_ = ObjC.selector("setStrides:");
    private static final MethodHandle MH_setStrides_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dataType = ObjC.selector("dataType");
    private static final MethodHandle MH_dataType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDataType_ = ObjC.selector("setDataType:");
    private static final MethodHandle MH_setDataType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_usage = ObjC.selector("usage");
    private static final MethodHandle MH_usage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setUsage_ = ObjC.selector("setUsage:");
    private static final MethodHandle MH_setUsage_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_auxiliaryPlanes = ObjC.selector("auxiliaryPlanes");
    private static final MethodHandle MH_auxiliaryPlanes = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAuxiliaryPlanes_ = ObjC.selector("setAuxiliaryPlanes:");
    private static final MethodHandle MH_setAuxiliaryPlanes_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resourceOptions = ObjC.selector("resourceOptions");
    private static final MethodHandle MH_resourceOptions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setResourceOptions_ = ObjC.selector("setResourceOptions:");
    private static final MethodHandle MH_setResourceOptions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_cpuCacheMode = ObjC.selector("cpuCacheMode");
    private static final MethodHandle MH_cpuCacheMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCpuCacheMode_ = ObjC.selector("setCpuCacheMode:");
    private static final MethodHandle MH_setCpuCacheMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_storageMode = ObjC.selector("storageMode");
    private static final MethodHandle MH_storageMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStorageMode_ = ObjC.selector("setStorageMode:");
    private static final MethodHandle MH_setStorageMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_hazardTrackingMode = ObjC.selector("hazardTrackingMode");
    private static final MethodHandle MH_hazardTrackingMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setHazardTrackingMode_ = ObjC.selector("setHazardTrackingMode:");
    private static final MethodHandle MH_setHazardTrackingMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLTensorDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLTensorDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLTensorDescriptor alloc() {
        try {
            return new MTLTensorDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorDescriptor init]} */
    public MTLTensorDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTensorDescriptor dimensions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLTensorExtents dimensions() {
        try {
            long result = (long) MH_dimensions.invokeExact(this.handle, SEL_dimensions);
            return new MTLTensorExtents(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorDescriptor setDimensions:]} */
    public void setDimensions(final MTLTensorExtents dimensions) {
        try {
            MH_setDimensions_.invokeExact(this.handle, SEL_setDimensions_, dimensions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTensorDescriptor strides]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTensorExtents strides() {
        try {
            long result = (long) MH_strides.invokeExact(this.handle, SEL_strides);
            return result == 0L ? null : new MTLTensorExtents(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorDescriptor setStrides:]} */
    public void setStrides(@Nullable final MTLTensorExtents strides) {
        try {
            MH_setStrides_.invokeExact(this.handle, SEL_setStrides_, strides == null ? 0L : strides.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorDescriptor dataType]} */
    public MTLTensorDataType dataType() {
        try {
            return MTLTensorDataType.of((long) MH_dataType.invokeExact(this.handle, SEL_dataType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorDescriptor setDataType:]} */
    public void setDataType(final MTLTensorDataType dataType) {
        try {
            MH_setDataType_.invokeExact(this.handle, SEL_setDataType_, dataType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTensorDescriptor usage]}
     *
     * @return a combination of {@link MTLTensorUsage} flags
     */
    public long usage() {
        try {
            return (long) MH_usage.invokeExact(this.handle, SEL_usage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTensorDescriptor setUsage:]}
     *
     * @param usage a combination of {@link MTLTensorUsage} flags
     */
    public void setUsage(final long usage) {
        try {
            MH_setUsage_.invokeExact(this.handle, SEL_setUsage_, usage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTensorDescriptor auxiliaryPlanes]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTensorAuxiliaryPlaneDescriptorMap auxiliaryPlanes() {
        try {
            long result = (long) MH_auxiliaryPlanes.invokeExact(this.handle, SEL_auxiliaryPlanes);
            return result == 0L ? null : new MTLTensorAuxiliaryPlaneDescriptorMap(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorDescriptor setAuxiliaryPlanes:]} */
    public void setAuxiliaryPlanes(@Nullable final MTLTensorAuxiliaryPlaneDescriptorMap auxiliaryPlanes) {
        try {
            MH_setAuxiliaryPlanes_.invokeExact(this.handle, SEL_setAuxiliaryPlanes_, auxiliaryPlanes == null ? 0L : auxiliaryPlanes.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTensorDescriptor resourceOptions]}
     *
     * @return a combination of {@link MTLResourceOptions} flags
     */
    public long resourceOptions() {
        try {
            return (long) MH_resourceOptions.invokeExact(this.handle, SEL_resourceOptions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTensorDescriptor setResourceOptions:]}
     *
     * @param resourceOptions a combination of {@link MTLResourceOptions} flags
     */
    public void setResourceOptions(final long resourceOptions) {
        try {
            MH_setResourceOptions_.invokeExact(this.handle, SEL_setResourceOptions_, resourceOptions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorDescriptor cpuCacheMode]} */
    public MTLCPUCacheMode cpuCacheMode() {
        try {
            return MTLCPUCacheMode.of((long) MH_cpuCacheMode.invokeExact(this.handle, SEL_cpuCacheMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorDescriptor setCpuCacheMode:]} */
    public void setCpuCacheMode(final MTLCPUCacheMode cpuCacheMode) {
        try {
            MH_setCpuCacheMode_.invokeExact(this.handle, SEL_setCpuCacheMode_, cpuCacheMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorDescriptor storageMode]} */
    public MTLStorageMode storageMode() {
        try {
            return MTLStorageMode.of((long) MH_storageMode.invokeExact(this.handle, SEL_storageMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorDescriptor setStorageMode:]} */
    public void setStorageMode(final MTLStorageMode storageMode) {
        try {
            MH_setStorageMode_.invokeExact(this.handle, SEL_setStorageMode_, storageMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorDescriptor hazardTrackingMode]} */
    public MTLHazardTrackingMode hazardTrackingMode() {
        try {
            return MTLHazardTrackingMode.of((long) MH_hazardTrackingMode.invokeExact(this.handle, SEL_hazardTrackingMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorDescriptor setHazardTrackingMode:]} */
    public void setHazardTrackingMode(final MTLHazardTrackingMode hazardTrackingMode) {
        try {
            MH_setHazardTrackingMode_.invokeExact(this.handle, SEL_setHazardTrackingMode_, hazardTrackingMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
