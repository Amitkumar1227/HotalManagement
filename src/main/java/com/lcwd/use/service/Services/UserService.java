package com.lcwd.use.service.Services;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.lcwd.use.service.Entities.User;

@Service
public interface UserService {

    //user operations
    //create
    User saveUser(User user);

    //get all users
    List<User> getAllUsers();
    //get single user
    User getSingleUser(String userId);

    //Tod: delete and update

}
