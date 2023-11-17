package com.loginStudy.mapper;

import com.loginStudy.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {
    // 모든 사용자 조회
    List<User> findAll();

    // 사용자 생성
    void addUser(User user);

    // 특정 사용자 조회
    User findUserById(@Param("num") int num);

    Optional<User> findByLoginId(@Param("id") String id);

    // 사용자 정보 업데이트
    void updateUser(User user);

    // 사용자 삭제
    void deleteUser(@Param("num") int num);
}
