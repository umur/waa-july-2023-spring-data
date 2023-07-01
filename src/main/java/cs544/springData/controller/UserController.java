package cs544.springData.controller;

import cs544.springData.entity.Review;
import cs544.springData.entity.User;
import cs544.springData.service.ReviewService;
import cs544.springData.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getuser(){
        return userService.getUser();
    }
    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        userService.addUser(user);
        return user;
    }
    @GetMapping("/users/{id}")
    public User getUserBiId(@PathVariable Long id){
        return userService.getById(id);
    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable Long id,@RequestBody User user){
        return userService.updateUser(id,user);

    }
    @DeleteMapping("/Users/{id}")
    public String deleteById(@PathVariable Long id){
        return userService.DeleteById(id);
    }
}
