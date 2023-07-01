package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
@AllArgsConstructor
@RequestMapping("/categories")
public class CategoryController {
    private final CategoryService service;


    @GetMapping
    public List<Category> getList(
            ){
        return service.getAll();
    }

    @PostMapping
    public Category save(@RequestBody Category category){
        return service.save(category);
    }


    @GetMapping("/id")
    public Category getOne(@PathVariable Long id){
        return service.getById(id);
    }


    @PutMapping("/id")
    public Category update(@PathVariable Long id,@RequestBody Category category){
        return service.put(id,category);
    }


    @DeleteMapping("/id")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }




}
