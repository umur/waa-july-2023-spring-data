package com.example.lab3.service;

import com.example.lab3.entity.Category;


import java.util.List;

public interface CategoryService {
    public List<Category> getAllCategories();
    public Category getCategoryById(Long id);
    public Category createCategory(Category category);
    public Category updateCategory(Long id, Category updatedCategory);
    public void deleteCategory(Long id);
}
