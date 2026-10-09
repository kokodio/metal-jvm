package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4MachineLearningCommandEncoder}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4machinelearningcommandencoder">Apple documentation</a>
 */
public class MTL4MachineLearningCommandEncoder extends MTL4CommandEncoder {
    private static final long SEL_setPipelineState_ = ObjC.selector("setPipelineState:");
    private static final MethodHandle MH_setPipelineState_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setArgumentTable_ = ObjC.selector("setArgumentTable:");
    private static final MethodHandle MH_setArgumentTable_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dispatchNetworkWithIntermediatesHeap_ = ObjC.selector("dispatchNetworkWithIntermediatesHeap:");
    private static final MethodHandle MH_dispatchNetworkWithIntermediatesHeap_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTL4MachineLearningCommandEncoder(final long handle) {
        super(handle);
    }

    /** {@code -[MTL4MachineLearningCommandEncoder setPipelineState:]} */
    public void setPipelineState(final MTL4MachineLearningPipelineState pipelineState) {
        try {
            MH_setPipelineState_.invokeExact(this.handle, SEL_setPipelineState_, pipelineState.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MachineLearningCommandEncoder setArgumentTable:]} */
    public void setArgumentTable(@Nullable final MTL4ArgumentTable argumentTable) {
        try {
            MH_setArgumentTable_.invokeExact(this.handle, SEL_setArgumentTable_, argumentTable == null ? 0L : argumentTable.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4MachineLearningCommandEncoder dispatchNetworkWithIntermediatesHeap:]} */
    public void dispatchNetworkWithIntermediatesHeap(final MTLHeap heap) {
        try {
            MH_dispatchNetworkWithIntermediatesHeap_.invokeExact(this.handle, SEL_dispatchNetworkWithIntermediatesHeap_, heap.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
