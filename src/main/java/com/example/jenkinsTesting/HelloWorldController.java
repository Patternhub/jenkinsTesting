package com.example.jenkinsTesting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
	@GetMapping("/grettings")
	public String hello() {
		return "Hello Sai";
	}
}
