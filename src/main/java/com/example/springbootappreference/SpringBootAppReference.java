package com.example.springbootappreference;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootAppReference {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppReference.class, args);
	}

	@GetMapping("/")
	public String index(String name) {
		return "Hello World!!!";
	}

}
