package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code NSSize}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nssize">Apple documentation</a>
 */
public record NSSize(double width, double height) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_DOUBLE.withName("width"),
            ValueLayout.JAVA_DOUBLE.withName("height")
    ).withName("NSSize");

    public static NSSize read(final MemorySegment segment) {
        return new NSSize(
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
