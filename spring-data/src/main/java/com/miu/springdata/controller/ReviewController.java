package com.miu.springdata.controller;

import com.miu.springdata.model.Review;
import com.miu.springdata.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewService service;

    @GetMapping("/product/{id}")
    public List<Review> reviewsByProductId(@PathVariable Long id){

        return service.reviewsByProductId(id);
    }
}
