package com.spring.study.service;

import com.spring.study.entity.User;

import java.util.List;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-04-18 17:48
 */
public interface UserService {
    public User findById(Integer id);
    public List<User> getAll();
}
