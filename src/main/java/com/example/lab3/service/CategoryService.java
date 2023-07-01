package com.example.lab3.service;

import com.example.lab3.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<Category> getAllCategories();

    Optional<Category> getCategoryById(long categoryId);

    void create(Category category);

    Category update(Category category);

    void delete(long categoryId);
}
