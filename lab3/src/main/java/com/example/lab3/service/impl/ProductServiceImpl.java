package com.example.lab3.service.impl;

import com.example.lab3.entity.Category;
import com.example.lab3.entity.Product;
import com.example.lab3.repository.ProductRepository;
import com.example.lab3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

        private final ProductRepository productRepository;

        @Autowired
        public ProductServiceImpl(ProductRepository productRepository) {
            this.productRepository = productRepository;
        }

        public List<Product> getAllProducts() {
            return productRepository.findAll();
        }

        public Product getProductById(Long id) {
            return productRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
        }

        public Product createProduct(Product product) {
            return productRepository.save(product);
        }

        public Product updateProduct(Long id, Product updatedProduct) {
            Product existingProduct = getProductById(id);
            existingProduct.setName(updatedProduct.getName());
            existingProduct.setPrice(updatedProduct.getPrice());
            existingProduct.setRating(updatedProduct.getRating());
            existingProduct.setCategory(updatedProduct.getCategory());
            existingProduct.setReviews(updatedProduct.getReviews());
            return productRepository.save(existingProduct);
        }

        public void deleteProduct(Long id) {
            productRepository.deleteById(id);
        }

        public List<Product> getProductsByCategoryAndPriceLessThan(Category category, double maxPrice) {
            return productRepository.findByCategoryAndPriceLessThan(category, maxPrice);
        }

        public List<Product> getProductsByNameContaining(String keyword) {
            return productRepository.findByNameContaining(keyword);
        }
    }


