package Lab3.Product_Review_Application.service;

import Lab3.Product_Review_Application.entity.Review;

import java.util.List;

public interface ReviewService {
    void addReview(Review review);
    List<Review> getAllReviews();
    void updateReview(int id);
    void deleteReview(int id);
}
