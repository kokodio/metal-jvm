package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLVertexAttribute}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlvertexattribute">Apple documentation</a>
 */
public class MTLVertexAttribute extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLVertexAttribute");
    private static final long SEL_name = ObjC.selector("name");
    private static final MethodHandle MH_name = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_attributeIndex = ObjC.selector("attributeIndex");
    private static final MethodHandle MH_attributeIndex = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_attributeType = ObjC.selector("attributeType");
    private static final MethodHandle MH_attributeType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isActive = ObjC.selector("isActive");
    private static final MethodHandle MH_isActive = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isPatchData = ObjC.selector("isPatchData");
    private static final MethodHandle MH_isPatchData = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isPatchControlPointData = ObjC.selector("isPatchControlPointData");
    private static final MethodHandle MH_isPatchControlPointData = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLVertexAttribute(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLVertexAttribute alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLVertexAttribute alloc() {
        try {
            return new MTLVertexAttribute((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLVertexAttribute init]} */
    public MTLVertexAttribute init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLVertexAttribute name]} */
    public String name() {
        try {
            long result = (long) MH_name.invokeExact(this.handle, SEL_name);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLVertexAttribute attributeIndex]} */
    public long attributeIndex() {
        try {
            return (long) MH_attributeIndex.invokeExact(this.handle, SEL_attributeIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLVertexAttribute attributeType]} */
    public MTLDataType attributeType() {
        try {
            return MTLDataType.of((long) MH_attributeType.invokeExact(this.handle, SEL_attributeType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLVertexAttribute isActive]} */
    public boolean isActive() {
        try {
            return (boolean) MH_isActive.invokeExact(this.handle, SEL_isActive);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLVertexAttribute isPatchData]} */
    public boolean isPatchData() {
        try {
            return (boolean) MH_isPatchData.invokeExact(this.handle, SEL_isPatchData);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLVertexAttribute isPatchControlPointData]} */
    public boolean isPatchControlPointData() {
        try {
            return (boolean) MH_isPatchControlPointData.invokeExact(this.handle, SEL_isPatchControlPointData);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
