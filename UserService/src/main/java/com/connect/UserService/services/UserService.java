package com.connect.UserService.services;


import com.connect.UserService.model.User;

import java.util.List;

public interface UserService
{

    User saveUser(User user);

    List<User> getAllUsers();

    User getUser(Integer userId);

}
