package com.kthree.resources.jax.contract;

import java.util.Date;

/**
 * @author Datla
 *
 */
public interface CurrencyConvertionService {
	 public Double convert(String fromCurrency,String toCurrency,Double fromCurrencyAmount,Date date);
	 public Double getExchangeRate(String fromCurrency,String toCurrency);
			
}
