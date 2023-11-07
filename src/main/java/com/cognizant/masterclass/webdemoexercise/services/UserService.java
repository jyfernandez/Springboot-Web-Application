package com.cognizant.masterclass.webdemoexercise.services;

import com.cognizant.masterclass.webdemoexercise.dto.UserDto;
import com.cognizant.masterclass.webdemoexercise.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User CreateUser(UserDto user){
        return new User(user.first_name, user.last_name, user.email, user.address);
    }
}
