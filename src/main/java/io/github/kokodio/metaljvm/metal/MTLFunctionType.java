package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLFunctionType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlfunctiontype">Apple documentation</a>
 */
public enum MTLFunctionType {
    Vertex(1L),
    Fragment(2L),
    Kernel(3L),
    Visible(5L),
    Intersection(6L),
    Mesh(7L),
    Object(8L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    MTLFunctionType(final long value) {
        this.value = value;
    }

    public static MTLFunctionType of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 1: return Vertex;
                case 2: return Fragment;
                case 3: return Kernel;
                case 5: return Visible;
                case 6: return Intersection;
                case 7: return Mesh;
                case 8: return Object;
            }
        }
        throw new IllegalArgumentException("Unknown MTLFunctionType: " + value);
    }
}
