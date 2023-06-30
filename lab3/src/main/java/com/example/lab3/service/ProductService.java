package com.example.lab3.service;
import com.example.lab3.entity.Product;
import com.example.lab3.entity.Category;
import java.util.List;

public interface ProductService {



        public List<Product> getAllProducts();

        public Product getProductById(Long id);

        public Product createProduct(Product product);

        public Product updateProduct(Long id, Product updatedProduct);

        public void deleteProduct(Long id);

        public List<Product> getProductsByCategoryAndPriceLessThan(Category category, double maxPrice);

        public List<Product> getProductsByNameContaining(String keyword);
    }




