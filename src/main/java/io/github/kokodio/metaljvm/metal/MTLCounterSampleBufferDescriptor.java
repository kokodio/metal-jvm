package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLCounterSampleBufferDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcountersamplebufferdescriptor">Apple documentation</a>
 */
public class MTLCounterSampleBufferDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLCounterSampleBufferDescriptor");
    private static final long SEL_counterSet = ObjC.selector("counterSet");
    private static final MethodHandle MH_counterSet = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCounterSet_ = ObjC.selector("setCounterSet:");
    private static final MethodHandle MH_setCounterSet_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_storageMode = ObjC.selector("storageMode");
    private static final MethodHandle MH_storageMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStorageMode_ = ObjC.selector("setStorageMode:");
    private static final MethodHandle MH_setStorageMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sampleCount = ObjC.selector("sampleCount");
    private static final MethodHandle MH_sampleCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSampleCount_ = ObjC.selector("setSampleCount:");
    private static final MethodHandle MH_setSampleCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLCounterSampleBufferDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLCounterSampleBufferDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLCounterSampleBufferDescriptor alloc() {
        try {
            return new MTLCounterSampleBufferDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCounterSampleBufferDescriptor init]} */
    public MTLCounterSampleBufferDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCounterSampleBufferDescriptor counterSet]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLCounterSet counterSet() {
        try {
            long result = (long) MH_counterSet.invokeExact(this.handle, SEL_counterSet);
            return result == 0L ? null : new MTLCounterSet(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCounterSampleBufferDescriptor setCounterSet:]} */
    public void setCounterSet(@Nullable final MTLCounterSet counterSet) {
        try {
            MH_setCounterSet_.invokeExact(this.handle, SEL_setCounterSet_, counterSet == null ? 0L : counterSet.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCounterSampleBufferDescriptor label]} */
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCounterSampleBufferDescriptor setLabel:]} */
    public void setLabel(final String label) {
        final long nsLabel = ObjC.nsString(label);
        try {
            MH_setLabel_.invokeExact(this.handle, SEL_setLabel_, nsLabel);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsLabel);
        }
    }

    /** {@code -[MTLCounterSampleBufferDescriptor storageMode]} */
    public MTLStorageMode storageMode() {
        try {
            return MTLStorageMode.of((long) MH_storageMode.invokeExact(this.handle, SEL_storageMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCounterSampleBufferDescriptor setStorageMode:]} */
    public void setStorageMode(final MTLStorageMode storageMode) {
        try {
            MH_setStorageMode_.invokeExact(this.handle, SEL_setStorageMode_, storageMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCounterSampleBufferDescriptor sampleCount]} */
    public long sampleCount() {
        try {
            return (long) MH_sampleCount.invokeExact(this.handle, SEL_sampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCounterSampleBufferDescriptor setSampleCount:]} */
    public void setSampleCount(final long sampleCount) {
        try {
            MH_setSampleCount_.invokeExact(this.handle, SEL_setSampleCount_, sampleCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
