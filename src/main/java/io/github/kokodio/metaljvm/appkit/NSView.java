package io.github.kokodio.metaljvm.appkit;

import io.github.kokodio.metaljvm.quartzcore.CALayer;
import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSData;
import io.github.kokodio.metaljvm.foundation.NSDictionary;
import io.github.kokodio.metaljvm.foundation.NSEdgeInsets;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.foundation.NSPoint;
import io.github.kokodio.metaljvm.foundation.NSRange;
import io.github.kokodio.metaljvm.foundation.NSRect;
import io.github.kokodio.metaljvm.foundation.NSSize;
import io.github.kokodio.metaljvm.foundation.NSString;
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
 * {@code NSView}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nsview">Apple documentation</a>
 */
public class NSView extends NSResponder {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("AppKit");
    private static final long CLS = ObjC.clazz("NSView");
    private static final long SEL_initWithFrame_ = ObjC.selector("initWithFrame:");
    private static final MethodHandle MH_initWithFrame_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_initWithCoder_ = ObjC.selector("initWithCoder:");
    private static final MethodHandle MH_initWithCoder_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isDescendantOf_ = ObjC.selector("isDescendantOf:");
    private static final MethodHandle MH_isDescendantOf_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_ancestorSharedWithView_ = ObjC.selector("ancestorSharedWithView:");
    private static final MethodHandle MH_ancestorSharedWithView_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_getRectsBeingDrawn_count_ = ObjC.selector("getRectsBeingDrawn:count:");
    private static final MethodHandle MH_getRectsBeingDrawn_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_needsToDrawRect_ = ObjC.selector("needsToDrawRect:");
    private static final MethodHandle MH_needsToDrawRect_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_viewDidHide = ObjC.selector("viewDidHide");
    private static final MethodHandle MH_viewDidHide = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_viewDidUnhide = ObjC.selector("viewDidUnhide");
    private static final MethodHandle MH_viewDidUnhide = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_addSubview_ = ObjC.selector("addSubview:");
    private static final MethodHandle MH_addSubview_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_addSubview_positioned_relativeTo_ = ObjC.selector("addSubview:positioned:relativeTo:");
    private static final MethodHandle MH_addSubview_positioned_relativeTo_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sortSubviewsUsingFunction_context_ = ObjC.selector("sortSubviewsUsingFunction:context:");
    private static final MethodHandle MH_sortSubviewsUsingFunction_context_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_viewWillMoveToWindow_ = ObjC.selector("viewWillMoveToWindow:");
    private static final MethodHandle MH_viewWillMoveToWindow_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_viewDidMoveToWindow = ObjC.selector("viewDidMoveToWindow");
    private static final MethodHandle MH_viewDidMoveToWindow = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_viewWillMoveToSuperview_ = ObjC.selector("viewWillMoveToSuperview:");
    private static final MethodHandle MH_viewWillMoveToSuperview_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_viewDidMoveToSuperview = ObjC.selector("viewDidMoveToSuperview");
    private static final MethodHandle MH_viewDidMoveToSuperview = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_didAddSubview_ = ObjC.selector("didAddSubview:");
    private static final MethodHandle MH_didAddSubview_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_willRemoveSubview_ = ObjC.selector("willRemoveSubview:");
    private static final MethodHandle MH_willRemoveSubview_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeFromSuperview = ObjC.selector("removeFromSuperview");
    private static final MethodHandle MH_removeFromSuperview = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_replaceSubview_with_ = ObjC.selector("replaceSubview:with:");
    private static final MethodHandle MH_replaceSubview_with_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeFromSuperviewWithoutNeedingDisplay = ObjC.selector("removeFromSuperviewWithoutNeedingDisplay");
    private static final MethodHandle MH_removeFromSuperviewWithoutNeedingDisplay = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_viewDidChangeBackingProperties = ObjC.selector("viewDidChangeBackingProperties");
    private static final MethodHandle MH_viewDidChangeBackingProperties = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_resizeSubviewsWithOldSize_ = ObjC.selector("resizeSubviewsWithOldSize:");
    private static final MethodHandle MH_resizeSubviewsWithOldSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_resizeWithOldSuperviewSize_ = ObjC.selector("resizeWithOldSuperviewSize:");
    private static final MethodHandle MH_resizeWithOldSuperviewSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_setFrameOrigin_ = ObjC.selector("setFrameOrigin:");
    private static final MethodHandle MH_setFrameOrigin_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_setFrameSize_ = ObjC.selector("setFrameSize:");
    private static final MethodHandle MH_setFrameSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_setBoundsOrigin_ = ObjC.selector("setBoundsOrigin:");
    private static final MethodHandle MH_setBoundsOrigin_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_setBoundsSize_ = ObjC.selector("setBoundsSize:");
    private static final MethodHandle MH_setBoundsSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_translateOriginToPoint_ = ObjC.selector("translateOriginToPoint:");
    private static final MethodHandle MH_translateOriginToPoint_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_scaleUnitSquareToSize_ = ObjC.selector("scaleUnitSquareToSize:");
    private static final MethodHandle MH_scaleUnitSquareToSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_rotateByAngle_ = ObjC.selector("rotateByAngle:");
    private static final MethodHandle MH_rotateByAngle_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_convertPoint_fromView_ = ObjC.selector("convertPoint:fromView:");
    private static final MethodHandle MH_convertPoint_fromView_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSPoint.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_convertPoint_toView_ = ObjC.selector("convertPoint:toView:");
    private static final MethodHandle MH_convertPoint_toView_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSPoint.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_convertSize_fromView_ = ObjC.selector("convertSize:fromView:");
    private static final MethodHandle MH_convertSize_fromView_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSSize.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_convertSize_toView_ = ObjC.selector("convertSize:toView:");
    private static final MethodHandle MH_convertSize_toView_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSSize.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_convertRect_fromView_ = ObjC.selector("convertRect:fromView:");
    private static final MethodHandle MH_convertRect_fromView_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_convertRect_toView_ = ObjC.selector("convertRect:toView:");
    private static final MethodHandle MH_convertRect_toView_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_backingAlignedRect_options_ = ObjC.selector("backingAlignedRect:options:");
    private static final MethodHandle MH_backingAlignedRect_options_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_centerScanRect_ = ObjC.selector("centerScanRect:");
    private static final MethodHandle MH_centerScanRect_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertPointToBacking_ = ObjC.selector("convertPointToBacking:");
    private static final MethodHandle MH_convertPointToBacking_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSPoint.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertPointFromBacking_ = ObjC.selector("convertPointFromBacking:");
    private static final MethodHandle MH_convertPointFromBacking_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSPoint.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertSizeToBacking_ = ObjC.selector("convertSizeToBacking:");
    private static final MethodHandle MH_convertSizeToBacking_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSSize.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertSizeFromBacking_ = ObjC.selector("convertSizeFromBacking:");
    private static final MethodHandle MH_convertSizeFromBacking_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSSize.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertRectToBacking_ = ObjC.selector("convertRectToBacking:");
    private static final MethodHandle MH_convertRectToBacking_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertRectFromBacking_ = ObjC.selector("convertRectFromBacking:");
    private static final MethodHandle MH_convertRectFromBacking_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertPointToLayer_ = ObjC.selector("convertPointToLayer:");
    private static final MethodHandle MH_convertPointToLayer_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSPoint.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertPointFromLayer_ = ObjC.selector("convertPointFromLayer:");
    private static final MethodHandle MH_convertPointFromLayer_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSPoint.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertSizeToLayer_ = ObjC.selector("convertSizeToLayer:");
    private static final MethodHandle MH_convertSizeToLayer_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSSize.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertSizeFromLayer_ = ObjC.selector("convertSizeFromLayer:");
    private static final MethodHandle MH_convertSizeFromLayer_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSSize.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertRectToLayer_ = ObjC.selector("convertRectToLayer:");
    private static final MethodHandle MH_convertRectToLayer_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertRectFromLayer_ = ObjC.selector("convertRectFromLayer:");
    private static final MethodHandle MH_convertRectFromLayer_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_setNeedsDisplayInRect_ = ObjC.selector("setNeedsDisplayInRect:");
    private static final MethodHandle MH_setNeedsDisplayInRect_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_lockFocus = ObjC.selector("lockFocus");
    private static final MethodHandle MH_lockFocus = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_unlockFocus = ObjC.selector("unlockFocus");
    private static final MethodHandle MH_unlockFocus = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_lockFocusIfCanDraw = ObjC.selector("lockFocusIfCanDraw");
    private static final MethodHandle MH_lockFocusIfCanDraw = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_lockFocusIfCanDrawInContext_ = ObjC.selector("lockFocusIfCanDrawInContext:");
    private static final MethodHandle MH_lockFocusIfCanDrawInContext_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_display = ObjC.selector("display");
    private static final MethodHandle MH_display = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_displayIfNeeded = ObjC.selector("displayIfNeeded");
    private static final MethodHandle MH_displayIfNeeded = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_displayIfNeededIgnoringOpacity = ObjC.selector("displayIfNeededIgnoringOpacity");
    private static final MethodHandle MH_displayIfNeededIgnoringOpacity = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_displayRect_ = ObjC.selector("displayRect:");
    private static final MethodHandle MH_displayRect_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_displayIfNeededInRect_ = ObjC.selector("displayIfNeededInRect:");
    private static final MethodHandle MH_displayIfNeededInRect_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_displayRectIgnoringOpacity_ = ObjC.selector("displayRectIgnoringOpacity:");
    private static final MethodHandle MH_displayRectIgnoringOpacity_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_displayIfNeededInRectIgnoringOpacity_ = ObjC.selector("displayIfNeededInRectIgnoringOpacity:");
    private static final MethodHandle MH_displayIfNeededInRectIgnoringOpacity_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_drawRect_ = ObjC.selector("drawRect:");
    private static final MethodHandle MH_drawRect_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_displayRectIgnoringOpacity_inContext_ = ObjC.selector("displayRectIgnoringOpacity:inContext:");
    private static final MethodHandle MH_displayRectIgnoringOpacity_inContext_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_bitmapImageRepForCachingDisplayInRect_ = ObjC.selector("bitmapImageRepForCachingDisplayInRect:");
    private static final MethodHandle MH_bitmapImageRepForCachingDisplayInRect_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_cacheDisplayInRect_toBitmapImageRep_ = ObjC.selector("cacheDisplayInRect:toBitmapImageRep:");
    private static final MethodHandle MH_cacheDisplayInRect_toBitmapImageRep_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_viewWillDraw = ObjC.selector("viewWillDraw");
    private static final MethodHandle MH_viewWillDraw = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_scrollPoint_ = ObjC.selector("scrollPoint:");
    private static final MethodHandle MH_scrollPoint_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_scrollRectToVisible_ = ObjC.selector("scrollRectToVisible:");
    private static final MethodHandle MH_scrollRectToVisible_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_autoscroll_ = ObjC.selector("autoscroll:");
    private static final MethodHandle MH_autoscroll_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_adjustScroll_ = ObjC.selector("adjustScroll:");
    private static final MethodHandle MH_adjustScroll_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_scrollRect_by_ = ObjC.selector("scrollRect:by:");
    private static final MethodHandle MH_scrollRect_by_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_translateRectsNeedingDisplayInRect_by_ = ObjC.selector("translateRectsNeedingDisplayInRect:by:");
    private static final MethodHandle MH_translateRectsNeedingDisplayInRect_by_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_hitTest_ = ObjC.selector("hitTest:");
    private static final MethodHandle MH_hitTest_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_mouse_inRect_ = ObjC.selector("mouse:inRect:");
    private static final MethodHandle MH_mouse_inRect_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_viewWithTag_ = ObjC.selector("viewWithTag:");
    private static final MethodHandle MH_viewWithTag_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_performKeyEquivalent_ = ObjC.selector("performKeyEquivalent:");
    private static final MethodHandle MH_performKeyEquivalent_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_acceptsFirstMouse_ = ObjC.selector("acceptsFirstMouse:");
    private static final MethodHandle MH_acceptsFirstMouse_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_shouldDelayWindowOrderingForEvent_ = ObjC.selector("shouldDelayWindowOrderingForEvent:");
    private static final MethodHandle MH_shouldDelayWindowOrderingForEvent_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_makeBackingLayer = ObjC.selector("makeBackingLayer");
    private static final MethodHandle MH_makeBackingLayer = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_updateLayer = ObjC.selector("updateLayer");
    private static final MethodHandle MH_updateLayer = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_layoutSubtreeIfNeeded = ObjC.selector("layoutSubtreeIfNeeded");
    private static final MethodHandle MH_layoutSubtreeIfNeeded = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_layout = ObjC.selector("layout");
    private static final MethodHandle MH_layout = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_menuForEvent_ = ObjC.selector("menuForEvent:");
    private static final MethodHandle MH_menuForEvent_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_willOpenMenu_withEvent_ = ObjC.selector("willOpenMenu:withEvent:");
    private static final MethodHandle MH_willOpenMenu_withEvent_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_didCloseMenu_withEvent_ = ObjC.selector("didCloseMenu:withEvent:");
    private static final MethodHandle MH_didCloseMenu_withEvent_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_addToolTipRect_owner_userData_ = ObjC.selector("addToolTipRect:owner:userData:");
    private static final MethodHandle MH_addToolTipRect_owner_userData_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeToolTip_ = ObjC.selector("removeToolTip:");
    private static final MethodHandle MH_removeToolTip_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeAllToolTips = ObjC.selector("removeAllToolTips");
    private static final MethodHandle MH_removeAllToolTips = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_viewWillStartLiveResize = ObjC.selector("viewWillStartLiveResize");
    private static final MethodHandle MH_viewWillStartLiveResize = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_viewDidEndLiveResize = ObjC.selector("viewDidEndLiveResize");
    private static final MethodHandle MH_viewDidEndLiveResize = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_getRectsExposedDuringLiveResize_count_ = ObjC.selector("getRectsExposedDuringLiveResize:count:");
    private static final MethodHandle MH_getRectsExposedDuringLiveResize_count_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rectForSmartMagnificationAtPoint_inRect_ = ObjC.selector("rectForSmartMagnificationAtPoint:inRect:");
    private static final MethodHandle MH_rectForSmartMagnificationAtPoint_inRect_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_prepareForReuse = ObjC.selector("prepareForReuse");
    private static final MethodHandle MH_prepareForReuse = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_prepareContentInRect_ = ObjC.selector("prepareContentInRect:");
    private static final MethodHandle MH_prepareContentInRect_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_viewDidChangeEffectiveAppearance = ObjC.selector("viewDidChangeEffectiveAppearance");
    private static final MethodHandle MH_viewDidChangeEffectiveAppearance = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_window = ObjC.selector("window");
    private static final MethodHandle MH_window = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_superview = ObjC.selector("superview");
    private static final MethodHandle MH_superview = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_subviews = ObjC.selector("subviews");
    private static final MethodHandle MH_subviews = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSubviews_ = ObjC.selector("setSubviews:");
    private static final MethodHandle MH_setSubviews_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_opaqueAncestor = ObjC.selector("opaqueAncestor");
    private static final MethodHandle MH_opaqueAncestor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isHidden = ObjC.selector("isHidden");
    private static final MethodHandle MH_isHidden = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setHidden_ = ObjC.selector("setHidden:");
    private static final MethodHandle MH_setHidden_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_isHiddenOrHasHiddenAncestor = ObjC.selector("isHiddenOrHasHiddenAncestor");
    private static final MethodHandle MH_isHiddenOrHasHiddenAncestor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_wantsDefaultClipping = ObjC.selector("wantsDefaultClipping");
    private static final MethodHandle MH_wantsDefaultClipping = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_postsFrameChangedNotifications = ObjC.selector("postsFrameChangedNotifications");
    private static final MethodHandle MH_postsFrameChangedNotifications = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPostsFrameChangedNotifications_ = ObjC.selector("setPostsFrameChangedNotifications:");
    private static final MethodHandle MH_setPostsFrameChangedNotifications_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_autoresizesSubviews = ObjC.selector("autoresizesSubviews");
    private static final MethodHandle MH_autoresizesSubviews = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAutoresizesSubviews_ = ObjC.selector("setAutoresizesSubviews:");
    private static final MethodHandle MH_setAutoresizesSubviews_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_autoresizingMask = ObjC.selector("autoresizingMask");
    private static final MethodHandle MH_autoresizingMask = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAutoresizingMask_ = ObjC.selector("setAutoresizingMask:");
    private static final MethodHandle MH_setAutoresizingMask_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_frame = ObjC.selector("frame");
    private static final MethodHandle MH_frame = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFrame_ = ObjC.selector("setFrame:");
    private static final MethodHandle MH_setFrame_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_frameRotation = ObjC.selector("frameRotation");
    private static final MethodHandle MH_frameRotation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFrameRotation_ = ObjC.selector("setFrameRotation:");
    private static final MethodHandle MH_setFrameRotation_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_frameCenterRotation = ObjC.selector("frameCenterRotation");
    private static final MethodHandle MH_frameCenterRotation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFrameCenterRotation_ = ObjC.selector("setFrameCenterRotation:");
    private static final MethodHandle MH_setFrameCenterRotation_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_boundsRotation = ObjC.selector("boundsRotation");
    private static final MethodHandle MH_boundsRotation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBoundsRotation_ = ObjC.selector("setBoundsRotation:");
    private static final MethodHandle MH_setBoundsRotation_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_bounds = ObjC.selector("bounds");
    private static final MethodHandle MH_bounds = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBounds_ = ObjC.selector("setBounds:");
    private static final MethodHandle MH_setBounds_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_isFlipped = ObjC.selector("isFlipped");
    private static final MethodHandle MH_isFlipped = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isRotatedFromBase = ObjC.selector("isRotatedFromBase");
    private static final MethodHandle MH_isRotatedFromBase = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isRotatedOrScaledFromBase = ObjC.selector("isRotatedOrScaledFromBase");
    private static final MethodHandle MH_isRotatedOrScaledFromBase = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isOpaque = ObjC.selector("isOpaque");
    private static final MethodHandle MH_isOpaque = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_canDrawConcurrently = ObjC.selector("canDrawConcurrently");
    private static final MethodHandle MH_canDrawConcurrently = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCanDrawConcurrently_ = ObjC.selector("setCanDrawConcurrently:");
    private static final MethodHandle MH_setCanDrawConcurrently_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_canDraw = ObjC.selector("canDraw");
    private static final MethodHandle MH_canDraw = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_needsDisplay = ObjC.selector("needsDisplay");
    private static final MethodHandle MH_needsDisplay = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setNeedsDisplay_ = ObjC.selector("setNeedsDisplay:");
    private static final MethodHandle MH_setNeedsDisplay_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_CLASS_focusView = ObjC.selector("focusView");
    private static final MethodHandle MH_CLASS_focusView = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_visibleRect = ObjC.selector("visibleRect");
    private static final MethodHandle MH_visibleRect = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tag = ObjC.selector("tag");
    private static final MethodHandle MH_tag = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_needsPanelToBecomeKey = ObjC.selector("needsPanelToBecomeKey");
    private static final MethodHandle MH_needsPanelToBecomeKey = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_mouseDownCanMoveWindow = ObjC.selector("mouseDownCanMoveWindow");
    private static final MethodHandle MH_mouseDownCanMoveWindow = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_acceptsTouchEvents = ObjC.selector("acceptsTouchEvents");
    private static final MethodHandle MH_acceptsTouchEvents = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAcceptsTouchEvents_ = ObjC.selector("setAcceptsTouchEvents:");
    private static final MethodHandle MH_setAcceptsTouchEvents_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_wantsRestingTouches = ObjC.selector("wantsRestingTouches");
    private static final MethodHandle MH_wantsRestingTouches = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setWantsRestingTouches_ = ObjC.selector("setWantsRestingTouches:");
    private static final MethodHandle MH_setWantsRestingTouches_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_layerContentsRedrawPolicy = ObjC.selector("layerContentsRedrawPolicy");
    private static final MethodHandle MH_layerContentsRedrawPolicy = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLayerContentsRedrawPolicy_ = ObjC.selector("setLayerContentsRedrawPolicy:");
    private static final MethodHandle MH_setLayerContentsRedrawPolicy_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_layerContentsPlacement = ObjC.selector("layerContentsPlacement");
    private static final MethodHandle MH_layerContentsPlacement = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLayerContentsPlacement_ = ObjC.selector("setLayerContentsPlacement:");
    private static final MethodHandle MH_setLayerContentsPlacement_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_wantsLayer = ObjC.selector("wantsLayer");
    private static final MethodHandle MH_wantsLayer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setWantsLayer_ = ObjC.selector("setWantsLayer:");
    private static final MethodHandle MH_setWantsLayer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_layer = ObjC.selector("layer");
    private static final MethodHandle MH_layer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLayer_ = ObjC.selector("setLayer:");
    private static final MethodHandle MH_setLayer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_wantsUpdateLayer = ObjC.selector("wantsUpdateLayer");
    private static final MethodHandle MH_wantsUpdateLayer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_canDrawSubviewsIntoLayer = ObjC.selector("canDrawSubviewsIntoLayer");
    private static final MethodHandle MH_canDrawSubviewsIntoLayer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCanDrawSubviewsIntoLayer_ = ObjC.selector("setCanDrawSubviewsIntoLayer:");
    private static final MethodHandle MH_setCanDrawSubviewsIntoLayer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_needsLayout = ObjC.selector("needsLayout");
    private static final MethodHandle MH_needsLayout = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setNeedsLayout_ = ObjC.selector("setNeedsLayout:");
    private static final MethodHandle MH_setNeedsLayout_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_alphaValue = ObjC.selector("alphaValue");
    private static final MethodHandle MH_alphaValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAlphaValue_ = ObjC.selector("setAlphaValue:");
    private static final MethodHandle MH_setAlphaValue_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_layerUsesCoreImageFilters = ObjC.selector("layerUsesCoreImageFilters");
    private static final MethodHandle MH_layerUsesCoreImageFilters = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLayerUsesCoreImageFilters_ = ObjC.selector("setLayerUsesCoreImageFilters:");
    private static final MethodHandle MH_setLayerUsesCoreImageFilters_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_backgroundFilters = ObjC.selector("backgroundFilters");
    private static final MethodHandle MH_backgroundFilters = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBackgroundFilters_ = ObjC.selector("setBackgroundFilters:");
    private static final MethodHandle MH_setBackgroundFilters_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_compositingFilter = ObjC.selector("compositingFilter");
    private static final MethodHandle MH_compositingFilter = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCompositingFilter_ = ObjC.selector("setCompositingFilter:");
    private static final MethodHandle MH_setCompositingFilter_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_contentFilters = ObjC.selector("contentFilters");
    private static final MethodHandle MH_contentFilters = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setContentFilters_ = ObjC.selector("setContentFilters:");
    private static final MethodHandle MH_setContentFilters_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_shadow = ObjC.selector("shadow");
    private static final MethodHandle MH_shadow = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setShadow_ = ObjC.selector("setShadow:");
    private static final MethodHandle MH_setShadow_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_clipsToBounds = ObjC.selector("clipsToBounds");
    private static final MethodHandle MH_clipsToBounds = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setClipsToBounds_ = ObjC.selector("setClipsToBounds:");
    private static final MethodHandle MH_setClipsToBounds_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_postsBoundsChangedNotifications = ObjC.selector("postsBoundsChangedNotifications");
    private static final MethodHandle MH_postsBoundsChangedNotifications = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPostsBoundsChangedNotifications_ = ObjC.selector("setPostsBoundsChangedNotifications:");
    private static final MethodHandle MH_setPostsBoundsChangedNotifications_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_enclosingScrollView = ObjC.selector("enclosingScrollView");
    private static final MethodHandle MH_enclosingScrollView = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_defaultMenu = ObjC.selector("defaultMenu");
    private static final MethodHandle MH_CLASS_defaultMenu = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_toolTip = ObjC.selector("toolTip");
    private static final MethodHandle MH_toolTip = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setToolTip_ = ObjC.selector("setToolTip:");
    private static final MethodHandle MH_setToolTip_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_inLiveResize = ObjC.selector("inLiveResize");
    private static final MethodHandle MH_inLiveResize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_preservesContentDuringLiveResize = ObjC.selector("preservesContentDuringLiveResize");
    private static final MethodHandle MH_preservesContentDuringLiveResize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rectPreservedDuringLiveResize = ObjC.selector("rectPreservedDuringLiveResize");
    private static final MethodHandle MH_rectPreservedDuringLiveResize = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_inputContext = ObjC.selector("inputContext");
    private static final MethodHandle MH_inputContext = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_userInterfaceLayoutDirection = ObjC.selector("userInterfaceLayoutDirection");
    private static final MethodHandle MH_userInterfaceLayoutDirection = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setUserInterfaceLayoutDirection_ = ObjC.selector("setUserInterfaceLayoutDirection:");
    private static final MethodHandle MH_setUserInterfaceLayoutDirection_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_isCompatibleWithResponsiveScrolling = ObjC.selector("isCompatibleWithResponsiveScrolling");
    private static final MethodHandle MH_CLASS_isCompatibleWithResponsiveScrolling = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_preparedContentRect = ObjC.selector("preparedContentRect");
    private static final MethodHandle MH_preparedContentRect = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPreparedContentRect_ = ObjC.selector("setPreparedContentRect:");
    private static final MethodHandle MH_setPreparedContentRect_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_allowsVibrancy = ObjC.selector("allowsVibrancy");
    private static final MethodHandle MH_allowsVibrancy = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setKeyboardFocusRingNeedsDisplayInRect_ = ObjC.selector("setKeyboardFocusRingNeedsDisplayInRect:");
    private static final MethodHandle MH_setKeyboardFocusRingNeedsDisplayInRect_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_drawFocusRingMask = ObjC.selector("drawFocusRingMask");
    private static final MethodHandle MH_drawFocusRingMask = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_noteFocusRingMaskChanged = ObjC.selector("noteFocusRingMaskChanged");
    private static final MethodHandle MH_noteFocusRingMaskChanged = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_nextKeyView = ObjC.selector("nextKeyView");
    private static final MethodHandle MH_nextKeyView = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setNextKeyView_ = ObjC.selector("setNextKeyView:");
    private static final MethodHandle MH_setNextKeyView_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_previousKeyView = ObjC.selector("previousKeyView");
    private static final MethodHandle MH_previousKeyView = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_nextValidKeyView = ObjC.selector("nextValidKeyView");
    private static final MethodHandle MH_nextValidKeyView = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_previousValidKeyView = ObjC.selector("previousValidKeyView");
    private static final MethodHandle MH_previousValidKeyView = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_canBecomeKeyView = ObjC.selector("canBecomeKeyView");
    private static final MethodHandle MH_canBecomeKeyView = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_focusRingType = ObjC.selector("focusRingType");
    private static final MethodHandle MH_focusRingType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFocusRingType_ = ObjC.selector("setFocusRingType:");
    private static final MethodHandle MH_setFocusRingType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_defaultFocusRingType = ObjC.selector("defaultFocusRingType");
    private static final MethodHandle MH_CLASS_defaultFocusRingType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_focusRingMaskBounds = ObjC.selector("focusRingMaskBounds");
    private static final MethodHandle MH_focusRingMaskBounds = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_writeEPSInsideRect_toPasteboard_ = ObjC.selector("writeEPSInsideRect:toPasteboard:");
    private static final MethodHandle MH_writeEPSInsideRect_toPasteboard_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_dataWithEPSInsideRect_ = ObjC.selector("dataWithEPSInsideRect:");
    private static final MethodHandle MH_dataWithEPSInsideRect_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_writePDFInsideRect_toPasteboard_ = ObjC.selector("writePDFInsideRect:toPasteboard:");
    private static final MethodHandle MH_writePDFInsideRect_toPasteboard_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_dataWithPDFInsideRect_ = ObjC.selector("dataWithPDFInsideRect:");
    private static final MethodHandle MH_dataWithPDFInsideRect_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_print_ = ObjC.selector("print:");
    private static final MethodHandle MH_print_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_knowsPageRange_ = ObjC.selector("knowsPageRange:");
    private static final MethodHandle MH_knowsPageRange_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_adjustPageWidthNew_left_right_limit_ = ObjC.selector("adjustPageWidthNew:left:right:limit:");
    private static final MethodHandle MH_adjustPageWidthNew_left_right_limit_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_adjustPageHeightNew_top_bottom_limit_ = ObjC.selector("adjustPageHeightNew:top:bottom:limit:");
    private static final MethodHandle MH_adjustPageHeightNew_top_bottom_limit_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_rectForPage_ = ObjC.selector("rectForPage:");
    private static final MethodHandle MH_rectForPage_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_locationOfPrintRect_ = ObjC.selector("locationOfPrintRect:");
    private static final MethodHandle MH_locationOfPrintRect_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSPoint.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_drawPageBorderWithSize_ = ObjC.selector("drawPageBorderWithSize:");
    private static final MethodHandle MH_drawPageBorderWithSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_drawSheetBorderWithSize_ = ObjC.selector("drawSheetBorderWithSize:");
    private static final MethodHandle MH_drawSheetBorderWithSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_beginDocument = ObjC.selector("beginDocument");
    private static final MethodHandle MH_beginDocument = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_endDocument = ObjC.selector("endDocument");
    private static final MethodHandle MH_endDocument = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_beginPageInRect_atPlacement_ = ObjC.selector("beginPageInRect:atPlacement:");
    private static final MethodHandle MH_beginPageInRect_atPlacement_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_endPage = ObjC.selector("endPage");
    private static final MethodHandle MH_endPage = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_heightAdjustLimit = ObjC.selector("heightAdjustLimit");
    private static final MethodHandle MH_heightAdjustLimit = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_widthAdjustLimit = ObjC.selector("widthAdjustLimit");
    private static final MethodHandle MH_widthAdjustLimit = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pageHeader = ObjC.selector("pageHeader");
    private static final MethodHandle MH_pageHeader = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pageFooter = ObjC.selector("pageFooter");
    private static final MethodHandle MH_pageFooter = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_printJobTitle = ObjC.selector("printJobTitle");
    private static final MethodHandle MH_printJobTitle = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_beginDraggingSessionWithItems_gesture_source_ = ObjC.selector("beginDraggingSessionWithItems:gesture:source:");
    private static final MethodHandle MH_beginDraggingSessionWithItems_gesture_source_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_beginDraggingSessionWithItems_event_source_ = ObjC.selector("beginDraggingSessionWithItems:event:source:");
    private static final MethodHandle MH_beginDraggingSessionWithItems_event_source_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_registerForDraggedTypes_ = ObjC.selector("registerForDraggedTypes:");
    private static final MethodHandle MH_registerForDraggedTypes_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_unregisterDraggedTypes = ObjC.selector("unregisterDraggedTypes");
    private static final MethodHandle MH_unregisterDraggedTypes = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_registeredDraggedTypes = ObjC.selector("registeredDraggedTypes");
    private static final MethodHandle MH_registeredDraggedTypes = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_enterFullScreenMode_withOptions_ = ObjC.selector("enterFullScreenMode:withOptions:");
    private static final MethodHandle MH_enterFullScreenMode_withOptions_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_exitFullScreenModeWithOptions_ = ObjC.selector("exitFullScreenModeWithOptions:");
    private static final MethodHandle MH_exitFullScreenModeWithOptions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isInFullScreenMode = ObjC.selector("isInFullScreenMode");
    private static final MethodHandle MH_isInFullScreenMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_showDefinitionForAttributedString_atPoint_ = ObjC.selector("showDefinitionForAttributedString:atPoint:");
    private static final MethodHandle MH_showDefinitionForAttributedString_atPoint_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_showDefinitionForAttributedString_range_options_baselineOriginProvider_ = ObjC.selector("showDefinitionForAttributedString:range:options:baselineOriginProvider:");
    private static final MethodHandle MH_showDefinitionForAttributedString_range_options_baselineOriginProvider_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isDrawingFindIndicator = ObjC.selector("isDrawingFindIndicator");
    private static final MethodHandle MH_isDrawingFindIndicator = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_addGestureRecognizer_ = ObjC.selector("addGestureRecognizer:");
    private static final MethodHandle MH_addGestureRecognizer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeGestureRecognizer_ = ObjC.selector("removeGestureRecognizer:");
    private static final MethodHandle MH_removeGestureRecognizer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_gestureRecognizers = ObjC.selector("gestureRecognizers");
    private static final MethodHandle MH_gestureRecognizers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setGestureRecognizers_ = ObjC.selector("setGestureRecognizers:");
    private static final MethodHandle MH_setGestureRecognizers_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_exclusiveGestureBehavior = ObjC.selector("exclusiveGestureBehavior");
    private static final MethodHandle MH_exclusiveGestureBehavior = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setExclusiveGestureBehavior_ = ObjC.selector("setExclusiveGestureBehavior:");
    private static final MethodHandle MH_setExclusiveGestureBehavior_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_allowedTouchTypes = ObjC.selector("allowedTouchTypes");
    private static final MethodHandle MH_allowedTouchTypes = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAllowedTouchTypes_ = ObjC.selector("setAllowedTouchTypes:");
    private static final MethodHandle MH_setAllowedTouchTypes_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_safeAreaInsets = ObjC.selector("safeAreaInsets");
    private static final MethodHandle MH_safeAreaInsets = ObjC.msgSendCritical(FunctionDescriptor.of(NSEdgeInsets.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_additionalSafeAreaInsets = ObjC.selector("additionalSafeAreaInsets");
    private static final MethodHandle MH_additionalSafeAreaInsets = ObjC.msgSendCritical(FunctionDescriptor.of(NSEdgeInsets.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAdditionalSafeAreaInsets_ = ObjC.selector("setAdditionalSafeAreaInsets:");
    private static final MethodHandle MH_setAdditionalSafeAreaInsets_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_safeAreaLayoutGuide = ObjC.selector("safeAreaLayoutGuide");
    private static final MethodHandle MH_safeAreaLayoutGuide = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_safeAreaRect = ObjC.selector("safeAreaRect");
    private static final MethodHandle MH_safeAreaRect = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_layoutMarginsGuide = ObjC.selector("layoutMarginsGuide");
    private static final MethodHandle MH_layoutMarginsGuide = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_viewDidChangeEffectiveCornerRadii = ObjC.selector("viewDidChangeEffectiveCornerRadii");
    private static final MethodHandle MH_viewDidChangeEffectiveCornerRadii = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_invalidateCornerConfiguration = ObjC.selector("invalidateCornerConfiguration");
    private static final MethodHandle MH_invalidateCornerConfiguration = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_cornerConfiguration = ObjC.selector("cornerConfiguration");
    private static final MethodHandle MH_cornerConfiguration = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_effectiveCornerRadii = ObjC.selector("effectiveCornerRadii");
    private static final MethodHandle MH_effectiveCornerRadii = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_prefersCompactControlSizeMetrics = ObjC.selector("prefersCompactControlSizeMetrics");
    private static final MethodHandle MH_prefersCompactControlSizeMetrics = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPrefersCompactControlSizeMetrics_ = ObjC.selector("setPrefersCompactControlSizeMetrics:");
    private static final MethodHandle MH_setPrefersCompactControlSizeMetrics_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_addTrackingArea_ = ObjC.selector("addTrackingArea:");
    private static final MethodHandle MH_addTrackingArea_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeTrackingArea_ = ObjC.selector("removeTrackingArea:");
    private static final MethodHandle MH_removeTrackingArea_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_updateTrackingAreas = ObjC.selector("updateTrackingAreas");
    private static final MethodHandle MH_updateTrackingAreas = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_addCursorRect_cursor_ = ObjC.selector("addCursorRect:cursor:");
    private static final MethodHandle MH_addCursorRect_cursor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_removeCursorRect_cursor_ = ObjC.selector("removeCursorRect:cursor:");
    private static final MethodHandle MH_removeCursorRect_cursor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_discardCursorRects = ObjC.selector("discardCursorRects");
    private static final MethodHandle MH_discardCursorRects = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_resetCursorRects = ObjC.selector("resetCursorRects");
    private static final MethodHandle MH_resetCursorRects = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_addTrackingRect_owner_userData_assumeInside_ = ObjC.selector("addTrackingRect:owner:userData:assumeInside:");
    private static final MethodHandle MH_addTrackingRect_owner_userData_assumeInside_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_removeTrackingRect_ = ObjC.selector("removeTrackingRect:");
    private static final MethodHandle MH_removeTrackingRect_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_trackingAreas = ObjC.selector("trackingAreas");
    private static final MethodHandle MH_trackingAreas = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_displayLinkWithTarget_selector_ = ObjC.selector("displayLinkWithTarget:selector:");
    private static final MethodHandle MH_displayLinkWithTarget_selector_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dragImage_at_offset_event_pasteboard_source_slideBack_ = ObjC.selector("dragImage:at:offset:event:pasteboard:source:slideBack:");
    private static final MethodHandle MH_dragImage_at_offset_event_pasteboard_source_slideBack_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_dragFile_fromRect_slideBack_event_ = ObjC.selector("dragFile:fromRect:slideBack:event:");
    private static final MethodHandle MH_dragFile_fromRect_slideBack_event_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_BOOLEAN, JAVA_LONG));
    private static final long SEL_dragPromisedFilesOfTypes_fromRect_source_slideBack_event_ = ObjC.selector("dragPromisedFilesOfTypes:fromRect:source:slideBack:event:");
    private static final MethodHandle MH_dragPromisedFilesOfTypes_fromRect_source_slideBack_event_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG, JAVA_BOOLEAN, JAVA_LONG));
    private static final long SEL_convertPointToBase_ = ObjC.selector("convertPointToBase:");
    private static final MethodHandle MH_convertPointToBase_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSPoint.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertPointFromBase_ = ObjC.selector("convertPointFromBase:");
    private static final MethodHandle MH_convertPointFromBase_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSPoint.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertSizeToBase_ = ObjC.selector("convertSizeToBase:");
    private static final MethodHandle MH_convertSizeToBase_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSSize.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertSizeFromBase_ = ObjC.selector("convertSizeFromBase:");
    private static final MethodHandle MH_convertSizeFromBase_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSSize.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertRectToBase_ = ObjC.selector("convertRectToBase:");
    private static final MethodHandle MH_convertRectToBase_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertRectFromBase_ = ObjC.selector("convertRectFromBase:");
    private static final MethodHandle MH_convertRectFromBase_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_performMnemonic_ = ObjC.selector("performMnemonic:");
    private static final MethodHandle MH_performMnemonic_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_shouldDrawColor = ObjC.selector("shouldDrawColor");
    private static final MethodHandle MH_shouldDrawColor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_gState = ObjC.selector("gState");
    private static final MethodHandle MH_gState = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_allocateGState = ObjC.selector("allocateGState");
    private static final MethodHandle MH_allocateGState = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_releaseGState = ObjC.selector("releaseGState");
    private static final MethodHandle MH_releaseGState = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_setUpGState = ObjC.selector("setUpGState");
    private static final MethodHandle MH_setUpGState = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_renewGState = ObjC.selector("renewGState");
    private static final MethodHandle MH_renewGState = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_writingToolsCoordinator = ObjC.selector("writingToolsCoordinator");
    private static final MethodHandle MH_writingToolsCoordinator = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setWritingToolsCoordinator_ = ObjC.selector("setWritingToolsCoordinator:");
    private static final MethodHandle MH_setWritingToolsCoordinator_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_enclosingMenuItem = ObjC.selector("enclosingMenuItem");
    private static final MethodHandle MH_enclosingMenuItem = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public NSView(final long handle) {
        super(handle);
    }

