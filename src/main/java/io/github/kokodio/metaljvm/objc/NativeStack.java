package io.github.kokodio.metaljvm.objc;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.util.Arrays;

public final class NativeStack implements SegmentAllocator, AutoCloseable {
    private static final long SIZE = 64 * 1024;
    private static final ThreadLocal<NativeStack> STACKS = ThreadLocal.withInitial(NativeStack::new);

    private final MemorySegment memory = Arena.ofAuto().allocate(SIZE, 16);
    private long[] frames = new long[8];
    private int frame;
    private long top;

    private NativeStack() {
    }

    public static NativeStack push() {
        NativeStack stack = STACKS.get();
        if (stack.frame == stack.frames.length) {
            stack.frames = Arrays.copyOf(stack.frames, stack.frames.length * 3 / 2);
        }
        stack.frames[stack.frame++] = stack.top;
        return stack;
    }

    @Override
    public MemorySegment allocate(long byteSize, long byteAlignment) {
        if (byteSize < 0) {
            throw new IllegalArgumentException("Byte size must be non-negative");
        }
        if (byteAlignment <= 0 || (byteAlignment & (byteAlignment - 1)) != 0) {
            throw new IllegalArgumentException("Byte alignment must be a power of two");
        }
        long start = (top + byteAlignment - 1) & -byteAlignment;
        if (byteSize > SIZE - start) {
            throw new OutOfMemoryError("Out of stack space.");
        }
        top = start + byteSize;
        return memory.asSlice(start, byteSize);
    }

    public MemorySegment calloc(long byteSize, long byteAlignment) {
        return allocate(byteSize, byteAlignment).fill((byte) 0);
    }

    public MemorySegment calloc(MemoryLayout layout) {
        return calloc(layout.byteSize(), layout.byteAlignment());
    }

    @Override
    public void close() {
        top = frames[--frame];
    }
}
