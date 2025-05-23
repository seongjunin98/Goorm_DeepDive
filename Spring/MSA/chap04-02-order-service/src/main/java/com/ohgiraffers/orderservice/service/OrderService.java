package com.ohgiraffers.orderservice.service;

import com.ohgiraffers.orderservice.dto.OrderResponse;
import com.ohgiraffers.orderservice.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderMapper orderMapper;

    public List<OrderResponse> getOrdersByUserId(Long id) {
        return orderMapper.selectOrdersByUserId(id);
    }
}
