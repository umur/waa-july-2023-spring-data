package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.entity.Review;
import com.example.demo.service.ProductService;
import com.example.demo.service.ReviewService;
import lombok.AllArgsConstructor;
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


    @GetMapping("/id")
    public Product getProduct(@PathVariable Long id){
        return productService.getById(id);
    }


    @PutMapping("/id")
    public Product getProduct(@PathVariable Long id,@RequestBody Product product){
        return productService.putMapping(id,product);
    }


    @DeleteMapping("/id")
    public void delete(@PathVariable Long id){
         productService.deleteProduct(id);
    }

    @GetMapping("/{id}/reviews")
    public List<Review> getProductReviews(
            @PathVariable(name = "id") Long productId
    ){
return reviewService.getReviewsByProductId(productId);
    }

    @GetMapping("/{id}/reviews/{reviewId}")
    public Review getProductReview(
            @PathVariable(name = "id") Long productId,
            @PathVariable(name = "reviewId") Long reviewId

            ){
        return reviewService.getReviewById(productId,reviewId);
    }

    @PostMapping("/{id}/reviews")
    public Review createProductReviews(
            @PathVariable(name = "id") Long productId,
            @RequestBody Review review
    ){
        return reviewService.addProductReview(productId,review);
    }



    @PutMapping("/{id}/reviews/{reviewId}")
    public Review editProductReview(
            @PathVariable(name = "id") Long productId,
            @PathVariable(name = "reviewId") Long reviewId,

            @RequestBody Review review
    ){
        return reviewService.editReview(productId,reviewId,review);
    }

    @DeleteMapping("/{id}/reviews/{reviewId}")
    public void deleteProductReview(
            @PathVariable(name = "id") Long productId,
            @PathVariable(name = "reviewId") Long reviewId

    ){
         reviewService.deleteReview(productId,reviewId);
    }


}