    /**
     * {@code +[NSView alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static NSView alloc() {
        try {
            return new NSView((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView init]} */
    public NSView init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView initWithFrame:]} */
    public NSView initWithFrame(final NSRect frameRect) {
        try {
            long result = (long) MH_initWithFrame_.invokeExact(this.handle, SEL_initWithFrame_, frameRect.origin().x(), frameRect.origin().y(), frameRect.size().width(), frameRect.size().height());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView initWithCoder:]} */
    @Nullable
    public NSView init(final NSObject coder) {
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

    /** {@code -[NSView isDescendantOf:]} */
    public boolean isDescendantOf(final NSView view) {
        try {
            return (boolean) MH_isDescendantOf_.invokeExact(this.handle, SEL_isDescendantOf_, view.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView ancestorSharedWithView:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSView ancestorShared(final NSView view) {
        try {
            long result = (long) MH_ancestorSharedWithView_.invokeExact(this.handle, SEL_ancestorSharedWithView_, view.handle());
            return result == 0L ? null : new NSView(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView getRectsBeingDrawn:count:]} */
    public void getRectsBeingDrawn(final MemorySegment rects, final MemorySegment count) {
        try {
            MH_getRectsBeingDrawn_count_.invokeExact(this.handle, SEL_getRectsBeingDrawn_count_, rects.address(), count.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView needsToDrawRect:]} */
    public boolean needsToDrawRect(final NSRect rect) {
        try {
            return (boolean) MH_needsToDrawRect_.invokeExact(this.handle, SEL_needsToDrawRect_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView viewDidHide]} */
    public void viewDidHide() {
        try {
            MH_viewDidHide.invokeExact(this.handle, SEL_viewDidHide);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView viewDidUnhide]} */
    public void viewDidUnhide() {
        try {
            MH_viewDidUnhide.invokeExact(this.handle, SEL_viewDidUnhide);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView addSubview:]} */
    public void addSubview(final NSView view) {
        try {
            MH_addSubview_.invokeExact(this.handle, SEL_addSubview_, view.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView addSubview:positioned:relativeTo:]} */
    public void addSubview(final NSView view, final NSWindowOrderingMode place, @Nullable final NSView otherView) {
        try {
            MH_addSubview_positioned_relativeTo_.invokeExact(this.handle, SEL_addSubview_positioned_relativeTo_, view.handle(), place.value, otherView == null ? 0L : otherView.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView sortSubviewsUsingFunction:context:]} */
    public void sortSubviewsUsingFunction(final MemorySegment compare, final MemorySegment context) {
        try {
            MH_sortSubviewsUsingFunction_context_.invokeExact(this.handle, SEL_sortSubviewsUsingFunction_context_, compare.address(), context.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView viewWillMoveToWindow:]} */
    public void viewWillMoveToWindow(@Nullable final NSWindow newWindow) {
        try {
            MH_viewWillMoveToWindow_.invokeExact(this.handle, SEL_viewWillMoveToWindow_, newWindow == null ? 0L : newWindow.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView viewDidMoveToWindow]} */
    public void viewDidMoveToWindow() {
        try {
            MH_viewDidMoveToWindow.invokeExact(this.handle, SEL_viewDidMoveToWindow);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView viewWillMoveToSuperview:]} */
    public void viewWillMoveToSuperview(@Nullable final NSView newSuperview) {
        try {
            MH_viewWillMoveToSuperview_.invokeExact(this.handle, SEL_viewWillMoveToSuperview_, newSuperview == null ? 0L : newSuperview.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView viewDidMoveToSuperview]} */
    public void viewDidMoveToSuperview() {
        try {
            MH_viewDidMoveToSuperview.invokeExact(this.handle, SEL_viewDidMoveToSuperview);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView didAddSubview:]} */
    public void didAddSubview(final NSView subview) {
        try {
            MH_didAddSubview_.invokeExact(this.handle, SEL_didAddSubview_, subview.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView willRemoveSubview:]} */
    public void willRemoveSubview(final NSView subview) {
        try {
            MH_willRemoveSubview_.invokeExact(this.handle, SEL_willRemoveSubview_, subview.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView removeFromSuperview]} */
    public void removeFromSuperview() {
        try {
            MH_removeFromSuperview.invokeExact(this.handle, SEL_removeFromSuperview);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView replaceSubview:with:]} */
    public void replaceSubview(final NSView oldView, final NSView newView) {
        try {
            MH_replaceSubview_with_.invokeExact(this.handle, SEL_replaceSubview_with_, oldView.handle(), newView.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView removeFromSuperviewWithoutNeedingDisplay]} */
    public void removeFromSuperviewWithoutNeedingDisplay() {
        try {
            MH_removeFromSuperviewWithoutNeedingDisplay.invokeExact(this.handle, SEL_removeFromSuperviewWithoutNeedingDisplay);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView viewDidChangeBackingProperties]} */
    public void viewDidChangeBackingProperties() {
        try {
            MH_viewDidChangeBackingProperties.invokeExact(this.handle, SEL_viewDidChangeBackingProperties);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView resizeSubviewsWithOldSize:]} */
    public void resizeSubviews(final NSSize oldSize) {
        try {
            MH_resizeSubviewsWithOldSize_.invokeExact(this.handle, SEL_resizeSubviewsWithOldSize_, oldSize.width(), oldSize.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView resizeWithOldSuperviewSize:]} */
    public void resizeWithOldSuperviewSize(final NSSize oldSize) {
        try {
            MH_resizeWithOldSuperviewSize_.invokeExact(this.handle, SEL_resizeWithOldSuperviewSize_, oldSize.width(), oldSize.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setFrameOrigin:]} */
    public void setFrameOrigin(final NSPoint newOrigin) {
        try {
            MH_setFrameOrigin_.invokeExact(this.handle, SEL_setFrameOrigin_, newOrigin.x(), newOrigin.y());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setFrameSize:]} */
    public void setFrameSize(final NSSize newSize) {
        try {
            MH_setFrameSize_.invokeExact(this.handle, SEL_setFrameSize_, newSize.width(), newSize.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setBoundsOrigin:]} */
    public void setBoundsOrigin(final NSPoint newOrigin) {
        try {
            MH_setBoundsOrigin_.invokeExact(this.handle, SEL_setBoundsOrigin_, newOrigin.x(), newOrigin.y());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setBoundsSize:]} */
    public void setBoundsSize(final NSSize newSize) {
        try {
            MH_setBoundsSize_.invokeExact(this.handle, SEL_setBoundsSize_, newSize.width(), newSize.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView translateOriginToPoint:]} */
    public void translateOriginToPoint(final NSPoint translation) {
        try {
            MH_translateOriginToPoint_.invokeExact(this.handle, SEL_translateOriginToPoint_, translation.x(), translation.y());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView scaleUnitSquareToSize:]} */
    public void scaleUnitSquareToSize(final NSSize newUnitSize) {
        try {
            MH_scaleUnitSquareToSize_.invokeExact(this.handle, SEL_scaleUnitSquareToSize_, newUnitSize.width(), newUnitSize.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView rotateByAngle:]} */
    public void rotateByAngle(final double angle) {
        try {
            MH_rotateByAngle_.invokeExact(this.handle, SEL_rotateByAngle_, angle);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertPoint:fromView:]} */
    public NSPoint convertPointFromView(final NSPoint point, @Nullable final NSView view) {
        try (NativeStack stack = NativeStack.push()) {
            return NSPoint.read((MemorySegment) MH_convertPoint_fromView_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertPoint_fromView_, point.x(), point.y(), view == null ? 0L : view.handle()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertPoint:toView:]} */
    public NSPoint convertPointToView(final NSPoint point, @Nullable final NSView view) {
        try (NativeStack stack = NativeStack.push()) {
            return NSPoint.read((MemorySegment) MH_convertPoint_toView_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertPoint_toView_, point.x(), point.y(), view == null ? 0L : view.handle()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertSize:fromView:]} */
    public NSSize convertSizeFromView(final NSSize size, @Nullable final NSView view) {
        try (NativeStack stack = NativeStack.push()) {
            return NSSize.read((MemorySegment) MH_convertSize_fromView_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertSize_fromView_, size.width(), size.height(), view == null ? 0L : view.handle()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertSize:toView:]} */
    public NSSize convertSizeToView(final NSSize size, @Nullable final NSView view) {
        try (NativeStack stack = NativeStack.push()) {
            return NSSize.read((MemorySegment) MH_convertSize_toView_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertSize_toView_, size.width(), size.height(), view == null ? 0L : view.handle()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertRect:fromView:]} */
    public NSRect convertRectFromView(final NSRect rect, @Nullable final NSView view) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_convertRect_fromView_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertRect_fromView_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height(), view == null ? 0L : view.handle()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertRect:toView:]} */
    public NSRect convertRectToView(final NSRect rect, @Nullable final NSView view) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_convertRect_toView_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertRect_toView_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height(), view == null ? 0L : view.handle()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView backingAlignedRect:options:]}
     *
     * @param options a combination of {@link NSAlignmentOptions} flags
     */
    public NSRect backingAlignedRect(final NSRect rect, final long options) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_backingAlignedRect_options_.invokeExact((SegmentAllocator) stack, this.handle, SEL_backingAlignedRect_options_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height(), options));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView centerScanRect:]} */
    public NSRect centerScanRect(final NSRect rect) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_centerScanRect_.invokeExact((SegmentAllocator) stack, this.handle, SEL_centerScanRect_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertPointToBacking:]} */
    public NSPoint convertPointToBacking(final NSPoint point) {
        try (NativeStack stack = NativeStack.push()) {
            return NSPoint.read((MemorySegment) MH_convertPointToBacking_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertPointToBacking_, point.x(), point.y()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertPointFromBacking:]} */
    public NSPoint convertPointFromBacking(final NSPoint point) {
        try (NativeStack stack = NativeStack.push()) {
            return NSPoint.read((MemorySegment) MH_convertPointFromBacking_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertPointFromBacking_, point.x(), point.y()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertSizeToBacking:]} */
    public NSSize convertSizeToBacking(final NSSize size) {
        try (NativeStack stack = NativeStack.push()) {
            return NSSize.read((MemorySegment) MH_convertSizeToBacking_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertSizeToBacking_, size.width(), size.height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertSizeFromBacking:]} */
    public NSSize convertSizeFromBacking(final NSSize size) {
        try (NativeStack stack = NativeStack.push()) {
            return NSSize.read((MemorySegment) MH_convertSizeFromBacking_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertSizeFromBacking_, size.width(), size.height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertRectToBacking:]} */
    public NSRect convertRectToBacking(final NSRect rect) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_convertRectToBacking_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertRectToBacking_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertRectFromBacking:]} */
    public NSRect convertRectFromBacking(final NSRect rect) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_convertRectFromBacking_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertRectFromBacking_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertPointToLayer:]} */
    public NSPoint convertPointToLayer(final NSPoint point) {
        try (NativeStack stack = NativeStack.push()) {
            return NSPoint.read((MemorySegment) MH_convertPointToLayer_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertPointToLayer_, point.x(), point.y()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertPointFromLayer:]} */
    public NSPoint convertPointFromLayer(final NSPoint point) {
        try (NativeStack stack = NativeStack.push()) {
            return NSPoint.read((MemorySegment) MH_convertPointFromLayer_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertPointFromLayer_, point.x(), point.y()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertSizeToLayer:]} */
    public NSSize convertSizeToLayer(final NSSize size) {
        try (NativeStack stack = NativeStack.push()) {
            return NSSize.read((MemorySegment) MH_convertSizeToLayer_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertSizeToLayer_, size.width(), size.height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertSizeFromLayer:]} */
    public NSSize convertSizeFromLayer(final NSSize size) {
        try (NativeStack stack = NativeStack.push()) {
            return NSSize.read((MemorySegment) MH_convertSizeFromLayer_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertSizeFromLayer_, size.width(), size.height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertRectToLayer:]} */
    public NSRect convertRectToLayer(final NSRect rect) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_convertRectToLayer_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertRectToLayer_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertRectFromLayer:]} */
    public NSRect convertRectFromLayer(final NSRect rect) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_convertRectFromLayer_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertRectFromLayer_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setNeedsDisplayInRect:]} */
    public void setNeedsDisplayInRect(final NSRect invalidRect) {
        try {
            MH_setNeedsDisplayInRect_.invokeExact(this.handle, SEL_setNeedsDisplayInRect_, invalidRect.origin().x(), invalidRect.origin().y(), invalidRect.size().width(), invalidRect.size().height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView lockFocus]} */
    public void lockFocus() {
        try {
            MH_lockFocus.invokeExact(this.handle, SEL_lockFocus);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView unlockFocus]} */
    public void unlockFocus() {
        try {
            MH_unlockFocus.invokeExact(this.handle, SEL_unlockFocus);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView lockFocusIfCanDraw]} */
    public boolean lockFocusIfCanDraw() {
        try {
            return (boolean) MH_lockFocusIfCanDraw.invokeExact(this.handle, SEL_lockFocusIfCanDraw);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView lockFocusIfCanDrawInContext:]} */
    public boolean lockFocusIfCanDrawInContext(final NSObject context) {
        try {
            return (boolean) MH_lockFocusIfCanDrawInContext_.invokeExact(this.handle, SEL_lockFocusIfCanDrawInContext_, context.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView display]} */
    public void display() {
        try {
            MH_display.invokeExact(this.handle, SEL_display);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView displayIfNeeded]} */
    public void displayIfNeeded() {
        try {
            MH_displayIfNeeded.invokeExact(this.handle, SEL_displayIfNeeded);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView displayIfNeededIgnoringOpacity]} */
    public void displayIfNeededIgnoringOpacity() {
        try {
            MH_displayIfNeededIgnoringOpacity.invokeExact(this.handle, SEL_displayIfNeededIgnoringOpacity);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView displayRect:]} */
    public void displayRect(final NSRect rect) {
        try {
            MH_displayRect_.invokeExact(this.handle, SEL_displayRect_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView displayIfNeededInRect:]} */
    public void displayIfNeededInRect(final NSRect rect) {
        try {
            MH_displayIfNeededInRect_.invokeExact(this.handle, SEL_displayIfNeededInRect_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView displayRectIgnoringOpacity:]} */
    public void displayRectIgnoringOpacity(final NSRect rect) {
        try {
            MH_displayRectIgnoringOpacity_.invokeExact(this.handle, SEL_displayRectIgnoringOpacity_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView displayIfNeededInRectIgnoringOpacity:]} */
    public void displayIfNeededInRectIgnoringOpacity(final NSRect rect) {
        try {
            MH_displayIfNeededInRectIgnoringOpacity_.invokeExact(this.handle, SEL_displayIfNeededInRectIgnoringOpacity_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView drawRect:]} */
    public void drawRect(final NSRect dirtyRect) {
        try {
            MH_drawRect_.invokeExact(this.handle, SEL_drawRect_, dirtyRect.origin().x(), dirtyRect.origin().y(), dirtyRect.size().width(), dirtyRect.size().height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView displayRectIgnoringOpacity:inContext:]} */
    public void displayRectIgnoringOpacity(final NSRect rect, final NSObject context) {
        try {
            MH_displayRectIgnoringOpacity_inContext_.invokeExact(this.handle, SEL_displayRectIgnoringOpacity_inContext_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height(), context.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView bitmapImageRepForCachingDisplayInRect:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject bitmapImageRepForCachingDisplayInRect(final NSRect rect) {
        try {
            long result = (long) MH_bitmapImageRepForCachingDisplayInRect_.invokeExact(this.handle, SEL_bitmapImageRepForCachingDisplayInRect_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height());
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView cacheDisplayInRect:toBitmapImageRep:]} */
    public void cacheDisplayInRect(final NSRect rect, final NSObject bitmapImageRep) {
        try {
            MH_cacheDisplayInRect_toBitmapImageRep_.invokeExact(this.handle, SEL_cacheDisplayInRect_toBitmapImageRep_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height(), bitmapImageRep.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView viewWillDraw]} */
    public void viewWillDraw() {
        try {
            MH_viewWillDraw.invokeExact(this.handle, SEL_viewWillDraw);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView scrollPoint:]} */
    public void scrollPoint(final NSPoint point) {
        try {
            MH_scrollPoint_.invokeExact(this.handle, SEL_scrollPoint_, point.x(), point.y());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView scrollRectToVisible:]} */
    public boolean scrollRectToVisible(final NSRect rect) {
        try {
            return (boolean) MH_scrollRectToVisible_.invokeExact(this.handle, SEL_scrollRectToVisible_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView autoscroll:]} */
    public boolean autoscroll(final NSObject event) {
        try {
            return (boolean) MH_autoscroll_.invokeExact(this.handle, SEL_autoscroll_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView adjustScroll:]} */
    public NSRect adjustScroll(final NSRect newVisible) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_adjustScroll_.invokeExact((SegmentAllocator) stack, this.handle, SEL_adjustScroll_, newVisible.origin().x(), newVisible.origin().y(), newVisible.size().width(), newVisible.size().height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView scrollRect:by:]} */
    public void scrollRect(final NSRect rect, final NSSize delta) {
        try {
            MH_scrollRect_by_.invokeExact(this.handle, SEL_scrollRect_by_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height(), delta.width(), delta.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView translateRectsNeedingDisplayInRect:by:]} */
    public void translateRectsNeedingDisplayInRect(final NSRect clipRect, final NSSize delta) {
        try {
            MH_translateRectsNeedingDisplayInRect_by_.invokeExact(this.handle, SEL_translateRectsNeedingDisplayInRect_by_, clipRect.origin().x(), clipRect.origin().y(), clipRect.size().width(), clipRect.size().height(), delta.width(), delta.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView hitTest:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSView hitTest(final NSPoint point) {
        try {
            long result = (long) MH_hitTest_.invokeExact(this.handle, SEL_hitTest_, point.x(), point.y());
            return result == 0L ? null : new NSView(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView mouse:inRect:]} */
    public boolean mouse(final NSPoint point, final NSRect rect) {
        try {
            return (boolean) MH_mouse_inRect_.invokeExact(this.handle, SEL_mouse_inRect_, point.x(), point.y(), rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView viewWithTag:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSView view(final long tag) {
        try {
            long result = (long) MH_viewWithTag_.invokeExact(this.handle, SEL_viewWithTag_, tag);
            return result == 0L ? null : new NSView(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView performKeyEquivalent:]} */
    public boolean performKeyEquivalent(final NSObject event) {
        try {
            return (boolean) MH_performKeyEquivalent_.invokeExact(this.handle, SEL_performKeyEquivalent_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView acceptsFirstMouse:]} */
    public boolean acceptsFirstMouse(@Nullable final NSObject event) {
        try {
            return (boolean) MH_acceptsFirstMouse_.invokeExact(this.handle, SEL_acceptsFirstMouse_, event == null ? 0L : event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView shouldDelayWindowOrderingForEvent:]} */
    public boolean shouldDelayWindowOrderingForEvent(final NSObject event) {
        try {
            return (boolean) MH_shouldDelayWindowOrderingForEvent_.invokeExact(this.handle, SEL_shouldDelayWindowOrderingForEvent_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView makeBackingLayer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public CALayer makeBackingLayer() {
        try {
            long result = (long) MH_makeBackingLayer.invokeExact(this.handle, SEL_makeBackingLayer);
            return new CALayer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView updateLayer]} */
    public void updateLayer() {
        try {
            MH_updateLayer.invokeExact(this.handle, SEL_updateLayer);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView layoutSubtreeIfNeeded]} */
    public void layoutSubtreeIfNeeded() {
        try {
            MH_layoutSubtreeIfNeeded.invokeExact(this.handle, SEL_layoutSubtreeIfNeeded);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView layout]} */
    public void layout() {
        try {
            MH_layout.invokeExact(this.handle, SEL_layout);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView menuForEvent:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject menuForEvent(final NSObject event) {
        try {
            long result = (long) MH_menuForEvent_.invokeExact(this.handle, SEL_menuForEvent_, event.handle());
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView willOpenMenu:withEvent:]} */
    public void willOpenMenu(final NSObject menu, final NSObject event) {
        try {
            MH_willOpenMenu_withEvent_.invokeExact(this.handle, SEL_willOpenMenu_withEvent_, menu.handle(), event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView didCloseMenu:withEvent:]} */
    public void didCloseMenu(final NSObject menu, @Nullable final NSObject event) {
        try {
            MH_didCloseMenu_withEvent_.invokeExact(this.handle, SEL_didCloseMenu_withEvent_, menu.handle(), event == null ? 0L : event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView addToolTipRect:owner:userData:]} */
    public long addToolTipRect(final NSRect rect, final NSObject owner, final MemorySegment data) {
        try {
            return (long) MH_addToolTipRect_owner_userData_.invokeExact(this.handle, SEL_addToolTipRect_owner_userData_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height(), owner.handle(), data.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView removeToolTip:]} */
    public void removeToolTip(final long tag) {
        try {
            MH_removeToolTip_.invokeExact(this.handle, SEL_removeToolTip_, tag);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView removeAllToolTips]} */
    public void removeAllToolTips() {
        try {
            MH_removeAllToolTips.invokeExact(this.handle, SEL_removeAllToolTips);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView viewWillStartLiveResize]} */
    public void viewWillStartLiveResize() {
        try {
            MH_viewWillStartLiveResize.invokeExact(this.handle, SEL_viewWillStartLiveResize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView viewDidEndLiveResize]} */
    public void viewDidEndLiveResize() {
        try {
            MH_viewDidEndLiveResize.invokeExact(this.handle, SEL_viewDidEndLiveResize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView getRectsExposedDuringLiveResize:count:]} */
    public void getRectsExposedDuringLiveResize(final MemorySegment exposedRects, final MemorySegment count) {
        try {
            MH_getRectsExposedDuringLiveResize_count_.invokeExact(this.handle, SEL_getRectsExposedDuringLiveResize_count_, exposedRects.address(), count.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView rectForSmartMagnificationAtPoint:inRect:]} */
    public NSRect rectForSmartMagnificationAtPoint(final NSPoint location, final NSRect visibleRect) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_rectForSmartMagnificationAtPoint_inRect_.invokeExact((SegmentAllocator) stack, this.handle, SEL_rectForSmartMagnificationAtPoint_inRect_, location.x(), location.y(), visibleRect.origin().x(), visibleRect.origin().y(), visibleRect.size().width(), visibleRect.size().height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView prepareForReuse]} */
    public void prepareForReuse() {
        try {
            MH_prepareForReuse.invokeExact(this.handle, SEL_prepareForReuse);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView prepareContentInRect:]} */
    public void prepareContentInRect(final NSRect rect) {
        try {
            MH_prepareContentInRect_.invokeExact(this.handle, SEL_prepareContentInRect_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView viewDidChangeEffectiveAppearance]} */
    public void viewDidChangeEffectiveAppearance() {
        try {
            MH_viewDidChangeEffectiveAppearance.invokeExact(this.handle, SEL_viewDidChangeEffectiveAppearance);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView window]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSWindow window() {
        try {
            long result = (long) MH_window.invokeExact(this.handle, SEL_window);
            return result == 0L ? null : new NSWindow(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView superview]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSView superview() {
        try {
            long result = (long) MH_superview.invokeExact(this.handle, SEL_superview);
            return result == 0L ? null : new NSView(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView subviews]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<NSView> subviews() {
        try {
            long result = (long) MH_subviews.invokeExact(this.handle, SEL_subviews);
            return new NSArray<>(result, NSView::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setSubviews:]} */
    public void setSubviews(final NSArray<NSView> subviews) {
        try {
            MH_setSubviews_.invokeExact(this.handle, SEL_setSubviews_, subviews.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView opaqueAncestor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSView opaqueAncestor() {
        try {
            long result = (long) MH_opaqueAncestor.invokeExact(this.handle, SEL_opaqueAncestor);
            return result == 0L ? null : new NSView(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView isHidden]} */
    public boolean isHidden() {
        try {
            return (boolean) MH_isHidden.invokeExact(this.handle, SEL_isHidden);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setHidden:]} */
    public void setHidden(final boolean hidden) {
        try {
            MH_setHidden_.invokeExact(this.handle, SEL_setHidden_, hidden);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView isHiddenOrHasHiddenAncestor]} */
    public boolean isHiddenOrHasHiddenAncestor() {
        try {
            return (boolean) MH_isHiddenOrHasHiddenAncestor.invokeExact(this.handle, SEL_isHiddenOrHasHiddenAncestor);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView wantsDefaultClipping]} */
    public boolean wantsDefaultClipping() {
        try {
            return (boolean) MH_wantsDefaultClipping.invokeExact(this.handle, SEL_wantsDefaultClipping);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView postsFrameChangedNotifications]} */
    public boolean postsFrameChangedNotifications() {
        try {
            return (boolean) MH_postsFrameChangedNotifications.invokeExact(this.handle, SEL_postsFrameChangedNotifications);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setPostsFrameChangedNotifications:]} */
    public void setPostsFrameChangedNotifications(final boolean postsFrameChangedNotifications) {
        try {
            MH_setPostsFrameChangedNotifications_.invokeExact(this.handle, SEL_setPostsFrameChangedNotifications_, postsFrameChangedNotifications);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView autoresizesSubviews]} */
    public boolean autoresizesSubviews() {
        try {
            return (boolean) MH_autoresizesSubviews.invokeExact(this.handle, SEL_autoresizesSubviews);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setAutoresizesSubviews:]} */
    public void setAutoresizesSubviews(final boolean autoresizesSubviews) {
        try {
            MH_setAutoresizesSubviews_.invokeExact(this.handle, SEL_setAutoresizesSubviews_, autoresizesSubviews);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView autoresizingMask]}
     *
     * @return a combination of {@link NSAutoresizingMaskOptions} flags
     */
    public long autoresizingMask() {
        try {
            return (long) MH_autoresizingMask.invokeExact(this.handle, SEL_autoresizingMask);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView setAutoresizingMask:]}
     *
     * @param autoresizingMask a combination of {@link NSAutoresizingMaskOptions} flags
     */
    public void setAutoresizingMask(final long autoresizingMask) {
        try {
            MH_setAutoresizingMask_.invokeExact(this.handle, SEL_setAutoresizingMask_, autoresizingMask);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView frame]} */
    public NSRect frame() {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_frame.invokeExact((SegmentAllocator) stack, this.handle, SEL_frame));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setFrame:]} */
    public void setFrame(final NSRect frame) {
        try {
            MH_setFrame_.invokeExact(this.handle, SEL_setFrame_, frame.origin().x(), frame.origin().y(), frame.size().width(), frame.size().height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView frameRotation]} */
    public double frameRotation() {
        try {
            return (double) MH_frameRotation.invokeExact(this.handle, SEL_frameRotation);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setFrameRotation:]} */
    public void setFrameRotation(final double frameRotation) {
        try {
            MH_setFrameRotation_.invokeExact(this.handle, SEL_setFrameRotation_, frameRotation);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView frameCenterRotation]} */
    public double frameCenterRotation() {
        try {
            return (double) MH_frameCenterRotation.invokeExact(this.handle, SEL_frameCenterRotation);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setFrameCenterRotation:]} */
    public void setFrameCenterRotation(final double frameCenterRotation) {
        try {
            MH_setFrameCenterRotation_.invokeExact(this.handle, SEL_setFrameCenterRotation_, frameCenterRotation);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView boundsRotation]} */
    public double boundsRotation() {
        try {
            return (double) MH_boundsRotation.invokeExact(this.handle, SEL_boundsRotation);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setBoundsRotation:]} */
    public void setBoundsRotation(final double boundsRotation) {
        try {
            MH_setBoundsRotation_.invokeExact(this.handle, SEL_setBoundsRotation_, boundsRotation);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView bounds]} */
    public NSRect bounds() {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_bounds.invokeExact((SegmentAllocator) stack, this.handle, SEL_bounds));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setBounds:]} */
    public void setBounds(final NSRect bounds) {
        try {
            MH_setBounds_.invokeExact(this.handle, SEL_setBounds_, bounds.origin().x(), bounds.origin().y(), bounds.size().width(), bounds.size().height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView isFlipped]} */
    public boolean isFlipped() {
        try {
            return (boolean) MH_isFlipped.invokeExact(this.handle, SEL_isFlipped);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView isRotatedFromBase]} */
    public boolean isRotatedFromBase() {
        try {
            return (boolean) MH_isRotatedFromBase.invokeExact(this.handle, SEL_isRotatedFromBase);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView isRotatedOrScaledFromBase]} */
    public boolean isRotatedOrScaledFromBase() {
        try {
            return (boolean) MH_isRotatedOrScaledFromBase.invokeExact(this.handle, SEL_isRotatedOrScaledFromBase);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView isOpaque]} */
    public boolean isOpaque() {
        try {
            return (boolean) MH_isOpaque.invokeExact(this.handle, SEL_isOpaque);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView canDrawConcurrently]} */
    public boolean canDrawConcurrently() {
        try {
            return (boolean) MH_canDrawConcurrently.invokeExact(this.handle, SEL_canDrawConcurrently);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setCanDrawConcurrently:]} */
    public void setCanDrawConcurrently(final boolean canDrawConcurrently) {
        try {
            MH_setCanDrawConcurrently_.invokeExact(this.handle, SEL_setCanDrawConcurrently_, canDrawConcurrently);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView canDraw]} */
    public boolean canDraw() {
        try {
            return (boolean) MH_canDraw.invokeExact(this.handle, SEL_canDraw);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView needsDisplay]} */
    public boolean needsDisplay() {
        try {
            return (boolean) MH_needsDisplay.invokeExact(this.handle, SEL_needsDisplay);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setNeedsDisplay:]} */
    public void setNeedsDisplay(final boolean needsDisplay) {
        try {
            MH_setNeedsDisplay_.invokeExact(this.handle, SEL_setNeedsDisplay_, needsDisplay);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSView focusView]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static NSView focusView() {
        try {
            long result = (long) MH_CLASS_focusView.invokeExact(CLS, SEL_CLASS_focusView);
            return result == 0L ? null : new NSView(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView visibleRect]} */
    public NSRect visibleRect() {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_visibleRect.invokeExact((SegmentAllocator) stack, this.handle, SEL_visibleRect));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView tag]} */
    public long tag() {
        try {
            return (long) MH_tag.invokeExact(this.handle, SEL_tag);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView needsPanelToBecomeKey]} */
    public boolean needsPanelToBecomeKey() {
        try {
            return (boolean) MH_needsPanelToBecomeKey.invokeExact(this.handle, SEL_needsPanelToBecomeKey);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView mouseDownCanMoveWindow]} */
    public boolean mouseDownCanMoveWindow() {
        try {
            return (boolean) MH_mouseDownCanMoveWindow.invokeExact(this.handle, SEL_mouseDownCanMoveWindow);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView acceptsTouchEvents]} */
    public boolean acceptsTouchEvents() {
        try {
            return (boolean) MH_acceptsTouchEvents.invokeExact(this.handle, SEL_acceptsTouchEvents);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setAcceptsTouchEvents:]} */
    public void setAcceptsTouchEvents(final boolean acceptsTouchEvents) {
        try {
            MH_setAcceptsTouchEvents_.invokeExact(this.handle, SEL_setAcceptsTouchEvents_, acceptsTouchEvents);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView wantsRestingTouches]} */
    public boolean wantsRestingTouches() {
        try {
            return (boolean) MH_wantsRestingTouches.invokeExact(this.handle, SEL_wantsRestingTouches);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setWantsRestingTouches:]} */
    public void setWantsRestingTouches(final boolean wantsRestingTouches) {
        try {
            MH_setWantsRestingTouches_.invokeExact(this.handle, SEL_setWantsRestingTouches_, wantsRestingTouches);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView layerContentsRedrawPolicy]} */
    public NSViewLayerContentsRedrawPolicy layerContentsRedrawPolicy() {
        try {
            return NSViewLayerContentsRedrawPolicy.of((long) MH_layerContentsRedrawPolicy.invokeExact(this.handle, SEL_layerContentsRedrawPolicy));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setLayerContentsRedrawPolicy:]} */
    public void setLayerContentsRedrawPolicy(final NSViewLayerContentsRedrawPolicy layerContentsRedrawPolicy) {
        try {
            MH_setLayerContentsRedrawPolicy_.invokeExact(this.handle, SEL_setLayerContentsRedrawPolicy_, layerContentsRedrawPolicy.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView layerContentsPlacement]} */
    public NSViewLayerContentsPlacement layerContentsPlacement() {
        try {
            return NSViewLayerContentsPlacement.of((long) MH_layerContentsPlacement.invokeExact(this.handle, SEL_layerContentsPlacement));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setLayerContentsPlacement:]} */
    public void setLayerContentsPlacement(final NSViewLayerContentsPlacement layerContentsPlacement) {
        try {
            MH_setLayerContentsPlacement_.invokeExact(this.handle, SEL_setLayerContentsPlacement_, layerContentsPlacement.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView wantsLayer]} */
    public boolean wantsLayer() {
        try {
            return (boolean) MH_wantsLayer.invokeExact(this.handle, SEL_wantsLayer);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setWantsLayer:]} */
    public void setWantsLayer(final boolean wantsLayer) {
        try {
            MH_setWantsLayer_.invokeExact(this.handle, SEL_setWantsLayer_, wantsLayer);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView layer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public CALayer layer() {
        try {
            long result = (long) MH_layer.invokeExact(this.handle, SEL_layer);
            return result == 0L ? null : new CALayer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setLayer:]} */
    public void setLayer(@Nullable final CALayer layer) {
        try {
            MH_setLayer_.invokeExact(this.handle, SEL_setLayer_, layer == null ? 0L : layer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView wantsUpdateLayer]} */
    public boolean wantsUpdateLayer() {
        try {
            return (boolean) MH_wantsUpdateLayer.invokeExact(this.handle, SEL_wantsUpdateLayer);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView canDrawSubviewsIntoLayer]} */
    public boolean canDrawSubviewsIntoLayer() {
        try {
            return (boolean) MH_canDrawSubviewsIntoLayer.invokeExact(this.handle, SEL_canDrawSubviewsIntoLayer);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setCanDrawSubviewsIntoLayer:]} */
    public void setCanDrawSubviewsIntoLayer(final boolean canDrawSubviewsIntoLayer) {
        try {
            MH_setCanDrawSubviewsIntoLayer_.invokeExact(this.handle, SEL_setCanDrawSubviewsIntoLayer_, canDrawSubviewsIntoLayer);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView needsLayout]} */
    public boolean needsLayout() {
        try {
            return (boolean) MH_needsLayout.invokeExact(this.handle, SEL_needsLayout);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setNeedsLayout:]} */
    public void setNeedsLayout(final boolean needsLayout) {
        try {
            MH_setNeedsLayout_.invokeExact(this.handle, SEL_setNeedsLayout_, needsLayout);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView alphaValue]} */
    public double alphaValue() {
        try {
            return (double) MH_alphaValue.invokeExact(this.handle, SEL_alphaValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setAlphaValue:]} */
    public void setAlphaValue(final double alphaValue) {
        try {
            MH_setAlphaValue_.invokeExact(this.handle, SEL_setAlphaValue_, alphaValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView layerUsesCoreImageFilters]} */
    public boolean layerUsesCoreImageFilters() {
        try {
            return (boolean) MH_layerUsesCoreImageFilters.invokeExact(this.handle, SEL_layerUsesCoreImageFilters);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setLayerUsesCoreImageFilters:]} */
    public void setLayerUsesCoreImageFilters(final boolean layerUsesCoreImageFilters) {
        try {
            MH_setLayerUsesCoreImageFilters_.invokeExact(this.handle, SEL_setLayerUsesCoreImageFilters_, layerUsesCoreImageFilters);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView backgroundFilters]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<NSObject> backgroundFilters() {
        try {
            long result = (long) MH_backgroundFilters.invokeExact(this.handle, SEL_backgroundFilters);
            return result == 0L ? null : new NSArray<>(result, NSObject::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setBackgroundFilters:]} */
    public void setBackgroundFilters(@Nullable final NSArray<NSObject> backgroundFilters) {
        try {
            MH_setBackgroundFilters_.invokeExact(this.handle, SEL_setBackgroundFilters_, backgroundFilters == null ? 0L : backgroundFilters.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView compositingFilter]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject compositingFilter() {
        try {
            long result = (long) MH_compositingFilter.invokeExact(this.handle, SEL_compositingFilter);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setCompositingFilter:]} */
    public void setCompositingFilter(@Nullable final NSObject compositingFilter) {
        try {
            MH_setCompositingFilter_.invokeExact(this.handle, SEL_setCompositingFilter_, compositingFilter == null ? 0L : compositingFilter.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView contentFilters]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<NSObject> contentFilters() {
        try {
            long result = (long) MH_contentFilters.invokeExact(this.handle, SEL_contentFilters);
            return result == 0L ? null : new NSArray<>(result, NSObject::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setContentFilters:]} */
    public void setContentFilters(@Nullable final NSArray<NSObject> contentFilters) {
        try {
            MH_setContentFilters_.invokeExact(this.handle, SEL_setContentFilters_, contentFilters == null ? 0L : contentFilters.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView shadow]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject shadow() {
        try {
            long result = (long) MH_shadow.invokeExact(this.handle, SEL_shadow);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setShadow:]} */
    public void setShadow(@Nullable final NSObject shadow) {
        try {
            MH_setShadow_.invokeExact(this.handle, SEL_setShadow_, shadow == null ? 0L : shadow.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView clipsToBounds]} */
    public boolean clipsToBounds() {
        try {
            return (boolean) MH_clipsToBounds.invokeExact(this.handle, SEL_clipsToBounds);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setClipsToBounds:]} */
    public void setClipsToBounds(final boolean clipsToBounds) {
        try {
            MH_setClipsToBounds_.invokeExact(this.handle, SEL_setClipsToBounds_, clipsToBounds);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView postsBoundsChangedNotifications]} */
    public boolean postsBoundsChangedNotifications() {
        try {
            return (boolean) MH_postsBoundsChangedNotifications.invokeExact(this.handle, SEL_postsBoundsChangedNotifications);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setPostsBoundsChangedNotifications:]} */
    public void setPostsBoundsChangedNotifications(final boolean postsBoundsChangedNotifications) {
        try {
            MH_setPostsBoundsChangedNotifications_.invokeExact(this.handle, SEL_setPostsBoundsChangedNotifications_, postsBoundsChangedNotifications);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView enclosingScrollView]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject enclosingScrollView() {
        try {
            long result = (long) MH_enclosingScrollView.invokeExact(this.handle, SEL_enclosingScrollView);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSView defaultMenu]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static NSObject defaultMenu() {
        try {
            long result = (long) MH_CLASS_defaultMenu.invokeExact(CLS, SEL_CLASS_defaultMenu);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView toolTip]} */
    @Nullable
    public String toolTip() {
        try {
            long result = (long) MH_toolTip.invokeExact(this.handle, SEL_toolTip);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setToolTip:]} */
    public void setToolTip(@Nullable final String toolTip) {
        final long nsToolTip = toolTip == null ? 0L : ObjC.nsString(toolTip);
        try {
            MH_setToolTip_.invokeExact(this.handle, SEL_setToolTip_, nsToolTip);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsToolTip);
        }
    }

    /** {@code -[NSView inLiveResize]} */
    public boolean inLiveResize() {
        try {
            return (boolean) MH_inLiveResize.invokeExact(this.handle, SEL_inLiveResize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView preservesContentDuringLiveResize]} */
    public boolean preservesContentDuringLiveResize() {
        try {
            return (boolean) MH_preservesContentDuringLiveResize.invokeExact(this.handle, SEL_preservesContentDuringLiveResize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView rectPreservedDuringLiveResize]} */
    public NSRect rectPreservedDuringLiveResize() {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_rectPreservedDuringLiveResize.invokeExact((SegmentAllocator) stack, this.handle, SEL_rectPreservedDuringLiveResize));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView inputContext]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject inputContext() {
        try {
            long result = (long) MH_inputContext.invokeExact(this.handle, SEL_inputContext);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView userInterfaceLayoutDirection]} */
    public NSUserInterfaceLayoutDirection userInterfaceLayoutDirection() {
        try {
            return NSUserInterfaceLayoutDirection.of((long) MH_userInterfaceLayoutDirection.invokeExact(this.handle, SEL_userInterfaceLayoutDirection));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setUserInterfaceLayoutDirection:]} */
    public void setUserInterfaceLayoutDirection(final NSUserInterfaceLayoutDirection userInterfaceLayoutDirection) {
        try {
            MH_setUserInterfaceLayoutDirection_.invokeExact(this.handle, SEL_setUserInterfaceLayoutDirection_, userInterfaceLayoutDirection.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSView isCompatibleWithResponsiveScrolling]} */
    public static boolean isCompatibleWithResponsiveScrolling() {
        try {
            return (boolean) MH_CLASS_isCompatibleWithResponsiveScrolling.invokeExact(CLS, SEL_CLASS_isCompatibleWithResponsiveScrolling);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView preparedContentRect]} */
    public NSRect preparedContentRect() {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_preparedContentRect.invokeExact((SegmentAllocator) stack, this.handle, SEL_preparedContentRect));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setPreparedContentRect:]} */
    public void setPreparedContentRect(final NSRect preparedContentRect) {
        try {
            MH_setPreparedContentRect_.invokeExact(this.handle, SEL_setPreparedContentRect_, preparedContentRect.origin().x(), preparedContentRect.origin().y(), preparedContentRect.size().width(), preparedContentRect.size().height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView allowsVibrancy]} */
    public boolean allowsVibrancy() {
        try {
            return (boolean) MH_allowsVibrancy.invokeExact(this.handle, SEL_allowsVibrancy);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setKeyboardFocusRingNeedsDisplayInRect:]} */
    public void setKeyboardFocusRingNeedsDisplayInRect(final NSRect rect) {
        try {
            MH_setKeyboardFocusRingNeedsDisplayInRect_.invokeExact(this.handle, SEL_setKeyboardFocusRingNeedsDisplayInRect_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView drawFocusRingMask]} */
    public void drawFocusRingMask() {
        try {
            MH_drawFocusRingMask.invokeExact(this.handle, SEL_drawFocusRingMask);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView noteFocusRingMaskChanged]} */
    public void noteFocusRingMaskChanged() {
        try {
            MH_noteFocusRingMaskChanged.invokeExact(this.handle, SEL_noteFocusRingMaskChanged);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView nextKeyView]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSView nextKeyView() {
        try {
            long result = (long) MH_nextKeyView.invokeExact(this.handle, SEL_nextKeyView);
            return result == 0L ? null : new NSView(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setNextKeyView:]} */
    public void setNextKeyView(@Nullable final NSView nextKeyView) {
        try {
            MH_setNextKeyView_.invokeExact(this.handle, SEL_setNextKeyView_, nextKeyView == null ? 0L : nextKeyView.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView previousKeyView]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSView previousKeyView() {
        try {
            long result = (long) MH_previousKeyView.invokeExact(this.handle, SEL_previousKeyView);
            return result == 0L ? null : new NSView(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView nextValidKeyView]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSView nextValidKeyView() {
        try {
            long result = (long) MH_nextValidKeyView.invokeExact(this.handle, SEL_nextValidKeyView);
            return result == 0L ? null : new NSView(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView previousValidKeyView]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSView previousValidKeyView() {
        try {
            long result = (long) MH_previousValidKeyView.invokeExact(this.handle, SEL_previousValidKeyView);
            return result == 0L ? null : new NSView(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView canBecomeKeyView]} */
    public boolean canBecomeKeyView() {
        try {
            return (boolean) MH_canBecomeKeyView.invokeExact(this.handle, SEL_canBecomeKeyView);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView focusRingType]} */
    public NSFocusRingType focusRingType() {
        try {
            return NSFocusRingType.of((long) MH_focusRingType.invokeExact(this.handle, SEL_focusRingType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setFocusRingType:]} */
    public void setFocusRingType(final NSFocusRingType focusRingType) {
        try {
            MH_setFocusRingType_.invokeExact(this.handle, SEL_setFocusRingType_, focusRingType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSView defaultFocusRingType]} */
    public static NSFocusRingType defaultFocusRingType() {
        try {
            return NSFocusRingType.of((long) MH_CLASS_defaultFocusRingType.invokeExact(CLS, SEL_CLASS_defaultFocusRingType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView focusRingMaskBounds]} */
    public NSRect focusRingMaskBounds() {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_focusRingMaskBounds.invokeExact((SegmentAllocator) stack, this.handle, SEL_focusRingMaskBounds));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView writeEPSInsideRect:toPasteboard:]} */
    public void writeEPSInsideRect(final NSRect rect, final NSObject pasteboard) {
        try {
            MH_writeEPSInsideRect_toPasteboard_.invokeExact(this.handle, SEL_writeEPSInsideRect_toPasteboard_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height(), pasteboard.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView dataWithEPSInsideRect:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSData dataWithEPSInsideRect(final NSRect rect) {
        try {
            long result = (long) MH_dataWithEPSInsideRect_.invokeExact(this.handle, SEL_dataWithEPSInsideRect_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height());
            return new NSData(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView writePDFInsideRect:toPasteboard:]} */
    public void writePDFInsideRect(final NSRect rect, final NSObject pasteboard) {
        try {
            MH_writePDFInsideRect_toPasteboard_.invokeExact(this.handle, SEL_writePDFInsideRect_toPasteboard_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height(), pasteboard.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView dataWithPDFInsideRect:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSData dataWithPDFInsideRect(final NSRect rect) {
        try {
            long result = (long) MH_dataWithPDFInsideRect_.invokeExact(this.handle, SEL_dataWithPDFInsideRect_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height());
            return new NSData(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView print:]} */
    public void print(@Nullable final NSObject sender) {
        try {
            MH_print_.invokeExact(this.handle, SEL_print_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView knowsPageRange:]} */
    public boolean knowsPageRange(final MemorySegment range) {
        try {
            return (boolean) MH_knowsPageRange_.invokeExact(this.handle, SEL_knowsPageRange_, range.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView adjustPageWidthNew:left:right:limit:]} */
    public void adjustPageWidthNew(final MemorySegment newRight, final double oldLeft, final double oldRight, final double rightLimit) {
        try {
            MH_adjustPageWidthNew_left_right_limit_.invokeExact(this.handle, SEL_adjustPageWidthNew_left_right_limit_, newRight.address(), oldLeft, oldRight, rightLimit);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView adjustPageHeightNew:top:bottom:limit:]} */
    public void adjustPageHeightNew(final MemorySegment newBottom, final double oldTop, final double oldBottom, final double bottomLimit) {
        try {
            MH_adjustPageHeightNew_top_bottom_limit_.invokeExact(this.handle, SEL_adjustPageHeightNew_top_bottom_limit_, newBottom.address(), oldTop, oldBottom, bottomLimit);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView rectForPage:]} */
    public NSRect rectForPage(final long page) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_rectForPage_.invokeExact((SegmentAllocator) stack, this.handle, SEL_rectForPage_, page));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView locationOfPrintRect:]} */
    public NSPoint locationOfPrintRect(final NSRect rect) {
        try (NativeStack stack = NativeStack.push()) {
            return NSPoint.read((MemorySegment) MH_locationOfPrintRect_.invokeExact((SegmentAllocator) stack, this.handle, SEL_locationOfPrintRect_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView drawPageBorderWithSize:]} */
    public void drawPageBorder(final NSSize borderSize) {
        try {
            MH_drawPageBorderWithSize_.invokeExact(this.handle, SEL_drawPageBorderWithSize_, borderSize.width(), borderSize.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView drawSheetBorderWithSize:]} */
    public void drawSheetBorder(final NSSize borderSize) {
        try {
            MH_drawSheetBorderWithSize_.invokeExact(this.handle, SEL_drawSheetBorderWithSize_, borderSize.width(), borderSize.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView beginDocument]} */
    public void beginDocument() {
        try {
            MH_beginDocument.invokeExact(this.handle, SEL_beginDocument);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView endDocument]} */
    public void endDocument() {
        try {
            MH_endDocument.invokeExact(this.handle, SEL_endDocument);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView beginPageInRect:atPlacement:]} */
    public void beginPageInRect(final NSRect rect, final NSPoint location) {
        try {
            MH_beginPageInRect_atPlacement_.invokeExact(this.handle, SEL_beginPageInRect_atPlacement_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height(), location.x(), location.y());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView endPage]} */
    public void endPage() {
        try {
            MH_endPage.invokeExact(this.handle, SEL_endPage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView heightAdjustLimit]} */
    public double heightAdjustLimit() {
        try {
            return (double) MH_heightAdjustLimit.invokeExact(this.handle, SEL_heightAdjustLimit);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView widthAdjustLimit]} */
    public double widthAdjustLimit() {
        try {
            return (double) MH_widthAdjustLimit.invokeExact(this.handle, SEL_widthAdjustLimit);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView pageHeader]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSObject pageHeader() {
        try {
            long result = (long) MH_pageHeader.invokeExact(this.handle, SEL_pageHeader);
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView pageFooter]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSObject pageFooter() {
        try {
            long result = (long) MH_pageFooter.invokeExact(this.handle, SEL_pageFooter);
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView printJobTitle]} */
    public String printJobTitle() {
        try {
            long result = (long) MH_printJobTitle.invokeExact(this.handle, SEL_printJobTitle);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView beginDraggingSessionWithItems:gesture:source:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject beginDraggingSessionWithItemsGestureSource(final NSArray<NSObject> items, final NSObject gesture, final NSObject source) {
        try {
            long result = (long) MH_beginDraggingSessionWithItems_gesture_source_.invokeExact(this.handle, SEL_beginDraggingSessionWithItems_gesture_source_, items.handle(), gesture.handle(), source.handle());
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView beginDraggingSessionWithItems:event:source:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSObject beginDraggingSessionWithItemsEventSource(final NSArray<NSObject> items, final NSObject event, final NSObject source) {
        try {
            long result = (long) MH_beginDraggingSessionWithItems_event_source_.invokeExact(this.handle, SEL_beginDraggingSessionWithItems_event_source_, items.handle(), event.handle(), source.handle());
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView registerForDraggedTypes:]} */
    public void registerForDraggedTypes(final NSArray<NSObject> newTypes) {
        try {
            MH_registerForDraggedTypes_.invokeExact(this.handle, SEL_registerForDraggedTypes_, newTypes.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView unregisterDraggedTypes]} */
    public void unregisterDraggedTypes() {
        try {
            MH_unregisterDraggedTypes.invokeExact(this.handle, SEL_unregisterDraggedTypes);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView registeredDraggedTypes]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<NSObject> registeredDraggedTypes() {
        try {
            long result = (long) MH_registeredDraggedTypes.invokeExact(this.handle, SEL_registeredDraggedTypes);
            return new NSArray<>(result, NSObject::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView enterFullScreenMode:withOptions:]} */
    public boolean enterFullScreenMode(final NSObject screen, @Nullable final NSDictionary<NSObject, NSObject> options) {
        try {
            return (boolean) MH_enterFullScreenMode_withOptions_.invokeExact(this.handle, SEL_enterFullScreenMode_withOptions_, screen.handle(), options == null ? 0L : options.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView exitFullScreenModeWithOptions:]} */
    public void exitFullScreenMode(@Nullable final NSDictionary<NSObject, NSObject> options) {
        try {
            MH_exitFullScreenModeWithOptions_.invokeExact(this.handle, SEL_exitFullScreenModeWithOptions_, options == null ? 0L : options.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView isInFullScreenMode]} */
    public boolean isInFullScreenMode() {
        try {
            return (boolean) MH_isInFullScreenMode.invokeExact(this.handle, SEL_isInFullScreenMode);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView showDefinitionForAttributedString:atPoint:]} */
    public void showDefinitionForAttributedString(@Nullable final NSObject attrString, final NSPoint textBaselineOrigin) {
        try {
            MH_showDefinitionForAttributedString_atPoint_.invokeExact(this.handle, SEL_showDefinitionForAttributedString_atPoint_, attrString == null ? 0L : attrString.handle(), textBaselineOrigin.x(), textBaselineOrigin.y());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView showDefinitionForAttributedString:range:options:baselineOriginProvider:]} */
    public void showDefinitionForAttributedString(@Nullable final NSObject attrString, final NSRange targetRange, @Nullable final NSDictionary<NSObject, NSObject> options, final long originProvider) {
        try {
            MH_showDefinitionForAttributedString_range_options_baselineOriginProvider_.invokeExact(this.handle, SEL_showDefinitionForAttributedString_range_options_baselineOriginProvider_, attrString == null ? 0L : attrString.handle(), targetRange.location(), targetRange.length(), options == null ? 0L : options.handle(), originProvider);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView isDrawingFindIndicator]} */
    public boolean isDrawingFindIndicator() {
        try {
            return (boolean) MH_isDrawingFindIndicator.invokeExact(this.handle, SEL_isDrawingFindIndicator);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView addGestureRecognizer:]} */
    public void addGestureRecognizer(final NSObject gestureRecognizer) {
        try {
            MH_addGestureRecognizer_.invokeExact(this.handle, SEL_addGestureRecognizer_, gestureRecognizer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView removeGestureRecognizer:]} */
    public void removeGestureRecognizer(final NSObject gestureRecognizer) {
        try {
            MH_removeGestureRecognizer_.invokeExact(this.handle, SEL_removeGestureRecognizer_, gestureRecognizer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView gestureRecognizers]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<NSObject> gestureRecognizers() {
        try {
            long result = (long) MH_gestureRecognizers.invokeExact(this.handle, SEL_gestureRecognizers);
            return result == 0L ? null : new NSArray<>(result, NSObject::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setGestureRecognizers:]} */
    public void setGestureRecognizers(@Nullable final NSArray<NSObject> gestureRecognizers) {
        try {
            MH_setGestureRecognizers_.invokeExact(this.handle, SEL_setGestureRecognizers_, gestureRecognizers == null ? 0L : gestureRecognizers.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView exclusiveGestureBehavior]} */
    public NSViewExclusiveGestureBehavior exclusiveGestureBehavior() {
        try {
            return NSViewExclusiveGestureBehavior.of((long) MH_exclusiveGestureBehavior.invokeExact(this.handle, SEL_exclusiveGestureBehavior));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setExclusiveGestureBehavior:]} */
    public void setExclusiveGestureBehavior(final NSViewExclusiveGestureBehavior exclusiveGestureBehavior) {
        try {
            MH_setExclusiveGestureBehavior_.invokeExact(this.handle, SEL_setExclusiveGestureBehavior_, exclusiveGestureBehavior.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView allowedTouchTypes]}
     *
     * @return a combination of {@link NSTouchTypeMask} flags
     */
    public long allowedTouchTypes() {
        try {
            return (long) MH_allowedTouchTypes.invokeExact(this.handle, SEL_allowedTouchTypes);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView setAllowedTouchTypes:]}
     *
     * @param allowedTouchTypes a combination of {@link NSTouchTypeMask} flags
     */
    public void setAllowedTouchTypes(final long allowedTouchTypes) {
        try {
            MH_setAllowedTouchTypes_.invokeExact(this.handle, SEL_setAllowedTouchTypes_, allowedTouchTypes);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView safeAreaInsets]} */
    public NSEdgeInsets safeAreaInsets() {
        try (NativeStack stack = NativeStack.push()) {
            return NSEdgeInsets.read((MemorySegment) MH_safeAreaInsets.invokeExact((SegmentAllocator) stack, this.handle, SEL_safeAreaInsets));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView additionalSafeAreaInsets]} */
    public NSEdgeInsets additionalSafeAreaInsets() {
        try (NativeStack stack = NativeStack.push()) {
            return NSEdgeInsets.read((MemorySegment) MH_additionalSafeAreaInsets.invokeExact((SegmentAllocator) stack, this.handle, SEL_additionalSafeAreaInsets));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setAdditionalSafeAreaInsets:]} */
    public void setAdditionalSafeAreaInsets(final NSEdgeInsets additionalSafeAreaInsets) {
        try {
            MH_setAdditionalSafeAreaInsets_.invokeExact(this.handle, SEL_setAdditionalSafeAreaInsets_, additionalSafeAreaInsets.top(), additionalSafeAreaInsets.left(), additionalSafeAreaInsets.bottom(), additionalSafeAreaInsets.right());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView safeAreaLayoutGuide]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject safeAreaLayoutGuide() {
        try {
            long result = (long) MH_safeAreaLayoutGuide.invokeExact(this.handle, SEL_safeAreaLayoutGuide);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView safeAreaRect]} */
    public NSRect safeAreaRect() {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_safeAreaRect.invokeExact((SegmentAllocator) stack, this.handle, SEL_safeAreaRect));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView layoutMarginsGuide]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject layoutMarginsGuide() {
        try {
            long result = (long) MH_layoutMarginsGuide.invokeExact(this.handle, SEL_layoutMarginsGuide);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView viewDidChangeEffectiveCornerRadii]} */
    public void viewDidChangeEffectiveCornerRadii() {
        try {
            MH_viewDidChangeEffectiveCornerRadii.invokeExact(this.handle, SEL_viewDidChangeEffectiveCornerRadii);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView invalidateCornerConfiguration]} */
    public void invalidateCornerConfiguration() {
        try {
            MH_invalidateCornerConfiguration.invokeExact(this.handle, SEL_invalidateCornerConfiguration);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView cornerConfiguration]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject cornerConfiguration() {
        try {
            long result = (long) MH_cornerConfiguration.invokeExact(this.handle, SEL_cornerConfiguration);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView effectiveCornerRadii]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject effectiveCornerRadii() {
        try {
            long result = (long) MH_effectiveCornerRadii.invokeExact(this.handle, SEL_effectiveCornerRadii);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView prefersCompactControlSizeMetrics]} */
    public boolean prefersCompactControlSizeMetrics() {
        try {
            return (boolean) MH_prefersCompactControlSizeMetrics.invokeExact(this.handle, SEL_prefersCompactControlSizeMetrics);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setPrefersCompactControlSizeMetrics:]} */
    public void setPrefersCompactControlSizeMetrics(final boolean prefersCompactControlSizeMetrics) {
        try {
            MH_setPrefersCompactControlSizeMetrics_.invokeExact(this.handle, SEL_setPrefersCompactControlSizeMetrics_, prefersCompactControlSizeMetrics);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView addTrackingArea:]} */
    public void addTrackingArea(final NSObject trackingArea) {
        try {
            MH_addTrackingArea_.invokeExact(this.handle, SEL_addTrackingArea_, trackingArea.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView removeTrackingArea:]} */
    public void removeTrackingArea(final NSObject trackingArea) {
        try {
            MH_removeTrackingArea_.invokeExact(this.handle, SEL_removeTrackingArea_, trackingArea.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView updateTrackingAreas]} */
    public void updateTrackingAreas() {
        try {
            MH_updateTrackingAreas.invokeExact(this.handle, SEL_updateTrackingAreas);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView addCursorRect:cursor:]} */
    public void addCursorRect(final NSRect rect, final NSObject object) {
        try {
            MH_addCursorRect_cursor_.invokeExact(this.handle, SEL_addCursorRect_cursor_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height(), object.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView removeCursorRect:cursor:]} */
    public void removeCursorRect(final NSRect rect, final NSObject object) {
        try {
            MH_removeCursorRect_cursor_.invokeExact(this.handle, SEL_removeCursorRect_cursor_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height(), object.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView discardCursorRects]} */
    public void discardCursorRects() {
        try {
            MH_discardCursorRects.invokeExact(this.handle, SEL_discardCursorRects);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView resetCursorRects]} */
    public void resetCursorRects() {
        try {
            MH_resetCursorRects.invokeExact(this.handle, SEL_resetCursorRects);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView addTrackingRect:owner:userData:assumeInside:]} */
    public long addTrackingRect(final NSRect rect, final NSObject owner, final MemorySegment data, final boolean flag) {
        try {
            return (long) MH_addTrackingRect_owner_userData_assumeInside_.invokeExact(this.handle, SEL_addTrackingRect_owner_userData_assumeInside_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height(), owner.handle(), data.address(), flag);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView removeTrackingRect:]} */
    public void removeTrackingRect(final long tag) {
        try {
            MH_removeTrackingRect_.invokeExact(this.handle, SEL_removeTrackingRect_, tag);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView trackingAreas]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<NSObject> trackingAreas() {
        try {
            long result = (long) MH_trackingAreas.invokeExact(this.handle, SEL_trackingAreas);
            return result == 0L ? null : new NSArray<>(result, NSObject::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView displayLinkWithTarget:selector:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSObject displayLink(final NSObject target, final long selector) {
        try {
            long result = (long) MH_displayLinkWithTarget_selector_.invokeExact(this.handle, SEL_displayLinkWithTarget_selector_, target.handle(), selector);
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView dragImage:at:offset:event:pasteboard:source:slideBack:]} */
    public void dragImage(final NSObject image, final NSPoint viewLocation, final NSSize initialOffset, final NSObject event, final NSObject pboard, final NSObject sourceObj, final boolean slideFlag) {
        try {
            MH_dragImage_at_offset_event_pasteboard_source_slideBack_.invokeExact(this.handle, SEL_dragImage_at_offset_event_pasteboard_source_slideBack_, image.handle(), viewLocation.x(), viewLocation.y(), initialOffset.width(), initialOffset.height(), event.handle(), pboard.handle(), sourceObj.handle(), slideFlag);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView dragFile:fromRect:slideBack:event:]} */
    public boolean dragFile(final String filename, final NSRect rect, final boolean flag, final NSObject event) {
        final long nsFilename = ObjC.nsString(filename);
        try {
            return (boolean) MH_dragFile_fromRect_slideBack_event_.invokeExact(this.handle, SEL_dragFile_fromRect_slideBack_event_, nsFilename, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height(), flag, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsFilename);
        }
    }

    /** {@code -[NSView dragPromisedFilesOfTypes:fromRect:source:slideBack:event:]} */
    public boolean dragPromisedFilesOfTypes(final NSArray<NSString> typeArray, final NSRect rect, final NSObject sourceObject, final boolean flag, final NSObject event) {
        try {
            return (boolean) MH_dragPromisedFilesOfTypes_fromRect_source_slideBack_event_.invokeExact(this.handle, SEL_dragPromisedFilesOfTypes_fromRect_source_slideBack_event_, typeArray.handle(), rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height(), sourceObject.handle(), flag, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertPointToBase:]} */
    public NSPoint convertPointToBase(final NSPoint point) {
        try (NativeStack stack = NativeStack.push()) {
            return NSPoint.read((MemorySegment) MH_convertPointToBase_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertPointToBase_, point.x(), point.y()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertPointFromBase:]} */
    public NSPoint convertPointFromBase(final NSPoint point) {
        try (NativeStack stack = NativeStack.push()) {
            return NSPoint.read((MemorySegment) MH_convertPointFromBase_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertPointFromBase_, point.x(), point.y()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertSizeToBase:]} */
    public NSSize convertSizeToBase(final NSSize size) {
        try (NativeStack stack = NativeStack.push()) {
            return NSSize.read((MemorySegment) MH_convertSizeToBase_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertSizeToBase_, size.width(), size.height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertSizeFromBase:]} */
    public NSSize convertSizeFromBase(final NSSize size) {
        try (NativeStack stack = NativeStack.push()) {
            return NSSize.read((MemorySegment) MH_convertSizeFromBase_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertSizeFromBase_, size.width(), size.height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertRectToBase:]} */
    public NSRect convertRectToBase(final NSRect rect) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_convertRectToBase_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertRectToBase_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView convertRectFromBase:]} */
    public NSRect convertRectFromBase(final NSRect rect) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_convertRectFromBase_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertRectFromBase_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView performMnemonic:]} */
    public boolean performMnemonic(final String string) {
        final long nsString = ObjC.nsString(string);
        try {
            return (boolean) MH_performMnemonic_.invokeExact(this.handle, SEL_performMnemonic_, nsString);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsString);
        }
    }

    /** {@code -[NSView shouldDrawColor]} */
    public boolean shouldDrawColor() {
        try {
            return (boolean) MH_shouldDrawColor.invokeExact(this.handle, SEL_shouldDrawColor);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView gState]} */
    public long gState() {
        try {
            return (long) MH_gState.invokeExact(this.handle, SEL_gState);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView allocateGState]} */
    public void allocateGState() {
        try {
            MH_allocateGState.invokeExact(this.handle, SEL_allocateGState);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView releaseGState]} */
    public void releaseGState() {
        try {
            MH_releaseGState.invokeExact(this.handle, SEL_releaseGState);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setUpGState]} */
    public void setUpGState() {
        try {
            MH_setUpGState.invokeExact(this.handle, SEL_setUpGState);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView renewGState]} */
    public void renewGState() {
        try {
            MH_renewGState.invokeExact(this.handle, SEL_renewGState);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView writingToolsCoordinator]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject writingToolsCoordinator() {
        try {
            long result = (long) MH_writingToolsCoordinator.invokeExact(this.handle, SEL_writingToolsCoordinator);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSView setWritingToolsCoordinator:]} */
    public void setWritingToolsCoordinator(@Nullable final NSObject writingToolsCoordinator) {
        try {
            MH_setWritingToolsCoordinator_.invokeExact(this.handle, SEL_setWritingToolsCoordinator_, writingToolsCoordinator == null ? 0L : writingToolsCoordinator.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSView enclosingMenuItem]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject enclosingMenuItem() {
        try {
            long result = (long) MH_enclosingMenuItem.invokeExact(this.handle, SEL_enclosingMenuItem);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
