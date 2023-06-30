package com.waa.assignment_three.repository;

import com.waa.assignment_three.entity.Review;
import com.waa.assignment_three.entity.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends ListCrudRepository<Review, Long> {

//    void updateById(Long id, Review review);

}
