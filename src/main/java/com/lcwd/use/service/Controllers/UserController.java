package com.lcwd.use.service.Controllers;

import com.lcwd.use.service.Entities.User;
import com.lcwd.use.service.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    //create
    @PostMapping("/save")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User savedUser = userService.saveUser(user);
        return  new ResponseEntity<>(savedUser, HttpStatus.OK);
        //return ResponseEntity<>(HttpStatus.CREATED).body(savedUser);
    }

    //single user get
    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable String userId){
        User singleUser = userService.getSingleUser(userId);
         return new ResponseEntity<>(singleUser,HttpStatus.OK);
    }

    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> getAllusers(){
        List<User> allUsers = userService.getAllUsers();
        return  new ResponseEntity<>(allUsers, HttpStatus.FOUND);
    }
    //all user get


}
