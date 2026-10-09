package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSProcessInfoThermalState}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/processinfo/thermalstate-swift.enum">Apple documentation</a>
 */
public enum NSProcessInfoThermalState {
    Nominal(0L),
    Fair(1L),
    Serious(2L),
    Critical(3L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final NSProcessInfoThermalState[] VALUES = values();

    public final long value;

    NSProcessInfoThermalState(final long value) {
        this.value = value;
    }

    public static NSProcessInfoThermalState of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown NSProcessInfoThermalState: " + value);
        }
        return VALUES[(int) value];
    }
}
