package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLComputePipelineReflection}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcomputepipelinereflection">Apple documentation</a>
 */
public class MTLComputePipelineReflection extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLComputePipelineReflection");
    private static final long SEL_bindings = ObjC.selector("bindings");
    private static final MethodHandle MH_bindings = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_arguments = ObjC.selector("arguments");
    private static final MethodHandle MH_arguments = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLComputePipelineReflection(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLComputePipelineReflection alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLComputePipelineReflection alloc() {
        try {
            return new MTLComputePipelineReflection((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLComputePipelineReflection init]} */
    public MTLComputePipelineReflection init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLComputePipelineReflection bindings]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLBinding> bindings() {
        try {
            long result = (long) MH_bindings.invokeExact(this.handle, SEL_bindings);
            return new NSArray<>(result, MTLBinding::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLComputePipelineReflection arguments]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLArgument> arguments() {
        try {
            long result = (long) MH_arguments.invokeExact(this.handle, SEL_arguments);
            return new NSArray<>(result, MTLArgument::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
