package com.example.lab3.service;

import com.example.lab3.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAllProducts();

    Optional<Product> getProductById(long productId);

    void create(Product product);

    Product update(Product product);

    void delete(long productId);

    List<Product> getByMinPrice(Double price);

    List<Product> getByCategoryAndMaxPrice(Long catId, Double price);

    List<Product> getByKeyword(String keyword);
}
