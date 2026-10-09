package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSWindowOrderingMode}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nswindow/orderingmode">Apple documentation</a>
 */
public enum NSWindowOrderingMode {
    Above(1L),
    Below(0xFFFFFFFFFFFFFFFFL),
    Out(0L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    NSWindowOrderingMode(final long value) {
        this.value = value;
    }

    public static NSWindowOrderingMode of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 1: return Above;
                case -1: return Below;
                case 0: return Out;
            }
        }
        throw new IllegalArgumentException("Unknown NSWindowOrderingMode: " + value);
    }
}
