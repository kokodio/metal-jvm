package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLLibraryError}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtllibraryerror-swift.struct/code">Apple documentation</a>
 */
public enum MTLLibraryError {
    Unsupported(1L),
    Internal(2L),
    CompileFailure(3L),
    CompileWarning(4L),
    FunctionNotFound(5L),
    FileNotFound(6L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    MTLLibraryError(final long value) {
        this.value = value;
    }

    public static MTLLibraryError of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 1: return Unsupported;
                case 2: return Internal;
                case 3: return CompileFailure;
                case 4: return CompileWarning;
                case 5: return FunctionNotFound;
                case 6: return FileNotFound;
            }
        }
        throw new IllegalArgumentException("Unknown MTLLibraryError: " + value);
    }
}
