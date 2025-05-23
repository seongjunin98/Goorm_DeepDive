package com.ohgiraffers.orderservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class OrderResponse {
    private int orderCode;
    private String orderDate;
    private String orderTime;
    private List<OrderMenu> orderMenus;
}
