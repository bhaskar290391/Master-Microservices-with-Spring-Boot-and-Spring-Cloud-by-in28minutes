package com.practise.microservice.currencyexchange.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practise.microservice.currencyexchange.entity.CurrencyExchange;

@RestController
public class CurrencyExchangeController {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveCurrencyData(@PathVariable String from, @PathVariable String to) {
		return new CurrencyExchange(1000l, from, to, BigDecimal.valueOf(55));
	}
}
