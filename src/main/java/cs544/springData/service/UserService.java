package cs544.springData.service;

import cs544.springData.entity.Product;
import cs544.springData.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getUser();
    public String addUser(User user );
    public User updateUser(Long id,User user);
    public User  getById(Long id);
    public String DeleteById(Long id);
}
