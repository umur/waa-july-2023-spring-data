package com.miu.waa.lab3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.miu.waa.lab3.entity.Review;
import com.miu.waa.lab3.repo.ReviewRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepo reviewRepo;

    public List<Review> findByProductId(int productId) {
        return reviewRepo.findByProductIdEquals(productId);
    }
}
