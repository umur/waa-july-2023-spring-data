package online.moumini.spring.data.one.repository;

import online.moumini.spring.data.one.model.Category;
import online.moumini.spring.data.one.model.Product;

import org.springframework.data.repository.ListCrudRepository;

public interface ProductRepository extends ListCrudRepository<Product, Long> {

    Iterable<Product> findAllByPriceGreaterThan(double minPrice);

    Iterable<Product> findAllByPriceLessThanAndCategory(double maxPrice, Category cat);

    Iterable<Product> findAllByNameContains(String keyword);

}
