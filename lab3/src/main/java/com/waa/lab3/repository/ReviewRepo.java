package com.waa.lab3.repository;

import com.waa.lab3.model.Review;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReviewRepo extends ListCrudRepository<Review, Integer> {
    List<Review> findReviewById(int productId);

}
