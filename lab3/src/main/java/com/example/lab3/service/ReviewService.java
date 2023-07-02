package com.example.lab3.service;

import com.example.lab3.entity.Review;

import java.util.List;

public interface ReviewService {
    public List<Review> getAllReviews();
    public Review getReviewById(Long id);

    public Review createReview(Review review);

    public Review updateReview(Long id, Review updatedReview);

    public void deleteReview(Long id);

    public List<Review> getReviewsByProductId(Long productId);
}
