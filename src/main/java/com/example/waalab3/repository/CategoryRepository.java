package com.example.waalab3.repository;

import com.example.waalab3.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findAllByProductsPriceLessThanEqual(Double maxPrice);

}
