package com.example.lab3.service.impl;

import com.example.lab3.entity.Review;
import com.example.lab3.repository.ReviewRepository;
import com.example.lab3.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
        private final ReviewRepository reviewRepository;

        @Autowired
        public ReviewServiceImpl(ReviewRepository reviewRepository) {
            this.reviewRepository = reviewRepository;
        }

        public List<Review> getAllReviews() {
            return reviewRepository.findAll();
        }

        public Review getReviewById(Long id) {
            return reviewRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Review not found with id: " + id));
        }

        public Review createReview(Review review) {
            return reviewRepository.save(review);
        }

        public Review updateReview(Long id, Review updatedReview) {
            Review existingReview = getReviewById(id);
            existingReview.setComment(updatedReview.getComment());
            existingReview.setUser(updatedReview.getUser());
            existingReview.setProduct(updatedReview.getProduct());
            return reviewRepository.save(existingReview);
        }

        public void deleteReview(Long id) {
            reviewRepository.deleteById(id);
        }

        public List<Review> getReviewsByProductId(Long productId) {
            return reviewRepository.findByProductId(productId);
        }
    }


