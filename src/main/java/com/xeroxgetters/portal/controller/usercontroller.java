package com.xeroxgetters.portal.controller;

import com.xeroxgetters.portal.model.user;
import com.xeroxgetters.portal.service.userservice;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class usercontroller {

    private final userservice userservice;

    public usercontroller(userservice userservice) {
        this.userservice = userservice;
    }

    @PostMapping("/create")
    public user createUser(@RequestBody user user) {

        System.out.println("CONTROLLER HIT");
        System.out.println("User name: " + user.getName());
        System.out.println("User email: " + user.getEmail());

        return userservice.saveUser(user);
    }
}
