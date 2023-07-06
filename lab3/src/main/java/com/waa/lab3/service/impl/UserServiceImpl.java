package com.waa.lab3.service.impl;

import com.waa.lab3.model.User;
import com.waa.lab3.repository.UserRepo;
import com.waa.lab3.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    @Override
    public List<User> findAll() {
        return (List<User>) userRepo.findAll();
    }

    @Override
    public Optional<User> findByID(int id) {
        return userRepo.findById(id);
    }

    @Override
    public void save(User user) {
        userRepo.save(user);
    }


    @Override
    public void delete(int id) {
        userRepo.deleteById(id);
    }
}
