package com.miu.springdata.service;

import com.miu.springdata.model.Review;

import java.util.List;

public interface ReviewService {
    List<Review> reviewsByProductId(Long id);
}
