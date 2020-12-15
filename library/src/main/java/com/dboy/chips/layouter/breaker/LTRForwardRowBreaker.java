package com.dboy.chips.layouter.breaker;

import com.dboy.chips.layouter.AbstractLayouter;

/** this is basis row breaker for {@link com.dboy.chips.layouter.LTRDownLayouter} */
class LTRForwardRowBreaker implements ILayoutRowBreaker {

    @Override
    public boolean isRowBroke(AbstractLayouter al) {
        return al.getViewLeft() > al.getCanvasLeftBorder()
                && al.getViewLeft() + al.getCurrentViewWidth() > al.getCanvasRightBorder();
    }
}
