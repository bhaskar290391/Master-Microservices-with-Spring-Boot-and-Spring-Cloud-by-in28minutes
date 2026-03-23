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
		return new PersonV2(new Name("Bhaskar", " Mudaliyar"));
	}

	@GetMapping(path = "/person", params = "version=1")
	public PersonV1 versioningPerson1UsingParam() {
		return new PersonV1("Bhaskar Mudaliyar");
	}

	@GetMapping(path = "/person", params = "version=2")
	public PersonV2 versioningPerson2UsingParam() {
		return new PersonV2(new Name("Bhaskar", " Mudaliyar"));
	}

	@GetMapping(path = "/person", headers = "x-api-version=1")
	public PersonV1 versioningPerson1UsingHeaders() {
		return new PersonV1("Bhaskar Mudaliyar");
	}

	@GetMapping(path = "/person", headers = "x-api-version=2")
	public PersonV2 versioningPerson2UsingHeaders() {
		return new PersonV2(new Name("Bhaskar", " Mudaliyar"));
	}
	
	
	@GetMapping(path = "/persons", produces = "applications/test1")
	public PersonV1 versioningPerson1UsingHeaderAccept() {
		return new PersonV1("Bhaskar Mudaliyar");
	}

	@GetMapping(path = "/persons", produces = "applications/test2")
	public PersonV2 versioningPerson2UsingHeaderAccept() {
		return new PersonV2(new Name("Bhaskar", " Mudaliyar"));
	}
}
