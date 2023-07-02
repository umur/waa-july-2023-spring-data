package com.example.lab3.controller;

import com.example.lab3.entity.User;
import com.example.lab3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
     public  UserService userService;

     @Autowired
    public UserController(UserService userService){
         this.userService=userService;
     }

     @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
     }

     @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
         return userService.getUserById(id);
     }
     @PostMapping
    public User createUser(@RequestBody User user){
         return userService.createUser(user);
     }
     @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id,@RequestBody User updatedUser){
         return userService.updateUser(id,updatedUser);
     }





}
