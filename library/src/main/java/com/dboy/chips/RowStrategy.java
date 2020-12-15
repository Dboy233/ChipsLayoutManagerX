package com.dboy.chips;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({com.dboy.chips.ChipsLayoutManager.STRATEGY_DEFAULT,
        com.dboy.chips.ChipsLayoutManager.STRATEGY_FILL_SPACE,
        com.dboy.chips.ChipsLayoutManager.STRATEGY_FILL_VIEW,
        com.dboy.chips.ChipsLayoutManager.STRATEGY_CENTER,
        com.dboy.chips.ChipsLayoutManager.STRATEGY_CENTER_DENSE
})
@Retention(RetentionPolicy.SOURCE)
public @interface RowStrategy {}
