package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLColorWriteMask}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcolorwritemask">Apple documentation</a>
 */
public final class MTLColorWriteMask {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long None = 0L;
    public static final long Red = 8L;
    public static final long Green = 4L;
    public static final long Blue = 2L;
    public static final long Alpha = 1L;
    public static final long All = 15L;
    public static final long Unspecialized = 16L;

    private MTLColorWriteMask() {
    }
}
