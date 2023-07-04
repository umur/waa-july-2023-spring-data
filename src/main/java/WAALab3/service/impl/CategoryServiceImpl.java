package WAALab3.service.impl;

import WAALab3.entity.Category;
import WAALab3.repository.CategoryRepo;
import WAALab3.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;

    @Override
    public List<Category> get(){
        return categoryRepo.findAll();
    }

    @Override
    public Category get(Long id){
         var category = categoryRepo.findById(id);
         if(category.isPresent())
             return category.get();

         throw new NoSuchElementException("Category Not Found");
    }

    @Override
    public void create(Category category){
        if(category.getName().isBlank())
            throw new IllegalArgumentException("Name Is Too Short");

        categoryRepo.save(category);
    }

    @Override
    public  void update(Category category){
        var prev = get(category.getId());
        create(category);
    }

    @Override
    public void delete(Long id){
        categoryRepo.deleteById(id);
    }
}
