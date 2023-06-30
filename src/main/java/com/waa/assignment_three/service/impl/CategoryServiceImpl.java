package com.waa.assignment_three.service.impl;

import com.waa.assignment_three.entity.Category;
import com.waa.assignment_three.repository.CategoryRepo;
import com.waa.assignment_three.service.CategoryService;
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
        return categoryRepo.findAll();
    }

    @Override
    public void updateById(Long id, Category category) {
        Optional<Category> existingCategory = categoryRepo.findById(id);
        if(existingCategory.isEmpty()) throw new RuntimeException("The category doesn't exist");

        existingCategory.get().setName(category.getName());

        categoryRepo.save(existingCategory.get());
    }

    @Override
    public void save(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public void deleteById(Long id) {
        categoryRepo.deleteById(id);
    }
}
