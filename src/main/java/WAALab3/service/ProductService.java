package WAALab3.service;

import WAALab3.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllByPriceGreaterThan(int minPrice);

    List<Product> findAllByCategoryAndPriceLessThan(Long categoryId, int maxPrice);

    List<Product> findAllByNameContaining(String keyword);

    List<Product> findAll();

    Product findById(Long id);

    void create(Product product);

    void update(Product product);

    void delete(Long id);
}
