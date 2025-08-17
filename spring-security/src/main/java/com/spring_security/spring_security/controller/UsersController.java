package com.spring_security.spring_security.controller;

import com.spring_security.spring_security.model.Users;
import com.spring_security.spring_security.repo.UserRepo;
import com.spring_security.spring_security.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {


    UserService userService;

    public UsersController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/register")
    public Users register(@RequestBody Users user){
            return userService.register(user);
    }






}
