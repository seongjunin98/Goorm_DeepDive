package com.ohgiraffers.orderservice.mapper;

import com.ohgiraffers.orderservice.dto.OrderResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<OrderResponse> selectOrdersByUserId(Long id);
}
