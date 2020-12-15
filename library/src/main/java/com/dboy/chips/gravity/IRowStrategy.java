package com.dboy.chips.gravity;

import com.dboy.chips.layouter.AbstractLayouter;
import com.dboy.chips.layouter.Item;

import java.util.List;

public interface IRowStrategy {
    void applyStrategy(AbstractLayouter abstractLayouter, List<Item> row);
}
