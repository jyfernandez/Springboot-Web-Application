package com.cognizant.masterclass.webdemoexercise.controllers;

import com.cognizant.masterclass.webdemoexercise.dto.UserDto;
import com.cognizant.masterclass.webdemoexercise.models.User;
import com.cognizant.masterclass.webdemoexercise.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<String> getUsers() {
        return new ResponseEntity<String>("get all users", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> postUser(@RequestBody UserDto user) {
        return new ResponseEntity<User>(service.CreateUser(user), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<String> putUser(@PathVariable String id) {
        return new ResponseEntity<String>(String.format("Id: %s \nMessage: This is a put mapping", id), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteUser(@RequestParam(value = "personId") String personId) {
        return new ResponseEntity<String>(String.format("personId: %s \nMessage: This is a delete mapping", personId), HttpStatus.OK);
    }
}
