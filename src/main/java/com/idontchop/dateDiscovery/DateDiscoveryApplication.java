package com.idontchop.dateDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DateDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DateDiscoveryApplication.class, args);
	}

}
