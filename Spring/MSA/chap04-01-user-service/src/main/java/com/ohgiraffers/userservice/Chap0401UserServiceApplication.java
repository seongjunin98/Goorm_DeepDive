package com.ohgiraffers.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Chap0401UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chap0401UserServiceApplication.class, args);
    }

}
