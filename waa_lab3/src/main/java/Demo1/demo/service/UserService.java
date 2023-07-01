package Demo1.demo.service;

import Demo1.demo.entity.User;

public interface UserService {

    void addUser(User user);

    void updateUser(User user, Long Id);

    void deleteUser(Long Id);
    abstract void getAllUsers();
}
