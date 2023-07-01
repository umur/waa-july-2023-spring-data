package cs544.springData.service;

import cs544.springData.entity.Address;
import cs544.springData.entity.Category;
import cs544.springData.entity.Product;

import java.util.List;

public interface CategoryService {
    public List<Category> getCategory();
    public String addCategory(Category category );
    public Category updateCategory(Long id,Category category);
    public Category  getById(Long id);
    public String DeleteById(Long id);
//    public List<Product> findByCategoryAndPriceLessThan(Category category, Double maxPrice);

}
