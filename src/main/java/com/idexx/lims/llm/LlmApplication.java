package com.idexx.lims.llm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LlmApplication {
	@Value("${foobar:YUCKO}")
	private String foobar;

	public static void main(String[] args) {
		SpringApplication.run(LlmApplication.class, args);
	}

	@GetMapping("/hello")
	public String sayHello() {
		return String.format("Running in %s This is a nice application!", foobar);
	}
}
