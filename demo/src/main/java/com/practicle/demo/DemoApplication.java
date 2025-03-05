package com.practicle.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// code updated according to the lab04 instructions
	// @GetMapping("/greet")
	// public String rootEndpoint() {
	// 	String message = "Welcome to Spring Boot!";
	// 	return message;
	// }
	

	
    // Personalized greeting using a path variable
    // @GetMapping("/greet/{name}")
    // public String pathVariableGreeting(@PathVariable String name) {
    //     return "Hello, " + name + "! Welcome to Spring Boot!";
    // }

	 // Personalized greeting using a path variable
	 @GetMapping("/greet/{name}")
	 public String pathVariableGreeting(@PathVariable String name, 
										@RequestParam(name = "message", required = false) String message) {
			 return "Hello " + name + "! " + message;	
	 }
 }
