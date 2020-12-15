package com.dboy.chips.layouter.criteria;

import com.dboy.chips.layouter.AbstractLayouter;

class CriteriaDownAdditionalHeight extends FinishingCriteriaDecorator {

    private int additionalHeight;

    CriteriaDownAdditionalHeight(IFinishingCriteria finishingCriteria, int additionalHeight) {
        super(finishingCriteria);
        this.additionalHeight = additionalHeight;
    }

    @Override
    public boolean isFinishedLayouting(AbstractLayouter abstractLayouter) {
        int bottomBorder = abstractLayouter.getCanvasBottomBorder();
        return super.isFinishedLayouting(abstractLayouter) &&
                //if additional height filled
                abstractLayouter.getViewTop() > bottomBorder + additionalHeight;
    }

}
