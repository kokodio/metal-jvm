package io.github.kokodio.metaljvm.foundation;

import io.github.kokodio.metaljvm.quartzcore.CATransform3D;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code NSValue}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsvalue">Apple documentation</a>
 */
public class NSValue extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Foundation");
    private static final long CLS = ObjC.clazz("NSValue");
    private static final long SEL_getValue_size_ = ObjC.selector("getValue:size:");
    private static final MethodHandle MH_getValue_size_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithBytes_objCType_ = ObjC.selector("initWithBytes:objCType:");
    private static final MethodHandle MH_initWithBytes_objCType_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithCoder_ = ObjC.selector("initWithCoder:");
    private static final MethodHandle MH_initWithCoder_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_objCType = ObjC.selector("objCType");
    private static final MethodHandle MH_objCType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_valueWithBytes_objCType_ = ObjC.selector("valueWithBytes:objCType:");
    private static final MethodHandle MH_CLASS_valueWithBytes_objCType_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_value_withObjCType_ = ObjC.selector("value:withObjCType:");
    private static final MethodHandle MH_CLASS_value_withObjCType_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_valueWithNonretainedObject_ = ObjC.selector("valueWithNonretainedObject:");
    private static final MethodHandle MH_CLASS_valueWithNonretainedObject_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_valueWithPointer_ = ObjC.selector("valueWithPointer:");
    private static final MethodHandle MH_CLASS_valueWithPointer_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isEqualToValue_ = ObjC.selector("isEqualToValue:");
    private static final MethodHandle MH_isEqualToValue_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_nonretainedObjectValue = ObjC.selector("nonretainedObjectValue");
    private static final MethodHandle MH_nonretainedObjectValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pointerValue = ObjC.selector("pointerValue");
    private static final MethodHandle MH_pointerValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getValue_ = ObjC.selector("getValue:");
    private static final MethodHandle MH_getValue_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_valueWithRange_ = ObjC.selector("valueWithRange:");
    private static final MethodHandle MH_CLASS_valueWithRange_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rangeValue = ObjC.selector("rangeValue");
    private static final MethodHandle MH_rangeValue = ObjC.msgSendCritical(FunctionDescriptor.of(NSRange.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_valueWithPoint_ = ObjC.selector("valueWithPoint:");
    private static final MethodHandle MH_CLASS_valueWithPoint_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_CLASS_valueWithSize_ = ObjC.selector("valueWithSize:");
    private static final MethodHandle MH_CLASS_valueWithSize_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_CLASS_valueWithRect_ = ObjC.selector("valueWithRect:");
    private static final MethodHandle MH_CLASS_valueWithRect_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_CLASS_valueWithEdgeInsets_ = ObjC.selector("valueWithEdgeInsets:");
    private static final MethodHandle MH_CLASS_valueWithEdgeInsets_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_pointValue = ObjC.selector("pointValue");
    private static final MethodHandle MH_pointValue = ObjC.msgSendCritical(FunctionDescriptor.of(NSPoint.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sizeValue = ObjC.selector("sizeValue");
    private static final MethodHandle MH_sizeValue = ObjC.msgSendCritical(FunctionDescriptor.of(NSSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rectValue = ObjC.selector("rectValue");
    private static final MethodHandle MH_rectValue = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_edgeInsetsValue = ObjC.selector("edgeInsetsValue");
    private static final MethodHandle MH_edgeInsetsValue = ObjC.msgSendCritical(FunctionDescriptor.of(NSEdgeInsets.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_valueWithCATransform3D_ = ObjC.selector("valueWithCATransform3D:");
    private static final MethodHandle MH_CLASS_valueWithCATransform3D_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CATransform3DValue = ObjC.selector("CATransform3DValue");
    private static final MethodHandle MH_CATransform3DValue = ObjC.msgSendCritical(FunctionDescriptor.of(CATransform3D.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public NSValue(final long handle) {
        super(handle);
    }

    /**
     * {@code +[NSValue alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static NSValue alloc() {
        try {
            return new NSValue((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSValue init]} */
    public NSValue init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSValue getValue:size:]} */
    public void getValue(final MemorySegment value, final long size) {
        try {
            MH_getValue_size_.invokeExact(this.handle, SEL_getValue_size_, value.address(), size);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSValue initWithBytes:objCType:]} */
    public NSValue initWithBytes(final MemorySegment value, final MemorySegment type) {
        try {
            long result = (long) MH_initWithBytes_objCType_.invokeExact(this.handle, SEL_initWithBytes_objCType_, value.address(), type.address());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSValue initWithCoder:]} */
    @Nullable
    public NSValue init(final NSObject coder) {
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

    /** {@code -[NSValue objCType]} */
    public MemorySegment objCType() {
        try {
            return MemorySegment.ofAddress((long) MH_objCType.invokeExact(this.handle, SEL_objCType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSValue valueWithBytes:objCType:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSValue valueWithBytes(final MemorySegment value, final MemorySegment type) {
        try {
            long result = (long) MH_CLASS_valueWithBytes_objCType_.invokeExact(CLS, SEL_CLASS_valueWithBytes_objCType_, value.address(), type.address());
            return new NSValue(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSValue value:withObjCType:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSValue value(final MemorySegment value, final MemorySegment type) {
        try {
            long result = (long) MH_CLASS_value_withObjCType_.invokeExact(CLS, SEL_CLASS_value_withObjCType_, value.address(), type.address());
            return new NSValue(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSValue valueWithNonretainedObject:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSValue valueWithNonretainedObject(@Nullable final NSObject anObject) {
        try {
            long result = (long) MH_CLASS_valueWithNonretainedObject_.invokeExact(CLS, SEL_CLASS_valueWithNonretainedObject_, anObject == null ? 0L : anObject.handle());
            return new NSValue(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSValue valueWithPointer:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSValue valueWithPointer(final MemorySegment pointer) {
        try {
            long result = (long) MH_CLASS_valueWithPointer_.invokeExact(CLS, SEL_CLASS_valueWithPointer_, pointer.address());
            return new NSValue(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSValue isEqualToValue:]} */
    public boolean isEqualToValue(final NSValue value) {
        try {
            return (boolean) MH_isEqualToValue_.invokeExact(this.handle, SEL_isEqualToValue_, value.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSValue nonretainedObjectValue]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject nonretainedObjectValue() {
        try {
            long result = (long) MH_nonretainedObjectValue.invokeExact(this.handle, SEL_nonretainedObjectValue);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSValue pointerValue]} */
    public MemorySegment pointerValue() {
        try {
            return MemorySegment.ofAddress((long) MH_pointerValue.invokeExact(this.handle, SEL_pointerValue));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSValue getValue:]} */
    public void getValue(final MemorySegment value) {
        try {
            MH_getValue_.invokeExact(this.handle, SEL_getValue_, value.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSValue valueWithRange:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSValue valueWithRange(final NSRange range) {
        try {
            long result = (long) MH_CLASS_valueWithRange_.invokeExact(CLS, SEL_CLASS_valueWithRange_, range.location(), range.length());
            return new NSValue(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSValue rangeValue]} */
    public NSRange rangeValue() {
        try (NativeStack stack = NativeStack.push()) {
            return NSRange.read((MemorySegment) MH_rangeValue.invokeExact((SegmentAllocator) stack, this.handle, SEL_rangeValue));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSValue valueWithPoint:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSValue valueWithPoint(final NSPoint point) {
        try {
            long result = (long) MH_CLASS_valueWithPoint_.invokeExact(CLS, SEL_CLASS_valueWithPoint_, point.x(), point.y());
            return new NSValue(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSValue valueWithSize:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSValue valueWithSize(final NSSize size) {
        try {
            long result = (long) MH_CLASS_valueWithSize_.invokeExact(CLS, SEL_CLASS_valueWithSize_, size.width(), size.height());
            return new NSValue(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSValue valueWithRect:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSValue valueWithRect(final NSRect rect) {
        try {
            long result = (long) MH_CLASS_valueWithRect_.invokeExact(CLS, SEL_CLASS_valueWithRect_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height());
            return new NSValue(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSValue valueWithEdgeInsets:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSValue valueWithEdgeInsets(final NSEdgeInsets insets) {
        try {
            long result = (long) MH_CLASS_valueWithEdgeInsets_.invokeExact(CLS, SEL_CLASS_valueWithEdgeInsets_, insets.top(), insets.left(), insets.bottom(), insets.right());
            return new NSValue(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSValue pointValue]} */
    public NSPoint pointValue() {
        try (NativeStack stack = NativeStack.push()) {
            return NSPoint.read((MemorySegment) MH_pointValue.invokeExact((SegmentAllocator) stack, this.handle, SEL_pointValue));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSValue sizeValue]} */
    public NSSize sizeValue() {
        try (NativeStack stack = NativeStack.push()) {
            return NSSize.read((MemorySegment) MH_sizeValue.invokeExact((SegmentAllocator) stack, this.handle, SEL_sizeValue));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSValue rectValue]} */
    public NSRect rectValue() {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_rectValue.invokeExact((SegmentAllocator) stack, this.handle, SEL_rectValue));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSValue edgeInsetsValue]} */
    public NSEdgeInsets edgeInsetsValue() {
        try (NativeStack stack = NativeStack.push()) {
            return NSEdgeInsets.read((MemorySegment) MH_edgeInsetsValue.invokeExact((SegmentAllocator) stack, this.handle, SEL_edgeInsetsValue));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSValue valueWithCATransform3D:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSValue valueWithCATransform3D(final CATransform3D t) {
        try (NativeStack stack = NativeStack.push()) {
            long result = (long) MH_CLASS_valueWithCATransform3D_.invokeExact(CLS, SEL_CLASS_valueWithCATransform3D_, t.on(stack).address());
            return new NSValue(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSValue CATransform3DValue]} */
    public CATransform3D CATransform3DValue() {
        try (NativeStack stack = NativeStack.push()) {
            return CATransform3D.read((MemorySegment) MH_CATransform3DValue.invokeExact((SegmentAllocator) stack, this.handle, SEL_CATransform3DValue));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
