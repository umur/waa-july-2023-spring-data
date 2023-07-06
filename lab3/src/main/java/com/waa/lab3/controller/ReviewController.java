package com.waa.lab3.controller;

import com.waa.lab3.model.Review;
import com.waa.lab3.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping
    public List<Review> findAll(){
        return reviewService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Review> findByID(@PathVariable int id){
        return reviewService.findByID(id);
    }

    @GetMapping("/by-product/{productId}")
    public List<Review> getReviewsByProductId(@PathVariable int productId){
        return reviewService.findReviewById(productId);
    }

    @PostMapping
    public void createReview(@RequestBody Review review){
        reviewService.save(review);
    }

    @PutMapping("/{id}")
    public Review updateReview(@PathVariable int id, @RequestBody Review review){
        review.setId(id);
        return reviewService.save(review);
    }

    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable int id){
        reviewService.delete(id);
    }
}
