package com.project.poll.service;

import com.project.poll.model.User;

import java.util.List;

public interface UserService {
    User create (User user);

    void remove(User user);

    List<User> getAllUsers();
}
