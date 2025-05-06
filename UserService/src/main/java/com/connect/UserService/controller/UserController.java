package com.connect.UserService.controller;


import com.connect.UserService.impl.UserServiceImpl;
import com.connect.UserService.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController
{

    @Autowired
    private UserServiceImpl userService;


    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }


    @GetMapping("/{id}")
    public User getSingleUser(@PathVariable Integer id){
        return userService.getUser(id);
    }


    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }

}
