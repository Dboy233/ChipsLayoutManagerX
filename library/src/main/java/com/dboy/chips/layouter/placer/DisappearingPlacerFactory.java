package com.dboy.chips.layouter.placer;

import androidx.recyclerview.widget.RecyclerView;

class DisappearingPlacerFactory implements IPlacerFactory {

    private RecyclerView.LayoutManager layoutManager;

    DisappearingPlacerFactory(RecyclerView.LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }

    @Override
    public IPlacer getAtStartPlacer() {
        return new DisappearingViewAtStartPlacer(layoutManager);
    }

    @Override
    public IPlacer getAtEndPlacer() {
        return new DisappearingViewAtEndPlacer(layoutManager);
    }
}
