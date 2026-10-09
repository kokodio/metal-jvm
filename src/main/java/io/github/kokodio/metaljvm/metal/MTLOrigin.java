package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLOrigin}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlorigin">Apple documentation</a>
 */
public record MTLOrigin(long x, long y, long z) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_LONG.withName("x"),
            ValueLayout.JAVA_LONG.withName("y"),
            ValueLayout.JAVA_LONG.withName("z")
    ).withName("MTLOrigin");

    public static MTLOrigin read(final MemorySegment segment) {
        return new MTLOrigin(
                segment.get(ValueLayout.JAVA_LONG, 0),
                segment.get(ValueLayout.JAVA_LONG, 8),
                segment.get(ValueLayout.JAVA_LONG, 16)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_LONG, 0, this.x);
        segment.set(ValueLayout.JAVA_LONG, 8, this.y);
        segment.set(ValueLayout.JAVA_LONG, 16, this.z);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
