package com.personal.vetapi.service;

import com.personal.vetapi.exception.ResourceNotFoundException;
import com.personal.vetapi.model.user.User;
import com.personal.vetapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    };

    public User createUser(User user){
        user.setCreationTimeStamp(LocalDateTime.now());
        return userRepository.save(user);
    };

    public List<User> getAllUsers() {
        return userRepository.findAll();
    };

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException());
    };

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username).orElseThrow(() -> new ResourceNotFoundException());
    };

    public User updateUserById(User user, Long id) {
//        if(!userRepository.existsById(id)) {
//            throw new ResourceNotFoundException();
//        }

        User dbUser = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException());
        user.setCreationTimeStamp(dbUser.getCreationTimeStamp());

        user.setUserId(id);
        user.setUpdateTimeStamp(LocalDateTime.now());

        return userRepository.save(user);
    };

    public void deleteUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException());
        userRepository.delete(user);
    };
};
