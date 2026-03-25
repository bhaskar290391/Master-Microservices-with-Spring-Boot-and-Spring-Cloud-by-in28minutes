package com.practise.microservice.currencyexchange.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitBreakerControllers {

	@GetMapping("/sample-api")
	public String getApi() {
		return "sample API";
	}
}
