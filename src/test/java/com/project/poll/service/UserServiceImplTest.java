package com.project.poll.service;

import com.project.poll.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    UserService userService;

    @Test
    void create() {
        assertEquals(0, userService.getAllUsers().size());
        User testUser = new User();
        testUser.setEmail("testEmail");
        testUser.setUserName("testUserName");
        User result = userService.create(testUser);
        assertEquals(1, userService.getAllUsers().size());
        assertEquals(result, testUser);
    }

    @Test
    void remove() {
        assertEquals(0, userService.getAllUsers().size());
        User testUser = new User();
        testUser.setEmail("testEmail");
        testUser.setUserName("testUserName");
        userService.create(testUser);
        assertEquals(1, userService.getAllUsers().size());
        userService.remove(testUser);
        assertEquals(0, userService.getAllUsers().size());
    }

    @Test
    void getAllUsers() {
        assertEquals(0, userService.getAllUsers().size());
        User testUser = new User();
        testUser.setEmail("testEmail");
        testUser.setUserName("testUserName");
        userService.create(testUser);
        assertEquals(1, userService.getAllUsers().size());
    }
}