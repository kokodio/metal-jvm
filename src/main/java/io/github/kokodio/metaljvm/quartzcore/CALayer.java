package io.github.kokodio.metaljvm.quartzcore;

import io.github.kokodio.metaljvm.coregraphics.CGAffineTransform;
import io.github.kokodio.metaljvm.coregraphics.CGPoint;
import io.github.kokodio.metaljvm.coregraphics.CGRect;
import io.github.kokodio.metaljvm.coregraphics.CGSize;
import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSDictionary;
import io.github.kokodio.metaljvm.foundation.NSObject;
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
import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code CALayer}
 *
 * @see <a href="https://developer.apple.com/documentation/quartzcore/calayer">Apple documentation</a>
 */
public class CALayer extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("QuartzCore");
    private static final long CLS = ObjC.clazz("CALayer");
    private static final long SEL_CLASS_layer = ObjC.selector("layer");
    private static final MethodHandle MH_CLASS_layer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");
    private static final MethodHandle MH_init = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithLayer_ = ObjC.selector("initWithLayer:");
    private static final MethodHandle MH_initWithLayer_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_presentationLayer = ObjC.selector("presentationLayer");
    private static final MethodHandle MH_presentationLayer = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_modelLayer = ObjC.selector("modelLayer");
    private static final MethodHandle MH_modelLayer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_defaultValueForKey_ = ObjC.selector("defaultValueForKey:");
    private static final MethodHandle MH_CLASS_defaultValueForKey_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_needsDisplayForKey_ = ObjC.selector("needsDisplayForKey:");
    private static final MethodHandle MH_CLASS_needsDisplayForKey_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_shouldArchiveValueForKey_ = ObjC.selector("shouldArchiveValueForKey:");
    private static final MethodHandle MH_shouldArchiveValueForKey_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_affineTransform = ObjC.selector("affineTransform");
    private static final MethodHandle MH_affineTransform = ObjC.msgSendCritical(FunctionDescriptor.of(CGAffineTransform.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAffineTransform_ = ObjC.selector("setAffineTransform:");
    private static final MethodHandle MH_setAffineTransform_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_contentsAreFlipped = ObjC.selector("contentsAreFlipped");
    private static final MethodHandle MH_contentsAreFlipped = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeFromSuperlayer = ObjC.selector("removeFromSuperlayer");
    private static final MethodHandle MH_removeFromSuperlayer = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_addSublayer_ = ObjC.selector("addSublayer:");
    private static final MethodHandle MH_addSublayer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_insertSublayer_atIndex_ = ObjC.selector("insertSublayer:atIndex:");
    private static final MethodHandle MH_insertSublayer_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_INT));
    private static final long SEL_insertSublayer_below_ = ObjC.selector("insertSublayer:below:");
    private static final MethodHandle MH_insertSublayer_below_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_insertSublayer_above_ = ObjC.selector("insertSublayer:above:");
    private static final MethodHandle MH_insertSublayer_above_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_replaceSublayer_with_ = ObjC.selector("replaceSublayer:with:");
    private static final MethodHandle MH_replaceSublayer_with_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_convertPoint_fromLayer_ = ObjC.selector("convertPoint:fromLayer:");
    private static final MethodHandle MH_convertPoint_fromLayer_ = ObjC.msgSendCritical(FunctionDescriptor.of(CGPoint.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_convertPoint_toLayer_ = ObjC.selector("convertPoint:toLayer:");
    private static final MethodHandle MH_convertPoint_toLayer_ = ObjC.msgSendCritical(FunctionDescriptor.of(CGPoint.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_convertRect_fromLayer_ = ObjC.selector("convertRect:fromLayer:");
    private static final MethodHandle MH_convertRect_fromLayer_ = ObjC.msgSendCritical(FunctionDescriptor.of(CGRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_convertRect_toLayer_ = ObjC.selector("convertRect:toLayer:");
    private static final MethodHandle MH_convertRect_toLayer_ = ObjC.msgSendCritical(FunctionDescriptor.of(CGRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_convertTime_fromLayer_ = ObjC.selector("convertTime:fromLayer:");
    private static final MethodHandle MH_convertTime_fromLayer_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_convertTime_toLayer_ = ObjC.selector("convertTime:toLayer:");
    private static final MethodHandle MH_convertTime_toLayer_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_hitTest_ = ObjC.selector("hitTest:");
    private static final MethodHandle MH_hitTest_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_containsPoint_ = ObjC.selector("containsPoint:");
    private static final MethodHandle MH_containsPoint_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_display = ObjC.selector("display");
    private static final MethodHandle MH_display = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_setNeedsDisplay = ObjC.selector("setNeedsDisplay");
    private static final MethodHandle MH_setNeedsDisplay = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_setNeedsDisplayInRect_ = ObjC.selector("setNeedsDisplayInRect:");
    private static final MethodHandle MH_setNeedsDisplayInRect_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_needsDisplay = ObjC.selector("needsDisplay");
    private static final MethodHandle MH_needsDisplay = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_displayIfNeeded = ObjC.selector("displayIfNeeded");
    private static final MethodHandle MH_displayIfNeeded = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_drawInContext_ = ObjC.selector("drawInContext:");
    private static final MethodHandle MH_drawInContext_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_renderInContext_ = ObjC.selector("renderInContext:");
    private static final MethodHandle MH_renderInContext_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_cornerCurveExpansionFactor_ = ObjC.selector("cornerCurveExpansionFactor:");
    private static final MethodHandle MH_CLASS_cornerCurveExpansionFactor_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_preferredFrameSize = ObjC.selector("preferredFrameSize");
    private static final MethodHandle MH_preferredFrameSize = ObjC.msgSendCritical(FunctionDescriptor.of(CGSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setNeedsLayout = ObjC.selector("setNeedsLayout");
    private static final MethodHandle MH_setNeedsLayout = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_needsLayout = ObjC.selector("needsLayout");
    private static final MethodHandle MH_needsLayout = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_layoutIfNeeded = ObjC.selector("layoutIfNeeded");
    private static final MethodHandle MH_layoutIfNeeded = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_layoutSublayers = ObjC.selector("layoutSublayers");
    private static final MethodHandle MH_layoutSublayers = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_resizeSublayersWithOldSize_ = ObjC.selector("resizeSublayersWithOldSize:");
    private static final MethodHandle MH_resizeSublayersWithOldSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_resizeWithOldSuperlayerSize_ = ObjC.selector("resizeWithOldSuperlayerSize:");
    private static final MethodHandle MH_resizeWithOldSuperlayerSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_CLASS_defaultActionForKey_ = ObjC.selector("defaultActionForKey:");
    private static final MethodHandle MH_CLASS_defaultActionForKey_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_actionForKey_ = ObjC.selector("actionForKey:");
    private static final MethodHandle MH_actionForKey_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_addAnimation_forKey_ = ObjC.selector("addAnimation:forKey:");
    private static final MethodHandle MH_addAnimation_forKey_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeAllAnimations = ObjC.selector("removeAllAnimations");
    private static final MethodHandle MH_removeAllAnimations = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeAnimationForKey_ = ObjC.selector("removeAnimationForKey:");
    private static final MethodHandle MH_removeAnimationForKey_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_animationKeys = ObjC.selector("animationKeys");
    private static final MethodHandle MH_animationKeys = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_animationForKey_ = ObjC.selector("animationForKey:");
    private static final MethodHandle MH_animationForKey_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bounds = ObjC.selector("bounds");
    private static final MethodHandle MH_bounds = ObjC.msgSendCritical(FunctionDescriptor.of(CGRect.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBounds_ = ObjC.selector("setBounds:");
    private static final MethodHandle MH_setBounds_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_position = ObjC.selector("position");
    private static final MethodHandle MH_position = ObjC.msgSendCritical(FunctionDescriptor.of(CGPoint.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPosition_ = ObjC.selector("setPosition:");
    private static final MethodHandle MH_setPosition_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_zPosition = ObjC.selector("zPosition");
    private static final MethodHandle MH_zPosition = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setZPosition_ = ObjC.selector("setZPosition:");
    private static final MethodHandle MH_setZPosition_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_anchorPoint = ObjC.selector("anchorPoint");
    private static final MethodHandle MH_anchorPoint = ObjC.msgSendCritical(FunctionDescriptor.of(CGPoint.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAnchorPoint_ = ObjC.selector("setAnchorPoint:");
    private static final MethodHandle MH_setAnchorPoint_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_anchorPointZ = ObjC.selector("anchorPointZ");
    private static final MethodHandle MH_anchorPointZ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAnchorPointZ_ = ObjC.selector("setAnchorPointZ:");
    private static final MethodHandle MH_setAnchorPointZ_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_transform = ObjC.selector("transform");
    private static final MethodHandle MH_transform = ObjC.msgSendCritical(FunctionDescriptor.of(CATransform3D.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTransform_ = ObjC.selector("setTransform:");
    private static final MethodHandle MH_setTransform_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_frame = ObjC.selector("frame");
    private static final MethodHandle MH_frame = ObjC.msgSendCritical(FunctionDescriptor.of(CGRect.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFrame_ = ObjC.selector("setFrame:");
    private static final MethodHandle MH_setFrame_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_isHidden = ObjC.selector("isHidden");
    private static final MethodHandle MH_isHidden = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setHidden_ = ObjC.selector("setHidden:");
    private static final MethodHandle MH_setHidden_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_isDoubleSided = ObjC.selector("isDoubleSided");
    private static final MethodHandle MH_isDoubleSided = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDoubleSided_ = ObjC.selector("setDoubleSided:");
    private static final MethodHandle MH_setDoubleSided_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_isGeometryFlipped = ObjC.selector("isGeometryFlipped");
    private static final MethodHandle MH_isGeometryFlipped = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setGeometryFlipped_ = ObjC.selector("setGeometryFlipped:");
    private static final MethodHandle MH_setGeometryFlipped_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_superlayer = ObjC.selector("superlayer");
    private static final MethodHandle MH_superlayer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sublayers = ObjC.selector("sublayers");
    private static final MethodHandle MH_sublayers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSublayers_ = ObjC.selector("setSublayers:");
    private static final MethodHandle MH_setSublayers_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sublayerTransform = ObjC.selector("sublayerTransform");
    private static final MethodHandle MH_sublayerTransform = ObjC.msgSendCritical(FunctionDescriptor.of(CATransform3D.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSublayerTransform_ = ObjC.selector("setSublayerTransform:");
    private static final MethodHandle MH_setSublayerTransform_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_mask = ObjC.selector("mask");
    private static final MethodHandle MH_mask = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMask_ = ObjC.selector("setMask:");
    private static final MethodHandle MH_setMask_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_masksToBounds = ObjC.selector("masksToBounds");
    private static final MethodHandle MH_masksToBounds = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMasksToBounds_ = ObjC.selector("setMasksToBounds:");
    private static final MethodHandle MH_setMasksToBounds_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_contents = ObjC.selector("contents");
    private static final MethodHandle MH_contents = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setContents_ = ObjC.selector("setContents:");
    private static final MethodHandle MH_setContents_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_contentsRect = ObjC.selector("contentsRect");
    private static final MethodHandle MH_contentsRect = ObjC.msgSendCritical(FunctionDescriptor.of(CGRect.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setContentsRect_ = ObjC.selector("setContentsRect:");
    private static final MethodHandle MH_setContentsRect_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_contentsGravity = ObjC.selector("contentsGravity");
    private static final MethodHandle MH_contentsGravity = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setContentsGravity_ = ObjC.selector("setContentsGravity:");
    private static final MethodHandle MH_setContentsGravity_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_contentsScale = ObjC.selector("contentsScale");
    private static final MethodHandle MH_contentsScale = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setContentsScale_ = ObjC.selector("setContentsScale:");
    private static final MethodHandle MH_setContentsScale_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_contentsCenter = ObjC.selector("contentsCenter");
    private static final MethodHandle MH_contentsCenter = ObjC.msgSendCritical(FunctionDescriptor.of(CGRect.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setContentsCenter_ = ObjC.selector("setContentsCenter:");
    private static final MethodHandle MH_setContentsCenter_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_contentsFormat = ObjC.selector("contentsFormat");
    private static final MethodHandle MH_contentsFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setContentsFormat_ = ObjC.selector("setContentsFormat:");
    private static final MethodHandle MH_setContentsFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_wantsExtendedDynamicRangeContent = ObjC.selector("wantsExtendedDynamicRangeContent");
    private static final MethodHandle MH_wantsExtendedDynamicRangeContent = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setWantsExtendedDynamicRangeContent_ = ObjC.selector("setWantsExtendedDynamicRangeContent:");
    private static final MethodHandle MH_setWantsExtendedDynamicRangeContent_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_toneMapMode = ObjC.selector("toneMapMode");
    private static final MethodHandle MH_toneMapMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setToneMapMode_ = ObjC.selector("setToneMapMode:");
    private static final MethodHandle MH_setToneMapMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_preferredDynamicRange = ObjC.selector("preferredDynamicRange");
    private static final MethodHandle MH_preferredDynamicRange = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPreferredDynamicRange_ = ObjC.selector("setPreferredDynamicRange:");
    private static final MethodHandle MH_setPreferredDynamicRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_contentsHeadroom = ObjC.selector("contentsHeadroom");
    private static final MethodHandle MH_contentsHeadroom = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setContentsHeadroom_ = ObjC.selector("setContentsHeadroom:");
    private static final MethodHandle MH_setContentsHeadroom_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_wantsDynamicContentScaling = ObjC.selector("wantsDynamicContentScaling");
    private static final MethodHandle MH_wantsDynamicContentScaling = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setWantsDynamicContentScaling_ = ObjC.selector("setWantsDynamicContentScaling:");
    private static final MethodHandle MH_setWantsDynamicContentScaling_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_minificationFilter = ObjC.selector("minificationFilter");
    private static final MethodHandle MH_minificationFilter = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMinificationFilter_ = ObjC.selector("setMinificationFilter:");
    private static final MethodHandle MH_setMinificationFilter_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_magnificationFilter = ObjC.selector("magnificationFilter");
    private static final MethodHandle MH_magnificationFilter = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMagnificationFilter_ = ObjC.selector("setMagnificationFilter:");
    private static final MethodHandle MH_setMagnificationFilter_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_minificationFilterBias = ObjC.selector("minificationFilterBias");
    private static final MethodHandle MH_minificationFilterBias = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMinificationFilterBias_ = ObjC.selector("setMinificationFilterBias:");
    private static final MethodHandle MH_setMinificationFilterBias_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_isOpaque = ObjC.selector("isOpaque");
    private static final MethodHandle MH_isOpaque = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOpaque_ = ObjC.selector("setOpaque:");
    private static final MethodHandle MH_setOpaque_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_needsDisplayOnBoundsChange = ObjC.selector("needsDisplayOnBoundsChange");
    private static final MethodHandle MH_needsDisplayOnBoundsChange = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setNeedsDisplayOnBoundsChange_ = ObjC.selector("setNeedsDisplayOnBoundsChange:");
    private static final MethodHandle MH_setNeedsDisplayOnBoundsChange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_drawsAsynchronously = ObjC.selector("drawsAsynchronously");
    private static final MethodHandle MH_drawsAsynchronously = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDrawsAsynchronously_ = ObjC.selector("setDrawsAsynchronously:");
    private static final MethodHandle MH_setDrawsAsynchronously_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_edgeAntialiasingMask = ObjC.selector("edgeAntialiasingMask");
    private static final MethodHandle MH_edgeAntialiasingMask = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setEdgeAntialiasingMask_ = ObjC.selector("setEdgeAntialiasingMask:");
    private static final MethodHandle MH_setEdgeAntialiasingMask_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_INT));
    private static final long SEL_allowsEdgeAntialiasing = ObjC.selector("allowsEdgeAntialiasing");
    private static final MethodHandle MH_allowsEdgeAntialiasing = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAllowsEdgeAntialiasing_ = ObjC.selector("setAllowsEdgeAntialiasing:");
    private static final MethodHandle MH_setAllowsEdgeAntialiasing_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_backgroundColor = ObjC.selector("backgroundColor");
    private static final MethodHandle MH_backgroundColor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBackgroundColor_ = ObjC.selector("setBackgroundColor:");
    private static final MethodHandle MH_setBackgroundColor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_cornerRadius = ObjC.selector("cornerRadius");
    private static final MethodHandle MH_cornerRadius = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCornerRadius_ = ObjC.selector("setCornerRadius:");
    private static final MethodHandle MH_setCornerRadius_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_maskedCorners = ObjC.selector("maskedCorners");
    private static final MethodHandle MH_maskedCorners = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaskedCorners_ = ObjC.selector("setMaskedCorners:");
    private static final MethodHandle MH_setMaskedCorners_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_cornerCurve = ObjC.selector("cornerCurve");
    private static final MethodHandle MH_cornerCurve = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCornerCurve_ = ObjC.selector("setCornerCurve:");
    private static final MethodHandle MH_setCornerCurve_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_borderWidth = ObjC.selector("borderWidth");
    private static final MethodHandle MH_borderWidth = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBorderWidth_ = ObjC.selector("setBorderWidth:");
    private static final MethodHandle MH_setBorderWidth_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_borderColor = ObjC.selector("borderColor");
    private static final MethodHandle MH_borderColor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBorderColor_ = ObjC.selector("setBorderColor:");
    private static final MethodHandle MH_setBorderColor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_opacity = ObjC.selector("opacity");
    private static final MethodHandle MH_opacity = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOpacity_ = ObjC.selector("setOpacity:");
    private static final MethodHandle MH_setOpacity_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_allowsGroupOpacity = ObjC.selector("allowsGroupOpacity");
    private static final MethodHandle MH_allowsGroupOpacity = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAllowsGroupOpacity_ = ObjC.selector("setAllowsGroupOpacity:");
    private static final MethodHandle MH_setAllowsGroupOpacity_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_compositingFilter = ObjC.selector("compositingFilter");
    private static final MethodHandle MH_compositingFilter = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCompositingFilter_ = ObjC.selector("setCompositingFilter:");
    private static final MethodHandle MH_setCompositingFilter_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_filters = ObjC.selector("filters");
    private static final MethodHandle MH_filters = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFilters_ = ObjC.selector("setFilters:");
    private static final MethodHandle MH_setFilters_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_backgroundFilters = ObjC.selector("backgroundFilters");
    private static final MethodHandle MH_backgroundFilters = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBackgroundFilters_ = ObjC.selector("setBackgroundFilters:");
    private static final MethodHandle MH_setBackgroundFilters_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_shouldRasterize = ObjC.selector("shouldRasterize");
    private static final MethodHandle MH_shouldRasterize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setShouldRasterize_ = ObjC.selector("setShouldRasterize:");
    private static final MethodHandle MH_setShouldRasterize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_rasterizationScale = ObjC.selector("rasterizationScale");
    private static final MethodHandle MH_rasterizationScale = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRasterizationScale_ = ObjC.selector("setRasterizationScale:");
    private static final MethodHandle MH_setRasterizationScale_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_shadowColor = ObjC.selector("shadowColor");
    private static final MethodHandle MH_shadowColor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setShadowColor_ = ObjC.selector("setShadowColor:");
    private static final MethodHandle MH_setShadowColor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_shadowOpacity = ObjC.selector("shadowOpacity");
    private static final MethodHandle MH_shadowOpacity = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setShadowOpacity_ = ObjC.selector("setShadowOpacity:");
    private static final MethodHandle MH_setShadowOpacity_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_shadowOffset = ObjC.selector("shadowOffset");
    private static final MethodHandle MH_shadowOffset = ObjC.msgSendCritical(FunctionDescriptor.of(CGSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setShadowOffset_ = ObjC.selector("setShadowOffset:");
    private static final MethodHandle MH_setShadowOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_shadowRadius = ObjC.selector("shadowRadius");
    private static final MethodHandle MH_shadowRadius = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setShadowRadius_ = ObjC.selector("setShadowRadius:");
    private static final MethodHandle MH_setShadowRadius_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_shadowPath = ObjC.selector("shadowPath");
    private static final MethodHandle MH_shadowPath = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setShadowPath_ = ObjC.selector("setShadowPath:");
    private static final MethodHandle MH_setShadowPath_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_autoresizingMask = ObjC.selector("autoresizingMask");
    private static final MethodHandle MH_autoresizingMask = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAutoresizingMask_ = ObjC.selector("setAutoresizingMask:");
    private static final MethodHandle MH_setAutoresizingMask_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_INT));
    private static final long SEL_layoutManager = ObjC.selector("layoutManager");
    private static final MethodHandle MH_layoutManager = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLayoutManager_ = ObjC.selector("setLayoutManager:");
    private static final MethodHandle MH_setLayoutManager_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_actions = ObjC.selector("actions");
    private static final MethodHandle MH_actions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setActions_ = ObjC.selector("setActions:");
    private static final MethodHandle MH_setActions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_name = ObjC.selector("name");
    private static final MethodHandle MH_name = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setName_ = ObjC.selector("setName:");
    private static final MethodHandle MH_setName_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_delegate = ObjC.selector("delegate");
    private static final MethodHandle MH_delegate = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDelegate_ = ObjC.selector("setDelegate:");
    private static final MethodHandle MH_setDelegate_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_style = ObjC.selector("style");
    private static final MethodHandle MH_style = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStyle_ = ObjC.selector("setStyle:");
    private static final MethodHandle MH_setStyle_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public CALayer(final long handle) {
        super(handle);
    }

    /**
     * {@code +[CALayer alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static CALayer alloc() {
        try {
            return new CALayer((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[CALayer layer]} */
    public static CALayer layer() {
        try {
            long result = (long) MH_CLASS_layer.invokeExact(CLS, SEL_CLASS_layer);
            return new CALayer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer init]} */
    public CALayer init() {
        try {
            long result = (long) MH_init.invokeExact(this.handle, SEL_init);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer initWithLayer:]} */
    public CALayer initWithLayer(final NSObject layer) {
        try {
            long result = (long) MH_initWithLayer_.invokeExact(this.handle, SEL_initWithLayer_, layer.handle());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer presentationLayer]} */
    @Nullable
    public CALayer presentationLayer() {
        try {
            long result = (long) MH_presentationLayer.invokeExact(this.handle, SEL_presentationLayer);
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer modelLayer]} */
    public CALayer modelLayer() {
        try {
            long result = (long) MH_modelLayer.invokeExact(this.handle, SEL_modelLayer);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[CALayer defaultValueForKey:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static NSObject defaultValueForKey(final String key) {
        final long nsKey = ObjC.nsString(key);
        try {
            long result = (long) MH_CLASS_defaultValueForKey_.invokeExact(CLS, SEL_CLASS_defaultValueForKey_, nsKey);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKey);
        }
    }

    /** {@code +[CALayer needsDisplayForKey:]} */
    public static boolean needsDisplayForKey(final String key) {
        final long nsKey = ObjC.nsString(key);
        try {
            return (boolean) MH_CLASS_needsDisplayForKey_.invokeExact(CLS, SEL_CLASS_needsDisplayForKey_, nsKey);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKey);
        }
    }

    /** {@code -[CALayer shouldArchiveValueForKey:]} */
    public boolean shouldArchiveValueForKey(final String key) {
        final long nsKey = ObjC.nsString(key);
        try {
            return (boolean) MH_shouldArchiveValueForKey_.invokeExact(this.handle, SEL_shouldArchiveValueForKey_, nsKey);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKey);
        }
    }

    /** {@code -[CALayer affineTransform]} */
    public CGAffineTransform affineTransform() {
        try (NativeStack stack = NativeStack.push()) {
            return CGAffineTransform.read((MemorySegment) MH_affineTransform.invokeExact((SegmentAllocator) stack, this.handle, SEL_affineTransform));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setAffineTransform:]} */
    public void setAffineTransform(final CGAffineTransform m) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setAffineTransform_.invokeExact(this.handle, SEL_setAffineTransform_, m.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer contentsAreFlipped]} */
    public boolean contentsAreFlipped() {
        try {
            return (boolean) MH_contentsAreFlipped.invokeExact(this.handle, SEL_contentsAreFlipped);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer removeFromSuperlayer]} */
    public void removeFromSuperlayer() {
        try {
            MH_removeFromSuperlayer.invokeExact(this.handle, SEL_removeFromSuperlayer);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer addSublayer:]} */
    public void addSublayer(final CALayer layer) {
        try {
            MH_addSublayer_.invokeExact(this.handle, SEL_addSublayer_, layer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer insertSublayer:atIndex:]} */
    public void insertSublayer(final CALayer layer, final int idx) {
        try {
            MH_insertSublayer_atIndex_.invokeExact(this.handle, SEL_insertSublayer_atIndex_, layer.handle(), idx);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer insertSublayer:below:]} */
    public void insertSublayerBelow(final CALayer layer, @Nullable final CALayer sibling) {
        try {
            MH_insertSublayer_below_.invokeExact(this.handle, SEL_insertSublayer_below_, layer.handle(), sibling == null ? 0L : sibling.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer insertSublayer:above:]} */
    public void insertSublayerAbove(final CALayer layer, @Nullable final CALayer sibling) {
        try {
            MH_insertSublayer_above_.invokeExact(this.handle, SEL_insertSublayer_above_, layer.handle(), sibling == null ? 0L : sibling.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer replaceSublayer:with:]} */
    public void replaceSublayer(final CALayer oldLayer, final CALayer newLayer) {
        try {
            MH_replaceSublayer_with_.invokeExact(this.handle, SEL_replaceSublayer_with_, oldLayer.handle(), newLayer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer convertPoint:fromLayer:]} */
    public CGPoint convertPointFromLayer(final CGPoint p, @Nullable final CALayer l) {
        try (NativeStack stack = NativeStack.push()) {
            return CGPoint.read((MemorySegment) MH_convertPoint_fromLayer_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertPoint_fromLayer_, p.x(), p.y(), l == null ? 0L : l.handle()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer convertPoint:toLayer:]} */
    public CGPoint convertPointToLayer(final CGPoint p, @Nullable final CALayer l) {
        try (NativeStack stack = NativeStack.push()) {
            return CGPoint.read((MemorySegment) MH_convertPoint_toLayer_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertPoint_toLayer_, p.x(), p.y(), l == null ? 0L : l.handle()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer convertRect:fromLayer:]} */
    public CGRect convertRectFromLayer(final CGRect r, @Nullable final CALayer l) {
        try (NativeStack stack = NativeStack.push()) {
            return CGRect.read((MemorySegment) MH_convertRect_fromLayer_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertRect_fromLayer_, r.origin().x(), r.origin().y(), r.size().width(), r.size().height(), l == null ? 0L : l.handle()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer convertRect:toLayer:]} */
    public CGRect convertRectToLayer(final CGRect r, @Nullable final CALayer l) {
        try (NativeStack stack = NativeStack.push()) {
            return CGRect.read((MemorySegment) MH_convertRect_toLayer_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertRect_toLayer_, r.origin().x(), r.origin().y(), r.size().width(), r.size().height(), l == null ? 0L : l.handle()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer convertTime:fromLayer:]} */
    public double convertTimeFromLayer(final double t, @Nullable final CALayer l) {
        try {
            return (double) MH_convertTime_fromLayer_.invokeExact(this.handle, SEL_convertTime_fromLayer_, t, l == null ? 0L : l.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer convertTime:toLayer:]} */
    public double convertTimeToLayer(final double t, @Nullable final CALayer l) {
        try {
            return (double) MH_convertTime_toLayer_.invokeExact(this.handle, SEL_convertTime_toLayer_, t, l == null ? 0L : l.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CALayer hitTest:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public CALayer hitTest(final CGPoint p) {
        try {
            long result = (long) MH_hitTest_.invokeExact(this.handle, SEL_hitTest_, p.x(), p.y());
            return result == 0L ? null : new CALayer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer containsPoint:]} */
    public boolean containsPoint(final CGPoint p) {
        try {
            return (boolean) MH_containsPoint_.invokeExact(this.handle, SEL_containsPoint_, p.x(), p.y());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer display]} */
    public void display() {
        try {
            MH_display.invokeExact(this.handle, SEL_display);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setNeedsDisplay]} */
    public void setNeedsDisplay() {
        try {
            MH_setNeedsDisplay.invokeExact(this.handle, SEL_setNeedsDisplay);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setNeedsDisplayInRect:]} */
    public void setNeedsDisplayInRect(final CGRect r) {
        try {
            MH_setNeedsDisplayInRect_.invokeExact(this.handle, SEL_setNeedsDisplayInRect_, r.origin().x(), r.origin().y(), r.size().width(), r.size().height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer needsDisplay]} */
    public boolean needsDisplay() {
        try {
            return (boolean) MH_needsDisplay.invokeExact(this.handle, SEL_needsDisplay);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer displayIfNeeded]} */
    public void displayIfNeeded() {
        try {
            MH_displayIfNeeded.invokeExact(this.handle, SEL_displayIfNeeded);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer drawInContext:]} */
    public void drawInContext(final long ctx) {
        try {
            MH_drawInContext_.invokeExact(this.handle, SEL_drawInContext_, ctx);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer renderInContext:]} */
    public void renderInContext(final long ctx) {
        try {
            MH_renderInContext_.invokeExact(this.handle, SEL_renderInContext_, ctx);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[CALayer cornerCurveExpansionFactor:]} */
    public static double cornerCurveExpansionFactor(final String curve) {
        final long nsCurve = ObjC.nsString(curve);
        try {
            return (double) MH_CLASS_cornerCurveExpansionFactor_.invokeExact(CLS, SEL_CLASS_cornerCurveExpansionFactor_, nsCurve);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsCurve);
        }
    }

    /** {@code -[CALayer preferredFrameSize]} */
    public CGSize preferredFrameSize() {
        try (NativeStack stack = NativeStack.push()) {
            return CGSize.read((MemorySegment) MH_preferredFrameSize.invokeExact((SegmentAllocator) stack, this.handle, SEL_preferredFrameSize));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setNeedsLayout]} */
    public void setNeedsLayout() {
        try {
            MH_setNeedsLayout.invokeExact(this.handle, SEL_setNeedsLayout);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer needsLayout]} */
    public boolean needsLayout() {
        try {
            return (boolean) MH_needsLayout.invokeExact(this.handle, SEL_needsLayout);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer layoutIfNeeded]} */
    public void layoutIfNeeded() {
        try {
            MH_layoutIfNeeded.invokeExact(this.handle, SEL_layoutIfNeeded);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer layoutSublayers]} */
    public void layoutSublayers() {
        try {
            MH_layoutSublayers.invokeExact(this.handle, SEL_layoutSublayers);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer resizeSublayersWithOldSize:]} */
    public void resizeSublayersWithOldSize(final CGSize size) {
        try {
            MH_resizeSublayersWithOldSize_.invokeExact(this.handle, SEL_resizeSublayersWithOldSize_, size.width(), size.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer resizeWithOldSuperlayerSize:]} */
    public void resizeWithOldSuperlayerSize(final CGSize size) {
        try {
            MH_resizeWithOldSuperlayerSize_.invokeExact(this.handle, SEL_resizeWithOldSuperlayerSize_, size.width(), size.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[CALayer defaultActionForKey:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static NSObject defaultActionForKey(final String event) {
        final long nsEvent = ObjC.nsString(event);
        try {
            long result = (long) MH_CLASS_defaultActionForKey_.invokeExact(CLS, SEL_CLASS_defaultActionForKey_, nsEvent);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsEvent);
        }
    }

    /**
     * {@code -[CALayer actionForKey:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject actionForKey(final String event) {
        final long nsEvent = ObjC.nsString(event);
        try {
            long result = (long) MH_actionForKey_.invokeExact(this.handle, SEL_actionForKey_, nsEvent);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsEvent);
        }
    }

    /** {@code -[CALayer addAnimation:forKey:]} */
    public void addAnimation(final NSObject anim, @Nullable final String key) {
        final long nsKey = key == null ? 0L : ObjC.nsString(key);
        try {
            MH_addAnimation_forKey_.invokeExact(this.handle, SEL_addAnimation_forKey_, anim.handle(), nsKey);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKey);
        }
    }

    /** {@code -[CALayer removeAllAnimations]} */
    public void removeAllAnimations() {
        try {
            MH_removeAllAnimations.invokeExact(this.handle, SEL_removeAllAnimations);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer removeAnimationForKey:]} */
    public void removeAnimationForKey(final String key) {
        final long nsKey = ObjC.nsString(key);
        try {
            MH_removeAnimationForKey_.invokeExact(this.handle, SEL_removeAnimationForKey_, nsKey);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKey);
        }
    }

    /**
     * {@code -[CALayer animationKeys]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<NSString> animationKeys() {
        try {
            long result = (long) MH_animationKeys.invokeExact(this.handle, SEL_animationKeys);
            return result == 0L ? null : new NSArray<>(result, NSString::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CALayer animationForKey:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject animationForKey(final String key) {
        final long nsKey = ObjC.nsString(key);
        try {
            long result = (long) MH_animationForKey_.invokeExact(this.handle, SEL_animationForKey_, nsKey);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKey);
        }
    }

    /** {@code -[CALayer bounds]} */
    public CGRect bounds() {
        try (NativeStack stack = NativeStack.push()) {
            return CGRect.read((MemorySegment) MH_bounds.invokeExact((SegmentAllocator) stack, this.handle, SEL_bounds));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setBounds:]} */
    public void setBounds(final CGRect bounds) {
        try {
            MH_setBounds_.invokeExact(this.handle, SEL_setBounds_, bounds.origin().x(), bounds.origin().y(), bounds.size().width(), bounds.size().height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer position]} */
    public CGPoint position() {
        try (NativeStack stack = NativeStack.push()) {
            return CGPoint.read((MemorySegment) MH_position.invokeExact((SegmentAllocator) stack, this.handle, SEL_position));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setPosition:]} */
    public void setPosition(final CGPoint position) {
        try {
            MH_setPosition_.invokeExact(this.handle, SEL_setPosition_, position.x(), position.y());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer zPosition]} */
    public double zPosition() {
        try {
            return (double) MH_zPosition.invokeExact(this.handle, SEL_zPosition);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setZPosition:]} */
    public void setZPosition(final double zPosition) {
        try {
            MH_setZPosition_.invokeExact(this.handle, SEL_setZPosition_, zPosition);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer anchorPoint]} */
    public CGPoint anchorPoint() {
        try (NativeStack stack = NativeStack.push()) {
            return CGPoint.read((MemorySegment) MH_anchorPoint.invokeExact((SegmentAllocator) stack, this.handle, SEL_anchorPoint));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setAnchorPoint:]} */
    public void setAnchorPoint(final CGPoint anchorPoint) {
        try {
            MH_setAnchorPoint_.invokeExact(this.handle, SEL_setAnchorPoint_, anchorPoint.x(), anchorPoint.y());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer anchorPointZ]} */
    public double anchorPointZ() {
        try {
            return (double) MH_anchorPointZ.invokeExact(this.handle, SEL_anchorPointZ);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setAnchorPointZ:]} */
    public void setAnchorPointZ(final double anchorPointZ) {
        try {
            MH_setAnchorPointZ_.invokeExact(this.handle, SEL_setAnchorPointZ_, anchorPointZ);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer transform]} */
    public CATransform3D transform() {
        try (NativeStack stack = NativeStack.push()) {
            return CATransform3D.read((MemorySegment) MH_transform.invokeExact((SegmentAllocator) stack, this.handle, SEL_transform));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setTransform:]} */
    public void setTransform(final CATransform3D transform) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setTransform_.invokeExact(this.handle, SEL_setTransform_, transform.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer frame]} */
    public CGRect frame() {
        try (NativeStack stack = NativeStack.push()) {
            return CGRect.read((MemorySegment) MH_frame.invokeExact((SegmentAllocator) stack, this.handle, SEL_frame));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setFrame:]} */
    public void setFrame(final CGRect frame) {
        try {
            MH_setFrame_.invokeExact(this.handle, SEL_setFrame_, frame.origin().x(), frame.origin().y(), frame.size().width(), frame.size().height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer isHidden]} */
    public boolean isHidden() {
        try {
            return (boolean) MH_isHidden.invokeExact(this.handle, SEL_isHidden);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setHidden:]} */
    public void setHidden(final boolean hidden) {
        try {
            MH_setHidden_.invokeExact(this.handle, SEL_setHidden_, hidden);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer isDoubleSided]} */
    public boolean isDoubleSided() {
        try {
            return (boolean) MH_isDoubleSided.invokeExact(this.handle, SEL_isDoubleSided);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setDoubleSided:]} */
    public void setDoubleSided(final boolean doubleSided) {
        try {
            MH_setDoubleSided_.invokeExact(this.handle, SEL_setDoubleSided_, doubleSided);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer isGeometryFlipped]} */
    public boolean isGeometryFlipped() {
        try {
            return (boolean) MH_isGeometryFlipped.invokeExact(this.handle, SEL_isGeometryFlipped);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setGeometryFlipped:]} */
    public void setGeometryFlipped(final boolean geometryFlipped) {
        try {
            MH_setGeometryFlipped_.invokeExact(this.handle, SEL_setGeometryFlipped_, geometryFlipped);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CALayer superlayer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public CALayer superlayer() {
        try {
            long result = (long) MH_superlayer.invokeExact(this.handle, SEL_superlayer);
            return result == 0L ? null : new CALayer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CALayer sublayers]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<CALayer> sublayers() {
        try {
            long result = (long) MH_sublayers.invokeExact(this.handle, SEL_sublayers);
            return result == 0L ? null : new NSArray<>(result, CALayer::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setSublayers:]} */
    public void setSublayers(@Nullable final NSArray<CALayer> sublayers) {
        try {
            MH_setSublayers_.invokeExact(this.handle, SEL_setSublayers_, sublayers == null ? 0L : sublayers.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer sublayerTransform]} */
    public CATransform3D sublayerTransform() {
        try (NativeStack stack = NativeStack.push()) {
            return CATransform3D.read((MemorySegment) MH_sublayerTransform.invokeExact((SegmentAllocator) stack, this.handle, SEL_sublayerTransform));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setSublayerTransform:]} */
    public void setSublayerTransform(final CATransform3D sublayerTransform) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setSublayerTransform_.invokeExact(this.handle, SEL_setSublayerTransform_, sublayerTransform.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CALayer mask]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public CALayer mask() {
        try {
            long result = (long) MH_mask.invokeExact(this.handle, SEL_mask);
            return result == 0L ? null : new CALayer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setMask:]} */
    public void setMask(@Nullable final CALayer mask) {
        try {
            MH_setMask_.invokeExact(this.handle, SEL_setMask_, mask == null ? 0L : mask.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer masksToBounds]} */
    public boolean masksToBounds() {
        try {
            return (boolean) MH_masksToBounds.invokeExact(this.handle, SEL_masksToBounds);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setMasksToBounds:]} */
    public void setMasksToBounds(final boolean masksToBounds) {
        try {
            MH_setMasksToBounds_.invokeExact(this.handle, SEL_setMasksToBounds_, masksToBounds);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CALayer contents]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject contents() {
        try {
            long result = (long) MH_contents.invokeExact(this.handle, SEL_contents);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setContents:]} */
    public void setContents(@Nullable final NSObject contents) {
        try {
            MH_setContents_.invokeExact(this.handle, SEL_setContents_, contents == null ? 0L : contents.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer contentsRect]} */
    public CGRect contentsRect() {
        try (NativeStack stack = NativeStack.push()) {
            return CGRect.read((MemorySegment) MH_contentsRect.invokeExact((SegmentAllocator) stack, this.handle, SEL_contentsRect));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setContentsRect:]} */
    public void setContentsRect(final CGRect contentsRect) {
        try {
            MH_setContentsRect_.invokeExact(this.handle, SEL_setContentsRect_, contentsRect.origin().x(), contentsRect.origin().y(), contentsRect.size().width(), contentsRect.size().height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer contentsGravity]} */
    public String contentsGravity() {
        try {
            long result = (long) MH_contentsGravity.invokeExact(this.handle, SEL_contentsGravity);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setContentsGravity:]} */
    public void setContentsGravity(final String contentsGravity) {
        final long nsContentsGravity = ObjC.nsString(contentsGravity);
        try {
            MH_setContentsGravity_.invokeExact(this.handle, SEL_setContentsGravity_, nsContentsGravity);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsContentsGravity);
        }
    }

    /** {@code -[CALayer contentsScale]} */
    public double contentsScale() {
        try {
            return (double) MH_contentsScale.invokeExact(this.handle, SEL_contentsScale);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setContentsScale:]} */
    public void setContentsScale(final double contentsScale) {
        try {
            MH_setContentsScale_.invokeExact(this.handle, SEL_setContentsScale_, contentsScale);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer contentsCenter]} */
    public CGRect contentsCenter() {
        try (NativeStack stack = NativeStack.push()) {
            return CGRect.read((MemorySegment) MH_contentsCenter.invokeExact((SegmentAllocator) stack, this.handle, SEL_contentsCenter));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setContentsCenter:]} */
    public void setContentsCenter(final CGRect contentsCenter) {
        try {
            MH_setContentsCenter_.invokeExact(this.handle, SEL_setContentsCenter_, contentsCenter.origin().x(), contentsCenter.origin().y(), contentsCenter.size().width(), contentsCenter.size().height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer contentsFormat]} */
    @Nullable
    public String contentsFormat() {
        try {
            long result = (long) MH_contentsFormat.invokeExact(this.handle, SEL_contentsFormat);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setContentsFormat:]} */
    public void setContentsFormat(@Nullable final String contentsFormat) {
        final long nsContentsFormat = contentsFormat == null ? 0L : ObjC.nsString(contentsFormat);
        try {
            MH_setContentsFormat_.invokeExact(this.handle, SEL_setContentsFormat_, nsContentsFormat);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsContentsFormat);
        }
    }

    /** {@code -[CALayer wantsExtendedDynamicRangeContent]} */
    public boolean wantsExtendedDynamicRangeContent() {
        try {
            return (boolean) MH_wantsExtendedDynamicRangeContent.invokeExact(this.handle, SEL_wantsExtendedDynamicRangeContent);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setWantsExtendedDynamicRangeContent:]} */
    public void setWantsExtendedDynamicRangeContent(final boolean wantsExtendedDynamicRangeContent) {
        try {
            MH_setWantsExtendedDynamicRangeContent_.invokeExact(this.handle, SEL_setWantsExtendedDynamicRangeContent_, wantsExtendedDynamicRangeContent);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer toneMapMode]} */
    @Nullable
    public String toneMapMode() {
        try {
            long result = (long) MH_toneMapMode.invokeExact(this.handle, SEL_toneMapMode);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setToneMapMode:]} */
    public void setToneMapMode(@Nullable final String toneMapMode) {
        final long nsToneMapMode = toneMapMode == null ? 0L : ObjC.nsString(toneMapMode);
        try {
            MH_setToneMapMode_.invokeExact(this.handle, SEL_setToneMapMode_, nsToneMapMode);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsToneMapMode);
        }
    }

    /** {@code -[CALayer preferredDynamicRange]} */
    @Nullable
    public String preferredDynamicRange() {
        try {
            long result = (long) MH_preferredDynamicRange.invokeExact(this.handle, SEL_preferredDynamicRange);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setPreferredDynamicRange:]} */
    public void setPreferredDynamicRange(@Nullable final String preferredDynamicRange) {
        final long nsPreferredDynamicRange = preferredDynamicRange == null ? 0L : ObjC.nsString(preferredDynamicRange);
        try {
            MH_setPreferredDynamicRange_.invokeExact(this.handle, SEL_setPreferredDynamicRange_, nsPreferredDynamicRange);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPreferredDynamicRange);
        }
    }

    /** {@code -[CALayer contentsHeadroom]} */
    public double contentsHeadroom() {
        try {
            return (double) MH_contentsHeadroom.invokeExact(this.handle, SEL_contentsHeadroom);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setContentsHeadroom:]} */
    public void setContentsHeadroom(final double contentsHeadroom) {
        try {
            MH_setContentsHeadroom_.invokeExact(this.handle, SEL_setContentsHeadroom_, contentsHeadroom);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer wantsDynamicContentScaling]} */
    public boolean wantsDynamicContentScaling() {
        try {
            return (boolean) MH_wantsDynamicContentScaling.invokeExact(this.handle, SEL_wantsDynamicContentScaling);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setWantsDynamicContentScaling:]} */
    public void setWantsDynamicContentScaling(final boolean wantsDynamicContentScaling) {
        try {
            MH_setWantsDynamicContentScaling_.invokeExact(this.handle, SEL_setWantsDynamicContentScaling_, wantsDynamicContentScaling);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer minificationFilter]} */
    public String minificationFilter() {
        try {
            long result = (long) MH_minificationFilter.invokeExact(this.handle, SEL_minificationFilter);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setMinificationFilter:]} */
    public void setMinificationFilter(final String minificationFilter) {
        final long nsMinificationFilter = ObjC.nsString(minificationFilter);
        try {
            MH_setMinificationFilter_.invokeExact(this.handle, SEL_setMinificationFilter_, nsMinificationFilter);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsMinificationFilter);
        }
    }

    /** {@code -[CALayer magnificationFilter]} */
    public String magnificationFilter() {
        try {
            long result = (long) MH_magnificationFilter.invokeExact(this.handle, SEL_magnificationFilter);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setMagnificationFilter:]} */
    public void setMagnificationFilter(final String magnificationFilter) {
        final long nsMagnificationFilter = ObjC.nsString(magnificationFilter);
        try {
            MH_setMagnificationFilter_.invokeExact(this.handle, SEL_setMagnificationFilter_, nsMagnificationFilter);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsMagnificationFilter);
        }
    }

    /** {@code -[CALayer minificationFilterBias]} */
    public float minificationFilterBias() {
        try {
            return (float) MH_minificationFilterBias.invokeExact(this.handle, SEL_minificationFilterBias);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setMinificationFilterBias:]} */
    public void setMinificationFilterBias(final float minificationFilterBias) {
        try {
            MH_setMinificationFilterBias_.invokeExact(this.handle, SEL_setMinificationFilterBias_, minificationFilterBias);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer isOpaque]} */
    public boolean isOpaque() {
        try {
            return (boolean) MH_isOpaque.invokeExact(this.handle, SEL_isOpaque);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setOpaque:]} */
    public void setOpaque(final boolean opaque) {
        try {
            MH_setOpaque_.invokeExact(this.handle, SEL_setOpaque_, opaque);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer needsDisplayOnBoundsChange]} */
    public boolean needsDisplayOnBoundsChange() {
        try {
            return (boolean) MH_needsDisplayOnBoundsChange.invokeExact(this.handle, SEL_needsDisplayOnBoundsChange);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setNeedsDisplayOnBoundsChange:]} */
    public void setNeedsDisplayOnBoundsChange(final boolean needsDisplayOnBoundsChange) {
        try {
            MH_setNeedsDisplayOnBoundsChange_.invokeExact(this.handle, SEL_setNeedsDisplayOnBoundsChange_, needsDisplayOnBoundsChange);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer drawsAsynchronously]} */
    public boolean drawsAsynchronously() {
        try {
            return (boolean) MH_drawsAsynchronously.invokeExact(this.handle, SEL_drawsAsynchronously);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setDrawsAsynchronously:]} */
    public void setDrawsAsynchronously(final boolean drawsAsynchronously) {
        try {
            MH_setDrawsAsynchronously_.invokeExact(this.handle, SEL_setDrawsAsynchronously_, drawsAsynchronously);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CALayer edgeAntialiasingMask]}
     *
     * @return a combination of {@link CAEdgeAntialiasingMask} flags
     */
    public int edgeAntialiasingMask() {
        try {
            return (int) MH_edgeAntialiasingMask.invokeExact(this.handle, SEL_edgeAntialiasingMask);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CALayer setEdgeAntialiasingMask:]}
     *
     * @param edgeAntialiasingMask a combination of {@link CAEdgeAntialiasingMask} flags
     */
    public void setEdgeAntialiasingMask(final int edgeAntialiasingMask) {
        try {
            MH_setEdgeAntialiasingMask_.invokeExact(this.handle, SEL_setEdgeAntialiasingMask_, edgeAntialiasingMask);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer allowsEdgeAntialiasing]} */
    public boolean allowsEdgeAntialiasing() {
        try {
            return (boolean) MH_allowsEdgeAntialiasing.invokeExact(this.handle, SEL_allowsEdgeAntialiasing);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setAllowsEdgeAntialiasing:]} */
    public void setAllowsEdgeAntialiasing(final boolean allowsEdgeAntialiasing) {
        try {
            MH_setAllowsEdgeAntialiasing_.invokeExact(this.handle, SEL_setAllowsEdgeAntialiasing_, allowsEdgeAntialiasing);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer backgroundColor]} */
    public long backgroundColor() {
        try {
            return (long) MH_backgroundColor.invokeExact(this.handle, SEL_backgroundColor);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setBackgroundColor:]} */
    public void setBackgroundColor(final long backgroundColor) {
        try {
            MH_setBackgroundColor_.invokeExact(this.handle, SEL_setBackgroundColor_, backgroundColor);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer cornerRadius]} */
    public double cornerRadius() {
        try {
            return (double) MH_cornerRadius.invokeExact(this.handle, SEL_cornerRadius);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setCornerRadius:]} */
    public void setCornerRadius(final double cornerRadius) {
        try {
            MH_setCornerRadius_.invokeExact(this.handle, SEL_setCornerRadius_, cornerRadius);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CALayer maskedCorners]}
     *
     * @return a combination of {@link CACornerMask} flags
     */
    public long maskedCorners() {
        try {
            return (long) MH_maskedCorners.invokeExact(this.handle, SEL_maskedCorners);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CALayer setMaskedCorners:]}
     *
     * @param maskedCorners a combination of {@link CACornerMask} flags
     */
    public void setMaskedCorners(final long maskedCorners) {
        try {
            MH_setMaskedCorners_.invokeExact(this.handle, SEL_setMaskedCorners_, maskedCorners);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer cornerCurve]} */
    @Nullable
    public String cornerCurve() {
        try {
            long result = (long) MH_cornerCurve.invokeExact(this.handle, SEL_cornerCurve);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setCornerCurve:]} */
    public void setCornerCurve(@Nullable final String cornerCurve) {
        final long nsCornerCurve = cornerCurve == null ? 0L : ObjC.nsString(cornerCurve);
        try {
            MH_setCornerCurve_.invokeExact(this.handle, SEL_setCornerCurve_, nsCornerCurve);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsCornerCurve);
        }
    }

    /** {@code -[CALayer borderWidth]} */
    public double borderWidth() {
        try {
            return (double) MH_borderWidth.invokeExact(this.handle, SEL_borderWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setBorderWidth:]} */
    public void setBorderWidth(final double borderWidth) {
        try {
            MH_setBorderWidth_.invokeExact(this.handle, SEL_setBorderWidth_, borderWidth);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer borderColor]} */
    public long borderColor() {
        try {
            return (long) MH_borderColor.invokeExact(this.handle, SEL_borderColor);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setBorderColor:]} */
    public void setBorderColor(final long borderColor) {
        try {
            MH_setBorderColor_.invokeExact(this.handle, SEL_setBorderColor_, borderColor);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer opacity]} */
    public float opacity() {
        try {
            return (float) MH_opacity.invokeExact(this.handle, SEL_opacity);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setOpacity:]} */
    public void setOpacity(final float opacity) {
        try {
            MH_setOpacity_.invokeExact(this.handle, SEL_setOpacity_, opacity);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer allowsGroupOpacity]} */
    public boolean allowsGroupOpacity() {
        try {
            return (boolean) MH_allowsGroupOpacity.invokeExact(this.handle, SEL_allowsGroupOpacity);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setAllowsGroupOpacity:]} */
    public void setAllowsGroupOpacity(final boolean allowsGroupOpacity) {
        try {
            MH_setAllowsGroupOpacity_.invokeExact(this.handle, SEL_setAllowsGroupOpacity_, allowsGroupOpacity);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CALayer compositingFilter]}
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

    /** {@code -[CALayer setCompositingFilter:]} */
    public void setCompositingFilter(@Nullable final NSObject compositingFilter) {
        try {
            MH_setCompositingFilter_.invokeExact(this.handle, SEL_setCompositingFilter_, compositingFilter == null ? 0L : compositingFilter.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CALayer filters]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<NSObject> filters() {
        try {
            long result = (long) MH_filters.invokeExact(this.handle, SEL_filters);
            return result == 0L ? null : new NSArray<>(result, NSObject::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setFilters:]} */
    public void setFilters(@Nullable final NSArray<NSObject> filters) {
        try {
            MH_setFilters_.invokeExact(this.handle, SEL_setFilters_, filters == null ? 0L : filters.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CALayer backgroundFilters]}
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

    /** {@code -[CALayer setBackgroundFilters:]} */
    public void setBackgroundFilters(@Nullable final NSArray<NSObject> backgroundFilters) {
        try {
            MH_setBackgroundFilters_.invokeExact(this.handle, SEL_setBackgroundFilters_, backgroundFilters == null ? 0L : backgroundFilters.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer shouldRasterize]} */
    public boolean shouldRasterize() {
        try {
            return (boolean) MH_shouldRasterize.invokeExact(this.handle, SEL_shouldRasterize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setShouldRasterize:]} */
    public void setShouldRasterize(final boolean shouldRasterize) {
        try {
            MH_setShouldRasterize_.invokeExact(this.handle, SEL_setShouldRasterize_, shouldRasterize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer rasterizationScale]} */
    public double rasterizationScale() {
        try {
            return (double) MH_rasterizationScale.invokeExact(this.handle, SEL_rasterizationScale);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setRasterizationScale:]} */
    public void setRasterizationScale(final double rasterizationScale) {
        try {
            MH_setRasterizationScale_.invokeExact(this.handle, SEL_setRasterizationScale_, rasterizationScale);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer shadowColor]} */
    public long shadowColor() {
        try {
            return (long) MH_shadowColor.invokeExact(this.handle, SEL_shadowColor);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setShadowColor:]} */
    public void setShadowColor(final long shadowColor) {
        try {
            MH_setShadowColor_.invokeExact(this.handle, SEL_setShadowColor_, shadowColor);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer shadowOpacity]} */
    public float shadowOpacity() {
        try {
            return (float) MH_shadowOpacity.invokeExact(this.handle, SEL_shadowOpacity);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setShadowOpacity:]} */
    public void setShadowOpacity(final float shadowOpacity) {
        try {
            MH_setShadowOpacity_.invokeExact(this.handle, SEL_setShadowOpacity_, shadowOpacity);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer shadowOffset]} */
    public CGSize shadowOffset() {
        try (NativeStack stack = NativeStack.push()) {
            return CGSize.read((MemorySegment) MH_shadowOffset.invokeExact((SegmentAllocator) stack, this.handle, SEL_shadowOffset));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setShadowOffset:]} */
    public void setShadowOffset(final CGSize shadowOffset) {
        try {
            MH_setShadowOffset_.invokeExact(this.handle, SEL_setShadowOffset_, shadowOffset.width(), shadowOffset.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer shadowRadius]} */
    public double shadowRadius() {
        try {
            return (double) MH_shadowRadius.invokeExact(this.handle, SEL_shadowRadius);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setShadowRadius:]} */
    public void setShadowRadius(final double shadowRadius) {
        try {
            MH_setShadowRadius_.invokeExact(this.handle, SEL_setShadowRadius_, shadowRadius);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer shadowPath]} */
    public long shadowPath() {
        try {
            return (long) MH_shadowPath.invokeExact(this.handle, SEL_shadowPath);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setShadowPath:]} */
    public void setShadowPath(final long shadowPath) {
        try {
            MH_setShadowPath_.invokeExact(this.handle, SEL_setShadowPath_, shadowPath);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CALayer autoresizingMask]}
     *
     * @return a combination of {@link CAAutoresizingMask} flags
     */
    public int autoresizingMask() {
        try {
            return (int) MH_autoresizingMask.invokeExact(this.handle, SEL_autoresizingMask);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CALayer setAutoresizingMask:]}
     *
     * @param autoresizingMask a combination of {@link CAAutoresizingMask} flags
     */
    public void setAutoresizingMask(final int autoresizingMask) {
        try {
            MH_setAutoresizingMask_.invokeExact(this.handle, SEL_setAutoresizingMask_, autoresizingMask);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CALayer layoutManager]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject layoutManager() {
        try {
            long result = (long) MH_layoutManager.invokeExact(this.handle, SEL_layoutManager);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setLayoutManager:]} */
    public void setLayoutManager(@Nullable final NSObject layoutManager) {
        try {
            MH_setLayoutManager_.invokeExact(this.handle, SEL_setLayoutManager_, layoutManager == null ? 0L : layoutManager.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CALayer actions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSDictionary<NSString, NSObject> actions() {
        try {
            long result = (long) MH_actions.invokeExact(this.handle, SEL_actions);
            return result == 0L ? null : new NSDictionary<>(result, NSString::new, NSObject::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setActions:]} */
    public void setActions(@Nullable final NSDictionary<NSString, NSObject> actions) {
        try {
            MH_setActions_.invokeExact(this.handle, SEL_setActions_, actions == null ? 0L : actions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer name]} */
    @Nullable
    public String name() {
        try {
            long result = (long) MH_name.invokeExact(this.handle, SEL_name);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setName:]} */
    public void setName(@Nullable final String name) {
        final long nsName = name == null ? 0L : ObjC.nsString(name);
        try {
            MH_setName_.invokeExact(this.handle, SEL_setName_, nsName);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
        }
    }

    /**
     * {@code -[CALayer delegate]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject delegate() {
        try {
            long result = (long) MH_delegate.invokeExact(this.handle, SEL_delegate);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setDelegate:]} */
    public void setDelegate(@Nullable final NSObject delegate) {
        try {
            MH_setDelegate_.invokeExact(this.handle, SEL_setDelegate_, delegate == null ? 0L : delegate.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[CALayer style]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSDictionary<NSObject, NSObject> style() {
        try {
            long result = (long) MH_style.invokeExact(this.handle, SEL_style);
            return result == 0L ? null : new NSDictionary<>(result, NSObject::new, NSObject::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[CALayer setStyle:]} */
    public void setStyle(@Nullable final NSDictionary<NSObject, NSObject> style) {
        try {
            MH_setStyle_.invokeExact(this.handle, SEL_setStyle_, style == null ? 0L : style.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
