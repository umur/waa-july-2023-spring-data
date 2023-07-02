package lab3.service.impl;

import lab3.entity.Address;
import lab3.entity.Category;
import lab3.entity.Product;
import lab3.entity.Review;
import lab3.repostory.ProductRepo;
import lab3.repostory.ReviewRepo;
import lab3.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepo reviewRepo;
    @Autowired
    private ProductRepo productRepo;

    public List<Review> getAll(){
        return reviewRepo.findAll();
    }

    public Optional<Review> findById(Long id){
        return reviewRepo.findById(id);
    }

    public Review create(Review review){
        return reviewRepo.save(review);
    }
    public Optional<Review>  update(Long id, Review updatedReview){
        Optional<Review>  existingReview = findById(id);
        if(existingReview.isEmpty()){
            return existingReview;
        }
        existingReview.get().setComment(updatedReview.getComment());
        existingReview.get().setRating(updatedReview.getRating());
        return Optional.of(reviewRepo.save(existingReview.get()));
    }


    public void deleteById(Long id){
        reviewRepo.deleteById(id);
    }


    @Override
    public List<Review> getReviewsByProductId(Long productId) {
        Optional<Product> product = productRepo.findById(productId);
        if (product.isEmpty())
            return Collections.emptyList();
        return reviewRepo.findAllByProduct(product.get());
    }
}
