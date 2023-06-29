package com.example.springdata1.controller;

import com.example.springdata1.entity.Product;
import com.example.springdata1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Product> add(@RequestBody Product product) {

        Product createdProduct = productService.add(product);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable Long id) {
        Product product = productService.findById(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        List<Product> products = productService.findAll();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/keyword")
    public ResponseEntity<List<Product>> getAllByKeyword(@RequestParam String keyword) {
        List<Product> products = productService.findAllByKeyword(keyword);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/min-price")
    public ResponseEntity<List<Product>> getAllByMinPrice(@RequestParam Double minPrice) {
        List<Product> products = productService.findAllCostsMoreThanMinPrice(minPrice);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<Product>> getAllByCategoryAndMaxPrice(@PathVariable Long categoryId, @RequestParam Double maxPrice) {
        List<Product> products = productService.findAllInCategoryCostsLessThanMaxPrice(categoryId, maxPrice);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public void update(@PathVariable Long id, @RequestBody Product product) {
        if (id != product.getId()) {
            throw new IllegalArgumentException("Id does not match product id");
        }
        productService.update(product);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }
}
