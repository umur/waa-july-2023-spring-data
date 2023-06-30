package com.waa.assignment_three.service.impl;

import com.waa.assignment_three.entity.Category;
import com.waa.assignment_three.entity.Product;
import com.waa.assignment_three.entity.Review;
import com.waa.assignment_three.repository.ProductRepo;
import com.waa.assignment_three.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public void updateById(Long id, Product product) {
        Optional<Product> existingProduct = productRepo.findById(id);
        if(existingProduct.isEmpty()) throw new RuntimeException("The product doesn't exist");

        existingProduct.get().setCategory(product.getCategory());
        existingProduct.get().setRating(product.getRating());
        existingProduct.get().setPrice(product.getPrice());
        existingProduct.get().setName(product.getName());

        productRepo.save(existingProduct.get());
    }

    @Override
    public void save(Product product) {
        productRepo.save(product);
    }

    @Override
    public void deleteById(Long id) {
        productRepo.deleteById(id);
    }

    @Override
    public List<Product> findAllByPriceGreaterThan(Double minPrice){
        return productRepo.findAllByPriceGreaterThan(minPrice);
    }

    @Override
    public List<Product> findAllByCategoryAndPriceLessThan(Category category, Double maxPrice){
        return productRepo.findAllByCategoryAndPriceLessThan(category, maxPrice);
    }

    @Override
    public List<Product> findAllByNameContains(String keyword){
        return productRepo.findAllByNameContains(keyword);
    }


    @Override
    public List<Review> findAllProductReviews(@PathVariable Long id){
        Optional<Product> existingProduct = productRepo.findById(id);

        if(existingProduct.isEmpty()) throw new RuntimeException("Could not find the product");

        return existingProduct.get().getReviews();
    }
}
