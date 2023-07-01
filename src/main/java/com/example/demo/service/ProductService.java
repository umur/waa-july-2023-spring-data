package com.example.demo.service;

import com.example.demo.entity.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(Product product);

    List<Product> getAllProducts(Double minPrice, Double maxPrice, Long categoryId, String keyword);

    Product getById(Long id);

    Product putMapping(Long id, Product product);

    void deleteProduct(Long id);
}
