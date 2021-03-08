package com.td.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	@GetMapping("/")
	public String index() { 
		return "Hello World!!!";
	}
	 
	@GetMapping("/home")
	public String home() { 
		return "Home Page!!!";
	}
}
