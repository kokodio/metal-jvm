package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4RenderPipelineBinaryFunctionsDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4renderpipelinebinaryfunctionsdescriptor">Apple documentation</a>
 */
public class MTL4RenderPipelineBinaryFunctionsDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4RenderPipelineBinaryFunctionsDescriptor");
    private static final long SEL_reset = ObjC.selector("reset");
    private static final MethodHandle MH_reset = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_vertexAdditionalBinaryFunctions = ObjC.selector("vertexAdditionalBinaryFunctions");
    private static final MethodHandle MH_vertexAdditionalBinaryFunctions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setVertexAdditionalBinaryFunctions_ = ObjC.selector("setVertexAdditionalBinaryFunctions:");
    private static final MethodHandle MH_setVertexAdditionalBinaryFunctions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fragmentAdditionalBinaryFunctions = ObjC.selector("fragmentAdditionalBinaryFunctions");
    private static final MethodHandle MH_fragmentAdditionalBinaryFunctions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFragmentAdditionalBinaryFunctions_ = ObjC.selector("setFragmentAdditionalBinaryFunctions:");
    private static final MethodHandle MH_setFragmentAdditionalBinaryFunctions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tileAdditionalBinaryFunctions = ObjC.selector("tileAdditionalBinaryFunctions");
    private static final MethodHandle MH_tileAdditionalBinaryFunctions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTileAdditionalBinaryFunctions_ = ObjC.selector("setTileAdditionalBinaryFunctions:");
    private static final MethodHandle MH_setTileAdditionalBinaryFunctions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_objectAdditionalBinaryFunctions = ObjC.selector("objectAdditionalBinaryFunctions");
    private static final MethodHandle MH_objectAdditionalBinaryFunctions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setObjectAdditionalBinaryFunctions_ = ObjC.selector("setObjectAdditionalBinaryFunctions:");
    private static final MethodHandle MH_setObjectAdditionalBinaryFunctions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_meshAdditionalBinaryFunctions = ObjC.selector("meshAdditionalBinaryFunctions");
    private static final MethodHandle MH_meshAdditionalBinaryFunctions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMeshAdditionalBinaryFunctions_ = ObjC.selector("setMeshAdditionalBinaryFunctions:");
    private static final MethodHandle MH_setMeshAdditionalBinaryFunctions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4RenderPipelineBinaryFunctionsDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4RenderPipelineBinaryFunctionsDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4RenderPipelineBinaryFunctionsDescriptor alloc() {
        try {
            return new MTL4RenderPipelineBinaryFunctionsDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineBinaryFunctionsDescriptor init]} */
    public MTL4RenderPipelineBinaryFunctionsDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineBinaryFunctionsDescriptor reset]} */
    public void reset() {
        try {
            MH_reset.invokeExact(this.handle, SEL_reset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4RenderPipelineBinaryFunctionsDescriptor vertexAdditionalBinaryFunctions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTL4BinaryFunction> vertexAdditionalBinaryFunctions() {
        try {
            long result = (long) MH_vertexAdditionalBinaryFunctions.invokeExact(this.handle, SEL_vertexAdditionalBinaryFunctions);
            return result == 0L ? null : new NSArray<>(result, MTL4BinaryFunction::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineBinaryFunctionsDescriptor setVertexAdditionalBinaryFunctions:]} */
    public void setVertexAdditionalBinaryFunctions(@Nullable final NSArray<MTL4BinaryFunction> vertexAdditionalBinaryFunctions) {
        try {
            MH_setVertexAdditionalBinaryFunctions_.invokeExact(this.handle, SEL_setVertexAdditionalBinaryFunctions_, vertexAdditionalBinaryFunctions == null ? 0L : vertexAdditionalBinaryFunctions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4RenderPipelineBinaryFunctionsDescriptor fragmentAdditionalBinaryFunctions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTL4BinaryFunction> fragmentAdditionalBinaryFunctions() {
        try {
            long result = (long) MH_fragmentAdditionalBinaryFunctions.invokeExact(this.handle, SEL_fragmentAdditionalBinaryFunctions);
            return result == 0L ? null : new NSArray<>(result, MTL4BinaryFunction::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineBinaryFunctionsDescriptor setFragmentAdditionalBinaryFunctions:]} */
    public void setFragmentAdditionalBinaryFunctions(@Nullable final NSArray<MTL4BinaryFunction> fragmentAdditionalBinaryFunctions) {
        try {
            MH_setFragmentAdditionalBinaryFunctions_.invokeExact(this.handle, SEL_setFragmentAdditionalBinaryFunctions_, fragmentAdditionalBinaryFunctions == null ? 0L : fragmentAdditionalBinaryFunctions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4RenderPipelineBinaryFunctionsDescriptor tileAdditionalBinaryFunctions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTL4BinaryFunction> tileAdditionalBinaryFunctions() {
        try {
            long result = (long) MH_tileAdditionalBinaryFunctions.invokeExact(this.handle, SEL_tileAdditionalBinaryFunctions);
            return result == 0L ? null : new NSArray<>(result, MTL4BinaryFunction::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineBinaryFunctionsDescriptor setTileAdditionalBinaryFunctions:]} */
    public void setTileAdditionalBinaryFunctions(@Nullable final NSArray<MTL4BinaryFunction> tileAdditionalBinaryFunctions) {
        try {
            MH_setTileAdditionalBinaryFunctions_.invokeExact(this.handle, SEL_setTileAdditionalBinaryFunctions_, tileAdditionalBinaryFunctions == null ? 0L : tileAdditionalBinaryFunctions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4RenderPipelineBinaryFunctionsDescriptor objectAdditionalBinaryFunctions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTL4BinaryFunction> objectAdditionalBinaryFunctions() {
        try {
            long result = (long) MH_objectAdditionalBinaryFunctions.invokeExact(this.handle, SEL_objectAdditionalBinaryFunctions);
            return result == 0L ? null : new NSArray<>(result, MTL4BinaryFunction::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineBinaryFunctionsDescriptor setObjectAdditionalBinaryFunctions:]} */
    public void setObjectAdditionalBinaryFunctions(@Nullable final NSArray<MTL4BinaryFunction> objectAdditionalBinaryFunctions) {
        try {
            MH_setObjectAdditionalBinaryFunctions_.invokeExact(this.handle, SEL_setObjectAdditionalBinaryFunctions_, objectAdditionalBinaryFunctions == null ? 0L : objectAdditionalBinaryFunctions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4RenderPipelineBinaryFunctionsDescriptor meshAdditionalBinaryFunctions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTL4BinaryFunction> meshAdditionalBinaryFunctions() {
        try {
            long result = (long) MH_meshAdditionalBinaryFunctions.invokeExact(this.handle, SEL_meshAdditionalBinaryFunctions);
            return result == 0L ? null : new NSArray<>(result, MTL4BinaryFunction::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineBinaryFunctionsDescriptor setMeshAdditionalBinaryFunctions:]} */
    public void setMeshAdditionalBinaryFunctions(@Nullable final NSArray<MTL4BinaryFunction> meshAdditionalBinaryFunctions) {
        try {
            MH_setMeshAdditionalBinaryFunctions_.invokeExact(this.handle, SEL_setMeshAdditionalBinaryFunctions_, meshAdditionalBinaryFunctions == null ? 0L : meshAdditionalBinaryFunctions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
