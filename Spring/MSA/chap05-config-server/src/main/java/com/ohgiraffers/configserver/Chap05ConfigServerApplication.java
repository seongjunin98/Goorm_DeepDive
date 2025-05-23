package com.ohgiraffers.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
/*
* UserService 의 Token 정보를 외부의 파일 경로에 위치 시킨다.
* */
public class Chap05ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Chap05ConfigServerApplication.class, args);
	}

}
