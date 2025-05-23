package com.seongjun.chap03springcloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
/*
*
* */
public class Chap03SpringCloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chap03SpringCloudGatewayApplication.class, args);
    }

}
