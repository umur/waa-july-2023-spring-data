package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService service;


    @GetMapping
    public List<User> getList(
            ){
        return service.getAll();
    }

    @PostMapping
    public User save(@RequestBody User user){
        return service.save(user);
    }


    @GetMapping("/id")
    public User getOne(@PathVariable Long id){
        return service.getById(id);
    }


    @PutMapping("/id")
    public User update(@PathVariable Long id,@RequestBody User user){
        return service.put(id,user);
    }


    @DeleteMapping("/id")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }




}
