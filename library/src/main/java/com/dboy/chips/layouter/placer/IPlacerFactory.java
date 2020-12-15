package com.dboy.chips.layouter.placer;

public interface IPlacerFactory {
    IPlacer getAtStartPlacer();
    IPlacer getAtEndPlacer();
}
