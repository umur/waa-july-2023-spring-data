package com.example.waalab3.controller;

import com.example.waalab3.entity.User;
import com.example.waalab3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/all")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @PostMapping("/save")
    public User create(@RequestBody User user){
        return userService.create(user);
    }
    @PutMapping("/update")
    public User update(@RequestBody User user){
        return userService.update(user);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        userService.delete(id);
    }
}
