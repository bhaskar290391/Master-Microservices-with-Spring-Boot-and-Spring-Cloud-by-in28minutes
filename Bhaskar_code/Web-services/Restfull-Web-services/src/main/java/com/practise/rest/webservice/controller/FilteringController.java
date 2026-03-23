package com.practise.rest.webservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.practise.rest.webservice.entity.SomeBean;
import com.practise.rest.webservice.entity.View;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public SomeBean filtering() {
		return new SomeBean("value1","value2","value3");
	}
	
	@GetMapping("/filtering-list")
	public List<SomeBean> filteringList() {
		return Arrays.asList(new SomeBean("value1","value2","value3"),
				new SomeBean("value4","value5","value6"));
	}
	
	@GetMapping("/filtering-view")
	@JsonView(View.view1.class)
	public SomeBean filteringview() {
		return new SomeBean("value1","value2","value3");
	}
	
	@GetMapping("/filtering-list-views")
	@JsonView(View.view2.class)
	public List<SomeBean> filteringListView() {
		return Arrays.asList(new SomeBean("value1","value2","value3"),
				new SomeBean("value4","value5","value6"));
	}
}
