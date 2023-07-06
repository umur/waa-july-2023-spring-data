package com.waa.lab3.repository;

import com.waa.lab3.model.Category;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepo extends ListCrudRepository<Category,Integer> {

}
