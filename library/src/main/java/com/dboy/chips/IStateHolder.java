package com.dboy.chips;

interface IStateHolder {
    boolean isLayoutRTL();

    @com.dboy.chips.Orientation
    int layoutOrientation();

}
