package com.dboy.chips.layouter.breaker;

import com.dboy.chips.layouter.AbstractLayouter;

public class LTRBackwardColumnBreaker implements ILayoutRowBreaker {

    @Override
    public boolean isRowBroke(AbstractLayouter al) {
        return al.getViewBottom() - al.getCurrentViewHeight() < al.getCanvasTopBorder()
                && al.getViewBottom() < al.getCanvasBottomBorder();
    }
}
