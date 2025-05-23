package com.seongjun.chap0202secondservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Chap0202SecondServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chap0202SecondServiceApplication.class, args);
    }

}
