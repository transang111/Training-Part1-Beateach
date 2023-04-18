package com.example.minishop.controller;

import com.example.minishop.service.imp.UserServiceImp;
import com.example.minishop.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserServiceImp userServiceimp;

    @GetMapping("/home")
    public String getAllUser(ModelMap modelMap) {
        List<UserEntity> list = userServiceimp.getAllListUser();
        modelMap.addAttribute("list", list);
        return "home";
    }

    @GetMapping("/login")
    public String Login() {
        return "login";
    }

}
