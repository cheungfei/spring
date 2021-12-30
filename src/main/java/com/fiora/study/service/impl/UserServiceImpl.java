package com.fiora.study.service.impl;

import com.fiora.study.entity.User;
import com.fiora.study.mapper.UserMapper;
import com.fiora.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-04-18 17:50
 */
@Service
@CacheConfig(cacheNames = "user")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @Cacheable
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    @Cacheable
    public List<User> getAll() {
        return userMapper.getAll();
    }
}
