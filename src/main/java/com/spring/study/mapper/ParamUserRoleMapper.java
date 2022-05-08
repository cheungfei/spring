package com.spring.study.mapper;

import com.spring.study.dto.UserRoleDto;
import com.spring.study.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-05-08 20:15
 */
@Mapper
public interface ParamUserRoleMapper {
    /**
     * 获取该类自动生成的实现类的实例
     * 接口中的属性都是 public static final 的 方法都是public abstract的
     */
    ParamUserRoleMapper INSTANCES = Mappers.getMapper(ParamUserRoleMapper.class);

    /**
     * 直接使用参数作为值
     * @param user
     * @param myRoleName
     * @return
     */
    @Mappings({
            @Mapping(source = "user.id", target = "userId"), // 把user中的id绑定到目标对象的userId属性中
            @Mapping(source = "user.username", target = "name"), // 把user中的username绑定到目标对象的name属性中
            @Mapping(source = "myRoleName", target = "roleName") // 把role对象的roleName属性值绑定到目标对象的roleName中
    })
    UserRoleDto useParameter(User user, String myRoleName);
}
