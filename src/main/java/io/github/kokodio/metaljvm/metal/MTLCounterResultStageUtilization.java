package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLCounterResultStageUtilization}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcounterresultstageutilization">Apple documentation</a>
 */
public record MTLCounterResultStageUtilization(long totalCycles, long vertexCycles, long tessellationCycles, long postTessellationVertexCycles, long fragmentCycles, long renderTargetCycles) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_LONG.withName("totalCycles"),
            ValueLayout.JAVA_LONG.withName("vertexCycles"),
            ValueLayout.JAVA_LONG.withName("tessellationCycles"),
            ValueLayout.JAVA_LONG.withName("postTessellationVertexCycles"),
            ValueLayout.JAVA_LONG.withName("fragmentCycles"),
            ValueLayout.JAVA_LONG.withName("renderTargetCycles")
    ).withName("MTLCounterResultStageUtilization");

    public static MTLCounterResultStageUtilization read(final MemorySegment segment) {
        return new MTLCounterResultStageUtilization(
                segment.get(ValueLayout.JAVA_LONG, 0),
                segment.get(ValueLayout.JAVA_LONG, 8),
                segment.get(ValueLayout.JAVA_LONG, 16),
                segment.get(ValueLayout.JAVA_LONG, 24),
                segment.get(ValueLayout.JAVA_LONG, 32),
                segment.get(ValueLayout.JAVA_LONG, 40)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_LONG, 0, this.totalCycles);
        segment.set(ValueLayout.JAVA_LONG, 8, this.vertexCycles);
        segment.set(ValueLayout.JAVA_LONG, 16, this.tessellationCycles);
        segment.set(ValueLayout.JAVA_LONG, 24, this.postTessellationVertexCycles);
        segment.set(ValueLayout.JAVA_LONG, 32, this.fragmentCycles);
        segment.set(ValueLayout.JAVA_LONG, 40, this.renderTargetCycles);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
