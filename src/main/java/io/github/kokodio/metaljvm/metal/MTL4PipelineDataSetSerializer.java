package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSData;
import io.github.kokodio.metaljvm.foundation.NSErrorException;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.foundation.NSURL;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4PipelineDataSetSerializer}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4pipelinedatasetserializer">Apple documentation</a>
 */
public class MTL4PipelineDataSetSerializer extends NSObject {
    private static final long SEL_serializeAsArchiveAndFlushToURL_error_ = ObjC.selector("serializeAsArchiveAndFlushToURL:error:");
    private static final MethodHandle MH_serializeAsArchiveAndFlushToURL_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_serializeAsPipelinesScriptWithError_ = ObjC.selector("serializeAsPipelinesScriptWithError:");
    private static final MethodHandle MH_serializeAsPipelinesScriptWithError_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public MTL4PipelineDataSetSerializer(final long handle) {
        super(handle);
    }

    /** {@code -[MTL4PipelineDataSetSerializer serializeAsArchiveAndFlushToURL:error:]} */
    public void serializeAsArchiveAndFlushToURL(final NSURL url) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_serializeAsArchiveAndFlushToURL_error_.invokeExact(this.handle, SEL_serializeAsArchiveAndFlushToURL_error_, url.handle(), errorOut.address());
            if (!result) {
                throw NSErrorException.of("serializeAsArchiveAndFlushToURL:error:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4PipelineDataSetSerializer serializeAsPipelinesScriptWithError:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSData serializeAsPipelinesScript() {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_serializeAsPipelinesScriptWithError_.invokeExact(this.handle, SEL_serializeAsPipelinesScriptWithError_, errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("serializeAsPipelinesScriptWithError:", errorOut.get(JAVA_LONG, 0L));
            }
            return new NSData(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
