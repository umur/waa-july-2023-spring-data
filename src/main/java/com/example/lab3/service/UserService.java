package com.example.lab3.service;

import com.example.lab3.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAllUsers();

    Optional<User> getUserById(long userId);

    void create(User user);

    User update(User user);

    void delete(long userId);
}
