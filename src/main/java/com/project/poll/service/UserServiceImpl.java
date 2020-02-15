package com.project.poll.service;

import com.project.poll.model.User;
import com.project.poll.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public void remove(User user) {
        userRepository.delete(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
