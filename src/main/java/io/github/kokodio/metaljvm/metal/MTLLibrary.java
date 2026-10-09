package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSErrorException;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.foundation.NSString;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLLibrary}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtllibrary">Apple documentation</a>
 */
public class MTLLibrary extends NSObject {
    private static final long SEL_newFunctionWithName_ = ObjC.selector("newFunctionWithName:");
    private static final MethodHandle MH_newFunctionWithName_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newFunctionWithName_constantValues_error_ = ObjC.selector("newFunctionWithName:constantValues:error:");
    private static final MethodHandle MH_newFunctionWithName_constantValues_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newFunctionWithName_constantValues_completionHandler_ = ObjC.selector("newFunctionWithName:constantValues:completionHandler:");
    private static final MethodHandle MH_newFunctionWithName_constantValues_completionHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_reflectionForFunctionWithName_ = ObjC.selector("reflectionForFunctionWithName:");
    private static final MethodHandle MH_reflectionForFunctionWithName_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newFunctionWithDescriptor_completionHandler_ = ObjC.selector("newFunctionWithDescriptor:completionHandler:");
    private static final MethodHandle MH_newFunctionWithDescriptor_completionHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newFunctionWithDescriptor_error_ = ObjC.selector("newFunctionWithDescriptor:error:");
    private static final MethodHandle MH_newFunctionWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newIntersectionFunctionWithDescriptor_completionHandler_ = ObjC.selector("newIntersectionFunctionWithDescriptor:completionHandler:");
    private static final MethodHandle MH_newIntersectionFunctionWithDescriptor_completionHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newIntersectionFunctionWithDescriptor_error_ = ObjC.selector("newIntersectionFunctionWithDescriptor:error:");
    private static final MethodHandle MH_newIntersectionFunctionWithDescriptor_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_device = ObjC.selector("device");
    private static final MethodHandle MH_device = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_functionNames = ObjC.selector("functionNames");
    private static final MethodHandle MH_functionNames = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_type = ObjC.selector("type");
    private static final MethodHandle MH_type = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_installName = ObjC.selector("installName");
    private static final MethodHandle MH_installName = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTLLibrary(final long handle) {
        super(handle);
    }

    /**
     * {@code -[MTLLibrary newFunctionWithName:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public MTLFunction newFunctionWithName(final String functionName) {
        final long nsFunctionName = ObjC.nsString(functionName);
        try {
            long result = (long) MH_newFunctionWithName_.invokeExact(this.handle, SEL_newFunctionWithName_, nsFunctionName);
            return result == 0L ? null : new MTLFunction(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsFunctionName);
        }
    }

    /**
     * {@code -[MTLLibrary newFunctionWithName:constantValues:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLFunction newFunctionWithName(final String name, final MTLFunctionConstantValues constantValues) {
        final long nsName = ObjC.nsString(name);
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newFunctionWithName_constantValues_error_.invokeExact(this.handle, SEL_newFunctionWithName_constantValues_error_, nsName, constantValues.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newFunctionWithName:constantValues:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLFunction(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
        }
    }

    /** {@code -[MTLLibrary newFunctionWithName:constantValues:completionHandler:]} */
    public void newFunctionWithName(final String name, final MTLFunctionConstantValues constantValues, final long completionHandler) {
        final long nsName = ObjC.nsString(name);
        try {
            MH_newFunctionWithName_constantValues_completionHandler_.invokeExact(this.handle, SEL_newFunctionWithName_constantValues_completionHandler_, nsName, constantValues.handle(), completionHandler);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
        }
    }

    /**
     * {@code -[MTLLibrary reflectionForFunctionWithName:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLFunctionReflection reflectionForFunction(final String functionName) {
        final long nsFunctionName = ObjC.nsString(functionName);
        try {
            long result = (long) MH_reflectionForFunctionWithName_.invokeExact(this.handle, SEL_reflectionForFunctionWithName_, nsFunctionName);
            return result == 0L ? null : new MTLFunctionReflection(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsFunctionName);
        }
    }

    /** {@code -[MTLLibrary newFunctionWithDescriptor:completionHandler:]} */
    public void newFunctionWithDescriptor(final MTLFunctionDescriptor descriptor, final long completionHandler) {
        try {
            MH_newFunctionWithDescriptor_completionHandler_.invokeExact(this.handle, SEL_newFunctionWithDescriptor_completionHandler_, descriptor.handle(), completionHandler);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLLibrary newFunctionWithDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLFunction newFunctionWithDescriptor(final MTLFunctionDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newFunctionWithDescriptor_error_.invokeExact(this.handle, SEL_newFunctionWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newFunctionWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLFunction(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLLibrary newIntersectionFunctionWithDescriptor:completionHandler:]} */
    public void newIntersectionFunction(final MTLIntersectionFunctionDescriptor descriptor, final long completionHandler) {
        try {
            MH_newIntersectionFunctionWithDescriptor_completionHandler_.invokeExact(this.handle, SEL_newIntersectionFunctionWithDescriptor_completionHandler_, descriptor.handle(), completionHandler);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLLibrary newIntersectionFunctionWithDescriptor:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public MTLFunction newIntersectionFunction(final MTLIntersectionFunctionDescriptor descriptor) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_newIntersectionFunctionWithDescriptor_error_.invokeExact(this.handle, SEL_newIntersectionFunctionWithDescriptor_error_, descriptor.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("newIntersectionFunctionWithDescriptor:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new MTLFunction(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLLibrary label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLLibrary setLabel:]} */
    public void setLabel(@Nullable final String label) {
        final long nsLabel = label == null ? 0L : ObjC.nsString(label);
        try {
            MH_setLabel_.invokeExact(this.handle, SEL_setLabel_, nsLabel);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsLabel);
        }
    }

    /**
     * {@code -[MTLLibrary device]}
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

    /**
     * {@code -[MTLLibrary functionNames]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<NSString> functionNames() {
        try {
            long result = (long) MH_functionNames.invokeExact(this.handle, SEL_functionNames);
            return new NSArray<>(result, NSString::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLLibrary type]} */
    public MTLLibraryType type() {
        try {
            return MTLLibraryType.of((long) MH_type.invokeExact(this.handle, SEL_type));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLLibrary installName]} */
    @Nullable
    public String installName() {
        try {
            long result = (long) MH_installName.invokeExact(this.handle, SEL_installName);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
