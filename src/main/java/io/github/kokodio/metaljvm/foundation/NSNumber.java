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
import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
import static java.lang.foreign.ValueLayout.JAVA_SHORT;

/**
 * {@code NSNumber}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsnumber">Apple documentation</a>
 */
public class NSNumber extends NSValue {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Foundation");
    private static final long CLS = ObjC.clazz("NSNumber");
    private static final long SEL_initWithCoder_ = ObjC.selector("initWithCoder:");
    private static final MethodHandle MH_initWithCoder_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithChar_ = ObjC.selector("initWithChar:");
    private static final MethodHandle MH_initWithChar_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BYTE));
    private static final long SEL_initWithUnsignedChar_ = ObjC.selector("initWithUnsignedChar:");
    private static final MethodHandle MH_initWithUnsignedChar_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BYTE));
    private static final long SEL_initWithShort_ = ObjC.selector("initWithShort:");
    private static final MethodHandle MH_initWithShort_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_SHORT));
    private static final long SEL_initWithUnsignedShort_ = ObjC.selector("initWithUnsignedShort:");
    private static final MethodHandle MH_initWithUnsignedShort_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_SHORT));
    private static final long SEL_initWithInt_ = ObjC.selector("initWithInt:");
    private static final MethodHandle MH_initWithInt_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_INT));
    private static final long SEL_initWithUnsignedInt_ = ObjC.selector("initWithUnsignedInt:");
    private static final MethodHandle MH_initWithUnsignedInt_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_INT));
    private static final long SEL_initWithLong_ = ObjC.selector("initWithLong:");
    private static final MethodHandle MH_initWithLong_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithUnsignedLong_ = ObjC.selector("initWithUnsignedLong:");
    private static final MethodHandle MH_initWithUnsignedLong_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithLongLong_ = ObjC.selector("initWithLongLong:");
    private static final MethodHandle MH_initWithLongLong_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithUnsignedLongLong_ = ObjC.selector("initWithUnsignedLongLong:");
    private static final MethodHandle MH_initWithUnsignedLongLong_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithFloat_ = ObjC.selector("initWithFloat:");
    private static final MethodHandle MH_initWithFloat_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_initWithDouble_ = ObjC.selector("initWithDouble:");
    private static final MethodHandle MH_initWithDouble_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_initWithBool_ = ObjC.selector("initWithBool:");
    private static final MethodHandle MH_initWithBool_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_initWithInteger_ = ObjC.selector("initWithInteger:");
    private static final MethodHandle MH_initWithInteger_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithUnsignedInteger_ = ObjC.selector("initWithUnsignedInteger:");
    private static final MethodHandle MH_initWithUnsignedInteger_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_compare_ = ObjC.selector("compare:");
    private static final MethodHandle MH_compare_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isEqualToNumber_ = ObjC.selector("isEqualToNumber:");
    private static final MethodHandle MH_isEqualToNumber_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_descriptionWithLocale_ = ObjC.selector("descriptionWithLocale:");
    private static final MethodHandle MH_descriptionWithLocale_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_charValue = ObjC.selector("charValue");
    private static final MethodHandle MH_charValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BYTE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_unsignedCharValue = ObjC.selector("unsignedCharValue");
    private static final MethodHandle MH_unsignedCharValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BYTE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_shortValue = ObjC.selector("shortValue");
    private static final MethodHandle MH_shortValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_SHORT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_unsignedShortValue = ObjC.selector("unsignedShortValue");
    private static final MethodHandle MH_unsignedShortValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_SHORT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_intValue = ObjC.selector("intValue");
    private static final MethodHandle MH_intValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_unsignedIntValue = ObjC.selector("unsignedIntValue");
    private static final MethodHandle MH_unsignedIntValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_longValue = ObjC.selector("longValue");
    private static final MethodHandle MH_longValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_unsignedLongValue = ObjC.selector("unsignedLongValue");
    private static final MethodHandle MH_unsignedLongValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_longLongValue = ObjC.selector("longLongValue");
    private static final MethodHandle MH_longLongValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_unsignedLongLongValue = ObjC.selector("unsignedLongLongValue");
    private static final MethodHandle MH_unsignedLongLongValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_floatValue = ObjC.selector("floatValue");
    private static final MethodHandle MH_floatValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_doubleValue = ObjC.selector("doubleValue");
    private static final MethodHandle MH_doubleValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_boolValue = ObjC.selector("boolValue");
    private static final MethodHandle MH_boolValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_integerValue = ObjC.selector("integerValue");
    private static final MethodHandle MH_integerValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_unsignedIntegerValue = ObjC.selector("unsignedIntegerValue");
    private static final MethodHandle MH_unsignedIntegerValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringValue = ObjC.selector("stringValue");
    private static final MethodHandle MH_stringValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_numberWithChar_ = ObjC.selector("numberWithChar:");
    private static final MethodHandle MH_CLASS_numberWithChar_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BYTE));
    private static final long SEL_CLASS_numberWithUnsignedChar_ = ObjC.selector("numberWithUnsignedChar:");
    private static final MethodHandle MH_CLASS_numberWithUnsignedChar_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BYTE));
    private static final long SEL_CLASS_numberWithShort_ = ObjC.selector("numberWithShort:");
    private static final MethodHandle MH_CLASS_numberWithShort_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_SHORT));
    private static final long SEL_CLASS_numberWithUnsignedShort_ = ObjC.selector("numberWithUnsignedShort:");
    private static final MethodHandle MH_CLASS_numberWithUnsignedShort_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_SHORT));
    private static final long SEL_CLASS_numberWithInt_ = ObjC.selector("numberWithInt:");
    private static final MethodHandle MH_CLASS_numberWithInt_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_INT));
    private static final long SEL_CLASS_numberWithUnsignedInt_ = ObjC.selector("numberWithUnsignedInt:");
    private static final MethodHandle MH_CLASS_numberWithUnsignedInt_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_INT));
    private static final long SEL_CLASS_numberWithLong_ = ObjC.selector("numberWithLong:");
    private static final MethodHandle MH_CLASS_numberWithLong_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_numberWithUnsignedLong_ = ObjC.selector("numberWithUnsignedLong:");
    private static final MethodHandle MH_CLASS_numberWithUnsignedLong_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_numberWithLongLong_ = ObjC.selector("numberWithLongLong:");
    private static final MethodHandle MH_CLASS_numberWithLongLong_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_numberWithUnsignedLongLong_ = ObjC.selector("numberWithUnsignedLongLong:");
    private static final MethodHandle MH_CLASS_numberWithUnsignedLongLong_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_numberWithFloat_ = ObjC.selector("numberWithFloat:");
    private static final MethodHandle MH_CLASS_numberWithFloat_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_CLASS_numberWithDouble_ = ObjC.selector("numberWithDouble:");
    private static final MethodHandle MH_CLASS_numberWithDouble_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_CLASS_numberWithBool_ = ObjC.selector("numberWithBool:");
    private static final MethodHandle MH_CLASS_numberWithBool_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_CLASS_numberWithInteger_ = ObjC.selector("numberWithInteger:");
    private static final MethodHandle MH_CLASS_numberWithInteger_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_numberWithUnsignedInteger_ = ObjC.selector("numberWithUnsignedInteger:");
    private static final MethodHandle MH_CLASS_numberWithUnsignedInteger_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_decimalValue = ObjC.selector("decimalValue");
    private static final MethodHandle MH_decimalValue = ObjC.msgSendCritical(FunctionDescriptor.of(NSDecimal.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public NSNumber(final long handle) {
        super(handle);
    }

    /**
     * {@code +[NSNumber alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static NSNumber alloc() {
        try {
            return new NSNumber((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber init]} */
    public NSNumber init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber initWithCoder:]} */
    @Nullable
    public NSNumber init(final NSObject coder) {
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

    /**
     * {@code -[NSNumber initWithChar:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public NSNumber initWithChar(final byte value) {
        try {
            long result = (long) MH_initWithChar_.invokeExact(this.handle, SEL_initWithChar_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSNumber initWithUnsignedChar:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public NSNumber initWithUnsignedChar(final byte value) {
        try {
            long result = (long) MH_initWithUnsignedChar_.invokeExact(this.handle, SEL_initWithUnsignedChar_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSNumber initWithShort:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public NSNumber initWithShort(final short value) {
        try {
            long result = (long) MH_initWithShort_.invokeExact(this.handle, SEL_initWithShort_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSNumber initWithUnsignedShort:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public NSNumber initWithUnsignedShort(final short value) {
        try {
            long result = (long) MH_initWithUnsignedShort_.invokeExact(this.handle, SEL_initWithUnsignedShort_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSNumber initWithInt:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public NSNumber initWithInt(final int value) {
        try {
            long result = (long) MH_initWithInt_.invokeExact(this.handle, SEL_initWithInt_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSNumber initWithUnsignedInt:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public NSNumber initWithUnsignedInt(final int value) {
        try {
            long result = (long) MH_initWithUnsignedInt_.invokeExact(this.handle, SEL_initWithUnsignedInt_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSNumber initWithLong:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public NSNumber initWithLong(final long value) {
        try {
            long result = (long) MH_initWithLong_.invokeExact(this.handle, SEL_initWithLong_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSNumber initWithUnsignedLong:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public NSNumber initWithUnsignedLong(final long value) {
        try {
            long result = (long) MH_initWithUnsignedLong_.invokeExact(this.handle, SEL_initWithUnsignedLong_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSNumber initWithLongLong:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public NSNumber initWithLongLong(final long value) {
        try {
            long result = (long) MH_initWithLongLong_.invokeExact(this.handle, SEL_initWithLongLong_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSNumber initWithUnsignedLongLong:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public NSNumber initWithUnsignedLongLong(final long value) {
        try {
            long result = (long) MH_initWithUnsignedLongLong_.invokeExact(this.handle, SEL_initWithUnsignedLongLong_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSNumber initWithFloat:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public NSNumber initWithFloat(final float value) {
        try {
            long result = (long) MH_initWithFloat_.invokeExact(this.handle, SEL_initWithFloat_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSNumber initWithDouble:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public NSNumber initWithDouble(final double value) {
        try {
            long result = (long) MH_initWithDouble_.invokeExact(this.handle, SEL_initWithDouble_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSNumber initWithBool:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public NSNumber initWithBool(final boolean value) {
        try {
            long result = (long) MH_initWithBool_.invokeExact(this.handle, SEL_initWithBool_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSNumber initWithInteger:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public NSNumber initWithInteger(final long value) {
        try {
            long result = (long) MH_initWithInteger_.invokeExact(this.handle, SEL_initWithInteger_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSNumber initWithUnsignedInteger:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public NSNumber initWithUnsignedInteger(final long value) {
        try {
            long result = (long) MH_initWithUnsignedInteger_.invokeExact(this.handle, SEL_initWithUnsignedInteger_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber compare:]} */
    public NSComparisonResult compare(final NSNumber otherNumber) {
        try {
            return NSComparisonResult.of((long) MH_compare_.invokeExact(this.handle, SEL_compare_, otherNumber.handle()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber isEqualToNumber:]} */
    public boolean isEqualToNumber(final NSNumber number) {
        try {
            return (boolean) MH_isEqualToNumber_.invokeExact(this.handle, SEL_isEqualToNumber_, number.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber descriptionWithLocale:]} */
    public String description(@Nullable final NSObject locale) {
        try {
            long result = (long) MH_descriptionWithLocale_.invokeExact(this.handle, SEL_descriptionWithLocale_, locale == null ? 0L : locale.handle());
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber charValue]} */
    public byte charValue() {
        try {
            return (byte) MH_charValue.invokeExact(this.handle, SEL_charValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber unsignedCharValue]} */
    public byte unsignedCharValue() {
        try {
            return (byte) MH_unsignedCharValue.invokeExact(this.handle, SEL_unsignedCharValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber shortValue]} */
    public short shortValue() {
        try {
            return (short) MH_shortValue.invokeExact(this.handle, SEL_shortValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber unsignedShortValue]} */
    public short unsignedShortValue() {
        try {
            return (short) MH_unsignedShortValue.invokeExact(this.handle, SEL_unsignedShortValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber intValue]} */
    public int intValue() {
        try {
            return (int) MH_intValue.invokeExact(this.handle, SEL_intValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber unsignedIntValue]} */
    public int unsignedIntValue() {
        try {
            return (int) MH_unsignedIntValue.invokeExact(this.handle, SEL_unsignedIntValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber longValue]} */
    public long longValue() {
        try {
            return (long) MH_longValue.invokeExact(this.handle, SEL_longValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber unsignedLongValue]} */
    public long unsignedLongValue() {
        try {
            return (long) MH_unsignedLongValue.invokeExact(this.handle, SEL_unsignedLongValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber longLongValue]} */
    public long longLongValue() {
        try {
            return (long) MH_longLongValue.invokeExact(this.handle, SEL_longLongValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber unsignedLongLongValue]} */
    public long unsignedLongLongValue() {
        try {
            return (long) MH_unsignedLongLongValue.invokeExact(this.handle, SEL_unsignedLongLongValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber floatValue]} */
    public float floatValue() {
        try {
            return (float) MH_floatValue.invokeExact(this.handle, SEL_floatValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber doubleValue]} */
    public double doubleValue() {
        try {
            return (double) MH_doubleValue.invokeExact(this.handle, SEL_doubleValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber boolValue]} */
    public boolean boolValue() {
        try {
            return (boolean) MH_boolValue.invokeExact(this.handle, SEL_boolValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber integerValue]} */
    public long integerValue() {
        try {
            return (long) MH_integerValue.invokeExact(this.handle, SEL_integerValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber unsignedIntegerValue]} */
    public long unsignedIntegerValue() {
        try {
            return (long) MH_unsignedIntegerValue.invokeExact(this.handle, SEL_unsignedIntegerValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber stringValue]} */
    public String stringValue() {
        try {
            long result = (long) MH_stringValue.invokeExact(this.handle, SEL_stringValue);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSNumber numberWithChar:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSNumber numberWithChar(final byte value) {
        try {
            long result = (long) MH_CLASS_numberWithChar_.invokeExact(CLS, SEL_CLASS_numberWithChar_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSNumber numberWithUnsignedChar:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSNumber numberWithUnsignedChar(final byte value) {
        try {
            long result = (long) MH_CLASS_numberWithUnsignedChar_.invokeExact(CLS, SEL_CLASS_numberWithUnsignedChar_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSNumber numberWithShort:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSNumber numberWithShort(final short value) {
        try {
            long result = (long) MH_CLASS_numberWithShort_.invokeExact(CLS, SEL_CLASS_numberWithShort_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSNumber numberWithUnsignedShort:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSNumber numberWithUnsignedShort(final short value) {
        try {
            long result = (long) MH_CLASS_numberWithUnsignedShort_.invokeExact(CLS, SEL_CLASS_numberWithUnsignedShort_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSNumber numberWithInt:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSNumber numberWithInt(final int value) {
        try {
            long result = (long) MH_CLASS_numberWithInt_.invokeExact(CLS, SEL_CLASS_numberWithInt_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSNumber numberWithUnsignedInt:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSNumber numberWithUnsignedInt(final int value) {
        try {
            long result = (long) MH_CLASS_numberWithUnsignedInt_.invokeExact(CLS, SEL_CLASS_numberWithUnsignedInt_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSNumber numberWithLong:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSNumber numberWithLong(final long value) {
        try {
            long result = (long) MH_CLASS_numberWithLong_.invokeExact(CLS, SEL_CLASS_numberWithLong_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSNumber numberWithUnsignedLong:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSNumber numberWithUnsignedLong(final long value) {
        try {
            long result = (long) MH_CLASS_numberWithUnsignedLong_.invokeExact(CLS, SEL_CLASS_numberWithUnsignedLong_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSNumber numberWithLongLong:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSNumber numberWithLongLong(final long value) {
        try {
            long result = (long) MH_CLASS_numberWithLongLong_.invokeExact(CLS, SEL_CLASS_numberWithLongLong_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSNumber numberWithUnsignedLongLong:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSNumber numberWithUnsignedLongLong(final long value) {
        try {
            long result = (long) MH_CLASS_numberWithUnsignedLongLong_.invokeExact(CLS, SEL_CLASS_numberWithUnsignedLongLong_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSNumber numberWithFloat:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSNumber numberWithFloat(final float value) {
        try {
            long result = (long) MH_CLASS_numberWithFloat_.invokeExact(CLS, SEL_CLASS_numberWithFloat_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSNumber numberWithDouble:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSNumber numberWithDouble(final double value) {
        try {
            long result = (long) MH_CLASS_numberWithDouble_.invokeExact(CLS, SEL_CLASS_numberWithDouble_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSNumber numberWithBool:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSNumber numberWithBool(final boolean value) {
        try {
            long result = (long) MH_CLASS_numberWithBool_.invokeExact(CLS, SEL_CLASS_numberWithBool_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSNumber numberWithInteger:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSNumber numberWithInteger(final long value) {
        try {
            long result = (long) MH_CLASS_numberWithInteger_.invokeExact(CLS, SEL_CLASS_numberWithInteger_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSNumber numberWithUnsignedInteger:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSNumber numberWithUnsignedInteger(final long value) {
        try {
            long result = (long) MH_CLASS_numberWithUnsignedInteger_.invokeExact(CLS, SEL_CLASS_numberWithUnsignedInteger_, value);
            return new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNumber decimalValue]} */
    public NSDecimal decimalValue() {
        try (NativeStack stack = NativeStack.push()) {
            return NSDecimal.read((MemorySegment) MH_decimalValue.invokeExact((SegmentAllocator) stack, this.handle, SEL_decimalValue));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
