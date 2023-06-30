package w1d4.springdata.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import w1d4.springdata.entity.Category;
import w1d4.springdata.entity.Product;

import java.util.List;

@Repository
public interface ProductRepository extends ListCrudRepository<Product, Long> {
    List<Product> findByPriceGreaterThan(Double minPrice);

    List<Product> findByCategoryAndPriceLessThan(Category category, Double maxPrice);

    List<Product> findByNameContaining(String keyword);
}
