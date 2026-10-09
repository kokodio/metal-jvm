package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSDisplayGamut}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nsdisplaygamut">Apple documentation</a>
 */
public enum NSDisplayGamut {
    SRGB(1L),
    P3(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    NSDisplayGamut(final long value) {
        this.value = value;
    }

    public static NSDisplayGamut of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 1: return SRGB;
                case 2: return P3;
            }
        }
        throw new IllegalArgumentException("Unknown NSDisplayGamut: " + value);
    }
}
