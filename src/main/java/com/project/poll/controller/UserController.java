package com.project.poll.controller;

import com.project.poll.model.User;
import com.project.poll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/create")
    public void createUser(@RequestBody User user){
        userService.create(user);
    }

    @GetMapping("users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
