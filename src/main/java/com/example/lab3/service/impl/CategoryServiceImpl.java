package com.example.lab3.service.impl;

import com.example.lab3.entity.Category;
import com.example.lab3.repository.CategoryRepository;
import com.example.lab3.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repository;

    @Override
    public List<Category> getAllCategories() {
        return repository.findAll();
    }

    @Override
    public Optional<Category> getCategoryById(long categoryId) {
        return repository.findById(categoryId);
    }

    @Override
    public void create(Category category) {
        repository.save(category);
    }

    @Override
    public Category update(Category category) {
        return repository.save(category);
    }

    @Override
    public void delete(long categoryId) {
        repository.deleteById(categoryId);
    }
}
