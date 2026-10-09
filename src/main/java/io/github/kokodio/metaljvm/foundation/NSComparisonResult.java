package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSComparisonResult}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/comparisonresult">Apple documentation</a>
 */
public enum NSComparisonResult {
    OrderedAscending(0xFFFFFFFFFFFFFFFFL),
    OrderedSame(0L),
    OrderedDescending(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    NSComparisonResult(final long value) {
        this.value = value;
    }

    public static NSComparisonResult of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case -1: return OrderedAscending;
                case 0: return OrderedSame;
                case 1: return OrderedDescending;
            }
        }
        throw new IllegalArgumentException("Unknown NSComparisonResult: " + value);
    }
}
