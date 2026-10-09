package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4RenderPipelineDynamicLinkingDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4renderpipelinedynamiclinkingdescriptor">Apple documentation</a>
 */
public class MTL4RenderPipelineDynamicLinkingDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4RenderPipelineDynamicLinkingDescriptor");
    private static final long SEL_vertexLinkingDescriptor = ObjC.selector("vertexLinkingDescriptor");
    private static final MethodHandle MH_vertexLinkingDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fragmentLinkingDescriptor = ObjC.selector("fragmentLinkingDescriptor");
    private static final MethodHandle MH_fragmentLinkingDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tileLinkingDescriptor = ObjC.selector("tileLinkingDescriptor");
    private static final MethodHandle MH_tileLinkingDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_objectLinkingDescriptor = ObjC.selector("objectLinkingDescriptor");
    private static final MethodHandle MH_objectLinkingDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_meshLinkingDescriptor = ObjC.selector("meshLinkingDescriptor");
    private static final MethodHandle MH_meshLinkingDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4RenderPipelineDynamicLinkingDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4RenderPipelineDynamicLinkingDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4RenderPipelineDynamicLinkingDescriptor alloc() {
        try {
            return new MTL4RenderPipelineDynamicLinkingDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4RenderPipelineDynamicLinkingDescriptor init]} */
    public MTL4RenderPipelineDynamicLinkingDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4RenderPipelineDynamicLinkingDescriptor vertexLinkingDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTL4PipelineStageDynamicLinkingDescriptor vertexLinkingDescriptor() {
        try {
            long result = (long) MH_vertexLinkingDescriptor.invokeExact(this.handle, SEL_vertexLinkingDescriptor);
            return new MTL4PipelineStageDynamicLinkingDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4RenderPipelineDynamicLinkingDescriptor fragmentLinkingDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTL4PipelineStageDynamicLinkingDescriptor fragmentLinkingDescriptor() {
        try {
            long result = (long) MH_fragmentLinkingDescriptor.invokeExact(this.handle, SEL_fragmentLinkingDescriptor);
            return new MTL4PipelineStageDynamicLinkingDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4RenderPipelineDynamicLinkingDescriptor tileLinkingDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTL4PipelineStageDynamicLinkingDescriptor tileLinkingDescriptor() {
        try {
            long result = (long) MH_tileLinkingDescriptor.invokeExact(this.handle, SEL_tileLinkingDescriptor);
            return new MTL4PipelineStageDynamicLinkingDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4RenderPipelineDynamicLinkingDescriptor objectLinkingDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTL4PipelineStageDynamicLinkingDescriptor objectLinkingDescriptor() {
        try {
            long result = (long) MH_objectLinkingDescriptor.invokeExact(this.handle, SEL_objectLinkingDescriptor);
            return new MTL4PipelineStageDynamicLinkingDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4RenderPipelineDynamicLinkingDescriptor meshLinkingDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTL4PipelineStageDynamicLinkingDescriptor meshLinkingDescriptor() {
        try {
            long result = (long) MH_meshLinkingDescriptor.invokeExact(this.handle, SEL_meshLinkingDescriptor);
            return new MTL4PipelineStageDynamicLinkingDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
