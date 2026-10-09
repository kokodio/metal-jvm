package io.github.kokodio.metaljvm.coregraphics;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code CGPoint}
 *
 * @see <a href="https://developer.apple.com/documentation/corefoundation/cgpoint">Apple documentation</a>
 */
public record CGPoint(double x, double y) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_DOUBLE.withName("x"),
            ValueLayout.JAVA_DOUBLE.withName("y")
    ).withName("CGPoint");

    public static CGPoint read(final MemorySegment segment) {
        return new CGPoint(
                segment.get(ValueLayout.JAVA_DOUBLE, 0),
                segment.get(ValueLayout.JAVA_DOUBLE, 8)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_DOUBLE, 0, this.x);
        segment.set(ValueLayout.JAVA_DOUBLE, 8, this.y);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
