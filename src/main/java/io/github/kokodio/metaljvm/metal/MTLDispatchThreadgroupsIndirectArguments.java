package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;
import java.util.Arrays;

/**
 * {@code MTLDispatchThreadgroupsIndirectArguments}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtldispatchthreadgroupsindirectarguments">Apple documentation</a>
 */
public record MTLDispatchThreadgroupsIndirectArguments(int[] threadgroupsPerGrid) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("threadgroupsPerGrid")
    ).withName("MTLDispatchThreadgroupsIndirectArguments");

    public static MTLDispatchThreadgroupsIndirectArguments read(final MemorySegment segment) {
        return new MTLDispatchThreadgroupsIndirectArguments(
                segment.asSlice(0, 12).toArray(ValueLayout.JAVA_INT)
        );
    }

    public void write(final MemorySegment segment) {
        MemorySegment.copy(this.threadgroupsPerGrid, 0, segment, ValueLayout.JAVA_INT, 0, 3);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }

    @Override
    public boolean equals(final Object other) {
        return other instanceof MTLDispatchThreadgroupsIndirectArguments that
                && Arrays.equals(this.threadgroupsPerGrid, that.threadgroupsPerGrid);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(this.threadgroupsPerGrid);
        return result;
    }
}
