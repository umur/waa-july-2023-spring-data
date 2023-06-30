package com.example.waalab3.service;

import com.example.waalab3.entity.Category;
import com.example.waalab3.repository.CategoryRepository;

import java.util.List;

public interface CategoryService {

    Category getCategoryById(Long id);
    Category saveCategory(Category category);
    void deleteCategoryById(Long id);
    List<Category> getAllCategories();
    List<Category> findAllByProductsPriceLessThanEqual(Double maxPrice);


}
