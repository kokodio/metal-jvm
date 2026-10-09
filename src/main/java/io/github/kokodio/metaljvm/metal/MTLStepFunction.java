package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLStepFunction}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlstepfunction">Apple documentation</a>
 */
public enum MTLStepFunction {
    Constant(0L),
    PerVertex(1L),
    PerInstance(2L),
    PerPatch(3L),
    PerPatchControlPoint(4L),
    ThreadPositionInGridX(5L),
    ThreadPositionInGridY(6L),
    ThreadPositionInGridXIndexed(7L),
    ThreadPositionInGridYIndexed(8L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLStepFunction[] VALUES = values();

    public final long value;

    MTLStepFunction(final long value) {
        this.value = value;
    }

    public static MTLStepFunction of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLStepFunction: " + value);
        }
        return VALUES[(int) value];
    }
}
