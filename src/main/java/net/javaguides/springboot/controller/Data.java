package net.javaguides.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Data {
	@GetMapping("/welcome/{name}")
	public String welcome(@PathVariable("name") String name) {
		return "Hi "+name+", Welcome to my spring boot app";
	}

}
