package com.miu.springdata.service.impl;

import com.miu.springdata.model.Review;
import com.miu.springdata.repository.ReviewRepository;
import com.miu.springdata.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository repository;


    @Override
    public List<Review> reviewsByProductId(Long id) {
        return repository.findAllByProductId(id);
    }
}
