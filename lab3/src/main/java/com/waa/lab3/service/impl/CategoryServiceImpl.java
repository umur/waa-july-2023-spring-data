package com.waa.lab3.service.impl;

import com.waa.lab3.model.Category;
import com.waa.lab3.repository.CategoryRepo;
import com.waa.lab3.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;
    @Override
    public List<Category> findAll() {
        return (List<Category>) categoryRepo.findAll();
    }

    @Override
    public Optional<Category> findByID(int id) {
        return categoryRepo.findById(id);
    }

    @Override
    public Category save(Category category) {
        categoryRepo.save(category);
        return category;
    }

    @Override
    public void delete(int id) {
        categoryRepo.deleteById(id);
    }
}
