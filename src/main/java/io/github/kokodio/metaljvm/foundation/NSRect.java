package io.github.kokodio.metaljvm.foundation;

import io.github.kokodio.metaljvm.coregraphics.CGPoint;
import io.github.kokodio.metaljvm.coregraphics.CGSize;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code NSRect}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsrect">Apple documentation</a>
 */
public record NSRect(CGPoint origin, CGSize size) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            CGPoint.LAYOUT.withName("origin"),
            CGSize.LAYOUT.withName("size")
    ).withName("NSRect");

    public static NSRect read(final MemorySegment segment) {
        return new NSRect(
                CGPoint.read(segment.asSlice(0, CGPoint.LAYOUT)),
                CGSize.read(segment.asSlice(16, CGSize.LAYOUT))
        );
    }

    public void write(final MemorySegment segment) {
        this.origin.write(segment.asSlice(0, CGPoint.LAYOUT));
        this.size.write(segment.asSlice(16, CGSize.LAYOUT));
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
