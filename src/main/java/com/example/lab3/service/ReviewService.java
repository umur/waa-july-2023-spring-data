package com.example.lab3.service;

import com.example.lab3.entity.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewService {
    List<Review> getAllReviews();

    Optional<Review> getReviewById(long reviewId);

    void create(Review review);

    Review update(Review review);

    void delete(long reviewId);

    List<Review> getReviewsByProductId(Long productId);
}
