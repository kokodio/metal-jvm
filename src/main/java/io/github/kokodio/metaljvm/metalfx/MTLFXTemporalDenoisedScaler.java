package io.github.kokodio.metaljvm.metalfx;

import io.github.kokodio.metaljvm.metal.MTLCommandBuffer;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLFXTemporalDenoisedScaler}
 *
 * @see <a href="https://developer.apple.com/documentation/metalfx/mtlfxtemporaldenoisedscaler">Apple documentation</a>
 */
public class MTLFXTemporalDenoisedScaler extends MTLFXTemporalDenoisedScalerBase {
    private static final long SEL_encodeToCommandBuffer_ = ObjC.selector("encodeToCommandBuffer:");
    private static final MethodHandle MH_encodeToCommandBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLFXTemporalDenoisedScaler(final long handle) {
        super(handle);
    }

    /** {@code -[MTLFXTemporalDenoisedScaler encodeToCommandBuffer:]} */
    public void encodeToCommandBuffer(final MTLCommandBuffer commandBuffer) {
        try {
            MH_encodeToCommandBuffer_.invokeExact(this.handle, SEL_encodeToCommandBuffer_, commandBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
