package com.example.jawt_demo.controller;

import java.security.Principal;
import java.util.List;
import com.example.jawt_demo.service.UserService;
import com.example.jawt_demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public List<User> getUser() {
        System.out.print("USERS REQUESTED");
        return userService.getLIst();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal) {
        return principal.getName();
    }
}