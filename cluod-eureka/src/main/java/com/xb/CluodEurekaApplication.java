package com.xb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CluodEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CluodEurekaApplication.class, args);
    }

}
