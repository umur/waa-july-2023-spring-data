package com.example.waalab3.controller;

import com.example.waalab3.entity.Category;
import com.example.waalab3.entity.Product;
import com.example.waalab3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getAllProducts() {
        return categoryService.getAllCategories();
    }
    @GetMapping("/allByPrice")
    public List<Category> getAllByPrice(@PathVariable Double maxPrice) {
        return categoryService.findAllByProductsPriceLessThanEqual(maxPrice);
    }
    @PostMapping("/save")
    public Category saveCategory(@RequestBody Category category) {
        return categoryService.saveCategory(category);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategoryById(id);
    }


}
