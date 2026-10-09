package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4CounterHeapDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4counterheapdescriptor">Apple documentation</a>
 */
public class MTL4CounterHeapDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4CounterHeapDescriptor");
    private static final long SEL_type = ObjC.selector("type");
    private static final MethodHandle MH_type = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setType_ = ObjC.selector("setType:");
    private static final MethodHandle MH_setType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_count = ObjC.selector("count");
    private static final MethodHandle MH_count = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCount_ = ObjC.selector("setCount:");
    private static final MethodHandle MH_setCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4CounterHeapDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4CounterHeapDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4CounterHeapDescriptor alloc() {
        try {
            return new MTL4CounterHeapDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CounterHeapDescriptor init]} */
    public MTL4CounterHeapDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CounterHeapDescriptor type]} */
    public MTL4CounterHeapType type() {
        try {
            return MTL4CounterHeapType.of((long) MH_type.invokeExact(this.handle, SEL_type));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CounterHeapDescriptor setType:]} */
    public void setType(final MTL4CounterHeapType type) {
        try {
            MH_setType_.invokeExact(this.handle, SEL_setType_, type.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CounterHeapDescriptor count]} */
    public long count() {
        try {
            return (long) MH_count.invokeExact(this.handle, SEL_count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CounterHeapDescriptor setCount:]} */
    public void setCount(final long count) {
        try {
            MH_setCount_.invokeExact(this.handle, SEL_setCount_, count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
