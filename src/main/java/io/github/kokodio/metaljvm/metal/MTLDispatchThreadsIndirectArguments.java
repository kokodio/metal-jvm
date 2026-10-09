package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;
import java.util.Arrays;

/**
 * {@code MTLDispatchThreadsIndirectArguments}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtldispatchthreadsindirectarguments">Apple documentation</a>
 */
public record MTLDispatchThreadsIndirectArguments(int[] threadsPerGrid, int[] threadsPerThreadgroup) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("threadsPerGrid"),
            MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("threadsPerThreadgroup")
    ).withName("MTLDispatchThreadsIndirectArguments");

    public static MTLDispatchThreadsIndirectArguments read(final MemorySegment segment) {
        return new MTLDispatchThreadsIndirectArguments(
                segment.asSlice(0, 12).toArray(ValueLayout.JAVA_INT),
                segment.asSlice(12, 12).toArray(ValueLayout.JAVA_INT)
        );
    }

    public void write(final MemorySegment segment) {
        MemorySegment.copy(this.threadsPerGrid, 0, segment, ValueLayout.JAVA_INT, 0, 3);
        MemorySegment.copy(this.threadsPerThreadgroup, 0, segment, ValueLayout.JAVA_INT, 12, 3);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }

    @Override
    public boolean equals(final Object other) {
        return other instanceof MTLDispatchThreadsIndirectArguments that
                && Arrays.equals(this.threadsPerGrid, that.threadsPerGrid)
                && Arrays.equals(this.threadsPerThreadgroup, that.threadsPerThreadgroup);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(this.threadsPerGrid);
        result = 31 * result + Arrays.hashCode(this.threadsPerThreadgroup);
        return result;
    }
}
