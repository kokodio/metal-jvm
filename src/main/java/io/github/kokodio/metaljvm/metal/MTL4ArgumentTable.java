package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4ArgumentTable}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4argumenttable">Apple documentation</a>
 */
public class MTL4ArgumentTable extends NSObject {
    private static final long SEL_setAddress_atIndex_ = ObjC.selector("setAddress:atIndex:");
    private static final MethodHandle MH_setAddress_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAddress_attributeStride_atIndex_ = ObjC.selector("setAddress:attributeStride:atIndex:");
    private static final MethodHandle MH_setAddress_attributeStride_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setResource_atBufferIndex_ = ObjC.selector("setResource:atBufferIndex:");
    private static final MethodHandle MH_setResource_atBufferIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTexture_atIndex_ = ObjC.selector("setTexture:atIndex:");
    private static final MethodHandle MH_setTexture_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSamplerState_atIndex_ = ObjC.selector("setSamplerState:atIndex:");
    private static final MethodHandle MH_setSamplerState_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTL4ArgumentTable(final long handle) {
        super(handle);
    }

    /** {@code -[MTL4ArgumentTable setAddress:atIndex:]} */
    public void setAddress(final long gpuAddress, final long bindingIndex) {
        try {
            MH_setAddress_atIndex_.invokeExact(this.handle, SEL_setAddress_atIndex_, gpuAddress, bindingIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ArgumentTable setAddress:attributeStride:atIndex:]} */
    public void setAddress(final long gpuAddress, final long stride, final long bindingIndex) {
        try {
            MH_setAddress_attributeStride_atIndex_.invokeExact(this.handle, SEL_setAddress_attributeStride_atIndex_, gpuAddress, stride, bindingIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ArgumentTable setResource:atBufferIndex:]} */
    public void setResource(final MTLResourceID resourceID, final long bindingIndex) {
        try {
            MH_setResource_atBufferIndex_.invokeExact(this.handle, SEL_setResource_atBufferIndex_, resourceID._impl(), bindingIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ArgumentTable setTexture:atIndex:]} */
    public void setTexture(final MTLResourceID resourceID, final long bindingIndex) {
        try {
            MH_setTexture_atIndex_.invokeExact(this.handle, SEL_setTexture_atIndex_, resourceID._impl(), bindingIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4ArgumentTable setSamplerState:atIndex:]} */
    public void setSamplerState(final MTLResourceID resourceID, final long bindingIndex) {
        try {
            MH_setSamplerState_atIndex_.invokeExact(this.handle, SEL_setSamplerState_atIndex_, resourceID._impl(), bindingIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4ArgumentTable device]}
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

    /** {@code -[MTL4ArgumentTable label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
