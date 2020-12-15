package com.dboy.chips.gravity;

import com.dboy.chips.ChipsLayoutManager;
import com.dboy.chips.RowStrategy;

public class RTLRowStrategyFactory implements IRowStrategyFactory {

    @Override
    public IRowStrategy createRowStrategy(@RowStrategy int rowStrategy) {
        switch (rowStrategy) {
            case com.dboy.chips.ChipsLayoutManager.STRATEGY_CENTER:
                return new RTLRowFillSpaceCenterStrategy();
            case com.dboy.chips.ChipsLayoutManager.STRATEGY_FILL_SPACE:
                return new RTLRowFillSpaceStrategy();
            case com.dboy.chips.ChipsLayoutManager.STRATEGY_FILL_VIEW:
                return new RTLRowFillStrategy();
            case com.dboy.chips.ChipsLayoutManager.STRATEGY_CENTER_DENSE:
                return new RTLRowFillSpaceCenterDenseStrategy();
            case com.dboy.chips.ChipsLayoutManager.STRATEGY_DEFAULT:
            default:
                return new EmptyRowStrategy();
        }
    }
}
