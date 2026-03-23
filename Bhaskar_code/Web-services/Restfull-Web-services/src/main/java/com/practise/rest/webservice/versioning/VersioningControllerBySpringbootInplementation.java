package com.practise.rest.webservice.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningControllerBySpringbootInplementation {

	/*
	 
	@GetMapping(value = "/{version}/personsbi", version = "1.0.0")
	public PersonV1 versioningPerson1() {
		return new PersonV1("Bhaskar Mudaliyar");
	}

	@GetMapping(value = "/{version}/personsbi", version = "2.0.0")
	public PersonV2 versioningPerson2() {
		return new PersonV2(new Name("Bhaskar", " Mudaliyar"));
	}

	@GetMapping(path = "/personsbi", version = "1.0.0")
	public PersonV1 versioningPerson1UsingParam() {
		return new PersonV1("Bhaskar Mudaliyar");
	}

	@GetMapping(path = "/personsbi", version = "2.0.0")
	public PersonV2 versioningPerson2UsingParam() {
		return new PersonV2(new Name("Bhaskar", " Mudaliyar"));
	}
	
	*/

}
