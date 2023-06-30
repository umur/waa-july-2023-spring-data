package com.example.demo.service;

import com.example.demo.entity.Review;

import java.util.List;

public interface ReviewService {
    List<Review> getReviewsByProductId(Long productId);
}
