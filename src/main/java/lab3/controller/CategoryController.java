package lab3.controller;

import jakarta.websocket.server.PathParam;
import lab3.entity.Address;
import lab3.entity.Category;
import lab3.entity.Product;
import lab3.service.CategoryService;
import lab3.service.ProductService;
import lab3.utils.CustomError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<?> getall() {
        return ResponseEntity.ok(categoryService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(Long id) {
        Optional<Category> category = categoryService.findById(id);

        if (category.isEmpty()) {
            return new ResponseEntity<>(new CustomError("Category " + id + " not found"), HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(category.get());
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Category category) {
        return ResponseEntity.ok(categoryService.create(category));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateById(@PathVariable Long id, @RequestBody Category category) {
        Optional<Category> updatedCategory = categoryService.update(id, category);
        if (updatedCategory.isEmpty()) {
            return new ResponseEntity<>(new CustomError("Category " + id + " not found"), HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(updatedCategory.get());
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteById(id);
    }


}
