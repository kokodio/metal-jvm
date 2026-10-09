package io.github.kokodio.metaljvm.metalfx;

import io.github.kokodio.metaljvm.metal.MTL4CommandBuffer;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4FXTemporalScaler}
 *
 * @see <a href="https://developer.apple.com/documentation/metalfx/mtl4fxtemporalscaler">Apple documentation</a>
 */
public class MTL4FXTemporalScaler extends MTLFXTemporalScalerBase {
    private static final long SEL_encodeToCommandBuffer_ = ObjC.selector("encodeToCommandBuffer:");
    private static final MethodHandle MH_encodeToCommandBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTL4FXTemporalScaler(final long handle) {
        super(handle);
    }

    /** {@code -[MTL4FXTemporalScaler encodeToCommandBuffer:]} */
    public void encodeToCommandBuffer(final MTL4CommandBuffer commandBuffer) {
        try {
            MH_encodeToCommandBuffer_.invokeExact(this.handle, SEL_encodeToCommandBuffer_, commandBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
