package com.myapp.spring;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ibm")
public class MyApi {

	public MyApi() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/")
	public String sayHello() {
		return "Current date "+LocalDate.now()+" Current Time "+LocalTime.now();
	}
	
	@GetMapping("/hello1/{name}")
	public String sayHello1(@PathVariable("name")  String name) {
		return "Hello "+name+"Current date "+LocalDate.now()+" Current Time "+LocalTime.now();
	}
}
