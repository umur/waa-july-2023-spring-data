package com.example.springdata1.service.impl;

import com.example.springdata1.entity.User;
import com.example.springdata1.repository.UserRepository;
import com.example.springdata1.service.UserService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user id: " + id));
    }

    @Override
    public User add(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        User existingUser = userRepository.findById(user.getId())
                .orElseThrow(() -> new IllegalArgumentException("Invalid user id: " + user.getId()));
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastname(user.getLastname());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());
        existingUser.setAddress(user.getAddress());

        User updatedUser = userRepository.save(existingUser);
        return updatedUser;
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
