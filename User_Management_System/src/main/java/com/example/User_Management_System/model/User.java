package com.example.User_Management_System.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private Integer userId;
    private String userName;
    private String userAddress;
    private String userPhoneNo;

}
