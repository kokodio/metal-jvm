package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;
import java.util.Arrays;

/**
 * {@code MTLStageInRegionIndirectArguments}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlstageinregionindirectarguments">Apple documentation</a>
 */
public record MTLStageInRegionIndirectArguments(int[] stageInOrigin, int[] stageInSize) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("stageInOrigin"),
            MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("stageInSize")
    ).withName("MTLStageInRegionIndirectArguments");

    public static MTLStageInRegionIndirectArguments read(final MemorySegment segment) {
        return new MTLStageInRegionIndirectArguments(
                segment.asSlice(0, 12).toArray(ValueLayout.JAVA_INT),
                segment.asSlice(12, 12).toArray(ValueLayout.JAVA_INT)
        );
    }

    public void write(final MemorySegment segment) {
        MemorySegment.copy(this.stageInOrigin, 0, segment, ValueLayout.JAVA_INT, 0, 3);
        MemorySegment.copy(this.stageInSize, 0, segment, ValueLayout.JAVA_INT, 12, 3);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }

    @Override
    public boolean equals(final Object other) {
        return other instanceof MTLStageInRegionIndirectArguments that
                && Arrays.equals(this.stageInOrigin, that.stageInOrigin)
                && Arrays.equals(this.stageInSize, that.stageInSize);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(this.stageInOrigin);
        result = 31 * result + Arrays.hashCode(this.stageInSize);
        return result;
    }
}
