package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLTensorExtents}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltensorextents">Apple documentation</a>
 */
public class MTLTensorExtents extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLTensorExtents");
    private static final long SEL_initWithRank_values_ = ObjC.selector("initWithRank:values:");
    private static final MethodHandle MH_initWithRank_values_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_extentAtDimensionIndex_ = ObjC.selector("extentAtDimensionIndex:");
    private static final MethodHandle MH_extentAtDimensionIndex_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rank = ObjC.selector("rank");
    private static final MethodHandle MH_rank = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLTensorExtents(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLTensorExtents alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLTensorExtents alloc() {
        try {
            return new MTLTensorExtents((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorExtents init]} */
    public MTLTensorExtents init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorExtents initWithRank:values:]} */
    @Nullable
    public MTLTensorExtents init(final long rank, final MemorySegment values) {
        try {
            long result = (long) MH_initWithRank_values_.invokeExact(this.handle, SEL_initWithRank_values_, rank, values.address());
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorExtents extentAtDimensionIndex:]} */
    public long extentAtDimensionIndex(final long dimensionIndex) {
        try {
            return (long) MH_extentAtDimensionIndex_.invokeExact(this.handle, SEL_extentAtDimensionIndex_, dimensionIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTensorExtents rank]} */
    public long rank() {
        try {
            return (long) MH_rank.invokeExact(this.handle, SEL_rank);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
