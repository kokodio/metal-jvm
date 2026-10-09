package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLFunctionStitchingFunctionNode}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlfunctionstitchingfunctionnode">Apple documentation</a>
 */
public class MTLFunctionStitchingFunctionNode extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLFunctionStitchingFunctionNode");
    private static final long SEL_initWithName_arguments_controlDependencies_ = ObjC.selector("initWithName:arguments:controlDependencies:");
    private static final MethodHandle MH_initWithName_arguments_controlDependencies_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_name = ObjC.selector("name");
    private static final MethodHandle MH_name = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setName_ = ObjC.selector("setName:");
    private static final MethodHandle MH_setName_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_arguments = ObjC.selector("arguments");
    private static final MethodHandle MH_arguments = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setArguments_ = ObjC.selector("setArguments:");
    private static final MethodHandle MH_setArguments_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_controlDependencies = ObjC.selector("controlDependencies");
    private static final MethodHandle MH_controlDependencies = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setControlDependencies_ = ObjC.selector("setControlDependencies:");
    private static final MethodHandle MH_setControlDependencies_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLFunctionStitchingFunctionNode(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLFunctionStitchingFunctionNode alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLFunctionStitchingFunctionNode alloc() {
        try {
            return new MTLFunctionStitchingFunctionNode((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionStitchingFunctionNode init]} */
    public MTLFunctionStitchingFunctionNode init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionStitchingFunctionNode initWithName:arguments:controlDependencies:]} */
    public MTLFunctionStitchingFunctionNode init(final String name, final NSArray<MTLFunctionStitchingNode> arguments, final NSArray<MTLFunctionStitchingFunctionNode> controlDependencies) {
        final long nsName = ObjC.nsString(name);
        try {
            long result = (long) MH_initWithName_arguments_controlDependencies_.invokeExact(this.handle, SEL_initWithName_arguments_controlDependencies_, nsName, arguments.handle(), controlDependencies.handle());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
        }
    }

    /** {@code -[MTLFunctionStitchingFunctionNode name]} */
    public String name() {
        try {
            long result = (long) MH_name.invokeExact(this.handle, SEL_name);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionStitchingFunctionNode setName:]} */
    public void setName(final String name) {
        final long nsName = ObjC.nsString(name);
        try {
            MH_setName_.invokeExact(this.handle, SEL_setName_, nsName);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
        }
    }

    /**
     * {@code -[MTLFunctionStitchingFunctionNode arguments]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLFunctionStitchingNode> arguments() {
        try {
            long result = (long) MH_arguments.invokeExact(this.handle, SEL_arguments);
            return new NSArray<>(result, MTLFunctionStitchingNode::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionStitchingFunctionNode setArguments:]} */
    public void setArguments(final NSArray<MTLFunctionStitchingNode> arguments) {
        try {
            MH_setArguments_.invokeExact(this.handle, SEL_setArguments_, arguments.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFunctionStitchingFunctionNode controlDependencies]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLFunctionStitchingFunctionNode> controlDependencies() {
        try {
            long result = (long) MH_controlDependencies.invokeExact(this.handle, SEL_controlDependencies);
            return new NSArray<>(result, MTLFunctionStitchingFunctionNode::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionStitchingFunctionNode setControlDependencies:]} */
    public void setControlDependencies(final NSArray<MTLFunctionStitchingFunctionNode> controlDependencies) {
        try {
            MH_setControlDependencies_.invokeExact(this.handle, SEL_setControlDependencies_, controlDependencies.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
