package com.seongjun.chap0102eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
/* 해당 어플리케이션을 Client 설정하는 어노테이션 */
@EnableDiscoveryClient
public class Chap0102EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chap0102EurekaClientApplication.class, args);
    }

}
