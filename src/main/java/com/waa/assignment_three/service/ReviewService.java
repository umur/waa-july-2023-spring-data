package com.waa.assignment_three.service;


import com.waa.assignment_three.entity.Review;

import java.util.List;

public interface ReviewService {

    List<Review> findAll();

//    void updateById(Long id, Review review);

    void updateById(Long id, Review review);

    void save(Review review);

    void deleteById(Long id);
}
