package com.seongjun.chap0201firstservice;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {

    private final Environment environment;

    public FirstController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/health")
    public String health() {
        return "나는 잘 살아있어 내 포트는 = " + environment.getProperty("local.server.port");
    }
}
