package com.dboy.chips.layouter.placer;

import androidx.recyclerview.widget.RecyclerView;

abstract class AbstractPlacer implements IPlacer {

    private RecyclerView.LayoutManager layoutManager;

    AbstractPlacer(RecyclerView.LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }

    public RecyclerView.LayoutManager getLayoutManager() {
        return layoutManager;
    }
}
