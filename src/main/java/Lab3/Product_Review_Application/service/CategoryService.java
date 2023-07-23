package Lab3.Product_Review_Application.service;

import Lab3.Product_Review_Application.entity.Category;

import java.util.List;

public interface CategoryService {
    void addCategory(Category category);
    List<Category> getAllCategories();
    void updateCategory(int id, Category category);
    void deleteCategory(int id);
    Category getCategory(int id);
}
