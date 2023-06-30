package w1d4.springdata.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import w1d4.springdata.entity.User;
import w1d4.springdata.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User update(Long id, User user) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()){
            optionalUser.get().setEmail(user.getEmail());
            optionalUser.get().setPassword(user.getPassword());
            optionalUser.get().setFirstName(user.getFirstName());
            optionalUser.get().setLastname(user.getLastname());
            optionalUser.get().setAddress(user.getAddress());
            optionalUser.get().setReviews(user.getReviews());
        }
        return optionalUser.orElse(null);
    }

    @Override
    public void delete(Long id) {
        userRepository.delete(findById(id));
    }
}
