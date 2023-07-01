package com.example.demo.service;

import com.example.demo.entity.Category;
import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User save(User user);

    User getById(Long id);

    User put(Long id, User user);

    void delete(Long id);
}
