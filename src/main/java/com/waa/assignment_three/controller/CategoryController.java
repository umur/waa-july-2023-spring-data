package com.waa.assignment_three.controller;

import com.waa.assignment_three.entity.Category;
import com.waa.assignment_three.entity.User;
import com.waa.assignment_three.service.CategoryService;
import com.waa.assignment_three.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public List<Category> findAll(){
        return categoryService.findAll();
    }

    @PostMapping
    public void save(@RequestBody Category category){
        categoryService.save(category);
    }

    @PutMapping("/{id}")
    public void updateById(@PathVariable Long id, @RequestBody Category category){
        categoryService.updateById(id, category);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        categoryService.deleteById(id);
    }
}
