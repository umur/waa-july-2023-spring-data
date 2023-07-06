package com.waa.lab3.service.impl;

import com.waa.lab3.model.Review;
import com.waa.lab3.repository.ReviewRepo;
import com.waa.lab3.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepo reviewRepo;
    @Override
    public List<Review> findAll() {
        return (List<Review>) reviewRepo.findAll();
    }

    @Override
    public Optional<Review> findByID(int id) {
        return reviewRepo.findById(id);
    }

    @Override
    public Review save(Review review) {
        reviewRepo.save(review);
        return review;
    }


    @Override
    public void delete(int id) {
        reviewRepo.deleteById(id);
    }

    @Override
    public List<Review> findReviewById(int productId) {
        return reviewRepo.findReviewById(productId);
    }
}
