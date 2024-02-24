package com.ma.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MaEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaEurekaServerApplication.class, args);
    }

}
