package w1d4.springdata.service;

import w1d4.springdata.entity.Product;

import java.util.List;

public interface ProductService {
    Product create(Product product);

    List<Product> findAll();

    Product findById(Long id);

    Product update(Long id, Product product);

    void delete(Long id);
}
