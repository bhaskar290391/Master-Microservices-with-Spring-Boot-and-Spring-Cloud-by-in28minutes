package com.practise.rest.webservice.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningController {

	@GetMapping("/v1/person")
	public PersonV1 versioningPerson1() {
		return new PersonV1("Bhaskar Mudaliyar"); 
	}
	
	@GetMapping("/v2/person")
	public PersonV2 versioningPerson2() {
		return new PersonV2(new Name("Bhaskar"," Mudaliyar")); 
	}
}
