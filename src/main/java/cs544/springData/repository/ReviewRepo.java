package cs544.springData.repository;

import cs544.springData.entity.Review;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  ReviewRepo extends ListCrudRepository<Review,Long> {
//    @Query("select r from Review r join r.product p where p.id=?1")
//    public List<Review> getReviewByProductId(Long productId);
public List<Review> findByProductId(Long productId);
}
