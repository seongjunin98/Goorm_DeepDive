package com.seongjun.mission02.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    private int productId;
    private String productCode;
    private String productName;
    private BigDecimal price;
    private int stockQuantity;
    private String description;
    private String sku;
    private String category;
    private LocalDate manufactureDate;
    private LocalTime lastUpdateTime;
    private LocalDateTime registeredDatetime;
    private LocalDateTime warrantyEndDate;

}
