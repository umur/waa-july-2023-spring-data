package w1d4.springdata.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import w1d4.springdata.entity.Category;
import w1d4.springdata.repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;

    @Override
    public Category create(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category update(Long id, Category category) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if (optionalCategory.isPresent()){
            optionalCategory.get().setName(category.getName());
            optionalCategory.get().setProducts(category.getProducts());
        }
        return optionalCategory.orElse(null);
    }

    @Override
    public void delete(Long id) {
        categoryRepository.delete(findById(id));
    }
}
