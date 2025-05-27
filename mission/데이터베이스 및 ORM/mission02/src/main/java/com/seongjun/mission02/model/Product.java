package com.seongjun.mission02.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "products_inventory")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;

    @Column(name = "product_code")
    private String productCode;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "stock_quantity")
    private int stockQuantity;

    @Column(name = "description")
    private String description;

    @Column(name = "sku")
    private String sku;

    @Column(name = "category")
    private String category;

    @Column(name = "manufacture_date")
    private LocalDate manufactureDate;

    @Column(name = "last_update_time")
    private LocalTime lastUpdateTime;

    @Column(name = "registered_datetime")
    private LocalDateTime registeredDatetime;

    @Column(name = "warranty_end_date")
    private LocalDateTime warrantyEndDate;

}
