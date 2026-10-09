package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLClearColor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlclearcolor">Apple documentation</a>
 */
public record MTLClearColor(double red, double green, double blue, double alpha) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_DOUBLE.withName("red"),
            ValueLayout.JAVA_DOUBLE.withName("green"),
            ValueLayout.JAVA_DOUBLE.withName("blue"),
            ValueLayout.JAVA_DOUBLE.withName("alpha")
    ).withName("MTLClearColor");

    public static MTLClearColor read(final MemorySegment segment) {
        return new MTLClearColor(
                segment.get(ValueLayout.JAVA_DOUBLE, 0),
                segment.get(ValueLayout.JAVA_DOUBLE, 8),
                segment.get(ValueLayout.JAVA_DOUBLE, 16),
                segment.get(ValueLayout.JAVA_DOUBLE, 24)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_DOUBLE, 0, this.red);
        segment.set(ValueLayout.JAVA_DOUBLE, 8, this.green);
        segment.set(ValueLayout.JAVA_DOUBLE, 16, this.blue);
        segment.set(ValueLayout.JAVA_DOUBLE, 24, this.alpha);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
