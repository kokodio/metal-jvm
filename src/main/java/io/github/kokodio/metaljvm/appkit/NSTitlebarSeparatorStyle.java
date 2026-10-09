package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSTitlebarSeparatorStyle}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nstitlebarseparatorstyle">Apple documentation</a>
 */
public enum NSTitlebarSeparatorStyle {
    Automatic(0L),
    None(1L),
    Line(2L),
    Shadow(3L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final NSTitlebarSeparatorStyle[] VALUES = values();

    public final long value;

    NSTitlebarSeparatorStyle(final long value) {
        this.value = value;
    }

    public static NSTitlebarSeparatorStyle of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown NSTitlebarSeparatorStyle: " + value);
        }
        return VALUES[(int) value];
    }
}
