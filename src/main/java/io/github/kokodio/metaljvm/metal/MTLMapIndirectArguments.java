package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLMapIndirectArguments}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlmapindirectarguments">Apple documentation</a>
 */
public record MTLMapIndirectArguments(int regionOriginX, int regionOriginY, int regionOriginZ, int regionSizeWidth, int regionSizeHeight, int regionSizeDepth, int mipMapLevel, int sliceId) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("regionOriginX"),
            ValueLayout.JAVA_INT.withName("regionOriginY"),
            ValueLayout.JAVA_INT.withName("regionOriginZ"),
            ValueLayout.JAVA_INT.withName("regionSizeWidth"),
            ValueLayout.JAVA_INT.withName("regionSizeHeight"),
            ValueLayout.JAVA_INT.withName("regionSizeDepth"),
            ValueLayout.JAVA_INT.withName("mipMapLevel"),
            ValueLayout.JAVA_INT.withName("sliceId")
    ).withName("MTLMapIndirectArguments");

    public static MTLMapIndirectArguments read(final MemorySegment segment) {
        return new MTLMapIndirectArguments(
                segment.get(ValueLayout.JAVA_INT, 0),
                segment.get(ValueLayout.JAVA_INT, 4),
                segment.get(ValueLayout.JAVA_INT, 8),
                segment.get(ValueLayout.JAVA_INT, 12),
                segment.get(ValueLayout.JAVA_INT, 16),
                segment.get(ValueLayout.JAVA_INT, 20),
                segment.get(ValueLayout.JAVA_INT, 24),
                segment.get(ValueLayout.JAVA_INT, 28)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_INT, 0, this.regionOriginX);
        segment.set(ValueLayout.JAVA_INT, 4, this.regionOriginY);
        segment.set(ValueLayout.JAVA_INT, 8, this.regionOriginZ);
        segment.set(ValueLayout.JAVA_INT, 12, this.regionSizeWidth);
        segment.set(ValueLayout.JAVA_INT, 16, this.regionSizeHeight);
        segment.set(ValueLayout.JAVA_INT, 20, this.regionSizeDepth);
        segment.set(ValueLayout.JAVA_INT, 24, this.mipMapLevel);
        segment.set(ValueLayout.JAVA_INT, 28, this.sliceId);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
