package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLSamplePosition}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlsampleposition">Apple documentation</a>
 */
public record MTLSamplePosition(float x, float y) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_FLOAT.withName("x"),
            ValueLayout.JAVA_FLOAT.withName("y")
    ).withName("MTLSamplePosition");

    public static MTLSamplePosition read(final MemorySegment segment) {
        return new MTLSamplePosition(
                segment.get(ValueLayout.JAVA_FLOAT, 0),
                segment.get(ValueLayout.JAVA_FLOAT, 4)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_FLOAT, 0, this.x);
        segment.set(ValueLayout.JAVA_FLOAT, 4, this.y);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
