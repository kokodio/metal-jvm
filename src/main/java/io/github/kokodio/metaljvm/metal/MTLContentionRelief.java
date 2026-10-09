package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLContentionRelief}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcontentionrelief">Apple documentation</a>
 */
public enum MTLContentionRelief {
    Automatic(0L),
    None(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLContentionRelief[] VALUES = values();

    public final long value;

    MTLContentionRelief(final long value) {
        this.value = value;
    }

    public static MTLContentionRelief of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLContentionRelief: " + value);
        }
        return VALUES[(int) value];
    }
}
