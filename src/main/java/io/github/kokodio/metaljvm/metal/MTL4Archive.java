package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSErrorException;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4Archive}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4archive">Apple documentation</a>
 */
public class MTL4Archive extends NSObject {
    private static final long SEL_newComputePipelineStateWithDescriptor_error_ = ObjC.selector("newComputePipelineStateWithDescriptor:error:");
    private static final MethodHandle MH_newComputePipelineStateWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newComputePipelineStateWithDescriptor_dynamicLinkingDescriptor_error_ = ObjC.selector("newComputePipelineStateWithDescriptor:dynamicLinkingDescriptor:error:");
    private static final MethodHandle MH_newComputePipelineStateWithDescriptor_dynamicLinkingDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRenderPipelineStateWithDescriptor_error_ = ObjC.selector("newRenderPipelineStateWithDescriptor:error:");
    private static final MethodHandle MH_newRenderPipelineStateWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRenderPipelineStateWithDescriptor_dynamicLinkingDescriptor_error_ = ObjC.selector("newRenderPipelineStateWithDescriptor:dynamicLinkingDescriptor:error:");
    private static final MethodHandle MH_newRenderPipelineStateWithDescriptor_dynamicLinkingDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newBinaryFunctionWithDescriptor_error_ = ObjC.selector("newBinaryFunctionWithDescriptor:error:");
    private static final MethodHandle MH_newBinaryFunctionWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTL4Archive(final long handle) {
        super(handle);
    }

    /**
     * {@code -[MTL4Archive newComputePipelineStateWithDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLComputePipelineState newComputePipelineState(final MTL4ComputePipelineDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newComputePipelineStateWithDescriptor_error_.invokeExact(this.handle, SEL_newComputePipelineStateWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newComputePipelineStateWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLComputePipelineState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Archive newComputePipelineStateWithDescriptor:dynamicLinkingDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLComputePipelineState newComputePipelineState(final MTL4ComputePipelineDescriptor descriptor, final MTL4PipelineStageDynamicLinkingDescriptor dynamicLinkingDescriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newComputePipelineStateWithDescriptor_dynamicLinkingDescriptor_error_.invokeExact(this.handle, SEL_newComputePipelineStateWithDescriptor_dynamicLinkingDescriptor_error_, descriptor.handle(), dynamicLinkingDescriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newComputePipelineStateWithDescriptor:dynamicLinkingDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLComputePipelineState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Archive newRenderPipelineStateWithDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLRenderPipelineState newRenderPipelineState(final MTL4PipelineDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newRenderPipelineStateWithDescriptor_error_.invokeExact(this.handle, SEL_newRenderPipelineStateWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newRenderPipelineStateWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLRenderPipelineState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Archive newRenderPipelineStateWithDescriptor:dynamicLinkingDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLRenderPipelineState newRenderPipelineState(final MTL4PipelineDescriptor descriptor, final MTL4RenderPipelineDynamicLinkingDescriptor dynamicLinkingDescriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newRenderPipelineStateWithDescriptor_dynamicLinkingDescriptor_error_.invokeExact(this.handle, SEL_newRenderPipelineStateWithDescriptor_dynamicLinkingDescriptor_error_, descriptor.handle(), dynamicLinkingDescriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newRenderPipelineStateWithDescriptor:dynamicLinkingDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLRenderPipelineState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Archive newBinaryFunctionWithDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTL4BinaryFunction newBinaryFunction(final MTL4BinaryFunctionDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newBinaryFunctionWithDescriptor_error_.invokeExact(this.handle, SEL_newBinaryFunctionWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newBinaryFunctionWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTL4BinaryFunction(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4Archive label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4Archive setLabel:]} */
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
}
