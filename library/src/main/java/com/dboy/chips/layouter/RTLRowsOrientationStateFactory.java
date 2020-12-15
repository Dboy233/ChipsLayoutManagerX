package com.dboy.chips.layouter;

import androidx.recyclerview.widget.RecyclerView;

import com.dboy.chips.gravity.IRowStrategyFactory;
import com.dboy.chips.gravity.RTLRowStrategyFactory;
import com.dboy.chips.layouter.breaker.IBreakerFactory;
import com.dboy.chips.layouter.breaker.RTLRowBreakerFactory;

class RTLRowsOrientationStateFactory implements IOrientationStateFactory {

    @Override
    public ILayouterCreator createLayouterCreator(RecyclerView.LayoutManager lm) {
        return new RTLRowsCreator(lm);
    }

    @Override
    public IRowStrategyFactory createRowStrategyFactory() {
        return new RTLRowStrategyFactory();
    }

    @Override
    public IBreakerFactory createDefaultBreaker() {
        return new RTLRowBreakerFactory();
    }
}
