package com.example.lab3.controller;

import com.example.lab3.entity.Review;
import com.example.lab3.service.ReviewService;
import com.example.lab3.utils.CustomErrorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @GetMapping
    public ResponseEntity<?> getAllReviews() {
        return ResponseEntity.ok(reviewService.getAllReviews());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getReviewById(@PathVariable(name = "id") Long reviewId) {
        Optional<Review> product = reviewService.getReviewById(reviewId);
        if (product.isPresent()) {
            return ResponseEntity.ok(product.get());
        }
        return new ResponseEntity<>(new CustomErrorType("Review " + reviewId + " not found"), HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public void create(@RequestBody Review product) {
        reviewService.create(product);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Review review) {
        return ResponseEntity.ok(reviewService.update(review));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Long reviewId) {
        reviewService.delete(reviewId);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<?> getReviewsByProductId(@PathVariable(name = "id") Long productId){
        return ResponseEntity.ok(reviewService.getReviewsByProductId(productId));
    }
}
