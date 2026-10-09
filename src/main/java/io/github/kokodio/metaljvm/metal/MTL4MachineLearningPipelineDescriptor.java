package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSRange;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4MachineLearningPipelineDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4machinelearningpipelinedescriptor">Apple documentation</a>
 */
public class MTL4MachineLearningPipelineDescriptor extends MTL4PipelineDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4MachineLearningPipelineDescriptor");
    private static final long SEL_setInputDimensions_atBufferIndex_ = ObjC.selector("setInputDimensions:atBufferIndex:");
    private static final MethodHandle MH_setInputDimensions_atBufferIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInputDimensions_withRange_ = ObjC.selector("setInputDimensions:withRange:");
    private static final MethodHandle MH_setInputDimensions_withRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_inputDimensionsAtBufferIndex_ = ObjC.selector("inputDimensionsAtBufferIndex:");
    private static final MethodHandle MH_inputDimensionsAtBufferIndex_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_reset = ObjC.selector("reset");
    private static final MethodHandle MH_reset = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_machineLearningFunctionDescriptor = ObjC.selector("machineLearningFunctionDescriptor");
    private static final MethodHandle MH_machineLearningFunctionDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMachineLearningFunctionDescriptor_ = ObjC.selector("setMachineLearningFunctionDescriptor:");
    private static final MethodHandle MH_setMachineLearningFunctionDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4MachineLearningPipelineDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4MachineLearningPipelineDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4MachineLearningPipelineDescriptor alloc() {
        try {
            return new MTL4MachineLearningPipelineDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MachineLearningPipelineDescriptor init]} */
    public MTL4MachineLearningPipelineDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MachineLearningPipelineDescriptor setInputDimensions:atBufferIndex:]} */
    public void setInputDimensions(@Nullable final MTLTensorExtents dimensions, final long bufferIndex) {
        try {
            MH_setInputDimensions_atBufferIndex_.invokeExact(this.handle, SEL_setInputDimensions_atBufferIndex_, dimensions == null ? 0L : dimensions.handle(), bufferIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MachineLearningPipelineDescriptor setInputDimensions:withRange:]} */
    public void setInputDimensions(final NSArray<MTLTensorExtents> dimensions, final NSRange range) {
        try {
            MH_setInputDimensions_withRange_.invokeExact(this.handle, SEL_setInputDimensions_withRange_, dimensions.handle(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4MachineLearningPipelineDescriptor inputDimensionsAtBufferIndex:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLTensorExtents inputDimensionsAtBufferIndex(final long bufferIndex) {
        try {
            long result = (long) MH_inputDimensionsAtBufferIndex_.invokeExact(this.handle, SEL_inputDimensionsAtBufferIndex_, bufferIndex);
            return result == 0L ? null : new MTLTensorExtents(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MachineLearningPipelineDescriptor reset]} */
    public void reset() {
        try {
            MH_reset.invokeExact(this.handle, SEL_reset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MachineLearningPipelineDescriptor label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MachineLearningPipelineDescriptor setLabel:]} */
    public void setLabel(@Nullable final String label) {
        final long nsLabel = label == null ? 0L : ObjC.nsString(label);
        try {
            MH_setLabel_.invokeExact(this.handle, SEL_setLabel_, nsLabel);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsLabel);
        }
    }

    /**
     * {@code -[MTL4MachineLearningPipelineDescriptor machineLearningFunctionDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTL4FunctionDescriptor machineLearningFunctionDescriptor() {
        try {
            long result = (long) MH_machineLearningFunctionDescriptor.invokeExact(this.handle, SEL_machineLearningFunctionDescriptor);
            return result == 0L ? null : new MTL4FunctionDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MachineLearningPipelineDescriptor setMachineLearningFunctionDescriptor:]} */
    public void setMachineLearningFunctionDescriptor(@Nullable final MTL4FunctionDescriptor machineLearningFunctionDescriptor) {
        try {
            MH_setMachineLearningFunctionDescriptor_.invokeExact(this.handle, SEL_setMachineLearningFunctionDescriptor_, machineLearningFunctionDescriptor == null ? 0L : machineLearningFunctionDescriptor.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
