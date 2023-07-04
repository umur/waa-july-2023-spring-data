package WAALab3.service;

import WAALab3.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(Long id);

    void create(User user);

    void update(User user);

    void delete(Long id);
}
