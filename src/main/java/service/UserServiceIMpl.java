package service;


import com.stackroute.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.List;
@Service
public class UserServiceIMpl implements UserService {
    UserRepository userRepository;
    @Autowired
    public UserServiceIMpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    @Override
    public User userSave(User user) {
        User savedUser=userRepository.save(user);
        return savedUser;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();

    }
}
