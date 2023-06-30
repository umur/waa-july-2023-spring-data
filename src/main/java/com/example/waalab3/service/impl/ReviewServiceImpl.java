package com.example.waalab3.service.impl;

import com.example.waalab3.entity.Review;
import com.example.waalab3.repository.ReviewRepository;
import com.example.waalab3.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;


    @Override
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public Review getReviewById(Long id) {
        return reviewRepository.getReferenceById(id);
    }

    @Override
    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public Review updateReview(Review review) {
        if (review.getId() == null) {
            throw new RuntimeException("Review id is null");
        }
        Review review1 = reviewRepository.getReferenceById(review.getId());
        review1.setId(review.getId());
        review1.setComment(review.getComment());
        review1.setProduct(review.getProduct());
        review1.setUser(review.getUser());
        return reviewRepository.save(review1);

    }

    @Override
    public void deleteReviewById(Long id) {
        reviewRepository.deleteById(id);
    }
}
