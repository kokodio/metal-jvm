package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;
import java.util.Arrays;

/**
 * {@code MTLTriangleTessellationFactorsHalf}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltriangletessellationfactorshalf">Apple documentation</a>
 */
public record MTLTriangleTessellationFactorsHalf(short[] edgeTessellationFactor, short insideTessellationFactor) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_SHORT).withName("edgeTessellationFactor"),
            ValueLayout.JAVA_SHORT.withName("insideTessellationFactor")
    ).withName("MTLTriangleTessellationFactorsHalf");

    public static MTLTriangleTessellationFactorsHalf read(final MemorySegment segment) {
        return new MTLTriangleTessellationFactorsHalf(
                segment.asSlice(0, 6).toArray(ValueLayout.JAVA_SHORT),
                segment.get(ValueLayout.JAVA_SHORT, 6)
        );
    }

    public void write(final MemorySegment segment) {
        MemorySegment.copy(this.edgeTessellationFactor, 0, segment, ValueLayout.JAVA_SHORT, 0, 3);
        segment.set(ValueLayout.JAVA_SHORT, 6, this.insideTessellationFactor);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }

    @Override
    public boolean equals(final Object other) {
        return other instanceof MTLTriangleTessellationFactorsHalf that
                && Arrays.equals(this.edgeTessellationFactor, that.edgeTessellationFactor)
                && this.insideTessellationFactor == that.insideTessellationFactor;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(this.edgeTessellationFactor);
        result = 31 * result + Short.hashCode(this.insideTessellationFactor);
        return result;
    }
}
