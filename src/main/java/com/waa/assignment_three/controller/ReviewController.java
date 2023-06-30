package com.waa.assignment_three.controller;

import com.waa.assignment_three.entity.Review;
import com.waa.assignment_three.entity.User;
import com.waa.assignment_three.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;

    @GetMapping
    public List<Review> findAll(){
        return reviewService.findAll();
    }

    @PostMapping
    public void save(@RequestBody Review review){
        reviewService.save(review);
    }

    @PutMapping("/{id}")
    public void updateById(@PathVariable Long id, @RequestBody Review review){
        reviewService.updateById(id, review);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        reviewService.deleteById(id);
    }

}
