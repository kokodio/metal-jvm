package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSOrderedCollectionDifferenceCalculationOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsorderedcollectiondifferencecalculationoptions">Apple documentation</a>
 */
public final class NSOrderedCollectionDifferenceCalculationOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long OmitInsertedObjects = 1L;
    public static final long OmitRemovedObjects = 2L;
    public static final long InferMoves = 4L;

    private NSOrderedCollectionDifferenceCalculationOptions() {
    }
}
