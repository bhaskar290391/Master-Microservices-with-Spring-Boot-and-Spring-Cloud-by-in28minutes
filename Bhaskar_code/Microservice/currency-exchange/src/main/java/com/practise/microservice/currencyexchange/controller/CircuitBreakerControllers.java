package com.practise.microservice.currencyexchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CircuitBreakerControllers {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/sample-api")
	@Retry(name = "sample-api",fallbackMethod = "fallbackMethod")
	public String getApi() {
		ResponseEntity<String> forEntity = restTemplate.getForEntity("http://dummy-api", String.class);
		return forEntity.getBody();
	}

	public String fallbackMethod(Exception ex) {
		return "Fallback";
	}
}
