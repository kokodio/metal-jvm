package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLResourceID}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlresourceid">Apple documentation</a>
 */
public record MTLResourceID(long _impl) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_LONG.withName("_impl")
    ).withName("MTLResourceID");

    public static MTLResourceID read(final MemorySegment segment) {
        return new MTLResourceID(
                segment.get(ValueLayout.JAVA_LONG, 0)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_LONG, 0, this._impl);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
