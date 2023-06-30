package com.waa.assignment_three.repository;

import com.waa.assignment_three.entity.Category;
import com.waa.assignment_three.entity.Product;
import com.waa.assignment_three.entity.Review;
import com.waa.assignment_three.entity.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends ListCrudRepository<Product, Long> {

//    void updateById(Long id, Product product);
    List<Product> findAllByPriceGreaterThan(Double minPrice);

    List<Product> findAllByCategoryAndPriceLessThan(Category category, Double maxPrice);

    List<Product> findAllByNameContains(String keyword);

}
