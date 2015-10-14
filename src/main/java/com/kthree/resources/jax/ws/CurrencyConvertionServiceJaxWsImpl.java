package com.kthree.resources.jax.ws;

import java.util.Date;

import javax.jws.WebService;

import com.kthree.resources.domain.constants.ExchangeRates;

/**
 * @author Datla
 *
 */
@WebService(portName = "CurrencyConvertionPort",
        serviceName = "CurrencyConvertion",
        targetNamespace = "http://com.kthree.resources.jax.ws/",
        endpointInterface = "com.kthree.resources.jax.ws.CurrencyConvertionServiceJaxWs")
public class CurrencyConvertionServiceJaxWsImpl implements CurrencyConvertionServiceJaxWs {

    public Double convert(String fromCurrency, String toCurrency, Double fromCurrencyAmount, Date date) {
        Date currentDate = new Date();
        Double currentRate;
        if (currentDate.before(date)) {
            currentRate = ExchangeRates.valueOf(fromCurrency + toCurrency).getRate() * 1.5;
        } else if (currentDate.after(date)) {
            currentRate = ExchangeRates.valueOf(fromCurrency + toCurrency).getRate() * 0.75;
        } else {
            currentRate = ExchangeRates.valueOf(fromCurrency + toCurrency).getRate();
        }
        fromCurrencyAmount *= currentRate;
        return fromCurrencyAmount;
    }

    public Double getExchangeRate(String fromCurrency, String toCurrency) {
        return ExchangeRates.valueOf(fromCurrency + toCurrency).getRate();
    }
}
