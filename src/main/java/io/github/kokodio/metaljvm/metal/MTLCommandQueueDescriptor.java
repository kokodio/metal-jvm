package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLCommandQueueDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcommandqueuedescriptor">Apple documentation</a>
 */
public class MTLCommandQueueDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLCommandQueueDescriptor");
    private static final long SEL_maxCommandBufferCount = ObjC.selector("maxCommandBufferCount");
    private static final MethodHandle MH_maxCommandBufferCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxCommandBufferCount_ = ObjC.selector("setMaxCommandBufferCount:");
    private static final MethodHandle MH_setMaxCommandBufferCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_logState = ObjC.selector("logState");
    private static final MethodHandle MH_logState = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLogState_ = ObjC.selector("setLogState:");
    private static final MethodHandle MH_setLogState_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLCommandQueueDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLCommandQueueDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLCommandQueueDescriptor alloc() {
        try {
            return new MTLCommandQueueDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandQueueDescriptor init]} */
    public MTLCommandQueueDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandQueueDescriptor maxCommandBufferCount]} */
    public long maxCommandBufferCount() {
        try {
            return (long) MH_maxCommandBufferCount.invokeExact(this.handle, SEL_maxCommandBufferCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandQueueDescriptor setMaxCommandBufferCount:]} */
    public void setMaxCommandBufferCount(final long maxCommandBufferCount) {
        try {
            MH_setMaxCommandBufferCount_.invokeExact(this.handle, SEL_setMaxCommandBufferCount_, maxCommandBufferCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCommandQueueDescriptor logState]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLLogState logState() {
        try {
            long result = (long) MH_logState.invokeExact(this.handle, SEL_logState);
            return result == 0L ? null : new MTLLogState(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCommandQueueDescriptor setLogState:]} */
    public void setLogState(@Nullable final MTLLogState logState) {
        try {
            MH_setLogState_.invokeExact(this.handle, SEL_setLogState_, logState == null ? 0L : logState.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
