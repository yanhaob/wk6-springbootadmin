package com.example.sbaserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class SbaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbaserverApplication.class, args);
	}

}
