package Lab3.Product_Review_Application.repository;

import Lab3.Product_Review_Application.entity.Review;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepo extends ListCrudRepository<Review,Integer> {
    List<Review> findAllByProductId(int id);
}
