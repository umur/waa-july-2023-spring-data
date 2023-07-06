package com.waa.lab3.service.impl;

import com.waa.lab3.model.Category;
import com.waa.lab3.model.Product;
import com.waa.lab3.repository.ProductRepo;
import com.waa.lab3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;
    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepo. findAll();
    }

    @Override
    public Optional<Product> findByID(int id) {
        return productRepo.findById(id);
    }

    @Override
    public void save(Product product) {
        productRepo.save(product);
    }


    @Override
    public void delete(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public List<Product> findByPriceGreaterThan(double minPrice) {
        return productRepo.findByPriceGreaterThan(minPrice);
    }

    @Override
    public List<Product> findByCategoryAndAndPriceLessThan(Category category, double maxPrice) {
        return productRepo.findByCategoryAndAndPriceLessThan(category,maxPrice);
    }

    @Override
    public List<Product> findByNameContaining(String keyword) {
        return productRepo.findByNameContaining(keyword);
    }
}
