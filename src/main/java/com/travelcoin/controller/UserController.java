package com.travelcoin.controller;

import com.travelcoin.model.User;
import com.travelcoin.model.UserLogin;
import com.travelcoin.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.POST, path = "/authenticate")
    public User authenticate(UserLogin userLogin) {
        return userRepository.findByEmail(userLogin.getEmail());
    }

}
