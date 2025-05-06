package com.connect.UserService.impl;

import com.connect.UserService.model.Rating;
import com.connect.UserService.model.User;
import com.connect.UserService.repositories.UserRepository;
import com.connect.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;


    @Autowired
    private RestTemplate restTemplate;


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
        User user =  userRepository.findById(userId).orElseThrow(()-> new RuntimeException("Error occurred"));

        String url = "http://localhost:8081/rating/userid/"+userId; // Example API
        ArrayList<Rating> ratings = restTemplate.getForObject(url, ArrayList.class);
        user.setRatingList(ratings);
        return user;


    }
}
