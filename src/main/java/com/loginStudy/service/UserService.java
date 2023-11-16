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

    public List<User> findAll() {
        return userMapper.findAll();
    }

    public void addUser(User user) {
        userMapper.addUser(user);
    }

    public User findUserById(int num) {
        return userMapper.findUserById(num);
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    public void deleteUser(int num) {
        userMapper.deleteUser(num);
    }
}


