package com.example.lab3.controller;

import com.example.lab3.entity.Category;
import com.example.lab3.service.CategoryService;
import com.example.lab3.service.ReviewService;
import com.example.lab3.utils.CustomErrorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<?> getAllCategories() {
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCategoryById(@PathVariable(name = "id") Long categoryId) {
        Optional<Category> category = categoryService.getCategoryById(categoryId);
        if (category.isPresent()) {
            return ResponseEntity.ok(category.get());
        }
        return new ResponseEntity<>(new CustomErrorType("Category " + categoryId + " not found"), HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public void create(@RequestBody Category category) {
        categoryService.create(category);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Category category) {
        return ResponseEntity.ok(categoryService.update(category));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Long categoryId) {
        categoryService.delete(categoryId);
    }


}
