package com.kthree.resources.domain.constants;


/**
 * @author Datla
 *
 */
public enum ExchangeRates {

    RUBUSD(0.75),
    RUBEUR(0.45),
    RUBJPY(1.25),
    RUBRUB(1.0),
    USDRUB(1.37),
    USDJPY(1.9),
    USDEUR(0.9),
    USDUSD(1.0),
    EURUSD(1.4),
    EURRUB(1.9),
    EURJPY(2.4),
    EUREUR(1.0),
    JPYRUB(0.9),
    JPYUSD(0.7),
    JPYEUR(0.2),
    JPYJPY(1.0);

    private final Double rate;

    ExchangeRates(Double rate) {
        this.rate = rate;
    }

    public Double getRate(){
        return rate;
    }
}
