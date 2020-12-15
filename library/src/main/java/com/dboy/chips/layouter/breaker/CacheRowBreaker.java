package com.dboy.chips.layouter.breaker;

import com.dboy.chips.cache.IViewCacheStorage;
import com.dboy.chips.layouter.AbstractLayouter;

class CacheRowBreaker extends RowBreakerDecorator {

    private IViewCacheStorage cacheStorage;

    CacheRowBreaker(IViewCacheStorage cacheStorage, ILayoutRowBreaker decorate) {
        super(decorate);
        this.cacheStorage = cacheStorage;
    }

    @Override
    public boolean isRowBroke(AbstractLayouter al) {
        boolean stopDueToCache = cacheStorage.isPositionEndsRow(al.getCurrentViewPosition());
        return super.isRowBroke(al) || stopDueToCache;
    }
}
