package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLFunctionStitchingInputNode}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlfunctionstitchinginputnode">Apple documentation</a>
 */
public class MTLFunctionStitchingInputNode extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLFunctionStitchingInputNode");
    private static final long SEL_initWithArgumentIndex_ = ObjC.selector("initWithArgumentIndex:");
    private static final MethodHandle MH_initWithArgumentIndex_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_argumentIndex = ObjC.selector("argumentIndex");
    private static final MethodHandle MH_argumentIndex = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setArgumentIndex_ = ObjC.selector("setArgumentIndex:");
    private static final MethodHandle MH_setArgumentIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLFunctionStitchingInputNode(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLFunctionStitchingInputNode alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLFunctionStitchingInputNode alloc() {
        try {
            return new MTLFunctionStitchingInputNode((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionStitchingInputNode init]} */
    public MTLFunctionStitchingInputNode init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionStitchingInputNode initWithArgumentIndex:]} */
    public MTLFunctionStitchingInputNode init(final long argument) {
        try {
            long result = (long) MH_initWithArgumentIndex_.invokeExact(this.handle, SEL_initWithArgumentIndex_, argument);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionStitchingInputNode argumentIndex]} */
    public long argumentIndex() {
        try {
            return (long) MH_argumentIndex.invokeExact(this.handle, SEL_argumentIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionStitchingInputNode setArgumentIndex:]} */
    public void setArgumentIndex(final long argumentIndex) {
        try {
            MH_setArgumentIndex_.invokeExact(this.handle, SEL_setArgumentIndex_, argumentIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
