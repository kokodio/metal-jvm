package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4MachineLearningPipelineReflection}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4machinelearningpipelinereflection">Apple documentation</a>
 */
public class MTL4MachineLearningPipelineReflection extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4MachineLearningPipelineReflection");
    private static final long SEL_bindings = ObjC.selector("bindings");
    private static final MethodHandle MH_bindings = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4MachineLearningPipelineReflection(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4MachineLearningPipelineReflection alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4MachineLearningPipelineReflection alloc() {
        try {
            return new MTL4MachineLearningPipelineReflection((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MachineLearningPipelineReflection init]} */
    public MTL4MachineLearningPipelineReflection init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4MachineLearningPipelineReflection bindings]}
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
}
