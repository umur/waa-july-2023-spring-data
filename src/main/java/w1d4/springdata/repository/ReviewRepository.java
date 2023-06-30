package w1d4.springdata.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import w1d4.springdata.entity.Review;

import java.util.List;

@Repository
public interface ReviewRepository extends ListCrudRepository<Review, Long> {
    List<Review> findByProductId(Long productId);
}
