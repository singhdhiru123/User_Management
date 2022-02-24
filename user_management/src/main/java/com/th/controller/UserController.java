package com.th.controller;

import com.th.entity.User;
import com.th.repository.UserRepository;
import com.th.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;



    @GetMapping({"/", "/login"})
    public String index() {
        return "index";
    }
    



}
