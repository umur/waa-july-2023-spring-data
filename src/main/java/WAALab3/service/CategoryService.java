package WAALab3.service;

import WAALab3.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {
    List<Category> get();

    Category get(Long id);

    void create(Category category);

    void update(Category category);

    void delete(Long id);
}
