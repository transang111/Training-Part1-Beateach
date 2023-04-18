package com.example.minishop.service;

import com.example.minishop.entity.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity getUserByUsername(String username);

    List<UserEntity> getAllListUser();
}
