package com.praveen.springboottiketbookings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringboottiketbookingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboottiketbookingsApplication.class, args);
	}

}
