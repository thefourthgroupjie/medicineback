package com.xb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.xb.mapper")
public class CluodProviderLxjApplication {

    public static void main(String[] args) {
        SpringApplication.run(CluodProviderLxjApplication.class, args);
    }

}
