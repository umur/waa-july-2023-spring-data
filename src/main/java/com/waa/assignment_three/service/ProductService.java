package com.waa.assignment_three.service;

import com.waa.assignment_three.entity.Category;
import com.waa.assignment_three.entity.Product;
import com.waa.assignment_three.entity.Review;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

//    void updateById(Long id, Product product);

    void updateById(Long id, Product product);

    void save(Product product);

    void deleteById(Long id);

    List<Product> findAllByPriceGreaterThan(Double minPrice);

    List<Product> findAllByCategoryAndPriceLessThan(Category category, Double maxPrice);

    List<Product> findAllByNameContains(String keyword);

    List<Review> findAllProductReviews(@PathVariable Long id);
}

