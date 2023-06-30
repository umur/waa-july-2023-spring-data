package com.waa.assignment_three.service.impl;

import com.waa.assignment_three.entity.Review;
import com.waa.assignment_three.repository.ReviewRepo;
import com.waa.assignment_three.service.ReviewService;
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
        return reviewRepo.findAll();
    }

    @Override
    public void updateById(Long id, Review review) {
        Optional<Review> existingReview = reviewRepo.findById(id);
        if(existingReview.isEmpty()) throw new RuntimeException("The review doesn't exist");

        existingReview.get().setComment(review.getComment());

        reviewRepo.save(existingReview.get());
    }

    @Override
    public void save(Review review) {
        reviewRepo.save(review);
    }

    @Override
    public void deleteById(Long id) {
        reviewRepo.deleteById(id);
    }
}
