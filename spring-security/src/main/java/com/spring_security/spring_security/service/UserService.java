package com.spring_security.spring_security.service;

import com.spring_security.spring_security.model.Users;
import com.spring_security.spring_security.repo.UserRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    private UserRepo userRepo;

    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public Users register(Users user){
        return userRepo.save(user);
    }

}
