package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLIntersectionFunctionDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlintersectionfunctiondescriptor">Apple documentation</a>
 */
public class MTLIntersectionFunctionDescriptor extends MTLFunctionDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLIntersectionFunctionDescriptor");
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLIntersectionFunctionDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLIntersectionFunctionDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLIntersectionFunctionDescriptor alloc() {
        try {
            return new MTLIntersectionFunctionDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIntersectionFunctionDescriptor init]} */
    public MTLIntersectionFunctionDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
