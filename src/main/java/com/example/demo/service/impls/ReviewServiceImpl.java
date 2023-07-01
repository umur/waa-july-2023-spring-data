package com.example.demo.service.impls;

import com.example.demo.entity.Review;
import com.example.demo.repository.ReviewRepository;
import com.example.demo.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository reviewRepository;

    @Override
    public List<Review> getReviewsByProductId(Long productId) {
        return reviewRepository.findAllByProductId(productId);
    }

    @Override
    public Review addProductReview(Long productId, Review review) {
        if(reviewRepository.existsByProductIdAndUserId(productId,review.getUser().getId())) throw new RuntimeException("only one review per product per user");

        return null;
    }

    @Override
    public Review editReview(Long productId, Long reviewId, Review review) {
        if(productId!=review.getProduct().getId()||reviewId!=review.getId()) throw new RuntimeException("You can't edit a different review");
        review.setId(reviewId);
        return reviewRepository.save(review);
    }

    @Override
    public void  deleteReview(Long productId, Long reviewId) {
        if(!Objects.equals(productId, reviewId)) throw new RuntimeException("You can't delete a different review");

        reviewRepository.deleteById(reviewId);
    }

    @Override
    public Review getReviewById(Long productId, Long reviewId) {
        if(!Objects.equals(productId, reviewId)) throw new RuntimeException("You can't retrieve a review from a different product");

        return reviewRepository.findById(reviewId).orElseThrow(()->new RuntimeException("Review was not found"));
    }
}
