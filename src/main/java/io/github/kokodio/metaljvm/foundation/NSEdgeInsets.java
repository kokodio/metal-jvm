package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code NSEdgeInsets}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsedgeinsets">Apple documentation</a>
 */
public record NSEdgeInsets(double top, double left, double bottom, double right) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_DOUBLE.withName("top"),
            ValueLayout.JAVA_DOUBLE.withName("left"),
            ValueLayout.JAVA_DOUBLE.withName("bottom"),
            ValueLayout.JAVA_DOUBLE.withName("right")
    ).withName("NSEdgeInsets");

    public static NSEdgeInsets read(final MemorySegment segment) {
        return new NSEdgeInsets(
                segment.get(ValueLayout.JAVA_DOUBLE, 0),
                segment.get(ValueLayout.JAVA_DOUBLE, 8),
                segment.get(ValueLayout.JAVA_DOUBLE, 16),
                segment.get(ValueLayout.JAVA_DOUBLE, 24)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_DOUBLE, 0, this.top);
        segment.set(ValueLayout.JAVA_DOUBLE, 8, this.left);
        segment.set(ValueLayout.JAVA_DOUBLE, 16, this.bottom);
        segment.set(ValueLayout.JAVA_DOUBLE, 24, this.right);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
