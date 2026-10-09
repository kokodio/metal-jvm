package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4StitchedFunctionDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4stitchedfunctiondescriptor">Apple documentation</a>
 */
public class MTL4StitchedFunctionDescriptor extends MTL4FunctionDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4StitchedFunctionDescriptor");
    private static final long SEL_functionGraph = ObjC.selector("functionGraph");
    private static final MethodHandle MH_functionGraph = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFunctionGraph_ = ObjC.selector("setFunctionGraph:");
    private static final MethodHandle MH_setFunctionGraph_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_functionDescriptors = ObjC.selector("functionDescriptors");
    private static final MethodHandle MH_functionDescriptors = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFunctionDescriptors_ = ObjC.selector("setFunctionDescriptors:");
    private static final MethodHandle MH_setFunctionDescriptors_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4StitchedFunctionDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4StitchedFunctionDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4StitchedFunctionDescriptor alloc() {
        try {
            return new MTL4StitchedFunctionDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4StitchedFunctionDescriptor init]} */
    public MTL4StitchedFunctionDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4StitchedFunctionDescriptor functionGraph]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLFunctionStitchingGraph functionGraph() {
        try {
            long result = (long) MH_functionGraph.invokeExact(this.handle, SEL_functionGraph);
            return result == 0L ? null : new MTLFunctionStitchingGraph(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4StitchedFunctionDescriptor setFunctionGraph:]} */
    public void setFunctionGraph(@Nullable final MTLFunctionStitchingGraph functionGraph) {
        try {
            MH_setFunctionGraph_.invokeExact(this.handle, SEL_setFunctionGraph_, functionGraph == null ? 0L : functionGraph.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4StitchedFunctionDescriptor functionDescriptors]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTL4FunctionDescriptor> functionDescriptors() {
        try {
            long result = (long) MH_functionDescriptors.invokeExact(this.handle, SEL_functionDescriptors);
            return result == 0L ? null : new NSArray<>(result, MTL4FunctionDescriptor::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4StitchedFunctionDescriptor setFunctionDescriptors:]} */
    public void setFunctionDescriptors(@Nullable final NSArray<MTL4FunctionDescriptor> functionDescriptors) {
        try {
            MH_setFunctionDescriptors_.invokeExact(this.handle, SEL_setFunctionDescriptors_, functionDescriptors == null ? 0L : functionDescriptors.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
