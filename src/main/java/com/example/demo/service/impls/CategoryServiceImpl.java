package com.example.demo.service.impls;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository repository;

    @Override
    public List<Category> getAll() {
        return repository.findAll();
    }

    @Override
    public Category save(Category entity) {
        return repository.save(entity);
    }

    @Override
    public Category getById(Long id) {
        return repository.findById(id).orElseThrow(()->new RuntimeException("category not found"));
    }

    @Override
    public Category put(Long id, Category entity) {
        entity.setId(id);
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
