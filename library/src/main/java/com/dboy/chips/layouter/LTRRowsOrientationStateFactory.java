package com.dboy.chips.layouter;

import androidx.recyclerview.widget.RecyclerView;

import com.dboy.chips.gravity.IRowStrategyFactory;
import com.dboy.chips.gravity.LTRRowStrategyFactory;
import com.dboy.chips.layouter.breaker.IBreakerFactory;
import com.dboy.chips.layouter.breaker.LTRRowBreakerFactory;

class LTRRowsOrientationStateFactory implements IOrientationStateFactory {

    @Override
    public ILayouterCreator createLayouterCreator(RecyclerView.LayoutManager lm) {
        return new LTRRowsCreator(lm);
    }

    @Override
    public IRowStrategyFactory createRowStrategyFactory() {
        return new LTRRowStrategyFactory();
    }

    @Override
    public IBreakerFactory createDefaultBreaker() {
        return new LTRRowBreakerFactory();
    }
}
