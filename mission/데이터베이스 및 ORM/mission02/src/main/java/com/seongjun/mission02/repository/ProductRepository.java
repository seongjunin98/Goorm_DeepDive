package com.seongjun.mission02.repository;

import com.seongjun.mission02.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
