package com.miu.waa.lab3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.miu.waa.lab3.entity.Product;
import com.miu.waa.lab3.repo.ProductRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;

    public List<Product> findByPrice(Double price) {
        return productRepo.findByPriceGreaterThan(price);
    }

    public List<Product> findByPriceAndCategory(Double price, String categoryName) {
        return productRepo.findByPriceLessThanAndCategoryNameEquals(price, categoryName);
    }

    public List<Product> findByName(String name) {
        return productRepo.findByNameContains(name);
    }
}
