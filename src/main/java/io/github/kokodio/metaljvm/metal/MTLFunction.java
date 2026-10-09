package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSDictionary;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.foundation.NSString;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLFunction}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlfunction">Apple documentation</a>
 */
public class MTLFunction extends NSObject {
    private static final long SEL_newArgumentEncoderWithBufferIndex_ = ObjC.selector("newArgumentEncoderWithBufferIndex:");
    private static final MethodHandle MH_newArgumentEncoderWithBufferIndex_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newArgumentEncoderWithBufferIndex_reflection_ = ObjC.selector("newArgumentEncoderWithBufferIndex:reflection:");
    private static final MethodHandle MH_newArgumentEncoderWithBufferIndex_reflection_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_functionType = ObjC.selector("functionType");
    private static final MethodHandle MH_functionType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_patchType = ObjC.selector("patchType");
    private static final MethodHandle MH_patchType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_patchControlPointCount = ObjC.selector("patchControlPointCount");
    private static final MethodHandle MH_patchControlPointCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_vertexAttributes = ObjC.selector("vertexAttributes");
    private static final MethodHandle MH_vertexAttributes = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stageInputAttributes = ObjC.selector("stageInputAttributes");
    private static final MethodHandle MH_stageInputAttributes = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_name = ObjC.selector("name");
    private static final MethodHandle MH_name = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_functionConstantsDictionary = ObjC.selector("functionConstantsDictionary");
    private static final MethodHandle MH_functionConstantsDictionary = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_options = ObjC.selector("options");
    private static final MethodHandle MH_options = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLFunction(final long handle) {
        super(handle);
    }

    /**
     * {@code -[MTLFunction newArgumentEncoderWithBufferIndex:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLArgumentEncoder newArgumentEncoder(final long bufferIndex) {
        try {
            long result = (long) MH_newArgumentEncoderWithBufferIndex_.invokeExact(this.handle, SEL_newArgumentEncoderWithBufferIndex_, bufferIndex);
            return new MTLArgumentEncoder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFunction newArgumentEncoderWithBufferIndex:reflection:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLArgumentEncoder newArgumentEncoder(final long bufferIndex, final MemorySegment reflection) {
        try {
            long result = (long) MH_newArgumentEncoderWithBufferIndex_reflection_.invokeExact(this.handle, SEL_newArgumentEncoderWithBufferIndex_reflection_, bufferIndex, reflection.address());
            return new MTLArgumentEncoder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunction label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunction setLabel:]} */
    public void setLabel(@Nullable final String label) {
        final long nsLabel = label == null ? 0L : ObjC.nsString(label);
        try {
            MH_setLabel_.invokeExact(this.handle, SEL_setLabel_, nsLabel);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsLabel);
        }
    }

    /**
     * {@code -[MTLFunction device]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLDevice device() {
        try {
            long result = (long) MH_device.invokeExact(this.handle, SEL_device);
            return new MTLDevice(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunction functionType]} */
    public MTLFunctionType functionType() {
        try {
            return MTLFunctionType.of((long) MH_functionType.invokeExact(this.handle, SEL_functionType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunction patchType]} */
    public MTLPatchType patchType() {
        try {
            return MTLPatchType.of((long) MH_patchType.invokeExact(this.handle, SEL_patchType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunction patchControlPointCount]} */
    public long patchControlPointCount() {
        try {
            return (long) MH_patchControlPointCount.invokeExact(this.handle, SEL_patchControlPointCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFunction vertexAttributes]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTLVertexAttribute> vertexAttributes() {
        try {
            long result = (long) MH_vertexAttributes.invokeExact(this.handle, SEL_vertexAttributes);
            return result == 0L ? null : new NSArray<>(result, MTLVertexAttribute::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFunction stageInputAttributes]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTLAttribute> stageInputAttributes() {
        try {
            long result = (long) MH_stageInputAttributes.invokeExact(this.handle, SEL_stageInputAttributes);
            return result == 0L ? null : new NSArray<>(result, MTLAttribute::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunction name]} */
    public String name() {
        try {
            long result = (long) MH_name.invokeExact(this.handle, SEL_name);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFunction functionConstantsDictionary]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSDictionary<NSString, MTLFunctionConstant> functionConstantsDictionary() {
        try {
            long result = (long) MH_functionConstantsDictionary.invokeExact(this.handle, SEL_functionConstantsDictionary);
            return new NSDictionary<>(result, NSString::new, MTLFunctionConstant::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFunction options]}
     *
     * @return a combination of {@link MTLFunctionOptions} flags
     */
    public long options() {
        try {
            return (long) MH_options.invokeExact(this.handle, SEL_options);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
