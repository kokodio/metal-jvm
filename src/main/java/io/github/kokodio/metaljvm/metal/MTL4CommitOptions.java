package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4CommitOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4commitoptions">Apple documentation</a>
 */
public class MTL4CommitOptions extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4CommitOptions");
    private static final long SEL_addFeedbackHandler_ = ObjC.selector("addFeedbackHandler:");
    private static final MethodHandle MH_addFeedbackHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4CommitOptions(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4CommitOptions alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4CommitOptions alloc() {
        try {
            return new MTL4CommitOptions((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommitOptions init]} */
    public MTL4CommitOptions init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CommitOptions addFeedbackHandler:]} */
    public void addFeedbackHandler(final long block) {
        try {
            MH_addFeedbackHandler_.invokeExact(this.handle, SEL_addFeedbackHandler_, block);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
