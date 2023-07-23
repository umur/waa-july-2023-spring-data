package Lab3.Product_Review_Application.service;

import Lab3.Product_Review_Application.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getAllUsers();

    void updateUser(int id, User user);

    void deleteUser(int id);

    User getUser(int id);

    void addUserReview(int userId, int productId, String comment);
}
