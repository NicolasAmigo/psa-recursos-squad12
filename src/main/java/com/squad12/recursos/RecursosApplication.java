package com.squad12.recursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RecursosApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecursosApplication.class, args);
	}

	@GetMapping("")
	public String main() {
		return "Hola Mundo!";
	}
	@GetMapping("/recursos")
	public String getRecursos() {
		return "Recursos";
	}

}
