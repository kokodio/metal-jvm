package io.github.kokodio.metaljvm.foundation;

import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code NSURL}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsurl">Apple documentation</a>
 */
public class NSURL extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Foundation");
    private static final long CLS = ObjC.clazz("NSURL");
    private static final long SEL_initWithScheme_host_path_ = ObjC.selector("initWithScheme:host:path:");
    private static final MethodHandle MH_initWithScheme_host_path_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initFileURLWithPath_isDirectory_relativeToURL_ = ObjC.selector("initFileURLWithPath:isDirectory:relativeToURL:");
    private static final MethodHandle MH_initFileURLWithPath_isDirectory_relativeToURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN, JAVA_LONG));
    private static final long SEL_initFileURLWithPath_relativeToURL_ = ObjC.selector("initFileURLWithPath:relativeToURL:");
    private static final MethodHandle MH_initFileURLWithPath_relativeToURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initFileURLWithPath_isDirectory_ = ObjC.selector("initFileURLWithPath:isDirectory:");
    private static final MethodHandle MH_initFileURLWithPath_isDirectory_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_initFileURLWithPath_ = ObjC.selector("initFileURLWithPath:");
    private static final MethodHandle MH_initFileURLWithPath_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_fileURLWithPath_isDirectory_relativeToURL_ = ObjC.selector("fileURLWithPath:isDirectory:relativeToURL:");
    private static final MethodHandle MH_CLASS_fileURLWithPath_isDirectory_relativeToURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN, JAVA_LONG));
    private static final long SEL_CLASS_fileURLWithPath_relativeToURL_ = ObjC.selector("fileURLWithPath:relativeToURL:");
    private static final MethodHandle MH_CLASS_fileURLWithPath_relativeToURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_fileURLWithPath_isDirectory_ = ObjC.selector("fileURLWithPath:isDirectory:");
    private static final MethodHandle MH_CLASS_fileURLWithPath_isDirectory_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_CLASS_fileURLWithPath_ = ObjC.selector("fileURLWithPath:");
    private static final MethodHandle MH_CLASS_fileURLWithPath_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initFileURLWithFileSystemRepresentation_isDirectory_relativeToURL_ = ObjC.selector("initFileURLWithFileSystemRepresentation:isDirectory:relativeToURL:");
    private static final MethodHandle MH_initFileURLWithFileSystemRepresentation_isDirectory_relativeToURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN, JAVA_LONG));
    private static final long SEL_CLASS_fileURLWithFileSystemRepresentation_isDirectory_relativeToURL_ = ObjC.selector("fileURLWithFileSystemRepresentation:isDirectory:relativeToURL:");
    private static final MethodHandle MH_CLASS_fileURLWithFileSystemRepresentation_isDirectory_relativeToURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN, JAVA_LONG));
    private static final long SEL_initWithString_ = ObjC.selector("initWithString:");
    private static final MethodHandle MH_initWithString_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithString_relativeToURL_ = ObjC.selector("initWithString:relativeToURL:");
    private static final MethodHandle MH_initWithString_relativeToURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_URLWithString_ = ObjC.selector("URLWithString:");
    private static final MethodHandle MH_CLASS_URLWithString_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_URLWithString_relativeToURL_ = ObjC.selector("URLWithString:relativeToURL:");
    private static final MethodHandle MH_CLASS_URLWithString_relativeToURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithString_encodingInvalidCharacters_ = ObjC.selector("initWithString:encodingInvalidCharacters:");
    private static final MethodHandle MH_initWithString_encodingInvalidCharacters_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_CLASS_URLWithString_encodingInvalidCharacters_ = ObjC.selector("URLWithString:encodingInvalidCharacters:");
    private static final MethodHandle MH_CLASS_URLWithString_encodingInvalidCharacters_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_initWithDataRepresentation_relativeToURL_ = ObjC.selector("initWithDataRepresentation:relativeToURL:");
    private static final MethodHandle MH_initWithDataRepresentation_relativeToURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_URLWithDataRepresentation_relativeToURL_ = ObjC.selector("URLWithDataRepresentation:relativeToURL:");
    private static final MethodHandle MH_CLASS_URLWithDataRepresentation_relativeToURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initAbsoluteURLWithDataRepresentation_relativeToURL_ = ObjC.selector("initAbsoluteURLWithDataRepresentation:relativeToURL:");
    private static final MethodHandle MH_initAbsoluteURLWithDataRepresentation_relativeToURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_absoluteURLWithDataRepresentation_relativeToURL_ = ObjC.selector("absoluteURLWithDataRepresentation:relativeToURL:");
    private static final MethodHandle MH_CLASS_absoluteURLWithDataRepresentation_relativeToURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getFileSystemRepresentation_maxLength_ = ObjC.selector("getFileSystemRepresentation:maxLength:");
    private static final MethodHandle MH_getFileSystemRepresentation_maxLength_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isFileReferenceURL = ObjC.selector("isFileReferenceURL");
    private static final MethodHandle MH_isFileReferenceURL = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fileReferenceURL = ObjC.selector("fileReferenceURL");
    private static final MethodHandle MH_fileReferenceURL = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getResourceValue_forKey_error_ = ObjC.selector("getResourceValue:forKey:error:");
    private static final MethodHandle MH_getResourceValue_forKey_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resourceValuesForKeys_error_ = ObjC.selector("resourceValuesForKeys:error:");
    private static final MethodHandle MH_resourceValuesForKeys_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setResourceValue_forKey_error_ = ObjC.selector("setResourceValue:forKey:error:");
    private static final MethodHandle MH_setResourceValue_forKey_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setResourceValues_error_ = ObjC.selector("setResourceValues:error:");
    private static final MethodHandle MH_setResourceValues_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeCachedResourceValueForKey_ = ObjC.selector("removeCachedResourceValueForKey:");
    private static final MethodHandle MH_removeCachedResourceValueForKey_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeAllCachedResourceValues = ObjC.selector("removeAllCachedResourceValues");
    private static final MethodHandle MH_removeAllCachedResourceValues = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTemporaryResourceValue_forKey_ = ObjC.selector("setTemporaryResourceValue:forKey:");
    private static final MethodHandle MH_setTemporaryResourceValue_forKey_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bookmarkDataWithOptions_includingResourceValuesForKeys_relativeToURL_error_ = ObjC.selector("bookmarkDataWithOptions:includingResourceValuesForKeys:relativeToURL:error:");
    private static final MethodHandle MH_bookmarkDataWithOptions_includingResourceValuesForKeys_relativeToURL_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_ = ObjC.selector("initByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:");
    private static final MethodHandle MH_initByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_URLByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_ = ObjC.selector("URLByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:");
    private static final MethodHandle MH_CLASS_URLByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_resourceValuesForKeys_fromBookmarkData_ = ObjC.selector("resourceValuesForKeys:fromBookmarkData:");
    private static final MethodHandle MH_CLASS_resourceValuesForKeys_fromBookmarkData_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_writeBookmarkData_toURL_options_error_ = ObjC.selector("writeBookmarkData:toURL:options:error:");
    private static final MethodHandle MH_CLASS_writeBookmarkData_toURL_options_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_bookmarkDataWithContentsOfURL_error_ = ObjC.selector("bookmarkDataWithContentsOfURL:error:");
    private static final MethodHandle MH_CLASS_bookmarkDataWithContentsOfURL_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_URLByResolvingAliasFileAtURL_options_error_ = ObjC.selector("URLByResolvingAliasFileAtURL:options:error:");
    private static final MethodHandle MH_CLASS_URLByResolvingAliasFileAtURL_options_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_startAccessingSecurityScopedResource = ObjC.selector("startAccessingSecurityScopedResource");
    private static final MethodHandle MH_startAccessingSecurityScopedResource = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stopAccessingSecurityScopedResource = ObjC.selector("stopAccessingSecurityScopedResource");
    private static final MethodHandle MH_stopAccessingSecurityScopedResource = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_dataRepresentation = ObjC.selector("dataRepresentation");
    private static final MethodHandle MH_dataRepresentation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_absoluteString = ObjC.selector("absoluteString");
    private static final MethodHandle MH_absoluteString = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_relativeString = ObjC.selector("relativeString");
    private static final MethodHandle MH_relativeString = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_baseURL = ObjC.selector("baseURL");
    private static final MethodHandle MH_baseURL = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_absoluteURL = ObjC.selector("absoluteURL");
    private static final MethodHandle MH_absoluteURL = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_scheme = ObjC.selector("scheme");
    private static final MethodHandle MH_scheme = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resourceSpecifier = ObjC.selector("resourceSpecifier");
    private static final MethodHandle MH_resourceSpecifier = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_host = ObjC.selector("host");
    private static final MethodHandle MH_host = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_port = ObjC.selector("port");
    private static final MethodHandle MH_port = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_user = ObjC.selector("user");
    private static final MethodHandle MH_user = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_password = ObjC.selector("password");
    private static final MethodHandle MH_password = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_path = ObjC.selector("path");
    private static final MethodHandle MH_path = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fragment = ObjC.selector("fragment");
    private static final MethodHandle MH_fragment = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_parameterString = ObjC.selector("parameterString");
    private static final MethodHandle MH_parameterString = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_query = ObjC.selector("query");
    private static final MethodHandle MH_query = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_relativePath = ObjC.selector("relativePath");
    private static final MethodHandle MH_relativePath = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_hasDirectoryPath = ObjC.selector("hasDirectoryPath");
    private static final MethodHandle MH_hasDirectoryPath = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fileSystemRepresentation = ObjC.selector("fileSystemRepresentation");
    private static final MethodHandle MH_fileSystemRepresentation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isFileURL = ObjC.selector("isFileURL");
    private static final MethodHandle MH_isFileURL = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_standardizedURL = ObjC.selector("standardizedURL");
    private static final MethodHandle MH_standardizedURL = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_filePathURL = ObjC.selector("filePathURL");
    private static final MethodHandle MH_filePathURL = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getPromisedItemResourceValue_forKey_error_ = ObjC.selector("getPromisedItemResourceValue:forKey:error:");
    private static final MethodHandle MH_getPromisedItemResourceValue_forKey_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_promisedItemResourceValuesForKeys_error_ = ObjC.selector("promisedItemResourceValuesForKeys:error:");
    private static final MethodHandle MH_promisedItemResourceValuesForKeys_error_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_checkPromisedItemIsReachableAndReturnError_ = ObjC.selector("checkPromisedItemIsReachableAndReturnError:");
    private static final MethodHandle MH_checkPromisedItemIsReachableAndReturnError_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_fileURLWithPathComponents_ = ObjC.selector("fileURLWithPathComponents:");
    private static final MethodHandle MH_CLASS_fileURLWithPathComponents_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_URLByAppendingPathComponent_ = ObjC.selector("URLByAppendingPathComponent:");
    private static final MethodHandle MH_URLByAppendingPathComponent_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_URLByAppendingPathComponent_isDirectory_ = ObjC.selector("URLByAppendingPathComponent:isDirectory:");
    private static final MethodHandle MH_URLByAppendingPathComponent_isDirectory_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_URLByAppendingPathExtension_ = ObjC.selector("URLByAppendingPathExtension:");
    private static final MethodHandle MH_URLByAppendingPathExtension_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_checkResourceIsReachableAndReturnError_ = ObjC.selector("checkResourceIsReachableAndReturnError:");
    private static final MethodHandle MH_checkResourceIsReachableAndReturnError_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pathComponents = ObjC.selector("pathComponents");
    private static final MethodHandle MH_pathComponents = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_lastPathComponent = ObjC.selector("lastPathComponent");
    private static final MethodHandle MH_lastPathComponent = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pathExtension = ObjC.selector("pathExtension");
    private static final MethodHandle MH_pathExtension = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_URLByDeletingLastPathComponent = ObjC.selector("URLByDeletingLastPathComponent");
    private static final MethodHandle MH_URLByDeletingLastPathComponent = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_URLByDeletingPathExtension = ObjC.selector("URLByDeletingPathExtension");
    private static final MethodHandle MH_URLByDeletingPathExtension = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_URLByStandardizingPath = ObjC.selector("URLByStandardizingPath");
    private static final MethodHandle MH_URLByStandardizingPath = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_URLByResolvingSymlinksInPath = ObjC.selector("URLByResolvingSymlinksInPath");
    private static final MethodHandle MH_URLByResolvingSymlinksInPath = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resourceDataUsingCache_ = ObjC.selector("resourceDataUsingCache:");
    private static final MethodHandle MH_resourceDataUsingCache_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_loadResourceDataNotifyingClient_usingCache_ = ObjC.selector("loadResourceDataNotifyingClient:usingCache:");
    private static final MethodHandle MH_loadResourceDataNotifyingClient_usingCache_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_propertyForKey_ = ObjC.selector("propertyForKey:");
    private static final MethodHandle MH_propertyForKey_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setResourceData_ = ObjC.selector("setResourceData:");
    private static final MethodHandle MH_setResourceData_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setProperty_forKey_ = ObjC.selector("setProperty:forKey:");
    private static final MethodHandle MH_setProperty_forKey_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_URLHandleUsingCache_ = ObjC.selector("URLHandleUsingCache:");
    private static final MethodHandle MH_URLHandleUsingCache_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_CLASS_URLFromPasteboard_ = ObjC.selector("URLFromPasteboard:");
    private static final MethodHandle MH_CLASS_URLFromPasteboard_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_writeToPasteboard_ = ObjC.selector("writeToPasteboard:");
    private static final MethodHandle MH_writeToPasteboard_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public NSURL(final long handle) {
        super(handle);
    }

    /**
     * {@code +[NSURL alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static NSURL alloc() {
        try {
            return new NSURL((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL init]} */
    public NSURL init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL initWithScheme:host:path:]} */
    @Nullable
    public NSURL initWithScheme(final String scheme, @Nullable final String host, final String path) {
        final long nsScheme = ObjC.nsString(scheme);
        final long nsHost = host == null ? 0L : ObjC.nsString(host);
        final long nsPath = ObjC.nsString(path);
        try {
            long result = (long) MH_initWithScheme_host_path_.invokeExact(this.handle, SEL_initWithScheme_host_path_, nsScheme, nsHost, nsPath);
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsScheme);
            ObjC.release(nsHost);
            ObjC.release(nsPath);
        }
    }

    /** {@code -[NSURL initFileURLWithPath:isDirectory:relativeToURL:]} */
    public NSURL initFileURL(final String path, final boolean isDir, @Nullable final NSURL baseURL) {
        final long nsPath = ObjC.nsString(path);
        try {
            long result = (long) MH_initFileURLWithPath_isDirectory_relativeToURL_.invokeExact(this.handle, SEL_initFileURLWithPath_isDirectory_relativeToURL_, nsPath, isDir, baseURL == null ? 0L : baseURL.handle());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /** {@code -[NSURL initFileURLWithPath:relativeToURL:]} */
    public NSURL initFileURL(final String path, @Nullable final NSURL baseURL) {
        final long nsPath = ObjC.nsString(path);
        try {
            long result = (long) MH_initFileURLWithPath_relativeToURL_.invokeExact(this.handle, SEL_initFileURLWithPath_relativeToURL_, nsPath, baseURL == null ? 0L : baseURL.handle());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /** {@code -[NSURL initFileURLWithPath:isDirectory:]} */
    public NSURL initFileURL(final String path, final boolean isDir) {
        final long nsPath = ObjC.nsString(path);
        try {
            long result = (long) MH_initFileURLWithPath_isDirectory_.invokeExact(this.handle, SEL_initFileURLWithPath_isDirectory_, nsPath, isDir);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /** {@code -[NSURL initFileURLWithPath:]} */
    public NSURL initFileURL(final String path) {
        final long nsPath = ObjC.nsString(path);
        try {
            long result = (long) MH_initFileURLWithPath_.invokeExact(this.handle, SEL_initFileURLWithPath_, nsPath);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /**
     * {@code +[NSURL fileURLWithPath:isDirectory:relativeToURL:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSURL fileURL(final String path, final boolean isDir, @Nullable final NSURL baseURL) {
        final long nsPath = ObjC.nsString(path);
        try {
            long result = (long) MH_CLASS_fileURLWithPath_isDirectory_relativeToURL_.invokeExact(CLS, SEL_CLASS_fileURLWithPath_isDirectory_relativeToURL_, nsPath, isDir, baseURL == null ? 0L : baseURL.handle());
            return new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /**
     * {@code +[NSURL fileURLWithPath:relativeToURL:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSURL fileURL(final String path, @Nullable final NSURL baseURL) {
        final long nsPath = ObjC.nsString(path);
        try {
            long result = (long) MH_CLASS_fileURLWithPath_relativeToURL_.invokeExact(CLS, SEL_CLASS_fileURLWithPath_relativeToURL_, nsPath, baseURL == null ? 0L : baseURL.handle());
            return new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /**
     * {@code +[NSURL fileURLWithPath:isDirectory:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSURL fileURL(final String path, final boolean isDir) {
        final long nsPath = ObjC.nsString(path);
        try {
            long result = (long) MH_CLASS_fileURLWithPath_isDirectory_.invokeExact(CLS, SEL_CLASS_fileURLWithPath_isDirectory_, nsPath, isDir);
            return new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /**
     * {@code +[NSURL fileURLWithPath:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSURL fileURL(final String path) {
        final long nsPath = ObjC.nsString(path);
        try {
            long result = (long) MH_CLASS_fileURLWithPath_.invokeExact(CLS, SEL_CLASS_fileURLWithPath_, nsPath);
            return new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /** {@code -[NSURL initFileURLWithFileSystemRepresentation:isDirectory:relativeToURL:]} */
    public NSURL initFileURLWithFileSystemRepresentation(final MemorySegment path, final boolean isDir, @Nullable final NSURL baseURL) {
        try {
            long result = (long) MH_initFileURLWithFileSystemRepresentation_isDirectory_relativeToURL_.invokeExact(this.handle, SEL_initFileURLWithFileSystemRepresentation_isDirectory_relativeToURL_, path.address(), isDir, baseURL == null ? 0L : baseURL.handle());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSURL fileURLWithFileSystemRepresentation:isDirectory:relativeToURL:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSURL fileURLWithFileSystemRepresentation(final MemorySegment path, final boolean isDir, @Nullable final NSURL baseURL) {
        try {
            long result = (long) MH_CLASS_fileURLWithFileSystemRepresentation_isDirectory_relativeToURL_.invokeExact(CLS, SEL_CLASS_fileURLWithFileSystemRepresentation_isDirectory_relativeToURL_, path.address(), isDir, baseURL == null ? 0L : baseURL.handle());
            return new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL initWithString:]} */
    @Nullable
    public NSURL initWithString(final String URLString) {
        final long nsURLString = ObjC.nsString(URLString);
        try {
            long result = (long) MH_initWithString_.invokeExact(this.handle, SEL_initWithString_, nsURLString);
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsURLString);
        }
    }

    /** {@code -[NSURL initWithString:relativeToURL:]} */
    @Nullable
    public NSURL initWithString(final String URLString, @Nullable final NSURL baseURL) {
        final long nsURLString = ObjC.nsString(URLString);
        try {
            long result = (long) MH_initWithString_relativeToURL_.invokeExact(this.handle, SEL_initWithString_relativeToURL_, nsURLString, baseURL == null ? 0L : baseURL.handle());
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsURLString);
        }
    }

    /** {@code +[NSURL URLWithString:]} */
    @Nullable
    public static NSURL URLWithString(final String URLString) {
        final long nsURLString = ObjC.nsString(URLString);
        try {
            long result = (long) MH_CLASS_URLWithString_.invokeExact(CLS, SEL_CLASS_URLWithString_, nsURLString);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsURLString);
        }
    }

    /** {@code +[NSURL URLWithString:relativeToURL:]} */
    @Nullable
    public static NSURL URLWithString(final String URLString, @Nullable final NSURL baseURL) {
        final long nsURLString = ObjC.nsString(URLString);
        try {
            long result = (long) MH_CLASS_URLWithString_relativeToURL_.invokeExact(CLS, SEL_CLASS_URLWithString_relativeToURL_, nsURLString, baseURL == null ? 0L : baseURL.handle());
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsURLString);
        }
    }

    /** {@code -[NSURL initWithString:encodingInvalidCharacters:]} */
    @Nullable
    public NSURL initWithString(final String URLString, final boolean encodingInvalidCharacters) {
        final long nsURLString = ObjC.nsString(URLString);
        try {
            long result = (long) MH_initWithString_encodingInvalidCharacters_.invokeExact(this.handle, SEL_initWithString_encodingInvalidCharacters_, nsURLString, encodingInvalidCharacters);
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsURLString);
        }
    }

    /** {@code +[NSURL URLWithString:encodingInvalidCharacters:]} */
    @Nullable
    public static NSURL URLWithString(final String URLString, final boolean encodingInvalidCharacters) {
        final long nsURLString = ObjC.nsString(URLString);
        try {
            long result = (long) MH_CLASS_URLWithString_encodingInvalidCharacters_.invokeExact(CLS, SEL_CLASS_URLWithString_encodingInvalidCharacters_, nsURLString, encodingInvalidCharacters);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsURLString);
        }
    }

    /** {@code -[NSURL initWithDataRepresentation:relativeToURL:]} */
    public NSURL initWithDataRepresentation(final NSData data, @Nullable final NSURL baseURL) {
        try {
            long result = (long) MH_initWithDataRepresentation_relativeToURL_.invokeExact(this.handle, SEL_initWithDataRepresentation_relativeToURL_, data.handle(), baseURL == null ? 0L : baseURL.handle());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSURL URLWithDataRepresentation:relativeToURL:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSURL URLWithDataRepresentation(final NSData data, @Nullable final NSURL baseURL) {
        try {
            long result = (long) MH_CLASS_URLWithDataRepresentation_relativeToURL_.invokeExact(CLS, SEL_CLASS_URLWithDataRepresentation_relativeToURL_, data.handle(), baseURL == null ? 0L : baseURL.handle());
            return new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL initAbsoluteURLWithDataRepresentation:relativeToURL:]} */
    public NSURL initAbsoluteURL(final NSData data, @Nullable final NSURL baseURL) {
        try {
            long result = (long) MH_initAbsoluteURLWithDataRepresentation_relativeToURL_.invokeExact(this.handle, SEL_initAbsoluteURLWithDataRepresentation_relativeToURL_, data.handle(), baseURL == null ? 0L : baseURL.handle());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSURL absoluteURLWithDataRepresentation:relativeToURL:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSURL absoluteURLWithDataRepresentation(final NSData data, @Nullable final NSURL baseURL) {
        try {
            long result = (long) MH_CLASS_absoluteURLWithDataRepresentation_relativeToURL_.invokeExact(CLS, SEL_CLASS_absoluteURLWithDataRepresentation_relativeToURL_, data.handle(), baseURL == null ? 0L : baseURL.handle());
            return new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL getFileSystemRepresentation:maxLength:]} */
    public boolean getFileSystemRepresentation(final MemorySegment buffer, final long maxBufferLength) {
        try {
            return (boolean) MH_getFileSystemRepresentation_maxLength_.invokeExact(this.handle, SEL_getFileSystemRepresentation_maxLength_, buffer.address(), maxBufferLength);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL isFileReferenceURL]} */
    public boolean isFileReferenceURL() {
        try {
            return (boolean) MH_isFileReferenceURL.invokeExact(this.handle, SEL_isFileReferenceURL);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSURL fileReferenceURL]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL fileReferenceURL() {
        try {
            long result = (long) MH_fileReferenceURL.invokeExact(this.handle, SEL_fileReferenceURL);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL getResourceValue:forKey:error:]} */
    public void getResourceValue(final NSObject value, final String key) {
        final long nsKey = ObjC.nsString(key);
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_getResourceValue_forKey_error_.invokeExact(this.handle, SEL_getResourceValue_forKey_error_, value.handle(), nsKey, errorOut.address());
            if (!result) {
                throw NSErrorException.of("getResourceValue:forKey:error:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKey);
        }
    }

    /**
     * {@code -[NSURL resourceValuesForKeys:error:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSDictionary<NSObject, NSObject> resourceValuesForKeys(final NSArray<NSObject> keys) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_resourceValuesForKeys_error_.invokeExact(this.handle, SEL_resourceValuesForKeys_error_, keys.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("resourceValuesForKeys:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new NSDictionary<>(result, NSObject::new, NSObject::new);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL setResourceValue:forKey:error:]} */
    public void setResourceValue(@Nullable final NSObject value, final String key) {
        final long nsKey = ObjC.nsString(key);
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_setResourceValue_forKey_error_.invokeExact(this.handle, SEL_setResourceValue_forKey_error_, value == null ? 0L : value.handle(), nsKey, errorOut.address());
            if (!result) {
                throw NSErrorException.of("setResourceValue:forKey:error:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKey);
        }
    }

    /** {@code -[NSURL setResourceValues:error:]} */
    public void setResourceValues(final NSDictionary<NSObject, NSObject> keyedValues) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_setResourceValues_error_.invokeExact(this.handle, SEL_setResourceValues_error_, keyedValues.handle(), errorOut.address());
            if (!result) {
                throw NSErrorException.of("setResourceValues:error:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL removeCachedResourceValueForKey:]} */
    public void removeCachedResourceValueForKey(final String key) {
        final long nsKey = ObjC.nsString(key);
        try {
            MH_removeCachedResourceValueForKey_.invokeExact(this.handle, SEL_removeCachedResourceValueForKey_, nsKey);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKey);
        }
    }

    /** {@code -[NSURL removeAllCachedResourceValues]} */
    public void removeAllCachedResourceValues() {
        try {
            MH_removeAllCachedResourceValues.invokeExact(this.handle, SEL_removeAllCachedResourceValues);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL setTemporaryResourceValue:forKey:]} */
    public void setTemporaryResourceValue(@Nullable final NSObject value, final String key) {
        final long nsKey = ObjC.nsString(key);
        try {
            MH_setTemporaryResourceValue_forKey_.invokeExact(this.handle, SEL_setTemporaryResourceValue_forKey_, value == null ? 0L : value.handle(), nsKey);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKey);
        }
    }

    /**
     * {@code -[NSURL bookmarkDataWithOptions:includingResourceValuesForKeys:relativeToURL:error:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     *
     * @param options a combination of {@link NSURLBookmarkCreationOptions} flags
     */
    public NSData bookmarkData(final long options, @Nullable final NSArray<NSObject> keys, @Nullable final NSURL relativeURL) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_bookmarkDataWithOptions_includingResourceValuesForKeys_relativeToURL_error_.invokeExact(this.handle, SEL_bookmarkDataWithOptions_includingResourceValuesForKeys_relativeToURL_error_, options, keys == null ? 0L : keys.handle(), relativeURL == null ? 0L : relativeURL.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("bookmarkDataWithOptions:includingResourceValuesForKeys:relativeToURL:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new NSData(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSURL initByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:]}
     *
     * @param options a combination of {@link NSURLBookmarkResolutionOptions} flags
     */
    public NSURL initByResolvingBookmarkData(final NSData bookmarkData, final long options, @Nullable final NSURL relativeURL, final MemorySegment isStale) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_initByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_.invokeExact(this.handle, SEL_initByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_, bookmarkData.handle(), options, relativeURL == null ? 0L : relativeURL.handle(), isStale.address(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("initByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:", errorOut.get(JAVA_LONG, 0L));
            }
            this.handle = result;
            return this;
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSURL URLByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:]}
     *
     * @param options a combination of {@link NSURLBookmarkResolutionOptions} flags
     */
    public static NSURL URLByResolvingBookmarkData(final NSData bookmarkData, final long options, @Nullable final NSURL relativeURL, final MemorySegment isStale) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_CLASS_URLByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_.invokeExact(CLS, SEL_CLASS_URLByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_, bookmarkData.handle(), options, relativeURL == null ? 0L : relativeURL.handle(), isStale.address(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("URLByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new NSURL(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSURL resourceValuesForKeys:fromBookmarkData:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static NSDictionary<NSObject, NSObject> resourceValuesForKeys(final NSArray<NSObject> keys, final NSData bookmarkData) {
        try {
            long result = (long) MH_CLASS_resourceValuesForKeys_fromBookmarkData_.invokeExact(CLS, SEL_CLASS_resourceValuesForKeys_fromBookmarkData_, keys.handle(), bookmarkData.handle());
            return result == 0L ? null : new NSDictionary<>(result, NSObject::new, NSObject::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSURL writeBookmarkData:toURL:options:error:]} */
    public static void writeBookmarkData(final NSData bookmarkData, final NSURL bookmarkFileURL, final long options) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_CLASS_writeBookmarkData_toURL_options_error_.invokeExact(CLS, SEL_CLASS_writeBookmarkData_toURL_options_error_, bookmarkData.handle(), bookmarkFileURL.handle(), options, errorOut.address());
            if (!result) {
                throw NSErrorException.of("writeBookmarkData:toURL:options:error:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSURL bookmarkDataWithContentsOfURL:error:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSData bookmarkDataWithContentsOfURL(final NSURL bookmarkFileURL) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_CLASS_bookmarkDataWithContentsOfURL_error_.invokeExact(CLS, SEL_CLASS_bookmarkDataWithContentsOfURL_error_, bookmarkFileURL.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("bookmarkDataWithContentsOfURL:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new NSData(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSURL URLByResolvingAliasFileAtURL:options:error:]}
     *
     * @param options a combination of {@link NSURLBookmarkResolutionOptions} flags
     */
    public static NSURL URLByResolvingAliasFileAtURL(final NSURL url, final long options) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_CLASS_URLByResolvingAliasFileAtURL_options_error_.invokeExact(CLS, SEL_CLASS_URLByResolvingAliasFileAtURL_options_error_, url.handle(), options, errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("URLByResolvingAliasFileAtURL:options:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new NSURL(result);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL startAccessingSecurityScopedResource]} */
    public boolean startAccessingSecurityScopedResource() {
        try {
            return (boolean) MH_startAccessingSecurityScopedResource.invokeExact(this.handle, SEL_startAccessingSecurityScopedResource);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL stopAccessingSecurityScopedResource]} */
    public void stopAccessingSecurityScopedResource() {
        try {
            MH_stopAccessingSecurityScopedResource.invokeExact(this.handle, SEL_stopAccessingSecurityScopedResource);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSURL dataRepresentation]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSData dataRepresentation() {
        try {
            long result = (long) MH_dataRepresentation.invokeExact(this.handle, SEL_dataRepresentation);
            return new NSData(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL absoluteString]} */
    @Nullable
    public String absoluteString() {
        try {
            long result = (long) MH_absoluteString.invokeExact(this.handle, SEL_absoluteString);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL relativeString]} */
    public String relativeString() {
        try {
            long result = (long) MH_relativeString.invokeExact(this.handle, SEL_relativeString);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSURL baseURL]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL baseURL() {
        try {
            long result = (long) MH_baseURL.invokeExact(this.handle, SEL_baseURL);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSURL absoluteURL]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL absoluteURL() {
        try {
            long result = (long) MH_absoluteURL.invokeExact(this.handle, SEL_absoluteURL);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL scheme]} */
    @Nullable
    public String scheme() {
        try {
            long result = (long) MH_scheme.invokeExact(this.handle, SEL_scheme);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL resourceSpecifier]} */
    @Nullable
    public String resourceSpecifier() {
        try {
            long result = (long) MH_resourceSpecifier.invokeExact(this.handle, SEL_resourceSpecifier);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL host]} */
    @Nullable
    public String host() {
        try {
            long result = (long) MH_host.invokeExact(this.handle, SEL_host);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSURL port]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSNumber port() {
        try {
            long result = (long) MH_port.invokeExact(this.handle, SEL_port);
            return result == 0L ? null : new NSNumber(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL user]} */
    @Nullable
    public String user() {
        try {
            long result = (long) MH_user.invokeExact(this.handle, SEL_user);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL password]} */
    @Nullable
    public String password() {
        try {
            long result = (long) MH_password.invokeExact(this.handle, SEL_password);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL path]} */
    @Nullable
    public String path() {
        try {
            long result = (long) MH_path.invokeExact(this.handle, SEL_path);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL fragment]} */
    @Nullable
    public String fragment() {
        try {
            long result = (long) MH_fragment.invokeExact(this.handle, SEL_fragment);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL parameterString]} */
    @Nullable
    public String parameterString() {
        try {
            long result = (long) MH_parameterString.invokeExact(this.handle, SEL_parameterString);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL query]} */
    @Nullable
    public String query() {
        try {
            long result = (long) MH_query.invokeExact(this.handle, SEL_query);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL relativePath]} */
    @Nullable
    public String relativePath() {
        try {
            long result = (long) MH_relativePath.invokeExact(this.handle, SEL_relativePath);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL hasDirectoryPath]} */
    public boolean hasDirectoryPath() {
        try {
            return (boolean) MH_hasDirectoryPath.invokeExact(this.handle, SEL_hasDirectoryPath);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL fileSystemRepresentation]} */
    public MemorySegment fileSystemRepresentation() {
        try {
            return MemorySegment.ofAddress((long) MH_fileSystemRepresentation.invokeExact(this.handle, SEL_fileSystemRepresentation));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL isFileURL]} */
    public boolean isFileURL() {
        try {
            return (boolean) MH_isFileURL.invokeExact(this.handle, SEL_isFileURL);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSURL standardizedURL]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL standardizedURL() {
        try {
            long result = (long) MH_standardizedURL.invokeExact(this.handle, SEL_standardizedURL);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSURL filePathURL]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL filePathURL() {
        try {
            long result = (long) MH_filePathURL.invokeExact(this.handle, SEL_filePathURL);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL getPromisedItemResourceValue:forKey:error:]} */
    public void getPromisedItemResourceValue(final NSObject value, final String key) {
        final long nsKey = ObjC.nsString(key);
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_getPromisedItemResourceValue_forKey_error_.invokeExact(this.handle, SEL_getPromisedItemResourceValue_forKey_error_, value.handle(), nsKey, errorOut.address());
            if (!result) {
                throw NSErrorException.of("getPromisedItemResourceValue:forKey:error:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKey);
        }
    }

    /**
     * {@code -[NSURL promisedItemResourceValuesForKeys:error:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSDictionary<NSObject, NSObject> promisedItemResourceValuesForKeys(final NSArray<NSObject> keys) {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            long result = (long) MH_promisedItemResourceValuesForKeys_error_.invokeExact(this.handle, SEL_promisedItemResourceValuesForKeys_error_, keys.handle(), errorOut.address());
            if (result == 0L) {
                throw NSErrorException.of("promisedItemResourceValuesForKeys:error:", errorOut.get(JAVA_LONG, 0L));
            }
            return new NSDictionary<>(result, NSObject::new, NSObject::new);
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL checkPromisedItemIsReachableAndReturnError:]} */
    public void checkPromisedItemIsReachableAndReturnError() {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_checkPromisedItemIsReachableAndReturnError_.invokeExact(this.handle, SEL_checkPromisedItemIsReachableAndReturnError_, errorOut.address());
            if (!result) {
                throw NSErrorException.of("checkPromisedItemIsReachableAndReturnError:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSURL fileURLWithPathComponents:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static NSURL fileURLWithPathComponents(final NSArray<NSString> components) {
        try {
            long result = (long) MH_CLASS_fileURLWithPathComponents_.invokeExact(CLS, SEL_CLASS_fileURLWithPathComponents_, components.handle());
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSURL URLByAppendingPathComponent:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL URLByAppendingPathComponent(final String pathComponent) {
        final long nsPathComponent = ObjC.nsString(pathComponent);
        try {
            long result = (long) MH_URLByAppendingPathComponent_.invokeExact(this.handle, SEL_URLByAppendingPathComponent_, nsPathComponent);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPathComponent);
        }
    }

    /**
     * {@code -[NSURL URLByAppendingPathComponent:isDirectory:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL URLByAppendingPathComponent(final String pathComponent, final boolean isDirectory) {
        final long nsPathComponent = ObjC.nsString(pathComponent);
        try {
            long result = (long) MH_URLByAppendingPathComponent_isDirectory_.invokeExact(this.handle, SEL_URLByAppendingPathComponent_isDirectory_, nsPathComponent, isDirectory);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPathComponent);
        }
    }

    /**
     * {@code -[NSURL URLByAppendingPathExtension:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL URLByAppendingPathExtension(final String pathExtension) {
        final long nsPathExtension = ObjC.nsString(pathExtension);
        try {
            long result = (long) MH_URLByAppendingPathExtension_.invokeExact(this.handle, SEL_URLByAppendingPathExtension_, nsPathExtension);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPathExtension);
        }
    }

    /** {@code -[NSURL checkResourceIsReachableAndReturnError:]} */
    public void checkResourceIsReachableAndReturnError() {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_checkResourceIsReachableAndReturnError_.invokeExact(this.handle, SEL_checkResourceIsReachableAndReturnError_, errorOut.address());
            if (!result) {
                throw NSErrorException.of("checkResourceIsReachableAndReturnError:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSURL pathComponents]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<NSString> pathComponents() {
        try {
            long result = (long) MH_pathComponents.invokeExact(this.handle, SEL_pathComponents);
            return result == 0L ? null : new NSArray<>(result, NSString::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL lastPathComponent]} */
    @Nullable
    public String lastPathComponent() {
        try {
            long result = (long) MH_lastPathComponent.invokeExact(this.handle, SEL_lastPathComponent);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL pathExtension]} */
    @Nullable
    public String pathExtension() {
        try {
            long result = (long) MH_pathExtension.invokeExact(this.handle, SEL_pathExtension);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSURL URLByDeletingLastPathComponent]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL URLByDeletingLastPathComponent() {
        try {
            long result = (long) MH_URLByDeletingLastPathComponent.invokeExact(this.handle, SEL_URLByDeletingLastPathComponent);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSURL URLByDeletingPathExtension]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL URLByDeletingPathExtension() {
        try {
            long result = (long) MH_URLByDeletingPathExtension.invokeExact(this.handle, SEL_URLByDeletingPathExtension);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSURL URLByStandardizingPath]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL URLByStandardizingPath() {
        try {
            long result = (long) MH_URLByStandardizingPath.invokeExact(this.handle, SEL_URLByStandardizingPath);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSURL URLByResolvingSymlinksInPath]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL URLByResolvingSymlinksInPath() {
        try {
            long result = (long) MH_URLByResolvingSymlinksInPath.invokeExact(this.handle, SEL_URLByResolvingSymlinksInPath);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSURL resourceDataUsingCache:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSData resourceDataUsingCache(final boolean shouldUseCache) {
        try {
            long result = (long) MH_resourceDataUsingCache_.invokeExact(this.handle, SEL_resourceDataUsingCache_, shouldUseCache);
            return result == 0L ? null : new NSData(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL loadResourceDataNotifyingClient:usingCache:]} */
    public void loadResourceDataNotifyingClient(final NSObject client, final boolean shouldUseCache) {
        try {
            MH_loadResourceDataNotifyingClient_usingCache_.invokeExact(this.handle, SEL_loadResourceDataNotifyingClient_usingCache_, client.handle(), shouldUseCache);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSURL propertyForKey:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject propertyForKey(final String propertyKey) {
        final long nsPropertyKey = ObjC.nsString(propertyKey);
        try {
            long result = (long) MH_propertyForKey_.invokeExact(this.handle, SEL_propertyForKey_, nsPropertyKey);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPropertyKey);
        }
    }

    /** {@code -[NSURL setResourceData:]} */
    public boolean setResourceData(final NSData data) {
        try {
            return (boolean) MH_setResourceData_.invokeExact(this.handle, SEL_setResourceData_, data.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL setProperty:forKey:]} */
    public boolean setProperty(final NSObject property, final String propertyKey) {
        final long nsPropertyKey = ObjC.nsString(propertyKey);
        try {
            return (boolean) MH_setProperty_forKey_.invokeExact(this.handle, SEL_setProperty_forKey_, property.handle(), nsPropertyKey);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPropertyKey);
        }
    }

    /**
     * {@code -[NSURL URLHandleUsingCache:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject URLHandleUsingCache(final boolean shouldUseCache) {
        try {
            long result = (long) MH_URLHandleUsingCache_.invokeExact(this.handle, SEL_URLHandleUsingCache_, shouldUseCache);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSURL URLFromPasteboard:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static NSURL URLFromPasteboard(final NSObject pasteBoard) {
        try {
            long result = (long) MH_CLASS_URLFromPasteboard_.invokeExact(CLS, SEL_CLASS_URLFromPasteboard_, pasteBoard.handle());
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSURL writeToPasteboard:]} */
    public void writeToPasteboard(final NSObject pasteBoard) {
        try {
            MH_writeToPasteboard_.invokeExact(this.handle, SEL_writeToPasteboard_, pasteBoard.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
