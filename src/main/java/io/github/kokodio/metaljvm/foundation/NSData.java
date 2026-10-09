package io.github.kokodio.metaljvm.foundation;

import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code NSData}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsdata">Apple documentation</a>
 */
public class NSData extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Foundation");
    private static final long CLS = ObjC.clazz("NSData");
    private static final long SEL_length = ObjC.selector("length");
    private static final MethodHandle MH_length = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bytes = ObjC.selector("bytes");
    private static final MethodHandle MH_bytes = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getBytes_length_ = ObjC.selector("getBytes:length:");
    private static final MethodHandle MH_getBytes_length_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getBytes_range_ = ObjC.selector("getBytes:range:");
    private static final MethodHandle MH_getBytes_range_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isEqualToData_ = ObjC.selector("isEqualToData:");
    private static final MethodHandle MH_isEqualToData_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_subdataWithRange_ = ObjC.selector("subdataWithRange:");
    private static final MethodHandle MH_subdataWithRange_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_writeToFile_atomically_ = ObjC.selector("writeToFile:atomically:");
    private static final MethodHandle MH_writeToFile_atomically_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_writeToURL_atomically_ = ObjC.selector("writeToURL:atomically:");
    private static final MethodHandle MH_writeToURL_atomically_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_writeToFile_options_error_ = ObjC.selector("writeToFile:options:error:");
    private static final MethodHandle MH_writeToFile_options_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_writeToURL_options_error_ = ObjC.selector("writeToURL:options:error:");
    private static final MethodHandle MH_writeToURL_options_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rangeOfData_options_range_ = ObjC.selector("rangeOfData:options:range:");
    private static final MethodHandle MH_rangeOfData_options_range_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRange.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_enumerateByteRangesUsingBlock_ = ObjC.selector("enumerateByteRangesUsingBlock:");
    private static final MethodHandle MH_enumerateByteRangesUsingBlock_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_description = ObjC.selector("description");
    private static final MethodHandle MH_description = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_data = ObjC.selector("data");
    private static final MethodHandle MH_CLASS_data = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_dataWithBytes_length_ = ObjC.selector("dataWithBytes:length:");
    private static final MethodHandle MH_CLASS_dataWithBytes_length_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_dataWithBytesNoCopy_length_ = ObjC.selector("dataWithBytesNoCopy:length:");
    private static final MethodHandle MH_CLASS_dataWithBytesNoCopy_length_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_dataWithBytesNoCopy_length_freeWhenDone_ = ObjC.selector("dataWithBytesNoCopy:length:freeWhenDone:");
    private static final MethodHandle MH_CLASS_dataWithBytesNoCopy_length_freeWhenDone_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_CLASS_dataWithContentsOfFile_options_error_ = ObjC.selector("dataWithContentsOfFile:options:error:");
    private static final MethodHandle MH_CLASS_dataWithContentsOfFile_options_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_dataWithContentsOfURL_options_error_ = ObjC.selector("dataWithContentsOfURL:options:error:");
    private static final MethodHandle MH_CLASS_dataWithContentsOfURL_options_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_dataWithContentsOfFile_ = ObjC.selector("dataWithContentsOfFile:");
    private static final MethodHandle MH_CLASS_dataWithContentsOfFile_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_dataWithContentsOfURL_ = ObjC.selector("dataWithContentsOfURL:");
    private static final MethodHandle MH_CLASS_dataWithContentsOfURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithBytes_length_ = ObjC.selector("initWithBytes:length:");
    private static final MethodHandle MH_initWithBytes_length_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithBytesNoCopy_length_ = ObjC.selector("initWithBytesNoCopy:length:");
    private static final MethodHandle MH_initWithBytesNoCopy_length_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithBytesNoCopy_length_freeWhenDone_ = ObjC.selector("initWithBytesNoCopy:length:freeWhenDone:");
    private static final MethodHandle MH_initWithBytesNoCopy_length_freeWhenDone_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_initWithBytesNoCopy_length_deallocator_ = ObjC.selector("initWithBytesNoCopy:length:deallocator:");
    private static final MethodHandle MH_initWithBytesNoCopy_length_deallocator_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithContentsOfFile_options_error_ = ObjC.selector("initWithContentsOfFile:options:error:");
    private static final MethodHandle MH_initWithContentsOfFile_options_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithContentsOfURL_options_error_ = ObjC.selector("initWithContentsOfURL:options:error:");
    private static final MethodHandle MH_initWithContentsOfURL_options_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithContentsOfFile_ = ObjC.selector("initWithContentsOfFile:");
    private static final MethodHandle MH_initWithContentsOfFile_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithContentsOfURL_ = ObjC.selector("initWithContentsOfURL:");
    private static final MethodHandle MH_initWithContentsOfURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithData_ = ObjC.selector("initWithData:");
    private static final MethodHandle MH_initWithData_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_dataWithData_ = ObjC.selector("dataWithData:");
    private static final MethodHandle MH_CLASS_dataWithData_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithBase64EncodedString_options_ = ObjC.selector("initWithBase64EncodedString:options:");
    private static final MethodHandle MH_initWithBase64EncodedString_options_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_base64EncodedStringWithOptions_ = ObjC.selector("base64EncodedStringWithOptions:");
    private static final MethodHandle MH_base64EncodedStringWithOptions_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithBase64EncodedData_options_ = ObjC.selector("initWithBase64EncodedData:options:");
    private static final MethodHandle MH_initWithBase64EncodedData_options_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_base64EncodedDataWithOptions_ = ObjC.selector("base64EncodedDataWithOptions:");
    private static final MethodHandle MH_base64EncodedDataWithOptions_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_decompressedDataUsingAlgorithm_error_ = ObjC.selector("decompressedDataUsingAlgorithm:error:");
    private static final MethodHandle MH_decompressedDataUsingAlgorithm_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_compressedDataUsingAlgorithm_error_ = ObjC.selector("compressedDataUsingAlgorithm:error:");
    private static final MethodHandle MH_compressedDataUsingAlgorithm_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getBytes_ = ObjC.selector("getBytes:");
    private static final MethodHandle MH_getBytes_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_dataWithContentsOfMappedFile_ = ObjC.selector("dataWithContentsOfMappedFile:");
    private static final MethodHandle MH_CLASS_dataWithContentsOfMappedFile_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithContentsOfMappedFile_ = ObjC.selector("initWithContentsOfMappedFile:");
    private static final MethodHandle MH_initWithContentsOfMappedFile_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithBase64Encoding_ = ObjC.selector("initWithBase64Encoding:");
    private static final MethodHandle MH_initWithBase64Encoding_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_base64Encoding = ObjC.selector("base64Encoding");
    private static final MethodHandle MH_base64Encoding = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public NSData(final long handle) {
        super(handle);
    }

    /**
     * {@code +[NSData alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static NSData alloc() {
        try {
            return new NSData((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSData init]} */
    public NSData init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSData length]} */
    public long length() {
        try {
            return (long) MH_length.invokeExact(this.handle, SEL_length);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSData bytes]} */
    public MemorySegment bytes() {
        try {
            return MemorySegment.ofAddress((long) MH_bytes.invokeExact(this.handle, SEL_bytes));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSData getBytes:length:]} */
    public void getBytes(final MemorySegment buffer, final long length) {
        try {
            MH_getBytes_length_.invokeExact(this.handle, SEL_getBytes_length_, buffer.address(), length);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSData getBytes:range:]} */
    public void getBytes(final MemorySegment buffer, final NSRange range) {
        try {
            MH_getBytes_range_.invokeExact(this.handle, SEL_getBytes_range_, buffer.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSData isEqualToData:]} */
    public boolean isEqualToData(final NSData other) {
        try {
            return (boolean) MH_isEqualToData_.invokeExact(this.handle, SEL_isEqualToData_, other.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSData subdataWithRange:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSData subdata(final NSRange range) {
        try {
            long result = (long) MH_subdataWithRange_.invokeExact(this.handle, SEL_subdataWithRange_, range.location(), range.length());
            return new NSData(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSData writeToFile:atomically:]} */
    public boolean writeToFile(final String path, final boolean useAuxiliaryFile) {
        final long nsPath = ObjC.nsString(path);
        try {
            return (boolean) MH_writeToFile_atomically_.invokeExact(this.handle, SEL_writeToFile_atomically_, nsPath, useAuxiliaryFile);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /** {@code -[NSData writeToURL:atomically:]} */
    public boolean writeToURL(final NSURL url, final boolean atomically) {
        try {
            return (boolean) MH_writeToURL_atomically_.invokeExact(this.handle, SEL_writeToURL_atomically_, url.handle(), atomically);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSData writeToFile:options:error:]}
     *
     * @param writeOptionsMask a combination of {@link NSDataWritingOptions} flags
     */
    public void writeToFile(final String path, final long writeOptionsMask) {
        final long nsPath = ObjC.nsString(path);
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_writeToFile_options_error_.invokeExact(this.handle, SEL_writeToFile_options_error_, nsPath, writeOptionsMask, errorOut.address());
            if (!result) {
                throw NSErrorException.of("writeToFile:options:error:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /**
     * {@code -[NSData writeToURL:options:error:]}
     *
     * @param writeOptionsMask a combination of {@link NSDataWritingOptions} flags
     */
    public void writeToURL(final NSURL url, final long writeOptionsMask) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_writeToURL_options_error_.invokeExact(this.handle, SEL_writeToURL_options_error_, url.handle(), writeOptionsMask, errorOut.address());
            if (!result) {
                throw NSErrorException.of("writeToURL:options:error:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSData rangeOfData:options:range:]}
     *
     * @param mask a combination of {@link NSDataSearchOptions} flags
     */
    public NSRange rangeOfData(final NSData dataToFind, final long mask, final NSRange searchRange) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRange.read((MemorySegment) MH_rangeOfData_options_range_.invokeExact((SegmentAllocator) stack, this.handle, SEL_rangeOfData_options_range_, dataToFind.handle(), mask, searchRange.location(), searchRange.length()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSData enumerateByteRangesUsingBlock:]} */
    public void enumerateByteRangesUsingBlock(final long block) {
        try {
            MH_enumerateByteRangesUsingBlock_.invokeExact(this.handle, SEL_enumerateByteRangesUsingBlock_, block);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSData description]} */
    public String description() {
        try {
            long result = (long) MH_description.invokeExact(this.handle, SEL_description);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSData data]} */
    public static NSData data() {
        try {
            long result = (long) MH_CLASS_data.invokeExact(CLS, SEL_CLASS_data);
            return new NSData(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSData dataWithBytes:length:]} */
    public static NSData dataWithBytes(final MemorySegment bytes, final long length) {
        try {
            long result = (long) MH_CLASS_dataWithBytes_length_.invokeExact(CLS, SEL_CLASS_dataWithBytes_length_, bytes.address(), length);
            return new NSData(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSData dataWithBytesNoCopy:length:]} */
    public static NSData dataWithBytesNoCopy(final MemorySegment bytes, final long length) {
        try {
            long result = (long) MH_CLASS_dataWithBytesNoCopy_length_.invokeExact(CLS, SEL_CLASS_dataWithBytesNoCopy_length_, bytes.address(), length);
            return new NSData(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSData dataWithBytesNoCopy:length:freeWhenDone:]} */
    public static NSData dataWithBytesNoCopy(final MemorySegment bytes, final long length, final boolean b) {
        try {
            long result = (long) MH_CLASS_dataWithBytesNoCopy_length_freeWhenDone_.invokeExact(CLS, SEL_CLASS_dataWithBytesNoCopy_length_freeWhenDone_, bytes.address(), length, b);
            return new NSData(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSData dataWithContentsOfFile:options:error:]}
     *
     * @param readOptionsMask a combination of {@link NSDataReadingOptions} flags
     */
    public static NSData dataWithContentsOfFile(final String path, final long readOptionsMask) {
        final long nsPath = ObjC.nsString(path);
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_CLASS_dataWithContentsOfFile_options_error_.invokeExact(CLS, SEL_CLASS_dataWithContentsOfFile_options_error_, nsPath, readOptionsMask, errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("dataWithContentsOfFile:options:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new NSData(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /**
     * {@code +[NSData dataWithContentsOfURL:options:error:]}
     *
     * @param readOptionsMask a combination of {@link NSDataReadingOptions} flags
     */
    public static NSData dataWithContentsOfURL(final NSURL url, final long readOptionsMask) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_CLASS_dataWithContentsOfURL_options_error_.invokeExact(CLS, SEL_CLASS_dataWithContentsOfURL_options_error_, url.handle(), readOptionsMask, errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("dataWithContentsOfURL:options:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new NSData(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSData dataWithContentsOfFile:]} */
    @Nullable
    public static NSData dataWithContentsOfFile(final String path) {
        final long nsPath = ObjC.nsString(path);
        try {
            long result = (long) MH_CLASS_dataWithContentsOfFile_.invokeExact(CLS, SEL_CLASS_dataWithContentsOfFile_, nsPath);
            return result == 0L ? null : new NSData(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /** {@code +[NSData dataWithContentsOfURL:]} */
    @Nullable
    public static NSData dataWithContentsOfURL(final NSURL url) {
        try {
            long result = (long) MH_CLASS_dataWithContentsOfURL_.invokeExact(CLS, SEL_CLASS_dataWithContentsOfURL_, url.handle());
            return result == 0L ? null : new NSData(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSData initWithBytes:length:]} */
    public NSData initWithBytes(final MemorySegment bytes, final long length) {
        try {
            long result = (long) MH_initWithBytes_length_.invokeExact(this.handle, SEL_initWithBytes_length_, bytes.address(), length);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSData initWithBytesNoCopy:length:]} */
    public NSData initWithBytesNoCopy(final MemorySegment bytes, final long length) {
        try {
            long result = (long) MH_initWithBytesNoCopy_length_.invokeExact(this.handle, SEL_initWithBytesNoCopy_length_, bytes.address(), length);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSData initWithBytesNoCopy:length:freeWhenDone:]} */
    public NSData initWithBytesNoCopy(final MemorySegment bytes, final long length, final boolean b) {
        try {
            long result = (long) MH_initWithBytesNoCopy_length_freeWhenDone_.invokeExact(this.handle, SEL_initWithBytesNoCopy_length_freeWhenDone_, bytes.address(), length, b);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSData initWithBytesNoCopy:length:deallocator:]} */
    public NSData initWithBytesNoCopy(final MemorySegment bytes, final long length, final long deallocator) {
        try {
            long result = (long) MH_initWithBytesNoCopy_length_deallocator_.invokeExact(this.handle, SEL_initWithBytesNoCopy_length_deallocator_, bytes.address(), length, deallocator);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSData initWithContentsOfFile:options:error:]}
     *
     * @param readOptionsMask a combination of {@link NSDataReadingOptions} flags
     */
    public NSData initWithContentsOfFile(final String path, final long readOptionsMask) {
        final long nsPath = ObjC.nsString(path);
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_initWithContentsOfFile_options_error_.invokeExact(this.handle, SEL_initWithContentsOfFile_options_error_, nsPath, readOptionsMask, errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("initWithContentsOfFile:options:error:", errorOut.get(JAVA_LONG, 0L));
            }
            this.handle = result;
            return this;
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /**
     * {@code -[NSData initWithContentsOfURL:options:error:]}
     *
     * @param readOptionsMask a combination of {@link NSDataReadingOptions} flags
     */
    public NSData initWithContentsOfURL(final NSURL url, final long readOptionsMask) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_initWithContentsOfURL_options_error_.invokeExact(this.handle, SEL_initWithContentsOfURL_options_error_, url.handle(), readOptionsMask, errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("initWithContentsOfURL:options:error:", errorOut.get(JAVA_LONG, 0L));
            }
            this.handle = result;
            return this;
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSData initWithContentsOfFile:]} */
    @Nullable
    public NSData initWithContentsOfFile(final String path) {
        final long nsPath = ObjC.nsString(path);
        try {
            long result = (long) MH_initWithContentsOfFile_.invokeExact(this.handle, SEL_initWithContentsOfFile_, nsPath);
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /** {@code -[NSData initWithContentsOfURL:]} */
    @Nullable
    public NSData initWithContentsOfURL(final NSURL url) {
        try {
            long result = (long) MH_initWithContentsOfURL_.invokeExact(this.handle, SEL_initWithContentsOfURL_, url.handle());
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSData initWithData:]} */
    public NSData initWithData(final NSData data) {
        try {
            long result = (long) MH_initWithData_.invokeExact(this.handle, SEL_initWithData_, data.handle());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSData dataWithData:]} */
    public static NSData dataWithData(final NSData data) {
        try {
            long result = (long) MH_CLASS_dataWithData_.invokeExact(CLS, SEL_CLASS_dataWithData_, data.handle());
            return new NSData(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSData initWithBase64EncodedString:options:]}
     *
     * @param options a combination of {@link NSDataBase64DecodingOptions} flags
     */
    @Nullable
    public NSData initWithBase64EncodedString(final String base64String, final long options) {
        final long nsBase64String = ObjC.nsString(base64String);
        try {
            long result = (long) MH_initWithBase64EncodedString_options_.invokeExact(this.handle, SEL_initWithBase64EncodedString_options_, nsBase64String, options);
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsBase64String);
        }
    }

    /**
     * {@code -[NSData base64EncodedStringWithOptions:]}
     *
     * @param options a combination of {@link NSDataBase64EncodingOptions} flags
     */
    public String base64EncodedString(final long options) {
        try {
            long result = (long) MH_base64EncodedStringWithOptions_.invokeExact(this.handle, SEL_base64EncodedStringWithOptions_, options);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSData initWithBase64EncodedData:options:]}
     *
     * @param options a combination of {@link NSDataBase64DecodingOptions} flags
     */
    @Nullable
    public NSData initWithBase64EncodedData(final NSData base64Data, final long options) {
        try {
            long result = (long) MH_initWithBase64EncodedData_options_.invokeExact(this.handle, SEL_initWithBase64EncodedData_options_, base64Data.handle(), options);
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSData base64EncodedDataWithOptions:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     *
     * @param options a combination of {@link NSDataBase64EncodingOptions} flags
     */
    public NSData base64EncodedData(final long options) {
        try {
            long result = (long) MH_base64EncodedDataWithOptions_.invokeExact(this.handle, SEL_base64EncodedDataWithOptions_, options);
            return new NSData(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSData decompressedDataUsingAlgorithm:error:]} */
    public NSData decompressedDataUsingAlgorithm(final NSDataCompressionAlgorithm algorithm) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_decompressedDataUsingAlgorithm_error_.invokeExact(this.handle, SEL_decompressedDataUsingAlgorithm_error_, algorithm.value, errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("decompressedDataUsingAlgorithm:error:", errorOut.get(JAVA_LONG, 0L));
            }
            this.handle = result;
            return this;
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSData compressedDataUsingAlgorithm:error:]} */
    public NSData compressedDataUsingAlgorithm(final NSDataCompressionAlgorithm algorithm) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_compressedDataUsingAlgorithm_error_.invokeExact(this.handle, SEL_compressedDataUsingAlgorithm_error_, algorithm.value, errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("compressedDataUsingAlgorithm:error:", errorOut.get(JAVA_LONG, 0L));
            }
            this.handle = result;
            return this;
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSData getBytes:]} */
    public void getBytes(final MemorySegment buffer) {
        try {
            MH_getBytes_.invokeExact(this.handle, SEL_getBytes_, buffer.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSData dataWithContentsOfMappedFile:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static NSObject dataWithContentsOfMappedFile(final String path) {
        final long nsPath = ObjC.nsString(path);
        try {
            long result = (long) MH_CLASS_dataWithContentsOfMappedFile_.invokeExact(CLS, SEL_CLASS_dataWithContentsOfMappedFile_, nsPath);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /**
     * {@code -[NSData initWithContentsOfMappedFile:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public NSObject initWithContentsOfMappedFile(final String path) {
        final long nsPath = ObjC.nsString(path);
        try {
            long result = (long) MH_initWithContentsOfMappedFile_.invokeExact(this.handle, SEL_initWithContentsOfMappedFile_, nsPath);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /**
     * {@code -[NSData initWithBase64Encoding:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public NSObject initWithBase64Encoding(final String base64String) {
        final long nsBase64String = ObjC.nsString(base64String);
        try {
            long result = (long) MH_initWithBase64Encoding_.invokeExact(this.handle, SEL_initWithBase64Encoding_, nsBase64String);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsBase64String);
        }
    }

    /** {@code -[NSData base64Encoding]} */
    public String base64Encoding() {
        try {
            long result = (long) MH_base64Encoding.invokeExact(this.handle, SEL_base64Encoding);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
