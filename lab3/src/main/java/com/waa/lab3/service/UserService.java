package com.waa.lab3.service;

import com.waa.lab3.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    List<User> findAll();

    Optional<User> findByID(int id);

    void save(User user);

//    void update(int id);

    void delete(int id);
}
