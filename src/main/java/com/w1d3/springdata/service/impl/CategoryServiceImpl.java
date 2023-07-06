package com.w1d3.springdata.service.impl;

import com.w1d3.springdata.entity.Category;
import com.w1d3.springdata.repository.CategoryRepo;
import com.w1d3.springdata.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepo categoryRepo;


    @Override
    public List<Category> findAll() {
        return (List<Category>) categoryRepo.findAll();
    }

    @Override
    public void save(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public Category findById(int id) {
        return categoryRepo.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        categoryRepo.deleteById(id);
    }
}
