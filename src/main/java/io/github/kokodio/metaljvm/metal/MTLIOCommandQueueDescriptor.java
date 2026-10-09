package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLIOCommandQueueDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtliocommandqueuedescriptor">Apple documentation</a>
 */
public class MTLIOCommandQueueDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLIOCommandQueueDescriptor");
    private static final long SEL_maxCommandBufferCount = ObjC.selector("maxCommandBufferCount");
    private static final MethodHandle MH_maxCommandBufferCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxCommandBufferCount_ = ObjC.selector("setMaxCommandBufferCount:");
    private static final MethodHandle MH_setMaxCommandBufferCount_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_priority = ObjC.selector("priority");
    private static final MethodHandle MH_priority = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPriority_ = ObjC.selector("setPriority:");
    private static final MethodHandle MH_setPriority_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_type = ObjC.selector("type");
    private static final MethodHandle MH_type = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setType_ = ObjC.selector("setType:");
    private static final MethodHandle MH_setType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_maxCommandsInFlight = ObjC.selector("maxCommandsInFlight");
    private static final MethodHandle MH_maxCommandsInFlight = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxCommandsInFlight_ = ObjC.selector("setMaxCommandsInFlight:");
    private static final MethodHandle MH_setMaxCommandsInFlight_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_scratchBufferAllocator = ObjC.selector("scratchBufferAllocator");
    private static final MethodHandle MH_scratchBufferAllocator = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setScratchBufferAllocator_ = ObjC.selector("setScratchBufferAllocator:");
    private static final MethodHandle MH_setScratchBufferAllocator_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLIOCommandQueueDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLIOCommandQueueDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLIOCommandQueueDescriptor alloc() {
        try {
            return new MTLIOCommandQueueDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandQueueDescriptor init]} */
    public MTLIOCommandQueueDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandQueueDescriptor maxCommandBufferCount]} */
    public long maxCommandBufferCount() {
        try {
            return (long) MH_maxCommandBufferCount.invokeExact(this.handle, SEL_maxCommandBufferCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandQueueDescriptor setMaxCommandBufferCount:]} */
    public void setMaxCommandBufferCount(final long maxCommandBufferCount) {
        try {
            MH_setMaxCommandBufferCount_.invokeExact(this.handle, SEL_setMaxCommandBufferCount_, maxCommandBufferCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandQueueDescriptor priority]} */
    public MTLIOPriority priority() {
        try {
            return MTLIOPriority.of((long) MH_priority.invokeExact(this.handle, SEL_priority));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandQueueDescriptor setPriority:]} */
    public void setPriority(final MTLIOPriority priority) {
        try {
            MH_setPriority_.invokeExact(this.handle, SEL_setPriority_, priority.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandQueueDescriptor type]} */
    public MTLIOCommandQueueType type() {
        try {
            return MTLIOCommandQueueType.of((long) MH_type.invokeExact(this.handle, SEL_type));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandQueueDescriptor setType:]} */
    public void setType(final MTLIOCommandQueueType type) {
        try {
            MH_setType_.invokeExact(this.handle, SEL_setType_, type.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandQueueDescriptor maxCommandsInFlight]} */
    public long maxCommandsInFlight() {
        try {
            return (long) MH_maxCommandsInFlight.invokeExact(this.handle, SEL_maxCommandsInFlight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandQueueDescriptor setMaxCommandsInFlight:]} */
    public void setMaxCommandsInFlight(final long maxCommandsInFlight) {
        try {
            MH_setMaxCommandsInFlight_.invokeExact(this.handle, SEL_setMaxCommandsInFlight_, maxCommandsInFlight);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLIOCommandQueueDescriptor scratchBufferAllocator]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLIOScratchBufferAllocator scratchBufferAllocator() {
        try {
            long result = (long) MH_scratchBufferAllocator.invokeExact(this.handle, SEL_scratchBufferAllocator);
            return result == 0L ? null : new MTLIOScratchBufferAllocator(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLIOCommandQueueDescriptor setScratchBufferAllocator:]} */
    public void setScratchBufferAllocator(@Nullable final MTLIOScratchBufferAllocator scratchBufferAllocator) {
        try {
            MH_setScratchBufferAllocator_.invokeExact(this.handle, SEL_setScratchBufferAllocator_, scratchBufferAllocator == null ? 0L : scratchBufferAllocator.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
