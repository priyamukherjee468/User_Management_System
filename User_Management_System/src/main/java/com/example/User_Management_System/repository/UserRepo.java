package com.example.User_Management_System.repository;

import com.example.User_Management_System.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserRepo {
    @Autowired
    Map<Integer, User> users;

    public Map<Integer, User> getUserList() {
        return users;
    }
}
