package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLCounterResultStatistic}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcounterresultstatistic">Apple documentation</a>
 */
public record MTLCounterResultStatistic(long tessellationInputPatches, long vertexInvocations, long postTessellationVertexInvocations, long clipperInvocations, long clipperPrimitivesOut, long fragmentInvocations, long fragmentsPassed, long computeKernelInvocations) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_LONG.withName("tessellationInputPatches"),
            ValueLayout.JAVA_LONG.withName("vertexInvocations"),
            ValueLayout.JAVA_LONG.withName("postTessellationVertexInvocations"),
            ValueLayout.JAVA_LONG.withName("clipperInvocations"),
            ValueLayout.JAVA_LONG.withName("clipperPrimitivesOut"),
            ValueLayout.JAVA_LONG.withName("fragmentInvocations"),
            ValueLayout.JAVA_LONG.withName("fragmentsPassed"),
            ValueLayout.JAVA_LONG.withName("computeKernelInvocations")
    ).withName("MTLCounterResultStatistic");

    public static MTLCounterResultStatistic read(final MemorySegment segment) {
        return new MTLCounterResultStatistic(
                segment.get(ValueLayout.JAVA_LONG, 0),
                segment.get(ValueLayout.JAVA_LONG, 8),
                segment.get(ValueLayout.JAVA_LONG, 16),
                segment.get(ValueLayout.JAVA_LONG, 24),
                segment.get(ValueLayout.JAVA_LONG, 32),
                segment.get(ValueLayout.JAVA_LONG, 40),
                segment.get(ValueLayout.JAVA_LONG, 48),
                segment.get(ValueLayout.JAVA_LONG, 56)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_LONG, 0, this.tessellationInputPatches);
        segment.set(ValueLayout.JAVA_LONG, 8, this.vertexInvocations);
        segment.set(ValueLayout.JAVA_LONG, 16, this.postTessellationVertexInvocations);
        segment.set(ValueLayout.JAVA_LONG, 24, this.clipperInvocations);
        segment.set(ValueLayout.JAVA_LONG, 32, this.clipperPrimitivesOut);
        segment.set(ValueLayout.JAVA_LONG, 40, this.fragmentInvocations);
        segment.set(ValueLayout.JAVA_LONG, 48, this.fragmentsPassed);
        segment.set(ValueLayout.JAVA_LONG, 56, this.computeKernelInvocations);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
