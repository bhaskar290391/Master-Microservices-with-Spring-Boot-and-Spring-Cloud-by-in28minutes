package com.practise.microservice.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practise.microservice.entity.CurrencyConversion;
import com.practise.microservice.feign.CurrencyExchangeFiegnClient;

@RestController
public class CurrencyConversionController {

	private CurrencyExchangeFiegnClient client;
	
	public CurrencyConversionController(CurrencyExchangeFiegnClient client) {
		super();
		this.client = client;
	}

	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion retrieveCurrencyConversionData(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		CurrencyConversion currencyConversion = client.retrieveCurrencyData(from, to);
		currencyConversion.setQuantity(quantity);
		currencyConversion.setTotalCalculatedAmount(quantity.multiply(currencyConversion.getConversionMultiple()));
		return currencyConversion;
	}



	
}
