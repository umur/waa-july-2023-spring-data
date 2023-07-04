package WAALab3.service.impl;

import WAALab3.entity.User;
import WAALab3.repository.UserRepo;
import WAALab3.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;

    @Override
    public List<User> findAll(){
        return userRepo.findAll();
    }

    @Override
    public User findById(Long id){
        var res = userRepo.findById(id);

        if(res.isPresent())
            return res.get();

        throw new NoSuchElementException("User Not Found");
    }

    @Override
    public void create(User user){
        if(!user.getEmail().contains("@"))
            throw new IllegalArgumentException("Email Address is Not Valid");

        if(user.getFirstName().isBlank() || user.getLastName().isBlank())
            throw new IllegalArgumentException("Name is Required");

        if(user.getPassword().length() < 8)
            throw  new IllegalArgumentException("Password is Too Short");

        userRepo.save(user);
    }

    @Override
    public void update(User user){
        var prev = findById(user.getId());
        create(user);
    }

    @Override
    public void delete(Long id){
        userRepo.deleteById(id);
    }
}
