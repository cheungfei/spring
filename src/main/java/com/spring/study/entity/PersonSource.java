package com.spring.study.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-12 22:41
 */
@Data
@AllArgsConstructor
public class PersonSource {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
}
