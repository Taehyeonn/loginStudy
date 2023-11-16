package com.loginStudy.mapper;

import com.loginStudy.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();
}
