package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLVertexDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlvertexdescriptor">Apple documentation</a>
 */
public class MTLVertexDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLVertexDescriptor");
    private static final long SEL_CLASS_vertexDescriptor = ObjC.selector("vertexDescriptor");
    private static final MethodHandle MH_CLASS_vertexDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_reset = ObjC.selector("reset");
    private static final MethodHandle MH_reset = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_layouts = ObjC.selector("layouts");
    private static final MethodHandle MH_layouts = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_attributes = ObjC.selector("attributes");
    private static final MethodHandle MH_attributes = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLVertexDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLVertexDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLVertexDescriptor alloc() {
        try {
            return new MTLVertexDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLVertexDescriptor init]} */
    public MTLVertexDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[MTLVertexDescriptor vertexDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static MTLVertexDescriptor vertexDescriptor() {
        try {
            long result = (long) MH_CLASS_vertexDescriptor.invokeExact(CLS, SEL_CLASS_vertexDescriptor);
            return new MTLVertexDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLVertexDescriptor reset]} */
    public void reset() {
        try {
            MH_reset.invokeExact(this.handle, SEL_reset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLVertexDescriptor layouts]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLVertexBufferLayoutDescriptorArray layouts() {
        try {
            long result = (long) MH_layouts.invokeExact(this.handle, SEL_layouts);
            return new MTLVertexBufferLayoutDescriptorArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLVertexDescriptor attributes]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLVertexAttributeDescriptorArray attributes() {
        try {
            long result = (long) MH_attributes.invokeExact(this.handle, SEL_attributes);
            return new MTLVertexAttributeDescriptorArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
