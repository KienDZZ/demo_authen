package com.vti.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/test")
@CrossOrigin("*")
public class TestController {

	@GetMapping()
	public String test() {
		return "haahaahaah";
	}
}
