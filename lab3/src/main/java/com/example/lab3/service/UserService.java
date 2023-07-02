package com.example.lab3.service;

import com.example.lab3.entity.User;


import java.util.List;


public interface UserService {
    public List<User> getAllUsers();
    public User getUserById(Long id);
    public User createUser(User user);
    public User updateUser(Long id, User updatedUser);

}
