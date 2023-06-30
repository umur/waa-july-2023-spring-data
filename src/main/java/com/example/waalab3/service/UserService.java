package com.example.waalab3.service;

import com.example.waalab3.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();
    User create(User user);
    User update(User user);
    void delete(Long id);
}
