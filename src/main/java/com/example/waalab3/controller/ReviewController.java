package com.example.waalab3.controller;

import com.example.waalab3.entity.Review;
import com.example.waalab3.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @GetMapping(value = "/all")
    public List<Review> getAllReviews(){
        return reviewService.getAllReviews();
    }

    @GetMapping(value = "/{id}")
    public Review getReviewById(@PathVariable Long id){
        return reviewService.getReviewById(id);
    }

    @PostMapping(value = "/save")
    public Review saveReview(@RequestBody Review review){
        return reviewService.saveReview(review);
    }
    @PutMapping(value = "/update")
    public Review updateReview(@RequestBody Review review){
        return reviewService.updateReview(review);
    }
    @DeleteMapping(value = "/rating/{id}")
    public void deleteReviewById(@PathVariable Long id){
        reviewService.deleteReviewById(id);
    }
}
