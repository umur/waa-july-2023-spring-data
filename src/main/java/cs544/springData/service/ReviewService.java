package cs544.springData.service;

import cs544.springData.entity.Product;
import cs544.springData.entity.Review;

import java.util.List;

public interface ReviewService {
    public List<Review> getReview();
    public String addReview(Review review );
    public Review updateReview (Long id,Review  review);
    public Review getById(Long id);
    public String DeleteById(Long id);
    public List<Review> findByProductId(Long productId);

//    public List<Review> getReviewByProductId(Long productId);
}
