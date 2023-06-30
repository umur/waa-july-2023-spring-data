package com.example.waalab3.service.impl;

import com.example.waalab3.entity.Category;
import com.example.waalab3.repository.CategoryRepository;
import com.example.waalab3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.getReferenceById(id);
    }

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategoryById(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public List<Category> findAllByProductsPriceLessThanEqual(Double maxPrice) {
        return categoryRepository.findAllByProductsPriceLessThanEqual(maxPrice);
    }

}
