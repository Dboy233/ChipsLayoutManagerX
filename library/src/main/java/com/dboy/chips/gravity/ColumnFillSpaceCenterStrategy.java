package com.dboy.chips.gravity;

import android.graphics.Rect;

import com.dboy.chips.layouter.AbstractLayouter;
import com.dboy.chips.layouter.Item;

import java.util.List;

class ColumnFillSpaceCenterStrategy implements IRowStrategy {

    @Override
    public void applyStrategy(AbstractLayouter abstractLayouter, List<Item> row) {
        int difference = GravityUtil.getVerticalDifference(abstractLayouter) / (abstractLayouter.getRowSize() + 1);
        int offsetDifference = 0;

        for (Item item : row) {
            Rect childRect = item.getViewRect();

            offsetDifference += difference;

            childRect.top += offsetDifference;
            childRect.bottom += offsetDifference;
        }

    }
}
