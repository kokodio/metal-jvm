package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSRectEdge}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsrectedge">Apple documentation</a>
 */
public enum NSRectEdge {
    RectEdgeMinX(0L),
    RectEdgeMinY(1L),
    RectEdgeMaxX(2L),
    RectEdgeMaxY(3L),
    MinXEdge(0L),
    MinYEdge(1L),
    MaxXEdge(2L),
    MaxYEdge(3L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    NSRectEdge(final long value) {
        this.value = value;
    }

    public static NSRectEdge of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 0: return RectEdgeMinX;
                case 1: return RectEdgeMinY;
                case 2: return RectEdgeMaxX;
                case 3: return RectEdgeMaxY;
            }
        }
        throw new IllegalArgumentException("Unknown NSRectEdge: " + value);
    }
}
