package com.miu.springdata.repository;

import com.miu.springdata.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review,Long> {
    public List<Review> findAllByProductId(Long id);
}
