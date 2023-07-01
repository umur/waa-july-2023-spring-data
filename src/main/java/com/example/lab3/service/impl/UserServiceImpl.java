package com.example.lab3.service.impl;

import com.example.lab3.entity.User;
import com.example.lab3.repository.UserRepository;
import com.example.lab3.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public Optional<User> getUserById(long userId) {
        return repository.findById(userId);
    }

    @Override
    public void create(User user) {
        repository.save(user);
    }

    @Override
    public User update(User user) {
        return repository.save(user);
    }

    @Override
    public void delete(long userId) {
        repository.deleteById(userId);
    }
}
