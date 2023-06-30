package com.example.waalab3.repository;

import com.example.waalab3.entity.Category;
import com.example.waalab3.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByPriceGreaterThanEqual(Double minPrice);
    List<Product> findAllByCategoryAndPriceLessThan(Category cat, Double maxPrice);
    List<Product> findAllByNameContaining(String keyword);
    List<Product> findAllByReviewsId(Long id);


}
