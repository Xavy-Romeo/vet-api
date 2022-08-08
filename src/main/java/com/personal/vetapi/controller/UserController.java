package com.personal.vetapi.controller;

import com.personal.vetapi.model.user.User;
import com.personal.vetapi.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    };

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    };

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId) {
        return userService.getUserById(userId);
    };

    @GetMapping("/username/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    };

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    };

    @PutMapping("/{userId}")
    public User updateUserById(@RequestBody User user , @PathVariable Long userId) {
        return userService.updateUserById(user, userId);
    };

    @DeleteMapping("/{userId}")
    public void deleteUserById(@PathVariable Long userId) {
        userService.deleteUserById(userId);
    };
};
