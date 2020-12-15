package com.dboy.chips.layouter.breaker;

import com.dboy.chips.layouter.AbstractLayouter;

class BackwardBreakerContract extends RowBreakerDecorator{

    private IRowBreaker breaker;

    BackwardBreakerContract(IRowBreaker breaker, ILayoutRowBreaker decorate) {
        super(decorate);
        this.breaker = breaker;
    }

    @Override
    public boolean isRowBroke(AbstractLayouter al) {
        return super.isRowBroke(al) ||
                breaker.isItemBreakRow(al.getCurrentViewPosition());
    }
}
