package com.TestApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAppController {

	@GetMapping(value="/get")
	public String get() {
		return "Hi ";
	}
}
