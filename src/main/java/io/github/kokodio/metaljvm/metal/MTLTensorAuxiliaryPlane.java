package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLTensorAuxiliaryPlane}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltensorauxiliaryplane">Apple documentation</a>
 */
public class MTLTensorAuxiliaryPlane extends NSObject {
    private static final long SEL_dataType = ObjC.selector("dataType");
    private static final MethodHandle MH_dataType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_blockFactors = ObjC.selector("blockFactors");
    private static final MethodHandle MH_blockFactors = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_buffer = ObjC.selector("buffer");
    private static final MethodHandle MH_buffer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bufferOffset = ObjC.selector("bufferOffset");
    private static final MethodHandle MH_bufferOffset = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_planeType = ObjC.selector("planeType");
    private static final MethodHandle MH_planeType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLTensorAuxiliaryPlane(final long handle) {
        super(handle);
    }

    /** {@code -[MTLTensorAuxiliaryPlane dataType]} */
    public MTLTensorDataType dataType() {
        try {
            return MTLTensorDataType.of((long) MH_dataType.invokeExact(this.handle, SEL_dataType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTensorAuxiliaryPlane blockFactors]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLTensorExtents blockFactors() {
        try {
            long result = (long) MH_blockFactors.invokeExact(this.handle, SEL_blockFactors);
            return new MTLTensorExtents(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLTensorAuxiliaryPlane buffer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLBuffer buffer() {
        try {
            long result = (long) MH_buffer.invokeExact(this.handle, SEL_buffer);
            return result == 0L ? null : new MTLBuffer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorAuxiliaryPlane bufferOffset]} */
    public long bufferOffset() {
        try {
            return (long) MH_bufferOffset.invokeExact(this.handle, SEL_bufferOffset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorAuxiliaryPlane planeType]} */
    public MTLTensorPlaneType planeType() {
        try {
            return MTLTensorPlaneType.of((long) MH_planeType.invokeExact(this.handle, SEL_planeType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
