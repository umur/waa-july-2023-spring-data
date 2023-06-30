package com.example.waalab3.service.impl;

import com.example.waalab3.entity.User;
import com.example.waalab3.repository.UserRepository;
import com.example.waalab3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        User user1 = userRepository.getReferenceById(user.getId());
        user1.setId(user.getId());
        user1.setFirstName(user.getFirstName());
        user1.setLastname(user.getLastname());
        user1.setEmail(user.getEmail());
        user1.setPassword(user.getPassword());
        user1.setAddress(user.getAddress());
        user1.setReviews(user.getReviews());

        return userRepository.save(user1);
    }

    @Override
    public void delete(Long id) {

        userRepository.deleteById(id);
    }
}
