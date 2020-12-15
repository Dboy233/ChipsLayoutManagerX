package com.dboy.chips.layouter;

import android.graphics.Rect;
import android.view.View;

import com.dboy.chips.IBorder;

public interface ICanvas extends com.dboy.chips.IBorder {
    Rect getCanvasRect();

    Rect getViewRect(View view);

    boolean isInside(Rect rectCandidate);

    boolean isInside(View viewCandidate);

    boolean isFullyVisible(View view);

    boolean isFullyVisible(Rect rect);

    /** calculate border state of layout manager after filling children*/
    void findBorderViews();

    View getTopView();

    View getBottomView();

    View getLeftView();

    View getRightView();

    Integer getMinPositionOnScreen();

    Integer getMaxPositionOnScreen();

    boolean isFirstItemAdded();
}
