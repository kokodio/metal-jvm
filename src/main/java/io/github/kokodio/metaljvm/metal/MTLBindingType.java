package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLBindingType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlbindingtype">Apple documentation</a>
 */
public enum MTLBindingType {
    Buffer(0L),
    ThreadgroupMemory(1L),
    Texture(2L),
    Sampler(3L),
    ImageblockData(16L),
    Imageblock(17L),
    VisibleFunctionTable(24L),
    PrimitiveAccelerationStructure(25L),
    InstanceAccelerationStructure(26L),
    IntersectionFunctionTable(27L),
    ObjectPayload(34L),
    Tensor(37L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    MTLBindingType(final long value) {
        this.value = value;
    }

    public static MTLBindingType of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 0: return Buffer;
                case 1: return ThreadgroupMemory;
                case 2: return Texture;
                case 3: return Sampler;
                case 16: return ImageblockData;
                case 17: return Imageblock;
                case 24: return VisibleFunctionTable;
                case 25: return PrimitiveAccelerationStructure;
                case 26: return InstanceAccelerationStructure;
                case 27: return IntersectionFunctionTable;
                case 34: return ObjectPayload;
                case 37: return Tensor;
            }
        }
        throw new IllegalArgumentException("Unknown MTLBindingType: " + value);
    }
}
