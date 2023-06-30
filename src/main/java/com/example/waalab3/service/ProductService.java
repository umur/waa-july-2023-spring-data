package com.example.waalab3.service;

import com.example.waalab3.entity.Category;
import com.example.waalab3.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product create(Product product);
    Product update(Product product);
    void deleteProductById(Long id);
    List<Product> findAllByPriceGreaterThanEqual(Double minPrice);
    List<Product> findAllByCategoryAndPriceLessThan(Category cat, Double maxPrice);
    List<Product> findAllByNameContaining(String keyword);
    List<Product> findAllByReviewsId(Long id);
}
