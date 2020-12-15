package com.dboy.chips.gravity;

import com.dboy.chips.layouter.AbstractLayouter;
import com.dboy.chips.layouter.Item;

import java.util.List;

class EmptyRowStrategy implements IRowStrategy {
    @Override
    public void applyStrategy(AbstractLayouter abstractLayouter, List<Item> row) {
        //do nothing
    }
}
