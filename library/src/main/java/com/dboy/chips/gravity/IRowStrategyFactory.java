package com.dboy.chips.gravity;

import com.dboy.chips.RowStrategy;

public interface IRowStrategyFactory {
    IRowStrategy createRowStrategy(@com.dboy.chips.RowStrategy int rowStrategy);
}
