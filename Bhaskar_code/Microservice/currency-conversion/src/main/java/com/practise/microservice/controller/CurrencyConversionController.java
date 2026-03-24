package com.practise.microservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practise.microservice.entity.CurrencyConversion;

@RestController
public class CurrencyConversionController {

	@Autowired
	private Environment environment;

	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion retrieveCurrencyConversionData(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		CurrencyConversion currencyConversion = new CurrencyConversion(1000L, from, to, quantity, BigDecimal.ONE,
				BigDecimal.TWO, "");
		String property = environment.getProperty("local.server.port");
		currencyConversion.setEnvironment(property);
		return currencyConversion;
	}
}
