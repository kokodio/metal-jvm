package io.github.kokodio.metaljvm.coregraphics;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code CGAffineTransform}
 *
 * @see <a href="https://developer.apple.com/documentation/corefoundation/cgaffinetransform">Apple documentation</a>
 */
public record CGAffineTransform(double a, double b, double c, double d, double tx, double ty) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_DOUBLE.withName("a"),
            ValueLayout.JAVA_DOUBLE.withName("b"),
            ValueLayout.JAVA_DOUBLE.withName("c"),
            ValueLayout.JAVA_DOUBLE.withName("d"),
            ValueLayout.JAVA_DOUBLE.withName("tx"),
            ValueLayout.JAVA_DOUBLE.withName("ty")
    ).withName("CGAffineTransform");

    public static CGAffineTransform read(final MemorySegment segment) {
        return new CGAffineTransform(
                segment.get(ValueLayout.JAVA_DOUBLE, 0),
                segment.get(ValueLayout.JAVA_DOUBLE, 8),
                segment.get(ValueLayout.JAVA_DOUBLE, 16),
                segment.get(ValueLayout.JAVA_DOUBLE, 24),
                segment.get(ValueLayout.JAVA_DOUBLE, 32),
                segment.get(ValueLayout.JAVA_DOUBLE, 40)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_DOUBLE, 0, this.a);
        segment.set(ValueLayout.JAVA_DOUBLE, 8, this.b);
        segment.set(ValueLayout.JAVA_DOUBLE, 16, this.c);
        segment.set(ValueLayout.JAVA_DOUBLE, 24, this.d);
        segment.set(ValueLayout.JAVA_DOUBLE, 32, this.tx);
        segment.set(ValueLayout.JAVA_DOUBLE, 40, this.ty);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
