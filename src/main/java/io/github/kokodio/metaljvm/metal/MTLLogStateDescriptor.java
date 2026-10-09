package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLLogStateDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtllogstatedescriptor">Apple documentation</a>
 */
public class MTLLogStateDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLLogStateDescriptor");
    private static final long SEL_level = ObjC.selector("level");
    private static final MethodHandle MH_level = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLevel_ = ObjC.selector("setLevel:");
    private static final MethodHandle MH_setLevel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bufferSize = ObjC.selector("bufferSize");
    private static final MethodHandle MH_bufferSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBufferSize_ = ObjC.selector("setBufferSize:");
    private static final MethodHandle MH_setBufferSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLLogStateDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLLogStateDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLLogStateDescriptor alloc() {
        try {
            return new MTLLogStateDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLLogStateDescriptor init]} */
    public MTLLogStateDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLLogStateDescriptor level]} */
    public MTLLogLevel level() {
        try {
            return MTLLogLevel.of((long) MH_level.invokeExact(this.handle, SEL_level));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLLogStateDescriptor setLevel:]} */
    public void setLevel(final MTLLogLevel level) {
        try {
            MH_setLevel_.invokeExact(this.handle, SEL_setLevel_, level.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLLogStateDescriptor bufferSize]} */
    public long bufferSize() {
        try {
            return (long) MH_bufferSize.invokeExact(this.handle, SEL_bufferSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLLogStateDescriptor setBufferSize:]} */
    public void setBufferSize(final long bufferSize) {
        try {
            MH_setBufferSize_.invokeExact(this.handle, SEL_setBufferSize_, bufferSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
