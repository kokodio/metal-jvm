package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLTessellationFactorStepFunction}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltessellationfactorstepfunction">Apple documentation</a>
 */
public enum MTLTessellationFactorStepFunction {
    Constant(0L),
    PerPatch(1L),
    PerInstance(2L),
    PerPatchAndPerInstance(3L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLTessellationFactorStepFunction[] VALUES = values();

    public final long value;

    MTLTessellationFactorStepFunction(final long value) {
        this.value = value;
    }

    public static MTLTessellationFactorStepFunction of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLTessellationFactorStepFunction: " + value);
        }
        return VALUES[(int) value];
    }
}
