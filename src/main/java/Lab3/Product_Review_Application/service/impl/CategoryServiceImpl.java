package Lab3.Product_Review_Application.service.impl;

import Lab3.Product_Review_Application.entity.Category;
import Lab3.Product_Review_Application.repository.CategoryRepo;
import Lab3.Product_Review_Application.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;

    @Override
    public void addCategory(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    @Override
    public void updateCategory(int id, Category category) {
        Category categoryToUpdate = getCategory(id);
        categoryToUpdate.setName(category.getName());
        categoryToUpdate.setProducts(category.getProducts());
        categoryRepo.save(categoryToUpdate);
    }

    @Override
    public void deleteCategory(int id) {
        categoryRepo.deleteById(id);
    }

    @Override
    public Category getCategory(int id) {
        Optional<Category> optionalCategory = categoryRepo.findById(id);
        return optionalCategory.orElseThrow();
    }
}
