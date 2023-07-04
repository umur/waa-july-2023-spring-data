package WAALab3.service;

import WAALab3.entity.Review;

import java.util.List;

public interface ReviewService {
    List<Review> findAllByProduct(Long productId);

    List<Review> findAll();

    Review findById(Long id);

    void create(Review review);

    void update(Review review);

    void delete(Long id);
}
