package com.example.waalab3.controller;

import com.example.waalab3.entity.Category;
import com.example.waalab3.entity.Product;
import com.example.waalab3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/all")
    public List<Product> getAllProduct() {
        return productService.getAllProducts();
    }

    @GetMapping(value = "/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PostMapping(value = "/save")
    public Product saveProduct(@RequestBody Product product) {
        return productService.create(product);

    }

    @PutMapping(value = "/update")
    public Product updateProduct(@RequestBody Product product) {
        return productService.update(product);
    }

    @DeleteMapping(value = "/item/{id}")
    public void deletById(@PathVariable Long id) {
        productService.deleteProductById(id);
    }

    @GetMapping(value = "/price/{minPrice}")
    public List<Product> findAllByPriceGreaterThanEqual(@PathVariable Double minPrice) {
        return productService.findAllByPriceGreaterThanEqual(minPrice);
    }

    @GetMapping(value = "/category/{price}")
    public List<Product> findAllByCategoryAndPriceLessThan(@PathVariable Category category, @PathVariable Double price) {
        return productService.findAllByCategoryAndPriceLessThan(category, price);
    }

    @GetMapping(value = "/item/keyWord")
    public List<Product> findAllByNameContaining(@PathVariable String keyword) {
        return productService.findAllByNameContaining(keyword);
    }

    @GetMapping(value = "/review/{id}")
    public List<Product> findAllByReviewsId(@PathVariable Long id) {
        return productService.findAllByReviewsId(id);
    }
}
