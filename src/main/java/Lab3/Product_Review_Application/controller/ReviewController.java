package Lab3.Product_Review_Application.controller;

import Lab3.Product_Review_Application.entity.Review;
import Lab3.Product_Review_Application.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private ReviewService reviewService;

    @PostMapping
    public void addReview(Review review){
        reviewService.addReview(review);
    }

    @GetMapping
    public List<Review> getAllReviews(){
        return reviewService.getAllReviews();
    }

    @PutMapping
    public void updateReview(int id){
        reviewService.updateReview(id);
    }

    @DeleteMapping
    public void deleteReview(int id){
        reviewService.deleteReview(id);
    }
}
