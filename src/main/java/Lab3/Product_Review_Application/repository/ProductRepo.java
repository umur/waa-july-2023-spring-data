package Lab3.Product_Review_Application.repository;

import Lab3.Product_Review_Application.entity.Category;
import Lab3.Product_Review_Application.entity.Product;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends ListCrudRepository<Product, Integer> {
    List<Product> findAllByPriceGreaterThan(int minPrice);
    List<Product> findAllByCategoryAndPriceIsLessThan(Category category,int maxPrice);
    List<Product> findAllByNameContains(String keyword);
}
