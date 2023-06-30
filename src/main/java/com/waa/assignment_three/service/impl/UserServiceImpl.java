package com.waa.assignment_three.service.impl;

import com.waa.assignment_three.entity.User;
import com.waa.assignment_three.repository.UserRepo;
import com.waa.assignment_three.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public void updateById(Long id, User user) {
        Optional<User> existingUser = userRepo.findById(id);
        if(existingUser.isEmpty()) throw new RuntimeException("The user doesn't exist");

        existingUser.get().setAddress(user.getAddress());
        existingUser.get().setFirstName(user.getFirstName());
        existingUser.get().setLastName(user.getLastName());
        existingUser.get().setEmail(user.getEmail());
        existingUser.get().setPassword(user.getPassword());

        userRepo.save(existingUser.get());
    }

    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepo.deleteById(id);
    }
}
