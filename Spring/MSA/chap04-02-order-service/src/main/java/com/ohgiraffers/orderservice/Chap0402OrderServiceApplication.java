package com.ohgiraffers.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Chap0402OrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chap0402OrderServiceApplication.class, args);
    }

}
