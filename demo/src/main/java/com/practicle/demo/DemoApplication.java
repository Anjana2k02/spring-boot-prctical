package com.practicle.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String rootEndpoint() {
		String message = "Hello, World!";
		return message;
	}
	

	 // Modified '/hello' endpoint to accept a query parameter 'name'
	 String name = "Amith";
	 @GetMapping("/hello")
	 public String helloEndpoint(@RequestParam(name = "name", defaultValue = "Guest") String name) {
		 return "Hello, " + name + "!";
	 }
	

}
