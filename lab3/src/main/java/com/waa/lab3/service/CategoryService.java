package com.waa.lab3.service;

import com.waa.lab3.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CategoryService {
    List<Category> findAll();

    Optional<Category> findByID(int id);

    Category save(Category category);

    void delete(int id);
}
