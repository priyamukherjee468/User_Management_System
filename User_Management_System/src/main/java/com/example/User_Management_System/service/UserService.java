package com.example.User_Management_System.service;

import com.example.User_Management_System.model.User;
import com.example.User_Management_System.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public  String addUsers(List<User> users) {

        Map<Integer, User> userList = getUsers();

        for(User user : users)
        {
            userList.put(user.getUserId(),user);
        }

        return "users are added!!!";
    }





    public Map<Integer, User> getUsers() {
        return userRepo.getUserList();
    }

    public String removeUser(Integer uId) {
        Map<Integer, User> userList = getUsers();
        User user = userList.get(uId);
        if(user!=null)
        {
            userList.remove(uId);
            return uId + " removed!!!";
        }
        else {
            return uId + " not found!!!";
        }
    }

    public User getUsersbyId(Integer uId) {


        Map<Integer, User> userList = userRepo.getUserList();
        for (Map.Entry<Integer,User> mapElement : userList.entrySet()) {
            if(mapElement.getValue().getUserId()==uId){
                return mapElement.getValue();
            }

        }
        return null;


    }


    public String updateUser(Integer uId,User users) {
        Map<Integer, User> userList = userRepo.getUserList();
        for (Map.Entry<Integer, User> mapElement : userList.entrySet()) {
            if (mapElement.getValue().getUserId() == uId) {
                mapElement.getValue().setUserName(users.getUserName());
                mapElement.getValue().setUserAddress(users.getUserAddress());
                mapElement.getValue().setUserPhoneNo(users.getUserPhoneNo());

                return "updated successfully!!";
            }

        }
        return "user with given id not found";
    }
}
