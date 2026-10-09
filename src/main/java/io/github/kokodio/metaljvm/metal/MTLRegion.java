package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLRegion}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlregion">Apple documentation</a>
 */
public record MTLRegion(MTLOrigin origin, MTLSize size) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            MTLOrigin.LAYOUT.withName("origin"),
            MTLSize.LAYOUT.withName("size")
    ).withName("MTLRegion");

    public static MTLRegion read(final MemorySegment segment) {
        return new MTLRegion(
                MTLOrigin.read(segment.asSlice(0, MTLOrigin.LAYOUT)),
                MTLSize.read(segment.asSlice(24, MTLSize.LAYOUT))
        );
    }

    public void write(final MemorySegment segment) {
        this.origin.write(segment.asSlice(0, MTLOrigin.LAYOUT));
        this.size.write(segment.asSlice(24, MTLSize.LAYOUT));
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
