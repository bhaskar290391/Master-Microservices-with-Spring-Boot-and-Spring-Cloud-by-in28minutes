package com.practise.microservice.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practise.microservice.limitsservice.bean.Limits;
import com.practise.microservice.limitsservice.config.LimitsConfiguration;

@RestController
public class LimitsController {

	@Autowired
	private LimitsConfiguration configuration;

	@GetMapping("/limits")
	public Limits retrieveLimits() {
		// return new Limits(1,1000);
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
	}
}
