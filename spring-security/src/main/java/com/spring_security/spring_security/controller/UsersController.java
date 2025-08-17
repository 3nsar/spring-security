package com.spring_security.spring_security.controller;

import com.spring_security.spring_security.model.Users;
import com.spring_security.spring_security.repo.UserRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {


    UserRepo userRepo;

    public UsersController(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    @PostMapping("/register")
    public Users register(@RequestBody Users user){

    }






}
