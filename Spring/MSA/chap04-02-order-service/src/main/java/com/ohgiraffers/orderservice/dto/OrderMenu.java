package com.ohgiraffers.orderservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderMenu {
    private int orderCode;
    private int menuCode;
    private int orderAmount;
}
