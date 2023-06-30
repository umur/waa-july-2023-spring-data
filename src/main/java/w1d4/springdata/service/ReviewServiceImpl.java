package w1d4.springdata.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import w1d4.springdata.entity.Review;
import w1d4.springdata.repository.ReviewRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ReviewServiceImpl implements ReviewService{

    private final ReviewRepository reviewRepository;

    @Override
    public Review create(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public List<Review> findAll() {
        return reviewRepository.findAll();
    }

    @Override
    public Review findById(Long id) {
        return reviewRepository.findById(id).orElse(null);
    }

    @Override
    public Review update(Long id, Review review) {
        Optional<Review> optionalReview = reviewRepository.findById(id);
        if(optionalReview.isPresent()){
            optionalReview.get().setComment(review.getComment());
            optionalReview.get().setUser(review.getUser());
            optionalReview.get().setProduct(review.getProduct());
        }
        return optionalReview.orElse(null);
    }

    @Override
    public void delete(Long id) {
        reviewRepository.delete(findById(id));
    }
}
