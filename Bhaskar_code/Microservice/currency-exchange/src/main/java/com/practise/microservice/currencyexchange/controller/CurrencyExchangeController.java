package com.practise.microservice.currencyexchange.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practise.microservice.currencyexchange.entity.CurrencyExchange;
import com.practise.microservice.currencyexchange.entity.CurrencyExchangeRepo;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private CurrencyExchangeRepo repo;
	
	@Autowired
	private Environment environment;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveCurrencyData(@PathVariable String from, @PathVariable String to) {
		CurrencyExchange currencyExchange = repo.findByFromAndTo(from, to);
		String property = environment.getProperty("local.server.port");
		currencyExchange.setEnvironment(property);
		return currencyExchange;
	}
}
