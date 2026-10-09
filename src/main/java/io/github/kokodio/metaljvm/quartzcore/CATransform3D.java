package io.github.kokodio.metaljvm.quartzcore;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code CATransform3D}
 *
 * @see <a href="https://developer.apple.com/documentation/quartzcore/catransform3d">Apple documentation</a>
 */
public record CATransform3D(double m11, double m12, double m13, double m14, double m21, double m22, double m23, double m24, double m31, double m32, double m33, double m34, double m41, double m42, double m43, double m44) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_DOUBLE.withName("m11"),
            ValueLayout.JAVA_DOUBLE.withName("m12"),
            ValueLayout.JAVA_DOUBLE.withName("m13"),
            ValueLayout.JAVA_DOUBLE.withName("m14"),
            ValueLayout.JAVA_DOUBLE.withName("m21"),
            ValueLayout.JAVA_DOUBLE.withName("m22"),
            ValueLayout.JAVA_DOUBLE.withName("m23"),
            ValueLayout.JAVA_DOUBLE.withName("m24"),
            ValueLayout.JAVA_DOUBLE.withName("m31"),
            ValueLayout.JAVA_DOUBLE.withName("m32"),
            ValueLayout.JAVA_DOUBLE.withName("m33"),
            ValueLayout.JAVA_DOUBLE.withName("m34"),
            ValueLayout.JAVA_DOUBLE.withName("m41"),
            ValueLayout.JAVA_DOUBLE.withName("m42"),
            ValueLayout.JAVA_DOUBLE.withName("m43"),
            ValueLayout.JAVA_DOUBLE.withName("m44")
    ).withName("CATransform3D");

    public static CATransform3D read(final MemorySegment segment) {
        return new CATransform3D(
                segment.get(ValueLayout.JAVA_DOUBLE, 0),
                segment.get(ValueLayout.JAVA_DOUBLE, 8),
                segment.get(ValueLayout.JAVA_DOUBLE, 16),
                segment.get(ValueLayout.JAVA_DOUBLE, 24),
                segment.get(ValueLayout.JAVA_DOUBLE, 32),
                segment.get(ValueLayout.JAVA_DOUBLE, 40),
                segment.get(ValueLayout.JAVA_DOUBLE, 48),
                segment.get(ValueLayout.JAVA_DOUBLE, 56),
                segment.get(ValueLayout.JAVA_DOUBLE, 64),
                segment.get(ValueLayout.JAVA_DOUBLE, 72),
                segment.get(ValueLayout.JAVA_DOUBLE, 80),
                segment.get(ValueLayout.JAVA_DOUBLE, 88),
                segment.get(ValueLayout.JAVA_DOUBLE, 96),
                segment.get(ValueLayout.JAVA_DOUBLE, 104),
                segment.get(ValueLayout.JAVA_DOUBLE, 112),
                segment.get(ValueLayout.JAVA_DOUBLE, 120)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_DOUBLE, 0, this.m11);
        segment.set(ValueLayout.JAVA_DOUBLE, 8, this.m12);
        segment.set(ValueLayout.JAVA_DOUBLE, 16, this.m13);
        segment.set(ValueLayout.JAVA_DOUBLE, 24, this.m14);
        segment.set(ValueLayout.JAVA_DOUBLE, 32, this.m21);
        segment.set(ValueLayout.JAVA_DOUBLE, 40, this.m22);
        segment.set(ValueLayout.JAVA_DOUBLE, 48, this.m23);
        segment.set(ValueLayout.JAVA_DOUBLE, 56, this.m24);
        segment.set(ValueLayout.JAVA_DOUBLE, 64, this.m31);
        segment.set(ValueLayout.JAVA_DOUBLE, 72, this.m32);
        segment.set(ValueLayout.JAVA_DOUBLE, 80, this.m33);
        segment.set(ValueLayout.JAVA_DOUBLE, 88, this.m34);
        segment.set(ValueLayout.JAVA_DOUBLE, 96, this.m41);
        segment.set(ValueLayout.JAVA_DOUBLE, 104, this.m42);
        segment.set(ValueLayout.JAVA_DOUBLE, 112, this.m43);
        segment.set(ValueLayout.JAVA_DOUBLE, 120, this.m44);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
