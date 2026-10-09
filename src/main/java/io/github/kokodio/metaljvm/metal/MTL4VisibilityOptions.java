package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTL4VisibilityOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4visibilityoptions">Apple documentation</a>
 */
public final class MTL4VisibilityOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long None = 0L;
    public static final long Device = 1L;
    public static final long ResourceAlias = 2L;

    private MTL4VisibilityOptions() {
    }
}
