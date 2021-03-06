package com.ticket.ticket_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TicketServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketServerApplication.class, args);
	}

}
