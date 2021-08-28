package com.parameta.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ServicioRestParametaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioRestParametaApplication.class, args);
	}

}
