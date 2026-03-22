package com.practise.rest.webservice.controller;

import java.util.Locale;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practise.rest.webservice.model.HelloWorldBean;

@RestController
public class HelloWorldController {

	@Autowired
	private MessageSource source;
	
	@GetMapping(path = "/helloWorld")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping(path = "/helloWorldBean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}

	@GetMapping(path = "/helloWorld/pathvariable/{name}")
	public HelloWorldBean helloWorldPathvariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World , %s ", name));
	}
	
	
	@GetMapping(path = "/helloWorld/i18n")
	public String helloWorldI18n() {
		
		Locale locale =LocaleContextHolder.getLocale();
		return source.getMessage("good.morning.message", null, "Defualt Messages", locale );
		
	}
}
