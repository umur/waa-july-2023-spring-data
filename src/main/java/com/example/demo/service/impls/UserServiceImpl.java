package com.example.demo.service.impls;

import com.example.demo.entity.Category;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository repository;


    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public User save(User entity) {
        return repository.save(entity);
    }

    @Override
    public User getById(Long id) {
        return repository.findById(id).orElseThrow(()->new RuntimeException("user not found"));
    }

    @Override
    public User put(Long id, User entity) {
        entity.setId(id);
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
