package com.fiora.study.bean.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class UserDTO {
    private String id;
    private String name;
}
