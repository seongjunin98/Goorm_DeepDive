package com.ohgiraffers.orderservice.controller;

import com.ohgiraffers.orderservice.dto.OrderResponse;
import com.ohgiraffers.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    /* 특정 유저가 주문한 주문 목록 조회 ex) 1번 유저가 주문한 주문 목록 확인하기 */
    @GetMapping("/orders/users/{id}")
    public ResponseEntity<List<OrderResponse>> getUserOrders(@PathVariable Long id) {

        List<OrderResponse> orderList = orderService.getOrdersByUserId(id);

        return ResponseEntity.ok(orderList);
    }



}
