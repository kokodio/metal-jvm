package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLDynamicLibraryError}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtldynamiclibraryerror-swift.struct/code">Apple documentation</a>
 */
public enum MTLDynamicLibraryError {
    None(0L),
    InvalidFile(1L),
    CompilationFailure(2L),
    UnresolvedInstallName(3L),
    DependencyLoadFailure(4L),
    Unsupported(5L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLDynamicLibraryError[] VALUES = values();

    public final long value;

    MTLDynamicLibraryError(final long value) {
        this.value = value;
    }

    public static MTLDynamicLibraryError of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLDynamicLibraryError: " + value);
        }
        return VALUES[(int) value];
    }
}
