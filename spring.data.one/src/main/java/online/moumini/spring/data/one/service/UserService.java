package online.moumini.spring.data.one.service;

import online.moumini.spring.data.one.model.User;
import online.moumini.spring.data.one.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User saveUser(User user) {
        
        return userRepository.save(user);
    }

    public Pair<Boolean, User> EditUser(User user) {
        boolean exists = userRepository.existsById(user.getId());
        userRepository.save(user);
        return Pair.of(exists, user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
