package com.hasity.mybatis.mapper;

import com.hasity.mybatis.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> findAll();
    List<User> findAllLazy();
}