package com.example.waalab3.service;

import com.example.waalab3.entity.Review;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ReviewService {
    List<Review> getAllReviews();
    Review getReviewById(Long id);
    Review saveReview(Review review);
    Review updateReview(Review review);
    void deleteReviewById(Long id);

}
