package w1d4.springdata.service;

import w1d4.springdata.entity.Category;

import java.util.List;

public interface CategoryService {
    Category create(Category category);

    List<Category> findAll();

    Category findById(Long id);

    Category update(Long id, Category category);

    void delete(Long id);
}
