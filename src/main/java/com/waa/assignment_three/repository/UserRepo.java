package com.waa.assignment_three.repository;

import com.waa.assignment_three.entity.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends ListCrudRepository<User, Long> {

//    void updateById(Long id, User user);

}
