package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSErrorException;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.foundation.NSURL;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4Compiler}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4compiler">Apple documentation</a>
 */
public class MTL4Compiler extends NSObject {
    private static final long SEL_newLibraryWithDescriptor_error_ = ObjC.selector("newLibraryWithDescriptor:error:");
    private static final MethodHandle MH_newLibraryWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newDynamicLibrary_error_ = ObjC.selector("newDynamicLibrary:error:");
    private static final MethodHandle MH_newDynamicLibrary_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newDynamicLibraryWithURL_error_ = ObjC.selector("newDynamicLibraryWithURL:error:");
    private static final MethodHandle MH_newDynamicLibraryWithURL_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newComputePipelineStateWithDescriptor_compilerTaskOptions_error_ = ObjC.selector("newComputePipelineStateWithDescriptor:compilerTaskOptions:error:");
    private static final MethodHandle MH_newComputePipelineStateWithDescriptor_compilerTaskOptions_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newComputePipelineStateWithDescriptor_dynamicLinkingDescriptor_compilerTaskOptions_error_ = ObjC.selector("newComputePipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:error:");
    private static final MethodHandle MH_newComputePipelineStateWithDescriptor_dynamicLinkingDescriptor_compilerTaskOptions_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRenderPipelineStateWithDescriptor_compilerTaskOptions_error_ = ObjC.selector("newRenderPipelineStateWithDescriptor:compilerTaskOptions:error:");
    private static final MethodHandle MH_newRenderPipelineStateWithDescriptor_compilerTaskOptions_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRenderPipelineStateWithDescriptor_dynamicLinkingDescriptor_compilerTaskOptions_error_ = ObjC.selector("newRenderPipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:error:");
    private static final MethodHandle MH_newRenderPipelineStateWithDescriptor_dynamicLinkingDescriptor_compilerTaskOptions_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRenderPipelineStateBySpecializationWithDescriptor_pipeline_error_ = ObjC.selector("newRenderPipelineStateBySpecializationWithDescriptor:pipeline:error:");
    private static final MethodHandle MH_newRenderPipelineStateBySpecializationWithDescriptor_pipeline_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newBinaryFunctionWithDescriptor_compilerTaskOptions_error_ = ObjC.selector("newBinaryFunctionWithDescriptor:compilerTaskOptions:error:");
    private static final MethodHandle MH_newBinaryFunctionWithDescriptor_compilerTaskOptions_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newLibraryWithDescriptor_completionHandler_ = ObjC.selector("newLibraryWithDescriptor:completionHandler:");
    private static final MethodHandle MH_newLibraryWithDescriptor_completionHandler_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newDynamicLibrary_completionHandler_ = ObjC.selector("newDynamicLibrary:completionHandler:");
    private static final MethodHandle MH_newDynamicLibrary_completionHandler_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newDynamicLibraryWithURL_completionHandler_ = ObjC.selector("newDynamicLibraryWithURL:completionHandler:");
    private static final MethodHandle MH_newDynamicLibraryWithURL_completionHandler_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newComputePipelineStateWithDescriptor_compilerTaskOptions_completionHandler_ = ObjC.selector("newComputePipelineStateWithDescriptor:compilerTaskOptions:completionHandler:");
    private static final MethodHandle MH_newComputePipelineStateWithDescriptor_compilerTaskOptions_completionHandler_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newComputePipelineStateWithDescriptor_dynamicLinkingDescriptor_compilerTaskOptions_completionHandler_ = ObjC.selector("newComputePipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:completionHandler:");
    private static final MethodHandle MH_newComputePipelineStateWithDescriptor_dynamicLinkingDescriptor_compilerTaskOptions_completionHandler_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRenderPipelineStateWithDescriptor_compilerTaskOptions_completionHandler_ = ObjC.selector("newRenderPipelineStateWithDescriptor:compilerTaskOptions:completionHandler:");
    private static final MethodHandle MH_newRenderPipelineStateWithDescriptor_compilerTaskOptions_completionHandler_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRenderPipelineStateWithDescriptor_dynamicLinkingDescriptor_compilerTaskOptions_completionHandler_ = ObjC.selector("newRenderPipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:completionHandler:");
    private static final MethodHandle MH_newRenderPipelineStateWithDescriptor_dynamicLinkingDescriptor_compilerTaskOptions_completionHandler_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newRenderPipelineStateBySpecializationWithDescriptor_pipeline_completionHandler_ = ObjC.selector("newRenderPipelineStateBySpecializationWithDescriptor:pipeline:completionHandler:");
    private static final MethodHandle MH_newRenderPipelineStateBySpecializationWithDescriptor_pipeline_completionHandler_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newBinaryFunctionWithDescriptor_compilerTaskOptions_completionHandler_ = ObjC.selector("newBinaryFunctionWithDescriptor:compilerTaskOptions:completionHandler:");
    private static final MethodHandle MH_newBinaryFunctionWithDescriptor_compilerTaskOptions_completionHandler_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newMachineLearningPipelineStateWithDescriptor_error_ = ObjC.selector("newMachineLearningPipelineStateWithDescriptor:error:");
    private static final MethodHandle MH_newMachineLearningPipelineStateWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newMachineLearningPipelineStateWithDescriptor_completionHandler_ = ObjC.selector("newMachineLearningPipelineStateWithDescriptor:completionHandler:");
    private static final MethodHandle MH_newMachineLearningPipelineStateWithDescriptor_completionHandler_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pipelineDataSetSerializer = ObjC.selector("pipelineDataSetSerializer");
    private static final MethodHandle MH_pipelineDataSetSerializer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTL4Compiler(final long handle) {
        super(handle);
    }

