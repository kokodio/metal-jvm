package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code NSRange}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsrange-c.struct">Apple documentation</a>
 */
public record NSRange(long location, long length) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_LONG.withName("location"),
            ValueLayout.JAVA_LONG.withName("length")
    ).withName("NSRange");

    public static NSRange read(final MemorySegment segment) {
        return new NSRange(
                segment.get(ValueLayout.JAVA_LONG, 0),
                segment.get(ValueLayout.JAVA_LONG, 8)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_LONG, 0, this.location);
        segment.set(ValueLayout.JAVA_LONG, 8, this.length);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
