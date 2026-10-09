package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;
import java.util.Arrays;

/**
 * {@code MTLQuadTessellationFactorsHalf}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlquadtessellationfactorshalf">Apple documentation</a>
 */
public record MTLQuadTessellationFactorsHalf(short[] edgeTessellationFactor, short[] insideTessellationFactor) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_SHORT).withName("edgeTessellationFactor"),
            MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_SHORT).withName("insideTessellationFactor")
    ).withName("MTLQuadTessellationFactorsHalf");

    public static MTLQuadTessellationFactorsHalf read(final MemorySegment segment) {
        return new MTLQuadTessellationFactorsHalf(
                segment.asSlice(0, 8).toArray(ValueLayout.JAVA_SHORT),
                segment.asSlice(8, 4).toArray(ValueLayout.JAVA_SHORT)
        );
    }

    public void write(final MemorySegment segment) {
        MemorySegment.copy(this.edgeTessellationFactor, 0, segment, ValueLayout.JAVA_SHORT, 0, 4);
        MemorySegment.copy(this.insideTessellationFactor, 0, segment, ValueLayout.JAVA_SHORT, 8, 2);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }

    @Override
    public boolean equals(final Object other) {
        return other instanceof MTLQuadTessellationFactorsHalf that
                && Arrays.equals(this.edgeTessellationFactor, that.edgeTessellationFactor)
                && Arrays.equals(this.insideTessellationFactor, that.insideTessellationFactor);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(this.edgeTessellationFactor);
        result = 31 * result + Arrays.hashCode(this.insideTessellationFactor);
        return result;
    }
}
