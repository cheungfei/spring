package com.cnos.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-12 19:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {
    private String name;
    private Integer age;
}
