package com.spring.study.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-05-08 15:32
 */
@AllArgsConstructor
@Data
public class Role {
    private Long id;
    private String roleName;
    private String description;
}
