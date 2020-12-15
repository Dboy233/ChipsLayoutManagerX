package com.dboy.chips;

import android.view.View;

import com.dboy.chips.layouter.IStateFactory;

public class StateHelper {
    public static boolean isInfinite(IStateFactory stateFactory) {
        return stateFactory.getSizeMode() == View.MeasureSpec.UNSPECIFIED
                && stateFactory.getEnd() == 0;
    }
}
