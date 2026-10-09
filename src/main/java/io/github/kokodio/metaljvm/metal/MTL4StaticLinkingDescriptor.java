package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSDictionary;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.foundation.NSString;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4StaticLinkingDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4staticlinkingdescriptor">Apple documentation</a>
 */
public class MTL4StaticLinkingDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4StaticLinkingDescriptor");
    private static final long SEL_functionDescriptors = ObjC.selector("functionDescriptors");
    private static final MethodHandle MH_functionDescriptors = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFunctionDescriptors_ = ObjC.selector("setFunctionDescriptors:");
    private static final MethodHandle MH_setFunctionDescriptors_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_privateFunctionDescriptors = ObjC.selector("privateFunctionDescriptors");
    private static final MethodHandle MH_privateFunctionDescriptors = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPrivateFunctionDescriptors_ = ObjC.selector("setPrivateFunctionDescriptors:");
    private static final MethodHandle MH_setPrivateFunctionDescriptors_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_groups = ObjC.selector("groups");
    private static final MethodHandle MH_groups = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setGroups_ = ObjC.selector("setGroups:");
    private static final MethodHandle MH_setGroups_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4StaticLinkingDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4StaticLinkingDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4StaticLinkingDescriptor alloc() {
        try {
            return new MTL4StaticLinkingDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4StaticLinkingDescriptor init]} */
    public MTL4StaticLinkingDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4StaticLinkingDescriptor functionDescriptors]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTL4FunctionDescriptor> functionDescriptors() {
        try {
            long result = (long) MH_functionDescriptors.invokeExact(this.handle, SEL_functionDescriptors);
            return result == 0L ? null : new NSArray<>(result, MTL4FunctionDescriptor::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4StaticLinkingDescriptor setFunctionDescriptors:]} */
    public void setFunctionDescriptors(@Nullable final NSArray<MTL4FunctionDescriptor> functionDescriptors) {
        try {
            MH_setFunctionDescriptors_.invokeExact(this.handle, SEL_setFunctionDescriptors_, functionDescriptors == null ? 0L : functionDescriptors.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4StaticLinkingDescriptor privateFunctionDescriptors]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTL4FunctionDescriptor> privateFunctionDescriptors() {
        try {
            long result = (long) MH_privateFunctionDescriptors.invokeExact(this.handle, SEL_privateFunctionDescriptors);
            return result == 0L ? null : new NSArray<>(result, MTL4FunctionDescriptor::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4StaticLinkingDescriptor setPrivateFunctionDescriptors:]} */
    public void setPrivateFunctionDescriptors(@Nullable final NSArray<MTL4FunctionDescriptor> privateFunctionDescriptors) {
        try {
            MH_setPrivateFunctionDescriptors_.invokeExact(this.handle, SEL_setPrivateFunctionDescriptors_, privateFunctionDescriptors == null ? 0L : privateFunctionDescriptors.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4StaticLinkingDescriptor groups]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSDictionary<NSString, NSArray<MTL4FunctionDescriptor>> groups() {
        try {
            long result = (long) MH_groups.invokeExact(this.handle, SEL_groups);
            return result == 0L ? null : new NSDictionary<>(result, NSString::new, handle1 -> new NSArray<>(handle1, MTL4FunctionDescriptor::new));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4StaticLinkingDescriptor setGroups:]} */
    public void setGroups(@Nullable final NSDictionary<NSString, NSArray<MTL4FunctionDescriptor>> groups) {
        try {
            MH_setGroups_.invokeExact(this.handle, SEL_setGroups_, groups == null ? 0L : groups.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
