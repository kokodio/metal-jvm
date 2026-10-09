package io.github.kokodio.metaljvm.quartzcore;

import io.github.kokodio.metaljvm.metal.MTLDrawable;
import io.github.kokodio.metaljvm.metal.MTLTexture;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code CAMetalDrawable}
 *
 * @see <a href="https://developer.apple.com/documentation/quartzcore/cametaldrawable">Apple documentation</a>
 */
public class CAMetalDrawable extends MTLDrawable {
    private static final long SEL_texture = ObjC.selector("texture");
    private static final MethodHandle MH_texture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_layer = ObjC.selector("layer");
    private static final MethodHandle MH_layer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public CAMetalDrawable(final long handle) {
        super(handle);
    }

    /**
     * {@code -[CAMetalDrawable texture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLTexture texture() {
        try {
            long result = (long) MH_texture.invokeExact(this.handle, SEL_texture);
            return new MTLTexture(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CAMetalDrawable layer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public CAMetalLayer layer() {
        try {
            long result = (long) MH_layer.invokeExact(this.handle, SEL_layer);
            return new CAMetalLayer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
