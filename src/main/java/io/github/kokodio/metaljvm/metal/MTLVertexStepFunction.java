package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLVertexStepFunction}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlvertexstepfunction">Apple documentation</a>
 */
public enum MTLVertexStepFunction {
    Constant(0L),
    PerVertex(1L),
    PerInstance(2L),
    PerPatch(3L),
    PerPatchControlPoint(4L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLVertexStepFunction[] VALUES = values();

    public final long value;

    MTLVertexStepFunction(final long value) {
        this.value = value;
    }

    public static MTLVertexStepFunction of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLVertexStepFunction: " + value);
        }
        return VALUES[(int) value];
    }
}
