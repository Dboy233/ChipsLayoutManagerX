package com.dboy.chips.cache;

import androidx.recyclerview.widget.RecyclerView;

public class ViewCacheFactory {

    private RecyclerView.LayoutManager layoutManager;

    public ViewCacheFactory(RecyclerView.LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }

    public IViewCacheStorage createCacheStorage() {
        return new ViewCacheStorage(layoutManager);
    }
}
