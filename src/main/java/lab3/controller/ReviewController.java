package lab3.controller;

import lab3.entity.Review;
import lab3.service.ReviewService;
import lab3.utils.CustomError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/products")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping
    public ResponseEntity<?> getall(@RequestParam Map<String, String> allParams) {
        return ResponseEntity.ok(reviewService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        Optional<Review> product = reviewService.findById(id);
        if (product.isEmpty()) {
            return new ResponseEntity<>(new CustomError("Review " + id + " not found"), HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(product.get());
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Review review) {
        return ResponseEntity.ok(reviewService.create(review));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateById(@PathVariable Long id, @RequestBody Review review) {
        Optional<Review> updatedReview = reviewService.update(id, review);
        if (updatedReview.isEmpty()) {
            return new ResponseEntity<>(new CustomError("Review " + id + " not found"), HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(updatedReview.get());
    }

    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable Long id) {
        reviewService.deleteById(id);
    }


    @GetMapping("/byProductId")
    public ResponseEntity<?> getReviewsByProductId(@RequestParam Long productId) {
        return ResponseEntity.ok(reviewService.getReviewsByProductId(productId));
    }

}
