package io.github.kokodio.metaljvm.metalfx;

import io.github.kokodio.metaljvm.metal.MTLCommandBuffer;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLFXFrameInterpolator}
 *
 * @see <a href="https://developer.apple.com/documentation/metalfx/mtlfxframeinterpolator">Apple documentation</a>
 */
public class MTLFXFrameInterpolator extends MTLFXFrameInterpolatorBase {
    private static final long SEL_encodeToCommandBuffer_ = ObjC.selector("encodeToCommandBuffer:");
    private static final MethodHandle MH_encodeToCommandBuffer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLFXFrameInterpolator(final long handle) {
        super(handle);
    }

    /** {@code -[MTLFXFrameInterpolator encodeToCommandBuffer:]} */
    public void encodeToCommandBuffer(final MTLCommandBuffer commandBuffer) {
        try {
            MH_encodeToCommandBuffer_.invokeExact(this.handle, SEL_encodeToCommandBuffer_, commandBuffer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
