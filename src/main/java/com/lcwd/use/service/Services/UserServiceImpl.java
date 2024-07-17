package com.lcwd.use.service.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lcwd.use.service.Entities.User;
import com.lcwd.use.service.Repositories.UserRepository;
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

     @Override
    public User saveUser(User user) {

         String randomUUID = UUID.randomUUID().toString();
         user.setUserId(randomUUID);
         User saveduser = userRepository.save(user);
        return saveduser;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> allUsers = userRepository.findAll();
        return allUsers;
    }

    @Override
    public User getSingleUser(String userId) {
        User user = userRepository.findById(userId).get();
        return user;
    }
}
