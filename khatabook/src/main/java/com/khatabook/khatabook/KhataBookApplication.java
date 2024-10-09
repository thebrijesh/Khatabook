package com.khatabook.khatabook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class KhataBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(KhataBookApplication.class, args);
	}

}
