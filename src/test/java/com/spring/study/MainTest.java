package com.spring.study;

import com.spring.study.dto.UserRoleDto;
import com.spring.study.entity.Role;
import com.spring.study.entity.User;
import com.spring.study.mapper.AbstractUserRoleMapper;
import com.spring.study.mapper.MultiValueUserRoleMapper;
import com.spring.study.mapper.ParamUserRoleMapper;
import com.spring.study.mapper.UserRoleMapper;
import org.junit.Before;
import org.junit.Test;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-05-08 15:34
 */
public class MainTest {
    Role role = null;
    User user = null;

    /**
     * 模拟从数据库中查出user对象
     */
    @Before
    public void before() {
        role = new Role(2L, "administrator", "超级管理员");
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

    @Test
    public void test2() {
        UserRoleMapper instances = UserRoleMapper.INSTANCES;
        UserRoleDto userRoleDto = instances.toUserRoleDto(user);
        System.out.println(userRoleDto);
    }

    @Test
    public void test3() {
        AbstractUserRoleMapper userRoleMapperInstances = AbstractUserRoleMapper.INSTANCES;
        UserRoleDto userRoleDto = userRoleMapperInstances.defaultConvert();
        System.out.println(userRoleDto);
    }

    @Test
    public void test4() {
        MultiValueUserRoleMapper userRoleMapperInstances = MultiValueUserRoleMapper.INSTANCES;
        UserRoleDto userRoleDto = userRoleMapperInstances.toUserRoleDto(user, role);
        System.out.println(userRoleDto);
    }

    @Test
    public void test5() {
        ParamUserRoleMapper userRoleMapperInstances = ParamUserRoleMapper.INSTANCES;
        UserRoleDto userRoleDto = userRoleMapperInstances.useParameter(user, "manager");
        System.out.println(userRoleDto);
    }
}
