package com.waa.lab3.controller;

import com.waa.lab3.model.Review;
import com.waa.lab3.model.User;
import com.waa.lab3.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public <Optional> java.util.Optional<User> findByID(@PathVariable int id){
        return userService.findByID(id);
    }

    @PostMapping
    public void createUser(@RequestBody User user){
        userService.save(user);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable int id, @RequestBody User user){
        user.setId(id);
        userService.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable int id){
        userService.delete(id);
    }
}
