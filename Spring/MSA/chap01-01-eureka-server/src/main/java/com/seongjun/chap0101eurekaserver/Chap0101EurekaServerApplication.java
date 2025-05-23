package com.seongjun.chap0101eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
/*
*   Spring Cloud Netflix 에서 사용되는 어노테이션
*   해당 어플리케이션을 Eureka 서버로 활성화
* */
@EnableEurekaServer
public class Chap0101EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chap0101EurekaServerApplication.class, args);
    }

}
