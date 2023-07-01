package cs544.springData.service.impl;

import cs544.springData.entity.Address;
import cs544.springData.entity.Category;
import cs544.springData.entity.Product;
import cs544.springData.repository.CategoryRepo;
import cs544.springData.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepo categoryRepo;

    @Override
    public List<Category> getCategory() {
        return categoryRepo.findAll();
    }

    @Override
    public String addCategory(Category category) {
        categoryRepo.save(category);
        return "Category added";
    }

    @Override

    public Category updateCategory(Long id, Category category) {
        Optional<Category> category1 = categoryRepo.findById(id);
        if (category1.isPresent()) {

            category1.get().setName(category.getName());
            category1.get().setProducts(category.getProducts());


            categoryRepo.save(category1.get());
        }
        return category1.get();
    }

    @Override

    public Category getById(Long id) {
        Optional<Category> category = categoryRepo.findById(id);
        if (category.isPresent()) {
            return category.get();
        } else
            return null;
    }

    @Override

    public String DeleteById(Long id) {
        Optional<Category> category = categoryRepo.findById(id);
        if (category.isPresent()) {
            categoryRepo.deleteById(id);
        }
        return "category deleted";
    }
}
