package com.example.CardDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCreationController {
	@GetMapping(path = "/getName")
	public String getName() {
		return "Hello WOrld";
	}

}
