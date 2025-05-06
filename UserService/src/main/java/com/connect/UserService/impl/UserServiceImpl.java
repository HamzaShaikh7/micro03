package com.connect.UserService.impl;

import com.connect.UserService.model.User;
import com.connect.UserService.repositories.UserRepository;
import com.connect.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;


    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(Integer userId) {
        return userRepository.findById(userId).orElseThrow(()-> new RuntimeException("Error occurred"));
    }
}
