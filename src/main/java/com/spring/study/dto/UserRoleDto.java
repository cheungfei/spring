package com.spring.study.dto;

import lombok.Data;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-05-08 15:32
 */
@Data
public class UserRoleDto {
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 用户名
     */
    private String name;
    /**
     * 角色名
     */
    private String roleName;
}
