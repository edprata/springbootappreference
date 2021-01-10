package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

	private static Long count = 1L;

	@GetMapping("/api/hello")
	public String index(String name) {
		return "Hello World!!!";
	}

	@GetMapping("/api/helloWithName")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/api/hello/pessoa/get")
	public Pessoa hello2(@RequestParam(value = "name", defaultValue = "Zé Ninguém") String name) {
		return new Pessoa(count++, name);
	}

	public static class Pessoa {

		private Long id;
		private String name;

		public Pessoa (Long id, String name) {
			this.id = id;
			this.name = name;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName (String name) {
			this.name = name;
		}

	}
}