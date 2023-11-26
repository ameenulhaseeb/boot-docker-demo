package com.ami.boot.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootDockerDemoApplication {

	@GetMapping("message")
	public String getMessage() {
		return "Hello welcome to Docker with new actions";
	}
	public static void main(String[] args) {
		SpringApplication.run(BootDockerDemoApplication.class, args);
	}

}