    /**
     * {@code -[MTL4Compiler newLibraryWithDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLLibrary newLibrary(final MTL4LibraryDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newLibraryWithDescriptor_error_.invokeExact(this.handle, SEL_newLibraryWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newLibraryWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLLibrary(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Compiler newDynamicLibrary:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLDynamicLibrary newDynamicLibrary(final MTLLibrary library) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newDynamicLibrary_error_.invokeExact(this.handle, SEL_newDynamicLibrary_error_, library.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newDynamicLibrary:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLDynamicLibrary(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Compiler newDynamicLibraryWithURL:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLDynamicLibrary newDynamicLibraryWithURL(final NSURL url) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newDynamicLibraryWithURL_error_.invokeExact(this.handle, SEL_newDynamicLibraryWithURL_error_, url.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newDynamicLibraryWithURL:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLDynamicLibrary(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Compiler newComputePipelineStateWithDescriptor:compilerTaskOptions:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLComputePipelineState newComputePipelineState(final MTL4ComputePipelineDescriptor descriptor, @Nullable final MTL4CompilerTaskOptions compilerTaskOptions) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newComputePipelineStateWithDescriptor_compilerTaskOptions_error_.invokeExact(this.handle, SEL_newComputePipelineStateWithDescriptor_compilerTaskOptions_error_, descriptor.handle(), compilerTaskOptions == null ? 0L : compilerTaskOptions.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newComputePipelineStateWithDescriptor:compilerTaskOptions:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLComputePipelineState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Compiler newComputePipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLComputePipelineState newComputePipelineState(final MTL4ComputePipelineDescriptor descriptor, @Nullable final MTL4PipelineStageDynamicLinkingDescriptor dynamicLinkingDescriptor, @Nullable final MTL4CompilerTaskOptions compilerTaskOptions) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newComputePipelineStateWithDescriptor_dynamicLinkingDescriptor_compilerTaskOptions_error_.invokeExact(this.handle, SEL_newComputePipelineStateWithDescriptor_dynamicLinkingDescriptor_compilerTaskOptions_error_, descriptor.handle(), dynamicLinkingDescriptor == null ? 0L : dynamicLinkingDescriptor.handle(), compilerTaskOptions == null ? 0L : compilerTaskOptions.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newComputePipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLComputePipelineState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Compiler newRenderPipelineStateWithDescriptor:compilerTaskOptions:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLRenderPipelineState newRenderPipelineState(final MTL4PipelineDescriptor descriptor, @Nullable final MTL4CompilerTaskOptions compilerTaskOptions) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newRenderPipelineStateWithDescriptor_compilerTaskOptions_error_.invokeExact(this.handle, SEL_newRenderPipelineStateWithDescriptor_compilerTaskOptions_error_, descriptor.handle(), compilerTaskOptions == null ? 0L : compilerTaskOptions.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newRenderPipelineStateWithDescriptor:compilerTaskOptions:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLRenderPipelineState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Compiler newRenderPipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLRenderPipelineState newRenderPipelineState(final MTL4PipelineDescriptor descriptor, @Nullable final MTL4RenderPipelineDynamicLinkingDescriptor dynamicLinkingDescriptor, @Nullable final MTL4CompilerTaskOptions compilerTaskOptions) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newRenderPipelineStateWithDescriptor_dynamicLinkingDescriptor_compilerTaskOptions_error_.invokeExact(this.handle, SEL_newRenderPipelineStateWithDescriptor_dynamicLinkingDescriptor_compilerTaskOptions_error_, descriptor.handle(), dynamicLinkingDescriptor == null ? 0L : dynamicLinkingDescriptor.handle(), compilerTaskOptions == null ? 0L : compilerTaskOptions.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newRenderPipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLRenderPipelineState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Compiler newRenderPipelineStateBySpecializationWithDescriptor:pipeline:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLRenderPipelineState newRenderPipelineStateBySpecialization(final MTL4PipelineDescriptor descriptor, final MTLRenderPipelineState pipeline) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newRenderPipelineStateBySpecializationWithDescriptor_pipeline_error_.invokeExact(this.handle, SEL_newRenderPipelineStateBySpecializationWithDescriptor_pipeline_error_, descriptor.handle(), pipeline.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newRenderPipelineStateBySpecializationWithDescriptor:pipeline:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLRenderPipelineState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Compiler newBinaryFunctionWithDescriptor:compilerTaskOptions:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTL4BinaryFunction newBinaryFunction(final MTL4BinaryFunctionDescriptor descriptor, @Nullable final MTL4CompilerTaskOptions compilerTaskOptions) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newBinaryFunctionWithDescriptor_compilerTaskOptions_error_.invokeExact(this.handle, SEL_newBinaryFunctionWithDescriptor_compilerTaskOptions_error_, descriptor.handle(), compilerTaskOptions == null ? 0L : compilerTaskOptions.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newBinaryFunctionWithDescriptor:compilerTaskOptions:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTL4BinaryFunction(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Compiler newLibraryWithDescriptor:completionHandler:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTL4CompilerTask newLibrary(final MTL4LibraryDescriptor descriptor, final long completionHandler) {
        try {
            long result = (long) MH_newLibraryWithDescriptor_completionHandler_.invokeExact(this.handle, SEL_newLibraryWithDescriptor_completionHandler_, descriptor.handle(), completionHandler);
            return new MTL4CompilerTask(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Compiler newDynamicLibrary:completionHandler:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTL4CompilerTask newDynamicLibrary(final MTLLibrary library, final long completionHandler) {
        try {
            long result = (long) MH_newDynamicLibrary_completionHandler_.invokeExact(this.handle, SEL_newDynamicLibrary_completionHandler_, library.handle(), completionHandler);
            return new MTL4CompilerTask(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Compiler newDynamicLibraryWithURL:completionHandler:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTL4CompilerTask newDynamicLibraryWithURL(final NSURL url, final long completionHandler) {
        try {
            long result = (long) MH_newDynamicLibraryWithURL_completionHandler_.invokeExact(this.handle, SEL_newDynamicLibraryWithURL_completionHandler_, url.handle(), completionHandler);
            return new MTL4CompilerTask(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Compiler newComputePipelineStateWithDescriptor:compilerTaskOptions:completionHandler:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTL4CompilerTask newComputePipelineState(final MTL4ComputePipelineDescriptor descriptor, @Nullable final MTL4CompilerTaskOptions compilerTaskOptions, final long completionHandler) {
        try {
            long result = (long) MH_newComputePipelineStateWithDescriptor_compilerTaskOptions_completionHandler_.invokeExact(this.handle, SEL_newComputePipelineStateWithDescriptor_compilerTaskOptions_completionHandler_, descriptor.handle(), compilerTaskOptions == null ? 0L : compilerTaskOptions.handle(), completionHandler);
            return new MTL4CompilerTask(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Compiler newComputePipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:completionHandler:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTL4CompilerTask newComputePipelineState(final MTL4ComputePipelineDescriptor descriptor, @Nullable final MTL4PipelineStageDynamicLinkingDescriptor dynamicLinkingDescriptor, @Nullable final MTL4CompilerTaskOptions compilerTaskOptions, final long completionHandler) {
        try {
            long result = (long) MH_newComputePipelineStateWithDescriptor_dynamicLinkingDescriptor_compilerTaskOptions_completionHandler_.invokeExact(this.handle, SEL_newComputePipelineStateWithDescriptor_dynamicLinkingDescriptor_compilerTaskOptions_completionHandler_, descriptor.handle(), dynamicLinkingDescriptor == null ? 0L : dynamicLinkingDescriptor.handle(), compilerTaskOptions == null ? 0L : compilerTaskOptions.handle(), completionHandler);
            return new MTL4CompilerTask(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Compiler newRenderPipelineStateWithDescriptor:compilerTaskOptions:completionHandler:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTL4CompilerTask newRenderPipelineState(final MTL4PipelineDescriptor descriptor, @Nullable final MTL4CompilerTaskOptions compilerTaskOptions, final long completionHandler) {
        try {
            long result = (long) MH_newRenderPipelineStateWithDescriptor_compilerTaskOptions_completionHandler_.invokeExact(this.handle, SEL_newRenderPipelineStateWithDescriptor_compilerTaskOptions_completionHandler_, descriptor.handle(), compilerTaskOptions == null ? 0L : compilerTaskOptions.handle(), completionHandler);
            return new MTL4CompilerTask(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Compiler newRenderPipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:completionHandler:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTL4CompilerTask newRenderPipelineState(final MTL4PipelineDescriptor descriptor, @Nullable final MTL4RenderPipelineDynamicLinkingDescriptor dynamicLinkingDescriptor, @Nullable final MTL4CompilerTaskOptions compilerTaskOptions, final long completionHandler) {
        try {
            long result = (long) MH_newRenderPipelineStateWithDescriptor_dynamicLinkingDescriptor_compilerTaskOptions_completionHandler_.invokeExact(this.handle, SEL_newRenderPipelineStateWithDescriptor_dynamicLinkingDescriptor_compilerTaskOptions_completionHandler_, descriptor.handle(), dynamicLinkingDescriptor == null ? 0L : dynamicLinkingDescriptor.handle(), compilerTaskOptions == null ? 0L : compilerTaskOptions.handle(), completionHandler);
            return new MTL4CompilerTask(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Compiler newRenderPipelineStateBySpecializationWithDescriptor:pipeline:completionHandler:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTL4CompilerTask newRenderPipelineStateBySpecialization(final MTL4PipelineDescriptor descriptor, final MTLRenderPipelineState pipeline, final long completionHandler) {
        try {
            long result = (long) MH_newRenderPipelineStateBySpecializationWithDescriptor_pipeline_completionHandler_.invokeExact(this.handle, SEL_newRenderPipelineStateBySpecializationWithDescriptor_pipeline_completionHandler_, descriptor.handle(), pipeline.handle(), completionHandler);
            return new MTL4CompilerTask(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Compiler newBinaryFunctionWithDescriptor:compilerTaskOptions:completionHandler:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTL4CompilerTask newBinaryFunction(final MTL4BinaryFunctionDescriptor descriptor, @Nullable final MTL4CompilerTaskOptions compilerTaskOptions, final long completionHandler) {
        try {
            long result = (long) MH_newBinaryFunctionWithDescriptor_compilerTaskOptions_completionHandler_.invokeExact(this.handle, SEL_newBinaryFunctionWithDescriptor_compilerTaskOptions_completionHandler_, descriptor.handle(), compilerTaskOptions == null ? 0L : compilerTaskOptions.handle(), completionHandler);
            return new MTL4CompilerTask(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Compiler newMachineLearningPipelineStateWithDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTL4MachineLearningPipelineState newMachineLearningPipelineState(final MTL4MachineLearningPipelineDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newMachineLearningPipelineStateWithDescriptor_error_.invokeExact(this.handle, SEL_newMachineLearningPipelineStateWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newMachineLearningPipelineStateWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTL4MachineLearningPipelineState(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Compiler newMachineLearningPipelineStateWithDescriptor:completionHandler:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTL4CompilerTask newMachineLearningPipelineState(final MTL4MachineLearningPipelineDescriptor descriptor, final long completionHandler) {
        try {
            long result = (long) MH_newMachineLearningPipelineStateWithDescriptor_completionHandler_.invokeExact(this.handle, SEL_newMachineLearningPipelineStateWithDescriptor_completionHandler_, descriptor.handle(), completionHandler);
            return new MTL4CompilerTask(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Compiler device]}
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

    /** {@code -[MTL4Compiler label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4Compiler pipelineDataSetSerializer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTL4PipelineDataSetSerializer pipelineDataSetSerializer() {
        try {
            long result = (long) MH_pipelineDataSetSerializer.invokeExact(this.handle, SEL_pipelineDataSetSerializer);
            return result == 0L ? null : new MTL4PipelineDataSetSerializer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
