package com.microservicio.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MsserverconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsserverconfigApplication.class, args);
	}

}
