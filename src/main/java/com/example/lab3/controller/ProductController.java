package com.example.lab3.controller;

import com.example.lab3.entity.Product;
import com.example.lab3.service.ProductService;
import com.example.lab3.utils.CustomErrorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<?> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAddressById(@PathVariable(name = "id") Long productId) {
        Optional<Product> product = productService.getProductById(productId);
        if (product.isPresent()) {
            return ResponseEntity.ok(product.get());
        }
        return new ResponseEntity<>(new CustomErrorType("Product " + productId + " not found"), HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public void create(@RequestBody Product product) {
        productService.create(product);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Product product) {
        return ResponseEntity.ok(productService.update(product));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Long productId) {
        productService.delete(productId);
    }

    @GetMapping("/getProductsByMinPrice")
    public List<Product> getProductsByMinPrice(@RequestParam Double price) {
        return productService.getByMinPrice(price);
    }

    @GetMapping("/getProductsByCategoryAndMaxPrice")
    public List<Product> getProductsByCategoryAndMaxPrice(@RequestParam Long catId, @RequestParam Double price) {
        return productService.getByCategoryAndMaxPrice(catId, price);
    }

    @GetMapping("/getProductByKeyword")
    public List<Product> getProductByKeyword(@RequestParam String keyword) {
        return productService.getByKeyword(keyword);
    }
}
