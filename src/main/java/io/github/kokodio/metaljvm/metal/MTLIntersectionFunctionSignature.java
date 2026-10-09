package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLIntersectionFunctionSignature}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlintersectionfunctionsignature">Apple documentation</a>
 */
public final class MTLIntersectionFunctionSignature {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long None = 0L;
    public static final long Instancing = 1L;
    public static final long TriangleData = 2L;
    public static final long WorldSpaceData = 4L;
    public static final long InstanceMotion = 8L;
    public static final long PrimitiveMotion = 16L;
    public static final long ExtendedLimits = 32L;
    public static final long MaxLevels = 64L;
    public static final long CurveData = 128L;
    public static final long IntersectionFunctionBuffer = 256L;
    public static final long UserData = 512L;

    private MTLIntersectionFunctionSignature() {
    }
}
