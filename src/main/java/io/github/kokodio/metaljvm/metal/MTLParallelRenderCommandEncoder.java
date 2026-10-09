package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLParallelRenderCommandEncoder}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlparallelrendercommandencoder">Apple documentation</a>
 */
public class MTLParallelRenderCommandEncoder extends MTLCommandEncoder {
    private static final long SEL_renderCommandEncoder = ObjC.selector("renderCommandEncoder");
    private static final MethodHandle MH_renderCommandEncoder = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setColorStoreAction_atIndex_ = ObjC.selector("setColorStoreAction:atIndex:");
    private static final MethodHandle MH_setColorStoreAction_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthStoreAction_ = ObjC.selector("setDepthStoreAction:");
    private static final MethodHandle MH_setDepthStoreAction_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStencilStoreAction_ = ObjC.selector("setStencilStoreAction:");
    private static final MethodHandle MH_setStencilStoreAction_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setColorStoreActionOptions_atIndex_ = ObjC.selector("setColorStoreActionOptions:atIndex:");
    private static final MethodHandle MH_setColorStoreActionOptions_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthStoreActionOptions_ = ObjC.selector("setDepthStoreActionOptions:");
    private static final MethodHandle MH_setDepthStoreActionOptions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStencilStoreActionOptions_ = ObjC.selector("setStencilStoreActionOptions:");
    private static final MethodHandle MH_setStencilStoreActionOptions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLParallelRenderCommandEncoder(final long handle) {
        super(handle);
    }

    /**
     * {@code -[MTLParallelRenderCommandEncoder renderCommandEncoder]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLRenderCommandEncoder renderCommandEncoder() {
        try {
            long result = (long) MH_renderCommandEncoder.invokeExact(this.handle, SEL_renderCommandEncoder);
            return result == 0L ? null : new MTLRenderCommandEncoder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLParallelRenderCommandEncoder setColorStoreAction:atIndex:]} */
    public void setColorStoreAction(final MTLStoreAction storeAction, final long colorAttachmentIndex) {
        try {
            MH_setColorStoreAction_atIndex_.invokeExact(this.handle, SEL_setColorStoreAction_atIndex_, storeAction.value, colorAttachmentIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLParallelRenderCommandEncoder setDepthStoreAction:]} */
    public void setDepthStoreAction(final MTLStoreAction storeAction) {
        try {
            MH_setDepthStoreAction_.invokeExact(this.handle, SEL_setDepthStoreAction_, storeAction.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLParallelRenderCommandEncoder setStencilStoreAction:]} */
    public void setStencilStoreAction(final MTLStoreAction storeAction) {
        try {
            MH_setStencilStoreAction_.invokeExact(this.handle, SEL_setStencilStoreAction_, storeAction.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLParallelRenderCommandEncoder setColorStoreActionOptions:atIndex:]}
     *
     * @param storeActionOptions a combination of {@link MTLStoreActionOptions} flags
     */
    public void setColorStoreActionOptions(final long storeActionOptions, final long colorAttachmentIndex) {
        try {
            MH_setColorStoreActionOptions_atIndex_.invokeExact(this.handle, SEL_setColorStoreActionOptions_atIndex_, storeActionOptions, colorAttachmentIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLParallelRenderCommandEncoder setDepthStoreActionOptions:]}
     *
     * @param storeActionOptions a combination of {@link MTLStoreActionOptions} flags
     */
    public void setDepthStoreActionOptions(final long storeActionOptions) {
        try {
            MH_setDepthStoreActionOptions_.invokeExact(this.handle, SEL_setDepthStoreActionOptions_, storeActionOptions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLParallelRenderCommandEncoder setStencilStoreActionOptions:]}
     *
     * @param storeActionOptions a combination of {@link MTLStoreActionOptions} flags
     */
    public void setStencilStoreActionOptions(final long storeActionOptions) {
        try {
            MH_setStencilStoreActionOptions_.invokeExact(this.handle, SEL_setStencilStoreActionOptions_, storeActionOptions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
