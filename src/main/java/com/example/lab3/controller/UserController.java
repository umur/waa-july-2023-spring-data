package com.example.lab3.controller;

import com.example.lab3.entity.User;
import com.example.lab3.service.UserService;
import com.example.lab3.utils.CustomErrorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable(name = "id") Long userId) {
        Optional<User> product = userService.getUserById(userId);
        if (product.isPresent()) {
            return ResponseEntity.ok(product.get());
        }
        return new ResponseEntity<>(new CustomErrorType("User " + userId + " not found"), HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public void create(@RequestBody User user) {
        userService.create(user);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody User user) {
        return ResponseEntity.ok(userService.update(user));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Long userId) {
        userService.delete(userId);
    }
}
