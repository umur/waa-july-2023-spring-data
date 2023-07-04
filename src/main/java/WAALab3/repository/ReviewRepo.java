package WAALab3.repository;

import WAALab3.entity.Review;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepo extends ListCrudRepository<Review, Long> {

    List<Review> findAllByProduct_Id(Long productId);
}
