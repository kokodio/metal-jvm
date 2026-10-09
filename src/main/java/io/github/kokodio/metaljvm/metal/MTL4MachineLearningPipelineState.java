package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4MachineLearningPipelineState}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4machinelearningpipelinestate">Apple documentation</a>
 */
public class MTL4MachineLearningPipelineState extends MTLAllocation {
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_reflection = ObjC.selector("reflection");
    private static final MethodHandle MH_reflection = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_intermediatesHeapSize = ObjC.selector("intermediatesHeapSize");
    private static final MethodHandle MH_intermediatesHeapSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTL4MachineLearningPipelineState(final long handle) {
        super(handle);
    }

    /** {@code -[MTL4MachineLearningPipelineState label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4MachineLearningPipelineState device]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLDevice device() {
        try {
            long result = (long) MH_device.invokeExact(this.handle, SEL_device);
            return new MTLDevice(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4MachineLearningPipelineState reflection]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTL4MachineLearningPipelineReflection reflection() {
        try {
            long result = (long) MH_reflection.invokeExact(this.handle, SEL_reflection);
            return result == 0L ? null : new MTL4MachineLearningPipelineReflection(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MachineLearningPipelineState intermediatesHeapSize]} */
    public long intermediatesHeapSize() {
        try {
            return (long) MH_intermediatesHeapSize.invokeExact(this.handle, SEL_intermediatesHeapSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
