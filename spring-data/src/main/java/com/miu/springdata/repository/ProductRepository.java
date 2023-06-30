package com.miu.springdata.repository;

import com.miu.springdata.model.Category;
import com.miu.springdata.model.Product;
import com.miu.springdata.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findAllByPriceGreaterThan(double minPrice);

    List<Product> findAllByCategoryNameAndPriceLessThan(String category, double maxPrice);

    List<Product> findAllByNameContains(String keyword);



}
