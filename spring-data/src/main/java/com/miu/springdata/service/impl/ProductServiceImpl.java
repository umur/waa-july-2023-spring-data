package com.miu.springdata.service.impl;

import com.miu.springdata.model.Category;
import com.miu.springdata.model.Product;
import com.miu.springdata.repository.ProductRepository;
import com.miu.springdata.service.ProductService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepo;

    @Override
    public List<Product> findAllProductCostMoreThanGivenPrice(double minPrice) {
        return productRepo.findAllByPriceGreaterThan(minPrice);
    }

    @Override
    public List<Product> findAllProductInCategoryWhichCostLessThanMaxPrice(String cat,double maxPrice) {
        return productRepo.findAllByCategoryNameAndPriceLessThan(cat,maxPrice);
    }

    @Override
    public List<Product> findAllProductContainsKeywordInName(String name) {
        return productRepo.findAllByNameContains(name);
    }

    @Override
    public Product save(Product product) {
        return productRepo.save(product);
    }
}
