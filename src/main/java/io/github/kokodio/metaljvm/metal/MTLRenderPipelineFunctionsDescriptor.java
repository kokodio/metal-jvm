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
 * {@code MTLRenderPipelineFunctionsDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlrenderpipelinefunctionsdescriptor">Apple documentation</a>
 */
public class MTLRenderPipelineFunctionsDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLRenderPipelineFunctionsDescriptor");
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
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLRenderPipelineFunctionsDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLRenderPipelineFunctionsDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLRenderPipelineFunctionsDescriptor alloc() {
        try {
            return new MTLRenderPipelineFunctionsDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineFunctionsDescriptor init]} */
    public MTLRenderPipelineFunctionsDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineFunctionsDescriptor vertexAdditionalBinaryFunctions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTLFunction> vertexAdditionalBinaryFunctions() {
        try {
            long result = (long) MH_vertexAdditionalBinaryFunctions.invokeExact(this.handle, SEL_vertexAdditionalBinaryFunctions);
            return result == 0L ? null : new NSArray<>(result, MTLFunction::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineFunctionsDescriptor setVertexAdditionalBinaryFunctions:]} */
    public void setVertexAdditionalBinaryFunctions(@Nullable final NSArray<MTLFunction> vertexAdditionalBinaryFunctions) {
        try {
            MH_setVertexAdditionalBinaryFunctions_.invokeExact(this.handle, SEL_setVertexAdditionalBinaryFunctions_, vertexAdditionalBinaryFunctions == null ? 0L : vertexAdditionalBinaryFunctions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineFunctionsDescriptor fragmentAdditionalBinaryFunctions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTLFunction> fragmentAdditionalBinaryFunctions() {
        try {
            long result = (long) MH_fragmentAdditionalBinaryFunctions.invokeExact(this.handle, SEL_fragmentAdditionalBinaryFunctions);
            return result == 0L ? null : new NSArray<>(result, MTLFunction::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineFunctionsDescriptor setFragmentAdditionalBinaryFunctions:]} */
    public void setFragmentAdditionalBinaryFunctions(@Nullable final NSArray<MTLFunction> fragmentAdditionalBinaryFunctions) {
        try {
            MH_setFragmentAdditionalBinaryFunctions_.invokeExact(this.handle, SEL_setFragmentAdditionalBinaryFunctions_, fragmentAdditionalBinaryFunctions == null ? 0L : fragmentAdditionalBinaryFunctions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineFunctionsDescriptor tileAdditionalBinaryFunctions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTLFunction> tileAdditionalBinaryFunctions() {
        try {
            long result = (long) MH_tileAdditionalBinaryFunctions.invokeExact(this.handle, SEL_tileAdditionalBinaryFunctions);
            return result == 0L ? null : new NSArray<>(result, MTLFunction::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineFunctionsDescriptor setTileAdditionalBinaryFunctions:]} */
    public void setTileAdditionalBinaryFunctions(@Nullable final NSArray<MTLFunction> tileAdditionalBinaryFunctions) {
        try {
            MH_setTileAdditionalBinaryFunctions_.invokeExact(this.handle, SEL_setTileAdditionalBinaryFunctions_, tileAdditionalBinaryFunctions == null ? 0L : tileAdditionalBinaryFunctions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
