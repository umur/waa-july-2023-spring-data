package Lab3.Product_Review_Application.controller;

import Lab3.Product_Review_Application.entity.Category;
import Lab3.Product_Review_Application.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public void addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
    }

    @GetMapping
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @PutMapping("/{id}")
    public void updateCategory(@PathVariable int id, @RequestBody Category category){
        categoryService.updateCategory(id,category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable int id){
        categoryService.deleteCategory(id);
    }

    @GetMapping("/{id}")
    public Category getCategory(@PathVariable int id){
        return categoryService.getCategory(id);
    }
}
