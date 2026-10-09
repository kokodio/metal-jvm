package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4BinaryFunction}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4binaryfunction">Apple documentation</a>
 */
public class MTL4BinaryFunction extends NSObject {
    private static final long SEL_name = ObjC.selector("name");
    private static final MethodHandle MH_name = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_functionType = ObjC.selector("functionType");
    private static final MethodHandle MH_functionType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTL4BinaryFunction(final long handle) {
        super(handle);
    }

    /** {@code -[MTL4BinaryFunction name]} */
    @Nullable
    public String name() {
        try {
            long result = (long) MH_name.invokeExact(this.handle, SEL_name);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4BinaryFunction functionType]} */
    public MTLFunctionType functionType() {
        try {
            return MTLFunctionType.of((long) MH_functionType.invokeExact(this.handle, SEL_functionType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
