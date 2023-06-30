package com.waa.assignment_three.repository;

import com.waa.assignment_three.entity.Address;
import com.waa.assignment_three.entity.Category;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends ListCrudRepository<Category, Long> {
//    void updateById(Long id, Category category);

}
