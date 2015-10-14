package com.kthree.resources.jax.ws;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.kthree.resources.jax.contract.CurrencyConvertionService;

/**
 * @author Datla
 *
 */
@WebService(name = "CurrencyConvertionPortType", targetNamespace = "http://com.kthree.resources.jax.ws/")
public interface CurrencyConvertionServiceJaxWs extends
		CurrencyConvertionService {

	@WebMethod(operationName = "currencyConvertion")
	public Double convert(@WebParam(name = "fromCurrency") String fromCurrency,
			@WebParam(name = "toCurrency") String toCurrency,
			@WebParam(name = "currencyAmount") Double fromCurrencyAmount,
			@WebParam(name = "date") Date date);

	@WebMethod(operationName = "getCurrencyExchangeRate")
	public Double getExchangeRate(
			@WebParam(name = "fromCurrency") String fromCurrency,
			@WebParam(name = "toCurrency") String toCurrency);

}
