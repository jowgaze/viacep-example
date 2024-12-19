package com.viacep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ViacepExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViacepExampleApplication.class, args);
	}

}
