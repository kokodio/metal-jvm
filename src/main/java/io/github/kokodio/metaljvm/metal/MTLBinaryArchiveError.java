package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLBinaryArchiveError}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlbinaryarchiveerror-swift.struct/code">Apple documentation</a>
 */
public enum MTLBinaryArchiveError {
    None(0L),
    InvalidFile(1L),
    UnexpectedElement(2L),
    CompilationFailure(3L),
    InternalError(4L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLBinaryArchiveError[] VALUES = values();

    public final long value;

    MTLBinaryArchiveError(final long value) {
        this.value = value;
    }

    public static MTLBinaryArchiveError of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLBinaryArchiveError: " + value);
        }
        return VALUES[(int) value];
    }
}
