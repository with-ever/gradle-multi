package com.withever.blind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.withever.*"})
@EnableAutoConfiguration(exclude = { DataSourceTransactionManagerAutoConfiguration.class, DataSourceAutoConfiguration.class })
@EnableJpaRepositories(basePackages = {"com.withever.*"})
@ComponentScan(basePackages = "com.withever")
public class BlindApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlindApplication.class, args);
	}

}
