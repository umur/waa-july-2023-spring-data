package Lab3.Product_Review_Application.service.impl;

import Lab3.Product_Review_Application.entity.Product;
import Lab3.Product_Review_Application.entity.Review;
import Lab3.Product_Review_Application.entity.User;
import Lab3.Product_Review_Application.repository.UserRepo;
import Lab3.Product_Review_Application.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final ProductServiceImpl productServiceImpl;

    @Override
    public void addUser(User user) {
        userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public void updateUser(int id, User user) {
        User userToUpdate = getUser(id);
        userToUpdate.setFirstname(user.getFirstname());
        userToUpdate.setLastname(user.getLastname());
        userToUpdate.setEmail(user.getEmail());
        userToUpdate.setPassword(user.getPassword());
        userToUpdate.setReviews(user.getReviews());
        userToUpdate.setAddress(user.getAddress());
        userRepo.save(userToUpdate);
    }

    @Override
    public void deleteUser(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public User getUser(int id) {
        Optional<User> userOptional = userRepo.findById(id);
        return userOptional.orElseThrow();
    }

    @Override
    public void addUserReview(int userId, int productId, String comment) {
        User user = getUser(userId);
        Review review = new Review();
        review.setUser(user);
        review.setComment(comment);
        Product product = productServiceImpl.getProduct(productId);
        review.setProduct(product);
        user.getReviews().add(review);
    }


}
