package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSNumber;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLRasterizationRateSampleArray}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlrasterizationratesamplearray">Apple documentation</a>
 */
public class MTLRasterizationRateSampleArray extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLRasterizationRateSampleArray");
    private static final long SEL_objectAtIndexedSubscript_ = ObjC.selector("objectAtIndexedSubscript:");
    private static final MethodHandle MH_objectAtIndexedSubscript_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setObject_atIndexedSubscript_ = ObjC.selector("setObject:atIndexedSubscript:");
    private static final MethodHandle MH_setObject_atIndexedSubscript_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLRasterizationRateSampleArray(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLRasterizationRateSampleArray alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLRasterizationRateSampleArray alloc() {
        try {
            return new MTLRasterizationRateSampleArray((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateSampleArray init]} */
    public MTLRasterizationRateSampleArray init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRasterizationRateSampleArray objectAtIndexedSubscript:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSNumber objectAtIndexedSubscript(final long index) {
        try {
            long result = (long) MH_objectAtIndexedSubscript_.invokeExact(this.handle, SEL_objectAtIndexedSubscript_, index);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRasterizationRateSampleArray setObject:atIndexedSubscript:]} */
    public void setObject(final NSNumber value, final long index) {
        try {
            MH_setObject_atIndexedSubscript_.invokeExact(this.handle, SEL_setObject_atIndexedSubscript_, value.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
