package com.srijan.restclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.web.exchanges.InMemoryHttpExchangeRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestClientApplication.class, args);
	}
    //application tracing
	@Bean
	public InMemoryHttpExchangeRepository createTraceRepository() {
		return new InMemoryHttpExchangeRepository();
	}

}
