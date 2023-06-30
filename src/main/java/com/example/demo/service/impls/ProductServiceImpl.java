package com.example.demo.service.impls;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {


    private final ProductRepository productRepository;


    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts(Double minPrice, Double maxPrice, Long categoryId, String keyword) {
        return productRepository.findProducts(Optional.ofNullable(minPrice).orElse(-1D),Optional.ofNullable(maxPrice).orElse(-1D),Optional.ofNullable(categoryId).orElse(-1L),"%"+keyword+"%");
    }
}
