package com.example.lab3.repository;

import com.example.lab3.entity.Category;
import com.example.lab3.entity.Product;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends ListCrudRepository<Product,Long> {
    List<Product> findByCategoryAndPriceLessThan(Category category, double maxPrice);
    List<Product> findByNameContaining(String keyword);

}
