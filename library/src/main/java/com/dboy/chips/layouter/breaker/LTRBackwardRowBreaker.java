package com.dboy.chips.layouter.breaker;

import com.dboy.chips.layouter.AbstractLayouter;

/** this is basis row breaker for {@link com.dboy.chips.layouter.LTRUpLayouter} */
class LTRBackwardRowBreaker implements ILayoutRowBreaker {
    @Override
    public boolean isRowBroke(AbstractLayouter al) {
        return al.getViewRight() - al.getCurrentViewWidth() < al.getCanvasLeftBorder()
                && al.getViewRight() < al.getCanvasRightBorder();
    }
}
