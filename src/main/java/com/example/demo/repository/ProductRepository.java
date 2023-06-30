package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query(nativeQuery = true,value = "select * from `product` where (:minPrice=-1 or price>=:minPrice) and (:maxPrice=-1 or price<=:maxPrice) and name like :keyword and (:categoryId=-1 or category_id=:categoryId);")
    List<Product> findProducts(@Param("minPrice") Double minPrice,@Param("maxPrice") Double maxPrice,@Param("categoryId") Long categoryId,@Param("keyword") String keyword);

}
