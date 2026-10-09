package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;
import java.util.Arrays;

/**
 * {@code NSDecimal}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/decimal">Apple documentation</a>
 */
public record NSDecimal(int _exponent, int _length, int _isNegative, int _isCompact, int _reserved, short[] _mantissa) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("_exponent"),
            ValueLayout.JAVA_INT.withName("_length"),
            ValueLayout.JAVA_INT.withName("_isNegative"),
            ValueLayout.JAVA_INT.withName("_isCompact"),
            ValueLayout.JAVA_INT.withName("_reserved"),
            MemoryLayout.sequenceLayout(8, ValueLayout.JAVA_SHORT).withName("_mantissa")
    ).withName("NSDecimal");

    public static NSDecimal read(final MemorySegment segment) {
        return new NSDecimal(
                segment.get(ValueLayout.JAVA_INT, 0),
                segment.get(ValueLayout.JAVA_INT, 4),
                segment.get(ValueLayout.JAVA_INT, 8),
                segment.get(ValueLayout.JAVA_INT, 12),
                segment.get(ValueLayout.JAVA_INT, 16),
                segment.asSlice(20, 16).toArray(ValueLayout.JAVA_SHORT)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_INT, 0, this._exponent);
        segment.set(ValueLayout.JAVA_INT, 4, this._length);
        segment.set(ValueLayout.JAVA_INT, 8, this._isNegative);
        segment.set(ValueLayout.JAVA_INT, 12, this._isCompact);
        segment.set(ValueLayout.JAVA_INT, 16, this._reserved);
        MemorySegment.copy(this._mantissa, 0, segment, ValueLayout.JAVA_SHORT, 20, 8);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }

    @Override
    public boolean equals(final Object other) {
        return other instanceof NSDecimal that
                && this._exponent == that._exponent
                && this._length == that._length
                && this._isNegative == that._isNegative
                && this._isCompact == that._isCompact
                && this._reserved == that._reserved
                && Arrays.equals(this._mantissa, that._mantissa);
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(this._exponent);
        result = 31 * result + Integer.hashCode(this._length);
        result = 31 * result + Integer.hashCode(this._isNegative);
        result = 31 * result + Integer.hashCode(this._isCompact);
        result = 31 * result + Integer.hashCode(this._reserved);
        result = 31 * result + Arrays.hashCode(this._mantissa);
        return result;
    }
}
