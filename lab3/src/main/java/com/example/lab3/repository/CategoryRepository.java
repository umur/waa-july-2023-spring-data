package com.example.lab3.repository;

import com.example.lab3.entity.Address;
import com.example.lab3.entity.Category;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository  extends ListCrudRepository<Category,Long> {

}
