package com.learning.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springboot.CurrencyServiceConfiguration;

@RestController
public class CurrencyServiceController {

	@Autowired
	private CurrencyServiceConfiguration properties;

	@GetMapping("/currencies")
	public CurrencyServiceConfiguration retrieveCourseData() {

		return properties;
	}
}
