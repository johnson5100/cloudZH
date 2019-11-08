package com.spring.service_zone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceZoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceZoneApplication.class, args);
    }

}
