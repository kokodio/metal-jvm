package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLHeapDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlheapdescriptor">Apple documentation</a>
 */
public class MTLHeapDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLHeapDescriptor");
    private static final long SEL_size = ObjC.selector("size");
    private static final MethodHandle MH_size = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSize_ = ObjC.selector("setSize:");
    private static final MethodHandle MH_setSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_storageMode = ObjC.selector("storageMode");
    private static final MethodHandle MH_storageMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStorageMode_ = ObjC.selector("setStorageMode:");
    private static final MethodHandle MH_setStorageMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_cpuCacheMode = ObjC.selector("cpuCacheMode");
    private static final MethodHandle MH_cpuCacheMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCpuCacheMode_ = ObjC.selector("setCpuCacheMode:");
    private static final MethodHandle MH_setCpuCacheMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sparsePageSize = ObjC.selector("sparsePageSize");
    private static final MethodHandle MH_sparsePageSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSparsePageSize_ = ObjC.selector("setSparsePageSize:");
    private static final MethodHandle MH_setSparsePageSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_hazardTrackingMode = ObjC.selector("hazardTrackingMode");
    private static final MethodHandle MH_hazardTrackingMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setHazardTrackingMode_ = ObjC.selector("setHazardTrackingMode:");
    private static final MethodHandle MH_setHazardTrackingMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resourceOptions = ObjC.selector("resourceOptions");
    private static final MethodHandle MH_resourceOptions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setResourceOptions_ = ObjC.selector("setResourceOptions:");
    private static final MethodHandle MH_setResourceOptions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_type = ObjC.selector("type");
    private static final MethodHandle MH_type = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setType_ = ObjC.selector("setType:");
    private static final MethodHandle MH_setType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxCompatiblePlacementSparsePageSize = ObjC.selector("maxCompatiblePlacementSparsePageSize");
    private static final MethodHandle MH_maxCompatiblePlacementSparsePageSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxCompatiblePlacementSparsePageSize_ = ObjC.selector("setMaxCompatiblePlacementSparsePageSize:");
    private static final MethodHandle MH_setMaxCompatiblePlacementSparsePageSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLHeapDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLHeapDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLHeapDescriptor alloc() {
        try {
            return new MTLHeapDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeapDescriptor init]} */
    public MTLHeapDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeapDescriptor size]} */
    public long size() {
        try {
            return (long) MH_size.invokeExact(this.handle, SEL_size);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeapDescriptor setSize:]} */
    public void setSize(final long size) {
        try {
            MH_setSize_.invokeExact(this.handle, SEL_setSize_, size);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeapDescriptor storageMode]} */
    public MTLStorageMode storageMode() {
        try {
            return MTLStorageMode.of((long) MH_storageMode.invokeExact(this.handle, SEL_storageMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeapDescriptor setStorageMode:]} */
    public void setStorageMode(final MTLStorageMode storageMode) {
        try {
            MH_setStorageMode_.invokeExact(this.handle, SEL_setStorageMode_, storageMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeapDescriptor cpuCacheMode]} */
    public MTLCPUCacheMode cpuCacheMode() {
        try {
            return MTLCPUCacheMode.of((long) MH_cpuCacheMode.invokeExact(this.handle, SEL_cpuCacheMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeapDescriptor setCpuCacheMode:]} */
    public void setCpuCacheMode(final MTLCPUCacheMode cpuCacheMode) {
        try {
            MH_setCpuCacheMode_.invokeExact(this.handle, SEL_setCpuCacheMode_, cpuCacheMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeapDescriptor sparsePageSize]} */
    public MTLSparsePageSize sparsePageSize() {
        try {
            return MTLSparsePageSize.of((long) MH_sparsePageSize.invokeExact(this.handle, SEL_sparsePageSize));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeapDescriptor setSparsePageSize:]} */
    public void setSparsePageSize(final MTLSparsePageSize sparsePageSize) {
        try {
            MH_setSparsePageSize_.invokeExact(this.handle, SEL_setSparsePageSize_, sparsePageSize.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeapDescriptor hazardTrackingMode]} */
    public MTLHazardTrackingMode hazardTrackingMode() {
        try {
            return MTLHazardTrackingMode.of((long) MH_hazardTrackingMode.invokeExact(this.handle, SEL_hazardTrackingMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeapDescriptor setHazardTrackingMode:]} */
    public void setHazardTrackingMode(final MTLHazardTrackingMode hazardTrackingMode) {
        try {
            MH_setHazardTrackingMode_.invokeExact(this.handle, SEL_setHazardTrackingMode_, hazardTrackingMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLHeapDescriptor resourceOptions]}
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
     * {@code -[MTLHeapDescriptor setResourceOptions:]}
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

    /** {@code -[MTLHeapDescriptor type]} */
    public MTLHeapType type() {
        try {
            return MTLHeapType.of((long) MH_type.invokeExact(this.handle, SEL_type));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeapDescriptor setType:]} */
    public void setType(final MTLHeapType type) {
        try {
            MH_setType_.invokeExact(this.handle, SEL_setType_, type.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeapDescriptor maxCompatiblePlacementSparsePageSize]} */
    public MTLSparsePageSize maxCompatiblePlacementSparsePageSize() {
        try {
            return MTLSparsePageSize.of((long) MH_maxCompatiblePlacementSparsePageSize.invokeExact(this.handle, SEL_maxCompatiblePlacementSparsePageSize));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLHeapDescriptor setMaxCompatiblePlacementSparsePageSize:]} */
    public void setMaxCompatiblePlacementSparsePageSize(final MTLSparsePageSize maxCompatiblePlacementSparsePageSize) {
        try {
            MH_setMaxCompatiblePlacementSparsePageSize_.invokeExact(this.handle, SEL_setMaxCompatiblePlacementSparsePageSize_, maxCompatiblePlacementSparsePageSize.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
