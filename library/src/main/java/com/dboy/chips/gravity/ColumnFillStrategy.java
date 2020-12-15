package com.dboy.chips.gravity;

import android.graphics.Rect;

import com.dboy.chips.layouter.AbstractLayouter;
import com.dboy.chips.layouter.Item;

import java.util.List;

class ColumnFillStrategy implements IRowStrategy {

    @Override
    public void applyStrategy(AbstractLayouter abstractLayouter, List<Item> row) {
        int difference = GravityUtil.getVerticalDifference(abstractLayouter) / abstractLayouter.getRowSize();
        int offsetDifference = difference;

        for (Item item : row) {
            Rect childRect = item.getViewRect();

            if (childRect.top == abstractLayouter.getCanvasTopBorder()) {
                //highest view of row

                int topDif = childRect.top - abstractLayouter.getCanvasTopBorder();
                //press view to top border
                childRect.top = abstractLayouter.getCanvasTopBorder();
                childRect.bottom -= topDif;

                //increase view height from bottom
                childRect.bottom += offsetDifference;
                continue;
            }

            childRect.top += offsetDifference;
            offsetDifference += difference;
            childRect.bottom += offsetDifference;
        }

    }
}
