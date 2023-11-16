package com.loginStudy.service;

import com.loginStudy.domain.User;
import com.loginStudy.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> getUsers() {
        return userMapper.findAll();
    }
}
