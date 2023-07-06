package com.waa.lab3.repository;

import com.waa.lab3.model.Category;
import com.waa.lab3.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

    List<Product> findByPriceGreaterThan(double minPrice);

    List<Product> findByCategoryAndAndPriceLessThan(Category category, double maxPrice);

    List<Product> findByNameContaining(String keyword);



}
