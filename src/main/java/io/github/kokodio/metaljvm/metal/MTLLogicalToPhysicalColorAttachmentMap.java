package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLLogicalToPhysicalColorAttachmentMap}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtllogicaltophysicalcolorattachmentmap">Apple documentation</a>
 */
public class MTLLogicalToPhysicalColorAttachmentMap extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLLogicalToPhysicalColorAttachmentMap");
    private static final long SEL_setPhysicalIndex_forLogicalIndex_ = ObjC.selector("setPhysicalIndex:forLogicalIndex:");
    private static final MethodHandle MH_setPhysicalIndex_forLogicalIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getPhysicalIndexForLogicalIndex_ = ObjC.selector("getPhysicalIndexForLogicalIndex:");
    private static final MethodHandle MH_getPhysicalIndexForLogicalIndex_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_reset = ObjC.selector("reset");
    private static final MethodHandle MH_reset = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLLogicalToPhysicalColorAttachmentMap(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLLogicalToPhysicalColorAttachmentMap alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLLogicalToPhysicalColorAttachmentMap alloc() {
        try {
            return new MTLLogicalToPhysicalColorAttachmentMap((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLLogicalToPhysicalColorAttachmentMap init]} */
    public MTLLogicalToPhysicalColorAttachmentMap init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLLogicalToPhysicalColorAttachmentMap setPhysicalIndex:forLogicalIndex:]} */
    public void setPhysicalIndex(final long physicalIndex, final long logicalIndex) {
        try {
            MH_setPhysicalIndex_forLogicalIndex_.invokeExact(this.handle, SEL_setPhysicalIndex_forLogicalIndex_, physicalIndex, logicalIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLLogicalToPhysicalColorAttachmentMap getPhysicalIndexForLogicalIndex:]} */
    public long getPhysicalIndexForLogicalIndex(final long logicalIndex) {
        try {
            return (long) MH_getPhysicalIndexForLogicalIndex_.invokeExact(this.handle, SEL_getPhysicalIndexForLogicalIndex_, logicalIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLLogicalToPhysicalColorAttachmentMap reset]} */
    public void reset() {
        try {
            MH_reset.invokeExact(this.handle, SEL_reset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
