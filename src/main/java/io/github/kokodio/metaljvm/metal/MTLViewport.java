package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLViewport}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlviewport">Apple documentation</a>
 */
public record MTLViewport(double originX, double originY, double width, double height, double znear, double zfar) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_DOUBLE.withName("originX"),
            ValueLayout.JAVA_DOUBLE.withName("originY"),
            ValueLayout.JAVA_DOUBLE.withName("width"),
            ValueLayout.JAVA_DOUBLE.withName("height"),
            ValueLayout.JAVA_DOUBLE.withName("znear"),
            ValueLayout.JAVA_DOUBLE.withName("zfar")
    ).withName("MTLViewport");

    public static MTLViewport read(final MemorySegment segment) {
        return new MTLViewport(
                segment.get(ValueLayout.JAVA_DOUBLE, 0),
                segment.get(ValueLayout.JAVA_DOUBLE, 8),
                segment.get(ValueLayout.JAVA_DOUBLE, 16),
                segment.get(ValueLayout.JAVA_DOUBLE, 24),
                segment.get(ValueLayout.JAVA_DOUBLE, 32),
                segment.get(ValueLayout.JAVA_DOUBLE, 40)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_DOUBLE, 0, this.originX);
        segment.set(ValueLayout.JAVA_DOUBLE, 8, this.originY);
        segment.set(ValueLayout.JAVA_DOUBLE, 16, this.width);
        segment.set(ValueLayout.JAVA_DOUBLE, 24, this.height);
        segment.set(ValueLayout.JAVA_DOUBLE, 32, this.znear);
        segment.set(ValueLayout.JAVA_DOUBLE, 40, this.zfar);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
