package io.github.kokodio.metaljvm.coregraphics;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code CGSize}
 *
 * @see <a href="https://developer.apple.com/documentation/corefoundation/cgsize">Apple documentation</a>
 */
public record CGSize(double width, double height) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_DOUBLE.withName("width"),
            ValueLayout.JAVA_DOUBLE.withName("height")
    ).withName("CGSize");

    public static CGSize read(final MemorySegment segment) {
        return new CGSize(
                segment.get(ValueLayout.JAVA_DOUBLE, 0),
                segment.get(ValueLayout.JAVA_DOUBLE, 8)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_DOUBLE, 0, this.width);
        segment.set(ValueLayout.JAVA_DOUBLE, 8, this.height);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
