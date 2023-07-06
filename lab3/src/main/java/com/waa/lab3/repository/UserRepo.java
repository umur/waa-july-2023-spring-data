package com.waa.lab3.repository;

import com.waa.lab3.model.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends ListCrudRepository<User,Integer> {

}
