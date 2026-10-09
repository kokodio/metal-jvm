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
 * {@code MTLRenderPipelineReflection}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlrenderpipelinereflection">Apple documentation</a>
 */
public class MTLRenderPipelineReflection extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLRenderPipelineReflection");
    private static final long SEL_vertexBindings = ObjC.selector("vertexBindings");
    private static final MethodHandle MH_vertexBindings = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fragmentBindings = ObjC.selector("fragmentBindings");
    private static final MethodHandle MH_fragmentBindings = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tileBindings = ObjC.selector("tileBindings");
    private static final MethodHandle MH_tileBindings = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_objectBindings = ObjC.selector("objectBindings");
    private static final MethodHandle MH_objectBindings = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_meshBindings = ObjC.selector("meshBindings");
    private static final MethodHandle MH_meshBindings = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_vertexArguments = ObjC.selector("vertexArguments");
    private static final MethodHandle MH_vertexArguments = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fragmentArguments = ObjC.selector("fragmentArguments");
    private static final MethodHandle MH_fragmentArguments = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tileArguments = ObjC.selector("tileArguments");
    private static final MethodHandle MH_tileArguments = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLRenderPipelineReflection(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLRenderPipelineReflection alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLRenderPipelineReflection alloc() {
        try {
            return new MTLRenderPipelineReflection((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPipelineReflection init]} */
    public MTLRenderPipelineReflection init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineReflection vertexBindings]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLBinding> vertexBindings() {
        try {
            long result = (long) MH_vertexBindings.invokeExact(this.handle, SEL_vertexBindings);
            return new NSArray<>(result, MTLBinding::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineReflection fragmentBindings]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLBinding> fragmentBindings() {
        try {
            long result = (long) MH_fragmentBindings.invokeExact(this.handle, SEL_fragmentBindings);
            return new NSArray<>(result, MTLBinding::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineReflection tileBindings]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLBinding> tileBindings() {
        try {
            long result = (long) MH_tileBindings.invokeExact(this.handle, SEL_tileBindings);
            return new NSArray<>(result, MTLBinding::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineReflection objectBindings]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLBinding> objectBindings() {
        try {
            long result = (long) MH_objectBindings.invokeExact(this.handle, SEL_objectBindings);
            return new NSArray<>(result, MTLBinding::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineReflection meshBindings]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLBinding> meshBindings() {
        try {
            long result = (long) MH_meshBindings.invokeExact(this.handle, SEL_meshBindings);
            return new NSArray<>(result, MTLBinding::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineReflection vertexArguments]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTLArgument> vertexArguments() {
        try {
            long result = (long) MH_vertexArguments.invokeExact(this.handle, SEL_vertexArguments);
            return result == 0L ? null : new NSArray<>(result, MTLArgument::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineReflection fragmentArguments]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTLArgument> fragmentArguments() {
        try {
            long result = (long) MH_fragmentArguments.invokeExact(this.handle, SEL_fragmentArguments);
            return result == 0L ? null : new NSArray<>(result, MTLArgument::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPipelineReflection tileArguments]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTLArgument> tileArguments() {
        try {
            long result = (long) MH_tileArguments.invokeExact(this.handle, SEL_tileArguments);
            return result == 0L ? null : new NSArray<>(result, MTLArgument::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
