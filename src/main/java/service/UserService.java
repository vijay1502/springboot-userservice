package service;

import com.stackroute.domain.User;

import java.util.List;

public interface UserService {
    public User userSave(User user);
    public List<User> getAllUsers();
    }
