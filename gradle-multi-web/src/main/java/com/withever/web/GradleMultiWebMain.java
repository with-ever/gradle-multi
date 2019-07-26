package com.withever.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.withever")
public class GradleMultiWebMain {
	public static void main(String[] args) {
		SpringApplication.run(GradleMultiWebMain.class, args);
	}
}
