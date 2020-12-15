package com.dboy.chips;

import androidx.recyclerview.widget.RecyclerView;

interface IDisappearingViewsManager {
    com.dboy.chips.DisappearingViewsManager.DisappearingViewsContainer getDisappearingViews(RecyclerView.Recycler recycler);

    int calcDisappearingViewsLength(RecyclerView.Recycler recycler);

    int getDeletingItemsOnScreenCount();

    void reset();
}
