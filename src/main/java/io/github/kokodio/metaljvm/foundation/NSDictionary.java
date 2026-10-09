package io.github.kokodio.metaljvm.foundation;

import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;
import java.util.function.LongFunction;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code NSDictionary}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsdictionary">Apple documentation</a>
 */
public class NSDictionary<KeyType extends NSObject, ObjectType extends NSObject> extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Foundation");
    private static final long CLS = ObjC.clazz("NSDictionary");
    private static final long SEL_objectForKey_ = ObjC.selector("objectForKey:");
    private static final MethodHandle MH_objectForKey_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_keyEnumerator = ObjC.selector("keyEnumerator");
    private static final MethodHandle MH_keyEnumerator = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");
    private static final MethodHandle MH_init = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithObjects_forKeys_count_ = ObjC.selector("initWithObjects:forKeys:count:");
    private static final MethodHandle MH_initWithObjects_forKeys_count_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithCoder_ = ObjC.selector("initWithCoder:");
    private static final MethodHandle MH_initWithCoder_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_count = ObjC.selector("count");
    private static final MethodHandle MH_count = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_allKeysForObject_ = ObjC.selector("allKeysForObject:");
    private static final MethodHandle MH_allKeysForObject_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_descriptionWithLocale_ = ObjC.selector("descriptionWithLocale:");
    private static final MethodHandle MH_descriptionWithLocale_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_descriptionWithLocale_indent_ = ObjC.selector("descriptionWithLocale:indent:");
    private static final MethodHandle MH_descriptionWithLocale_indent_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isEqualToDictionary_ = ObjC.selector("isEqualToDictionary:");
    private static final MethodHandle MH_isEqualToDictionary_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_objectEnumerator = ObjC.selector("objectEnumerator");
    private static final MethodHandle MH_objectEnumerator = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_objectsForKeys_notFoundMarker_ = ObjC.selector("objectsForKeys:notFoundMarker:");
    private static final MethodHandle MH_objectsForKeys_notFoundMarker_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_writeToURL_error_ = ObjC.selector("writeToURL:error:");
    private static final MethodHandle MH_writeToURL_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_keysSortedByValueUsingSelector_ = ObjC.selector("keysSortedByValueUsingSelector:");
    private static final MethodHandle MH_keysSortedByValueUsingSelector_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getObjects_andKeys_count_ = ObjC.selector("getObjects:andKeys:count:");
    private static final MethodHandle MH_getObjects_andKeys_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_objectForKeyedSubscript_ = ObjC.selector("objectForKeyedSubscript:");
    private static final MethodHandle MH_objectForKeyedSubscript_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_enumerateKeysAndObjectsUsingBlock_ = ObjC.selector("enumerateKeysAndObjectsUsingBlock:");
    private static final MethodHandle MH_enumerateKeysAndObjectsUsingBlock_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_enumerateKeysAndObjectsWithOptions_usingBlock_ = ObjC.selector("enumerateKeysAndObjectsWithOptions:usingBlock:");
    private static final MethodHandle MH_enumerateKeysAndObjectsWithOptions_usingBlock_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_keysSortedByValueUsingComparator_ = ObjC.selector("keysSortedByValueUsingComparator:");
    private static final MethodHandle MH_keysSortedByValueUsingComparator_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_keysSortedByValueWithOptions_usingComparator_ = ObjC.selector("keysSortedByValueWithOptions:usingComparator:");
    private static final MethodHandle MH_keysSortedByValueWithOptions_usingComparator_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_keysOfEntriesPassingTest_ = ObjC.selector("keysOfEntriesPassingTest:");
    private static final MethodHandle MH_keysOfEntriesPassingTest_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_keysOfEntriesWithOptions_passingTest_ = ObjC.selector("keysOfEntriesWithOptions:passingTest:");
    private static final MethodHandle MH_keysOfEntriesWithOptions_passingTest_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_allKeys = ObjC.selector("allKeys");
    private static final MethodHandle MH_allKeys = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_allValues = ObjC.selector("allValues");
    private static final MethodHandle MH_allValues = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_description = ObjC.selector("description");
    private static final MethodHandle MH_description = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_descriptionInStringsFileFormat = ObjC.selector("descriptionInStringsFileFormat");
    private static final MethodHandle MH_descriptionInStringsFileFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getObjects_andKeys_ = ObjC.selector("getObjects:andKeys:");
    private static final MethodHandle MH_getObjects_andKeys_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_dictionaryWithContentsOfFile_ = ObjC.selector("dictionaryWithContentsOfFile:");
    private static final MethodHandle MH_CLASS_dictionaryWithContentsOfFile_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_dictionaryWithContentsOfURL_ = ObjC.selector("dictionaryWithContentsOfURL:");
    private static final MethodHandle MH_CLASS_dictionaryWithContentsOfURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithContentsOfFile_ = ObjC.selector("initWithContentsOfFile:");
    private static final MethodHandle MH_initWithContentsOfFile_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithContentsOfURL_ = ObjC.selector("initWithContentsOfURL:");
    private static final MethodHandle MH_initWithContentsOfURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_writeToFile_atomically_ = ObjC.selector("writeToFile:atomically:");
    private static final MethodHandle MH_writeToFile_atomically_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_writeToURL_atomically_ = ObjC.selector("writeToURL:atomically:");
    private static final MethodHandle MH_writeToURL_atomically_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_CLASS_dictionary = ObjC.selector("dictionary");
    private static final MethodHandle MH_CLASS_dictionary = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_dictionaryWithObject_forKey_ = ObjC.selector("dictionaryWithObject:forKey:");
    private static final MethodHandle MH_CLASS_dictionaryWithObject_forKey_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_dictionaryWithObjects_forKeys_count_ = ObjC.selector("dictionaryWithObjects:forKeys:count:");
    private static final MethodHandle MH_CLASS_dictionaryWithObjects_forKeys_count_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_dictionaryWithDictionary_ = ObjC.selector("dictionaryWithDictionary:");
    private static final MethodHandle MH_CLASS_dictionaryWithDictionary_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_dictionaryWithObjects_forKeys_ = ObjC.selector("dictionaryWithObjects:forKeys:");
    private static final MethodHandle MH_CLASS_dictionaryWithObjects_forKeys_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithDictionary_ = ObjC.selector("initWithDictionary:");
    private static final MethodHandle MH_initWithDictionary_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithDictionary_copyItems_ = ObjC.selector("initWithDictionary:copyItems:");
    private static final MethodHandle MH_initWithDictionary_copyItems_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_initWithObjects_forKeys_ = ObjC.selector("initWithObjects:forKeys:");
    private static final MethodHandle MH_initWithObjects_forKeys_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithContentsOfURL_error_ = ObjC.selector("initWithContentsOfURL:error:");
    private static final MethodHandle MH_initWithContentsOfURL_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_dictionaryWithContentsOfURL_error_ = ObjC.selector("dictionaryWithContentsOfURL:error:");
    private static final MethodHandle MH_CLASS_dictionaryWithContentsOfURL_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_sharedKeySetForKeys_ = ObjC.selector("sharedKeySetForKeys:");
    private static final MethodHandle MH_CLASS_sharedKeySetForKeys_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_countByEnumeratingWithState_objects_count_ = ObjC.selector("countByEnumeratingWithState:objects:count:");
    private static final MethodHandle MH_countByEnumeratingWithState_objects_count_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fileSize = ObjC.selector("fileSize");
    private static final MethodHandle MH_fileSize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fileModificationDate = ObjC.selector("fileModificationDate");
    private static final MethodHandle MH_fileModificationDate = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fileType = ObjC.selector("fileType");
    private static final MethodHandle MH_fileType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_filePosixPermissions = ObjC.selector("filePosixPermissions");
    private static final MethodHandle MH_filePosixPermissions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fileOwnerAccountName = ObjC.selector("fileOwnerAccountName");
    private static final MethodHandle MH_fileOwnerAccountName = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fileGroupOwnerAccountName = ObjC.selector("fileGroupOwnerAccountName");
    private static final MethodHandle MH_fileGroupOwnerAccountName = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fileSystemNumber = ObjC.selector("fileSystemNumber");
    private static final MethodHandle MH_fileSystemNumber = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fileSystemFileNumber = ObjC.selector("fileSystemFileNumber");
    private static final MethodHandle MH_fileSystemFileNumber = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fileExtensionHidden = ObjC.selector("fileExtensionHidden");
    private static final MethodHandle MH_fileExtensionHidden = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fileHFSCreatorCode = ObjC.selector("fileHFSCreatorCode");
    private static final MethodHandle MH_fileHFSCreatorCode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fileHFSTypeCode = ObjC.selector("fileHFSTypeCode");
    private static final MethodHandle MH_fileHFSTypeCode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fileIsImmutable = ObjC.selector("fileIsImmutable");
    private static final MethodHandle MH_fileIsImmutable = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fileIsAppendOnly = ObjC.selector("fileIsAppendOnly");
    private static final MethodHandle MH_fileIsAppendOnly = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fileCreationDate = ObjC.selector("fileCreationDate");
    private static final MethodHandle MH_fileCreationDate = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fileOwnerAccountID = ObjC.selector("fileOwnerAccountID");
    private static final MethodHandle MH_fileOwnerAccountID = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fileGroupOwnerAccountID = ObjC.selector("fileGroupOwnerAccountID");
    private static final MethodHandle MH_fileGroupOwnerAccountID = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_valueForKey_ = ObjC.selector("valueForKey:");
    private static final MethodHandle MH_valueForKey_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    protected final LongFunction<KeyType> keyType;
    protected final LongFunction<ObjectType> objectType;

    public NSDictionary(final long handle, final LongFunction<KeyType> keyType, final LongFunction<ObjectType> objectType) {
        super(handle);
        this.keyType = keyType;
        this.objectType = objectType;
    }

    /**
     * {@code +[NSDictionary alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static <KeyType extends NSObject, ObjectType extends NSObject> NSDictionary<KeyType, ObjectType> alloc(final LongFunction<KeyType> keyType, final LongFunction<ObjectType> objectType) {
        try {
            return new NSDictionary<>((long) MH_alloc.invokeExact(CLS, SEL_alloc), keyType, objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDictionary objectForKey:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public ObjectType objectForKey(final KeyType aKey) {
        try {
            long result = (long) MH_objectForKey_.invokeExact(this.handle, SEL_objectForKey_, aKey.handle());
            return result == 0L ? null : this.objectType.apply(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDictionary keyEnumerator]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSEnumerator<KeyType> keyEnumerator() {
        try {
            long result = (long) MH_keyEnumerator.invokeExact(this.handle, SEL_keyEnumerator);
            return new NSEnumerator<>(result, this.keyType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary init]} */
    public NSDictionary<KeyType, ObjectType> init() {
        try {
            long result = (long) MH_init.invokeExact(this.handle, SEL_init);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary initWithObjects:forKeys:count:]} */
    public NSDictionary<KeyType, ObjectType> initWithObjects(final MemorySegment objects, final MemorySegment keys, final long cnt) {
        try {
            long result = (long) MH_initWithObjects_forKeys_count_.invokeExact(this.handle, SEL_initWithObjects_forKeys_count_, objects.address(), keys.address(), cnt);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary initWithCoder:]} */
    @Nullable
    public NSDictionary<KeyType, ObjectType> initWithCoder(final NSObject coder) {
        try {
            long result = (long) MH_initWithCoder_.invokeExact(this.handle, SEL_initWithCoder_, coder.handle());
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary count]} */
    public long count() {
        try {
            return (long) MH_count.invokeExact(this.handle, SEL_count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDictionary allKeysForObject:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<KeyType> allKeysForObject(final ObjectType anObject) {
        try {
            long result = (long) MH_allKeysForObject_.invokeExact(this.handle, SEL_allKeysForObject_, anObject.handle());
            return new NSArray<>(result, this.keyType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary descriptionWithLocale:]} */
    public String descriptionWithLocale(@Nullable final NSObject locale) {
        try {
            long result = (long) MH_descriptionWithLocale_.invokeExact(this.handle, SEL_descriptionWithLocale_, locale == null ? 0L : locale.handle());
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary descriptionWithLocale:indent:]} */
    public String descriptionWithLocale(@Nullable final NSObject locale, final long level) {
        try {
            long result = (long) MH_descriptionWithLocale_indent_.invokeExact(this.handle, SEL_descriptionWithLocale_indent_, locale == null ? 0L : locale.handle(), level);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary isEqualToDictionary:]} */
    public boolean isEqualToDictionary(final NSDictionary<KeyType, ObjectType> otherDictionary) {
        try {
            return (boolean) MH_isEqualToDictionary_.invokeExact(this.handle, SEL_isEqualToDictionary_, otherDictionary.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDictionary objectEnumerator]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSEnumerator<ObjectType> objectEnumerator() {
        try {
            long result = (long) MH_objectEnumerator.invokeExact(this.handle, SEL_objectEnumerator);
            return new NSEnumerator<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDictionary objectsForKeys:notFoundMarker:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<ObjectType> objectsForKeys(final NSArray<KeyType> keys, final ObjectType marker) {
        try {
            long result = (long) MH_objectsForKeys_notFoundMarker_.invokeExact(this.handle, SEL_objectsForKeys_notFoundMarker_, keys.handle(), marker.handle());
            return new NSArray<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary writeToURL:error:]} */
    public void writeToURL(final NSURL url) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_writeToURL_error_.invokeExact(this.handle, SEL_writeToURL_error_, url.handle(), errorOut.address());
            if (!result) {
                throw NSErrorException.of("writeToURL:error:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDictionary keysSortedByValueUsingSelector:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<KeyType> keysSortedByValueUsingSelector(final long comparator) {
        try {
            long result = (long) MH_keysSortedByValueUsingSelector_.invokeExact(this.handle, SEL_keysSortedByValueUsingSelector_, comparator);
            return new NSArray<>(result, this.keyType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary getObjects:andKeys:count:]} */
    public void getObjects(final MemorySegment objects, final MemorySegment keys, final long count) {
        try {
            MH_getObjects_andKeys_count_.invokeExact(this.handle, SEL_getObjects_andKeys_count_, objects.address(), keys.address(), count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDictionary objectForKeyedSubscript:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public ObjectType objectForKeyedSubscript(final KeyType key) {
        try {
            long result = (long) MH_objectForKeyedSubscript_.invokeExact(this.handle, SEL_objectForKeyedSubscript_, key.handle());
            return result == 0L ? null : this.objectType.apply(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary enumerateKeysAndObjectsUsingBlock:]} */
    public void enumerateKeysAndObjectsUsingBlock(final long block) {
        try {
            MH_enumerateKeysAndObjectsUsingBlock_.invokeExact(this.handle, SEL_enumerateKeysAndObjectsUsingBlock_, block);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDictionary enumerateKeysAndObjectsWithOptions:usingBlock:]}
     *
     * @param opts a combination of {@link NSEnumerationOptions} flags
     */
    public void enumerateKeysAndObjectsWithOptions(final long opts, final long block) {
        try {
            MH_enumerateKeysAndObjectsWithOptions_usingBlock_.invokeExact(this.handle, SEL_enumerateKeysAndObjectsWithOptions_usingBlock_, opts, block);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDictionary keysSortedByValueUsingComparator:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<KeyType> keysSortedByValueUsingComparator(final long cmptr) {
        try {
            long result = (long) MH_keysSortedByValueUsingComparator_.invokeExact(this.handle, SEL_keysSortedByValueUsingComparator_, cmptr);
            return new NSArray<>(result, this.keyType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDictionary keysSortedByValueWithOptions:usingComparator:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     *
     * @param opts a combination of {@link NSSortOptions} flags
     */
    public NSArray<KeyType> keysSortedByValueWithOptions(final long opts, final long cmptr) {
        try {
            long result = (long) MH_keysSortedByValueWithOptions_usingComparator_.invokeExact(this.handle, SEL_keysSortedByValueWithOptions_usingComparator_, opts, cmptr);
            return new NSArray<>(result, this.keyType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDictionary keysOfEntriesPassingTest:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSSet<KeyType> keysOfEntriesPassingTest(final long predicate) {
        try {
            long result = (long) MH_keysOfEntriesPassingTest_.invokeExact(this.handle, SEL_keysOfEntriesPassingTest_, predicate);
            return new NSSet<>(result, this.keyType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDictionary keysOfEntriesWithOptions:passingTest:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     *
     * @param opts a combination of {@link NSEnumerationOptions} flags
     */
    public NSSet<KeyType> keysOfEntriesWithOptions(final long opts, final long predicate) {
        try {
            long result = (long) MH_keysOfEntriesWithOptions_passingTest_.invokeExact(this.handle, SEL_keysOfEntriesWithOptions_passingTest_, opts, predicate);
            return new NSSet<>(result, this.keyType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDictionary allKeys]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<KeyType> allKeys() {
        try {
            long result = (long) MH_allKeys.invokeExact(this.handle, SEL_allKeys);
            return new NSArray<>(result, this.keyType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDictionary allValues]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<ObjectType> allValues() {
        try {
            long result = (long) MH_allValues.invokeExact(this.handle, SEL_allValues);
            return new NSArray<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary description]} */
    public String description() {
        try {
            long result = (long) MH_description.invokeExact(this.handle, SEL_description);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary descriptionInStringsFileFormat]} */
    public String descriptionInStringsFileFormat() {
        try {
            long result = (long) MH_descriptionInStringsFileFormat.invokeExact(this.handle, SEL_descriptionInStringsFileFormat);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary getObjects:andKeys:]} */
    public void getObjects(final MemorySegment objects, final MemorySegment keys) {
        try {
            MH_getObjects_andKeys_.invokeExact(this.handle, SEL_getObjects_andKeys_, objects.address(), keys.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSDictionary dictionaryWithContentsOfFile:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static <KeyType extends NSObject, ObjectType extends NSObject> NSDictionary<KeyType, ObjectType> dictionaryWithContentsOfFile(final LongFunction<KeyType> keyType, final LongFunction<ObjectType> objectType, final String path) {
        final long nsPath = ObjC.nsString(path);
        try {
            long result = (long) MH_CLASS_dictionaryWithContentsOfFile_.invokeExact(CLS, SEL_CLASS_dictionaryWithContentsOfFile_, nsPath);
            return result == 0L ? null : new NSDictionary<>(result, keyType, objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /**
     * {@code +[NSDictionary dictionaryWithContentsOfURL:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static <KeyType extends NSObject, ObjectType extends NSObject> NSDictionary<KeyType, ObjectType> dictionaryWithContentsOfURL(final LongFunction<KeyType> keyType, final LongFunction<ObjectType> objectType, final NSURL url) {
        try {
            long result = (long) MH_CLASS_dictionaryWithContentsOfURL_.invokeExact(CLS, SEL_CLASS_dictionaryWithContentsOfURL_, url.handle());
            return result == 0L ? null : new NSDictionary<>(result, keyType, objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDictionary initWithContentsOfFile:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public NSDictionary<KeyType, ObjectType> initWithContentsOfFile(final String path) {
        final long nsPath = ObjC.nsString(path);
        try {
            long result = (long) MH_initWithContentsOfFile_.invokeExact(this.handle, SEL_initWithContentsOfFile_, nsPath);
            return result == 0L ? null : new NSDictionary<>(result, this.keyType, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /**
     * {@code -[NSDictionary initWithContentsOfURL:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public NSDictionary<KeyType, ObjectType> initWithContentsOfURL(final NSURL url) {
        try {
            long result = (long) MH_initWithContentsOfURL_.invokeExact(this.handle, SEL_initWithContentsOfURL_, url.handle());
            return result == 0L ? null : new NSDictionary<>(result, this.keyType, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary writeToFile:atomically:]} */
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

    /** {@code -[NSDictionary writeToURL:atomically:]} */
    public boolean writeToURL(final NSURL url, final boolean atomically) {
        try {
            return (boolean) MH_writeToURL_atomically_.invokeExact(this.handle, SEL_writeToURL_atomically_, url.handle(), atomically);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSDictionary dictionary]} */
    public static <KeyType extends NSObject, ObjectType extends NSObject> NSDictionary<KeyType, ObjectType> dictionary(final LongFunction<KeyType> keyType, final LongFunction<ObjectType> objectType) {
        try {
            long result = (long) MH_CLASS_dictionary.invokeExact(CLS, SEL_CLASS_dictionary);
            return new NSDictionary<>(result, keyType, objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSDictionary dictionaryWithObject:forKey:]} */
    public static <KeyType extends NSObject, ObjectType extends NSObject> NSDictionary<KeyType, ObjectType> dictionaryWithObject(final LongFunction<KeyType> keyType, final LongFunction<ObjectType> objectType, final ObjectType object, final NSObject key) {
        try {
            long result = (long) MH_CLASS_dictionaryWithObject_forKey_.invokeExact(CLS, SEL_CLASS_dictionaryWithObject_forKey_, object.handle(), key.handle());
            return new NSDictionary<>(result, keyType, objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSDictionary dictionaryWithObjects:forKeys:count:]} */
    public static <KeyType extends NSObject, ObjectType extends NSObject> NSDictionary<KeyType, ObjectType> dictionaryWithObjects(final LongFunction<KeyType> keyType, final LongFunction<ObjectType> objectType, final MemorySegment objects, final MemorySegment keys, final long cnt) {
        try {
            long result = (long) MH_CLASS_dictionaryWithObjects_forKeys_count_.invokeExact(CLS, SEL_CLASS_dictionaryWithObjects_forKeys_count_, objects.address(), keys.address(), cnt);
            return new NSDictionary<>(result, keyType, objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSDictionary dictionaryWithDictionary:]} */
    public static <KeyType extends NSObject, ObjectType extends NSObject> NSDictionary<KeyType, ObjectType> dictionaryWithDictionary(final LongFunction<KeyType> keyType, final LongFunction<ObjectType> objectType, final NSDictionary<KeyType, ObjectType> dict) {
        try {
            long result = (long) MH_CLASS_dictionaryWithDictionary_.invokeExact(CLS, SEL_CLASS_dictionaryWithDictionary_, dict.handle());
            return new NSDictionary<>(result, keyType, objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSDictionary dictionaryWithObjects:forKeys:]} */
    public static <KeyType extends NSObject, ObjectType extends NSObject> NSDictionary<KeyType, ObjectType> dictionaryWithObjects(final LongFunction<KeyType> keyType, final LongFunction<ObjectType> objectType, final NSArray<ObjectType> objects, final NSArray<NSObject> keys) {
        try {
            long result = (long) MH_CLASS_dictionaryWithObjects_forKeys_.invokeExact(CLS, SEL_CLASS_dictionaryWithObjects_forKeys_, objects.handle(), keys.handle());
            return new NSDictionary<>(result, keyType, objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary initWithDictionary:]} */
    public NSDictionary<KeyType, ObjectType> initWithDictionary(final NSDictionary<KeyType, ObjectType> otherDictionary) {
        try {
            long result = (long) MH_initWithDictionary_.invokeExact(this.handle, SEL_initWithDictionary_, otherDictionary.handle());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary initWithDictionary:copyItems:]} */
    public NSDictionary<KeyType, ObjectType> initWithDictionary(final NSDictionary<KeyType, ObjectType> otherDictionary, final boolean flag) {
        try {
            long result = (long) MH_initWithDictionary_copyItems_.invokeExact(this.handle, SEL_initWithDictionary_copyItems_, otherDictionary.handle(), flag);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary initWithObjects:forKeys:]} */
    public NSDictionary<KeyType, ObjectType> initWithObjects(final NSArray<ObjectType> objects, final NSArray<NSObject> keys) {
        try {
            long result = (long) MH_initWithObjects_forKeys_.invokeExact(this.handle, SEL_initWithObjects_forKeys_, objects.handle(), keys.handle());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDictionary initWithContentsOfURL:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public NSDictionary<NSString, ObjectType> initWithContentsOfURLError(final NSURL url) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_initWithContentsOfURL_error_.invokeExact(this.handle, SEL_initWithContentsOfURL_error_, url.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("initWithContentsOfURL:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new NSDictionary<>(result, NSString::new, this.objectType);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSDictionary dictionaryWithContentsOfURL:error:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static <KeyType extends NSObject, ObjectType extends NSObject> NSDictionary<NSString, ObjectType> dictionaryWithContentsOfURLError(final LongFunction<KeyType> keyType, final LongFunction<ObjectType> objectType, final NSURL url) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_CLASS_dictionaryWithContentsOfURL_error_.invokeExact(CLS, SEL_CLASS_dictionaryWithContentsOfURL_error_, url.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("dictionaryWithContentsOfURL:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new NSDictionary<>(result, NSString::new, objectType);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSDictionary sharedKeySetForKeys:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static <KeyType extends NSObject, ObjectType extends NSObject> NSObject sharedKeySetForKeys(final LongFunction<KeyType> keyType, final LongFunction<ObjectType> objectType, final NSArray<NSObject> keys) {
        try {
            long result = (long) MH_CLASS_sharedKeySetForKeys_.invokeExact(CLS, SEL_CLASS_sharedKeySetForKeys_, keys.handle());
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary countByEnumeratingWithState:objects:count:]} */
    public long countByEnumerating(final MemorySegment state, final MemorySegment buffer, final long len) {
        try {
            return (long) MH_countByEnumeratingWithState_objects_count_.invokeExact(this.handle, SEL_countByEnumeratingWithState_objects_count_, state.address(), buffer.address(), len);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary fileSize]} */
    public long fileSize() {
        try {
            return (long) MH_fileSize.invokeExact(this.handle, SEL_fileSize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDictionary fileModificationDate]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSDate fileModificationDate() {
        try {
            long result = (long) MH_fileModificationDate.invokeExact(this.handle, SEL_fileModificationDate);
            return result == 0L ? null : new NSDate(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary fileType]} */
    @Nullable
    public String fileType() {
        try {
            long result = (long) MH_fileType.invokeExact(this.handle, SEL_fileType);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary filePosixPermissions]} */
    public long filePosixPermissions() {
        try {
            return (long) MH_filePosixPermissions.invokeExact(this.handle, SEL_filePosixPermissions);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary fileOwnerAccountName]} */
    @Nullable
    public String fileOwnerAccountName() {
        try {
            long result = (long) MH_fileOwnerAccountName.invokeExact(this.handle, SEL_fileOwnerAccountName);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary fileGroupOwnerAccountName]} */
    @Nullable
    public String fileGroupOwnerAccountName() {
        try {
            long result = (long) MH_fileGroupOwnerAccountName.invokeExact(this.handle, SEL_fileGroupOwnerAccountName);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary fileSystemNumber]} */
    public long fileSystemNumber() {
        try {
            return (long) MH_fileSystemNumber.invokeExact(this.handle, SEL_fileSystemNumber);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary fileSystemFileNumber]} */
    public long fileSystemFileNumber() {
        try {
            return (long) MH_fileSystemFileNumber.invokeExact(this.handle, SEL_fileSystemFileNumber);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary fileExtensionHidden]} */
    public boolean fileExtensionHidden() {
        try {
            return (boolean) MH_fileExtensionHidden.invokeExact(this.handle, SEL_fileExtensionHidden);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary fileHFSCreatorCode]} */
    public int fileHFSCreatorCode() {
        try {
            return (int) MH_fileHFSCreatorCode.invokeExact(this.handle, SEL_fileHFSCreatorCode);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary fileHFSTypeCode]} */
    public int fileHFSTypeCode() {
        try {
            return (int) MH_fileHFSTypeCode.invokeExact(this.handle, SEL_fileHFSTypeCode);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary fileIsImmutable]} */
    public boolean fileIsImmutable() {
        try {
            return (boolean) MH_fileIsImmutable.invokeExact(this.handle, SEL_fileIsImmutable);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDictionary fileIsAppendOnly]} */
    public boolean fileIsAppendOnly() {
        try {
            return (boolean) MH_fileIsAppendOnly.invokeExact(this.handle, SEL_fileIsAppendOnly);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDictionary fileCreationDate]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSDate fileCreationDate() {
        try {
            long result = (long) MH_fileCreationDate.invokeExact(this.handle, SEL_fileCreationDate);
            return result == 0L ? null : new NSDate(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDictionary fileOwnerAccountID]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSNumber fileOwnerAccountID() {
        try {
            long result = (long) MH_fileOwnerAccountID.invokeExact(this.handle, SEL_fileOwnerAccountID);
            return result == 0L ? null : new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDictionary fileGroupOwnerAccountID]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSNumber fileGroupOwnerAccountID() {
        try {
            long result = (long) MH_fileGroupOwnerAccountID.invokeExact(this.handle, SEL_fileGroupOwnerAccountID);
            return result == 0L ? null : new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDictionary valueForKey:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public ObjectType valueForKey(final String key) {
        final long nsKey = ObjC.nsString(key);
        try {
            long result = (long) MH_valueForKey_.invokeExact(this.handle, SEL_valueForKey_, nsKey);
            return result == 0L ? null : this.objectType.apply(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKey);
        }
    }
}
