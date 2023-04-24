package com.sang.minishops.controller;

import com.sang.minishops.service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * The type User controller.
 */
@Controller
public class UserController {
    /**
     * The User service imp.
     */
    @Autowired
    UserServiceImp userServiceImp;

    /**
     * Home page string.
     *
     * @return the string
     */
    @GetMapping("/home")
    public String HomePage() {
        return "home";
    }

    /**
     * Login page string.
     *
     * @return the string
     */
    @GetMapping("/login")
    public String LoginPage() {
        return "login";
    }

    /**
     * Login page string.
     *
     * @param username the username
     * @return the string
     */
    @PostMapping("/login")
    public String LoginPage(String username) {
        userServiceImp.findUserByUserName(username);
        return "home";
    }

    /**
     * Admin page string.
     *
     * @return the string
     */
    @GetMapping("/admin")
    public String AdminPage() {
        return "admin";
    }


    /**
     * Add role page string.
     *
     * @return the string
     */
    @GetMapping("/addroles")
    public String AddRolePage() {
        return "addrole";
    }

//    /**
//     * Add rolepage string.
//     *
//     * @param username the username
//     * @param role     the role
//     * @param id       the id
//     * @return the string
//     */
//    @PostMapping("/addroles")
//    public String AddRolepage(@RequestParam String username, @RequestParam String role, @RequestParam int id) {
//        User user = userServiceImp.findUserByUserName(username);
//        Optional<Role> roles = roleRepository.findById(id);
//        if (roles.isPresent()) {
//            Role role1 = roles.get();
//            roleRepository.save(role1);
//            user.addRole(role1);
//            userServiceImp.saveUser(user);
//            return "home";
//        }
//        return "addroles";
//    }
}
