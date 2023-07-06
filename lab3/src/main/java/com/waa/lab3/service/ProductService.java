package com.waa.lab3.service;

import com.waa.lab3.model.Category;
import com.waa.lab3.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {
    List<Product> findAll();

    Optional<Product> findByID(int id);

    void save(Product product);

//    void update(int id);

    void delete(int id);

    List<Product> findByPriceGreaterThan(double minPrice);

    List<Product> findByCategoryAndAndPriceLessThan(Category category, double maxPrice);

    List<Product> findByNameContaining(String keyword);
}
