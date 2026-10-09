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
 * {@code MTLFunctionStitchingGraph}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlfunctionstitchinggraph">Apple documentation</a>
 */
public class MTLFunctionStitchingGraph extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLFunctionStitchingGraph");
    private static final long SEL_initWithFunctionName_nodes_outputNode_attributes_ = ObjC.selector("initWithFunctionName:nodes:outputNode:attributes:");
    private static final MethodHandle MH_initWithFunctionName_nodes_outputNode_attributes_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_functionName = ObjC.selector("functionName");
    private static final MethodHandle MH_functionName = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFunctionName_ = ObjC.selector("setFunctionName:");
    private static final MethodHandle MH_setFunctionName_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_nodes = ObjC.selector("nodes");
    private static final MethodHandle MH_nodes = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setNodes_ = ObjC.selector("setNodes:");
    private static final MethodHandle MH_setNodes_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_outputNode = ObjC.selector("outputNode");
    private static final MethodHandle MH_outputNode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOutputNode_ = ObjC.selector("setOutputNode:");
    private static final MethodHandle MH_setOutputNode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_attributes = ObjC.selector("attributes");
    private static final MethodHandle MH_attributes = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAttributes_ = ObjC.selector("setAttributes:");
    private static final MethodHandle MH_setAttributes_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLFunctionStitchingGraph(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLFunctionStitchingGraph alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLFunctionStitchingGraph alloc() {
        try {
            return new MTLFunctionStitchingGraph((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionStitchingGraph init]} */
    public MTLFunctionStitchingGraph init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionStitchingGraph initWithFunctionName:nodes:outputNode:attributes:]} */
    public MTLFunctionStitchingGraph init(final String functionName, final NSArray<MTLFunctionStitchingFunctionNode> nodes, @Nullable final MTLFunctionStitchingFunctionNode outputNode, final NSArray<MTLFunctionStitchingAttribute> attributes) {
        final long nsFunctionName = ObjC.nsString(functionName);
        try {
            long result = (long) MH_initWithFunctionName_nodes_outputNode_attributes_.invokeExact(this.handle, SEL_initWithFunctionName_nodes_outputNode_attributes_, nsFunctionName, nodes.handle(), outputNode == null ? 0L : outputNode.handle(), attributes.handle());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsFunctionName);
        }
    }

    /** {@code -[MTLFunctionStitchingGraph functionName]} */
    public String functionName() {
        try {
            long result = (long) MH_functionName.invokeExact(this.handle, SEL_functionName);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionStitchingGraph setFunctionName:]} */
    public void setFunctionName(final String functionName) {
        final long nsFunctionName = ObjC.nsString(functionName);
        try {
            MH_setFunctionName_.invokeExact(this.handle, SEL_setFunctionName_, nsFunctionName);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsFunctionName);
        }
    }

    /**
     * {@code -[MTLFunctionStitchingGraph nodes]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLFunctionStitchingFunctionNode> nodes() {
        try {
            long result = (long) MH_nodes.invokeExact(this.handle, SEL_nodes);
            return new NSArray<>(result, MTLFunctionStitchingFunctionNode::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionStitchingGraph setNodes:]} */
    public void setNodes(final NSArray<MTLFunctionStitchingFunctionNode> nodes) {
        try {
            MH_setNodes_.invokeExact(this.handle, SEL_setNodes_, nodes.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFunctionStitchingGraph outputNode]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLFunctionStitchingFunctionNode outputNode() {
        try {
            long result = (long) MH_outputNode.invokeExact(this.handle, SEL_outputNode);
            return result == 0L ? null : new MTLFunctionStitchingFunctionNode(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionStitchingGraph setOutputNode:]} */
    public void setOutputNode(@Nullable final MTLFunctionStitchingFunctionNode outputNode) {
        try {
            MH_setOutputNode_.invokeExact(this.handle, SEL_setOutputNode_, outputNode == null ? 0L : outputNode.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFunctionStitchingGraph attributes]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLFunctionStitchingAttribute> attributes() {
        try {
            long result = (long) MH_attributes.invokeExact(this.handle, SEL_attributes);
            return new NSArray<>(result, MTLFunctionStitchingAttribute::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionStitchingGraph setAttributes:]} */
    public void setAttributes(final NSArray<MTLFunctionStitchingAttribute> attributes) {
        try {
            MH_setAttributes_.invokeExact(this.handle, SEL_setAttributes_, attributes.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
