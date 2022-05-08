package com.spring.study;

import com.spring.study.dto.UserRoleDto;
import com.spring.study.entity.Role;
import com.spring.study.entity.User;
import org.junit.Before;
import org.junit.Test;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-05-08 15:34
 */
public class MainTest {
    User user = null;

    /**
     * 模拟从数据库中查出user对象
     */
    @Before
    public void before() {
        Role role = new Role(2L, "administrator", "超级管理员");
        user = new User(1L, "zhangsan", "12345", "17677778888", "123@qq.com", role);
    }

    /**
     * 模拟把user对象转换成UserRoleDto对象
     */
    @Test
    public void test1() {
        UserRoleDto userRoleDto = new UserRoleDto();
        userRoleDto.setUserId(user.getId());
        userRoleDto.setName(user.getUsername());
        userRoleDto.setRoleName(user.getRole().getRoleName());
        System.out.println(userRoleDto);
    }
}
