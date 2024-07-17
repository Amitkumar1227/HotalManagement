package com.lcwd.use.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.lcwd.use.service.Entities.User")
@EnableJpaRepositories("com.lcwd.use.service.Repositories.UserRepository")
@ComponentScan("com.lcwd.use.service.Repositories.UserRepository")
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
