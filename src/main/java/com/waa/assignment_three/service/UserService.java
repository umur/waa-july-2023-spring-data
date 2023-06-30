package com.waa.assignment_three.service;

import com.waa.assignment_three.entity.User;
import com.waa.assignment_three.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void updateById(Long id, User user);

    void save(User user);

    void deleteById(Long id);

}
