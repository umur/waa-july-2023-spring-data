package com.example.demo.service;

import com.example.demo.entity.Review;

import java.util.List;

public interface ReviewService {
    List<Review> getReviewsByProductId(Long productId);

    Review addProductReview(Long productId, Review review);

    Review editReview(Long productId, Long reviewId, Review review);

    void deleteReview(Long productId, Long reviewId);

    Review getReviewById(Long productId, Long reviewId);


}
