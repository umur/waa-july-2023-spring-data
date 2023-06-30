package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.entity.Review;
import com.example.demo.service.ProductService;
import com.example.demo.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
@AllArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    private final ReviewService reviewService;


    @GetMapping
    public List<Product> getProducts(
            @RequestParam(required = false) Double minPrice,
            @RequestParam(required = false) Double maxPrice,
            @RequestParam(required = false) Long categoryId,
            @RequestParam(name = "keyword" ,defaultValue = "",required = false) String keyword
            ){
        return productService.getAllProducts(minPrice,maxPrice,categoryId,keyword);
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }


    @GetMapping("/{id}/reviews")
    public List<Review> getProductReviews(
            @PathVariable(name = "id") Long productId
    ){
return reviewService.getReviewsByProductId(productId);
    }


}
