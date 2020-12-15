package com.dboy.chips.layouter;

import androidx.recyclerview.widget.RecyclerView;

import com.dboy.chips.gravity.IRowStrategyFactory;
import com.dboy.chips.layouter.breaker.IBreakerFactory;

interface IOrientationStateFactory {
    ILayouterCreator createLayouterCreator(RecyclerView.LayoutManager lm);
    IRowStrategyFactory createRowStrategyFactory();
    IBreakerFactory createDefaultBreaker();
}
