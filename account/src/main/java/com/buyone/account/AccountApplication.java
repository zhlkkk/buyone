package com.buyone.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.buyone")
@EnableJpaRepositories("com.buyone")
public class AccountApplication extends WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}
}
