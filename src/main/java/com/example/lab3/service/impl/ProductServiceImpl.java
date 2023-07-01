package com.example.lab3.service.impl;

import com.example.lab3.entity.Category;
import com.example.lab3.entity.Product;
import com.example.lab3.repository.CategoryRepository;
import com.example.lab3.repository.ProductRepository;
import com.example.lab3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;
    private final CategoryRepository categoryRepository;

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public Optional<Product> getProductById(long productId) {
        return repository.findById(productId);
    }

    @Override
    public void create(Product product) {
        repository.save(product);
    }

    @Override
    public Product update(Product product) {
        return repository.save(product);
    }

    @Override
    public void delete(long productId) {
        repository.deleteById(productId);
    }

    @Override
    public List<Product> getByMinPrice(Double price) {
        return repository.findAllByPriceGreaterThan(price);
    }

    @Override
    public List<Product> getByCategoryAndMaxPrice(Long catId, Double price) {
        Optional<Category> category = categoryRepository.findById(catId);
        if (!category.isPresent())
            return Collections.emptyList();
        return repository.findAllByCategoryAndPriceLessThan(category.get(), price);
    }

    @Override
    public List<Product> getByKeyword(String keyword) {
        return repository.findAllByNameContaining(keyword);
    }
}
