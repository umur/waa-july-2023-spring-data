package lab3.service;

import lab3.entity.Address;
import lab3.entity.Review;
import lab3.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    public List<User> getAll();
    public Optional<User> findById(Long id);
    public User create(User user);
    public Optional<User>  update(Long id, User user);
    public void deleteById(Long id);
}
