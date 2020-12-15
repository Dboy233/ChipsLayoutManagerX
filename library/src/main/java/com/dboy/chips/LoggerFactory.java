package com.dboy.chips;

import android.util.SparseArray;
import android.view.View;

import androidx.annotation.NonNull;

public class LoggerFactory {
    @NonNull
    public  IFillLogger getFillLogger(SparseArray<View> viewCache) {
        return new  FillLogger(viewCache);
    }

}
