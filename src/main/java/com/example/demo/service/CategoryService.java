package com.example.demo.service;

import com.example.demo.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();

    Category save(Category category);

    Category getById(Long id);

    Category put(Long id, Category category);

    void delete(Long id);
}
