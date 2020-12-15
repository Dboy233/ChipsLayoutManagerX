package com.dboy.chips.layouter;

import android.view.View;

import com.dboy.chips.IScrollingController;
import com.dboy.chips.anchor.AnchorViewState;
import com.dboy.chips.anchor.IAnchorFactory;
import com.dboy.chips.layouter.criteria.AbstractCriteriaFactory;
import com.dboy.chips.layouter.criteria.ICriteriaFactory;
import com.dboy.chips.layouter.placer.IPlacerFactory;

public interface IStateFactory {
    @SuppressWarnings("UnnecessaryLocalVariable")
    LayouterFactory createLayouterFactory(ICriteriaFactory criteriaFactory, IPlacerFactory placerFactory);

    AbstractCriteriaFactory createDefaultFinishingCriteriaFactory();

    IAnchorFactory anchorFactory();

    IScrollingController scrollingController();

    ICanvas createCanvas();

    int getSizeMode();

    int getStart();

    int getStart(View view);

    int getStart(AnchorViewState anchor);

    int getStartAfterPadding();

    int getStartViewPosition();

    int getStartViewBound();

    int getEnd();

    int getEnd(View view);

    int getEndAfterPadding();

    int getEnd(AnchorViewState anchor);

    int getEndViewPosition();

    int getEndViewBound();

    int getTotalSpace();
}
