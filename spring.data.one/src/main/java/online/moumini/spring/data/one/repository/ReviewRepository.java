package online.moumini.spring.data.one.repository;

import online.moumini.spring.data.one.model.Review;
import online.moumini.spring.data.one.model.ReviewId;

import org.springframework.data.repository.ListCrudRepository;


public interface ReviewRepository extends ListCrudRepository<Review, Long> {
    Iterable<Review> findByReviewId(ReviewId reviewId);
    Iterable<Review> findByReviewId_Product_Id(Long product_id);
    boolean existsByReviewId(ReviewId reviewId);

}
