package com.example.minishop.service.imp;

import com.example.minishop.service.UserService;
import com.example.minishop.entity.UserEntity;
import com.example.minishop.reponsitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {


    @Autowired
    UserRepository userRepository;

    @Override
    public UserEntity getUserByUsername(String username) {
        return userRepository.findByUsername("username");
    }

    @Override
    public List<UserEntity> getAllListUser() {
        return userRepository.findAll();
    }
}
