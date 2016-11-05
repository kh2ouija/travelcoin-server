package com.travelcoin.controller;

import com.travelcoin.model.User;
import com.travelcoin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, path = "/authenticate")
    public User authenticate() {
        return userService.getDefaultUser();
    }

}
