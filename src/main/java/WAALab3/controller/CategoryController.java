package WAALab3.controller;

import WAALab3.entity.Category;
import WAALab3.repository.CategoryRepo;
import WAALab3.service.CategoryService;
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
        return categoryService.get();
    }

    @GetMapping("{id}")
    public Category findById(@PathVariable Long id){
        return categoryService.get(id);
    }

    @PostMapping
    public void create(@RequestBody Category category){
        categoryService.create(category);
    }

    @PutMapping("{id}")
    public void update(@RequestBody Category category){
        categoryService.update(category);
    }

    @DeleteMapping("{id}")
    private void delete(@PathVariable Long id){
        categoryService.delete(id);
    }
}

