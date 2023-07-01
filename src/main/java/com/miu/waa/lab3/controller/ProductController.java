package com.miu.waa.lab3.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miu.waa.lab3.entity.Product;
import com.miu.waa.lab3.entity.Review;
import com.miu.waa.lab3.service.ProductService;
import com.miu.waa.lab3.service.ReviewService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    private final ReviewService reviewService;

    @GetMapping("/price")
    List<Product> getByPrice(Double price) {
        return productService.findByPrice(price);
    }

    @GetMapping("/price-category")
    List<Product> getByPriceAndCategory(Double price, String categoryName) {
        return productService.findByPriceAndCategory(price, categoryName);
    }

    @GetMapping("/name")
    List<Product> getByName(String name) {
        return productService.findByName(name);
    }

    @GetMapping("/{id}/reviews")
    List<Review> getReviewsByProductId(@PathVariable int id) {
        return reviewService.findByProductId(id);
    }
}
