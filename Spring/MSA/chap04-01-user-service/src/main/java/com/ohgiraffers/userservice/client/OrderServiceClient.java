package com.ohgiraffers.userservice.client;

import com.ohgiraffers.userservice.config.FeignClientConfig;
import com.ohgiraffers.userservice.dto.OrderInfoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(name="goorm-order-service", url="localhost:8000")
@FeignClient(name="goorm-order-service", url="localhost:8000", configuration = FeignClientConfig.class)
public interface OrderServiceClient {

    @GetMapping("/order-service/orders/users/{id}")
    List<OrderInfoResponse> getUserOrders(@PathVariable("id") Long id);
}
