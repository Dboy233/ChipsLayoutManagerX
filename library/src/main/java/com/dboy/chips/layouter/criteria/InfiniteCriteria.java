package com.dboy.chips.layouter.criteria;

import com.dboy.chips.layouter.AbstractLayouter;

/** when using this criteria {@link AbstractLayouter} doesn't able to finish himself, you should only stop calling placeView outside */
class InfiniteCriteria implements IFinishingCriteria {

    @Override
    public boolean isFinishedLayouting(AbstractLayouter abstractLayouter) {
        return false;
    }

}
