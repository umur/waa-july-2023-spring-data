package Lab3.Product_Review_Application.service.impl;

import Lab3.Product_Review_Application.entity.Review;
import Lab3.Product_Review_Application.repository.ReviewRepo;
import Lab3.Product_Review_Application.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepo reviewRepo;

    @Override
    public void addReview(Review review) {
        reviewRepo.save(review);
    }

    @Override
    public List<Review> getAllReviews() {
        return reviewRepo.findAll();
    }

    @Override
    public void updateReview(int id) {

    }

    @Override
    public void deleteReview(int id) {
        reviewRepo.deleteById(id);
    }
}
