package w1d4.springdata.service;

import w1d4.springdata.entity.User;

import java.util.List;

public interface UserService {
    User create(User user);

    List<User> findAll();

    User findById(Long id);

    User update(Long id, User user);

    void delete(Long id);
}
