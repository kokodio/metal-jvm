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
 * {@code MTL4PipelineStageDynamicLinkingDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4pipelinestagedynamiclinkingdescriptor">Apple documentation</a>
 */
public class MTL4PipelineStageDynamicLinkingDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4PipelineStageDynamicLinkingDescriptor");
    private static final long SEL_maxCallStackDepth = ObjC.selector("maxCallStackDepth");
    private static final MethodHandle MH_maxCallStackDepth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxCallStackDepth_ = ObjC.selector("setMaxCallStackDepth:");
    private static final MethodHandle MH_setMaxCallStackDepth_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_binaryLinkedFunctions = ObjC.selector("binaryLinkedFunctions");
    private static final MethodHandle MH_binaryLinkedFunctions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBinaryLinkedFunctions_ = ObjC.selector("setBinaryLinkedFunctions:");
    private static final MethodHandle MH_setBinaryLinkedFunctions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_preloadedLibraries = ObjC.selector("preloadedLibraries");
    private static final MethodHandle MH_preloadedLibraries = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPreloadedLibraries_ = ObjC.selector("setPreloadedLibraries:");
    private static final MethodHandle MH_setPreloadedLibraries_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4PipelineStageDynamicLinkingDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4PipelineStageDynamicLinkingDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4PipelineStageDynamicLinkingDescriptor alloc() {
        try {
            return new MTL4PipelineStageDynamicLinkingDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4PipelineStageDynamicLinkingDescriptor init]} */
    public MTL4PipelineStageDynamicLinkingDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4PipelineStageDynamicLinkingDescriptor maxCallStackDepth]} */
    public long maxCallStackDepth() {
        try {
            return (long) MH_maxCallStackDepth.invokeExact(this.handle, SEL_maxCallStackDepth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4PipelineStageDynamicLinkingDescriptor setMaxCallStackDepth:]} */
    public void setMaxCallStackDepth(final long maxCallStackDepth) {
        try {
            MH_setMaxCallStackDepth_.invokeExact(this.handle, SEL_setMaxCallStackDepth_, maxCallStackDepth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4PipelineStageDynamicLinkingDescriptor binaryLinkedFunctions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTL4BinaryFunction> binaryLinkedFunctions() {
        try {
            long result = (long) MH_binaryLinkedFunctions.invokeExact(this.handle, SEL_binaryLinkedFunctions);
            return result == 0L ? null : new NSArray<>(result, MTL4BinaryFunction::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4PipelineStageDynamicLinkingDescriptor setBinaryLinkedFunctions:]} */
    public void setBinaryLinkedFunctions(@Nullable final NSArray<MTL4BinaryFunction> binaryLinkedFunctions) {
        try {
            MH_setBinaryLinkedFunctions_.invokeExact(this.handle, SEL_setBinaryLinkedFunctions_, binaryLinkedFunctions == null ? 0L : binaryLinkedFunctions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4PipelineStageDynamicLinkingDescriptor preloadedLibraries]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLDynamicLibrary> preloadedLibraries() {
        try {
            long result = (long) MH_preloadedLibraries.invokeExact(this.handle, SEL_preloadedLibraries);
            return new NSArray<>(result, MTLDynamicLibrary::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4PipelineStageDynamicLinkingDescriptor setPreloadedLibraries:]} */
    public void setPreloadedLibraries(final NSArray<MTLDynamicLibrary> preloadedLibraries) {
        try {
            MH_setPreloadedLibraries_.invokeExact(this.handle, SEL_setPreloadedLibraries_, preloadedLibraries.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
