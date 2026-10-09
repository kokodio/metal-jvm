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
import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
import static java.lang.foreign.ValueLayout.JAVA_SHORT;

/**
 * {@code NSString}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsstring">Apple documentation</a>
 */
public class NSString extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Foundation");
    private static final long CLS = ObjC.clazz("NSString");
    private static final long SEL_characterAtIndex_ = ObjC.selector("characterAtIndex:");
    private static final MethodHandle MH_characterAtIndex_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_SHORT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");
    private static final MethodHandle MH_init = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithCoder_ = ObjC.selector("initWithCoder:");
    private static final MethodHandle MH_initWithCoder_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_length = ObjC.selector("length");
    private static final MethodHandle MH_length = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_substringFromIndex_ = ObjC.selector("substringFromIndex:");
    private static final MethodHandle MH_substringFromIndex_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_substringToIndex_ = ObjC.selector("substringToIndex:");
    private static final MethodHandle MH_substringToIndex_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_substringWithRange_ = ObjC.selector("substringWithRange:");
    private static final MethodHandle MH_substringWithRange_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getCharacters_range_ = ObjC.selector("getCharacters:range:");
    private static final MethodHandle MH_getCharacters_range_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_compare_ = ObjC.selector("compare:");
    private static final MethodHandle MH_compare_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_compare_options_ = ObjC.selector("compare:options:");
    private static final MethodHandle MH_compare_options_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_compare_options_range_ = ObjC.selector("compare:options:range:");
    private static final MethodHandle MH_compare_options_range_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_compare_options_range_locale_ = ObjC.selector("compare:options:range:locale:");
    private static final MethodHandle MH_compare_options_range_locale_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_caseInsensitiveCompare_ = ObjC.selector("caseInsensitiveCompare:");
    private static final MethodHandle MH_caseInsensitiveCompare_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_localizedCompare_ = ObjC.selector("localizedCompare:");
    private static final MethodHandle MH_localizedCompare_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_localizedCaseInsensitiveCompare_ = ObjC.selector("localizedCaseInsensitiveCompare:");
    private static final MethodHandle MH_localizedCaseInsensitiveCompare_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_localizedStandardCompare_ = ObjC.selector("localizedStandardCompare:");
    private static final MethodHandle MH_localizedStandardCompare_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isEqualToString_ = ObjC.selector("isEqualToString:");
    private static final MethodHandle MH_isEqualToString_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_hasPrefix_ = ObjC.selector("hasPrefix:");
    private static final MethodHandle MH_hasPrefix_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_hasSuffix_ = ObjC.selector("hasSuffix:");
    private static final MethodHandle MH_hasSuffix_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_commonPrefixWithString_options_ = ObjC.selector("commonPrefixWithString:options:");
    private static final MethodHandle MH_commonPrefixWithString_options_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_containsString_ = ObjC.selector("containsString:");
    private static final MethodHandle MH_containsString_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_localizedCaseInsensitiveContainsString_ = ObjC.selector("localizedCaseInsensitiveContainsString:");
    private static final MethodHandle MH_localizedCaseInsensitiveContainsString_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_localizedStandardContainsString_ = ObjC.selector("localizedStandardContainsString:");
    private static final MethodHandle MH_localizedStandardContainsString_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_localizedStandardRangeOfString_ = ObjC.selector("localizedStandardRangeOfString:");
    private static final MethodHandle MH_localizedStandardRangeOfString_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRange.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rangeOfString_ = ObjC.selector("rangeOfString:");
    private static final MethodHandle MH_rangeOfString_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRange.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rangeOfString_options_ = ObjC.selector("rangeOfString:options:");
    private static final MethodHandle MH_rangeOfString_options_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRange.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rangeOfString_options_range_ = ObjC.selector("rangeOfString:options:range:");
    private static final MethodHandle MH_rangeOfString_options_range_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRange.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rangeOfString_options_range_locale_ = ObjC.selector("rangeOfString:options:range:locale:");
    private static final MethodHandle MH_rangeOfString_options_range_locale_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRange.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rangeOfCharacterFromSet_ = ObjC.selector("rangeOfCharacterFromSet:");
    private static final MethodHandle MH_rangeOfCharacterFromSet_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRange.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rangeOfCharacterFromSet_options_ = ObjC.selector("rangeOfCharacterFromSet:options:");
    private static final MethodHandle MH_rangeOfCharacterFromSet_options_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRange.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rangeOfCharacterFromSet_options_range_ = ObjC.selector("rangeOfCharacterFromSet:options:range:");
    private static final MethodHandle MH_rangeOfCharacterFromSet_options_range_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRange.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rangeOfComposedCharacterSequenceAtIndex_ = ObjC.selector("rangeOfComposedCharacterSequenceAtIndex:");
    private static final MethodHandle MH_rangeOfComposedCharacterSequenceAtIndex_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRange.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rangeOfComposedCharacterSequencesForRange_ = ObjC.selector("rangeOfComposedCharacterSequencesForRange:");
    private static final MethodHandle MH_rangeOfComposedCharacterSequencesForRange_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRange.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringByAppendingString_ = ObjC.selector("stringByAppendingString:");
    private static final MethodHandle MH_stringByAppendingString_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_uppercaseStringWithLocale_ = ObjC.selector("uppercaseStringWithLocale:");
    private static final MethodHandle MH_uppercaseStringWithLocale_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_lowercaseStringWithLocale_ = ObjC.selector("lowercaseStringWithLocale:");
    private static final MethodHandle MH_lowercaseStringWithLocale_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_capitalizedStringWithLocale_ = ObjC.selector("capitalizedStringWithLocale:");
    private static final MethodHandle MH_capitalizedStringWithLocale_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getLineStart_end_contentsEnd_forRange_ = ObjC.selector("getLineStart:end:contentsEnd:forRange:");
    private static final MethodHandle MH_getLineStart_end_contentsEnd_forRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_lineRangeForRange_ = ObjC.selector("lineRangeForRange:");
    private static final MethodHandle MH_lineRangeForRange_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRange.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getParagraphStart_end_contentsEnd_forRange_ = ObjC.selector("getParagraphStart:end:contentsEnd:forRange:");
    private static final MethodHandle MH_getParagraphStart_end_contentsEnd_forRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_paragraphRangeForRange_ = ObjC.selector("paragraphRangeForRange:");
    private static final MethodHandle MH_paragraphRangeForRange_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRange.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_enumerateSubstringsInRange_options_usingBlock_ = ObjC.selector("enumerateSubstringsInRange:options:usingBlock:");
    private static final MethodHandle MH_enumerateSubstringsInRange_options_usingBlock_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_enumerateLinesUsingBlock_ = ObjC.selector("enumerateLinesUsingBlock:");
    private static final MethodHandle MH_enumerateLinesUsingBlock_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dataUsingEncoding_allowLossyConversion_ = ObjC.selector("dataUsingEncoding:allowLossyConversion:");
    private static final MethodHandle MH_dataUsingEncoding_allowLossyConversion_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_dataUsingEncoding_ = ObjC.selector("dataUsingEncoding:");
    private static final MethodHandle MH_dataUsingEncoding_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_canBeConvertedToEncoding_ = ObjC.selector("canBeConvertedToEncoding:");
    private static final MethodHandle MH_canBeConvertedToEncoding_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_cStringUsingEncoding_ = ObjC.selector("cStringUsingEncoding:");
    private static final MethodHandle MH_cStringUsingEncoding_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getCString_maxLength_encoding_ = ObjC.selector("getCString:maxLength:encoding:");
    private static final MethodHandle MH_getCString_maxLength_encoding_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getBytes_maxLength_usedLength_encoding_options_range_remainingRange_ = ObjC.selector("getBytes:maxLength:usedLength:encoding:options:range:remainingRange:");
    private static final MethodHandle MH_getBytes_maxLength_usedLength_encoding_options_range_remainingRange_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, NSRange.LAYOUT, JAVA_LONG));
    private static final long SEL_maximumLengthOfBytesUsingEncoding_ = ObjC.selector("maximumLengthOfBytesUsingEncoding:");
    private static final MethodHandle MH_maximumLengthOfBytesUsingEncoding_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_lengthOfBytesUsingEncoding_ = ObjC.selector("lengthOfBytesUsingEncoding:");
    private static final MethodHandle MH_lengthOfBytesUsingEncoding_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_localizedNameOfStringEncoding_ = ObjC.selector("localizedNameOfStringEncoding:");
    private static final MethodHandle MH_CLASS_localizedNameOfStringEncoding_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_componentsSeparatedByString_ = ObjC.selector("componentsSeparatedByString:");
    private static final MethodHandle MH_componentsSeparatedByString_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_componentsSeparatedByCharactersInSet_ = ObjC.selector("componentsSeparatedByCharactersInSet:");
    private static final MethodHandle MH_componentsSeparatedByCharactersInSet_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringByTrimmingCharactersInSet_ = ObjC.selector("stringByTrimmingCharactersInSet:");
    private static final MethodHandle MH_stringByTrimmingCharactersInSet_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringByPaddingToLength_withString_startingAtIndex_ = ObjC.selector("stringByPaddingToLength:withString:startingAtIndex:");
    private static final MethodHandle MH_stringByPaddingToLength_withString_startingAtIndex_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringByFoldingWithOptions_locale_ = ObjC.selector("stringByFoldingWithOptions:locale:");
    private static final MethodHandle MH_stringByFoldingWithOptions_locale_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringByReplacingOccurrencesOfString_withString_options_range_ = ObjC.selector("stringByReplacingOccurrencesOfString:withString:options:range:");
    private static final MethodHandle MH_stringByReplacingOccurrencesOfString_withString_options_range_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringByReplacingOccurrencesOfString_withString_ = ObjC.selector("stringByReplacingOccurrencesOfString:withString:");
    private static final MethodHandle MH_stringByReplacingOccurrencesOfString_withString_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringByReplacingCharactersInRange_withString_ = ObjC.selector("stringByReplacingCharactersInRange:withString:");
    private static final MethodHandle MH_stringByReplacingCharactersInRange_withString_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringByApplyingTransform_reverse_ = ObjC.selector("stringByApplyingTransform:reverse:");
    private static final MethodHandle MH_stringByApplyingTransform_reverse_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_writeToURL_atomically_encoding_error_ = ObjC.selector("writeToURL:atomically:encoding:error:");
    private static final MethodHandle MH_writeToURL_atomically_encoding_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_writeToFile_atomically_encoding_error_ = ObjC.selector("writeToFile:atomically:encoding:error:");
    private static final MethodHandle MH_writeToFile_atomically_encoding_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithCharactersNoCopy_length_freeWhenDone_ = ObjC.selector("initWithCharactersNoCopy:length:freeWhenDone:");
    private static final MethodHandle MH_initWithCharactersNoCopy_length_freeWhenDone_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_initWithCharactersNoCopy_length_deallocator_ = ObjC.selector("initWithCharactersNoCopy:length:deallocator:");
    private static final MethodHandle MH_initWithCharactersNoCopy_length_deallocator_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithCharacters_length_ = ObjC.selector("initWithCharacters:length:");
    private static final MethodHandle MH_initWithCharacters_length_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithUTF8String_ = ObjC.selector("initWithUTF8String:");
    private static final MethodHandle MH_initWithUTF8String_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithString_ = ObjC.selector("initWithString:");
    private static final MethodHandle MH_initWithString_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithFormat_arguments_ = ObjC.selector("initWithFormat:arguments:");
    private static final MethodHandle MH_initWithFormat_arguments_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithFormat_locale_arguments_ = ObjC.selector("initWithFormat:locale:arguments:");
    private static final MethodHandle MH_initWithFormat_locale_arguments_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithValidatedFormat_validFormatSpecifiers_arguments_error_ = ObjC.selector("initWithValidatedFormat:validFormatSpecifiers:arguments:error:");
    private static final MethodHandle MH_initWithValidatedFormat_validFormatSpecifiers_arguments_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithValidatedFormat_validFormatSpecifiers_locale_arguments_error_ = ObjC.selector("initWithValidatedFormat:validFormatSpecifiers:locale:arguments:error:");
    private static final MethodHandle MH_initWithValidatedFormat_validFormatSpecifiers_locale_arguments_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithData_encoding_ = ObjC.selector("initWithData:encoding:");
    private static final MethodHandle MH_initWithData_encoding_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithBytes_length_encoding_ = ObjC.selector("initWithBytes:length:encoding:");
    private static final MethodHandle MH_initWithBytes_length_encoding_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithBytesNoCopy_length_encoding_freeWhenDone_ = ObjC.selector("initWithBytesNoCopy:length:encoding:freeWhenDone:");
    private static final MethodHandle MH_initWithBytesNoCopy_length_encoding_freeWhenDone_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_initWithBytesNoCopy_length_encoding_deallocator_ = ObjC.selector("initWithBytesNoCopy:length:encoding:deallocator:");
    private static final MethodHandle MH_initWithBytesNoCopy_length_encoding_deallocator_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_string = ObjC.selector("string");
    private static final MethodHandle MH_CLASS_string = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_stringWithString_ = ObjC.selector("stringWithString:");
    private static final MethodHandle MH_CLASS_stringWithString_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_stringWithCharacters_length_ = ObjC.selector("stringWithCharacters:length:");
    private static final MethodHandle MH_CLASS_stringWithCharacters_length_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_stringWithUTF8String_ = ObjC.selector("stringWithUTF8String:");
    private static final MethodHandle MH_CLASS_stringWithUTF8String_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithCString_encoding_ = ObjC.selector("initWithCString:encoding:");
    private static final MethodHandle MH_initWithCString_encoding_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_stringWithCString_encoding_ = ObjC.selector("stringWithCString:encoding:");
    private static final MethodHandle MH_CLASS_stringWithCString_encoding_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithContentsOfURL_encoding_error_ = ObjC.selector("initWithContentsOfURL:encoding:error:");
    private static final MethodHandle MH_initWithContentsOfURL_encoding_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithContentsOfFile_encoding_error_ = ObjC.selector("initWithContentsOfFile:encoding:error:");
    private static final MethodHandle MH_initWithContentsOfFile_encoding_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_stringWithContentsOfURL_encoding_error_ = ObjC.selector("stringWithContentsOfURL:encoding:error:");
    private static final MethodHandle MH_CLASS_stringWithContentsOfURL_encoding_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_stringWithContentsOfFile_encoding_error_ = ObjC.selector("stringWithContentsOfFile:encoding:error:");
    private static final MethodHandle MH_CLASS_stringWithContentsOfFile_encoding_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithContentsOfURL_usedEncoding_error_ = ObjC.selector("initWithContentsOfURL:usedEncoding:error:");
    private static final MethodHandle MH_initWithContentsOfURL_usedEncoding_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithContentsOfFile_usedEncoding_error_ = ObjC.selector("initWithContentsOfFile:usedEncoding:error:");
    private static final MethodHandle MH_initWithContentsOfFile_usedEncoding_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_stringWithContentsOfURL_usedEncoding_error_ = ObjC.selector("stringWithContentsOfURL:usedEncoding:error:");
    private static final MethodHandle MH_CLASS_stringWithContentsOfURL_usedEncoding_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_stringWithContentsOfFile_usedEncoding_error_ = ObjC.selector("stringWithContentsOfFile:usedEncoding:error:");
    private static final MethodHandle MH_CLASS_stringWithContentsOfFile_usedEncoding_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_doubleValue = ObjC.selector("doubleValue");
    private static final MethodHandle MH_doubleValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_floatValue = ObjC.selector("floatValue");
    private static final MethodHandle MH_floatValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_intValue = ObjC.selector("intValue");
    private static final MethodHandle MH_intValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_integerValue = ObjC.selector("integerValue");
    private static final MethodHandle MH_integerValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_longLongValue = ObjC.selector("longLongValue");
    private static final MethodHandle MH_longLongValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_boolValue = ObjC.selector("boolValue");
    private static final MethodHandle MH_boolValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_uppercaseString = ObjC.selector("uppercaseString");
    private static final MethodHandle MH_uppercaseString = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_lowercaseString = ObjC.selector("lowercaseString");
    private static final MethodHandle MH_lowercaseString = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_capitalizedString = ObjC.selector("capitalizedString");
    private static final MethodHandle MH_capitalizedString = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_localizedUppercaseString = ObjC.selector("localizedUppercaseString");
    private static final MethodHandle MH_localizedUppercaseString = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_localizedLowercaseString = ObjC.selector("localizedLowercaseString");
    private static final MethodHandle MH_localizedLowercaseString = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_localizedCapitalizedString = ObjC.selector("localizedCapitalizedString");
    private static final MethodHandle MH_localizedCapitalizedString = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_UTF8String = ObjC.selector("UTF8String");
    private static final MethodHandle MH_UTF8String = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fastestEncoding = ObjC.selector("fastestEncoding");
    private static final MethodHandle MH_fastestEncoding = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_smallestEncoding = ObjC.selector("smallestEncoding");
    private static final MethodHandle MH_smallestEncoding = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_availableStringEncodings = ObjC.selector("availableStringEncodings");
    private static final MethodHandle MH_CLASS_availableStringEncodings = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_defaultCStringEncoding = ObjC.selector("defaultCStringEncoding");
    private static final MethodHandle MH_CLASS_defaultCStringEncoding = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_decomposedStringWithCanonicalMapping = ObjC.selector("decomposedStringWithCanonicalMapping");
    private static final MethodHandle MH_decomposedStringWithCanonicalMapping = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_precomposedStringWithCanonicalMapping = ObjC.selector("precomposedStringWithCanonicalMapping");
    private static final MethodHandle MH_precomposedStringWithCanonicalMapping = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_decomposedStringWithCompatibilityMapping = ObjC.selector("decomposedStringWithCompatibilityMapping");
    private static final MethodHandle MH_decomposedStringWithCompatibilityMapping = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_precomposedStringWithCompatibilityMapping = ObjC.selector("precomposedStringWithCompatibilityMapping");
    private static final MethodHandle MH_precomposedStringWithCompatibilityMapping = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_description = ObjC.selector("description");
    private static final MethodHandle MH_description = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_hash = ObjC.selector("hash");
    private static final MethodHandle MH_hash = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_stringEncodingForData_encodingOptions_convertedString_usedLossyConversion_ = ObjC.selector("stringEncodingForData:encodingOptions:convertedString:usedLossyConversion:");
    private static final MethodHandle MH_CLASS_stringEncodingForData_encodingOptions_convertedString_usedLossyConversion_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_propertyList = ObjC.selector("propertyList");
    private static final MethodHandle MH_propertyList = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_propertyListFromStringsFileFormat = ObjC.selector("propertyListFromStringsFileFormat");
    private static final MethodHandle MH_propertyListFromStringsFileFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_cString = ObjC.selector("cString");
    private static final MethodHandle MH_cString = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_lossyCString = ObjC.selector("lossyCString");
    private static final MethodHandle MH_lossyCString = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_cStringLength = ObjC.selector("cStringLength");
    private static final MethodHandle MH_cStringLength = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getCString_ = ObjC.selector("getCString:");
    private static final MethodHandle MH_getCString_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getCString_maxLength_ = ObjC.selector("getCString:maxLength:");
    private static final MethodHandle MH_getCString_maxLength_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getCString_maxLength_range_remainingRange_ = ObjC.selector("getCString:maxLength:range:remainingRange:");
    private static final MethodHandle MH_getCString_maxLength_range_remainingRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_writeToFile_atomically_ = ObjC.selector("writeToFile:atomically:");
    private static final MethodHandle MH_writeToFile_atomically_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_writeToURL_atomically_ = ObjC.selector("writeToURL:atomically:");
    private static final MethodHandle MH_writeToURL_atomically_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_initWithContentsOfFile_ = ObjC.selector("initWithContentsOfFile:");
    private static final MethodHandle MH_initWithContentsOfFile_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithContentsOfURL_ = ObjC.selector("initWithContentsOfURL:");
    private static final MethodHandle MH_initWithContentsOfURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_stringWithContentsOfFile_ = ObjC.selector("stringWithContentsOfFile:");
    private static final MethodHandle MH_CLASS_stringWithContentsOfFile_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_stringWithContentsOfURL_ = ObjC.selector("stringWithContentsOfURL:");
    private static final MethodHandle MH_CLASS_stringWithContentsOfURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithCStringNoCopy_length_freeWhenDone_ = ObjC.selector("initWithCStringNoCopy:length:freeWhenDone:");
    private static final MethodHandle MH_initWithCStringNoCopy_length_freeWhenDone_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_initWithCString_length_ = ObjC.selector("initWithCString:length:");
    private static final MethodHandle MH_initWithCString_length_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithCString_ = ObjC.selector("initWithCString:");
    private static final MethodHandle MH_initWithCString_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_stringWithCString_length_ = ObjC.selector("stringWithCString:length:");
    private static final MethodHandle MH_CLASS_stringWithCString_length_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_stringWithCString_ = ObjC.selector("stringWithCString:");
    private static final MethodHandle MH_CLASS_stringWithCString_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getCharacters_ = ObjC.selector("getCharacters:");
    private static final MethodHandle MH_getCharacters_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_variantFittingPresentationWidth_ = ObjC.selector("variantFittingPresentationWidth:");
    private static final MethodHandle MH_variantFittingPresentationWidth_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_pathWithComponents_ = ObjC.selector("pathWithComponents:");
    private static final MethodHandle MH_CLASS_pathWithComponents_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringByAppendingPathComponent_ = ObjC.selector("stringByAppendingPathComponent:");
    private static final MethodHandle MH_stringByAppendingPathComponent_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringByAppendingPathExtension_ = ObjC.selector("stringByAppendingPathExtension:");
    private static final MethodHandle MH_stringByAppendingPathExtension_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringsByAppendingPaths_ = ObjC.selector("stringsByAppendingPaths:");
    private static final MethodHandle MH_stringsByAppendingPaths_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_completePathIntoString_caseSensitive_matchesIntoArray_filterTypes_ = ObjC.selector("completePathIntoString:caseSensitive:matchesIntoArray:filterTypes:");
    private static final MethodHandle MH_completePathIntoString_caseSensitive_matchesIntoArray_filterTypes_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getFileSystemRepresentation_maxLength_ = ObjC.selector("getFileSystemRepresentation:maxLength:");
    private static final MethodHandle MH_getFileSystemRepresentation_maxLength_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pathComponents = ObjC.selector("pathComponents");
    private static final MethodHandle MH_pathComponents = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isAbsolutePath = ObjC.selector("isAbsolutePath");
    private static final MethodHandle MH_isAbsolutePath = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_lastPathComponent = ObjC.selector("lastPathComponent");
    private static final MethodHandle MH_lastPathComponent = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringByDeletingLastPathComponent = ObjC.selector("stringByDeletingLastPathComponent");
    private static final MethodHandle MH_stringByDeletingLastPathComponent = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pathExtension = ObjC.selector("pathExtension");
    private static final MethodHandle MH_pathExtension = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringByDeletingPathExtension = ObjC.selector("stringByDeletingPathExtension");
    private static final MethodHandle MH_stringByDeletingPathExtension = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringByAbbreviatingWithTildeInPath = ObjC.selector("stringByAbbreviatingWithTildeInPath");
    private static final MethodHandle MH_stringByAbbreviatingWithTildeInPath = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringByExpandingTildeInPath = ObjC.selector("stringByExpandingTildeInPath");
    private static final MethodHandle MH_stringByExpandingTildeInPath = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringByStandardizingPath = ObjC.selector("stringByStandardizingPath");
    private static final MethodHandle MH_stringByStandardizingPath = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringByResolvingSymlinksInPath = ObjC.selector("stringByResolvingSymlinksInPath");
    private static final MethodHandle MH_stringByResolvingSymlinksInPath = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fileSystemRepresentation = ObjC.selector("fileSystemRepresentation");
    private static final MethodHandle MH_fileSystemRepresentation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringByAddingPercentEncodingWithAllowedCharacters_ = ObjC.selector("stringByAddingPercentEncodingWithAllowedCharacters:");
    private static final MethodHandle MH_stringByAddingPercentEncodingWithAllowedCharacters_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringByAddingPercentEscapesUsingEncoding_ = ObjC.selector("stringByAddingPercentEscapesUsingEncoding:");
    private static final MethodHandle MH_stringByAddingPercentEscapesUsingEncoding_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringByReplacingPercentEscapesUsingEncoding_ = ObjC.selector("stringByReplacingPercentEscapesUsingEncoding:");
    private static final MethodHandle MH_stringByReplacingPercentEscapesUsingEncoding_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringByRemovingPercentEncoding = ObjC.selector("stringByRemovingPercentEncoding");
    private static final MethodHandle MH_stringByRemovingPercentEncoding = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_linguisticTagsInRange_scheme_options_orthography_tokenRanges_ = ObjC.selector("linguisticTagsInRange:scheme:options:orthography:tokenRanges:");
    private static final MethodHandle MH_linguisticTagsInRange_scheme_options_orthography_tokenRanges_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_enumerateLinguisticTagsInRange_scheme_options_orthography_usingBlock_ = ObjC.selector("enumerateLinguisticTagsInRange:scheme:options:orthography:usingBlock:");
    private static final MethodHandle MH_enumerateLinguisticTagsInRange_scheme_options_orthography_usingBlock_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public NSString(final long handle) {
        super(handle);
    }

    /**
     * {@code +[NSString alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static NSString alloc() {
        try {
            return new NSString((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString characterAtIndex:]} */
    public short characterAtIndex(final long index) {
        try {
            return (short) MH_characterAtIndex_.invokeExact(this.handle, SEL_characterAtIndex_, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString init]} */
    public NSString init() {
        try {
            long result = (long) MH_init.invokeExact(this.handle, SEL_init);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString initWithCoder:]} */
    @Nullable
    public NSString initWithCoder(final NSObject coder) {
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

    /** {@code -[NSString length]} */
    public long length() {
        try {
            return (long) MH_length.invokeExact(this.handle, SEL_length);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString substringFromIndex:]} */
    public String substringFromIndex(final long from) {
        try {
            long result = (long) MH_substringFromIndex_.invokeExact(this.handle, SEL_substringFromIndex_, from);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString substringToIndex:]} */
    public String substringToIndex(final long to) {
        try {
            long result = (long) MH_substringToIndex_.invokeExact(this.handle, SEL_substringToIndex_, to);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString substringWithRange:]} */
    public String substring(final NSRange range) {
        try {
            long result = (long) MH_substringWithRange_.invokeExact(this.handle, SEL_substringWithRange_, range.location(), range.length());
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString getCharacters:range:]} */
    public void getCharacters(final MemorySegment buffer, final NSRange range) {
        try {
            MH_getCharacters_range_.invokeExact(this.handle, SEL_getCharacters_range_, buffer.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString compare:]} */
    public NSComparisonResult compare(final String string) {
        final long nsString = ObjC.nsString(string);
        try {
            return NSComparisonResult.of((long) MH_compare_.invokeExact(this.handle, SEL_compare_, nsString));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsString);
        }
    }

    /**
     * {@code -[NSString compare:options:]}
     *
     * @param mask a combination of {@link NSStringCompareOptions} flags
     */
    public NSComparisonResult compare(final String string, final long mask) {
        final long nsString = ObjC.nsString(string);
        try {
            return NSComparisonResult.of((long) MH_compare_options_.invokeExact(this.handle, SEL_compare_options_, nsString, mask));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsString);
        }
    }

    /**
     * {@code -[NSString compare:options:range:]}
     *
     * @param mask a combination of {@link NSStringCompareOptions} flags
     */
    public NSComparisonResult compare(final String string, final long mask, final NSRange rangeOfReceiverToCompare) {
        final long nsString = ObjC.nsString(string);
        try {
            return NSComparisonResult.of((long) MH_compare_options_range_.invokeExact(this.handle, SEL_compare_options_range_, nsString, mask, rangeOfReceiverToCompare.location(), rangeOfReceiverToCompare.length()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsString);
        }
    }

    /**
     * {@code -[NSString compare:options:range:locale:]}
     *
     * @param mask a combination of {@link NSStringCompareOptions} flags
     */
    public NSComparisonResult compare(final String string, final long mask, final NSRange rangeOfReceiverToCompare, @Nullable final NSObject locale) {
        final long nsString = ObjC.nsString(string);
        try {
            return NSComparisonResult.of((long) MH_compare_options_range_locale_.invokeExact(this.handle, SEL_compare_options_range_locale_, nsString, mask, rangeOfReceiverToCompare.location(), rangeOfReceiverToCompare.length(), locale == null ? 0L : locale.handle()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsString);
        }
    }

    /** {@code -[NSString caseInsensitiveCompare:]} */
    public NSComparisonResult caseInsensitiveCompare(final String string) {
        final long nsString = ObjC.nsString(string);
        try {
            return NSComparisonResult.of((long) MH_caseInsensitiveCompare_.invokeExact(this.handle, SEL_caseInsensitiveCompare_, nsString));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsString);
        }
    }

    /** {@code -[NSString localizedCompare:]} */
    public NSComparisonResult localizedCompare(final String string) {
        final long nsString = ObjC.nsString(string);
        try {
            return NSComparisonResult.of((long) MH_localizedCompare_.invokeExact(this.handle, SEL_localizedCompare_, nsString));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsString);
        }
    }

    /** {@code -[NSString localizedCaseInsensitiveCompare:]} */
    public NSComparisonResult localizedCaseInsensitiveCompare(final String string) {
        final long nsString = ObjC.nsString(string);
        try {
            return NSComparisonResult.of((long) MH_localizedCaseInsensitiveCompare_.invokeExact(this.handle, SEL_localizedCaseInsensitiveCompare_, nsString));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsString);
        }
    }

    /** {@code -[NSString localizedStandardCompare:]} */
    public NSComparisonResult localizedStandardCompare(final String string) {
        final long nsString = ObjC.nsString(string);
        try {
            return NSComparisonResult.of((long) MH_localizedStandardCompare_.invokeExact(this.handle, SEL_localizedStandardCompare_, nsString));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsString);
        }
    }

    /** {@code -[NSString isEqualToString:]} */
    public boolean isEqualToString(final String aString) {
        final long nsAString = ObjC.nsString(aString);
        try {
            return (boolean) MH_isEqualToString_.invokeExact(this.handle, SEL_isEqualToString_, nsAString);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsAString);
        }
    }

    /** {@code -[NSString hasPrefix:]} */
    public boolean hasPrefix(final String str) {
        final long nsStr = ObjC.nsString(str);
        try {
            return (boolean) MH_hasPrefix_.invokeExact(this.handle, SEL_hasPrefix_, nsStr);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsStr);
        }
    }

    /** {@code -[NSString hasSuffix:]} */
    public boolean hasSuffix(final String str) {
        final long nsStr = ObjC.nsString(str);
        try {
            return (boolean) MH_hasSuffix_.invokeExact(this.handle, SEL_hasSuffix_, nsStr);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsStr);
        }
    }

    /**
     * {@code -[NSString commonPrefixWithString:options:]}
     *
     * @param mask a combination of {@link NSStringCompareOptions} flags
     */
    public String commonPrefix(final String str, final long mask) {
        final long nsStr = ObjC.nsString(str);
        try {
            long result = (long) MH_commonPrefixWithString_options_.invokeExact(this.handle, SEL_commonPrefixWithString_options_, nsStr, mask);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsStr);
        }
    }

    /** {@code -[NSString containsString:]} */
    public boolean containsString(final String str) {
        final long nsStr = ObjC.nsString(str);
        try {
            return (boolean) MH_containsString_.invokeExact(this.handle, SEL_containsString_, nsStr);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsStr);
        }
    }

    /** {@code -[NSString localizedCaseInsensitiveContainsString:]} */
    public boolean localizedCaseInsensitiveContainsString(final String str) {
        final long nsStr = ObjC.nsString(str);
        try {
            return (boolean) MH_localizedCaseInsensitiveContainsString_.invokeExact(this.handle, SEL_localizedCaseInsensitiveContainsString_, nsStr);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsStr);
        }
    }

    /** {@code -[NSString localizedStandardContainsString:]} */
    public boolean localizedStandardContainsString(final String str) {
        final long nsStr = ObjC.nsString(str);
        try {
            return (boolean) MH_localizedStandardContainsString_.invokeExact(this.handle, SEL_localizedStandardContainsString_, nsStr);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsStr);
        }
    }

    /** {@code -[NSString localizedStandardRangeOfString:]} */
    public NSRange localizedStandardRangeOfString(final String str) {
        final long nsStr = ObjC.nsString(str);
        try (NativeStack stack = NativeStack.push()) {
            return NSRange.read((MemorySegment) MH_localizedStandardRangeOfString_.invokeExact((SegmentAllocator) stack, this.handle, SEL_localizedStandardRangeOfString_, nsStr));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsStr);
        }
    }

    /** {@code -[NSString rangeOfString:]} */
    public NSRange rangeOfString(final String searchString) {
        final long nsSearchString = ObjC.nsString(searchString);
        try (NativeStack stack = NativeStack.push()) {
            return NSRange.read((MemorySegment) MH_rangeOfString_.invokeExact((SegmentAllocator) stack, this.handle, SEL_rangeOfString_, nsSearchString));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsSearchString);
        }
    }

    /**
     * {@code -[NSString rangeOfString:options:]}
     *
     * @param mask a combination of {@link NSStringCompareOptions} flags
     */
    public NSRange rangeOfString(final String searchString, final long mask) {
        final long nsSearchString = ObjC.nsString(searchString);
        try (NativeStack stack = NativeStack.push()) {
            return NSRange.read((MemorySegment) MH_rangeOfString_options_.invokeExact((SegmentAllocator) stack, this.handle, SEL_rangeOfString_options_, nsSearchString, mask));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsSearchString);
        }
    }

    /**
     * {@code -[NSString rangeOfString:options:range:]}
     *
     * @param mask a combination of {@link NSStringCompareOptions} flags
     */
    public NSRange rangeOfString(final String searchString, final long mask, final NSRange rangeOfReceiverToSearch) {
        final long nsSearchString = ObjC.nsString(searchString);
        try (NativeStack stack = NativeStack.push()) {
            return NSRange.read((MemorySegment) MH_rangeOfString_options_range_.invokeExact((SegmentAllocator) stack, this.handle, SEL_rangeOfString_options_range_, nsSearchString, mask, rangeOfReceiverToSearch.location(), rangeOfReceiverToSearch.length()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsSearchString);
        }
    }

    /**
     * {@code -[NSString rangeOfString:options:range:locale:]}
     *
     * @param mask a combination of {@link NSStringCompareOptions} flags
     */
    public NSRange rangeOfString(final String searchString, final long mask, final NSRange rangeOfReceiverToSearch, @Nullable final NSObject locale) {
        final long nsSearchString = ObjC.nsString(searchString);
        try (NativeStack stack = NativeStack.push()) {
            return NSRange.read((MemorySegment) MH_rangeOfString_options_range_locale_.invokeExact((SegmentAllocator) stack, this.handle, SEL_rangeOfString_options_range_locale_, nsSearchString, mask, rangeOfReceiverToSearch.location(), rangeOfReceiverToSearch.length(), locale == null ? 0L : locale.handle()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsSearchString);
        }
    }

    /** {@code -[NSString rangeOfCharacterFromSet:]} */
    public NSRange rangeOfCharacterFromSet(final NSObject searchSet) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRange.read((MemorySegment) MH_rangeOfCharacterFromSet_.invokeExact((SegmentAllocator) stack, this.handle, SEL_rangeOfCharacterFromSet_, searchSet.handle()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSString rangeOfCharacterFromSet:options:]}
     *
     * @param mask a combination of {@link NSStringCompareOptions} flags
     */
    public NSRange rangeOfCharacterFromSet(final NSObject searchSet, final long mask) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRange.read((MemorySegment) MH_rangeOfCharacterFromSet_options_.invokeExact((SegmentAllocator) stack, this.handle, SEL_rangeOfCharacterFromSet_options_, searchSet.handle(), mask));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSString rangeOfCharacterFromSet:options:range:]}
     *
     * @param mask a combination of {@link NSStringCompareOptions} flags
     */
    public NSRange rangeOfCharacterFromSet(final NSObject searchSet, final long mask, final NSRange rangeOfReceiverToSearch) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRange.read((MemorySegment) MH_rangeOfCharacterFromSet_options_range_.invokeExact((SegmentAllocator) stack, this.handle, SEL_rangeOfCharacterFromSet_options_range_, searchSet.handle(), mask, rangeOfReceiverToSearch.location(), rangeOfReceiverToSearch.length()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString rangeOfComposedCharacterSequenceAtIndex:]} */
    public NSRange rangeOfComposedCharacterSequenceAtIndex(final long index) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRange.read((MemorySegment) MH_rangeOfComposedCharacterSequenceAtIndex_.invokeExact((SegmentAllocator) stack, this.handle, SEL_rangeOfComposedCharacterSequenceAtIndex_, index));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString rangeOfComposedCharacterSequencesForRange:]} */
    public NSRange rangeOfComposedCharacterSequencesForRange(final NSRange range) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRange.read((MemorySegment) MH_rangeOfComposedCharacterSequencesForRange_.invokeExact((SegmentAllocator) stack, this.handle, SEL_rangeOfComposedCharacterSequencesForRange_, range.location(), range.length()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString stringByAppendingString:]} */
    public String stringByAppendingString(final String aString) {
        final long nsAString = ObjC.nsString(aString);
        try {
            long result = (long) MH_stringByAppendingString_.invokeExact(this.handle, SEL_stringByAppendingString_, nsAString);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsAString);
        }
    }

    /** {@code -[NSString uppercaseStringWithLocale:]} */
    public String uppercaseStringWithLocale(@Nullable final NSObject locale) {
        try {
            long result = (long) MH_uppercaseStringWithLocale_.invokeExact(this.handle, SEL_uppercaseStringWithLocale_, locale == null ? 0L : locale.handle());
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString lowercaseStringWithLocale:]} */
    public String lowercaseStringWithLocale(@Nullable final NSObject locale) {
        try {
            long result = (long) MH_lowercaseStringWithLocale_.invokeExact(this.handle, SEL_lowercaseStringWithLocale_, locale == null ? 0L : locale.handle());
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString capitalizedStringWithLocale:]} */
    public String capitalizedStringWithLocale(@Nullable final NSObject locale) {
        try {
            long result = (long) MH_capitalizedStringWithLocale_.invokeExact(this.handle, SEL_capitalizedStringWithLocale_, locale == null ? 0L : locale.handle());
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString getLineStart:end:contentsEnd:forRange:]} */
    public void getLineStart(final MemorySegment startPtr, final MemorySegment lineEndPtr, final MemorySegment contentsEndPtr, final NSRange range) {
        try {
            MH_getLineStart_end_contentsEnd_forRange_.invokeExact(this.handle, SEL_getLineStart_end_contentsEnd_forRange_, startPtr.address(), lineEndPtr.address(), contentsEndPtr.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString lineRangeForRange:]} */
    public NSRange lineRangeForRange(final NSRange range) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRange.read((MemorySegment) MH_lineRangeForRange_.invokeExact((SegmentAllocator) stack, this.handle, SEL_lineRangeForRange_, range.location(), range.length()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString getParagraphStart:end:contentsEnd:forRange:]} */
    public void getParagraphStart(final MemorySegment startPtr, final MemorySegment parEndPtr, final MemorySegment contentsEndPtr, final NSRange range) {
        try {
            MH_getParagraphStart_end_contentsEnd_forRange_.invokeExact(this.handle, SEL_getParagraphStart_end_contentsEnd_forRange_, startPtr.address(), parEndPtr.address(), contentsEndPtr.address(), range.location(), range.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString paragraphRangeForRange:]} */
    public NSRange paragraphRangeForRange(final NSRange range) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRange.read((MemorySegment) MH_paragraphRangeForRange_.invokeExact((SegmentAllocator) stack, this.handle, SEL_paragraphRangeForRange_, range.location(), range.length()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSString enumerateSubstringsInRange:options:usingBlock:]}
     *
     * @param opts a combination of {@link NSStringEnumerationOptions} flags
     */
    public void enumerateSubstringsInRange(final NSRange range, final long opts, final long block) {
        try {
            MH_enumerateSubstringsInRange_options_usingBlock_.invokeExact(this.handle, SEL_enumerateSubstringsInRange_options_usingBlock_, range.location(), range.length(), opts, block);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString enumerateLinesUsingBlock:]} */
    public void enumerateLinesUsingBlock(final long block) {
        try {
            MH_enumerateLinesUsingBlock_.invokeExact(this.handle, SEL_enumerateLinesUsingBlock_, block);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSString dataUsingEncoding:allowLossyConversion:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSData dataUsingEncoding(final long encoding, final boolean lossy) {
        try {
            long result = (long) MH_dataUsingEncoding_allowLossyConversion_.invokeExact(this.handle, SEL_dataUsingEncoding_allowLossyConversion_, encoding, lossy);
            return result == 0L ? null : new NSData(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSString dataUsingEncoding:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSData dataUsingEncoding(final long encoding) {
        try {
            long result = (long) MH_dataUsingEncoding_.invokeExact(this.handle, SEL_dataUsingEncoding_, encoding);
            return result == 0L ? null : new NSData(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString canBeConvertedToEncoding:]} */
    public boolean canBeConvertedToEncoding(final long encoding) {
        try {
            return (boolean) MH_canBeConvertedToEncoding_.invokeExact(this.handle, SEL_canBeConvertedToEncoding_, encoding);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString cStringUsingEncoding:]} */
    public MemorySegment cStringUsingEncoding(final long encoding) {
        try {
            return MemorySegment.ofAddress((long) MH_cStringUsingEncoding_.invokeExact(this.handle, SEL_cStringUsingEncoding_, encoding));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString getCString:maxLength:encoding:]} */
    public boolean getCString(final MemorySegment buffer, final long maxBufferCount, final long encoding) {
        try {
            return (boolean) MH_getCString_maxLength_encoding_.invokeExact(this.handle, SEL_getCString_maxLength_encoding_, buffer.address(), maxBufferCount, encoding);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSString getBytes:maxLength:usedLength:encoding:options:range:remainingRange:]}
     *
     * @param options a combination of {@link NSStringEncodingConversionOptions} flags
     */
    public boolean getBytes(final MemorySegment buffer, final long maxBufferCount, final MemorySegment usedBufferCount, final long encoding, final long options, final NSRange range, final MemorySegment leftover) {
        try (NativeStack stack = NativeStack.push()) {
            return (boolean) MH_getBytes_maxLength_usedLength_encoding_options_range_remainingRange_.invokeExact(this.handle, SEL_getBytes_maxLength_usedLength_encoding_options_range_remainingRange_, buffer.address(), maxBufferCount, usedBufferCount.address(), encoding, options, range.on(stack), leftover.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString maximumLengthOfBytesUsingEncoding:]} */
    public long maximumLengthOfBytesUsingEncoding(final long enc) {
        try {
            return (long) MH_maximumLengthOfBytesUsingEncoding_.invokeExact(this.handle, SEL_maximumLengthOfBytesUsingEncoding_, enc);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString lengthOfBytesUsingEncoding:]} */
    public long lengthOfBytesUsingEncoding(final long enc) {
        try {
            return (long) MH_lengthOfBytesUsingEncoding_.invokeExact(this.handle, SEL_lengthOfBytesUsingEncoding_, enc);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSString localizedNameOfStringEncoding:]} */
    public static String localizedNameOfStringEncoding(final long encoding) {
        try {
            long result = (long) MH_CLASS_localizedNameOfStringEncoding_.invokeExact(CLS, SEL_CLASS_localizedNameOfStringEncoding_, encoding);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSString componentsSeparatedByString:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<NSString> componentsSeparatedByString(final String separator) {
        final long nsSeparator = ObjC.nsString(separator);
        try {
            long result = (long) MH_componentsSeparatedByString_.invokeExact(this.handle, SEL_componentsSeparatedByString_, nsSeparator);
            return new NSArray<>(result, NSString::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsSeparator);
        }
    }

    /**
     * {@code -[NSString componentsSeparatedByCharactersInSet:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<NSString> componentsSeparatedByCharactersInSet(final NSObject separator) {
        try {
            long result = (long) MH_componentsSeparatedByCharactersInSet_.invokeExact(this.handle, SEL_componentsSeparatedByCharactersInSet_, separator.handle());
            return new NSArray<>(result, NSString::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString stringByTrimmingCharactersInSet:]} */
    public String stringByTrimmingCharactersInSet(final NSObject set) {
        try {
            long result = (long) MH_stringByTrimmingCharactersInSet_.invokeExact(this.handle, SEL_stringByTrimmingCharactersInSet_, set.handle());
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString stringByPaddingToLength:withString:startingAtIndex:]} */
    public String stringByPaddingToLength(final long newLength, final String padString, final long padIndex) {
        final long nsPadString = ObjC.nsString(padString);
        try {
            long result = (long) MH_stringByPaddingToLength_withString_startingAtIndex_.invokeExact(this.handle, SEL_stringByPaddingToLength_withString_startingAtIndex_, newLength, nsPadString, padIndex);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPadString);
        }
    }

    /**
     * {@code -[NSString stringByFoldingWithOptions:locale:]}
     *
     * @param options a combination of {@link NSStringCompareOptions} flags
     */
    public String stringByFolding(final long options, @Nullable final NSObject locale) {
        try {
            long result = (long) MH_stringByFoldingWithOptions_locale_.invokeExact(this.handle, SEL_stringByFoldingWithOptions_locale_, options, locale == null ? 0L : locale.handle());
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSString stringByReplacingOccurrencesOfString:withString:options:range:]}
     *
     * @param options a combination of {@link NSStringCompareOptions} flags
     */
    public String stringByReplacingOccurrencesOfString(final String target, final String replacement, final long options, final NSRange searchRange) {
        final long nsTarget = ObjC.nsString(target);
        final long nsReplacement = ObjC.nsString(replacement);
        try {
            long result = (long) MH_stringByReplacingOccurrencesOfString_withString_options_range_.invokeExact(this.handle, SEL_stringByReplacingOccurrencesOfString_withString_options_range_, nsTarget, nsReplacement, options, searchRange.location(), searchRange.length());
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsTarget);
            ObjC.release(nsReplacement);
        }
    }

    /** {@code -[NSString stringByReplacingOccurrencesOfString:withString:]} */
    public String stringByReplacingOccurrencesOfString(final String target, final String replacement) {
        final long nsTarget = ObjC.nsString(target);
        final long nsReplacement = ObjC.nsString(replacement);
        try {
            long result = (long) MH_stringByReplacingOccurrencesOfString_withString_.invokeExact(this.handle, SEL_stringByReplacingOccurrencesOfString_withString_, nsTarget, nsReplacement);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsTarget);
            ObjC.release(nsReplacement);
        }
    }

    /** {@code -[NSString stringByReplacingCharactersInRange:withString:]} */
    public String stringByReplacingCharactersInRange(final NSRange range, final String replacement) {
        final long nsReplacement = ObjC.nsString(replacement);
        try {
            long result = (long) MH_stringByReplacingCharactersInRange_withString_.invokeExact(this.handle, SEL_stringByReplacingCharactersInRange_withString_, range.location(), range.length(), nsReplacement);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsReplacement);
        }
    }

    /** {@code -[NSString stringByApplyingTransform:reverse:]} */
    @Nullable
    public String stringByApplyingTransform(final String transform, final boolean reverse) {
        final long nsTransform = ObjC.nsString(transform);
        try {
            long result = (long) MH_stringByApplyingTransform_reverse_.invokeExact(this.handle, SEL_stringByApplyingTransform_reverse_, nsTransform, reverse);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsTransform);
        }
    }

    /** {@code -[NSString writeToURL:atomically:encoding:error:]} */
    public void writeToURL(final NSURL url, final boolean useAuxiliaryFile, final long enc) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_writeToURL_atomically_encoding_error_.invokeExact(this.handle, SEL_writeToURL_atomically_encoding_error_, url.handle(), useAuxiliaryFile, enc, errorOut.address());
            if (!result) {
                throw NSErrorException.of("writeToURL:atomically:encoding:error:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString writeToFile:atomically:encoding:error:]} */
    public void writeToFile(final String path, final boolean useAuxiliaryFile, final long enc) {
        final long nsPath = ObjC.nsString(path);
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_writeToFile_atomically_encoding_error_.invokeExact(this.handle, SEL_writeToFile_atomically_encoding_error_, nsPath, useAuxiliaryFile, enc, errorOut.address());
            if (!result) {
                throw NSErrorException.of("writeToFile:atomically:encoding:error:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /** {@code -[NSString initWithCharactersNoCopy:length:freeWhenDone:]} */
    public NSString initWithCharactersNoCopy(final MemorySegment characters, final long length, final boolean freeBuffer) {
        try {
            long result = (long) MH_initWithCharactersNoCopy_length_freeWhenDone_.invokeExact(this.handle, SEL_initWithCharactersNoCopy_length_freeWhenDone_, characters.address(), length, freeBuffer);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString initWithCharactersNoCopy:length:deallocator:]} */
    public NSString initWithCharactersNoCopy(final MemorySegment chars, final long len, final long deallocator) {
        try {
            long result = (long) MH_initWithCharactersNoCopy_length_deallocator_.invokeExact(this.handle, SEL_initWithCharactersNoCopy_length_deallocator_, chars.address(), len, deallocator);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString initWithCharacters:length:]} */
    public NSString initWithCharacters(final MemorySegment characters, final long length) {
        try {
            long result = (long) MH_initWithCharacters_length_.invokeExact(this.handle, SEL_initWithCharacters_length_, characters.address(), length);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString initWithUTF8String:]} */
    @Nullable
    public NSString initWithUTF8String(final MemorySegment nullTerminatedCString) {
        try {
            long result = (long) MH_initWithUTF8String_.invokeExact(this.handle, SEL_initWithUTF8String_, nullTerminatedCString.address());
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString initWithString:]} */
    public NSString initWithString(final String aString) {
        final long nsAString = ObjC.nsString(aString);
        try {
            long result = (long) MH_initWithString_.invokeExact(this.handle, SEL_initWithString_, nsAString);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsAString);
        }
    }

    /** {@code -[NSString initWithFormat:arguments:]} */
    public NSString initWithFormat(final String format, final MemorySegment argList) {
        final long nsFormat = ObjC.nsString(format);
        try {
            long result = (long) MH_initWithFormat_arguments_.invokeExact(this.handle, SEL_initWithFormat_arguments_, nsFormat, argList.address());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsFormat);
        }
    }

    /** {@code -[NSString initWithFormat:locale:arguments:]} */
    public NSString initWithFormat(final String format, @Nullable final NSObject locale, final MemorySegment argList) {
        final long nsFormat = ObjC.nsString(format);
        try {
            long result = (long) MH_initWithFormat_locale_arguments_.invokeExact(this.handle, SEL_initWithFormat_locale_arguments_, nsFormat, locale == null ? 0L : locale.handle(), argList.address());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsFormat);
        }
    }

    /** {@code -[NSString initWithValidatedFormat:validFormatSpecifiers:arguments:error:]} */
    public NSString initWithValidatedFormat(final String format, final String validFormatSpecifiers, final MemorySegment argList) {
        final long nsFormat = ObjC.nsString(format);
        final long nsValidFormatSpecifiers = ObjC.nsString(validFormatSpecifiers);
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_initWithValidatedFormat_validFormatSpecifiers_arguments_error_.invokeExact(this.handle, SEL_initWithValidatedFormat_validFormatSpecifiers_arguments_error_, nsFormat, nsValidFormatSpecifiers, argList.address(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("initWithValidatedFormat:validFormatSpecifiers:arguments:error:", errorOut.get(JAVA_LONG, 0L));
            }
            this.handle = result;
            return this;
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsFormat);
            ObjC.release(nsValidFormatSpecifiers);
        }
    }

    /** {@code -[NSString initWithValidatedFormat:validFormatSpecifiers:locale:arguments:error:]} */
    public NSString initWithValidatedFormat(final String format, final String validFormatSpecifiers, @Nullable final NSObject locale, final MemorySegment argList) {
        final long nsFormat = ObjC.nsString(format);
        final long nsValidFormatSpecifiers = ObjC.nsString(validFormatSpecifiers);
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_initWithValidatedFormat_validFormatSpecifiers_locale_arguments_error_.invokeExact(this.handle, SEL_initWithValidatedFormat_validFormatSpecifiers_locale_arguments_error_, nsFormat, nsValidFormatSpecifiers, locale == null ? 0L : locale.handle(), argList.address(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("initWithValidatedFormat:validFormatSpecifiers:locale:arguments:error:", errorOut.get(JAVA_LONG, 0L));
            }
            this.handle = result;
            return this;
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsFormat);
            ObjC.release(nsValidFormatSpecifiers);
        }
    }

    /** {@code -[NSString initWithData:encoding:]} */
    @Nullable
    public NSString initWithData(final NSData data, final long encoding) {
        try {
            long result = (long) MH_initWithData_encoding_.invokeExact(this.handle, SEL_initWithData_encoding_, data.handle(), encoding);
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString initWithBytes:length:encoding:]} */
    @Nullable
    public NSString initWithBytes(final MemorySegment bytes, final long len, final long encoding) {
        try {
            long result = (long) MH_initWithBytes_length_encoding_.invokeExact(this.handle, SEL_initWithBytes_length_encoding_, bytes.address(), len, encoding);
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString initWithBytesNoCopy:length:encoding:freeWhenDone:]} */
    @Nullable
    public NSString initWithBytesNoCopy(final MemorySegment bytes, final long len, final long encoding, final boolean freeBuffer) {
        try {
            long result = (long) MH_initWithBytesNoCopy_length_encoding_freeWhenDone_.invokeExact(this.handle, SEL_initWithBytesNoCopy_length_encoding_freeWhenDone_, bytes.address(), len, encoding, freeBuffer);
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString initWithBytesNoCopy:length:encoding:deallocator:]} */
    @Nullable
    public NSString initWithBytesNoCopy(final MemorySegment bytes, final long len, final long encoding, final long deallocator) {
        try {
            long result = (long) MH_initWithBytesNoCopy_length_encoding_deallocator_.invokeExact(this.handle, SEL_initWithBytesNoCopy_length_encoding_deallocator_, bytes.address(), len, encoding, deallocator);
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSString string]} */
    public static NSString string() {
        try {
            long result = (long) MH_CLASS_string.invokeExact(CLS, SEL_CLASS_string);
            return new NSString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSString stringWithString:]} */
    public static NSString stringWithString(final String string) {
        final long nsString = ObjC.nsString(string);
        try {
            long result = (long) MH_CLASS_stringWithString_.invokeExact(CLS, SEL_CLASS_stringWithString_, nsString);
            return new NSString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsString);
        }
    }

    /** {@code +[NSString stringWithCharacters:length:]} */
    public static NSString stringWithCharacters(final MemorySegment characters, final long length) {
        try {
            long result = (long) MH_CLASS_stringWithCharacters_length_.invokeExact(CLS, SEL_CLASS_stringWithCharacters_length_, characters.address(), length);
            return new NSString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSString stringWithUTF8String:]} */
    @Nullable
    public static NSString stringWithUTF8String(final MemorySegment nullTerminatedCString) {
        try {
            long result = (long) MH_CLASS_stringWithUTF8String_.invokeExact(CLS, SEL_CLASS_stringWithUTF8String_, nullTerminatedCString.address());
            return result == 0L ? null : new NSString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString initWithCString:encoding:]} */
    @Nullable
    public NSString initWithCStringEncoding(final MemorySegment nullTerminatedCString, final long encoding) {
        try {
            long result = (long) MH_initWithCString_encoding_.invokeExact(this.handle, SEL_initWithCString_encoding_, nullTerminatedCString.address(), encoding);
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSString stringWithCString:encoding:]} */
    @Nullable
    public static NSString stringWithCStringEncoding(final MemorySegment cString, final long enc) {
        try {
            long result = (long) MH_CLASS_stringWithCString_encoding_.invokeExact(CLS, SEL_CLASS_stringWithCString_encoding_, cString.address(), enc);
            return result == 0L ? null : new NSString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString initWithContentsOfURL:encoding:error:]} */
    public NSString initWithContentsOfURL(final NSURL url, final long enc) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_initWithContentsOfURL_encoding_error_.invokeExact(this.handle, SEL_initWithContentsOfURL_encoding_error_, url.handle(), enc, errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("initWithContentsOfURL:encoding:error:", errorOut.get(JAVA_LONG, 0L));
            }
            this.handle = result;
            return this;
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString initWithContentsOfFile:encoding:error:]} */
    public NSString initWithContentsOfFile(final String path, final long enc) {
        final long nsPath = ObjC.nsString(path);
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_initWithContentsOfFile_encoding_error_.invokeExact(this.handle, SEL_initWithContentsOfFile_encoding_error_, nsPath, enc, errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("initWithContentsOfFile:encoding:error:", errorOut.get(JAVA_LONG, 0L));
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

    /** {@code +[NSString stringWithContentsOfURL:encoding:error:]} */
    public static NSString stringWithContentsOfURL(final NSURL url, final long enc) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_CLASS_stringWithContentsOfURL_encoding_error_.invokeExact(CLS, SEL_CLASS_stringWithContentsOfURL_encoding_error_, url.handle(), enc, errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("stringWithContentsOfURL:encoding:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new NSString(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSString stringWithContentsOfFile:encoding:error:]} */
    public static NSString stringWithContentsOfFile(final String path, final long enc) {
        final long nsPath = ObjC.nsString(path);
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_CLASS_stringWithContentsOfFile_encoding_error_.invokeExact(CLS, SEL_CLASS_stringWithContentsOfFile_encoding_error_, nsPath, enc, errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("stringWithContentsOfFile:encoding:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new NSString(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /** {@code -[NSString initWithContentsOfURL:usedEncoding:error:]} */
    public NSString initWithContentsOfURL(final NSURL url, final MemorySegment enc) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_initWithContentsOfURL_usedEncoding_error_.invokeExact(this.handle, SEL_initWithContentsOfURL_usedEncoding_error_, url.handle(), enc.address(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("initWithContentsOfURL:usedEncoding:error:", errorOut.get(JAVA_LONG, 0L));
            }
            this.handle = result;
            return this;
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString initWithContentsOfFile:usedEncoding:error:]} */
    public NSString initWithContentsOfFile(final String path, final MemorySegment enc) {
        final long nsPath = ObjC.nsString(path);
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_initWithContentsOfFile_usedEncoding_error_.invokeExact(this.handle, SEL_initWithContentsOfFile_usedEncoding_error_, nsPath, enc.address(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("initWithContentsOfFile:usedEncoding:error:", errorOut.get(JAVA_LONG, 0L));
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

    /** {@code +[NSString stringWithContentsOfURL:usedEncoding:error:]} */
    public static NSString stringWithContentsOfURL(final NSURL url, final MemorySegment enc) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_CLASS_stringWithContentsOfURL_usedEncoding_error_.invokeExact(CLS, SEL_CLASS_stringWithContentsOfURL_usedEncoding_error_, url.handle(), enc.address(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("stringWithContentsOfURL:usedEncoding:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new NSString(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSString stringWithContentsOfFile:usedEncoding:error:]} */
    public static NSString stringWithContentsOfFile(final String path, final MemorySegment enc) {
        final long nsPath = ObjC.nsString(path);
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_CLASS_stringWithContentsOfFile_usedEncoding_error_.invokeExact(CLS, SEL_CLASS_stringWithContentsOfFile_usedEncoding_error_, nsPath, enc.address(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("stringWithContentsOfFile:usedEncoding:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new NSString(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /** {@code -[NSString doubleValue]} */
    public double doubleValue() {
        try {
            return (double) MH_doubleValue.invokeExact(this.handle, SEL_doubleValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString floatValue]} */
    public float floatValue() {
        try {
            return (float) MH_floatValue.invokeExact(this.handle, SEL_floatValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString intValue]} */
    public int intValue() {
        try {
            return (int) MH_intValue.invokeExact(this.handle, SEL_intValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString integerValue]} */
    public long integerValue() {
        try {
            return (long) MH_integerValue.invokeExact(this.handle, SEL_integerValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString longLongValue]} */
    public long longLongValue() {
        try {
            return (long) MH_longLongValue.invokeExact(this.handle, SEL_longLongValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString boolValue]} */
    public boolean boolValue() {
        try {
            return (boolean) MH_boolValue.invokeExact(this.handle, SEL_boolValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString uppercaseString]} */
    public String uppercaseString() {
        try {
            long result = (long) MH_uppercaseString.invokeExact(this.handle, SEL_uppercaseString);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString lowercaseString]} */
    public String lowercaseString() {
        try {
            long result = (long) MH_lowercaseString.invokeExact(this.handle, SEL_lowercaseString);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString capitalizedString]} */
    public String capitalizedString() {
        try {
            long result = (long) MH_capitalizedString.invokeExact(this.handle, SEL_capitalizedString);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString localizedUppercaseString]} */
    public String localizedUppercaseString() {
        try {
            long result = (long) MH_localizedUppercaseString.invokeExact(this.handle, SEL_localizedUppercaseString);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString localizedLowercaseString]} */
    public String localizedLowercaseString() {
        try {
            long result = (long) MH_localizedLowercaseString.invokeExact(this.handle, SEL_localizedLowercaseString);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString localizedCapitalizedString]} */
    public String localizedCapitalizedString() {
        try {
            long result = (long) MH_localizedCapitalizedString.invokeExact(this.handle, SEL_localizedCapitalizedString);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString UTF8String]} */
    public MemorySegment UTF8String() {
        try {
            return MemorySegment.ofAddress((long) MH_UTF8String.invokeExact(this.handle, SEL_UTF8String));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString fastestEncoding]} */
    public long fastestEncoding() {
        try {
            return (long) MH_fastestEncoding.invokeExact(this.handle, SEL_fastestEncoding);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString smallestEncoding]} */
    public long smallestEncoding() {
        try {
            return (long) MH_smallestEncoding.invokeExact(this.handle, SEL_smallestEncoding);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSString availableStringEncodings]} */
    public static MemorySegment availableStringEncodings() {
        try {
            return MemorySegment.ofAddress((long) MH_CLASS_availableStringEncodings.invokeExact(CLS, SEL_CLASS_availableStringEncodings));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSString defaultCStringEncoding]} */
    public static long defaultCStringEncoding() {
        try {
            return (long) MH_CLASS_defaultCStringEncoding.invokeExact(CLS, SEL_CLASS_defaultCStringEncoding);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString decomposedStringWithCanonicalMapping]} */
    public String decomposedStringWithCanonicalMapping() {
        try {
            long result = (long) MH_decomposedStringWithCanonicalMapping.invokeExact(this.handle, SEL_decomposedStringWithCanonicalMapping);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString precomposedStringWithCanonicalMapping]} */
    public String precomposedStringWithCanonicalMapping() {
        try {
            long result = (long) MH_precomposedStringWithCanonicalMapping.invokeExact(this.handle, SEL_precomposedStringWithCanonicalMapping);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString decomposedStringWithCompatibilityMapping]} */
    public String decomposedStringWithCompatibilityMapping() {
        try {
            long result = (long) MH_decomposedStringWithCompatibilityMapping.invokeExact(this.handle, SEL_decomposedStringWithCompatibilityMapping);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString precomposedStringWithCompatibilityMapping]} */
    public String precomposedStringWithCompatibilityMapping() {
        try {
            long result = (long) MH_precomposedStringWithCompatibilityMapping.invokeExact(this.handle, SEL_precomposedStringWithCompatibilityMapping);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString description]} */
    public String description() {
        try {
            long result = (long) MH_description.invokeExact(this.handle, SEL_description);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString hash]} */
    public long hash() {
        try {
            return (long) MH_hash.invokeExact(this.handle, SEL_hash);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSString stringEncodingForData:encodingOptions:convertedString:usedLossyConversion:]} */
    public static long stringEncodingForData(final NSData data, @Nullable final NSDictionary<NSObject, NSObject> opts, final MemorySegment string, final MemorySegment usedLossyConversion) {
        try {
            return (long) MH_CLASS_stringEncodingForData_encodingOptions_convertedString_usedLossyConversion_.invokeExact(CLS, SEL_CLASS_stringEncodingForData_encodingOptions_convertedString_usedLossyConversion_, data.handle(), opts == null ? 0L : opts.handle(), string.address(), usedLossyConversion.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSString propertyList]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSObject propertyList() {
        try {
            long result = (long) MH_propertyList.invokeExact(this.handle, SEL_propertyList);
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSString propertyListFromStringsFileFormat]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSDictionary<NSObject, NSObject> propertyListFromStringsFileFormat() {
        try {
            long result = (long) MH_propertyListFromStringsFileFormat.invokeExact(this.handle, SEL_propertyListFromStringsFileFormat);
            return result == 0L ? null : new NSDictionary<>(result, NSObject::new, NSObject::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString cString]} */
    public MemorySegment cString() {
        try {
            return MemorySegment.ofAddress((long) MH_cString.invokeExact(this.handle, SEL_cString));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString lossyCString]} */
    public MemorySegment lossyCString() {
        try {
            return MemorySegment.ofAddress((long) MH_lossyCString.invokeExact(this.handle, SEL_lossyCString));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString cStringLength]} */
    public long cStringLength() {
        try {
            return (long) MH_cStringLength.invokeExact(this.handle, SEL_cStringLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString getCString:]} */
    public void getCString(final MemorySegment bytes) {
        try {
            MH_getCString_.invokeExact(this.handle, SEL_getCString_, bytes.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString getCString:maxLength:]} */
    public void getCString(final MemorySegment bytes, final long maxLength) {
        try {
            MH_getCString_maxLength_.invokeExact(this.handle, SEL_getCString_maxLength_, bytes.address(), maxLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString getCString:maxLength:range:remainingRange:]} */
    public void getCString(final MemorySegment bytes, final long maxLength, final NSRange aRange, final MemorySegment leftoverRange) {
        try {
            MH_getCString_maxLength_range_remainingRange_.invokeExact(this.handle, SEL_getCString_maxLength_range_remainingRange_, bytes.address(), maxLength, aRange.location(), aRange.length(), leftoverRange.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString writeToFile:atomically:]} */
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

    /** {@code -[NSString writeToURL:atomically:]} */
    public boolean writeToURL(final NSURL url, final boolean atomically) {
        try {
            return (boolean) MH_writeToURL_atomically_.invokeExact(this.handle, SEL_writeToURL_atomically_, url.handle(), atomically);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSString initWithContentsOfFile:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public NSObject initWithContentsOfFile(final String path) {
        final long nsPath = ObjC.nsString(path);
        try {
            long result = (long) MH_initWithContentsOfFile_.invokeExact(this.handle, SEL_initWithContentsOfFile_, nsPath);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /**
     * {@code -[NSString initWithContentsOfURL:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public NSObject initWithContentsOfURL(final NSURL url) {
        try {
            long result = (long) MH_initWithContentsOfURL_.invokeExact(this.handle, SEL_initWithContentsOfURL_, url.handle());
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSString stringWithContentsOfFile:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static NSObject stringWithContentsOfFile(final String path) {
        final long nsPath = ObjC.nsString(path);
        try {
            long result = (long) MH_CLASS_stringWithContentsOfFile_.invokeExact(CLS, SEL_CLASS_stringWithContentsOfFile_, nsPath);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /**
     * {@code +[NSString stringWithContentsOfURL:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static NSObject stringWithContentsOfURL(final NSURL url) {
        try {
            long result = (long) MH_CLASS_stringWithContentsOfURL_.invokeExact(CLS, SEL_CLASS_stringWithContentsOfURL_, url.handle());
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSString initWithCStringNoCopy:length:freeWhenDone:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public NSObject initWithCStringNoCopy(final MemorySegment bytes, final long length, final boolean freeBuffer) {
        try {
            long result = (long) MH_initWithCStringNoCopy_length_freeWhenDone_.invokeExact(this.handle, SEL_initWithCStringNoCopy_length_freeWhenDone_, bytes.address(), length, freeBuffer);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSString initWithCString:length:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public NSObject initWithCStringLength(final MemorySegment bytes, final long length) {
        try {
            long result = (long) MH_initWithCString_length_.invokeExact(this.handle, SEL_initWithCString_length_, bytes.address(), length);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSString initWithCString:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public NSObject initWithCString(final MemorySegment bytes) {
        try {
            long result = (long) MH_initWithCString_.invokeExact(this.handle, SEL_initWithCString_, bytes.address());
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSString stringWithCString:length:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static NSObject stringWithCStringLength(final MemorySegment bytes, final long length) {
        try {
            long result = (long) MH_CLASS_stringWithCString_length_.invokeExact(CLS, SEL_CLASS_stringWithCString_length_, bytes.address(), length);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSString stringWithCString:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static NSObject stringWithCString(final MemorySegment bytes) {
        try {
            long result = (long) MH_CLASS_stringWithCString_.invokeExact(CLS, SEL_CLASS_stringWithCString_, bytes.address());
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString getCharacters:]} */
    public void getCharacters(final MemorySegment buffer) {
        try {
            MH_getCharacters_.invokeExact(this.handle, SEL_getCharacters_, buffer.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString variantFittingPresentationWidth:]} */
    public String variantFittingPresentationWidth(final long width) {
        try {
            long result = (long) MH_variantFittingPresentationWidth_.invokeExact(this.handle, SEL_variantFittingPresentationWidth_, width);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSString pathWithComponents:]} */
    public static String path(final NSArray<NSString> components) {
        try {
            long result = (long) MH_CLASS_pathWithComponents_.invokeExact(CLS, SEL_CLASS_pathWithComponents_, components.handle());
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString stringByAppendingPathComponent:]} */
    public String stringByAppendingPathComponent(final String str) {
        final long nsStr = ObjC.nsString(str);
        try {
            long result = (long) MH_stringByAppendingPathComponent_.invokeExact(this.handle, SEL_stringByAppendingPathComponent_, nsStr);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsStr);
        }
    }

    /** {@code -[NSString stringByAppendingPathExtension:]} */
    @Nullable
    public String stringByAppendingPathExtension(final String str) {
        final long nsStr = ObjC.nsString(str);
        try {
            long result = (long) MH_stringByAppendingPathExtension_.invokeExact(this.handle, SEL_stringByAppendingPathExtension_, nsStr);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsStr);
        }
    }

    /**
     * {@code -[NSString stringsByAppendingPaths:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<NSString> stringsByAppendingPaths(final NSArray<NSString> paths) {
        try {
            long result = (long) MH_stringsByAppendingPaths_.invokeExact(this.handle, SEL_stringsByAppendingPaths_, paths.handle());
            return new NSArray<>(result, NSString::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString completePathIntoString:caseSensitive:matchesIntoArray:filterTypes:]} */
    public long completePathIntoString(final MemorySegment outputName, final boolean flag, final MemorySegment outputArray, @Nullable final NSArray<NSString> filterTypes) {
        try {
            return (long) MH_completePathIntoString_caseSensitive_matchesIntoArray_filterTypes_.invokeExact(this.handle, SEL_completePathIntoString_caseSensitive_matchesIntoArray_filterTypes_, outputName.address(), flag, outputArray.address(), filterTypes == null ? 0L : filterTypes.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString getFileSystemRepresentation:maxLength:]} */
    public boolean getFileSystemRepresentation(final MemorySegment cname, final long max) {
        try {
            return (boolean) MH_getFileSystemRepresentation_maxLength_.invokeExact(this.handle, SEL_getFileSystemRepresentation_maxLength_, cname.address(), max);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSString pathComponents]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<NSString> pathComponents() {
        try {
            long result = (long) MH_pathComponents.invokeExact(this.handle, SEL_pathComponents);
            return new NSArray<>(result, NSString::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString isAbsolutePath]} */
    public boolean isAbsolutePath() {
        try {
            return (boolean) MH_isAbsolutePath.invokeExact(this.handle, SEL_isAbsolutePath);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString lastPathComponent]} */
    public String lastPathComponent() {
        try {
            long result = (long) MH_lastPathComponent.invokeExact(this.handle, SEL_lastPathComponent);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString stringByDeletingLastPathComponent]} */
    public String stringByDeletingLastPathComponent() {
        try {
            long result = (long) MH_stringByDeletingLastPathComponent.invokeExact(this.handle, SEL_stringByDeletingLastPathComponent);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString pathExtension]} */
    public String pathExtension() {
        try {
            long result = (long) MH_pathExtension.invokeExact(this.handle, SEL_pathExtension);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString stringByDeletingPathExtension]} */
    public String stringByDeletingPathExtension() {
        try {
            long result = (long) MH_stringByDeletingPathExtension.invokeExact(this.handle, SEL_stringByDeletingPathExtension);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString stringByAbbreviatingWithTildeInPath]} */
    public String stringByAbbreviatingWithTildeInPath() {
        try {
            long result = (long) MH_stringByAbbreviatingWithTildeInPath.invokeExact(this.handle, SEL_stringByAbbreviatingWithTildeInPath);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString stringByExpandingTildeInPath]} */
    public String stringByExpandingTildeInPath() {
        try {
            long result = (long) MH_stringByExpandingTildeInPath.invokeExact(this.handle, SEL_stringByExpandingTildeInPath);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString stringByStandardizingPath]} */
    public String stringByStandardizingPath() {
        try {
            long result = (long) MH_stringByStandardizingPath.invokeExact(this.handle, SEL_stringByStandardizingPath);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString stringByResolvingSymlinksInPath]} */
    public String stringByResolvingSymlinksInPath() {
        try {
            long result = (long) MH_stringByResolvingSymlinksInPath.invokeExact(this.handle, SEL_stringByResolvingSymlinksInPath);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString fileSystemRepresentation]} */
    public MemorySegment fileSystemRepresentation() {
        try {
            return MemorySegment.ofAddress((long) MH_fileSystemRepresentation.invokeExact(this.handle, SEL_fileSystemRepresentation));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString stringByAddingPercentEncodingWithAllowedCharacters:]} */
    @Nullable
    public String stringByAddingPercentEncoding(final NSObject allowedCharacters) {
        try {
            long result = (long) MH_stringByAddingPercentEncodingWithAllowedCharacters_.invokeExact(this.handle, SEL_stringByAddingPercentEncodingWithAllowedCharacters_, allowedCharacters.handle());
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString stringByAddingPercentEscapesUsingEncoding:]} */
    @Nullable
    public String stringByAddingPercentEscapesUsingEncoding(final long enc) {
        try {
            long result = (long) MH_stringByAddingPercentEscapesUsingEncoding_.invokeExact(this.handle, SEL_stringByAddingPercentEscapesUsingEncoding_, enc);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString stringByReplacingPercentEscapesUsingEncoding:]} */
    @Nullable
    public String stringByReplacingPercentEscapesUsingEncoding(final long enc) {
        try {
            long result = (long) MH_stringByReplacingPercentEscapesUsingEncoding_.invokeExact(this.handle, SEL_stringByReplacingPercentEscapesUsingEncoding_, enc);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSString stringByRemovingPercentEncoding]} */
    @Nullable
    public String stringByRemovingPercentEncoding() {
        try {
            long result = (long) MH_stringByRemovingPercentEncoding.invokeExact(this.handle, SEL_stringByRemovingPercentEncoding);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSString linguisticTagsInRange:scheme:options:orthography:tokenRanges:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     *
     * @param options a combination of {@link NSLinguisticTaggerOptions} flags
     */
    public NSArray<NSObject> linguisticTagsInRange(final NSRange range, final String scheme, final long options, @Nullable final NSObject orthography, final MemorySegment tokenRanges) {
        final long nsScheme = ObjC.nsString(scheme);
        try {
            long result = (long) MH_linguisticTagsInRange_scheme_options_orthography_tokenRanges_.invokeExact(this.handle, SEL_linguisticTagsInRange_scheme_options_orthography_tokenRanges_, range.location(), range.length(), nsScheme, options, orthography == null ? 0L : orthography.handle(), tokenRanges.address());
            return new NSArray<>(result, NSObject::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsScheme);
        }
    }

    /**
     * {@code -[NSString enumerateLinguisticTagsInRange:scheme:options:orthography:usingBlock:]}
     *
     * @param options a combination of {@link NSLinguisticTaggerOptions} flags
     */
    public void enumerateLinguisticTagsInRange(final NSRange range, final String scheme, final long options, @Nullable final NSObject orthography, final long block) {
        final long nsScheme = ObjC.nsString(scheme);
        try {
            MH_enumerateLinguisticTagsInRange_scheme_options_orthography_usingBlock_.invokeExact(this.handle, SEL_enumerateLinguisticTagsInRange_scheme_options_orthography_usingBlock_, range.location(), range.length(), nsScheme, options, orthography == null ? 0L : orthography.handle(), block);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsScheme);
        }
    }
}
