package com.fiora.study.mapper;

import com.fiora.study.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-04-18 17:29
 */
@Mapper
public interface UserMapper {
    public User findById(Integer id);

    public List<User> getAll();
}
