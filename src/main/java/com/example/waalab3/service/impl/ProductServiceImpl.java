package com.example.waalab3.service.impl;

import com.example.waalab3.entity.Category;
import com.example.waalab3.entity.Product;
import com.example.waalab3.repository.ProductRepository;
import com.example.waalab3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.getReferenceById(id);
    }

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        Product product1 = productRepository.getReferenceById(product.getId());
        product1.setId(product.getId());
        product1.setName(product.getName());
        product1.setCategory(product.getCategory());
        product1.setPrice(product.getPrice());
        product1.setReviews(product.getReviews());
        return productRepository.save(product1);
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
    @Override
    public List<Product> findAllByPriceGreaterThanEqual(Double minPrice){
        return productRepository.findAllByPriceGreaterThanEqual(minPrice);
    }
    @Override
    public List<Product> findAllByCategoryAndPriceLessThan(Category cat, Double maxPrice){
        return productRepository.findAllByCategoryAndPriceLessThan(cat,maxPrice);
    }
    @Override
   public  List<Product> findAllByNameContaining(String keyword){
        return productRepository.findAllByNameContaining(keyword);
    }
    @Override
   public List<Product> findAllByReviewsId(Long id){
        return productRepository.findAllByReviewsId(id);
    }
}
