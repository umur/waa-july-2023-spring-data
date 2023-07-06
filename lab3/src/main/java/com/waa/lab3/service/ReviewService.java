package com.waa.lab3.service;

import com.waa.lab3.model.Review;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ReviewService {
    List<Review> findAll();

    Optional<Review> findByID(int id);

    Review save(Review review);

//    void update(int id);

    void delete(int id);

    List<Review> findReviewById(int productId);
}
