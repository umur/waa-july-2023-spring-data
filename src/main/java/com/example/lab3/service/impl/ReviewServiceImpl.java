package com.example.lab3.service.impl;

import com.example.lab3.entity.Product;
import com.example.lab3.entity.Review;
import com.example.lab3.repository.ProductRepository;
import com.example.lab3.repository.ReviewRepository;
import com.example.lab3.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository repository;
    private final ProductRepository productRepository;

    @Override
    public List<Review> getAllReviews() {
        return repository.findAll();
    }

    @Override
    public Optional<Review> getReviewById(long reviewId) {
        return repository.findById(reviewId);
    }

    @Override
    public void create(Review review) {
        repository.save(review);
    }

    @Override
    public Review update(Review review) {
        return repository.save(review);
    }

    @Override
    public void delete(long reviewId) {
        repository.deleteById(reviewId);
    }

    @Override
    public List<Review> getReviewsByProductId(Long productId) {
        Optional<Product> product = productRepository.findById(productId);
        if (!product.isPresent())
            return Collections.emptyList();
        return repository.findAllByProduct(product.get());
    }
}
