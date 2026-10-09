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

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLBinaryArchive}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlbinaryarchive">Apple documentation</a>
 */
public class MTLBinaryArchive extends NSObject {
    private static final long SEL_addComputePipelineFunctionsWithDescriptor_error_ = ObjC.selector("addComputePipelineFunctionsWithDescriptor:error:");
    private static final MethodHandle MH_addComputePipelineFunctionsWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_addRenderPipelineFunctionsWithDescriptor_error_ = ObjC.selector("addRenderPipelineFunctionsWithDescriptor:error:");
    private static final MethodHandle MH_addRenderPipelineFunctionsWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_addTileRenderPipelineFunctionsWithDescriptor_error_ = ObjC.selector("addTileRenderPipelineFunctionsWithDescriptor:error:");
    private static final MethodHandle MH_addTileRenderPipelineFunctionsWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_addMeshRenderPipelineFunctionsWithDescriptor_error_ = ObjC.selector("addMeshRenderPipelineFunctionsWithDescriptor:error:");
    private static final MethodHandle MH_addMeshRenderPipelineFunctionsWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_addLibraryWithDescriptor_error_ = ObjC.selector("addLibraryWithDescriptor:error:");
    private static final MethodHandle MH_addLibraryWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_serializeToURL_error_ = ObjC.selector("serializeToURL:error:");
    private static final MethodHandle MH_serializeToURL_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_addFunctionWithDescriptor_library_error_ = ObjC.selector("addFunctionWithDescriptor:library:error:");
    private static final MethodHandle MH_addFunctionWithDescriptor_library_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLBinaryArchive(final long handle) {
        super(handle);
    }

    /** {@code -[MTLBinaryArchive addComputePipelineFunctionsWithDescriptor:error:]} */
    public void addComputePipelineFunctions(final MTLComputePipelineDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_addComputePipelineFunctionsWithDescriptor_error_.invokeExact(this.handle, SEL_addComputePipelineFunctionsWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (!result) {
                throw NSErrorException.of("addComputePipelineFunctionsWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBinaryArchive addRenderPipelineFunctionsWithDescriptor:error:]} */
    public void addRenderPipelineFunctions(final MTLRenderPipelineDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_addRenderPipelineFunctionsWithDescriptor_error_.invokeExact(this.handle, SEL_addRenderPipelineFunctionsWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (!result) {
                throw NSErrorException.of("addRenderPipelineFunctionsWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBinaryArchive addTileRenderPipelineFunctionsWithDescriptor:error:]} */
    public void addTileRenderPipelineFunctions(final MTLTileRenderPipelineDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_addTileRenderPipelineFunctionsWithDescriptor_error_.invokeExact(this.handle, SEL_addTileRenderPipelineFunctionsWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (!result) {
                throw NSErrorException.of("addTileRenderPipelineFunctionsWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBinaryArchive addMeshRenderPipelineFunctionsWithDescriptor:error:]} */
    public void addMeshRenderPipelineFunctions(final MTLMeshRenderPipelineDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_addMeshRenderPipelineFunctionsWithDescriptor_error_.invokeExact(this.handle, SEL_addMeshRenderPipelineFunctionsWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (!result) {
                throw NSErrorException.of("addMeshRenderPipelineFunctionsWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBinaryArchive addLibraryWithDescriptor:error:]} */
    public void addLibrary(final MTLStitchedLibraryDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_addLibraryWithDescriptor_error_.invokeExact(this.handle, SEL_addLibraryWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (!result) {
                throw NSErrorException.of("addLibraryWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBinaryArchive serializeToURL:error:]} */
    public void serializeToURL(final NSURL url) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_serializeToURL_error_.invokeExact(this.handle, SEL_serializeToURL_error_, url.handle(), errorOut.address());
            if (!result) {
                throw NSErrorException.of("serializeToURL:error:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBinaryArchive addFunctionWithDescriptor:library:error:]} */
    public void addFunction(final MTLFunctionDescriptor descriptor, final MTLLibrary library) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_addFunctionWithDescriptor_library_error_.invokeExact(this.handle, SEL_addFunctionWithDescriptor_library_error_, descriptor.handle(), library.handle(), errorOut.address());
            if (!result) {
                throw NSErrorException.of("addFunctionWithDescriptor:library:error:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBinaryArchive label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBinaryArchive setLabel:]} */
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
     * {@code -[MTLBinaryArchive device]}
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
}
