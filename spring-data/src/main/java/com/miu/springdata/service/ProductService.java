package com.miu.springdata.service;

import com.miu.springdata.model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAllProductCostMoreThanGivenPrice(double minPrice);

    public List<Product> findAllProductInCategoryWhichCostLessThanMaxPrice(String cat, double maxPrice);

    public List<Product> findAllProductContainsKeywordInName(String name);

    public Product save(Product product);

}
