package com.dboy.chips;

import android.content.res.Configuration;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;

import com.dboy.chips.anchor.AnchorViewState;
import com.dboy.chips.cache.CacheParcelableContainer;

class ParcelableContainer implements Parcelable {

    private AnchorViewState anchorViewState;
    private SparseArray<Object> orientationCacheMap = new SparseArray<>();
    private SparseArray<Object> cacheNormalizationPositionMap = new SparseArray<>();
    //store previous orientation
    private int orientation;

    ParcelableContainer() {
        //initial values. We should normalize cache when scrolled to zero in case first time of changing layoutOrientation state
        cacheNormalizationPositionMap.put(Configuration.ORIENTATION_PORTRAIT, 0);
        cacheNormalizationPositionMap.put(Configuration.ORIENTATION_LANDSCAPE, 0);
    }

    void putAnchorViewState(AnchorViewState anchorViewState) {
        this.anchorViewState = anchorViewState;
    }

    AnchorViewState getAnchorViewState() {
        return anchorViewState;
    }

    @com.dboy.chips.DeviceOrientation
    int getOrientation() {
        return orientation;
    }

    void putOrientation(@com.dboy.chips.DeviceOrientation int orientation) {
        this.orientation = orientation;
    }

    @SuppressWarnings("unchecked")
    private ParcelableContainer(Parcel parcel) {
        anchorViewState = AnchorViewState.CREATOR.createFromParcel(parcel);
        orientationCacheMap = parcel.readSparseArray(CacheParcelableContainer.class.getClassLoader());
        cacheNormalizationPositionMap = parcel.readSparseArray(Integer.class.getClassLoader());
        orientation = parcel.readInt();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        anchorViewState.writeToParcel(parcel, i);
        parcel.writeSparseArray(orientationCacheMap);
        parcel.writeSparseArray(cacheNormalizationPositionMap);
        parcel.writeInt(orientation);
    }

    void putPositionsCache(@com.dboy.chips.DeviceOrientation int orientation, Parcelable parcelable) {
        orientationCacheMap.put(orientation, parcelable);
    }

    void putNormalizationPosition(@com.dboy.chips.DeviceOrientation int orientation, @Nullable Integer normalizationPosition) {
        cacheNormalizationPositionMap.put(orientation, normalizationPosition);
    }

    @Nullable
    Parcelable getPositionsCache(@com.dboy.chips.DeviceOrientation int orientation) {
        return (Parcelable) orientationCacheMap.get(orientation);
    }

    @IntRange(from = 0)
    @Nullable
    Integer getNormalizationPosition(@com.dboy.chips.DeviceOrientation int orientation) {
        return (Integer) cacheNormalizationPositionMap.get(orientation);
    }

    public static final Creator<ParcelableContainer> CREATOR = new Creator<ParcelableContainer>() {

        @Override
        public com.dboy.chips.ParcelableContainer createFromParcel(Parcel parcel) {
            return new com.dboy.chips.ParcelableContainer(parcel);
        }

        @Override
        public com.dboy.chips.ParcelableContainer[] newArray(int i) {
            return new com.dboy.chips.ParcelableContainer[i];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

}
