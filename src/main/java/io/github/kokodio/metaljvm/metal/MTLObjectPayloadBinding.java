package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLObjectPayloadBinding}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlobjectpayloadbinding">Apple documentation</a>
 */
public class MTLObjectPayloadBinding extends MTLBinding {
    private static final long SEL_objectPayloadAlignment = ObjC.selector("objectPayloadAlignment");
    private static final MethodHandle MH_objectPayloadAlignment = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_objectPayloadDataSize = ObjC.selector("objectPayloadDataSize");
    private static final MethodHandle MH_objectPayloadDataSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLObjectPayloadBinding(final long handle) {
        super(handle);
    }

    /** {@code -[MTLObjectPayloadBinding objectPayloadAlignment]} */
    public long objectPayloadAlignment() {
        try {
            return (long) MH_objectPayloadAlignment.invokeExact(this.handle, SEL_objectPayloadAlignment);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLObjectPayloadBinding objectPayloadDataSize]} */
    public long objectPayloadDataSize() {
        try {
            return (long) MH_objectPayloadDataSize.invokeExact(this.handle, SEL_objectPayloadDataSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
