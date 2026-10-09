package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLTextureUsage}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltextureusage">Apple documentation</a>
 */
public final class MTLTextureUsage {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long Unknown = 0L;
    public static final long ShaderRead = 1L;
    public static final long ShaderWrite = 2L;
    public static final long RenderTarget = 4L;
    public static final long PixelFormatView = 16L;
    public static final long ShaderAtomic = 32L;

    private MTLTextureUsage() {
    }
}
