package com.seongjun.mission02.mapper;

import com.seongjun.mission02.model.Product;

import java.util.List;

//@Mapper
public interface ProductMapper {

    int insertProduct(Product product);
    Product selectProductById(int productId);
    List<Product> selectAllProducts();
    int updateProduct(Product product);
    int deleteProduct(int productId);
}
