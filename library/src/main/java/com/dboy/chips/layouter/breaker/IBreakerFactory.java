package com.dboy.chips.layouter.breaker;

public interface IBreakerFactory {
    ILayoutRowBreaker createBackwardRowBreaker();

    ILayoutRowBreaker createForwardRowBreaker();
}
