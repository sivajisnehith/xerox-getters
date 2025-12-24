package com.xeroxgetters.portal.service;
import com.xeroxgetters.portal.model.user;
import com.xeroxgetters.portal.repository.UserRepository;

import java.util.List;


import org.springframework.stereotype.Service;
@Service
public class userservice {
    private final UserRepository UserRepository;
    //private final PasswordEncoder PasswordEncoder;
    public userservice(UserRepository UserRepository) {
        this.UserRepository = UserRepository;
        //this.PasswordEncoder = PasswordEncoder;
    }
    public user saveUser(user user) {
        System.out.println("PASSWORD RECEIVED: " + user.getPassword());
        //user.setPassword(PasswordEncoder.encode(user.getPassword()));
        return UserRepository.save(user);
    }

    public List<user> getAllUsers() {
        return UserRepository.findAll();
    }

    
}
