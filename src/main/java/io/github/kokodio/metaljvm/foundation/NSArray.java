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
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code NSArray}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsarray">Apple documentation</a>
 */
public class NSArray<ObjectType extends NSObject> extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Foundation");
    private static final long CLS = ObjC.clazz("NSArray");
    private static final long SEL_objectAtIndex_ = ObjC.selector("objectAtIndex:");
    private static final MethodHandle MH_objectAtIndex_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");
    private static final MethodHandle MH_init = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithObjects_count_ = ObjC.selector("initWithObjects:count:");
    private static final MethodHandle MH_initWithObjects_count_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithCoder_ = ObjC.selector("initWithCoder:");
    private static final MethodHandle MH_initWithCoder_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_count = ObjC.selector("count");
    private static final MethodHandle MH_count = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_arrayByAddingObject_ = ObjC.selector("arrayByAddingObject:");
    private static final MethodHandle MH_arrayByAddingObject_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_arrayByAddingObjectsFromArray_ = ObjC.selector("arrayByAddingObjectsFromArray:");
    private static final MethodHandle MH_arrayByAddingObjectsFromArray_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_componentsJoinedByString_ = ObjC.selector("componentsJoinedByString:");
    private static final MethodHandle MH_componentsJoinedByString_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_containsObject_ = ObjC.selector("containsObject:");
    private static final MethodHandle MH_containsObject_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_descriptionWithLocale_ = ObjC.selector("descriptionWithLocale:");
    private static final MethodHandle MH_descriptionWithLocale_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_descriptionWithLocale_indent_ = ObjC.selector("descriptionWithLocale:indent:");
    private static final MethodHandle MH_descriptionWithLocale_indent_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_firstObjectCommonWithArray_ = ObjC.selector("firstObjectCommonWithArray:");
    private static final MethodHandle MH_firstObjectCommonWithArray_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getObjects_range_ = ObjC.selector("getObjects:range:");
    private static final MethodHandle MH_getObjects_range_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indexOfObject_ = ObjC.selector("indexOfObject:");
    private static final MethodHandle MH_indexOfObject_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indexOfObject_inRange_ = ObjC.selector("indexOfObject:inRange:");
    private static final MethodHandle MH_indexOfObject_inRange_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indexOfObjectIdenticalTo_ = ObjC.selector("indexOfObjectIdenticalTo:");
    private static final MethodHandle MH_indexOfObjectIdenticalTo_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indexOfObjectIdenticalTo_inRange_ = ObjC.selector("indexOfObjectIdenticalTo:inRange:");
    private static final MethodHandle MH_indexOfObjectIdenticalTo_inRange_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isEqualToArray_ = ObjC.selector("isEqualToArray:");
    private static final MethodHandle MH_isEqualToArray_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_objectEnumerator = ObjC.selector("objectEnumerator");
    private static final MethodHandle MH_objectEnumerator = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_reverseObjectEnumerator = ObjC.selector("reverseObjectEnumerator");
    private static final MethodHandle MH_reverseObjectEnumerator = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sortedArrayUsingFunction_context_ = ObjC.selector("sortedArrayUsingFunction:context:");
    private static final MethodHandle MH_sortedArrayUsingFunction_context_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sortedArrayUsingFunction_context_hint_ = ObjC.selector("sortedArrayUsingFunction:context:hint:");
    private static final MethodHandle MH_sortedArrayUsingFunction_context_hint_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sortedArrayUsingSelector_ = ObjC.selector("sortedArrayUsingSelector:");
    private static final MethodHandle MH_sortedArrayUsingSelector_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_subarrayWithRange_ = ObjC.selector("subarrayWithRange:");
    private static final MethodHandle MH_subarrayWithRange_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_writeToURL_error_ = ObjC.selector("writeToURL:error:");
    private static final MethodHandle MH_writeToURL_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_makeObjectsPerformSelector_ = ObjC.selector("makeObjectsPerformSelector:");
    private static final MethodHandle MH_makeObjectsPerformSelector_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_makeObjectsPerformSelector_withObject_ = ObjC.selector("makeObjectsPerformSelector:withObject:");
    private static final MethodHandle MH_makeObjectsPerformSelector_withObject_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_objectsAtIndexes_ = ObjC.selector("objectsAtIndexes:");
    private static final MethodHandle MH_objectsAtIndexes_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_objectAtIndexedSubscript_ = ObjC.selector("objectAtIndexedSubscript:");
    private static final MethodHandle MH_objectAtIndexedSubscript_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_enumerateObjectsUsingBlock_ = ObjC.selector("enumerateObjectsUsingBlock:");
    private static final MethodHandle MH_enumerateObjectsUsingBlock_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_enumerateObjectsWithOptions_usingBlock_ = ObjC.selector("enumerateObjectsWithOptions:usingBlock:");
    private static final MethodHandle MH_enumerateObjectsWithOptions_usingBlock_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_enumerateObjectsAtIndexes_options_usingBlock_ = ObjC.selector("enumerateObjectsAtIndexes:options:usingBlock:");
    private static final MethodHandle MH_enumerateObjectsAtIndexes_options_usingBlock_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indexOfObjectPassingTest_ = ObjC.selector("indexOfObjectPassingTest:");
    private static final MethodHandle MH_indexOfObjectPassingTest_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indexOfObjectWithOptions_passingTest_ = ObjC.selector("indexOfObjectWithOptions:passingTest:");
    private static final MethodHandle MH_indexOfObjectWithOptions_passingTest_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indexOfObjectAtIndexes_options_passingTest_ = ObjC.selector("indexOfObjectAtIndexes:options:passingTest:");
    private static final MethodHandle MH_indexOfObjectAtIndexes_options_passingTest_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indexesOfObjectsPassingTest_ = ObjC.selector("indexesOfObjectsPassingTest:");
    private static final MethodHandle MH_indexesOfObjectsPassingTest_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indexesOfObjectsWithOptions_passingTest_ = ObjC.selector("indexesOfObjectsWithOptions:passingTest:");
    private static final MethodHandle MH_indexesOfObjectsWithOptions_passingTest_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indexesOfObjectsAtIndexes_options_passingTest_ = ObjC.selector("indexesOfObjectsAtIndexes:options:passingTest:");
    private static final MethodHandle MH_indexesOfObjectsAtIndexes_options_passingTest_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sortedArrayUsingComparator_ = ObjC.selector("sortedArrayUsingComparator:");
    private static final MethodHandle MH_sortedArrayUsingComparator_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sortedArrayWithOptions_usingComparator_ = ObjC.selector("sortedArrayWithOptions:usingComparator:");
    private static final MethodHandle MH_sortedArrayWithOptions_usingComparator_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indexOfObject_inSortedRange_options_usingComparator_ = ObjC.selector("indexOfObject:inSortedRange:options:usingComparator:");
    private static final MethodHandle MH_indexOfObject_inSortedRange_options_usingComparator_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_description = ObjC.selector("description");
    private static final MethodHandle MH_description = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_firstObject = ObjC.selector("firstObject");
    private static final MethodHandle MH_firstObject = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_lastObject = ObjC.selector("lastObject");
    private static final MethodHandle MH_lastObject = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sortedArrayHint = ObjC.selector("sortedArrayHint");
    private static final MethodHandle MH_sortedArrayHint = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_array = ObjC.selector("array");
    private static final MethodHandle MH_CLASS_array = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_arrayWithObject_ = ObjC.selector("arrayWithObject:");
    private static final MethodHandle MH_CLASS_arrayWithObject_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_arrayWithObjects_count_ = ObjC.selector("arrayWithObjects:count:");
    private static final MethodHandle MH_CLASS_arrayWithObjects_count_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_arrayWithArray_ = ObjC.selector("arrayWithArray:");
    private static final MethodHandle MH_CLASS_arrayWithArray_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithArray_ = ObjC.selector("initWithArray:");
    private static final MethodHandle MH_initWithArray_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithArray_copyItems_ = ObjC.selector("initWithArray:copyItems:");
    private static final MethodHandle MH_initWithArray_copyItems_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_initWithContentsOfURL_error_ = ObjC.selector("initWithContentsOfURL:error:");
    private static final MethodHandle MH_initWithContentsOfURL_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_arrayWithContentsOfURL_error_ = ObjC.selector("arrayWithContentsOfURL:error:");
    private static final MethodHandle MH_CLASS_arrayWithContentsOfURL_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_differenceFromArray_withOptions_usingEquivalenceTest_ = ObjC.selector("differenceFromArray:withOptions:usingEquivalenceTest:");
    private static final MethodHandle MH_differenceFromArray_withOptions_usingEquivalenceTest_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_differenceFromArray_withOptions_ = ObjC.selector("differenceFromArray:withOptions:");
    private static final MethodHandle MH_differenceFromArray_withOptions_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_differenceFromArray_ = ObjC.selector("differenceFromArray:");
    private static final MethodHandle MH_differenceFromArray_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_arrayByApplyingDifference_ = ObjC.selector("arrayByApplyingDifference:");
    private static final MethodHandle MH_arrayByApplyingDifference_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getObjects_ = ObjC.selector("getObjects:");
    private static final MethodHandle MH_getObjects_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_arrayWithContentsOfFile_ = ObjC.selector("arrayWithContentsOfFile:");
    private static final MethodHandle MH_CLASS_arrayWithContentsOfFile_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_arrayWithContentsOfURL_ = ObjC.selector("arrayWithContentsOfURL:");
    private static final MethodHandle MH_CLASS_arrayWithContentsOfURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithContentsOfFile_ = ObjC.selector("initWithContentsOfFile:");
    private static final MethodHandle MH_initWithContentsOfFile_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithContentsOfURL_ = ObjC.selector("initWithContentsOfURL:");
    private static final MethodHandle MH_initWithContentsOfURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_writeToFile_atomically_ = ObjC.selector("writeToFile:atomically:");
    private static final MethodHandle MH_writeToFile_atomically_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_writeToURL_atomically_ = ObjC.selector("writeToURL:atomically:");
    private static final MethodHandle MH_writeToURL_atomically_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_pathsMatchingExtensions_ = ObjC.selector("pathsMatchingExtensions:");
    private static final MethodHandle MH_pathsMatchingExtensions_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_valueForKey_ = ObjC.selector("valueForKey:");
    private static final MethodHandle MH_valueForKey_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setValue_forKey_ = ObjC.selector("setValue:forKey:");
    private static final MethodHandle MH_setValue_forKey_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_addObserver_toObjectsAtIndexes_forKeyPath_options_context_ = ObjC.selector("addObserver:toObjectsAtIndexes:forKeyPath:options:context:");
    private static final MethodHandle MH_addObserver_toObjectsAtIndexes_forKeyPath_options_context_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeObserver_fromObjectsAtIndexes_forKeyPath_context_ = ObjC.selector("removeObserver:fromObjectsAtIndexes:forKeyPath:context:");
    private static final MethodHandle MH_removeObserver_fromObjectsAtIndexes_forKeyPath_context_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeObserver_fromObjectsAtIndexes_forKeyPath_ = ObjC.selector("removeObserver:fromObjectsAtIndexes:forKeyPath:");
    private static final MethodHandle MH_removeObserver_fromObjectsAtIndexes_forKeyPath_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_addObserver_forKeyPath_options_context_ = ObjC.selector("addObserver:forKeyPath:options:context:");
    private static final MethodHandle MH_addObserver_forKeyPath_options_context_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeObserver_forKeyPath_context_ = ObjC.selector("removeObserver:forKeyPath:context:");
    private static final MethodHandle MH_removeObserver_forKeyPath_context_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeObserver_forKeyPath_ = ObjC.selector("removeObserver:forKeyPath:");
    private static final MethodHandle MH_removeObserver_forKeyPath_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sortedArrayUsingDescriptors_ = ObjC.selector("sortedArrayUsingDescriptors:");
    private static final MethodHandle MH_sortedArrayUsingDescriptors_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_filteredArrayUsingPredicate_ = ObjC.selector("filteredArrayUsingPredicate:");
    private static final MethodHandle MH_filteredArrayUsingPredicate_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    protected final LongFunction<ObjectType> objectType;

    public NSArray(final long handle, final LongFunction<ObjectType> objectType) {
        super(handle);
        this.objectType = objectType;
    }

    /**
     * {@code +[NSArray alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static <ObjectType extends NSObject> NSArray<ObjectType> alloc(final LongFunction<ObjectType> objectType) {
        try {
            return new NSArray<>((long) MH_alloc.invokeExact(CLS, SEL_alloc), objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray objectAtIndex:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public ObjectType objectAtIndex(final long index) {
        try {
            long result = (long) MH_objectAtIndex_.invokeExact(this.handle, SEL_objectAtIndex_, index);
            return this.objectType.apply(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSArray init]} */
    public NSArray<ObjectType> init() {
        try {
            long result = (long) MH_init.invokeExact(this.handle, SEL_init);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSArray initWithObjects:count:]} */
    public NSArray<ObjectType> initWithObjects(final MemorySegment objects, final long cnt) {
        try {
            long result = (long) MH_initWithObjects_count_.invokeExact(this.handle, SEL_initWithObjects_count_, objects.address(), cnt);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSArray initWithCoder:]} */
    @Nullable
    public NSArray<ObjectType> initWithCoder(final NSObject coder) {
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

    /** {@code -[NSArray count]} */
    public long count() {
        try {
            return (long) MH_count.invokeExact(this.handle, SEL_count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray arrayByAddingObject:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<ObjectType> arrayByAddingObject(final ObjectType anObject) {
        try {
            long result = (long) MH_arrayByAddingObject_.invokeExact(this.handle, SEL_arrayByAddingObject_, anObject.handle());
            return new NSArray<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray arrayByAddingObjectsFromArray:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<ObjectType> arrayByAddingObjectsFromArray(final NSArray<ObjectType> otherArray) {
        try {
            long result = (long) MH_arrayByAddingObjectsFromArray_.invokeExact(this.handle, SEL_arrayByAddingObjectsFromArray_, otherArray.handle());
            return new NSArray<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSArray componentsJoinedByString:]} */
    public String componentsJoinedByString(final String separator) {
        final long nsSeparator = ObjC.nsString(separator);
        try {
            long result = (long) MH_componentsJoinedByString_.invokeExact(this.handle, SEL_componentsJoinedByString_, nsSeparator);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsSeparator);
        }
    }

    /** {@code -[NSArray containsObject:]} */
    public boolean containsObject(final ObjectType anObject) {
        try {
            return (boolean) MH_containsObject_.invokeExact(this.handle, SEL_containsObject_, anObject.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSArray descriptionWithLocale:]} */
    public String descriptionWithLocale(@Nullable final NSObject locale) {
        try {
            long result = (long) MH_descriptionWithLocale_.invokeExact(this.handle, SEL_descriptionWithLocale_, locale == null ? 0L : locale.handle());
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSArray descriptionWithLocale:indent:]} */
    public String descriptionWithLocale(@Nullable final NSObject locale, final long level) {
        try {
            long result = (long) MH_descriptionWithLocale_indent_.invokeExact(this.handle, SEL_descriptionWithLocale_indent_, locale == null ? 0L : locale.handle(), level);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray firstObjectCommonWithArray:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public ObjectType firstObjectCommon(final NSArray<ObjectType> otherArray) {
        try {
            long result = (long) MH_firstObjectCommonWithArray_.invokeExact(this.handle, SEL_firstObjectCommonWithArray_, otherArray.handle());
            return result == 0L ? null : this.objectType.apply(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSArray getObjects:range:]} */
    public void getObjects(final MemorySegment objects, final NSRange range) {
        try {
            MH_getObjects_range_.invokeExact(this.handle, SEL_getObjects_range_, objects.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSArray indexOfObject:]} */
    public long indexOfObject(final ObjectType anObject) {
        try {
            return (long) MH_indexOfObject_.invokeExact(this.handle, SEL_indexOfObject_, anObject.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSArray indexOfObject:inRange:]} */
    public long indexOfObject(final ObjectType anObject, final NSRange range) {
        try {
            return (long) MH_indexOfObject_inRange_.invokeExact(this.handle, SEL_indexOfObject_inRange_, anObject.handle(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSArray indexOfObjectIdenticalTo:]} */
    public long indexOfObjectIdenticalTo(final ObjectType anObject) {
        try {
            return (long) MH_indexOfObjectIdenticalTo_.invokeExact(this.handle, SEL_indexOfObjectIdenticalTo_, anObject.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSArray indexOfObjectIdenticalTo:inRange:]} */
    public long indexOfObjectIdenticalTo(final ObjectType anObject, final NSRange range) {
        try {
            return (long) MH_indexOfObjectIdenticalTo_inRange_.invokeExact(this.handle, SEL_indexOfObjectIdenticalTo_inRange_, anObject.handle(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSArray isEqualToArray:]} */
    public boolean isEqualToArray(final NSArray<ObjectType> otherArray) {
        try {
            return (boolean) MH_isEqualToArray_.invokeExact(this.handle, SEL_isEqualToArray_, otherArray.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray objectEnumerator]}
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
     * {@code -[NSArray reverseObjectEnumerator]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSEnumerator<ObjectType> reverseObjectEnumerator() {
        try {
            long result = (long) MH_reverseObjectEnumerator.invokeExact(this.handle, SEL_reverseObjectEnumerator);
            return new NSEnumerator<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray sortedArrayUsingFunction:context:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<ObjectType> sortedArrayUsingFunction(final MemorySegment comparator, final MemorySegment context) {
        try {
            long result = (long) MH_sortedArrayUsingFunction_context_.invokeExact(this.handle, SEL_sortedArrayUsingFunction_context_, comparator.address(), context.address());
            return new NSArray<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray sortedArrayUsingFunction:context:hint:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<ObjectType> sortedArrayUsingFunction(final MemorySegment comparator, final MemorySegment context, @Nullable final NSData hint) {
        try {
            long result = (long) MH_sortedArrayUsingFunction_context_hint_.invokeExact(this.handle, SEL_sortedArrayUsingFunction_context_hint_, comparator.address(), context.address(), hint == null ? 0L : hint.handle());
            return new NSArray<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray sortedArrayUsingSelector:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<ObjectType> sortedArrayUsingSelector(final long comparator) {
        try {
            long result = (long) MH_sortedArrayUsingSelector_.invokeExact(this.handle, SEL_sortedArrayUsingSelector_, comparator);
            return new NSArray<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray subarrayWithRange:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<ObjectType> subarray(final NSRange range) {
        try {
            long result = (long) MH_subarrayWithRange_.invokeExact(this.handle, SEL_subarrayWithRange_, range.location(), range.length());
            return new NSArray<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSArray writeToURL:error:]} */
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

    /** {@code -[NSArray makeObjectsPerformSelector:]} */
    public void makeObjectsPerformSelector(final long aSelector) {
        try {
            MH_makeObjectsPerformSelector_.invokeExact(this.handle, SEL_makeObjectsPerformSelector_, aSelector);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSArray makeObjectsPerformSelector:withObject:]} */
    public void makeObjectsPerformSelector(final long aSelector, @Nullable final NSObject argument) {
        try {
            MH_makeObjectsPerformSelector_withObject_.invokeExact(this.handle, SEL_makeObjectsPerformSelector_withObject_, aSelector, argument == null ? 0L : argument.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray objectsAtIndexes:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<ObjectType> objectsAtIndexes(final NSObject indexes) {
        try {
            long result = (long) MH_objectsAtIndexes_.invokeExact(this.handle, SEL_objectsAtIndexes_, indexes.handle());
            return new NSArray<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray objectAtIndexedSubscript:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public ObjectType objectAtIndexedSubscript(final long idx) {
        try {
            long result = (long) MH_objectAtIndexedSubscript_.invokeExact(this.handle, SEL_objectAtIndexedSubscript_, idx);
            return this.objectType.apply(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSArray enumerateObjectsUsingBlock:]} */
    public void enumerateObjectsUsingBlock(final long block) {
        try {
            MH_enumerateObjectsUsingBlock_.invokeExact(this.handle, SEL_enumerateObjectsUsingBlock_, block);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray enumerateObjectsWithOptions:usingBlock:]}
     *
     * @param opts a combination of {@link NSEnumerationOptions} flags
     */
    public void enumerateObjectsWithOptions(final long opts, final long block) {
        try {
            MH_enumerateObjectsWithOptions_usingBlock_.invokeExact(this.handle, SEL_enumerateObjectsWithOptions_usingBlock_, opts, block);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray enumerateObjectsAtIndexes:options:usingBlock:]}
     *
     * @param opts a combination of {@link NSEnumerationOptions} flags
     */
    public void enumerateObjectsAtIndexes(final NSObject s, final long opts, final long block) {
        try {
            MH_enumerateObjectsAtIndexes_options_usingBlock_.invokeExact(this.handle, SEL_enumerateObjectsAtIndexes_options_usingBlock_, s.handle(), opts, block);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSArray indexOfObjectPassingTest:]} */
    public long indexOfObjectPassingTest(final long predicate) {
        try {
            return (long) MH_indexOfObjectPassingTest_.invokeExact(this.handle, SEL_indexOfObjectPassingTest_, predicate);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray indexOfObjectWithOptions:passingTest:]}
     *
     * @param opts a combination of {@link NSEnumerationOptions} flags
     */
    public long indexOfObjectWithOptions(final long opts, final long predicate) {
        try {
            return (long) MH_indexOfObjectWithOptions_passingTest_.invokeExact(this.handle, SEL_indexOfObjectWithOptions_passingTest_, opts, predicate);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray indexOfObjectAtIndexes:options:passingTest:]}
     *
     * @param opts a combination of {@link NSEnumerationOptions} flags
     */
    public long indexOfObjectAtIndexes(final NSObject s, final long opts, final long predicate) {
        try {
            return (long) MH_indexOfObjectAtIndexes_options_passingTest_.invokeExact(this.handle, SEL_indexOfObjectAtIndexes_options_passingTest_, s.handle(), opts, predicate);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray indexesOfObjectsPassingTest:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSObject indexesOfObjectsPassingTest(final long predicate) {
        try {
            long result = (long) MH_indexesOfObjectsPassingTest_.invokeExact(this.handle, SEL_indexesOfObjectsPassingTest_, predicate);
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray indexesOfObjectsWithOptions:passingTest:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     *
     * @param opts a combination of {@link NSEnumerationOptions} flags
     */
    public NSObject indexesOfObjectsWithOptions(final long opts, final long predicate) {
        try {
            long result = (long) MH_indexesOfObjectsWithOptions_passingTest_.invokeExact(this.handle, SEL_indexesOfObjectsWithOptions_passingTest_, opts, predicate);
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray indexesOfObjectsAtIndexes:options:passingTest:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     *
     * @param opts a combination of {@link NSEnumerationOptions} flags
     */
    public NSObject indexesOfObjectsAtIndexes(final NSObject s, final long opts, final long predicate) {
        try {
            long result = (long) MH_indexesOfObjectsAtIndexes_options_passingTest_.invokeExact(this.handle, SEL_indexesOfObjectsAtIndexes_options_passingTest_, s.handle(), opts, predicate);
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray sortedArrayUsingComparator:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<ObjectType> sortedArrayUsingComparator(final long cmptr) {
        try {
            long result = (long) MH_sortedArrayUsingComparator_.invokeExact(this.handle, SEL_sortedArrayUsingComparator_, cmptr);
            return new NSArray<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray sortedArrayWithOptions:usingComparator:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     *
     * @param opts a combination of {@link NSSortOptions} flags
     */
    public NSArray<ObjectType> sortedArrayWithOptions(final long opts, final long cmptr) {
        try {
            long result = (long) MH_sortedArrayWithOptions_usingComparator_.invokeExact(this.handle, SEL_sortedArrayWithOptions_usingComparator_, opts, cmptr);
            return new NSArray<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray indexOfObject:inSortedRange:options:usingComparator:]}
     *
     * @param opts a combination of {@link NSBinarySearchingOptions} flags
     */
    public long indexOfObject(final ObjectType obj, final NSRange r, final long opts, final long cmp) {
        try {
            return (long) MH_indexOfObject_inSortedRange_options_usingComparator_.invokeExact(this.handle, SEL_indexOfObject_inSortedRange_options_usingComparator_, obj.handle(), r.location(), r.length(), opts, cmp);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSArray description]} */
    public String description() {
        try {
            long result = (long) MH_description.invokeExact(this.handle, SEL_description);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray firstObject]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public ObjectType firstObject() {
        try {
            long result = (long) MH_firstObject.invokeExact(this.handle, SEL_firstObject);
            return result == 0L ? null : this.objectType.apply(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray lastObject]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public ObjectType lastObject() {
        try {
            long result = (long) MH_lastObject.invokeExact(this.handle, SEL_lastObject);
            return result == 0L ? null : this.objectType.apply(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray sortedArrayHint]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSData sortedArrayHint() {
        try {
            long result = (long) MH_sortedArrayHint.invokeExact(this.handle, SEL_sortedArrayHint);
            return new NSData(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSArray array]} */
    public static <ObjectType extends NSObject> NSArray<ObjectType> array(final LongFunction<ObjectType> objectType) {
        try {
            long result = (long) MH_CLASS_array.invokeExact(CLS, SEL_CLASS_array);
            return new NSArray<>(result, objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSArray arrayWithObject:]} */
    public static <ObjectType extends NSObject> NSArray<ObjectType> arrayWithObject(final LongFunction<ObjectType> objectType, final ObjectType anObject) {
        try {
            long result = (long) MH_CLASS_arrayWithObject_.invokeExact(CLS, SEL_CLASS_arrayWithObject_, anObject.handle());
            return new NSArray<>(result, objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSArray arrayWithObjects:count:]} */
    public static <ObjectType extends NSObject> NSArray<ObjectType> arrayWithObjects(final LongFunction<ObjectType> objectType, final MemorySegment objects, final long cnt) {
        try {
            long result = (long) MH_CLASS_arrayWithObjects_count_.invokeExact(CLS, SEL_CLASS_arrayWithObjects_count_, objects.address(), cnt);
            return new NSArray<>(result, objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSArray arrayWithArray:]} */
    public static <ObjectType extends NSObject> NSArray<ObjectType> arrayWithArray(final LongFunction<ObjectType> objectType, final NSArray<ObjectType> array) {
        try {
            long result = (long) MH_CLASS_arrayWithArray_.invokeExact(CLS, SEL_CLASS_arrayWithArray_, array.handle());
            return new NSArray<>(result, objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSArray initWithArray:]} */
    public NSArray<ObjectType> initWithArray(final NSArray<ObjectType> array) {
        try {
            long result = (long) MH_initWithArray_.invokeExact(this.handle, SEL_initWithArray_, array.handle());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSArray initWithArray:copyItems:]} */
    public NSArray<ObjectType> initWithArray(final NSArray<ObjectType> array, final boolean flag) {
        try {
            long result = (long) MH_initWithArray_copyItems_.invokeExact(this.handle, SEL_initWithArray_copyItems_, array.handle(), flag);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray initWithContentsOfURL:error:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public NSArray<ObjectType> initWithContentsOfURLError(final NSURL url) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_initWithContentsOfURL_error_.invokeExact(this.handle, SEL_initWithContentsOfURL_error_, url.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("initWithContentsOfURL:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new NSArray<>(result, this.objectType);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSArray arrayWithContentsOfURL:error:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static <ObjectType extends NSObject> NSArray<ObjectType> arrayWithContentsOfURLError(final LongFunction<ObjectType> objectType, final NSURL url) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_CLASS_arrayWithContentsOfURL_error_.invokeExact(CLS, SEL_CLASS_arrayWithContentsOfURL_error_, url.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("arrayWithContentsOfURL:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new NSArray<>(result, objectType);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray differenceFromArray:withOptions:usingEquivalenceTest:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     *
     * @param options a combination of {@link NSOrderedCollectionDifferenceCalculationOptions} flags
     */
    public NSObject differenceFromArray(final NSArray<ObjectType> other, final long options, final long block) {
        try {
            long result = (long) MH_differenceFromArray_withOptions_usingEquivalenceTest_.invokeExact(this.handle, SEL_differenceFromArray_withOptions_usingEquivalenceTest_, other.handle(), options, block);
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray differenceFromArray:withOptions:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     *
     * @param options a combination of {@link NSOrderedCollectionDifferenceCalculationOptions} flags
     */
    public NSObject differenceFromArray(final NSArray<ObjectType> other, final long options) {
        try {
            long result = (long) MH_differenceFromArray_withOptions_.invokeExact(this.handle, SEL_differenceFromArray_withOptions_, other.handle(), options);
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray differenceFromArray:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSObject differenceFromArray(final NSArray<ObjectType> other) {
        try {
            long result = (long) MH_differenceFromArray_.invokeExact(this.handle, SEL_differenceFromArray_, other.handle());
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray arrayByApplyingDifference:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<ObjectType> arrayByApplyingDifference(final NSObject difference) {
        try {
            long result = (long) MH_arrayByApplyingDifference_.invokeExact(this.handle, SEL_arrayByApplyingDifference_, difference.handle());
            return result == 0L ? null : new NSArray<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSArray getObjects:]} */
    public void getObjects(final MemorySegment objects) {
        try {
            MH_getObjects_.invokeExact(this.handle, SEL_getObjects_, objects.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSArray arrayWithContentsOfFile:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static <ObjectType extends NSObject> NSArray<ObjectType> arrayWithContentsOfFile(final LongFunction<ObjectType> objectType, final String path) {
        final long nsPath = ObjC.nsString(path);
        try {
            long result = (long) MH_CLASS_arrayWithContentsOfFile_.invokeExact(CLS, SEL_CLASS_arrayWithContentsOfFile_, nsPath);
            return result == 0L ? null : new NSArray<>(result, objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /**
     * {@code +[NSArray arrayWithContentsOfURL:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static <ObjectType extends NSObject> NSArray<ObjectType> arrayWithContentsOfURL(final LongFunction<ObjectType> objectType, final NSURL url) {
        try {
            long result = (long) MH_CLASS_arrayWithContentsOfURL_.invokeExact(CLS, SEL_CLASS_arrayWithContentsOfURL_, url.handle());
            return result == 0L ? null : new NSArray<>(result, objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray initWithContentsOfFile:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public NSArray<ObjectType> initWithContentsOfFile(final String path) {
        final long nsPath = ObjC.nsString(path);
        try {
            long result = (long) MH_initWithContentsOfFile_.invokeExact(this.handle, SEL_initWithContentsOfFile_, nsPath);
            return result == 0L ? null : new NSArray<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /**
     * {@code -[NSArray initWithContentsOfURL:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public NSArray<ObjectType> initWithContentsOfURL(final NSURL url) {
        try {
            long result = (long) MH_initWithContentsOfURL_.invokeExact(this.handle, SEL_initWithContentsOfURL_, url.handle());
            return result == 0L ? null : new NSArray<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSArray writeToFile:atomically:]} */
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

    /** {@code -[NSArray writeToURL:atomically:]} */
    public boolean writeToURL(final NSURL url, final boolean atomically) {
        try {
            return (boolean) MH_writeToURL_atomically_.invokeExact(this.handle, SEL_writeToURL_atomically_, url.handle(), atomically);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray pathsMatchingExtensions:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<NSString> pathsMatchingExtensions(final NSArray<NSString> filterTypes) {
        try {
            long result = (long) MH_pathsMatchingExtensions_.invokeExact(this.handle, SEL_pathsMatchingExtensions_, filterTypes.handle());
            return new NSArray<>(result, NSString::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray valueForKey:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSObject valueForKey(final String key) {
        final long nsKey = ObjC.nsString(key);
        try {
            long result = (long) MH_valueForKey_.invokeExact(this.handle, SEL_valueForKey_, nsKey);
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKey);
        }
    }

    /** {@code -[NSArray setValue:forKey:]} */
    public void setValue(@Nullable final NSObject value, final String key) {
        final long nsKey = ObjC.nsString(key);
        try {
            MH_setValue_forKey_.invokeExact(this.handle, SEL_setValue_forKey_, value == null ? 0L : value.handle(), nsKey);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKey);
        }
    }

    /**
     * {@code -[NSArray addObserver:toObjectsAtIndexes:forKeyPath:options:context:]}
     *
     * @param options a combination of {@link NSKeyValueObservingOptions} flags
     */
    public void addObserver(final NSObject observer, final NSObject indexes, final String keyPath, final long options, final MemorySegment context) {
        final long nsKeyPath = ObjC.nsString(keyPath);
        try {
            MH_addObserver_toObjectsAtIndexes_forKeyPath_options_context_.invokeExact(this.handle, SEL_addObserver_toObjectsAtIndexes_forKeyPath_options_context_, observer.handle(), indexes.handle(), nsKeyPath, options, context.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKeyPath);
        }
    }

    /** {@code -[NSArray removeObserver:fromObjectsAtIndexes:forKeyPath:context:]} */
    public void removeObserver(final NSObject observer, final NSObject indexes, final String keyPath, final MemorySegment context) {
        final long nsKeyPath = ObjC.nsString(keyPath);
        try {
            MH_removeObserver_fromObjectsAtIndexes_forKeyPath_context_.invokeExact(this.handle, SEL_removeObserver_fromObjectsAtIndexes_forKeyPath_context_, observer.handle(), indexes.handle(), nsKeyPath, context.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKeyPath);
        }
    }

    /** {@code -[NSArray removeObserver:fromObjectsAtIndexes:forKeyPath:]} */
    public void removeObserver(final NSObject observer, final NSObject indexes, final String keyPath) {
        final long nsKeyPath = ObjC.nsString(keyPath);
        try {
            MH_removeObserver_fromObjectsAtIndexes_forKeyPath_.invokeExact(this.handle, SEL_removeObserver_fromObjectsAtIndexes_forKeyPath_, observer.handle(), indexes.handle(), nsKeyPath);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKeyPath);
        }
    }

    /**
     * {@code -[NSArray addObserver:forKeyPath:options:context:]}
     *
     * @param options a combination of {@link NSKeyValueObservingOptions} flags
     */
    public void addObserver(final NSObject observer, final String keyPath, final long options, final MemorySegment context) {
        final long nsKeyPath = ObjC.nsString(keyPath);
        try {
            MH_addObserver_forKeyPath_options_context_.invokeExact(this.handle, SEL_addObserver_forKeyPath_options_context_, observer.handle(), nsKeyPath, options, context.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKeyPath);
        }
    }

    /** {@code -[NSArray removeObserver:forKeyPath:context:]} */
    public void removeObserver(final NSObject observer, final String keyPath, final MemorySegment context) {
        final long nsKeyPath = ObjC.nsString(keyPath);
        try {
            MH_removeObserver_forKeyPath_context_.invokeExact(this.handle, SEL_removeObserver_forKeyPath_context_, observer.handle(), nsKeyPath, context.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKeyPath);
        }
    }

    /** {@code -[NSArray removeObserver:forKeyPath:]} */
    public void removeObserver(final NSObject observer, final String keyPath) {
        final long nsKeyPath = ObjC.nsString(keyPath);
        try {
            MH_removeObserver_forKeyPath_.invokeExact(this.handle, SEL_removeObserver_forKeyPath_, observer.handle(), nsKeyPath);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKeyPath);
        }
    }

    /**
     * {@code -[NSArray sortedArrayUsingDescriptors:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<ObjectType> sortedArrayUsingDescriptors(final NSArray<NSObject> sortDescriptors) {
        try {
            long result = (long) MH_sortedArrayUsingDescriptors_.invokeExact(this.handle, SEL_sortedArrayUsingDescriptors_, sortDescriptors.handle());
            return new NSArray<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSArray filteredArrayUsingPredicate:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<ObjectType> filteredArrayUsingPredicate(final NSObject predicate) {
        try {
            long result = (long) MH_filteredArrayUsingPredicate_.invokeExact(this.handle, SEL_filteredArrayUsingPredicate_, predicate.handle());
            return new NSArray<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
