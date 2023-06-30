package com.waa.assignment_three.service;


import com.waa.assignment_three.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();

//    void updateById(Long id, Category category);

    void updateById(Long id, Category category);

    void save(Category category);

    void deleteById(Long id);
}
