package com.ohgiraffers.userservice.controller;

import com.ohgiraffers.userservice.dto.CreateUserRequest;
import com.ohgiraffers.userservice.dto.UserInfoResponse;
import com.ohgiraffers.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final Environment env;
    private final UserService userService;

    @GetMapping("/health")
    public String status() {
        return "I'm Working in User Service " + env.getProperty("local.server.port")
                + ", test message : " + env.getProperty("test.message");
    }

    /* 회원 가입 기능 */
    @PostMapping("/users")
    public ResponseEntity<Void> createUser(@RequestBody CreateUserRequest newUser) {

        userService.createUser(newUser);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    /* 특정 유저 조회 기능 */
    @GetMapping("/users/{id}")
    public ResponseEntity<UserInfoResponse> getUserInfoById(@PathVariable Long id) {
        UserInfoResponse userInfoResponse = userService.getUserInfoById(id);

        return ResponseEntity.ok(userInfoResponse);
    }

}







