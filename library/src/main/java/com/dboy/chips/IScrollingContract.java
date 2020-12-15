package com.dboy.chips;

interface IScrollingContract {
    void setScrollingEnabledContract(boolean isEnabled);

    boolean isScrollingEnabledContract();

    void setSmoothScrollbarEnabled(boolean enabled);

    boolean isSmoothScrollbarEnabled();
}
