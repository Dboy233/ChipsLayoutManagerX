package com.dboy.chips.gravity;

import android.graphics.Rect;

import com.dboy.chips.layouter.AbstractLayouter;
import com.dboy.chips.layouter.Item;

import java.util.List;

class LTRRowFillSpaceStrategy implements IRowStrategy {

    @Override
    public void applyStrategy(AbstractLayouter abstractLayouter, List<Item> row) {
        if (abstractLayouter.getRowSize() == 1) return;
        int difference = GravityUtil.getHorizontalDifference(abstractLayouter) / (abstractLayouter.getRowSize() - 1);
        int offsetDifference = 0;

        for (Item item : row) {
            Rect childRect = item.getViewRect();

            if (childRect.left == abstractLayouter.getCanvasLeftBorder()) {
                //left view of row

                int leftDif = childRect.left - abstractLayouter.getCanvasLeftBorder();
                //press view to left border
                childRect.left = abstractLayouter.getCanvasLeftBorder();
                childRect.right -= leftDif;
                continue;
            }
            offsetDifference += difference;

            childRect.left += offsetDifference;
            childRect.right += offsetDifference;
        }
    }
}
