package lab3.repostory;

import lab3.entity.Product;
import lab3.entity.Review;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepo extends ListCrudRepository<Review, Long> {
    List<Review> findAllByProduct(Product product);
}
