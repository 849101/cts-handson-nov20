package com.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "com.org.model")
@ComponentScan(basePackages = "com.org")
public class SpringBootJpaExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaExerciseApplication.class, args);
	}

}
