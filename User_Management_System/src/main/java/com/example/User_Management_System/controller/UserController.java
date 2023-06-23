package com.example.User_Management_System.controller;

import com.example.User_Management_System.model.User;
import com.example.User_Management_System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    //get all users
    @GetMapping("users")
    public Map<Integer, User> getUsers(){
        return userService.getUsers();
    }
    @PostMapping("users")
    public String addUsers(@RequestBody List<User> users)
    {

        return userService.addUsers(users);
    }
    @DeleteMapping("users/{uId}")
    public String removeUser(@PathVariable Integer uId)
    {
        return userService.removeUser(uId);
    }
    @GetMapping("users/{uId}")
    public User getUsersbyId(@PathVariable Integer uId){
        return userService.getUsersbyId(uId);
    }
    @PutMapping("users/{uId}")
    public String updateUser(@PathVariable Integer uId,@RequestBody User users){
        return userService.updateUser(uId,users);
    }



}
