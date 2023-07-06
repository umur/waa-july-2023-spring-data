package com.waa.lab3.controller;

import com.waa.lab3.model.Category;
import com.waa.lab3.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public List<Category> findAll(){
        return categoryService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Category> findByID(@PathVariable int id){
        return categoryService.findByID(id);
    }

    @PostMapping
    public void createCategory(@RequestBody Category category){
        categoryService.save(category);
    }

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable int id, @RequestBody Category category){
        category.setId(id);
       return categoryService.save(category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable int id){
        categoryService.delete(id);
    }

}
