package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.foundation.NSRange;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLFunctionConstantValues}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlfunctionconstantvalues">Apple documentation</a>
 */
public class MTLFunctionConstantValues extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLFunctionConstantValues");
    private static final long SEL_setConstantValue_type_atIndex_ = ObjC.selector("setConstantValue:type:atIndex:");
    private static final MethodHandle MH_setConstantValue_type_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setConstantValues_type_withRange_ = ObjC.selector("setConstantValues:type:withRange:");
    private static final MethodHandle MH_setConstantValues_type_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setConstantValue_type_withName_ = ObjC.selector("setConstantValue:type:withName:");
    private static final MethodHandle MH_setConstantValue_type_withName_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_reset = ObjC.selector("reset");
    private static final MethodHandle MH_reset = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLFunctionConstantValues(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLFunctionConstantValues alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLFunctionConstantValues alloc() {
        try {
            return new MTLFunctionConstantValues((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionConstantValues init]} */
    public MTLFunctionConstantValues init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionConstantValues setConstantValue:type:atIndex:]} */
    public void setConstantValue(final MemorySegment value, final MTLDataType type, final long index) {
        try {
            MH_setConstantValue_type_atIndex_.invokeExact(this.handle, SEL_setConstantValue_type_atIndex_, value.address(), type.value, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionConstantValues setConstantValues:type:withRange:]} */
    public void setConstantValues(final MemorySegment values, final MTLDataType type, final NSRange range) {
        try {
            MH_setConstantValues_type_withRange_.invokeExact(this.handle, SEL_setConstantValues_type_withRange_, values.address(), type.value, range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionConstantValues setConstantValue:type:withName:]} */
    public void setConstantValue(final MemorySegment value, final MTLDataType type, final String name) {
        final long nsName = ObjC.nsString(name);
        try {
            MH_setConstantValue_type_withName_.invokeExact(this.handle, SEL_setConstantValue_type_withName_, value.address(), type.value, nsName);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
        }
    }

    /** {@code -[MTLFunctionConstantValues reset]} */
    public void reset() {
        try {
            MH_reset.invokeExact(this.handle, SEL_reset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
