package com.seongjun.chap0201firstservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Chap0201FirstServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chap0201FirstServiceApplication.class, args);
    }

}
